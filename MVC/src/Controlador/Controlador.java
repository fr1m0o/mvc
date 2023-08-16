
package Controlador;

import Modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Vista;


public class Controlador implements ActionListener{

  private Vista view;
  private Modelo model;

    public Controlador(Vista view, Modelo model) {
    this.view=view;
    this.model=model;
    this.view.bton_resolver.addActionListener(this);
    
    
    }
    public void iniciar(){
    view.setTitle("MVC");
    view.setLocationRelativeTo(null);
    view.setVisible(true);
    
    }
    
   public void actionPerformed(ActionEvent e) {
     model.setNum1(Integer.parseInt(view.field_1.getText()));
     model.setNum2(Integer.parseInt(view.field_2.getText()));
     model.multiplicar();
     view.field_respuesta.setText(String.valueOf(model.getResultado()));
    } 
    
    
    
    
   
    
    
}
