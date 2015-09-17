package cn.dbke.info.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liyangtao on 15/9/16.
 */
@Controller
@RequestMapping("/home")
public class HomeController implements InitializingBean{


    private Logger logger = LoggerFactory.getLogger(HomeController.class);
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(){
        logger.warn("get a request");
        return "hello";
    }

    public void afterPropertiesSet() throws Exception {
        logger.warn("init homeController");
    }
}
