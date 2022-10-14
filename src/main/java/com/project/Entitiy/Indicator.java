package com.project.Entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Indicator {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int indicator_id;

    private String name;
    private String text;
}
