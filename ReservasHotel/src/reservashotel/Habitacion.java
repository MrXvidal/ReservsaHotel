/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservashotel;


public class Habitacion {
    
    //Atributos
    public int Numero;

  
    //Método constructor
    public Habitacion (int pNumero){
        Numero = pNumero;
    }
    
    //Getters
    public int getNumero() {
        return Numero;
    }
    
    //Setters
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
}
