package com.free.covidtrackingvn.repository;

import com.free.covidtrackingvn.entity.CovidData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidDataRepository extends CrudRepository<CovidData, Long> {
}
