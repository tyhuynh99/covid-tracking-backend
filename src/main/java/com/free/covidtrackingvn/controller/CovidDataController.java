package com.free.covidtrackingvn.controller;

import com.free.covidtrackingvn.entity.CovidData;
import com.free.covidtrackingvn.service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CovidDataController {

    @Autowired
    private CovidDataService service;

    @RequestMapping(value = "/summary", method = RequestMethod.GET)
    public List<CovidData> getSummaryData(){
        return service.getSummaryData();
    }
}
