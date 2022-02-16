/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservashotel;


public class Suit extends Habitacion {
   //Atributos
    public int M2Dormitorio;
    public int M2Sala;
    public int Precio;
    
    //Método constructor

    public Suit(int M2Dormitorio, int M2Sala, int Precio, int pNumero) {
        super(pNumero);
        this.M2Dormitorio = M2Dormitorio;
        this.M2Sala = M2Sala;
        this.Precio = Precio;
    }
    
    
    //Getters
    public int getM2Dormitorio (){
        return M2Dormitorio;
    }
    
    public int getM2Sala (){
        return M2Sala;
    }
    
    public int getPrecio (){
        return Precio;
    }
    
    //Setters
    public void setM2Dormitorio(int M2Dormitorio) {
        this.M2Dormitorio = M2Dormitorio;
    }

    public void setM2Sala(int M2Sala) {
        this.M2Sala = M2Sala;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
     
}
