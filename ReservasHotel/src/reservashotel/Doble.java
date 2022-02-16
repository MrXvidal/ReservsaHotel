/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservashotel;

public class Doble extends Habitacion{
    
    //Atributos
    public int M2;
    public int Precio;
    public String TipoCama;
    
    //Método constructor

    public Doble(int M2, int Precio, String TipoCama, int pNumero) {
        super(pNumero);
        this.M2 = M2;
        this.Precio = Precio;
        this.TipoCama = TipoCama;
    }
    
    
     //Getters
    public int getM2() {
        return M2;
    }

    public int getPrecio() {
        return Precio;
    }
    public String getTipoCama() {
        return TipoCama;
    }
    
    //Setters
    public void setM2(int M2) {
        this.M2 = M2;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setTipoCama(String TipoCama) {
        this.TipoCama = TipoCama;
    }
   
}
