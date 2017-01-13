package com.Task;

import java.util.ArrayList;

public abstract class typeTask {
	protected long id;
	protected String description;
	boolean done;
	ArrayList<typeTask> sousTache = new ArrayList<typeTask>();
   
    /*
     * Retourne l'id de la task
     */
    public long getId() {
        return id;
    }
    
    /*
     * Retourne la description de la task
     */
    public String getDescription() {
        return description;
    }
    
    /*
     * Retourne letat du boolean "done"
     */
    public boolean isDone() {
        return done;
    }

    /*
     * Modifie la variable "done"
     */
    public void setDone(boolean done) {
        this.done = done;
    }
    
    /*
     * permet dajouter une sous tache a une tache
     * 
     */
    public void addSousTache(){
    	//TODO
    }
    
    /*
     * Retourne la liste des sous taches
     */
    public ArrayList<typeTask> getSousTache(){
    	//TODO
    	return sousTache;
    }
    
    public String toString(){
    	String maTache = "";
    	maTache+="[";
    	if(done==true){ maTache += "x"; }
    	else { maTache += " ";}
    	maTache+="] "+getId()+" : "+getDescription();
    	return maTache;
    }
}
	
	

