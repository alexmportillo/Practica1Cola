package models;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;
public class Cola<t> {
	private int MAX;
	private int PRINCIPIO;
    private int FINAL;
    private int[] elementos;
    
	//Constructo vacio
	public Cola(){
		this.FINAL=50;
		this.PRINCIPIO=0;
		this.FINAL=0;
		this.elementos=new int[this.FINAL+1];
		
	}
	//Reservar� memoria para un array de 0 T elemento.

	//Metodos
	
	public boolean ColaLlena(t elementos)
    {
        if(this.FINAL == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
	public void push(t elementos){
	
		if(this.ColaLlena(elementos))
        {
            System.out.println("LA COLA EST� LLENA");
        }
        else
        {
            int ITEM;
 
            ITEM = Integer.parseInt("INGRESE EL ITEM A AGREGAR");  
             
            this.FINAL++; 
            this.elementos[FINAL] = ITEM;
                        
        }
    }
	
	
	public void remove(){
		
		if(this.PRINCIPIO == this.FINAL)
        {
			
            System.out.println("LA COLA ESTA VACIA");
        }
        else
        {            
            for(int i=PRINCIPIO;i < FINAL - 1;i++)
            {
            	elementos[i] = elementos[i+1];
            }
             
            FINAL--;
        }
    }
	
	
		public void pop(){
			   if(!isEmpty())
				   PRINCIPIO=PRINCIPIO-1;
		        else{
		            System.out.println("No se puede la pila est� vacia");
		        }
		    }
		//Eliminar� del array el siguiente elemento de la cola. Evidentemente habr� que redimensionar el array al tama�o real.
		
	
	
		public void clear(){
			PRINCIPIO=0;
			FINAL=0;
		//Eliminar� del array todos los elementos y dejar� el array de tama�o 0.
		}
		public boolean contains(t elementos){
			String x = (String) elementos;
	        if (x.equals(elementos)) return true;
	        return false;
	}
		
	        
		//Devuelve true si el elemento est� en la colecci�n utilizando el equals de la clase T.
		
		
		public boolean isEmpty(){
			if(this.PRINCIPIO == this.FINAL)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
		
		public int size(){
			    return PRINCIPIO;
			  }
		//Devuelve el tama�o de la cola.
		}

