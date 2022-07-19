package com.bomaos.epusdtsdkjava.utils;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * epusdt sdk
 * date:   2022-05-23 15:56
 * Url：   github.com/panyoujies
 */
@Data
@ToString
public class Epusdt {
    private String order_id;
    private BigDecimal amount;
    private String notify_url;
    private String redirect_url;
    private String signature;
}
