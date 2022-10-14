package com.project.Entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stock_id;

    private String name;
}
