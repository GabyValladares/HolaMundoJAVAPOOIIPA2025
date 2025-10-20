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
    public String nombre;
    public String tipo;
    public double valor;
    

    public void sumar(Numero n2) {
        //suma=n1+n2
        double suma = this.valor + n2.valor;
        System.out.println("La suma es:"+suma);
    }
    
   
}
