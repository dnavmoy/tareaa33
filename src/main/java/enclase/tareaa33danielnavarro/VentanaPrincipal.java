/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclase.tareaa33danielnavarro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class VentanaPrincipal extends JPanel{
    
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
       
    }
    
    
    private void initComponents(){
	this.etiqueta = new JFrame("Ventana Principal");
        this.etiqueta.setVisible(true);
        this.etiqueta.setLayout(new FlowLayout());
        this.etiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarLabel();
        
        
        
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
    
    private void iniciarLabel (){
        
        this.label1= new JLabel("cosa ");
        this.label1.setVisible(true);
        label1.setSize(50, 50);
        label1.setBackground(Color.red);
        this.label2= new JLabel("cosa2 ");
        label1.setSize(50, 50);
        label2.setBackground(Color.yellow);
        this.etiqueta.add(label1);
        this.etiqueta.add(label2);
        
        
    }
    
}


