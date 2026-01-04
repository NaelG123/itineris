package com.itineris.strategy;

import com.itineris.repository.RouteData;

public interface Strategy {

    RouteData calculerTrajet(String departure, String arrival);

}