package me.thiagoafonso.exercicios;

import java.awt.Container;

import javax.swing.JFrame;

public class Exercicio2 extends JFrame{

	public static void main(String[] args){
		Exercicio1 Ex2 = new Exercicio1();
	}
	
	public Exercicio2(){
		super("Exercício 2");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}