package com.itineris.service;

import com.itineris.repository.RouteData;
import com.itineris.strategy.Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calculer(String departure, String arrival) {
        RouteData data = strategy.calculerTrajet(departure, arrival);
    
        if (data != null) {
            double secondes = data.getDuration();
            double metres = data.getDistance();

            int h = (int) (secondes / 3600);
            int m = (int) ((secondes % 3600) / 60);
        
            System.out.printf("Distance : %.2f km | Temps : %dh %02dmin\n", metres/1000, h, m);
        }
    }
}
