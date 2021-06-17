package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class GsmInformation {
    @Id
    private Integer id;
    private String gsmModel;
    private String gsmModelPicture;
    private String gsmModelInformation;
    private Integer maxPriceGsm;
    @ManyToOne(fetch = FetchType.LAZY)
    private Gsm gsm;

    public GsmInformation(Integer id, String gsmModel, String gsmModelPicture, String gsmModelInformation, Integer maxPriceGsm, Gsm gsm) {
        this.id = id;
        this.gsmModel = gsmModel;
        this.gsmModelPicture = gsmModelPicture;
        this.gsmModelInformation = gsmModelInformation;
        this.maxPriceGsm = maxPriceGsm;
        this.gsm = gsm;
    }

    public GsmInformation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGsmModel() {
        return gsmModel;
    }

    public void setGsmModel(String gsmModel) {
        this.gsmModel = gsmModel;
    }

    public String getGsmModelPicture() {
        return gsmModelPicture;
    }

    public void setGsmModelPicture(String gsmModelPicture) {
        this.gsmModelPicture = gsmModelPicture;
    }

    public String getGsmModelInformation() {
        return gsmModelInformation;
    }

    public void setGsmModelInformation(String gsmModelInformation) {
        this.gsmModelInformation = gsmModelInformation;
    }

    public Integer getMaxPriceGsm() {
        return maxPriceGsm;
    }

    public void setMaxPriceGsm(Integer maxPriceGsm) {
        this.maxPriceGsm = maxPriceGsm;
    }

    public Gsm getGsm() {
        return gsm;
    }

    public void setGsm(Gsm gsm) {
        this.gsm = gsm;
    }
}
