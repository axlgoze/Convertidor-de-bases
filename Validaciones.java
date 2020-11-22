//Este programa valida las entradas por el usuario//
//BO base de origen//
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Validaciones{
private int mensaje=0;
public static int comprobar(int BO, int numero){
int mensaje=0;
 
 switch (BO){
  case 1: 
   //Sin sentencias
  mensaje=1;
  break;
  
  case 2: //binario//
   String binarioComoCadena = String.valueOf(numero);
   for (int i = 0; i < binarioComoCadena.length(); i++){
    char caracter = binarioComoCadena.charAt(i);
     if (caracter != '0' && caracter != '1'){
      mensaje=0;//NO VALIDO
     }else{
       mensaje=1;//VALIDO
     }
   }
  break;
  case 3: //ternario//
   // comprobar si solo tiene números del 0 al 2
   String ternarioComoCadena = String.valueOf(numero);
   String caracteresTernarios = "012";
   for (int i = 0; i < ternarioComoCadena.length(); i++) {
    char caracter = ternarioComoCadena.charAt(i);
    // Si no se encuentra dentro de los caracteres válidos, regresamos false
    if (caracteresTernarios.indexOf(caracter) == -1) {
     mensaje=0;//NO VALIDO
    }else
      mensaje=1;//VALIDO
   }
   break;
   case 4:
    // comprobar si solo tiene números del 0 al 3
    String cuaternarioComoCadena = String.valueOf(numero);
    String caracteresCuaternarios = "0123";
    for (int i = 0; i < cuaternarioComoCadena.length(); i++) {
     char caracter = cuaternarioComoCadena.charAt(i);
     // Si no se encuentra dentro de los caracteres válidos, regresamos false
     if (caracteresCuaternarios.indexOf(caracter) == -1) {
      mensaje=0;//NO VALIDO
     }else
       mensaje=1;//VALIDO
    }
   break;
   case 5:
    // comprobar si solo tiene números del 0 al 4
    String quinarioComoCadena = String.valueOf(numero);
    String caracteresQuinario = "01234";
    for (int i = 0; i < quinarioComoCadena.length(); i++) {
     char caracter = quinarioComoCadena.charAt(i);
     // Si no se encuentra dentro de los caracteres válidos, regresamos false
     if (caracteresQuinario.indexOf(caracter) == -1) {
      mensaje=0;//NO VALIDO
     }else
       mensaje=1;//VALIDO
    }
   break;
   case 6: //Hexal//
    // comprobar si solo tiene números del 0 al 5
    String hexalComoCadena = String.valueOf(numero);
    String caracteresHexal = "012345";
    for (int i = 0; i < hexalComoCadena.length(); i++) {
     char caracter = hexalComoCadena.charAt(i);
     // Si no se encuentra dentro de los caracteres válidos, regresamos false
     if (caracteresHexal.indexOf(caracter) == -1) {
      mensaje=0;//NO VALIDO
     }else
       mensaje=1;//VALIDO
    }
   break;
   case 7:
    
    // comprobar si solo tiene números del 0 al 6
    String septalComoCadena = String.valueOf(numero);
    String caracteresHeptal = "0123456";
    for (int i = 0; i < septalComoCadena.length(); i++) {
     char caracter = septalComoCadena.charAt(i);
     // Si no se encuentra dentro de los caracteres válidos, regresamos false
     if (caracteresHeptal.indexOf(caracter) == -1) {
      mensaje=0;//NO VALIDO
     }else
       mensaje=1;//VALIDO
    }
   break;
   case 8://Octal//
    String octalComoCadena = String.valueOf(numero);
    String caracteresOctal = "01234567";
    for (int i = 0; i < octalComoCadena.length(); i++) {
     char caracter = octalComoCadena.charAt(i);
     // Si no se encuentra dentro de los caracteres válidos, regresamos false
     if (caracteresOctal.indexOf(caracter) == -1) {
      mensaje=0;//NO VALIDO
     }else
       mensaje=1;//VALIDO
    } 
   break;
   case 9:
    // comprobar si solo tiene números del 0 al 8
    String nonarioComoCadena = String.valueOf(numero);
    String caracteresNonarios= "012345678";
    for (int i = 0; i < nonarioComoCadena.length(); i++) {
     char caracter = nonarioComoCadena.charAt(i);
     // Si no se encuentra dentro de los caracteres válidos, regresamos false
     if (caracteresNonarios.indexOf(caracter) == -1) {
      mensaje=0;//NO VALIDO
     }else
      mensaje=1;//VALIDO
    } 
   break;
   case 11: //Undecimal//
    // comprobar si solo tiene números del 0 al 9, A
    String undecimalComoCadena = String.valueOf(numero);
    String caracteresUndecimal= "0123456789A";
    for (int i = 0; i < undecimalComoCadena.length(); i++) {
     char caracter = undecimalComoCadena.charAt(i);
     // Si no se encuentra dentro de los caracteres válidos, regresamos false
     if (caracteresUndecimal.indexOf(caracter) == -1) {
      mensaje=0;//NO VALIDO
     }else
       mensaje=1;//VALIDO
    }
   break;
   case 12:
    // comprobar si solo tiene números del 0 al 9, AB
    String doudecimalComoCadena = String.valueOf(numero);
    String caracteresDuodecimal= "0123456789AB";
    for (int i = 0; i < doudecimalComoCadena.length(); i++) {
     char caracter = doudecimalComoCadena.charAt(i);
     // Si no se encuentra dentro de los caracteres válidos, regresamos false
     if (caracteresDuodecimal.indexOf(caracter) == -1) {
      mensaje=0;//NO VALIDO
     }else
       mensaje=1;//VALIDO
    }
  break;
  case 13:
   // comprobar si solo tiene números del 0 al 9, ABC
   String tridecimalComoCadena = String.valueOf(numero);
   String caracteresTridecimal= "0123456789ABC";
    for (int i = 0; i < tridecimalComoCadena.length(); i++) {
    char caracter = tridecimalComoCadena.charAt(i);
    // Si no se encuentra dentro de los caracteres válidos, regresamos false
    if (caracteresTridecimal.indexOf(caracter) == -1) {
     mensaje=0;//NO VALIDO
    }else
      mensaje=1;//VALIDO   
   }
  break;
  case 14:
   // comprobar si solo tiene números del 0 al 9, ABCD
   String tetradecimalComoCadena = String.valueOf(numero);
   String caracteresTetradecimal= "0123456789ABCD";
   for (int i = 0; i < tetradecimalComoCadena.length(); i++) {
    char caracter = tetradecimalComoCadena.charAt(i);
    // Si no se encuentra dentro de los caracteres válidos, regresamos false
    if (caracteresTetradecimal.indexOf(caracter) == -1) {
     mensaje=0;//NO VALIDO
    }else
      mensaje=1;//VALIDO   
   }
  break;
  case 15://Pentadecimal
   // comprobar si solo tiene números del 0 al 9, ABCDE
   String pentadecimalComoCadena = String.valueOf(numero);
   String caracteresPentadecimal= "0123456789ABCDE";
   for (int i = 0; i < pentadecimalComoCadena.length(); i++) {
    char caracter = pentadecimalComoCadena.charAt(i);
    // Si no se encuentra dentro de los caracteres válidos, regresamos false
    if (caracteresPentadecimal.indexOf(caracter) == -1) { 
     mensaje=0;//NO VALIDO
    }else
      mensaje=1;//VALIDO   
   }
  break;
  case 16:
   // comprobar si solo tiene números del 0 al 9, ABCDEF
   String hexadecimalComoCadena = String.valueOf(numero);
   String caracteresHexadecimal= "0123456789ABCDEF";
   for (int i = 0; i < hexadecimalComoCadena.length(); i++) {
    char caracter = hexadecimalComoCadena.charAt(i);
    // Si no se encuentra dentro de los caracteres válidos, regresamos false
    if (caracteresHexadecimal.indexOf(caracter) == -1) {
     mensaje=0;//NO VALIDO
     }else{
       mensaje=1;//VALIDO
     }
   }
  default:
  System.out.println("Opcion no valida");
 }//fin de switch
 return mensaje;
}//fin de metodo 
}//fin de clase