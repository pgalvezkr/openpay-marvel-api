package com.openpay.marvel.service;

import com.consumer.marvel.client.CharacterClient;
import com.consumer.marvel.dto.ApiResponse;
import com.openpay.marvel.repository.ConsumerAuditRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MarvelServiceTest {

    @Mock
    private ConsumerAuditRepository consumerAuditRepository;

    @Mock
    private CharacterClient characterClient;

    @InjectMocks
    private MarvelService marvelService;

    @BeforeEach
    public void setUp() {
        Mockito.lenient().when(characterClient.getCharacters()).thenReturn(new ApiResponse());
        Mockito.lenient().when(characterClient.getCharacterById(Mockito.anyInt())).thenReturn(new ApiResponse());
    }

    @Test
    public void testGetCharacters() {
        var response = marvelService.getCharacters();
        Assertions.assertNotNull(response);
        Mockito.verify(consumerAuditRepository, Mockito.times(1)).save(Mockito.argThat(consumerAudit -> consumerAudit.getServiceName().equals("Get Characters")));
    }

}
