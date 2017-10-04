package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio8 extends JFrame{

	public static void main(String[] args){
		Exercicio8 Ex8 = new Exercicio8();
	}
	
	public Exercicio8(){
		super("Exercício 8");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}