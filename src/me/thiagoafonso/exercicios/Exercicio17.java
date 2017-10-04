package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio17 extends JFrame{

	public static void main(String[] args){
		Exercicio17 Ex17 = new Exercicio17();
	}
	
	public Exercicio17(){
		super("Exercício 17");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}