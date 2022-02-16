package reservashotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class Hotel {
    
    //Atributos
    public String Nombre;
    public String Domicilio;
    public String Poblacion;
    public static HashMap<Date,List<Reservas>> listadoReservas = new HashMap<Date,List<Reservas>>();//OJO CANVIAR
    public static ArrayList<Simple> Simples = new ArrayList<Simple>();
    public static ArrayList<Doble> Dobles = new ArrayList<Doble>();
    public static ArrayList<Suit> Suits = new ArrayList<Suit>();
    
    //Método constructor
    public Hotel (String pNombre, String pDomicilio, String pPoblacion){
        Nombre = pNombre;
        Domicilio = pDomicilio;
        Poblacion = pPoblacion;
    }
    
    //Getters
    public String getNombre (){
        return Nombre;
    }
    public String getDomicilio(){
        return Domicilio;
    }
    public String getPoblacion(){
        return Poblacion;
    }
    
    //Setters
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }
    
    
}
