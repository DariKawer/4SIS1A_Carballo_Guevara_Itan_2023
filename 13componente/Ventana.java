import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
import static javax.swing.border.BevelBorder.LOWERED;
import static javax.swing.border.BevelBorder.RAISED;


public class Ventana extends JFrame implements ActionListener{
    
    
    //variables
    JLabel labeltitulo;
    private JPanel minpanelprincipal;
    private JPanel panelColor;
    private JButton botoncolor;
    private Color color;
    
    //constructor
    public Ventana(){
        //vamos a crear unos metodos para la carga
        iniciaComponentes();
        setTitle("Ventana de Colorcitos Wiiii");
        setSize(550, 540);
        //vamos a ponerla en el centro
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void iniciaComponentes() {
        minpanelprincipal = new JPanel();
        minpanelprincipal.setLayout(null);
        
        //propiedades de los label
        labeltitulo = new JLabel();
        labeltitulo.setFont(new java.awt.Font("Tahoma", 0, 28));
        labeltitulo.setHorizontalAlignment(CENTER);
        labeltitulo.setText("Componente JColorChooser");
        labeltitulo.setBorder(
                javax.swing.BorderFactory.createBevelBorder(RAISED));
        labeltitulo.setBounds(40, 20, 450, 40);
        
        //propiedades del panel 1
        componentesPanel1();
        
        //agregamos el boton
        botoncolor = new JButton();
        botoncolor.setText("Seleccionar un color");
        botoncolor.setBounds(190, 460, 150, 25);
        botoncolor.addActionListener(this);
        
        //agregamos los componentes restantes al contenedor
        minpanelprincipal.add(labeltitulo);
        minpanelprincipal.add(panelColor);
        minpanelprincipal.add(botoncolor);
        add(minpanelprincipal);
        
    }
    
    private void componentesPanel1() {
        panelColor = new JPanel();
        panelColor.setBounds(10, 80, 510, 350);
        panelColor.setBorder(BorderFactory.createBevelBorder(LOWERED));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        El siguiente codigo va a definir cuando se presione el boton entonces
        cree una instancia de la clase de JColorChooser y luego el color seleccionado
        se adigna a un objeto a la clase Color, por medio de un metodo
        showDialog, al cual se le asigna un titulo y color por defecto
        
        */
        
        if(e.getSource() == botoncolor){
            //definimos la nueva ventnaa
            color = JColorChooser.showDialog(
                    null, "Seleccione un color", Color.CYAN);
            //lo enviamos al fondo
            panelColor.setBackground(color);
        }
    }

}