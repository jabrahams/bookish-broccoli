package com.jessi.mbta_api;

import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;


@Type("route")
public class Route {
    
    @Id
    public String id;
    
    @JsonProperty("type")
    public int type;
    
    @JsonProperty("text_color")
    public String textColor;
    
    @JsonProperty("sort_order")
    public int sortOrder;
    
    @JsonProperty("short_name")
    public String shortName;
    
    @JsonProperty("long_name")
    public String longName;
    
    @JsonProperty("direction_names")
    public List<String> directionNames;
    
    @JsonProperty("description")
    public String description;
    
    @JsonProperty("color")
    public String color;
    
}