package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio13 extends JFrame{

	public static void main(String[] args){
		Exercicio13 Ex13 = new Exercicio13();
	}
	
	public Exercicio13(){
		super("Exercício 13");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}