package me.thiagoafonso.exercicios;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercicio1 extends JFrame{
	
	JButton btnvoltar = new JButton("Voltar");
	JButton btniniciar = new JButton("Iniciar o exercicio");
	JLabel ldescricao = new JLabel();
	JLabel ltitulo = new JLabel("Exercicio 1");
	
	Font fex = new Font("Descrição do Execício", Font.PLAIN, 20);
	Font ftit = new Font("Título", Font.PLAIN, 30);
	
	public static void main(String[] args){
		Exercicio1 Ex1 = new Exercicio1();
	}
	
	public Exercicio1(){
		super("Exercício 1");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		ltitulo.setBounds(10, 0, 200, 100);
		ltitulo.setFont(ftit);
		paine.add(ltitulo);
		
		ldescricao.setBounds(100, 100, 300, 100);
		ldescricao.setText("<html>Este exercício tem como finalidade receber dois números e: Calcular a soma, diferença e o produto entre eles.</html>");
		ldescricao.setFont(fex);
		paine.add(ldescricao);
		
		btniniciar.setBounds(150, 250, 160, 30);
		paine.add(btniniciar);
		
		btnvoltar.setBounds(350, 350, 100, 30);
		paine.add(btnvoltar);
		btnvoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Exercicio1.this.dispose();
			}
		});
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
