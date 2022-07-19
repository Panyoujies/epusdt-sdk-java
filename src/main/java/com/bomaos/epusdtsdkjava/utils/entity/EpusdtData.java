package com.bomaos.epusdtsdkjava.utils.entity;

import lombok.Data;
import lombok.ToString;

/**
 * epusdt sdk
 * date:   2022-05-23 15:56
 * Url：   github.com/panyoujies
 */
@Data
@ToString
public class EpusdtData {
    private String trade_id;
    private String order_id;
    private Float amount;
    private Float actual_amount;
    private String token;
    private Integer expiration_time;
    private String payment_url;
}
