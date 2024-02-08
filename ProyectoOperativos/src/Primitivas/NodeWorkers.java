/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primitivas;

import Clases.Worker;

/**
 *
 * @author Admin
 * @param <T>
 */
public class NodeWorkers{
    private Worker data;
    private NodeWorkers  pNext;

/**
 *
 * Constructors for the generic node 
 */    
    public NodeWorkers() {
        this.data = null;
        this.pNext = null;
    }

    public NodeWorkers(Worker elem) {
        this.data = elem;
        this.pNext = null;
    }

    /**
     * @return the data
     */
    public Worker getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Worker data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public NodeWorkers  getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodeWorkers  pNext) {
        this.pNext = pNext;
    }
    
}
