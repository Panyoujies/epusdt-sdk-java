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
public class EpusdtEntity {
    private Integer status_code;
    private String message;
    private EpusdtData data;
    private String request_id;
}
