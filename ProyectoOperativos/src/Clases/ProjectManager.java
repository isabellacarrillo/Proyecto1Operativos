/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import Interfaces.DashBoard;

/**
 *
 * @author simon
 */


public class ProjectManager extends Thread {
    private int wage;
    private int qtyfaltas;
    private int descontado;
    private long savings;
    private long dia;
    private long tiempo30min;
    private boolean anime;
    private Company empresa;
    DashBoard gui;

    public ProjectManager(int wage, long dia, Company empresa, DashBoard gui){
        this.wage = wage; 
        this.dia = dia;
        this.empresa = empresa;
        this.tiempo30min = (dia/48);
        this.savings = 0;
        this.descontado = 0;
        this.qtyfaltas = 0;
        this.anime = false; 
        this.gui = gui;
    }
    
    @Override 
    public void run(){
        while(true){
            try{
                for(int gui=0; gui<16; gui++){
                    sleep(this.tiempo30min);
                    this.anime = true;
                    
                    this.gui.estadoPM(this.anime, this.empresa);
                    sleep(this.tiempo30min);             
                    this.anime = false;
                    this.gui.estadoPM(this.anime, this.empresa);
                }
                sleep(this.dia - (this.tiempo30min * 32));
                this.savings += this.wage;
                System.out.println(empresa.name + "   " + empresa.deadline);
                proceso();
            }
            catch(Exception e){
            }
        }
    }
    
    public void proceso(){
        empresa.deadline--;
        this.gui.actualizarCostos();
        
        this.gui.actualizarDeadline(empresa.deadline);
    }
    
    public boolean vigilado(boolean director){
        if(this.anime){
            this.qtyfaltas++;
            this.descontado+=50;
            this.savings -= 50;
            this.gui.atrapado(this.empresa, this.qtyfaltas, this.descontado);
            return true;
            
        }else{
            return false;
        }
    }
    
    
