package com.yqq.controler;

import com.yqq.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by yanqiangqiang on 2019/4/17.
 */
@Controller
public class TestControler {

    @RequestMapping("test.action")
    public String test() {
        return "test";
    }

    @RequestMapping("uploadTest.action")
    public String uploadTest(@RequestBody  UserEntity userEntity) {

//        if (files != null) {
//            System.out.println("文件个数："+files.length);
//        }
        return "test";
    }

}
