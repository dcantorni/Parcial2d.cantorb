package presentacion;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.Parcial;

public class interfazGrafica extends JFrame implements ActionListener {
    private JTextField inputBase;
    private JTextField inputExponente;
    private JButton botonCalcular;
    private JLabel respuesta;
    
	public interfazGrafica() {
		
		this.setTitle("Calculadora Potencia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null); 
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        JPanel panelBase = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBase.add(new JLabel("Base:"));
        inputBase = new JTextField(20);
        panelBase.add(inputBase);
        this.add(panelBase);

        JPanel panelExponente = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelExponente.add(new JLabel("Exponente:"));
        inputExponente = new JTextField(20);
        panelExponente.add(inputExponente);
        this.add(panelExponente);
        
        respuesta = new JLabel("0");
        respuesta.setAlignmentX(CENTER_ALIGNMENT);
        this.add(Box.createVerticalStrut(10)); 
        this.add(respuesta);
        
        botonCalcular = new JButton("Calcular");
        botonCalcular.addActionListener(this);
        botonCalcular.setAlignmentX(CENTER_ALIGNMENT);
        this.add(Box.createVerticalStrut(10)); 
        this.add(botonCalcular);

        this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonCalcular) {
            Integer base = Integer.parseInt(inputBase.getText());
            Integer exponente = Integer.parseInt(inputExponente.getText());
            int resultado;
			try {
				resultado = Parcial.potencia(base, exponente);
				this.respuesta.setText(String.valueOf(resultado));
				System.out.println(resultado);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(this, JOptionPane.ERROR_MESSAGE);
			}
			

        }
		
	}
	public static void main(String[] args) {
		new interfazGrafica();
	}

}
