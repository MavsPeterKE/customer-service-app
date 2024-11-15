package com.peter.app.rest.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name ="first_name")
    private String fullName;

    @Column(name ="date_of_birth")
    private String dob;

    @Column(name ="nationality")
    private String nationality;

    @Column(name ="tax_id")
    private String taxId;

    @Column(name ="residence")
    private String residence;

    @Column(name ="phone_number")
    private String phone;

    @Column(name ="email_address")
    private String emailAddress;
}

