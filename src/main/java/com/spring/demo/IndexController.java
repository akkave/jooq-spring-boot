package com.spring.demo;

import java.sql.Timestamp;

import org.jooq.Record4;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
  
  @Autowired
  private IndexService indexService;
  
  @RequestMapping("/")
  @ResponseBody
  public String abc() {
    indexService.insertIntoAbc();
    return "It works..";
  }
  
  @RequestMapping("/show")
  @ResponseBody
  public String show() {
    Result<Record4<Integer, String, Integer, Timestamp>> res = indexService.show();
    return res.toString();
  }
}
