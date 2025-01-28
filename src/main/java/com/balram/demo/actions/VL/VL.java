package com.balram.demo.actions.VL;

import java.util.List;

public class VL {

    public static void main(String[] args) {

        List<String> names = List.of("Balram","rahul","valuelabs","sunil","venky");

//        names.forEach( e -> {
//            Optional<String> optStr = Optional.of(e);
//            if(optStr.isPresent()){
//                //Balram
//            }else{
//                //null
//            }
//        });

        List<String> list = names
                .stream()
                .filter(e -> e.startsWith("v"))
                .toList();

//        v.entrySet().forEach( e-> System.out.println( e.getKey() + " "+e.getValue()));

        list.forEach( e -> System.out.println(e));

    }
}


// postman - /getusers
// controller -> https methods -> @GetMapping
// service -> business -> @Service -> @Repository findBy(keyFilds);


//@Repository
//

// C -> B (Down / any issues)
//API - Gateway -> B.
//oc -halfOpen



