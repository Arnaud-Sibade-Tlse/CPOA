package com.action;

import java.util.Scanner;

import com.Projet.ListProjet;
import com.Projet.Projet;
import com.Task.Taches;
import com.Task.typeTask;

import defaut.main;

public class actionAddSubTask implements action{
	
	private int nbSubTache=0;

	@Override
	public String actionMessage() {
		String msg = "Ajout d'une sous tache";
		return msg;
	}

	@Override
	public void execute() throws Exception {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Saisir le nom du projet associe : ");
	     String nomP=sc.nextLine();
	     System.out.println("Saisir l'ID de la tache associe : ");
	     long idt=sc.nextLong();
	     /*System.out.println("Saisir la description de la tache : ");
	     String desc=sc.nextLine();*/
	     
	     Projet project = main.liste.getProjet(nomP);
	     if(project==null){
	    	 System.out.println("ERREUR le projet n'existe pas");
	     }else{
	    	 if(project.getTask(idt)==null){
		    	 System.out.println("ERREUR la tache n'existe pas");
		     }else{
			     Taches newSubTache = new Taches("Je suis une fleur",nbSubTache);
			     Taches temp = project.getTask(idt);
			     temp.addSousTache(newSubTache);
			     nbSubTache++;
			     System.out.println("La sous tache a bien ete ajoute");
	     }
	}
	}
}
	
