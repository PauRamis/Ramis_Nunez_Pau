package com.esliceu.controller;

import com.esliceu.model.Asteroid;
import com.esliceu.service.LocalService;
import com.esliceu.service.NeoService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AsteroidController {
    LocalService localService;
    NeoService neoService;

    public AsteroidController() {
        this.localService = new LocalService();
        this.neoService = new NeoService();
    }

    public List<Asteroid> getAsteroids() throws IOException {
        LocalDate date = LocalDate.now();
        List<Asteroid> meteorits = new ArrayList<>();
        meteorits.addAll(this.localService.findAll());
        meteorits.addAll(this.neoService.getAsteroidsFromNasa(date));
        return meteorits;
    }
}
