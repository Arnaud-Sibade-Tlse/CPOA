package com.action;

import java.util.Scanner;

import com.Projet.ListProjet;
import com.Projet.Projet;
import com.Task.Taches;
import com.Task.typeTask;

import defaut.main;

public class actionAddTask implements action{
	
	int nbTache=0;

	@Override
	public String actionMessage() {
		String msg = "Ajout d'une tache";
		return msg;
	}

	@Override
	public void execute() throws Exception {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Saisir le nom du projet associe : ");
	     String nomP=sc.nextLine();
	     System.out.println("Saisir la description de la tache : ");
	     String desc = sc.nextLine();
	     
	     Projet project = main.liste.getProjet(nomP);
	     if(project==null){
	    	 System.out.println("ERREUR le projet n'existe pas");
	     }else{
	     Taches newTache = new Taches(desc,nbTache);
	     project.addTask(newTache);
	     nbTache++;
	     System.out.println("La tache a bien ete ajoute");
	     }
	}

}
