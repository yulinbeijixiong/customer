package com.customer.index;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
