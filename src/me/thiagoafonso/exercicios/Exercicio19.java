package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio19 extends JFrame{

	public static void main(String[] args){
		Exercicio19 Ex19 = new Exercicio19();
	}
	
	public Exercicio19(){
		super("Exercício 19");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}