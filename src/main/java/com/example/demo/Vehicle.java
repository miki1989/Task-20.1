package com.example.demo;

public class Vehicle {
    private String name;
    private TypeOfVehicle vehicles;
    private String description;
    private String imageUrl;
    private int price;

    public Vehicle() {
    }

    public Vehicle(String name, TypeOfVehicle vehicles, String description, String imageUrl, int price) {
        this.name = name;
        this.vehicles = vehicles;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfVehicle getVehicles() {
        return vehicles;
    }

    public void setVehicles(TypeOfVehicle vehicles) {
        this.vehicles = vehicles;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
