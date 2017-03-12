package fr.fgp.controller;

import java.util.ResourceBundle;

public class Controller {
	public Controller() {
	}
	public int somme(int a, int b){
		return a+b;
	}
	public static String getLibille(){
		String result = null;
		ResourceBundle resourceBundle = ResourceBundle.getBundle("application");
		resourceBundle.getString("socketServer.host");
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getLibille());
	}
}
