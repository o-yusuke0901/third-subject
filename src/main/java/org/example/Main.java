package org.example;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //List
        List<String> names =new ArrayList<>();
        names.add("Snorlax");
        names.add("Eevee");

        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        //Map
        Map<String,String> pokemonMap=new HashMap<>();
        pokemonMap.put("Bulbasaur","No1,Grass type");
        pokemonMap.put("Charmander","No4,Fire type");
        pokemonMap.put("squirrel","No7 Water type");

        System.out.println(pokemonMap.get("Bulbasaur"));
        System.out.println(pokemonMap.get("Charmander"));
        System.out.println(pokemonMap.get("squirrel"));
        System.out.println(pokemonMap.get("Raichu"));


        //exception handling
        boolean havingBulbasaur = pokemonMap.containsKey("Bulbasaur");
        System.out.println("Does bulbasaur exist?");
        if (havingBulbasaur) {
            System.out.println("Bulbasaur exists.");
        }
        else {
            System.out.println("Bulbasaur does not exist.");
            }




    }
}