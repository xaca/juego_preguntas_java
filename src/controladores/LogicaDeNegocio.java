/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import modelo.Pregunta;
import modelo.ModeloPreguntas;

/**
 *
 * @author xaca
 */
public class LogicaDeNegocio {
    
    private JRootPane rootpane;
    private ModeloPreguntas mp;
    
    public LogicaDeNegocio(JRootPane rootpane){
        this.rootpane = rootpane;
        mp = new ModeloPreguntas();
        
    }
    
    public Pregunta banderaAleatoria(){
        return mp.banderaAleatoria();
    }
    
    public void reiniciarJuego(){
        mp.resetDatos();
    }
}
