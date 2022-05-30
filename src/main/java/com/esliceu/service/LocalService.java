package com.esliceu.service;

import com.esliceu.model.Asteroid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocalService {
    private final List<Asteroid> meteorits;

    public LocalService() {
        this.meteorits = new ArrayList<>();
    }

    public List<Asteroid> findAll() throws IOException {
        return this.meteorits;
    }

    public void add(Asteroid meteorit) {
        this.meteorits.add(meteorit);
    }

    public void remove(int index) {
        this.meteorits.remove(index);
    }
}
