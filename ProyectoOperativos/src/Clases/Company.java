/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Primitivas.ListWorkers;
/**
 *
 * @author Admin
 */
public class Company {
    
    private Studio studio;
    private Drive drive;
    private int employeesQuantity;
    private int opening;
    private ListWorkers [] employees = new ListWorkers [8]; //Los 8 son la cantidad de empleados que tenemos, el orden es el mismo que el que tenemos en el PDF del proyecto

public Company (int guionistas, int diseñadores, int animadores, int doblajes, int guionistasPT, int ensambladores, Drive drive, Studio studio){

      for (int i = 0; i < employees.length; i++) {
            employees[i] = new ListWorkers();
        }

        for (int i = 0; i < guionistas; i++) {
            Worker scriptWriters = Worker.startWorker(0, drive, drive.getWorkerMutex(), studio);
            employees[0].addtoList(scriptWriters);
        }
        
       for (int i = 0; i < diseñadores; i++) {
            Worker scenarioWorkers = Worker.startWorker(1, drive, drive.getWorkerMutex(), studio);
            employees[1].addtoList(scenarioWorkers);
        }
        for (int i = 0; i < animadores; i++) {
            Worker animationWriters = Worker.startWorker(2, drive, drive.getWorkerMutex(), studio);
            employees[2].addtoList(animationWriters);
        }
          for (int i = 0; i < doblajes; i++) {
            Worker dubbingWorkers = Worker.startWorker(3, drive, drive.getWorkerMutex(), studio);
            employees[3].addtoList(dubbingWorkers);
        }
          for (int i = 0; i < guionistasPT; i++) {
            Worker scriptPTWriters = Worker.startWorker(4, drive, drive.getWorkerMutex(), studio);
            employees[4].addtoList(scriptPTWriters);
        }
        
        for (int i = 0; i < ensambladores; i++) {
            Worker ensamblador = Worker.startWorker(5, drive, drive.getWorkerMutex(), studio);
            employees[5].addtoList(ensamblador);
        }
        
          
          Worker PM = Worker.startWorker(6, drive, drive.getWorkerMutex(), studio);
          employees[6].addtoList(PM);
          
         Worker director = Worker.startWorker(7, drive, drive.getWorkerMutex(), studio);
         employees[7].addtoList(director);
}




}




