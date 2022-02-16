/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservashotel;

import java.util.Date;
import javax.swing.JOptionPane;


public class Reservas {
    
    //Atributos
    private int NumReserva;
    public int FechaEntrada;
    private int FechaSalida;
    
    
    
    
    //Método constructor
    public Reservas (int pNumReserva, int i, int j){
        NumReserva = pNumReserva;
        FechaEntrada = i;
        FechaSalida = j;
    }
    
    //Getters
    public int getNumReserva (){
        return NumReserva;
    }
    public int getFechaEntrada (){
        return FechaEntrada;
    }
    public int getFechaSalida (){
        return FechaSalida;
    }
    
    //Setters
    public void setNumReserva(int NumReserva) {
        this.NumReserva = NumReserva;
    }

    public void setFechaEntrada(int FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public void setFechaSalida(int FechaSalida) {
        this.FechaSalida = FechaSalida;
    }
    //otros métodos
    public Reservas nuevaReserva(){
        
         
        Reservas NuevaReserva = new Reservas (1,1,1);
                       NuevaReserva.FechaEntrada = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la fecha de entrada con 4 dígitos, los 2 primeros para el mes y los dos segundos para el dia: 0000\n"));
                      
                       NuevaReserva.FechaSalida = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la fecha de salida con 4 dígitos, los 2 primeros para el mes y los dos segundos para el dia: 0000\n"));
                       
                       NuevaReserva.NumReserva = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de reserva"));
                       
                       
        return NuevaReserva; //Devolvemos la reserva para ser guardada en un array externo
    }
}
