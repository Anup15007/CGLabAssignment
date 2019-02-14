package com.cg.lambdaexp.client;
import com.cg.lambdaexp.interfaces.FunctionalInterfaceAuthentication;
import com.cg.lambdaexp.interfaces.FunctionalInterfacePower;
import com.cg.lambdaexp.interfaces.FunctionalInterfaceSpacing;
public class LambdaMainClass {
	public static void main(String[] args) {
		FunctionalInterfacePower powerObj = (a,b)->(int)Math.pow(a,b);
		FunctionalInterfaceSpacing spacingObj = (str)->{
			String ans="";
			for(int i=0; i<str.length(); i++)
				ans=ans+str.charAt(i)+" ";
			return ans;
		};
		FunctionalInterfaceAuthentication authinticationObj=(usr,pwd)->{
			if((usr.equals("Virat") && pwd.equals("Password@123")))
				return true; 
			else 
				return false;
		};
		System.out.println(powerObj.power(10, 2));
		System.out.println(spacingObj.spacing("CAP"));
		System.out.println(authinticationObj.authenticateUser("Virat", "Password@123"));
	}
}
