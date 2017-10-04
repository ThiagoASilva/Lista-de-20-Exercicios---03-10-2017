package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio4 extends JFrame{

	public static void main(String[] args){
		Exercicio4 Ex4 = new Exercicio4();
	}
	
	public Exercicio4(){
		super("Exercício 4");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}