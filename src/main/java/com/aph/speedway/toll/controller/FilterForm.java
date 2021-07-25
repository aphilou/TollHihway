package com.aph.speedway.toll.controller;

public class FilterForm {
    
    private Integer parcours;
    private Integer peages;
    private Double prix;


    public Integer getParcours() {
        return this.parcours;
    }

    public void setParcours(Integer parcours) {
        this.parcours = parcours;
    }


    public Integer getPeages() {
        return this.peages;
    }

    public void setPeages(Integer peages) {
        this.peages = peages;
    }

    public Double getPrix() {
        return this.prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

}
