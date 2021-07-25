package com.aph.speedway.toll;

public class Peage implements Comparable<Peage> {

    private final Sortie sortie;
    private final double prix;

    public Peage(Sortie sortie, double prix) {
        this.sortie = sortie;
        this.prix = prix;
    }

    public Sortie getSortie() {
        return this.sortie;
    }

    public double getPrix() {
        return this.prix;
    }

    @Override
    public int compareTo(Peage peageToCompare) {
        if (peageToCompare != null) {
            return (sortie.getOrder() > peageToCompare.getSortie().getOrder() ? 1 :
                    sortie.getOrder() < peageToCompare.getSortie().getOrder() ? -1 : 0);
        }
        return -1;
    }
}
