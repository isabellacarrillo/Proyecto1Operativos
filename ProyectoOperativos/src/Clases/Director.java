/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.concurrent.Semaphore; 
import java.util.Random;
/**
 *
 * @author Admin
 */
public class Director extends Worker {
    
    private Drive drive;
    private boolean working;
    
    
    public Director(int type, String name, int dayDuration, int payPerHour, Semaphore m, Drive d) {
        super(type, name, dayDuration, payPerHour, m, d);
        this.working = true;
        
    }
    
    public void run(){
        while(working){
            double clock;
            try{
                drive.getDaysMutex().acquire();
                //Esto es cuando el contador marca O días restantes y todo lo que abarca cuando eso pasa
                if (drive.getDaysleftToRelease() == 0){
                    
                    
                }else{
                    //Esto es lo que hace el director en días que no tiene que release
                    drive.getDaysMutex().release();
                    
                    //Tenemos que incluir el director en un momento aleatorio del día yendo a chequear al PM
                    Random random = new Random();
                    double hour = getDayDuration()/24; //esto me da el valor de una hora
                    
                    
                    
                    
                }
                
            }catch(Exception e){
                
            }
        }
    }
    
    
    
}
