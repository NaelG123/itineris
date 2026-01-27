# ITINERIS - Comparateur d'Itinéraires 

Ce projet est une application Java permettant de calculer la distance et la durée de trajets entre deux villes en utilisant l'API **OpenRouteService**. 

## *FR* Documentation du Projet (English below)

### Fonctionnalités Clés
* **Calcul de trajet réel** : Intégration de l'API OpenRouteService.
* **Géocodage** : Utilisation de Nominatim (OpenStreetMap) pour convertir les noms de villes en coordonnées.
* **Design Pattern Strategy** : Architecture flexible permettant de basculer entre les modes de transport (Voiture, Vélo, Marche).

### Configuration & Lancement
Par mesure de sécurité, la clé API n'est pas incluse dans le dépôt. Pour lancer le projet :
1. Créez un compte et récupérez votre clé API : [Site OpenRouteService](https://openrouteservice.org/)
2. Créez un fichier `config.properties` à la racine du projet.
3. Ajoutez votre clé : `ors.api.key=VOTRE_CLE_ICI`.
*Note : Assurez-vous que ce fichier est listé dans votre .gitignore.*
4. Lancez la classe Main.java depuis votre IDE.

---

## *FR* Project Documentation 

### Key Features
* **Real Route Calculation**: Integration with OpenRouteService API.
* **Geocoding**: Using Nominatim (OpenStreetMap) to convert city names into GPS coordinates.
* **Strategy Design Pattern**: Flexible architecture to switch between transport modes (Car, Bike, Walking).

### Setup & Launch
For security reasons, the API key is not included in this repository. To run the project:
1. Create an account and get your API key : [OpenRouteService](https://openrouteservice.org/)
2. Create a `config.properties` file at the root of the project.
3. Add your API key: `ors.api.key=YOUR_API_KEY_HERE`.
*Note: Ensure this file is listed in your .gitignore.*
4. Launch Main.java from your IDE.
