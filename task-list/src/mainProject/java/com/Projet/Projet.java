package com.Projet;

import java.util.ArrayList;

import com.Task.Taches;
import com.Task.typeTask;

public class Projet {
	public String nom;
	public  ArrayList<Taches>listTask;
	
	public Projet(){
		this.nom="";
		this.listTask=new ArrayList<Taches>();
	}
	
	public Projet(String nom){
		this.nom=nom;
		this.listTask=new ArrayList<Taches>();
	}
	
	
	public String getNom(){
		return nom;
	}
	
	public Taches getTask(long id){
		 Taches maTask;
		 for(int i=0;i<listTask.size();i++){
		  maTask = listTask.get(i);
		  if (id == maTask.getId()){
		   return maTask;
		  }
		 }
		 return null;
		}
	
	
	public ArrayList<Taches> getList(){	
		return listTask;
	}
	
	public void addTask(Taches nTask){
		if(this.getNom()==""){
			System.out.println("Impossible d'ajouter des tache a un projet sans nom ! \nVeuillez nommer votre projet");
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
