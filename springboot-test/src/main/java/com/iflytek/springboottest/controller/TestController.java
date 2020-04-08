package com.iflytek.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zytian
 * @version v1.0
 * @since 2019-12-26 14:06
 */
@RestController
public class TestController {

    @GetMapping("/getName")
    public String getName() {
        return "Hello,Spring Cloud";
    }
}
