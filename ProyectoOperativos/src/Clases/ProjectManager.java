/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.concurrent.Semaphore;

/**
 *
 * @author simon
 */
public class ProjectManager extends Worker {
    
    private boolean working;
    private int registerDayAccount;
    
    
    public ProjectManager(int type, String name, int dayDuration, int payPerHour, Semaphore m, Drive d) {
        super(type, name, dayDuration, payPerHour, m, d);
        this.working = true;
        this.registerDayAccount = 0;
    }


        
    
    
}
