package br.pdpano.imersaoms.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Payment {

    String id;
    String userId;
    PaymentStatus status;

    public enum PaymentStatus {
        PENDING, APPROVED
    }
}
