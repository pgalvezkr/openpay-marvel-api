package com.openpay.marvel.service;

import com.openpay.marvel.model.ConsumerAudit;
import com.openpay.marvel.repository.ConsumerAuditRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MarvelService {

    private final ConsumerAuditRepository consumerAuditRepository;

    public List <Character> getCharacters (){
        consumerAuditRepository.save(ConsumerAudit.builder().serviceName("Get Characters").build());
        return null;
    }

    public Character getCharacterById (){
        consumerAuditRepository.save(ConsumerAudit.builder().serviceName("Get Character by Id").build());
        return null;
    }
}
