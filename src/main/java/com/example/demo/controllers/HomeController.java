package com.example.demo.controllers;


import com.example.demo.model.Gsm;
import com.example.demo.model.GsmInformation;
import com.example.demo.model.GsmVideo;
import com.example.demo.model.Galery;
import com.example.demo.repositories.GsmInformationRepository;
import com.example.demo.repositories.GsmRepository;
import com.example.demo.repositories.GsmVideoRepository;
import com.example.demo.repositories.GaleryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);


    @Autowired
    private GsmVideoRepository gsmVideoRepository;

    @Autowired
    private GsmInformationRepository gsmInformationRepository;

    @Autowired
    private GaleryRepository galeryRepository;

    @Autowired
    private GsmRepository gsmRepository;

    @GetMapping("/")
    public String index(Model model) {
        Iterable<Gsm> gsmsFromDb = gsmRepository.findAll();
        model.addAttribute("gsms", gsmsFromDb);
        return "index";
    }


    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }

    @GetMapping("/logIn")
    public String logIn(Model model) {
        return "logIn";
    }

    @RequestMapping("/LogOut")
    public String logout(Model model) {
        return "LogOut";
    }


    @GetMapping({"/gsmVideo/{gsmId}"})
    public String GsmVideoPagina(@PathVariable int gsmId, Model model) {
        Optional<Gsm> gsmsFromDb = gsmRepository.findById(gsmId);

        if (gsmsFromDb.isEmpty()) {
            model.addAttribute("gsmVideo", new GsmVideo[]{});
        } else {
            Gsm gsm = gsmsFromDb.get();
            model.addAttribute("gsm", gsm);
            model.addAttribute("gsmVideo", gsmVideoRepository.findGsmVideosByGsm(gsm));

        }
        return "gsmVideoPage";
    }


    @GetMapping("/meerInfo/{gsmId}")
    public String GsmInfoPagina(@PathVariable int gsmId, Model model) {
        Optional<Gsm> gsmsFromDb = gsmRepository.findById(gsmId);

        if (gsmsFromDb.isEmpty()) {
            model.addAttribute("gsmInfo", new GsmInformation[]{});
        } else {
            Gsm gsm = gsmsFromDb.get();
            model.addAttribute("gsm", gsm);
            model.addAttribute("gsmInfo", gsmInformationRepository.findGsmInformationByGsm(gsm));

        }
        return "gsmInformation";
    }


    @GetMapping("/galerij")
    public String galery(Model model) {
        Iterable<Galery> galeryFromDb = galeryRepository.findAll();
        model.addAttribute("galery", galeryFromDb);
        return "galery";
    }


}
