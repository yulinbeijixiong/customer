package com.customer.index;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author oujian
 * create by 2019/1/16
 */

/**
 * 将首页转发到swagger-ui.html页面
 */
@Profile({"dev","test"})
@ApiIgnore
@Controller
public class IndexResoure {
    @RequestMapping(value = "/")
    public String  index(){
        return "redirect:swagger-ui.html";
    }
}
