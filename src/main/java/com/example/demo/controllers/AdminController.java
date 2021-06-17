package com.example.demo.controllers;


import com.example.demo.model.Gsm;
import com.example.demo.model.GsmInformation;
import com.example.demo.model.GsmVideo;
import com.example.demo.repositories.GaleryRepository;
import com.example.demo.repositories.GsmInformationRepository;
import com.example.demo.repositories.GsmRepository;
import com.example.demo.repositories.GsmVideoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private Logger logger = LoggerFactory.getLogger(AdminController.class);


    @Autowired
    private GsmRepository gsmRepository;

    @Autowired
    private GsmVideoRepository gsmVideoRepository;

    @Autowired
    private GsmInformationRepository gsmInformationRepository;

    @Autowired
    private GaleryRepository galeryRepository;


    @GetMapping({"/overviewVideoGsm"})
    public String overviewVideos(Model model) {
        Iterable<GsmVideo> videosFromDb = gsmVideoRepository.findAll();
        Iterable<Gsm> gsmsFromDb = gsmRepository.findAll();
        model.addAttribute("gsmVideo", videosFromDb);
        model.addAttribute("gsm", gsmsFromDb);
        return "overviewVideoGsm";
    }


    @GetMapping({"/overviewGsmModel", "/overviewGsmModel/{price}"})
    public String overviewGsmModel(@PathVariable(required = false) String price,
                                   @RequestParam(required = false) Integer minPriceGsm,
                                   @RequestParam(required = false) Integer maxPriceGsm,
                                   @RequestParam(required = false) String nameGsmSearch,
                                   Model model) {
        Iterable<GsmInformation> gsmInformationsFromDB = gsmInformationRepository.findAll();
        logger.info(String.format("params: min = %d, max=%d, nameGsm=%s", minPriceGsm, maxPriceGsm, nameGsmSearch));


        model.addAttribute("filterButtons", new String[]{"all", "S", "M", "L", "XL"});
        model.addAttribute("gsmInformation", gsmInformationsFromDB);

        if (minPriceGsm == null && maxPriceGsm == null && price != null) {
            if (price.equals("S")) {
                minPriceGsm = null;
                maxPriceGsm = 100;
            } else if (price.equals("M")) {
                minPriceGsm = 100;
                maxPriceGsm = 300;
            } else if (price.equals("L")) {
                minPriceGsm = 300;
                maxPriceGsm = 500;
            } else if (price.equals("XL")) {
                minPriceGsm = 500;
                maxPriceGsm = null;
            }
        }
        logger.info(String.format("interpreted: min = %d, max=%d, nameGsm=%s", minPriceGsm, maxPriceGsm, nameGsmSearch));
        model.addAttribute("gsmInformation", gsmInformationRepository.findGsmBySearchCriteria(minPriceGsm, maxPriceGsm, nameGsmSearch));
        model.addAttribute("minPriceGsm", minPriceGsm);
        model.addAttribute("maxPriceGsm", maxPriceGsm);
        model.addAttribute("nameGsmSearch", nameGsmSearch);
        model.addAttribute("price", price);
        return "overviewGsmModel";
    }


    @GetMapping({"/newVideo"})
    public String newVideo(Model model) {
        model.addAttribute("video", gsmVideoRepository.findAll());
        model.addAttribute("gsm", gsmRepository.findAll());
        return "newVideo";
    }

    @PostMapping({"/newVideo"})
    public String newVideoPost(
            @RequestParam String videoTitle,
            @RequestParam String videoUrl,
            @RequestParam int gsmId,
            Model model) {
        logger.info(String.format("newVideoPost PHONE_NAME_VIDEO=%s, VIDEO_FILE_NAME=%s, GSM_ID=%s\n", videoTitle, videoUrl, gsmId));
        Optional<Gsm> gsmsFromDb = gsmRepository.findById(gsmId);
        GsmVideo gsmVideo = new GsmVideo();
        gsmVideo.setGsmNameVideo(videoTitle);
        gsmVideo.setVideoFileName(videoUrl);
        gsmVideo.setGsm(gsmsFromDb.get());


        gsmVideoRepository.save(gsmVideo);
        return "redirect:/";

    }


    @GetMapping({"/editVideo", "/editVideo/{id}"})
    public String editVideo(@PathVariable(required = false) int id, Model model) {
        Optional<GsmVideo> optionalVideoFromDb = gsmVideoRepository.findById(id);
        GsmVideo gsmVideo = (optionalVideoFromDb.isPresent()) ? optionalVideoFromDb.get() : null;
        model.addAttribute("video", gsmVideo);
        model.addAttribute("video", gsmVideoRepository.findAll());

        return "editVideo";
    }

    @PostMapping({"/editVideo", "/editVideo/{videoId}"})
    public String editVideoPost(@PathVariable(required = false) int videoId,
                                @RequestParam String videoTitleEdit,
                                @RequestParam String videoUrlEdit,
                                @RequestParam int gsmIdEdit,
                                Model model) {
        logger.info(String.format("editVideoPost %d -- PHONE_NAME_VIDEO=%s, VIDEO_FILE_NAME=%s, GSM_ID=%s\n", videoId, videoTitleEdit, videoUrlEdit, gsmIdEdit));
        Optional<GsmVideo> videoFromDb = gsmVideoRepository.findById(videoId);
        Optional<Gsm> gsmsFromDb = gsmRepository.findById(gsmIdEdit);

        if (videoFromDb.isPresent()) {
            GsmVideo gsmVideo = videoFromDb.get();
            gsmVideo.setGsmNameVideo(videoTitleEdit);
            gsmVideo.setVideoFileName(videoUrlEdit);
            gsmVideo.setGsm(gsmsFromDb.get());

            gsmVideoRepository.save(gsmVideo);
        }
        return "redirect:/";
    }


}
