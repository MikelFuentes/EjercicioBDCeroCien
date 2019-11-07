package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Prin extends JPanel {
	public JTextArea area;
	public JButton aceptar;
	public JButton compra;
	
	
	public Prin() {
		area = new JTextArea();
		aceptar = new JButton("Aceptar");
		compra = new JButton("compra");
		
		
		setPreferredSize (new Dimension (750, 570));
		
		JPanel botonera = new JPanel();
		botonera.setLayout(new BorderLayout());
		
		setLayout(new BorderLayout());
		botonera.add(aceptar, BorderLayout.CENTER);
		botonera.add(compra, BorderLayout.CENTER);
		add(botonera, BorderLayout.SOUTH);
		
		add(new JScrollPane(area), BorderLayout.CENTER);
		
		
		compra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object [] cosas ={""}; 
				
				JOptionPane.showInputDialog(null,"Selecciona su compra", "Elegir",JOptionPane.QUESTION_MESSAGE,null,cosas, cosas[0]);
				
				
			}
		});
			
		
		
//		this.addWindowListerer( new WindowAdapter)){
//			
//		}
//		
}
		

	public static void main(String[] args) {
		JFrame frame = new JFrame("miniMazon");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Prin());
		frame.pack();
        frame.setVisible (true);
        //frame.setResizable(false);
	}

}
