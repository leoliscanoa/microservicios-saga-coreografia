package com.lliscano.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "orders", schema = "public")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orders_sequence")
    @SequenceGenerator(sequenceName = "orders_sequence", name = "orders_sequence", schema = "public")
    private Long id;

    @Column(name = "transaction_id", nullable = false, length = 255)
    private String transactionId;

    @Column(name = "user_id", nullable = false, length = 255)
    private String userId;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "order_status", nullable = false, length = 50)
    private String orderStatus;

    @Column(name = "statement", nullable = false, length = 255)
    private String statement;
}
