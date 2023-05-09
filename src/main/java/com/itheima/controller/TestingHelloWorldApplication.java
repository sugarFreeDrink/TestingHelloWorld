
/**
 *
 * @author sugarFree_drink
 * @date ${YEAR}/${MONTH}/${DAY}/${TIME}
 */
package com.itheima.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class TestingHelloWorldApplication {
    @GetMapping("")
    public String hello(){
        System.out.println("hello world4...");
        return "OK4";
    }



}
