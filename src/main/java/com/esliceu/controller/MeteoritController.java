package com.esliceu.controller;

import com.esliceu.model.Meteorit;
import com.esliceu.service.LocalService;
import com.esliceu.service.MeteoritService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MeteoritController {
    LocalService localService;
    MeteoritService neoService;

    public MeteoritController() {
        this.localService = new LocalService();
        this.neoService = new MeteoritService();
    }

    public List<Meteorit> getAsteroids() throws IOException {
        LocalDate date = LocalDate.now();
        List<Meteorit> meteorits = new ArrayList<>();
        meteorits.addAll(this.localService.findAll());
        meteorits.addAll(this.neoService.getMeteorits(date));
        return meteorits;
    }
}
