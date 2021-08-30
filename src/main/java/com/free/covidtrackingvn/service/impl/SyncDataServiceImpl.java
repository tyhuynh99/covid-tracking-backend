package com.free.covidtrackingvn.service.impl;

import com.free.covidtrackingvn.constant.Message;
import com.free.covidtrackingvn.constant.RefAPI;
import com.free.covidtrackingvn.entity.CovidData;
import com.free.covidtrackingvn.repository.CovidDataRepository;
import com.free.covidtrackingvn.service.SyncDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SyncDataServiceImpl implements SyncDataService {

    private final RestTemplate restTemplate;
    private final CovidDataRepository repository;

    @Autowired
    public SyncDataServiceImpl(RestTemplate restTemplate, CovidDataRepository repository) {
        this.restTemplate = restTemplate;
        this.repository = repository;
    }

    @Override
    public String syncCovidData() {
        try {
            CovidData data = GetDataFromAPIFY();
            if (data != null) {
                repository.save(data);
            } else {
                throw new Exception();
            }
        } catch (Exception ex){
            return Message.ERROR;
        }
        return Message.SUCCESS;
    }

    @Override
    public String crawlData() {
//        Document temp;
//        int b;
        String mess = Message.SUCCESS;
//        try {
//            Document doc = Jsoup.connect("https://ncov.moh.gov.vn").get();
//            temp = doc;
//            int a = 1;
//        } catch (Exception ex){
//            mess = ex.getMessage();
//        }
        return mess;
    }

    // Get today data from APIFY
    private CovidData GetDataFromAPIFY() {
        List<CovidData> response;
        CovidData result;
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "text/json");
        ResponseEntity responseEntity = restTemplate.exchange(
                RefAPI.url,
                HttpMethod.POST,
                new HttpEntity(headers),
                new ParameterizedTypeReference<List<CovidData>>() {
                });
        response = (List<CovidData>) responseEntity.getBody();
        result = response.stream().findFirst().get();
        return result;
    }
}
