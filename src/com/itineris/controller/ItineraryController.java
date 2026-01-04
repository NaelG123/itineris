package com.itineris.controller;

import java.util.Scanner;

import com.itineris.service.ItineraryService;


public class ItineraryController {
    Scanner scanner = new Scanner(System.in);
    ItineraryService service = new ItineraryService();

        public void lancer() {

        System.out.println("Entrez la ville de départ :");
        String departure = scanner.nextLine();

        System.out.println("Entrez la ville d'arrivée :");
        String arrival = scanner.nextLine();

        System.out.println("Mode : 1=A pieds, 2=Vélo, 3=Voiture");
        int mode = scanner.nextInt(); 
     
        service.calculerService(mode, departure, arrival);  // Le controller s'occupe seulement de recuperer les infos, il les donne ensuite au

        scanner.close();

    }
}


