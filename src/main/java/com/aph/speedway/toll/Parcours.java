package com.aph.speedway.toll;

import java.util.LinkedList;

public class Parcours implements Comparable<Parcours> {
    
    private LinkedList<Sortie> sorties;
    private double prixTotal;


    public Parcours(LinkedList<Sortie> sorties, double prixTotal) {
        this.sorties = new LinkedList<>(sorties);
        this.prixTotal = prixTotal;
    }

    public Parcours() {
        this(new LinkedList<>(), 0);
    }


    public LinkedList<Sortie> getSorties() {
        return this.sorties;
    }

    public void setSorties(LinkedList<Sortie> sorties) {
        this.sorties = sorties;
    }

    public double getPrixTotal() {
        return this.prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }


    @Override
    public int compareTo(Parcours other) {
        if (other != null) {
            double xPrix = Math.round(prixTotal * 100) / 100.0;
            double yPrix = Math.round(other.getPrixTotal() * 100) / 100.0;
            if (xPrix == yPrix) {
                return sorties.size() - other.getSorties().size();
            }
            return xPrix > yPrix ? 1 : -1;
        }
        return -1;
    }


}
