/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class Ventana extends JFrame implements ActionListener{
    
     JLabel numero,al,bl;
    JTextField a, b;
    JButton enviar;

    public Ventana(){
    configurarVentana();
    añadirComponentes();
    
    }

    private void configurarVentana() {
        setTitle("TCP 1.0");
            setSize(1000, 500);
            setLocationRelativeTo(null);
            setLayout(null);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    private void añadirComponentes() {
        
        //JLabel
        numero= new JLabel("Escibe un numero:");
        numero.setBounds(100, 100, 200, 50);
        add(numero);
        
        al = new JLabel("Numero del primer termino");
        al.setBounds(150, 150, 200, 50);
        add(al);
        bl = new JLabel("Numero del segundo termino");
        bl.setBounds(150, 250, 200, 50);
        add(bl);
        
        //JButton     
        
        
        enviar = new JButton("Enviar");
        enviar.setBounds(600, 150, 150, 50);
        add(enviar);
        enviar.addActionListener(this);
        enviar.setVisible(true);
        
        //JTextFiel
        //150, 250, 100, 50)
        
        a = new JTextField();
        a.setBounds(375, 300, 150, 50);
        a.addActionListener(this);
        add(a);
        a.setVisible(true);
        b = new JTextField();
        b.setBounds(375, 150, 150, 50);
        b.addActionListener(this);
        add(b);
        b.setVisible(true);
    }
    
    public boolean Valida(){
        int valida=0;
        String num=a.getText();
        int valida2=0;
        String num2=b.getText();
        boolean val=true;
        try
        {
            valida =Integer.parseInt(num);
            valida2 =Integer.parseInt(num2);

        }catch(Exception e){
       JOptionPane.showMessageDialog(this, "Escribe solo numeros");
       val=false;
        }
        return val;
    
    }

    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
         int resultado=0;
         int prueba=0;
    if(Valida()){
       String var;
       System.out.print("ok");
        if(e.getSource()==enviar){
                   System.out.print("ok2");

            cTCP obj= new cTCP();
          var= obj.operaciones(a.getText(), b.getText());
          JOptionPane.showMessageDialog(this, "Resultado " +var);
            
        }
    
    }
    
    }
}

