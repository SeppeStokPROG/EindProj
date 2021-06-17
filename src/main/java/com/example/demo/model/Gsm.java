package com.example.demo.model;
import javax.persistence.*;
@Entity
public class Gsm {
    @Id
    private Integer id;
    private String gsmName;
    private String gsmLogo;
    private String gsmPicture;
    private String gsmInformation;

    public Gsm(Integer id, String gsmName, String gsmLogo, String gsmPicture, String gsmInformation) {
        this.id = id;
        this.gsmName = gsmName;
        this.gsmLogo = gsmLogo;
        this.gsmPicture = gsmPicture;
        this.gsmInformation = gsmInformation;
    }

    public Gsm() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGsmName() {
        return gsmName;
    }

    public void setGsmName(String gsmName) {
        this.gsmName = gsmName;
    }

    public String getGsmLogo() {
        return gsmLogo;
    }

    public void setGsmLogo(String gsmLogo) {
        this.gsmLogo = gsmLogo;
    }

    public String getGsmPicture() {
        return gsmPicture;
    }

    public void setGsmPicture(String gsmPicture) {
        this.gsmPicture = gsmPicture;
    }

    public String getGsmInformation() {
        return gsmInformation;
    }

    public void setGsmInformation(String gsmInformation) {
        this.gsmInformation = gsmInformation;
    }
}
