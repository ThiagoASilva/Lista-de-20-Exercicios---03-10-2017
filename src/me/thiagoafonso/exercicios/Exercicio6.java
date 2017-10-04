package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio6 extends JFrame{

	public static void main(String[] args){
		Exercicio6 Ex6 = new Exercicio6();
	}
	
	public Exercicio6(){
		super("Exercício 6");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}