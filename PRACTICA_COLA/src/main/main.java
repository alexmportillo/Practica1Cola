package main;
import java.util.Scanner;
import models.*;
import java.util.List;
import java.util.LinkedList;
public class main {
	public static Cola Cola;
	public static <t> void main(String[] args) {
Scanner teclado= new Scanner(System.in);
do
{
	int num;
	
	System.out.println(" 1-Ingresar datos\n 2-Elimina datos\n 3-Observar tamaño\n 4-Vaciar Cola\n 5-Comprobar si está\n 6-Eliminar elemento del siguiente Array\n 7-Salir");
	System.out.println("Introduzca Opcion");
num=teclado.nextInt();
t elementos = null;
byte Opcion=0;
 if(num==1){
	 Opcion=1;
 }
 if(num==2){
	 Opcion=2;
 }
 if(num==3){
	 Opcion=3;
 }
 if(num==4){
	 Opcion=4;
 }
 if(num==5){
	 Opcion=5;
 }
 if(num==6){
	 Opcion=6;
 }
 if(num==7){
	 Opcion=7;
 }
 switch(Opcion)
 {
 
     case 1: 
	Cola.push(elementos);
     break;
     case 2: 
    	 Cola.remove();
     break;
     case 3: 
    	 Cola.size();
     break;
     case 4:
    	 Cola.clear();
     break;
     case 5:
    	 Cola.contains(elementos);
    	 break;
     case 6: 
    	Cola.pop();
     break;
     case 7: 
    	 System.exit(0);
     break;
     default: System.out.println("Error Opcion");
   break;
 }
}
while(true); //-- SEGUIRA HASTA QUE OPCION SEA IGUAL A 7
}
}


