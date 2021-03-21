package com.example.main.hilo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AsyncService {

    @Autowired
    TaskExecutor taskExecutor;

    @Autowired
    MyThread myThread;

    @PostConstruct
    public void init(){
        taskExecutor.execute(myThread);
    }
}
