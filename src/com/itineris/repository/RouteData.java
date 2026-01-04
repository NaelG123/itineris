package com.itineris.repository;

public class RouteData {
    private double duration;
    private double distance;

    public RouteData(double duration, double distance) {
        this.duration = duration;
        this.distance = distance;
    }

    public double getDuration() { return duration; }
    public double getDistance() { return distance; }
}