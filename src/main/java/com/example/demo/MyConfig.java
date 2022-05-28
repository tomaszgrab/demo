package com.example.demo;


import com.example.demo.newPck.*;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    MyBean1 myBeaan(){
        return new MyBean1();
    }

    MyBean2 myBeaan2(){
        return new MyBean2();
    }
    MyBean3 myBeaan3(){
        return new MyBean3();
    }
    MyBean4 myBeaan4(){
        return new MyBean4();
    }
    MyBean5 myBeaan5(){
        return new MyBean5();
    }
}
