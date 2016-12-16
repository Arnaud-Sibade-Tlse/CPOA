package com.codurance.training.tasks;

/*
 * Construction d'un Objet Task
 */
public final class Task {
    private final long id;
    private final String description;
    private boolean done;
    
    /*
     * Constructeur de Task
     * @param long id
     * @param String description
     * @param boolean done
     */
    public Task(long id, String description, boolean done) {
        this.id = id;
        this.description = description;
        this.done = done;
    }
    
    /*
     * Retourne l'id de la tesk
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
}
