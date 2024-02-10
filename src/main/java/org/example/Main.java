package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

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