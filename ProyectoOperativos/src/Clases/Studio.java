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
    
    private int scriptCosts = 20;
    private int scenarioCosts = 26;
    private int animationsCosts = 40;
    private int dubbingsCosts = 16;
    private int plotTwistCosts = 34;
    private int ensambladoresCosts = 50;
    private int PMcosts = 40;
    private int DirectorCosts = 60; 
    
    
    private float scriptsPerDay;
    private float animationsPerDay;
    private float scenariosPerDay;
    private float dubbingsPerDay;
    private float plotTwistsPerDay;
    private float episodesPerDay;
    
    
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
    public int getScriptCosts() {
        return scriptCosts;
    }

    /**
     * @param scriptCosts the scriptCosts to set
     */
    public void setScriptCosts(int scriptCosts) {
        this.scriptCosts = scriptCosts;
    }

    /**
     * @return the scenarioCosts
     */
    public int getScenarioCosts() {
        return scenarioCosts;
    }

    /**
     * @param scenarioCosts the scenarioCosts to set
     */
    public void setScenarioCosts(int scenarioCosts) {
        this.scenarioCosts = scenarioCosts;
    }

    /**
     * @return the animationsCosts
     */
    public int getAnimationsCosts() {
        return animationsCosts;
    }

    /**
     * @param animationsCosts the animationsCosts to set
     */
    public void setAnimationsCosts(int animationsCosts) {
        this.animationsCosts = animationsCosts;
    }

    /**
     * @return the dubbingsCosts
     */
    public int getDubbingsCosts() {
        return dubbingsCosts;
    }

    /**
     * @param dubbingsCosts the dubbingsCosts to set
     */
    public void setDubbingsCosts(int dubbingsCosts) {
        this.dubbingsCosts = dubbingsCosts;
    }

    /**
     * @return the plotTwistCosts
     */
    public int getPlotTwistCosts() {
        return plotTwistCosts;
    }

    /**
     * @param plotTwistCosts the plotTwistCosts to set
     */
    public void setPlotTwistCosts(int plotTwistCosts) {
        this.plotTwistCosts = plotTwistCosts;
    }

    /**
     * @return the PMcosts
     */
    public int getPMcosts() {
        return PMcosts;
    }

    /**
     * @param PMcosts the PMcosts to set
     */
    public void setPMcosts(int PMcosts) {
        this.PMcosts = PMcosts;
    }

    /**
     * @return the DirectorCosts
     */
    public int getDirectorCosts() {
        return DirectorCosts;
    }

    /**
     * @param DirectorCosts the DirectorCosts to set
     */
    public void setDirectorCosts(int DirectorCosts) {
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

    /**
     * @return the ensambladoresCosts
     */
    public int getEnsambladoresCosts() {
        return ensambladoresCosts;
    }

    /**
     * @param ensambladoresCosts the ensambladoresCosts to set
     */
    public void setEnsambladoresCosts(int ensambladoresCosts) {
        this.ensambladoresCosts = ensambladoresCosts;
    }

    /**
     * @return the episodesPerDay
     */
    public float getEpisodesPerDay() {
        return episodesPerDay;
    }

    /**
     * @param episodesPerDay the episodesPerDay to set
     */
    public void setEpisodesPerDay(float episodesPerDay) {
        this.episodesPerDay = episodesPerDay;
    }
    
    
  
    
}
