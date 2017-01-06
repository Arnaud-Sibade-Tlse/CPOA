package com.action;

import com.Task.typeTask;

public class actionUnCheck implements action{

	@Override
	public String actionMessage() {
		String msg = "La tache est de nouveau incomplete";
		return msg;
	}

	@Override
	public void execute() throws Exception {
	}

}
