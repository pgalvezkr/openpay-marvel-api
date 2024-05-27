package com.openpay.marvel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String serviceName;
    private LocalDateTime executionDate;


//    public static Builder builder() {
//        return new Builder();
//    }
//
//    public static class Builder {
//        private String serviceName;
//        private LocalDateTime callDate;
//        private String response;
//
//        public Builder serviceName(String serviceName) {
//            this.serviceName = serviceName;
//            return this;
//        }
//
//        public Builder callDate(LocalDateTime callDate) {
//            this.callDate = callDate;
//            return this;
//        }
//
//
//        public ConsumerAudit build() {
//            return new ConsumerAudit(serviceName, callDate);
//        }
//    }
}
