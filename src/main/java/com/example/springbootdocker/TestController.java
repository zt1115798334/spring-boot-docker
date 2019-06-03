package com.example.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang tong
 * date: 2019/5/28 16:58
 * description:
 */
@RestController
public class TestController {

    @GetMapping(value = "index")
    public String index() {
        return "index";
    }

}
