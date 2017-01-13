package com.Projet;

import java.util.ArrayList;
import com.Task.typeTask;

public class Projet {
	public String nom;
	public ArrayList<typeTask>listTask=new ArrayList<typeTask>();
	
	public Projet(){
		this.nom="";
	}
	
	public Projet(String nom){
		this.nom=nom;
	}
	
	
	public String getNom(){
		return nom;
	}
	
	public ArrayList<typeTask> getList(){	
		return listTask;
	}
	
	public void addTask(typeTask nTask){
		if(this.getNom()==""){
			System.out.println("Impossible d'ajouter des tache a un prjet sans nom ! \nVeuillez nommer votre projet");
		} else {
			listTask.add(nTask);
		}
	}
	
	public String afficher(){
		String mesTaches = getNom();
		if(mesTaches!=""){
			mesTaches += "\n";
			for(int i = 0; i < listTask.size();i++){
				mesTaches+="	"+listTask.get(i).toString()+"\n";
			}
			mesTaches+="\n";
		}
		return mesTaches;
	}
}
