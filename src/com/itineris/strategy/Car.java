package com.itineris.strategy;

import com.itineris.repository.ORSRepository;
import com.itineris.repository.RouteData; 

public class Car implements Strategy {

    ORSRepository repository = new ORSRepository();

    @Override
    public RouteData calculerTrajet(String departure, String arrival) {
        
        RouteData data = repository.getRouteData(departure, arrival, "driving-car");

        if (data == null) {
            return new RouteData(0, 0);
        }

        return data;
    }
}