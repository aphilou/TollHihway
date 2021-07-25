package com.aph.speedway.toll.controller;

import java.util.Iterator;

import com.aph.speedway.toll.Parcours;
import com.aph.speedway.toll.Sortie;

public class ParcoursDisplay {

    private int nbSorties;
    private String sortieList;
    private String prix;

    public ParcoursDisplay(Parcours parcours) {
        if (parcours != null) {                
            
            this.nbSorties = parcours.getSorties().size() - 1;
            this.prix = Double.toString(Math.round(parcours.getPrixTotal()*100)/100.0);
            
            StringBuilder sortieList = new StringBuilder();
            for (Iterator<Sortie> lesSorties = parcours.getSorties().iterator(); lesSorties.hasNext();) {
                sortieList.append(lesSorties.next().getName()).append("->");
            }
            sortieList.setLength(sortieList.length() - 1);
            sortieList.append("-|");
            
            this.sortieList = sortieList.toString();
            
            //log.info("Parcours {} sortie(s) prix {} -------------------", parcours.getSorties().size() - 1, ;
        }

    }

    public int getNbSorties() {
        return this.nbSorties;
    }

    public String getSortieList() {
        return this.sortieList;
    }

    public String getPrix() {
        return this.prix;
    }
    
}
