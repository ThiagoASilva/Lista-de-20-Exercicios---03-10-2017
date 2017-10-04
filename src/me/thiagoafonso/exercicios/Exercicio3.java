package me.thiagoafonso.exercicios;

import java.awt.Container;

import javax.swing.JFrame;

public class Exercicio3 extends JFrame{

	public static void main(String[] args){
		Exercicio3 Ex3 = new Exercicio3();
	}
	
	public Exercicio3(){
		super("Exercício 3");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}