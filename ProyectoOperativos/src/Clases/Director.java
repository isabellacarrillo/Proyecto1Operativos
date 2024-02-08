/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.concurrent.Semaphore; 
import java.util.Random;
import Clases.Studio;
import static java.lang.Thread.sleep;
import Interfaces.DashBoard;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
/**
 *
 * @author Admin
 */
    
   public class Director extends Thread {
    private int wage;
    private long savings;
    private long horaAleatoria;
    private long dia;
    private long tiempo35min;
    private boolean vigila;
    private boolean distribuye;
    private boolean administrativo;
    private Company empresa; 
    DashBoard gui;
    
    public Director(int wage, long dia, Company empresa, GUI gui){
        this.wage = wage;
        this.empresa = empresa;
        this.dia = dia;
        this.tiempo35min = (25/1440)*dia;
        this.savings = 0;
        this.vigila = false;
        this.administrativo = true;
        this.distribuye = false;
        this.gui = gui;
    }
    
    @Override
    public void run(){
        while(true){
            //System.out.println("Tiempo 35 minutos");
            try{
                this.horaAleatoria = (int) (Math.random()*(this.dia - this.tiempo35min));
                sleep(this.horaAleatoria);
                this.vigila = true;
                this.administrativo = false;
                this.distribuye = false;
                this.gui.estadoDirector(vigila, administrativo, distribuye, this.empresa);
                
                if(!(empresa.pm.vigilado(this.vigila))){
                    sleep(this.tiempo35min);
                    empresa.pm.vigilado(this.vigila);
                }else{
                    sleep(this.tiempo35min);
                }
                
                this.vigila = false;
                this.administrativo = true;
                this.distribuye = false;
                this.gui.estadoDirector(vigila, administrativo, distribuye, this.empresa);
                
                sleep(this.dia-this.horaAleatoria-this.tiempo35min);
                
                this.savings += this.wage;
                if(empresa.deadline == 0){
                    this.vigila = false;
                    this.administrativo = false;
                    this.distribuye = true;
                    this.gui.estadoDirector(vigila, administrativo, distribuye, this.empresa);
                    distribuirVideojuegos();
                                
                }
            }
            catch(Exception e){
            }
        }
    }
    
    public void distribuirVideojuegos(){
        try{
            empresa.mutex.acquire();
            empresa.estudio.distribucion(empresa.name);
            empresa.mutex.release();
            empresa.deadline = empresa.diasEntrega;
            sleep(this.dia);
            this.vigila = false;
            this.administrativo = true;
            this.distribuye = false;
        }
        catch(Exception e){
        }
    }
    
    

}
