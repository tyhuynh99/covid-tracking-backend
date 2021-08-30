package com.free.covidtrackingvn.service;

import com.free.covidtrackingvn.entity.CovidData;

import java.util.List;

public interface CovidDataService {
    List<CovidData> getSummaryData();
}
