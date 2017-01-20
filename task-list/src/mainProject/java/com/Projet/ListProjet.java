package com.Projet;

import java.util.ArrayList;


public class ListProjet {
	public ArrayList<Projet>listProjet;
	
	public ListProjet(){
		this.listProjet = new ArrayList<Projet>();
	}
	
	public  void addProject(Projet project){
		listProjet.add(project);
	}
	
	public  Projet getProjet(int index){
		return listProjet.get(index);
	}
	
	public  Projet getProjet(String name){
		 Projet monPr;
		 for (int i=0; i < listProjet.size() ; i++){
		  monPr = listProjet.get(i);
		  if(monPr.getNom().equals(name)){
		   return monPr;
		  }
		 }
		 return null;	 
	}
	
	public String toString(){
		String maList = "";
		for(int i = 0; i<listProjet.size();i++){
			if (listProjet.get(i).getNom()==""){
				
			} else {
				maList += listProjet.get(i).afficher()+"\n";
			}
		}
		return maList;
	}
}
