package com.openpay.marvel.service;

import com.openpay.marvel.model.ConsumerAudit;
import com.openpay.marvel.repository.ConsumerAuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ConsumerAuditService {

    @Autowired
    private ConsumerAuditRepository consumerAuditRepository;

    public ConsumerAuditService(ConsumerAuditRepository consumerAuditRepository){
        this.consumerAuditRepository = consumerAuditRepository;
    }

    public List<ConsumerAudit> getConsumerAuditList (){
        return this.consumerAuditRepository.findAll();
    }

    public void saveConsumerAudit (ConsumerAudit consumerAudit){
        consumerAudit.setExecutionDate(Instant.EPOCH.now());
        this.consumerAuditRepository.save(consumerAudit);
    }
}
