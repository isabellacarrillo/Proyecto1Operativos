/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
/**
 *
 * @author Admin
 */

public class Studio {
    //partes necesarias para hacer un episodio
  
    
    private float incomeFromEpisode;
    private float incomeFromEpisodePT;
    private int employees;
    
    private float scriptCosts = 20f;
    private float scenarioCosts = 26f;
    private float animationsCosts = 40f;
    private float dubbingsCosts = 16f;
    private float plotTwistCosts = 34f;
    private float PMcosts = 40f;
    private float DirectorCosts = 60f; 
    
    
    private float scriptsPerDay;
    private float animationsPerDay;
    private float scenariosPerDay;
    private float dubbingsPerDay;
    private float plotTwistsPerDay;
    
    
    
    public boolean canNickReleaseEpisode (int scripts,int scenarios, int dubbings, int animations ){
          return (scripts>= 2 && scenarios >= 1 && dubbings>= 4 && animations>= 4);
    }
     public boolean canNickReleaseEpisodePlotTwist (int scripts,int scenarios, int dubbings, int animations, int plotTwists ){
          return (scripts>= 2 && scenarios >= 1 && dubbings>= 4 && animations>= 4 && plotTwists >= 2);
    }
       public boolean canStarReleaseEpisode (int scripts,int scenarios, int dubbings, int animations ){
          return (scripts>= 2 && scenarios >= 3 && dubbings>= 6 && animations>= 4);
    }
        public boolean canStarReleaseEpisodePlotTwist (int scripts,int scenarios, int dubbings, int animations, int plotTwists ){
          return (scripts>= 2 && scenarios >= 3 && dubbings>= 6 && animations>= 4 && plotTwists >= 5);
    }

    /**
     * @return the incomeFromEpisode
     */
    public float getIncomeFromEpisode() {
        return incomeFromEpisode;
    }

    /**
     * @param incomeFromEpisode the incomeFromEpisode to set
     */
    public void setIncomeFromEpisode(float incomeFromEpisode) {
        this.incomeFromEpisode = incomeFromEpisode;
    }

    /**
     * @return the incomeFromEpisodePT
     */
    public float getIncomeFromEpisodePT() {
        return incomeFromEpisodePT;
    }

    /**
     * @param incomeFromEpisodePT the incomeFromEpisodePT to set
     */
    public void setIncomeFromEpisodePT(float incomeFromEpisodePT) {
        this.incomeFromEpisodePT = incomeFromEpisodePT;
    }

    /**
     * @return the employees
     */
    public int getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(int employees) {
        this.employees = employees;
    }

    /**
     * @return the scriptCosts
     */
    public float getScriptCosts() {
        return scriptCosts;
    }

    /**
     * @param scriptCosts the scriptCosts to set
     */
    public void setScriptCosts(float scriptCosts) {
        this.scriptCosts = scriptCosts;
    }

    /**
     * @return the scenarioCosts
     */
    public float getScenarioCosts() {
        return scenarioCosts;
    }

    /**
     * @param scenarioCosts the scenarioCosts to set
     */
    public void setScenarioCosts(float scenarioCosts) {
        this.scenarioCosts = scenarioCosts;
    }

    /**
     * @return the animationsCosts
     */
    public float getAnimationsCosts() {
        return animationsCosts;
    }

    /**
     * @param animationsCosts the animationsCosts to set
     */
    public void setAnimationsCosts(float animationsCosts) {
        this.animationsCosts = animationsCosts;
    }

    /**
     * @return the dubbingsCosts
     */
    public float getDubbingsCosts() {
        return dubbingsCosts;
    }

    /**
     * @param dubbingsCosts the dubbingsCosts to set
     */
    public void setDubbingsCosts(float dubbingsCosts) {
        this.dubbingsCosts = dubbingsCosts;
    }

    /**
     * @return the plotTwistCosts
     */
    public float getPlotTwistCosts() {
        return plotTwistCosts;
    }

    /**
     * @param plotTwistCosts the plotTwistCosts to set
     */
    public void setPlotTwistCosts(float plotTwistCosts) {
        this.plotTwistCosts = plotTwistCosts;
    }

    /**
     * @return the PMcosts
     */
    public float getPMcosts() {
        return PMcosts;
    }

    /**
     * @param PMcosts the PMcosts to set
     */
    public void setPMcosts(float PMcosts) {
        this.PMcosts = PMcosts;
    }

    /**
     * @return the DirectorCosts
     */
    public float getDirectorCosts() {
        return DirectorCosts;
    }

    /**
     * @param DirectorCosts the DirectorCosts to set
     */
    public void setDirectorCosts(float DirectorCosts) {
        this.DirectorCosts = DirectorCosts;
    }

    /**
     * @return the scriptsPerDay
     */
    public float getScriptsPerDay() {
        return scriptsPerDay;
    }

    /**
     * @param scriptsPerDay the scriptsPerDay to set
     */
    public void setScriptsPerDay(float scriptsPerDay) {
        this.scriptsPerDay = scriptsPerDay;
    }

    /**
     * @return the animationsPerDay
     */
    public float getAnimationsPerDay() {
        return animationsPerDay;
    }

    /**
     * @param animationsPerDay the animationsPerDay to set
     */
    public void setAnimationsPerDay(float animationsPerDay) {
        this.animationsPerDay = animationsPerDay;
    }

    /**
     * @return the scenariosPerDay
     */
    public float getScenariosPerDay() {
        return scenariosPerDay;
    }

    /**
     * @param scenariosPerDay the scenariosPerDay to set
     */
    public void setScenariosPerDay(float scenariosPerDay) {
        this.scenariosPerDay = scenariosPerDay;
    }

    /**
     * @return the dubbingsPerDay
     */
    public float getDubbingsPerDay() {
        return dubbingsPerDay;
    }

    /**
     * @param dubbingsPerDay the dubbingsPerDay to set
     */
    public void setDubbingsPerDay(float dubbingsPerDay) {
        this.dubbingsPerDay = dubbingsPerDay;
    }

    /**
     * @return the plotTwistsPerDay
     */
    public float getPlotTwistsPerDay() {
        return plotTwistsPerDay;
    }

    /**
     * @param plotTwistsPerDay the plotTwistsPerDay to set
     */
    public void setPlotTwistsPerDay(float plotTwistsPerDay) {
        this.plotTwistsPerDay = plotTwistsPerDay;
    }
    
    
  
    
}
