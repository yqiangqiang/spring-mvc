package com.yqq.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanqiangqiang on 2019/4/17.
 */
@Controller
public class TestControler {

    @RequestMapping("test.action")
    public String test() {
        return "test";
    }

}
