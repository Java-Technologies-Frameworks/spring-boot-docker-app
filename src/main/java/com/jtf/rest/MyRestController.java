package com.jtf.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qualigy")
public class MyRestController {

    private Logger logger = LoggerFactory.getLogger(MyRestController.class);

    public MyRestController() {
        logger.info("***** MyRestController::Constructor *****");
    }

    @GetMapping("/info/{message}")
    public String getInfo(@PathVariable String message) {
        logger.info("***** execution start *****");
        String msg = "Welcome to Qualigy Tech India  Bengaluru !!" +message;
        logger.info("***** execution end *****");
        return msg;
    }
}
