package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio7 extends JFrame{

	public static void main(String[] args){
		Exercicio7 Ex7 = new Exercicio7();
	}
	
	public Exercicio7(){
		super("Exercício 7");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}