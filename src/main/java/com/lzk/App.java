package com.lzk;

import com.lzk.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        StudentDao studentDao = (StudentDao) ctx.getBean("studentDao");
//        studentDao.save();

        StudentService studentService = (StudentService) ctx.getBean("studentService");
        studentService.save();
    }
}
