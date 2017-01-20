package com.action;

import com.Projet.ListProjet;
import com.Task.typeTask;

import defaut.main;

public class actionShow implements action{

	@Override
	public String actionMessage() {
		String msg = "Affichage des projets et des taches";
		return msg;
	}

	@Override
	public void execute() throws Exception {
		System.out.println(main.liste.toString());
	}

}
