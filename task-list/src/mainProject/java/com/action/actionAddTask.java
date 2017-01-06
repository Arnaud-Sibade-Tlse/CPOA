package com.action;

import java.util.Scanner;

import com.Projet.Projet;
import com.Task.typeTask;

public class actionAddTask implements action{

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
	     System.out.println("Saisir la description du projet : ");
	     String desc = sc.nextLine();
	     
		
	}

}
