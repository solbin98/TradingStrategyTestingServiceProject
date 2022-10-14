package com.project.Entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int result_id;

    private double profit;
    private double total_profit;
    private double total_loss;
    private double mdd;
    private double sharp_ratio;
    private int total_exchange_count;
    private int total_profit_exchange_count;
    private double pnl_ratio;
    private double win_ratio;
    private double total_fee;
    private double maximum_profit;
    private double maximum_loss;
    private double avg_holding_period;
    private double account_before;
    private double account_after;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Member.class)
    @JoinColumn(name = "member_id")
    private Member member;
}
