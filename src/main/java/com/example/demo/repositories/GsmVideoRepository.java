package com.example.demo.repositories;

import com.example.demo.model.Gsm;
import com.example.demo.model.GsmVideo;
import org.springframework.data.repository.CrudRepository;

public interface GsmVideoRepository extends CrudRepository<GsmVideo, Integer> {

    Iterable<GsmVideo> findGsmVideosByGsm(Gsm gsm);


}
