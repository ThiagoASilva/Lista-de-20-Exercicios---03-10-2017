package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio18 extends JFrame{

	public static void main(String[] args){
		Exercicio18 Ex18 = new Exercicio18();
	}
	
	public Exercicio18(){
		super("Exercício 18");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}