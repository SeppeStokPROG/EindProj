package com.example.demo.repositories;

import com.example.demo.model.Gsm;
import com.example.demo.model.GsmInformation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface GsmInformationRepository extends CrudRepository<GsmInformation, Integer> {

    Iterable<GsmInformation> findGsmInformationByGsm(Gsm gsm);


    @Query("SELECT v FROM GsmInformation v WHERE " +
            " (:min is null or v.maxPriceGsm >= :min) and " +
            " (:max is null or v.maxPriceGsm <= :max) and " +
            " (:nameGsmSearch is null or v.gsmModel like %:nameGsmSearch%) ")
    public Iterable<GsmInformation> findGsmBySearchCriteria(@Param("min") Integer min,
                                                            @Param("max") Integer max,
                                                            @Param("nameGsmSearch") String nameGsmSearch);

}


