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

    public Asteroid(String nom, String nomCientific, Double velocitat, Double velocitatMinima, Double velocitatMaxima,
                    Boolean esPerillos, int indexPerillositat, Double distancia, Double distanciaMinima,
                    Double distanciaMaxima, Double diametre, Double altura, Double amplada, Double profunditat,
                    String[] composicio, Double radi, Double orbita, String[] planetesPropers, Date primeraVisualitzacio,
                    Date diaMesProximALaTerra) {
        this.nom = nom;
        this.nomCientific = nomCientific;
        this.velocitat = velocitat;
        this.velocitatMinima = velocitatMinima;
        this.velocitatMaxima = velocitatMaxima;
        this.esPerillos = esPerillos;
        this.indexPerillositat = indexPerillositat;
        this.distancia = distancia;
        this.distanciaMinima = distanciaMinima;
        this.distanciaMaxima = distanciaMaxima;
        this.diametre = diametre;
        this.altura = altura;
        this.amplada = amplada;
        this.profunditat = profunditat;
        this.composicio = composicio;
        this.radi = radi;
        this.orbita = orbita;
        this.planetesPropers = planetesPropers;
        this.primeraVisualitzacio = primeraVisualitzacio;
        this.diaMesProximALaTerra = diaMesProximALaTerra;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomCientific() {
        return nomCientific;
    }

    public void setNomCientific(String nomCientific) {
        this.nomCientific = nomCientific;
    }

    public Double getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(Double velocitat) {
        this.velocitat = velocitat;
    }

    public Double getVelocitatMinima() {
        return velocitatMinima;
    }

    public void setVelocitatMinima(Double velocitatMinima) {
        this.velocitatMinima = velocitatMinima;
    }

    public Double getVelocitatMaxima() {
        return velocitatMaxima;
    }

    public void setVelocitatMaxima(Double velocitatMaxima) {
        this.velocitatMaxima = velocitatMaxima;
    }

    public Boolean getEsPerillos() {
        return esPerillos;
    }

    public void setEsPerillos(Boolean esPerillos) {
        this.esPerillos = esPerillos;
    }

    public int getIndexPerillositat() {
        return indexPerillositat;
    }

    public void setIndexPerillositat(int indexPerillositat) {
        this.indexPerillositat = indexPerillositat;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getDistanciaMinima() {
        return distanciaMinima;
    }

    public void setDistanciaMinima(Double distanciaMinima) {
        this.distanciaMinima = distanciaMinima;
    }

    public Double getDistanciaMaxima() {
        return distanciaMaxima;
    }

    public void setDistanciaMaxima(Double distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }

    public Double getDiametre() {
        return diametre;
    }

    public void setDiametre(Double diametre) {
        this.diametre = diametre;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAmplada() {
        return amplada;
    }

    public void setAmplada(Double amplada) {
        this.amplada = amplada;
    }

    public Double getProfunditat() {
        return profunditat;
    }

    public void setProfunditat(Double profunditat) {
        this.profunditat = profunditat;
    }

    public String[] getComposicio() {
        return composicio;
    }

    public void setComposicio(String[] composicio) {
        this.composicio = composicio;
    }

    public Double getRadi() {
        return radi;
    }

    public void setRadi(Double radi) {
        this.radi = radi;
    }

    public Double getOrbita() {
        return orbita;
    }

    public void setOrbita(Double orbita) {
        this.orbita = orbita;
    }

    public String[] getPlanetesPropers() {
        return planetesPropers;
    }

    public void setPlanetesPropers(String[] planetesPropers) {
        this.planetesPropers = planetesPropers;
    }

    public Date getPrimeraVisualitzacio() {
        return primeraVisualitzacio;
    }

    public void setPrimeraVisualitzacio(Date primeraVisualitzacio) {
        this.primeraVisualitzacio = primeraVisualitzacio;
    }

    public Date getDiaMesProximALaTerra() {
        return diaMesProximALaTerra;
    }

    public void setDiaMesProximALaTerra(Date diaMesProximALaTerra) {
        this.diaMesProximALaTerra = diaMesProximALaTerra;
    }
}
