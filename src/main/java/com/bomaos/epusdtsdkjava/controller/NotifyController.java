package com.bomaos.epusdtsdkjava.controller;

import com.bomaos.epusdtsdkjava.utils.createPay;
import com.bomaos.epusdtsdkjava.utils.entity.EpusdtNotify;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.RoundingMode;

/**
 * epusdt sdk
 * date:   2022-05-23 15:56
 * Url：   github.com/panyoujies
 */
@RestController
@RequestMapping("/api")
public class NotifyController {

    @PostMapping("/epusdt/notifyUrl")
    @ResponseBody
    public String epusdt(@RequestBody EpusdtNotify epusdtNotify) {
        // System.out.println(epusdtNotify);
        epusdtNotify.setAmount(epusdtNotify.getAmount().setScale(2, RoundingMode.HALF_UP).stripTrailingZeros().stripTrailingZeros());
        String key = "key";
        String sign = createPay.createSign(epusdtNotify, key);
        if (sign.equals(epusdtNotify.getSignature())) {
            // 处理业务
        }
        return "fail";
    }

    @RequestMapping("/epusdt/returnUrl")
    @ResponseBody
    public void epusdtReturnUrl(String order_id, HttpServletResponse response) throws IOException {
        String url = "/pay/state/" + order_id;
        response.sendRedirect(url);
    }

}
