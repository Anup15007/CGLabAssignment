package com.cg.eis.pl;

import com.cg.eis.service.Services;

public class EmpMain {

	public static void main(String[] args) 
	{
		Services serv = new Services();
		serv.putDetails();
		serv.showDetails();
	}

}
