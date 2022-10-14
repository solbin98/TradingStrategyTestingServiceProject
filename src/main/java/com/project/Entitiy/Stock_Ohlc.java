package com.project.Entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Stock_Ohlc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stock_ohlc_id;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Stock.class)
    @JoinColumn(name = "stock_id")
    private Stock stock;

    private double open;
    private double close;
    private double high;
    private double low;
    private double volume;
    private Long date_value;
}
