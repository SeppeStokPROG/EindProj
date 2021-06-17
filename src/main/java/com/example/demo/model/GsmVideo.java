package com.example.demo.model;

import javax.persistence.*;

@Entity
public class GsmVideo {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "video_generator")
    @SequenceGenerator(name = "video_generator", sequenceName = "video_seq", initialValue = 0, allocationSize = 1)
    @Id
    private Integer id;
    private String gsmNameVideo;
    private String videoFileName;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gsm gsm;

    public GsmVideo(Integer id, String gsmNameVideo, String videoFileName, Gsm gsm) {
        this.id = id;
        this.gsmNameVideo = gsmNameVideo;
        this.videoFileName = videoFileName;
        this.gsm = gsm;
    }

    public GsmVideo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGsmNameVideo() {
        return gsmNameVideo;
    }

    public void setGsmNameVideo(String gsmNameVideo) {
        this.gsmNameVideo = gsmNameVideo;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }

    public Gsm getGsm() {
        return gsm;
    }

    public void setGsm(Gsm gsm) {
        this.gsm = gsm;
    }



}
