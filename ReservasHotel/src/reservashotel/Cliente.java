/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservashotel;


public class Cliente {
  
    //Atributos
    public String Nombre;
    public String Apellido;
    public int DNI;
    
    //Método constructor
    
    public Cliente (String pNombre, String pApellido, int pDNI){
        
        Nombre = pNombre;
        Apellido =pApellido;
        DNI = pDNI;
    }
   //Para que haga el reotrno correctamente
    /* @Override
       public String toString(){
        
        return "nombre:"+Nombre"\nApellido:"+Apellido+"\DNI:"+DNI;
    }*/

    
    
    //Getters
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDNI() {
        return DNI;
    }
    
    //Setters
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
     

}
