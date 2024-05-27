package com.openpay.marvel.controller;

import com.openpay.marvel.service.MarvelService;
import org.springframework.beans.factory.annotation.Autowired;

public class MarvelController {

    @Autowired
    private MarvelService marvelService;

    public MarvelController (MarvelService marvelService){
        this.marvelService = marvelService;
    }


}
