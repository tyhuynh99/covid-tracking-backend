package com.free.covidtrackingvn.service.impl;

import com.free.covidtrackingvn.entity.CovidData;
import com.free.covidtrackingvn.repository.CovidDataRepository;
import com.free.covidtrackingvn.service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CovidDataServiceImpl implements CovidDataService {

    @Autowired
    private CovidDataRepository repository;

    @Override
    public List<CovidData> getSummaryData() {
        List<CovidData> result = new ArrayList<>();
        repository.findAll().forEach(covidData -> {
            result.add(covidData);
        });
        return result;
    }
}
