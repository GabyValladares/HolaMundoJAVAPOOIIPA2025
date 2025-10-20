/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author hp
 */
public class Numero {
    //1. ATRIBUTOS, a) Nivel visualización public,private,protected
    //public (visualizar desde cualquier clase)
    //private (visualiza solo en la propia clase
    //protected (visualiza en la propia clase+hijas (herencia))
    public String nombre;
    public String tipo;
    public double valor;
    
    //2. MÉTODOS DE LÓGICA DE NEGOCIO
    //SOBRECARGA : 2 MÉTODOS MISMO NOMBRE
    //a) retorna información/tipos de Datos u Objetos
    public String calcularParoImpar(String mensaje){
        //return almacenar el resultado en memoria RAM
        return mensaje;
    }
    //b) No retorna información/ Imprime en pantalla
    public void calcularParoImpar(int num){
        int num3;
        //imprimir en consola, sout+tab
        System.out.println("El resultado es:"+num);
    }

   //SUMA DE 2 NÚMEROS
    public void sumar(Numero n1){
        //Comentar en bloque/ctrl+alt+c
//        int n1=8;
//        int n2=12;
//        int resultado=n1+n2;
        double suma=valor+n1.valor;
        System.out.println("La suma es:"+suma);
    }
    
}
