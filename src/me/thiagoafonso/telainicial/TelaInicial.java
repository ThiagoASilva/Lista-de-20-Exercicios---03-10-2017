package me.thiagoafonso.telainicial;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInicial extends JFrame{

	JLabel ltitulo = new JLabel("Lista de execícios");
	JLabel lex1 = new JLabel("Execício 1:");
	JLabel lex2 = new JLabel("Execício 2:");
	JLabel lex3 = new JLabel("Execício 3:");
	JLabel lex4 = new JLabel("Execício 4:");
	JLabel lex5 = new JLabel("Execício 5:");
	JLabel lex6 = new JLabel("Execício 6:");
	JLabel lex7 = new JLabel("Execício 7:");
	JLabel lex8 = new JLabel("Execício 8:");
	JLabel lex9 = new JLabel("Execício 9:");
	JLabel lex10 = new JLabel("Execício 10:");
	JLabel lex11 = new JLabel("Execício 11:");
	JLabel lex12 = new JLabel("Execício 12:");
	JLabel lex13 = new JLabel("Execício 13:");
	JLabel lex14 = new JLabel("Execício 14:");
	JLabel lex15 = new JLabel("Execício 15:");
	JLabel lex16 = new JLabel("Execício 16:");
	JLabel lex17 = new JLabel("Execício 17:");
	JLabel lex18 = new JLabel("Execício 18:");
	JLabel lex19 = new JLabel("Execício 19:");
	JLabel lex20 = new JLabel("Execício 20:");
	
	JButton btnvizu1 = new JButton("Vizualizar");
	JButton btnvizu2 = new JButton("Vizualizar");
	JButton btnvizu3 = new JButton("Vizualizar");
	JButton btnvizu4 = new JButton("Vizualizar");
	JButton btnvizu5 = new JButton("Vizualizar");
	JButton btnvizu6 = new JButton("Vizualizar");
	JButton btnvizu7 = new JButton("Vizualizar");
	JButton btnvizu8 = new JButton("Vizualizar");
	JButton btnvizu9 = new JButton("Vizualizar");
	JButton btnvizu10 = new JButton("Vizualizar");
	JButton btnvizu11 = new JButton("Vizualizar");
	JButton btnvizu12 = new JButton("Vizualizar");
	JButton btnvizu13 = new JButton("Vizualizar");
	JButton btnvizu14 = new JButton("Vizualizar");
	JButton btnvizu15 = new JButton("Vizualizar");
	JButton btnvizu16 = new JButton("Vizualizar");
	JButton btnvizu17 = new JButton("Vizualizar");
	JButton btnvizu18 = new JButton("Vizualizar");
	JButton btnvizu19 = new JButton("Vizualizar");
	JButton btnvizu20 = new JButton("Vizualizar");
	
	Font fex = new Font("LabelExercicio", Font.BOLD, 15);
	
	
	public static void main(String[] args){
		TelaInicial t = new TelaInicial();
	}
	
	public TelaInicial(){
		
		super("Lista de exercícios: Thiago Afonso Silva");
		Container paine = this.getContentPane();
		paine.setLayout(null);
				
		ltitulo.setBounds(30, 30, 500, 60);
		ltitulo.setFont(new Font("Dialog", Font.PLAIN, 60));
		paine.add(ltitulo);
		
		//Coluna 1
		
		lex1.setBounds(30, 120, 100, 30);
		lex1.setFont(fex);
		paine.add(lex1);
		
		btnvizu1.setBounds(140, 120, 100, 30);
		paine.add(btnvizu1);
		btnvizu1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				me.thiagoafonso.exercicios.Exercicio1 ex1 = new me.thiagoafonso.exercicios.Exercicio1();
				
				
			}
		});
		
		lex2.setBounds(30, 160, 100, 30);
		lex2.setFont(fex);
		paine.add(lex2);
		
		btnvizu2.setBounds(140, 160, 100, 30);
		paine.add(btnvizu2);
		btnvizu2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				me.thiagoafonso.exercicios.Exercicio2 ex2 = new me.thiagoafonso.exercicios.Exercicio2();
				
				
			}
		});
		
		lex3.setBounds(30, 200, 100, 30);
		lex3.setFont(fex);
		paine.add(lex3);
		
		btnvizu3.setBounds(140, 200, 100, 30);
		paine.add(btnvizu3);
		
		lex4.setBounds(30, 240, 100, 30);
		lex4.setFont(fex);
		paine.add(lex4);
		
		btnvizu4.setBounds(140, 240, 100, 30);
		paine.add(btnvizu4);
		
		lex5.setBounds(30, 280, 100, 30);
		lex5.setFont(fex);
		paine.add(lex5);
		
		btnvizu5.setBounds(140, 280, 100, 30);
		paine.add(btnvizu5);
		
		lex6.setBounds(30, 320, 100, 30);
		lex6.setFont(fex);
		paine.add(lex6);
		
		btnvizu6.setBounds(140, 320, 100, 30);
		paine.add(btnvizu6);
		
		lex7.setBounds(30, 360, 100, 30);
		lex7.setFont(fex);
		paine.add(lex7);
		
		btnvizu7.setBounds(140, 360, 100, 30);
		paine.add(btnvizu7);
		
		lex8.setBounds(30, 400, 100, 30);
		lex8.setFont(fex);
		paine.add(lex8);
		
		btnvizu8.setBounds(140, 400, 100, 30);
		paine.add(btnvizu8);
		
		lex9.setBounds(30, 440, 100, 30);
		lex9.setFont(fex);
		paine.add(lex9);
		
		btnvizu9.setBounds(140, 440, 100, 30);
		paine.add(btnvizu9);
		
		lex10.setBounds(30, 480, 100, 30);
		lex10.setFont(fex);
		paine.add(lex10);
		
		btnvizu10.setBounds(140, 480, 100, 30);
		paine.add(btnvizu10);
		
		// Coluna 2
		
		lex11.setBounds(330, 120, 100, 30);
		lex11.setFont(fex);
		paine.add(lex11);
		
		btnvizu11.setBounds(440, 120, 100, 30);
		paine.add(btnvizu11);
		
		lex12.setBounds(330, 160, 100, 30);
		lex12.setFont(fex);
		paine.add(lex12);
		
		btnvizu12.setBounds(440, 160, 100, 30);
		paine.add(btnvizu12);
		
		lex13.setBounds(330, 200, 100, 30);
		lex13.setFont(fex);
		paine.add(lex13);
		
		btnvizu13.setBounds(440, 200, 100, 30);
		paine.add(btnvizu13);
		
		lex14.setBounds(330, 240, 100, 30);
		lex14.setFont(fex);
		paine.add(lex14);
		
		btnvizu14.setBounds(440, 240, 100, 30);
		paine.add(btnvizu14);
		
		lex15.setBounds(330, 280, 100, 30);
		lex15.setFont(fex);
		paine.add(lex15);
		
		btnvizu15.setBounds(440, 280, 100, 30);
		paine.add(btnvizu15);
		
		lex16.setBounds(330, 320, 100, 30);
		lex16.setFont(fex);
		paine.add(lex16);
		
		btnvizu16.setBounds(440, 320, 100, 30);
		paine.add(btnvizu16);
		
		lex17.setBounds(330, 360, 100, 30);
		lex17.setFont(fex);
		paine.add(lex17);
		
		btnvizu17.setBounds(440, 360, 100, 30);
		paine.add(btnvizu17);
		
		lex18.setBounds(330, 400, 100, 30);
		lex18.setFont(fex);
		paine.add(lex18);
		
		btnvizu18.setBounds(440, 400, 100, 30);
		paine.add(btnvizu18);
		
		lex19.setBounds(330, 440, 100, 30);
		lex19.setFont(fex);
		paine.add(lex19);
		
		btnvizu19.setBounds(440, 440, 100, 30);
		paine.add(btnvizu19);
		
		lex20.setBounds(330, 480, 100, 30);
		lex20.setFont(fex);
		paine.add(lex20);
		
		btnvizu20.setBounds(440, 480, 100, 30);
		paine.add(btnvizu20);
		
		this.setSize(600, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
