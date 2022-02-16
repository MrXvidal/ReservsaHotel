/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservashotel;


public class Simple extends Habitacion {
    //Atributos
    public int M2;
    public int Precio;
    
    //Método constructor

    public Simple(int M2, int Precio, int pNumero) {
        super(pNumero);
        this.M2 = M2;
        this.Precio = Precio;
    }
    
    
    //Getters
    public int getM2 (){
        return M2;
    }
    
    public int getPrecio (){
        return Precio;
    }
    
    //Setters
    public void setM2(int M2) {
        this.M2 = M2;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
}
