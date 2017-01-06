package com.action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;

import com.Projet.Projet;
import com.Task.typeTask;

public class actionAddProject implements action {

	@Override
	public String actionMessage() {
		String msg = "Ajout d'un projet";
		return msg;
	}

	@Override
	public void execute() throws Exception {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Saisir le nom du projet");
	     String nom = sc.nextLine();
	     Projet newProjet = new Projet(nom);
	     
	}


	
}
