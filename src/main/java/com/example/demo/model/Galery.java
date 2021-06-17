package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Galery {
    @Id
    private Integer id;
    private String randomPhonePictureOne;
    private String randomPhonePictureTwo;
    private String randomPhonePictureThree;
    private String randomPhonePictureFour;

    public Galery(Integer id, String randomPhonePictureOne, String randomPhonePictureTwo, String randomPhonePictureThree, String randomPhonePictureFour){
        this.id = id;
        this.randomPhonePictureOne = randomPhonePictureOne;
        this.randomPhonePictureTwo = randomPhonePictureTwo;
        this.randomPhonePictureThree = randomPhonePictureThree;
        this.randomPhonePictureFour = randomPhonePictureFour;
    }

    public Galery(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRandomPhonePictureOne() {
        return randomPhonePictureOne;
    }

    public void setRandomPhonePictureOne(String randomPhonePictureOne) {
        this.randomPhonePictureOne = randomPhonePictureOne;
    }

    public String getRandomPhonePictureTwo() {
        return randomPhonePictureTwo;
    }

    public void setRandomPhonePictureTwo(String randomPhonePictureTwo) {
        this.randomPhonePictureTwo = randomPhonePictureTwo;
    }

    public String getRandomPhonePictureThree() {
        return randomPhonePictureThree;
    }

    public void setRandomPhonePictureThree(String randomPhonePictureThree) {
        this.randomPhonePictureThree = randomPhonePictureThree;
    }

    public String getRandomPhonePictureFour() {
        return randomPhonePictureFour;
    }

    public void setRandomPhonePictureFour(String randomPhonePictureFour) {
        this.randomPhonePictureFour = randomPhonePictureFour;
    }
}
