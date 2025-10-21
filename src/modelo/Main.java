/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Main {
    //Llamar al interprete del lenguaje psvm+tab
    public static void main(String[] args) {
       //ESTRUCTURA 
        int num1=9;
        int num2=2;
        
        int suma=num1+num2;
        //POO
        //Instanciar un Objeto
        Numero n1=new Numero("Número 1", "Entero", 8);
        //Cuando los atributos public
//        n1.nombre="Número 1";
//        n1.tipo="Entero";
//        n1.valor=8;
//Cuando los atributos son private
          
        Numero n2=new Numero();
        n2.setValor(12);
        //nuevo objeto de tipo Numero
        //el objeto se llama casa 
        n1.sumar(n2);
        Numero casa=new Numero();
        casa.setNombre("Número 3");
        casa.setTipo("Decimal");
        casa.setValor(3.3);
        casa.sumar(n2);
        casa.imprimir();
        
        
    }
    
}
