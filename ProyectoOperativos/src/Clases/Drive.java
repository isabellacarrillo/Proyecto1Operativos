/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.concurrent.Semaphore;

/**
 *
 * @author isa
 *
 */
public class Drive {
    // Aqui como esto es area compartida los atributos son publicos creo
    public int scripts;
    public int scenarios;
    public int animations;
    public int dubbings;
    public int plotTwist;
   
    private final int maxScripts = 25 ;
    private final int maxScenarios = 20;
    private final int maxAnimations = 55;
    private final int maxDubbings = 35;
    private final int maxPlotTwist = 10; 
    
    
    //Los estados del director y PM se van a expresar de manera binaria
    //0- esta trabajando 1- esta vigilando
    private int directorStatus = 0;
    // 0- esta trabajando 1-esta viendo anime
    private int PMStatus = 0;
    
    private int salaryDiscount = 0;
    private int faltas = 0;
    
    //Semaphores
    private Semaphore daysMutex = new Semaphore(1);
    private Semaphore costMutex = new Semaphore(1);

    private int daysleftToRelease;

    
    
    public Drive(){
        this.scripts=0;
        this.scenarios=0;
        this.animations=0;
        this.dubbings=0;
        this.plotTwist=0;
    }
    
    public Drive(int scripts, int scenarios, int animations, int dubbings, int plotTwist){
        this.scripts=scripts;
        this.scenarios=scenarios;
        this.animations=animations;
        this.dubbings=dubbings;
        this.plotTwist=plotTwist;
    }
    
    public void addPart(int type, int part){
        
        switch (type){
            case 0: 
                if (scripts + part > maxScripts) {
                 scripts = maxScripts; 
                }
                else{
                scripts += part; 
                }
                break;
                
            case 1: 
                if (scenarios + part > maxScenarios) {
                 scenarios = maxScenarios; 
                }else{
                scenarios += part; 
                }
                break;
            case 2: 
                if (animations + part > maxAnimations) {
                 animations = maxAnimations; }
                else{
                animations += part; 
                }
                break;        
            case 3: 
                if (dubbings + part > maxDubbings) {
                 dubbings = maxDubbings; }
                else{
                dubbings += part; 
                }
                break;        
            case 4: 
                if (plotTwist + part > maxPlotTwist) {
                 plotTwist = maxPlotTwist; }
                else{
                plotTwist += part; 
                }
                break;   
            default:
            break;
                
             }
        
      
    }   

    /**
     * @return the directorStatus
     */
    public int getDirectorStatus() {
        return directorStatus;
    }

    /**
     * @param directorStatus the directorStatus to set
     */
    public void setDirectorStatus(int directorStatus) {
        this.directorStatus = directorStatus;
    }

    /**
     * @return the PMStatus
     */
    public int getPMStatus() {
        return PMStatus;
    }

    /**
     * @param PMStatus the PMStatus to set
     */
    public void setPMStatus(int PMStatus) {
        this.PMStatus = PMStatus;
    }

    /**
     * @return the salaryDiscount
     */
    public int getSalaryDiscount() {
        return salaryDiscount;
    }

    /**
     * @param salaryDiscount the salaryDiscount to set
     */
    public void setSalaryDiscount(int salaryDiscount) {
        this.salaryDiscount = salaryDiscount;
    }

    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    /**
     * @return the daysMutex
     */
    public Semaphore getDaysMutex() {
        return daysMutex;
    }

    /**
     * @param daysMutex the daysMutex to set
     */
    public void setDaysMutex(Semaphore daysMutex) {
        this.daysMutex = daysMutex;
    }

    /**
     * @return the costMutex
     */
    public Semaphore getCostMutex() {
        return costMutex;
    }

    /**
     * @param costMutex the costMutex to set
     */
    public void setCostMutex(Semaphore costMutex) {
        this.costMutex = costMutex;
    }

    /**
     * @return the daysleftToRelease
     */
    public int getDaysleftToRelease() {
        return daysleftToRelease;
    }

    /**
     * @param daysleftToRelease the daysleftToRelease to set
     */
    public void setDaysleftToRelease(int daysleftToRelease) {
        this.daysleftToRelease = daysleftToRelease;
    }

    

 
    
}
