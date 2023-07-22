package com.lzk.service.impl;

import com.lzk.dao.StudentDao;
import com.lzk.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Override
    public void save() {
        System.out.println("student service save...");
        studentDao.save();
    }

    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }
}

