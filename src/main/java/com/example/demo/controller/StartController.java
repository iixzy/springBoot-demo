package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coder
 * @date 2021年3月11日
 */
@RestController
public class StartController {

    /**
     * @ApiOperation swagger方法注释
     *
     * @return
     */
    @GetMapping("/startByGet")
    @ApiOperation("Swagger的测试 ---- get")
    public String startByGet() {
        return "<h1>Hello, World ----> Get</h1>";
    }

    @PostMapping("/startByPost")
    @ApiOperation("Swagger的测试 ---- post")
    public String startByPost() {
        return "<h1>Hello, World ----> Post</h1>";
    }
}
