/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon
 */
public class Worker {
        
      private int type;
      private String name;
      private int dayDuration;
      private float salaryAcc;
      private int payPerHour;
      private float acc;
      private float productionPerDay;
      private Semaphore mutex;
      private Drive drive;
      
          public Worker (int type, String name, int dayDuration, int payPerHour, Semaphore m, Drive d) {
        this.type = type;
        this.name = name;
        this.dayDuration = dayDuration;
        this.salaryAcc = 0;
        this.payPerHour = payPerHour;
        this.acc = 0;
        this.productionPerDay = 0.34f;
        this.mutex = m;
        this.drive = d;
    }
          
          
      @Override
        public void run(){
            while(true){
                
                try {
                    earnSalary();
                    System.out.println("Trabajador: "+this.name+" ha ganado: "+this.salaryAcc+"$");
                    work();
                    sleep(this.dayDuration);
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        
        public void earnSalary(){
            this.salaryAcc += this.payPerHour*24;
        }
        
        public void work(){
            this.acc += this.productionPerDay;
            if (this.acc >= 1) {
                this.acc = 0;
                try {
                    this.mutex.acquire(); //wait
                    this.drive.addToDrive(this.type);
                    this.mutex.release(); // signal
                    
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            
        }
}
