package com.demoolc.demo.rest;


import com.demoolc.demo.database.Trein;
import com.demoolc.demo.database.TreinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/vbeen")
    public void slaIetsOp(){
        Trein trein = new Trein();
        trein.setNaam("vbeen");
        trein.setSnelheid(50);
        tr.save(trein);
    }
    @GetMapping("/vbtwee/{eigennaam}")
    public void slaIetsOp2(@PathVariable String eigennaam){
        Trein trein = new Trein();
        trein.setNaam(eigennaam);
        trein.setSnelheid(50);
        tr.save(trein);
    }
    @GetMapping("/vbdrie")
    public Iterable<Trein> geefAllTreinene(){
        return tr.findAll();
    }

}
