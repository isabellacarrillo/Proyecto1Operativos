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
      private int part;
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
          
          
        public void run(){
            while(true){
                
                try {
                    earnSalary();
                    System.out.println("Trabajador: "+this.getName()+" ha ganado: "+this.getSalaryAcc()+"$");
                    work();
                    sleep(this.getDayDuration());
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
        
        public void earnSalary(){
            this.setSalaryAcc(this.getSalaryAcc() + this.getPayPerHour() * 24);
        }
        
        public void work(){
            this.setAcc(this.getAcc() + this.getProductionPerDay());
            if (this.getAcc() >= 1) {
                this.setAcc(0);
                try {
                    this.getMutex().acquire(); //wait
                    this.getDrive().addPart(this.getType(), this.getPart());
                    this.getMutex().release(); // signal
                    
                    
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            
        }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the part
     */
    public int getPart() {
        return part;
    }

    /**
     * @param part the part to set
     */
    public void setPart(int part) {
        this.part = part;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dayDuration
     */
    public int getDayDuration() {
        return dayDuration;
    }

    /**
     * @param dayDuration the dayDuration to set
     */
    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    /**
     * @return the salaryAcc
     */
    public float getSalaryAcc() {
        return salaryAcc;
    }

    /**
     * @param salaryAcc the salaryAcc to set
     */
    public void setSalaryAcc(float salaryAcc) {
        this.salaryAcc = salaryAcc;
    }

    /**
     * @return the payPerHour
     */
    public int getPayPerHour() {
        return payPerHour;
    }

    /**
     * @param payPerHour the payPerHour to set
     */
    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }

    /**
     * @return the acc
     */
    public float getAcc() {
        return acc;
    }

    /**
     * @param acc the acc to set
     */
    public void setAcc(float acc) {
        this.acc = acc;
    }

    /**
     * @return the productionPerDay
     */
    public float getProductionPerDay() {
        return productionPerDay;
    }

    /**
     * @param productionPerDay the productionPerDay to set
     */
    public void setProductionPerDay(float productionPerDay) {
        this.productionPerDay = productionPerDay;
    }

    /**
     * @return the mutex
     */
    public Semaphore getMutex() {
        return mutex;
    }

    /**
     * @param mutex the mutex to set
     */
    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    /**
     * @return the drive
     */
    public Drive getDrive() {
        return drive;
    }

    /**
     * @param drive the drive to set
     */
    public void setDrive(Drive drive) {
        this.drive = drive;
    }
}
