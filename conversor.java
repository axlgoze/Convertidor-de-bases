//conversor de proyecto 2d//
import java.math.BigInteger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class conversor extends JFrame implements ActionListener{
private JMenuBar barramenu;
private JMenu opciones;
private JMenuItem r,a,s;
private JLabel Resultado,bo,bd,in;
private JComboBox<String> combo1,combo2;
private JTextField a1,a2; 
private JButton b1,b2;

public conversor(){
setLayout(null);
//nav//
barramenu=new JMenuBar();
setJMenuBar(barramenu);
opciones=new JMenu("Opciones");
barramenu.add(opciones);
r=new JMenuItem("Regresar");
s=new JMenuItem("Salir");
a=new JMenuItem("Ayuda");
opciones.add(r);
opciones.add(a);
opciones.add(s);
r.addActionListener(this);
a.addActionListener(this);
s.addActionListener(this);

Resultado=new JLabel("");
add(Resultado);
Resultado.setBounds(45,10,500,100);
bo=new JLabel("Base origen");
bd=new JLabel("Base destino");
in=new JLabel("Ingresa tu n�mero");
add(bo);
add(bd);
add(in);
bo.setBounds(50,150,80,20);
bd.setBounds(50,280,80,20);
in.setBounds(300,150,150,20);

a1=new JTextField();
a2=new JTextField();
add(a1);
add(a2);
a1.setBounds(200,100,300,40);
a2.setBounds(200,230,300,40);


//comboBox//
combo1=new JComboBox<String>();
combo2=new JComboBox<String>();
combo1.setBounds(45,100,120,40);
combo2.setBounds(45,230,120,40);
add(combo1);
add(combo2);
combo1.addItem("2");
combo1.addItem("3");
combo1.addItem("4");
combo1.addItem("5");
combo1.addItem("6");
combo1.addItem("7");
combo1.addItem("8");
combo1.addItem("9)");
combo1.addItem("10");
combo1.addItem("11");
combo1.addItem("12");
combo1.addItem("13");
combo1.addItem("14");
combo1.addItem("15");
combo1.addItem("16");
//combo1.addItemListener(this);

combo2.addItem("2");
combo2.addItem("3");
combo2.addItem("4");
combo2.addItem("5");
combo2.addItem("6");
combo2.addItem("7");
combo2.addItem("8(octal)");
combo2.addItem("9");
combo2.addItem("10(Decimal)");
combo2.addItem("11");
combo2.addItem("12");
combo2.addItem("13");
combo2.addItem("14");
combo2.addItem("15");
combo2.addItem("16(Hexadecimal)");
//combo2.addItemListener(this);

//botones//
b1=new JButton("CONTINUAR");
b2=new JButton("BORRAR");
add(b1);
add(b2);
b1.setBounds(95,340,120,40);
b2.setBounds(395,340,120,40);
b1.addActionListener(this);
b2.addActionListener(this);

}


//metodo para los botones//
public void actionPerformed(ActionEvent e){

Container f=this.getContentPane();
 if(e.getSource()==r){
  setTitle("Regresar a portada");
  this.setVisible(false);
  portada p=new portada();
  p.setVisible(true);
  p.setBounds(0,0,640,480);
  p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  }
 if(e.getSource()==a){
  setTitle("Ir a manual de usuario");
  }
 if(e.getSource()==s){
  System.exit(0);
  }
 

 if(e.getSource()==b1){
  String seleccionado1=(String)combo1.getSelectedItem();
  int baseorigen=Integer.parseInt(seleccionado1);
  int x=Integer.parseInt(a1.getText());
  //Validaciones.comprobar(baseorigen,x);
  int mensaje=Validaciones.comprobar(baseorigen,x);
   
  if(mensaje==1){
   setTitle("VALIDO");
  }else{
    setTitle("NO VALIDO");
    JOptionPane.showMessageDialog(null,"NO VALIDO");
   }
  //a1.setText(seleccionado1);
  //a1.setText(String.valueOf(Validaciones.comprobar(seleccionado1)));
  
  //obtener comboBox 2//
  String seleccionado2=(String)combo2.getSelectedItem();
  //int basedestino=Integer.parseInt(seleccionado2);
  //String binario=Integer.toBinaryString(x);
  
  //String octal=Integer.toOctalString(binario);
  //a2.setText(octal);
  
  //a2.setText(Validaciones.comprobar(basedestino));
  
  
  //String validar=a1.getText();
  //Validaciones.comprobar(validar,seleccionado); 
  //setTitle(Validaciones.comprobar(validar, seleccionado));
  //setTitle(String.valueOf(x));
  //setTitle(Validaciones.validar(seleccionado));
  //setTitle(Testing.getHex(seleccionado));
  //a2.setText(Testing.getHex(seleccionado));
 }
 
 if(e.getSource()==b2){
  a1.setText("");
  a2.setText("");
  setTitle("");
 }

}





public static void main(String[]args){
conversor c=new conversor();
c.setVisible(true);
c.setBounds(0,0,640,480);
c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}