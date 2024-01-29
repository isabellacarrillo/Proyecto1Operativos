/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

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
    
        public Drive(int scripts){
        this.scripts=0;
    }
    
    public void addScripts(int type){
        if (type == 0){
            this.scripts += 1;
            System.out.println("Guiones en Drive:" + this.scripts);
        
        }
    }   
    
    public void addScenarios(int type){
        if (type == 1){
            this.scenarios += 1;
            System.out.println("Escenarios en Drive:" + this.scenarios);
        
        }
    }
    
    public Drive(){
        this.animations=0;
    }
    
    public void addAnimations(int type){
        if (type == 2){
            this.animations += 1;
            System.out.println("Animaciones en Drive:" + this.animations);
        
        }
    }
    
     public void addDubbings(int type){
        if (type == 3){
            this.dubbings += 1;
            System.out.println("Doblajes en Drive:" + this.dubbings);
        
        }
    }
     
      public void addPlotTwist(int type){
        if (type == 4){
            this.plotTwist += 1;
            System.out.println("Plot Twists en Drive:" + this.plotTwist);
        
        }
    }
    
}
