package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio14 extends JFrame{

	public static void main(String[] args){
		Exercicio14 Ex14 = new Exercicio14();
	}
	
	public Exercicio14(){
		super("Exercício 14");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}