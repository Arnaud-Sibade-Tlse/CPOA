package com.Projet;

import java.util.ArrayList;


public class ListProjet {
	public ArrayList<Projet>listProjet=new ArrayList<Projet>();
	
	public void addProject(Projet project){
		listProjet.add(project);
	}
	
	public Projet getProjet(int index){
		return listProjet.get(index);
	}
	
	public String toString(){
		String maList = "";
		for(int i = 0; i<listProjet.size();i++){
			maList = listProjet.get(i).afficher()+"\n";
		}
		return maList;
	}
}
