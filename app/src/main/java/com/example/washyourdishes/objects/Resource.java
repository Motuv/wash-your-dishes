package com.example.washyourdishes.objects;

public class Resource {
    private final int id;
    private String resource_name;
    private String status_of_resource;

    private static int idCounter = 1;

    public Resource(String resource_name, String status_of_resource) {
        this.id = idCounter;
        this.resource_name = resource_name;
        this.status_of_resource = status_of_resource;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }

    public String getStatus_of_resource() {
        return status_of_resource;
    }

    public void setStatus_of_resource(String status_of_resource) {
        this.status_of_resource = status_of_resource;
    }
}
