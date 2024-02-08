/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

/**
 *
 * @author simon
 */
public class ProjectManager extends Worker {
    
    private boolean working;
    private int registerDayAccount;
    private Drive drive;
    
    
    public ProjectManager(int type, String name, int dayDuration, int payPerHour, Semaphore m, Drive d) {
        super(type, name, dayDuration, payPerHour, m, d);
        this.working = true;
        this.registerDayAccount = 0;
    }

    
    @Override
    
    public void supervisionWorkPM(this.dayDuration) {
        while (working) {
            try {

                // Media hora = un dia entre 24 horas entre 2
                double halfHour = this.dayDuration / 48;
                int counter = 0;

                // 16 horas al dia
                while (counter < 16) {

                    drive.setPMStatus(0);

                    //Si el director lo esta vigilando entonces
                    if (drive.getDirectorStatus() == 0) {
                        //TODO: poner lo que va a hacer 

                        drive.setFaltas(drive.getFaltas() + 1);
                        drive.setSalaryDiscount(drive.getSalaryDiscount() + 50);
                        
                        //Le quitan su plata
                        drive.getCostMutex().acquire();
                        drive.setPMStatus(drive.getPMCost() - 50);
                        drive.getCostMutex().release();

                    }

                    sleep(Math.round(halfHour));

                    drive.setPMStatus(1);
                    sleep(Math.round(halfHour));
                    counter++;
                }

                drive.setPMStatus(0);

                sleep(Math.round(halfHour * 16));
                drive.getDaysMutex().acquire();
                drive.setDaysleftToRelease(drive.getDaysleftToRelease() - 1);
                drive.getDaysMutex().release();

                //Cobrando su dia de trabajo
                drive.getCostMutex().acquire();
                drive.setPmCost(drive.getPMCost() + payPerHour * 24);
                drive.getCostMutex().release();

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        
    }

   public void run() {
       
       while (working){
           try{
               double halfhour = getDayDuration()/ 48;
               int counter = 0;
               
               // este es el espacio de tiempo en el que el PM ve media hora anime y trabaja media hora
               while (counter < 16){
                   
                   drive.setPMStatus(0);
                   
                   if (drive.getDirectorStatus() == 1){ // Cuando el director esta vigilando
                       drive.setFaults( drive.getFaults() + 1);
                       
                       
                       drive.getCostMutex().acquire();
                       drive.setPMcost(drive.getPMcost()-100);
                       drive.getCostMutex().release();
                   }
                   
                   sleep(Math.round(halfhour));
                   drive.setPMStatus(1);
                   sleep(Math.round(halfhour));
                   counter++;     
               
               }
               drive.setPMStatus(0);
               sleep(Math.round(halfhour*16));
               drive.getDaysMutex().acquire();
               drive.setDaysleftToRelease(drive.getDaysleftToRelease()-1);
               drive.getDaysMutex().release();
               
               
               drive.getCostMutex().acquire();
               drive.setPMcost(drive.getPMcost() + getPayPerHour()*24);
               drive.getCostMutex().release();
               
           }
           catch(Exception e){}
       }
   }
 
    
    
}
