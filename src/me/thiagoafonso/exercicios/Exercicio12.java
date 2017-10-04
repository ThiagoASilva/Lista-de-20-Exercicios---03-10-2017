package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio12 extends JFrame{

	public static void main(String[] args){
		Exercicio12 Ex12 = new Exercicio12();
	}
	
	public Exercicio12(){
		super("Exercício 12");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}