package com.action;
//import 

import com.Task.typeTask;

public interface action <E> {

	public String actionMessage();
	
	public void execute() throws Exception;
}
