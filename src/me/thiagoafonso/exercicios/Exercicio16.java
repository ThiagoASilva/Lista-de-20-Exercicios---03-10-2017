package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio16 extends JFrame{

	public static void main(String[] args){
		Exercicio16 Ex16 = new Exercicio16();
	}
	
	public Exercicio16(){
		super("Exercício 16");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}