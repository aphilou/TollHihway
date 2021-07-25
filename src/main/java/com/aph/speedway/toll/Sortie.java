package com.aph.speedway.toll;

import java.util.Iterator;
import java.util.Set;

public class Sortie {

    private String name;
    private int order;
    private boolean start;
    private boolean end;
    //private LinkedList<Sortie> parcours;
    private Set<Peage> prix;

    public Sortie(String name, int order) {

        this.name = name;
        this.order = order;
    }

    public void calculerTrajet(Parcours parcours, Set<Parcours> trajets) {
        if (end) {
            parcours.getSorties().add(this);
            trajets.add(parcours);
            return;
        }

        Iterator<Peage> ite = prix.iterator();
        while (ite.hasNext()) {
            Parcours newParcours = new Parcours(parcours.getSorties(), parcours.getPrixTotal());
            Peage prix = ite.next();
            newParcours.setPrixTotal(parcours.getPrixTotal() + prix.getPrix());
            newParcours.getSorties().add(this);
            prix.getSortie().calculerTrajet(newParcours, trajets);
        }
    }

    public Sortie(String name, int order, boolean start) {
        this(name, order);    
        this.start = start;
    }

    public Sortie(String name, int order, boolean start, boolean end) {
        this(name, order, start);    
        this.end = end;
    }

    public String getName() {
        return this.name;
    }

    public int getOrder() {
        return this.order;
    }

    // public LinkedList<Sortie> getParcours() {
    //     return this.parcours;
    // }

    // public void setParcours(LinkedList<Sortie> parcours) {
    //     this.parcours = parcours;
    // }

    public Set<Peage> getPrix() {
        return this.prix;
    }

    public void setPrix(Set<Peage> prix) {
        this.prix = prix;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isStart() {
        return this.start;
    }

    public boolean isEnd() {
        return this.end;
    }

}