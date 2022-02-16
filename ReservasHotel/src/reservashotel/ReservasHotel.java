/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservashotel;


import javax.swing.JOptionPane;


public class ReservasHotel {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       int seleccion i;
       boolean dniRepetido;
       
      //Menú inicial
       do {
       seleccion = Integer.parseInt(JOptionPane.showInputDialog(""
               + "----------Menú----------\n"
               + "1.Nuevo cliente.\n"
               + "2.Datos de habitación.\n"
               + "3.Nueva reserva.\n"
               + "4.Listar habitaciones/tipo/período.\n"
               + "5.Listar reservas/período.\n"
               + "6.Listar reservas/cliente/período") );
        
       int i;
	switch (seleccion){
           
           case 1:
               
               //Entrada de Cliente
                         
                Cliente NuevoCliente = new Cliente("a","a",1);
    
                NuevoCliente.Nombre = JOptionPane.showInputDialog("Introduzca el nombre:");
        
                NuevoCliente.Apellido = JOptionPane.showInputDialog("Introduzca el Apellido:");
        
                NuevoCliente.DNI = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el DNI"));
               
                
                Cliente [] Clientes = {new Cliente(NuevoCliente.Nombre, NuevoCliente.Apellido, NuevoCliente.DNI)};//Guardamos el nuevo cliente en un array
                
                
                //Comprobación de que no se repiten DNI's
                i=0;
                dniRepetido = false;
                while (i<Clientes.length && dniRepetido == false){
                    if (Clientes[i-1].DNI == NuevoCliente.DNI){
                        dniRepetido = true;
                        JOptionPane.showMessageDialog(null,"Este DNI ya existe para otro cliente");                        
                    }
                    
                    i++;
                }
             
               break;
           
           case 2:
               
               //Entrada de Habitación
               
               int tipoHab;
               
               //Menú secundaio
               tipoHab= Integer.parseInt(JOptionPane.showInputDialog(""
                       + "*Eliga el tipo de habitación*\n"
                       + "1.Simple\n"
                       + "2.Doble\n"
                       + "3.Suit"));
               switch (tipoHab){
                   
                   case 1:
                       Simple NuevaSimple = new Simple (1,1,1);
                       NuevaSimple.Numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número"));
                      
                       NuevaSimple.M2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los M^2"));
                       
                       NuevaSimple.Precio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio"));
                       
                       Simple[] Simples = {new Simple (NuevaSimple.Numero, NuevaSimple.M2, NuevaSimple.Precio)};//Guardamos las hab. Simples en un array
                       
                       break;
                       
                   case 2:
                       Doble NuevaDoble = new Doble (1,1,"a",1);
                       NuevaDoble.Numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número"));
                      
                       NuevaDoble.M2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los M^2"));
                       
                       NuevaDoble.TipoCama = (JOptionPane.showInputDialog("Introduzca el tipo de cama"));
                       
                       NuevaDoble.Precio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio"));
                       
                       Doble[] Dobles = {new Doble (NuevaDoble.Numero, NuevaDoble.M2, NuevaDoble.TipoCama, NuevaDoble.Precio)};//Guardamos las hab. Dobles en un array
                       
                       break;
                       
                   case 3:
                       Suit NuevaSuit = new Suit (1,1,1,1);
                       NuevaSuit.Numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número"));
                      
                       NuevaSuit.M2Dormitorio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los M^2 del dormitorio"));
                       
                       NuevaSuit.M2Sala = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los M^2 de la sala"));
                       
                       NuevaSuit.Precio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el precio"));
                       
                       Suit[] Suits = {new Suit (NuevaSuit.Numero, NuevaSuit.M2Dormitorio, NuevaSuit.M2Sala, NuevaSuit.Precio)};//Guardamos las hab. Suit en un array
                       
                       break;
                   default: JOptionPane.showMessageDialog(null,"Este número no és una opción");
               }
               
               break;
           case 3:
               //Nueva Reserva
               JOptionPane.showMessageDialog(null,"*Nueva reserva*");
               Reservas ReservasGuardadas = new Reservas (1,1,1); //Vector externo al método que usamos para guardar el retorno
               
               Reservas NuevaReserva = new Reservas (1,1,1);
               
               ReservasGuardadas = NuevaReserva.nuevaReserva();//llamada al método
               
               
               break;
           case 4:
               //Listar habitaciones/tipo/período
               int tipoHabLista;
               int FechaIn, FechaOut;
               FechaIn = Integer.parseInt(JOptionPane.showInputDialog("*Introduzca una feecha de entrada:*\n");
               FechaOut = Integer.parseInt(JOptionPane.showInputDialog("*Introduzca una feecha de entrada:*\n");
               
               tipoHabLista= Integer.parseInt(JOptionPane.showInputDialog(""
                       + "*Habitaciones que quiere listar:*\n"
                       + "1.Simple\n"
                       + "2.Doble\n"
                       + "3.Suit"));
                       
                       switch (tipoHabLista){//No funciona ya que no podemos leer de los vectores donde hemos almacenado las habitaciones
                           case 1:
                               for(int j=0; i>=Simples.length;i++){
                                JOptionPane.showMessageDialog(null, Simples[i]);
                                   
                               }
                               break;
                            
                           case 2:
                               for(int j=0; i>=Dobles.length;i++){
                                JOptionPane.showMessageDialog(null, Dobles[i]);
                                   
                               }
                               break;
                               
                           case 3:
                               for(int j=0; i>=Suits.length;i++){
                                JOptionPane.showMessageDialog(null, Suits[i]);       
                               }
                               break;
                               default: JOptionPane.showMessageDialog(null,"Este número no és una opción");
                       }
               break;
           case 5:
               //Listar reservas/período.
               
               FechaIn = Integer.parseInt(JOptionPane.showInputDialog("*Introduzca una feecha de entrada:*\n");
               FechaOut = Integer.parseInt(JOptionPane.showInputDialog("*Introduzca una feecha de entrada:*\n");      
                       
                        for(int k=0; k>=ReservasGuardadas.length; k++){
                       
                            if ((FechaIn<ReservasGuardadas.FechaEntrada) && (ReservasGuardadas.FechaSalida<FechaOut){
                                JOptionPane.showMessageDialog(null, ReservasGuardadas[k]);
                            }
                        }
                       
           case 6:
               //Listar reservas/cliente/período
               //Nos ha faltado saber como relacionar clientes y reservas
               break;
               
           default: JOptionPane.showMessageDialog(null,"Este número no és una opción");
        }
       
        }while((0>=seleccion) && (seleccion>=7));//Si el usuario inserta un valor incorrecto vuelve al menú en lugar de terminar el programa
  
    }
    
}
