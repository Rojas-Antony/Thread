package com.pp2;

public class TestTh extends Thread{
	private String nombre;
	private int retardo;
	
	public TestTh (String s, int d) {
		nombre = s;
		retardo =d;
	}
	
	public void run() {
		try {
			Thread.sleep(retardo);
		}catch (InterruptedException e) {
			System.out.println("Fin del hilo.");
		}
		System.out.println("Hola Mundo! " + nombre + "" + retardo);
	}
}
