package me.thiagoafonso.exercicios;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import me.thiagoafonso.exercicios.controller.ExerciciosController;

public class Exercicio1 extends JFrame{
	
	JButton btnvoltar = new JButton("Voltar");
	public JButton btniniciar = new JButton("Iniciar o exercicio");
	JLabel ldescricao = new JLabel();
	JLabel ltitulo = new JLabel("Exercicio 1");
	
	Font fex = new Font("Descri��o do Exec�cio", Font.PLAIN, 20);
	Font ftit = new Font("T�tulo", Font.PLAIN, 30);
	
	public static void main(String[] args){
		
	}
	
	public Exercicio1(ExerciciosController controler){
		super("Exerc�cio 1");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		ltitulo.setBounds(10, 0, 200, 100);
		ltitulo.setFont(ftit);
		paine.add(ltitulo);
		
		ldescricao.setBounds(100, 100, 300, 100);
		ldescricao.setText("<html>Este exerc�cio tem como finalidade receber dois n�meros e: Calcular a soma, diferen�a e o produto entre eles.</html>");
		ldescricao.setFont(fex);
		paine.add(ldescricao);
		
		btniniciar.setBounds(150, 250, 160, 30);
		paine.add(btniniciar);
		btniniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btniniciar.setEnabled(false);
				controler.iniciar();
			}
		});
		
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
