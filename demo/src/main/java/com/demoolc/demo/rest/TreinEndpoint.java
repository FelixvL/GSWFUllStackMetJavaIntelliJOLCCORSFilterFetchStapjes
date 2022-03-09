package com.demoolc.demo.rest;


import com.demoolc.demo.database.Trein;
import com.demoolc.demo.database.TreinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TreinEndpoint {
    @Autowired
    TreinRepository tr;

    @GetMapping("/eentrein")
    public Trein getEenTrein(){
        Trein trein = new Trein();
        trein.setNaam("Thalys");
        trein.setSnelheid(40);
        return trein;
    }



    @GetMapping("/ditisvanmij")
    public String dezeMethode(){
        return "Hij doet het";
    }
}
