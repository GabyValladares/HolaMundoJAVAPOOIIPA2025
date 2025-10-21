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

    //1.ATRIBUTOS 
    private String nombre;
    private String tipo;
    private double valor;

    //2. MÉTODOS
    //a)Constructor Vacío: permite elegir que datos/atributos inicializar    
    Numero() {
    }

    //b)Constructor Argumentos:obliga a inicializar los atributos listados en el argumento del método
    Numero(String nombre, String tipo, double valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }

    //c)Métodos de Encapsulamiento
    //set-Escribe-Sobreescribe-Inicializa
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //get-Consultar-leer-obtener
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
//Métodos de Lógica de Negocios
    public void sumar(Numero n2) {
        //suma=n1+n2
        double suma = this.valor + n2.valor;
        System.out.println("La suma es:" + suma);
    }
    public void imprimir(){
        System.out.println("Nombre:"+getNombre()+"\n"+
                "Tipo:"+tipo+"\n"+
                "Valor:"+this.valor);
    }
}
