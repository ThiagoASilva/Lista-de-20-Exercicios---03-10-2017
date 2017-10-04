package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio9 extends JFrame{

	public static void main(String[] args){
		Exercicio9 Ex9 = new Exercicio9();
	}
	
	public Exercicio9(){
		super("Exercício 9");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}