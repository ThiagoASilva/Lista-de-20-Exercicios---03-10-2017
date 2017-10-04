package me.thiagoafonso.exercicios;

import java.awt.Container;
import javax.swing.JFrame;

public class Exercicio15 extends JFrame{

	public static void main(String[] args){
		Exercicio15 Ex15 = new Exercicio15();
	}
	
	public Exercicio15(){
		super("Exercício 15");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}