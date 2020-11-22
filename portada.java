//portada de proyecto 2d//
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.event.*;
import java.awt.event.*;

public class portada extends JFrame implements ActionListener{
private JLabel IU,U;
private JLabel Materia;
private JLabel Nproyecto;
private JLabel Equipo;
private JLabel autor1,autor2,autor3,autor4,autor5;
private JButton b1;

public portada(){
setLayout(null);
IU=new JLabel("INSTITUTO POLITECNICO NACIONAL");
U=new JLabel("Unidad Profesional Interdisciplinaria de Ingeniería y Ciencias Sociales y Administrativas");
Materia=new JLabel("Programacion Orientada a Objetos");
Nproyecto=new JLabel("CONVERTIDOR DE BASES");
Equipo=new JLabel("EQUIPO N. 4");
autor1=new JLabel("Arreola Camargo Estefanía"); 
autor2=new JLabel("Franco Ferrer Carlos");
autor3=new JLabel("Manzano Nava Pablo Antonio");
autor4=new JLabel("Nieto Castro Rosalinda Jacqueline");
autor5=new JLabel("Reyes Flores Brayan Axel");
b1=new JButton("Continuar");
add(U);
add(IU);
add(Materia);
add(Nproyecto);
add(Equipo);
add(autor1);
add(autor2);
add(autor3);
add(autor4);
add(autor5);
add(b1);
b1.addActionListener(this);
b1.setLayout(null);
IU.setBounds(225,15,270,100);
U.setBounds(45,35,500,100);
Materia.setBounds(225,85,250,50);
Nproyecto.setBounds(245,125,250,50);
Equipo.setBounds(285,155,250,50);

autor1.setBounds(235,180,250,50);
autor2.setBounds(235,195,250,50);
autor3.setBounds(235,210,250,50);
autor4.setBounds(235,225,250,50);
autor5.setBounds(235,240,250,50);
b1.setBounds(247,298,145,75);//columna,fila,ancho,largo//
setTitle("Convertidor de bases");
}

public void actionPerformed(ActionEvent e){

if(e.getSource()==b1){
 this.setVisible(false);
 conversor v=new conversor();
 v.setVisible(true);
 v.setBounds(0,0,640,480);
 v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //System.exit(0);
} 
}
public static void main(String[]args){
portada p=new portada();
p.setVisible(true);
p.setBounds(0,0,640,480);//x,y,ancho,largo//
p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}