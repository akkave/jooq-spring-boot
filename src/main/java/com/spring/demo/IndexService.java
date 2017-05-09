package com.spring.demo;

import static com.spring.demo.jooq.Tables.ABC;

import java.sql.Timestamp;
import java.util.Date;

import org.jooq.DSLContext;
import org.jooq.Record4;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IndexService {
  
  @Autowired
  DSLContext dsl;

  public void insertIntoAbc() {
    String[] names = {"Ram", "Shyam", "Gopal", "Akkave"};
    Integer[] ranks = {3, 2, 4, 1};
    Date parsed = new Date();
    Timestamp timestamp = new Timestamp(parsed.getTime());
    
    for(int i = 0; i<names.length; i++) {
      dsl.insertInto(ABC, ABC.NAME, ABC.RANK, ABC.CURRENTDATE).values(names[i], ranks[i], timestamp)
      .execute();
    }
  }

  public Result<Record4<Integer, String, Integer, Timestamp>> show() {
   return  dsl.select(ABC.ID, ABC.NAME, ABC.RANK, ABC.CURRENTDATE)
       .from(ABC)
       .fetch();
  }
  
}
