/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.concurrent.Semaphore;
import Interfaces.DashBoard;
import Clases.ProjectManager;
/**
 *
 * @author Admin
 */
public class Company {
    public String name;
    public int diasEntrega, deadline;
    private int maxWorkers, guiones, escenarios, animadores, doblajes, PlotTwists, ensambladores;
    public Worker[] workers;
    public Studio estudio;
    private long dia;
    public Semaphore mutex;
    DashBoard gui;
    
    public Company(String name, int duracionDia, int dias, int guiones, int escenarios, int animadores, int doblajes, int PlotTwists, int ensambladores, DashBoard gui){
        this.name = name;
        this.diasEntrega = dias;
        this.deadline = dias;
        this.workers = new Worker[17];
        
        this.estudio = new Studio(25, 20, 55, 35, 10, gui);
        this.mutex = new Semaphore(1);
        
        this.guiones = guiones;
        this.escenarios = escenarios;
        this.animadores = animadores;
        this.doblajes = doblajes;
        this.PlotTwists = PlotTwists;
        this.ensambladores = ensambladores;
        
        this.gui = gui;
        
        initWorkers();
    }
    
    public void initWorkers(){
      
                for(int i = 0; i<this.guiones; i++){
                    Worker worker = new Worker(480, "guionistas", 0.34f, this.dia, this);
                    worker.start();
                    workers[i] = worker;
                }

                for(int i = 0; i<this.escenarios; i++){
                    Worker worker = new Worker(624, "escenarios", 0.34f, this.dia, this);
                    worker.start();
                    workers[i+this.guiones] = worker;
                }

                for(int i = 0; i<this.animadores; i++){
                    Worker worker = new Worker(960, "animadores", 2f, this.dia, this);
                    worker.start();
                    workers[i+this.guiones+this.escenarios] = worker;
                }

                for(int i = 0; i<this.doblajes; i++){
                    Worker worker = new Worker(384, "doblajes", 5f, this.dia, this);
                    worker.start();
                    workers[i+this.guiones+this.escenarios+this.animadores] = worker;
                }

                for(int i = 0; i<this.PlotTwists; i++){
                    Worker worker = new Worker(816, "PlotTwist", 0.5f, this.dia, this);
                    worker.start();
                    workers[i+this.guiones+this.escenarios+this.animadores+this.doblajes] = worker;
                }

                for(int i = 0; i<this.ensambladores; i++){
                    Worker worker = new Worker(1200, "ensamblador", 0.5f, this.dia, this);
                    worker.start();
                    workers[i+this.guiones+this.escenarios+this.animadores+this.doblajes+this.PlotTwists] = worker;
                }
                
            System.out.println("Workers creados "+this.name);
            ProjectManager pm = new ProjectManager(960, this.dia, this, this.gui);
            pm.start();
            Director director = new Director(1440, this.dia, this, this.gui);
            director.start();
        }        

    }





