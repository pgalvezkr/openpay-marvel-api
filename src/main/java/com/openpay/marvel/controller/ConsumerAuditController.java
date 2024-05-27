package com.openpay.marvel.controller;

import com.openpay.marvel.model.ConsumerAudit;
import com.openpay.marvel.model.Response;
import com.openpay.marvel.repository.ConsumerAuditRepository;
import com.openpay.marvel.service.ConsumerAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/binnacle")
public class ConsumerAuditController {

    @Autowired
    private ConsumerAuditService consumerAuditService;

    public ConsumerAuditController (ConsumerAuditService consumerAuditService ){
        this.consumerAuditService = consumerAuditService;
    }

    @PostMapping
    public ResponseEntity<Response<ConsumerAudit>> createCallLog(@RequestBody ConsumerAudit consumerAuditLog) {
        this.consumerAuditService.saveConsumerAudit(consumerAuditLog);
        Response<ConsumerAudit> response = new Response<>(
                List.of(),
                "Consume audit guardado",
                HttpStatus.OK.value(),
                HttpStatus.OK.getReasonPhrase()
        );

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Response<ConsumerAudit>> getConsumerAuditList() {
        var consumerAuditLogs=  this.consumerAuditService.getConsumerAuditList();
        Response<ConsumerAudit> response = new Response<>(
                consumerAuditLogs,
                "Bitácora de llamadas a servicios",
                HttpStatus.OK.value(),
                HttpStatus.OK.getReasonPhrase()
        );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
