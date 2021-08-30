package com.free.covidtrackingvn.controller;

import com.free.covidtrackingvn.service.SyncDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class SyncCovidDataController {

    @Autowired
    private SyncDataService service;

    @RequestMapping(value = "/sync-data" ,method = RequestMethod.POST)
    public String SyncDataToday(){
        return service.syncCovidData();
    }
}
