package com.jessi.mbta_api;

@Type("route")
public class Route {
    
    @Id
    String id;
    int type;
    String textColor;
    int sortOrder;
    String shortName;
    String longName;
    String directionNames;
    String description;
    String color;
    
}