package com.action;

import java.util.Scanner;

import com.Task.typeTask;

public class actionCheck implements action {

	@Override
	public String actionMessage() {
		String msg = "La tache est faite";
		return msg;
	}

	@Override
	public void execute() throws Exception {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("saisir l'ID de la tache a valider :");
	     
	}

}
