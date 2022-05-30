package com.esliceu.model;

import java.util.Date;

public class Asteroid {
    private String nom;
    private String nomCientific;
    private Double velocitat;
    private Double velocitatMinima;
    private Double velocitatMaxima;
    private Boolean esPerillos;
    private int indexPerillositat;
    private Double distancia;
    private Double distanciaMinima;
    private Double distanciaMaxima;
    private Double diametre;
    private Double altura;
    private Double amplada;
    private Double profunditat;
    private String[] composicio;
    private Double radi;
    private Double orbita;
    private String[] planetesPropers;
    private Date primeraVisualitzacio;
    private Date diaMesProximALaTerra;

    public Asteroid(String nom, Double velocitat, Boolean esPerillos, Double distancia, Double diametre) {
        this.nom = nom;
        this.velocitat = velocitat;
        this.esPerillos = esPerillos;
        this.distancia = distancia;
        this.diametre = diametre;
    }
}
