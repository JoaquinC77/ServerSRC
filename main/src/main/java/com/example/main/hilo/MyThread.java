package com.example.main.hilo;

import com.example.main.dao.DAOContrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyThread implements Runnable {

    @Autowired
    DAOContrato daoContrato;

    @Override
    public void run() {
        while(true){

            boolean b = daoContrato.updateContratoEstado();
            if(b){
                System.out.println("Si");
            }else{
                System.out.println("NO");
            }

            try {
                Thread.sleep(86400000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
