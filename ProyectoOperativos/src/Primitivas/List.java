/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primitivas;

/**
 *
 * @author Admin
 */
public class List {
    private Node pFirst;
    private Node pLast;
    private int size;
    
    

    public List() { //Constructor 
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public List(Node pFirst, Node pLast, int size) {
        this.pFirst = pFirst;
        this.pLast = pLast;
        this.size = 0;
    }
    
    //Method to empty my list
    public void empty(){
        this.setpFirst(null); 
        this.setpLast(null);
        this.setSize(0);
           
    }
      //Method to check if my list is empty
    public boolean isEmpty(){
        return getpFirst() == null;
    }
    
    public void addAtTheEnd(Object data){ 
        Node nuevo = new Node (data);
        if (this.isEmpty()){
            this.setpFirst(nuevo);
            this.setpLast(nuevo);
        }else{
            this.getpLast().setpNext(nuevo);
            this.setpLast(nuevo);
        }this.setSize(this.getSize() + 1);
    }

    /**
     * @return the pFirst
     */
    public Node getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Node pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Node getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Node pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
