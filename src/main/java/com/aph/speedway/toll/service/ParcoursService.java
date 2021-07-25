package com.aph.speedway.toll.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;

import com.aph.speedway.toll.Parcours;
import com.aph.speedway.toll.Peage;
import com.aph.speedway.toll.Sortie;
import com.aph.speedway.toll.controller.ParcoursDisplay;

import org.springframework.stereotype.Service;

@Service
public class ParcoursService {
    
    Sortie depart = new Sortie("St Arnoux", 1, true);
    Sortie sortie1 = new Sortie("Ablis", 2);
    Sortie sortie2 = new Sortie("Chartres Est", 3);
    Sortie sortie3 = new Sortie("Thivars", 4);
    Sortie sortie4 = new Sortie("Illier", 5);
    Sortie sortie5 = new Sortie("Luigny", 6);
    Sortie sortie6 = new Sortie("La Ferté Bernard", 7);
    Sortie sortie7 = new Sortie("Connerré", 8);
    Sortie sortie8 = new Sortie("Le Man Nord", 9);
    Sortie sortie9 = new Sortie("Joué en Charnie", 10);
    Sortie sortie10 = new Sortie("Vaiges", 11);
    Sortie sortie11 = new Sortie("Laval Est", 12);
    Sortie sortie12 = new Sortie("Laval Ouest", 13);
    Sortie arrivee = new Sortie("Péage Gravelle", 14, false, true);

    @PostConstruct
    public void init() {

        Set<Peage> peages = new TreeSet<>();
        peages.add(new Peage(sortie1,  3.4 ));
        peages.add(new Peage(sortie2,  6.7));
        peages.add(new Peage(sortie3,  7.8));
        peages.add(new Peage(sortie4,  9.5));
        peages.add(new Peage(sortie5,  11.7));
        peages.add(new Peage(sortie6,  15.1));
        peages.add(new Peage(sortie7,  17.5));
        peages.add(new Peage(sortie8,  18.9));
        peages.add(new Peage(sortie9,  23.3));
        peages.add(new Peage(sortie10, 26.4));
        peages.add(new Peage(sortie11, 27.9));
        peages.add(new Peage(sortie12, 28.8));
        peages.add(new Peage(arrivee,  29.5));
        depart.setPrix(peages);
                
        peages = new TreeSet<>();
        peages.add(new Peage(sortie2,  2.6 ));
        peages.add(new Peage(sortie3,  4.1));
        peages.add(new Peage(sortie4,  5.5));
        peages.add(new Peage(sortie5,  6.9));
        peages.add(new Peage(sortie6,  10.7));
        peages.add(new Peage(sortie7,  13.1));
        peages.add(new Peage(sortie8,  14.7));
        peages.add(new Peage(sortie9,  19.3));
        peages.add(new Peage(sortie10, 22.1));
        peages.add(new Peage(sortie11, 23.9));
        peages.add(new Peage(sortie12, 25));
        peages.add(new Peage(arrivee,  26.3));
        sortie1.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(sortie3,  1.6 ));
        peages.add(new Peage(sortie4,  3.2));
        peages.add(new Peage(sortie5,  4.4));
        peages.add(new Peage(sortie6,  7.3));
        peages.add(new Peage(sortie7,  9.7));
        peages.add(new Peage(sortie8,  11.4));
        peages.add(new Peage(sortie9,  15.9));
        peages.add(new Peage(sortie10, 19.1));
        peages.add(new Peage(sortie11, 20.6));
        peages.add(new Peage(sortie12, 21.4));
        peages.add(new Peage(arrivee,  23.8));
        sortie2.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(sortie4,  1.6 ));
        peages.add(new Peage(sortie5,  3.4));
        peages.add(new Peage(sortie6,  5.7));
        peages.add(new Peage(sortie7,  8.1));
        peages.add(new Peage(sortie8,  10.3));
        peages.add(new Peage(sortie9,  14.1));
        peages.add(new Peage(sortie10, 17.5));
        peages.add(new Peage(sortie11, 19.2));
        peages.add(new Peage(sortie12, 20.1));
        peages.add(new Peage(arrivee,  22.3));
        sortie3.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(sortie5,  1.8 ));
        peages.add(new Peage(sortie6,  4.4));
        peages.add(new Peage(sortie7,  6.8));
        peages.add(new Peage(sortie8,  8));
        peages.add(new Peage(sortie9,  12.8));
        peages.add(new Peage(sortie10, 15.4));
        peages.add(new Peage(sortie11, 17.2));
        peages.add(new Peage(sortie12, 18.4));
        peages.add(new Peage(arrivee,  21));
        sortie4.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(sortie6,  2.5 ));
        peages.add(new Peage(sortie7,  4.9));
        peages.add(new Peage(sortie8,  6.4));
        peages.add(new Peage(sortie9,  11.1));
        peages.add(new Peage(sortie10, 13.6));
        peages.add(new Peage(sortie11, 15.6));
        peages.add(new Peage(sortie12, 16.7));
        peages.add(new Peage(arrivee,  19.2));
        sortie5.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(sortie7,  2.4 ));
        peages.add(new Peage(sortie8,  4.8));
        peages.add(new Peage(sortie9,  7.1));
        peages.add(new Peage(sortie10, 10.1));
        peages.add(new Peage(sortie11, 12.3));
        peages.add(new Peage(sortie12, 13.1));
        peages.add(new Peage(arrivee,  15));
        sortie6.setPrix(peages);
        
        peages = new TreeSet<>();
        peages.add(new Peage(sortie8,  2.8 ));
        peages.add(new Peage(sortie9,  6.6));
        peages.add(new Peage(sortie10, 8.8));
        peages.add(new Peage(sortie11, 10.5));
        peages.add(new Peage(sortie12, 11.7));
        peages.add(new Peage(arrivee,  14.6));
        sortie7.setPrix(peages);
        
        peages = new TreeSet<>();
        peages.add(new Peage(sortie9,  3.8 ));
        peages.add(new Peage(sortie10, 6));
        peages.add(new Peage(sortie11, 7.7));
        peages.add(new Peage(sortie12, 8.9));
        peages.add(new Peage(arrivee,  11.8));
        sortie8.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(sortie10, 1.5));
        peages.add(new Peage(sortie11, 3.7));
        peages.add(new Peage(sortie12, 4.5));
        peages.add(new Peage(arrivee,  6.5));
        sortie9.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(sortie11, 2.3));
        peages.add(new Peage(sortie12, 2.4));
        peages.add(new Peage(arrivee,  5.3));
        sortie10.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(sortie12, 0.9));
        peages.add(new Peage(arrivee,  2.5));
        sortie11.setPrix(peages);
    
        peages = new TreeSet<>();
        peages.add(new Peage(arrivee, 2.1));
        sortie12.setPrix(peages);
    
    }

    public List<ParcoursDisplay> calculerParcours() {

        Set<Parcours> trajets = new TreeSet<>();
        depart.calculerTrajet(new Parcours(), trajets);

        List<ParcoursDisplay> displays = new ArrayList<>();
        for (Parcours parcours : trajets) {
            displays.add(new ParcoursDisplay(parcours));
        }

        return displays;
    }

    public List<ParcoursDisplay> calculerParcours(int nbLine, int nbSortie, double prix) {

        Set<Parcours> trajets = new TreeSet<>();
        depart.calculerTrajet(new Parcours(), trajets);

        List<ParcoursDisplay> displays = new ArrayList<>();
        for (Parcours parcours : trajets) {
            if ((nbLine == 0 || displays.size() < nbLine)
                && (nbSortie == 0 || (parcours.getSorties().size() - 1) <= nbSortie)
                && (prix == 0  || parcours.getPrixTotal() == prix)) {

                displays.add(new ParcoursDisplay(parcours));
            }
        }

        return displays;
    }
}
