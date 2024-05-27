package com.openpay.marvel.controller;

import com.consumer.marvel.dto.ApiResponse;
import com.openpay.marvel.model.ConsumerAudit;
import com.openpay.marvel.model.Response;
import com.openpay.marvel.service.MarvelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marvel")
@CrossOrigin(origins = "http://localhost:4200")
public class MarvelController {

    @Autowired
    private MarvelService marvelService;

    public MarvelController (MarvelService marvelService){
        this.marvelService = marvelService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getCharacters() {
        var consumerAuditLogs=  this.marvelService.getCharacters();
        return new ResponseEntity<>(consumerAuditLogs, HttpStatus.OK);
    }

}
