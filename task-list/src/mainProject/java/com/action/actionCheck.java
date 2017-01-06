package com.action;

import com.Task.typeTask;

public class actionCheck implements action {

	@Override
	public String actionMessage() {
		String msg = "La tache est faite";
		return msg;
	}

	@Override
	public void execute(typeTask tL) throws Exception {
		tL.setDone(true);
	}

}
