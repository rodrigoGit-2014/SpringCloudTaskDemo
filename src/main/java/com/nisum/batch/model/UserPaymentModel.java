package com.nisum.batch.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPaymentModel {
    private String userName;
    private String surnameName;
    private int year;
    private int month;
    private String creditCardNumber;
}
