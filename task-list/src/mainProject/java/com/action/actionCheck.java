package com.action;

import java.util.Scanner;

import com.Projet.Projet;
import com.Task.typeTask;

import defaut.main;

public class actionCheck implements action {

	@Override
	public String actionMessage() {
		String msg = "Valider une tache";
		return msg;
	}

	@Override
	public void execute() throws Exception {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("saisir le projet concerne :");
	     String nomP = sc.nextLine();
	     System.out.println("saisir l'ID de la tache a valider :");
	     long id = sc.nextLong();
	     Projet projet = main.liste.getProjet(nomP); 
	     typeTask tache = projet.getTask(id);
	     tache.setDone(true);
	     System.out.println("La tache a ete valide");
	     
	     
	}

}
