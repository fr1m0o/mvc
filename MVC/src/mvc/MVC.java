package mvc;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

public class MVC {

    
    public static void main(String[] args) {
   Vista view= new Vista();
    Modelo mod= new Modelo();
   
   
  Controlador Controlador= new Controlador(view,mod);
   Controlador.iniciar();
 
    }
    
}
