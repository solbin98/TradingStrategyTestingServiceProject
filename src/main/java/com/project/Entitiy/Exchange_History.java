package com.project.Entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Exchange_History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exchange_id;

    @ManyToOne(targetEntity = Result.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "result_id")
    private Result result;

    @ManyToOne(targetEntity = Stock.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_id")
    private Stock stock;

    private String type;
    private double price;
    private double volume;
    private Long date_value;
}
