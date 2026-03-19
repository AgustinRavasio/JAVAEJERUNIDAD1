package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            Persona p = new Persona("Agustin", 22);

            String json = mapper.writeValueAsString(p);

            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}