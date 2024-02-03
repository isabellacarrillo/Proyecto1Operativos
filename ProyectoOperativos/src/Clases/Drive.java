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
    
    //Semaphores
    
    
    
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
    
}
