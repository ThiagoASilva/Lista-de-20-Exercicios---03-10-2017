package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio5 extends JFrame{

	public static void main(String[] args){
		Exercicio5 Ex5 = new Exercicio5();
	}
	
	public Exercicio5(){
		super("Exercício 5");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}