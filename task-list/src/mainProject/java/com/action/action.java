package com.action;
//import 

import com.Task.typeTask;

public interface action {

	public String actionMessage();
	
	public void execute(typeTask tL) throws Exception;
}
