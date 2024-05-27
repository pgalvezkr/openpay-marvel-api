package com.openpay.marvel.service;

import com.consumer.marvel.dto.ApiResponse;
import com.openpay.marvel.model.ConsumerAudit;
import com.openpay.marvel.repository.ConsumerAuditRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;


@Service
@AllArgsConstructor
public class MarvelService {

    private final ConsumerAuditRepository consumerAuditRepository;
    private final com.consumer.marvel.client.CharacterClient characterClient;

    public ApiResponse getCharacters() {
        consumerAuditRepository.save(ConsumerAudit.builder().serviceName("Get Characters").executionDate(Instant.EPOCH.now()).build());
        return  characterClient.getCharacters();
    }

    public ApiResponse getCharacterById() {
        consumerAuditRepository.save(ConsumerAudit.builder().serviceName("Get Character by Id").executionDate(Instant.EPOCH.now()).build());
        return null;
    }
}
