package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio11 extends JFrame{

	public static void main(String[] args){
		Exercicio11 Ex11 = new Exercicio11();
	}
	
	public Exercicio11(){
		super("Exercício 11");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}