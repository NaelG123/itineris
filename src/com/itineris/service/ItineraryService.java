package com.itineris.service;

import com.itineris.strategy.Bike;
import com.itineris.strategy.Car;
import com.itineris.strategy.Walk;

public class ItineraryService {
    Context context = new Context();

    public void calculerService(int choix, String departure, String arrival) {
        if (choix == 1) { context.setStrategy(new Walk()); } 
        else if (choix == 2) { context.setStrategy(new Bike()); }
        else if (choix == 3) { context.setStrategy(new Car()); }
        else { System.out.println("Mode de transport invalide"); return; }

        context.calculer(departure, arrival);     // Le serive choisit la strat et appel le contexte pour le calcul effectif
    }
}


