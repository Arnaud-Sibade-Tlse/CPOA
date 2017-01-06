package com.action;

public class actionUnCheck implements action{

	@Override
	public String actionMessage() {
		String msg = "La tache est de nouveau incomplete";
		return msg;
	}

	@Override
	public void execute(typeTask tL) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
