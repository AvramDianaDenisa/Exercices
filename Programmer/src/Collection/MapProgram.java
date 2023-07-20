package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        //creating a map object
        Map<String, String> languages = new HashMap<>();
        //<String, String> 2 generic parameters that's the key and the value
        if(languages.containsKey("Java"))
        {
            System.out.println("java already exist");
        }else
        {
            languages.put("Java","high level, object-oriented, platform independent language");
            System.out.println("java added succesfully");
        }

        languages.put("Pyton","an terpreted, object-oriented, high level programing language");
        languages.put("Algol","an algorithmic language");

        // nu metrg - prima data trebuie atribuite valori
        System.out.println(languages.put("BASICS","Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp","Therein lies madness"));

        // verificare daca exista deja o cheie
        if(languages.containsKey("Java"))
        {
            System.out.println("Java is already in the map");
        }else
        {
            languages.put("Java","thsi cours is about Java");
        }
        //System.out.println(languages.get("Java"));
        //languages.put("Java","this cours is abou Java");
        // se va scuprascrie valoare pentru key = Java
        //System.out.println(languages.get("Java"));

        // ANOTHER COMMAND, ANOTHER METHOD CALLED PUT IF ABSENT AND THAT ONLY GOING TO ADD TO THE MAP IF THE KEY IS NOT ALREADY PRESENT
        System.out.println("=============================================================");
        //sterge informatia in functie de cheie
        //languages.remove("Lisp");

        // verifica daca cheia sau mesajul se regasesc si in cazul in care le regasesc se vor sterge
        if(languages.remove("Algol","a family of algorithmic languages"))
        // if(languages.remove("Algol","an algorithmic language")) - in cazul asta va sterge
        {
            System.out.println("Algo; removed");
        }else
        {
            System.out.println("Algol not removed, key/value pair not found");
        }
        for (String key: languages.keySet()){
            System.out.println(key+": "+languages.get(key));
        }

        System.out.println("==========================================================");

        //inlocurea unei valori
       if( languages.replace("BASICS","Beginners All Purpose Symbolic Instruction Code","valoarea inlocuita"))
       {
           System.out.println("BASICS replaced");
       }else
       {
           System.out.println("BASICS was not replace");
       }


    }
}
