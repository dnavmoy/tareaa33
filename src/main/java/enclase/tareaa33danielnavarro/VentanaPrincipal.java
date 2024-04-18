/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclase.tareaa33danielnavarro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author daniel
 */
public class VentanaPrincipal extends JPanel implements ActionListener,MouseInputListener{
    
    private JFrame etiqueta;
    private int altura;
    private int anchura;
    private static int alturadef=200;
    private static int anchuradef=400;
    
    private JLabel label1,label2;
    private JButton boton1,boton2;
   
    
    public VentanaPrincipal() {
       initComponents();
       cambiarTam(alturadef, anchuradef);
       iniciarcomp();
    }
    
    
    private void initComponents(){
	this.etiqueta = new JFrame("Ventana Principal");
        this.etiqueta.setVisible(true);
        this.etiqueta.setLayout(new FlowLayout());
        this.etiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
	}	 
    
    
    

    private void cambiarTam(int altura, int anchura){
    //frame.setSize(anchura,altura);
    int posX, posY;
    
    Toolkit t = Toolkit.getDefaultToolkit();
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    System.out.println("Tu resolución es de " + screenSize.width + "x" + screenSize.height);
    
    
    posX=((screenSize.width)/2)-anchura/2;
    posY=(screenSize.height/2)-altura/2;
    this.etiqueta.setBounds(posX, posY, anchura, altura);
    
}
    
    private void iniciarcomp (){
        
        this.label1= new JLabel("etiqueta1 ");
        this.label2= new JLabel("etiqueta2");
        this.boton1= new JButton("Aleatorio");
        boton1.addActionListener(this);
        this.boton2= new JButton("Raton");
        boton2.addActionListener(this);
        boton2.addMouseListener(this);
        this.etiqueta.add(boton1);
        this.etiqueta.add(label1);
        this.etiqueta.add(boton2);
        this.etiqueta.add(label2);
        
        
    }
    
    
    private void pedirtexto(){
        String texto=JOptionPane.showInputDialog("introduce texto");
        label2.setText(texto);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
		
		Random r = new Random();
                if(ae.getSource() == boton1){
        	this.label1.setText(String.valueOf(r.nextInt(11)));
                }
                if(ae.getSource() == boton2){
        	pedirtexto();
                }
                
                               
    		
	}

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        boton2.setBackground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent e) {
            boton2.setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}


