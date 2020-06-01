package com.dezc.app.window;

import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.w3c.dom.events.MouseEvent;

public class MyFrame extends JFrame implements MouseListener{
	
	private JButton btn;
	
	private JTextField textField;
	
	public MyFrame() { 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setLayout(null);
		setVisible(true);
		
		this.btn = new JButton("Click Me!");
		this.textField = new JTextField();
		
		this.btn.setBounds(50, 200, 250, 100);
		this.textField.setBounds(50, 100, 160, 35);
		
		/*this.btn.setIcon(new ImageIcon("C://Users//damia//eclipse-workspace//AppColors//images//dollars.png")
				.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT));*/

		/// Escuchador para detectar movimientos del mouse sobre los componentes JTextField y JButton
		this.btn.addMouseListener(this);
		this.textField.addMouseListener(this);
		
		/// Esuchador para detectar el foco en el JTextField, es decir cuando se encuentra con el cursor activo dentro del input		
		this.textField.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
			
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(textField.getText().trim().isEmpty()) {
					btn.setBackground(Color.RED);
				}
			}
		});
		
		
		/// Escuchador para detectar pulsaciones en el teclado
		this.textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar(); // Obtenemos el valor de la tecla presionada (numero o letra)
				if(Character.isDigit(c) || Character.isAlphabetic(c)) { // Comparamos si se trata de un digito o una letra
					btn.setBackground(Color.GREEN); /// Activamos en verde nuestro boton
				}				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		add(this.btn);
		add(this.textField);

	}
	
	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		if(textField.getText().trim().isEmpty()) { /// Verificamos el valor del JTextField cada vez que salgamos del boton o incluso del mismo JtextField
			btn.setBackground(Color.RED);
		}
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
		if(textField.getText().trim().isEmpty()) {/// Verificamos el valor del JTextField cada vez que salgamos del boton o incluso del mismo JtextField
			btn.setBackground(Color.RED);
		}
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
