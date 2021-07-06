/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author xaca
 */
public class ModeloPreguntas {
    private ArrayList<Pregunta> banderas;
    private int contador_preguntas;
    
    public ModeloPreguntas(){
        banderas = new ArrayList<Pregunta>();
        banderas.add(new Pregunta(
                "Argentina-Flag-icon.png",
                "\"Hay que tener cuidado al elegir a los enemigos porque uno termina pareciéndose a ellos\"",
                new String[]{"Jorge Luis Borges","Quino","Julio Cortázar","Rodolfo Walsh"},
                0
        ));

        banderas.add(new Pregunta(
                "Brazil-Flag-icon.png",
                "\"Enseñar no es transferir conocimiento, es crear la posibilidad de producirlo\"",
                new String[]{"Paulo Coelho","Paulo Freire","Machado de Assis","Clarice Lispector"},
                1
        ));

        banderas.add(new Pregunta(
                "Canada-Flag-icon.png",
                "\"No sabes de lo que eres capaz hasta que tienes que hacerlo\"",
                new String[]{"Margaret Atwood","Charles Grant","Elissa Ambrose","Saul Bellow"},
                0
        ));
        
        banderas.add(new Pregunta(
                "Chile-Flag-icon.png",
                "\"La verdadera amistad resiste el tiempo, la distancia y el silencio\"",
                new String[]{"Roberto Bolaño","Gabriela Mistral","Isabel Allende","Pablo Neruda"},
                2
        ));
        
        banderas.add(new Pregunta(
                "Colombia-Flag-icon.png",
                "\"Recordar es fácil para el que tiene memoria. Olvidarse es difícil para quien tiene corazón\"",
                new String[]{"Rafael Pombo","Jorge Isaacs","Andrés Caicedo","Gabriel García Márquez"},
                3
        ));
        
        banderas.add(new Pregunta(
                "Jamaica-Flag-icon.png",
                "\"No vivas para que tu presencia se note, sino para que tu ausencia se sienta\"",
                new String[]{"Patrick Ewing","Bob Marley","Usain Bolt","Claude McKay"},
                1
        ));
        
        banderas.add(new Pregunta(
                "Mexico-Flag-icon.png",
                "\"Las emociones se viven, se sienten, se reconocen, pero sólo una parte de ellas se puede expresar en palabras o conceptos\"",
                new String[]{"Octavio Paz","Juan Rulfo","Laura Esquivel","Alfonso Reyes"},
                2
        ));
        
        banderas.add(new Pregunta(
                "Peru-Flag-icon.png",
                "\"Se escribe para llenar vacíos, para tomarse desquites contra la realidad, contra las circunstancias\"",
                new String[]{"Ciro Alegría","Mario Vargas Llosa","Oscar Malca","Oswaldo Reinoso"},
                1
        ));
        Collections.shuffle(banderas);
    }
    
    public Pregunta banderaAleatoria(){
        
        if(contador_preguntas<banderas.size())
        {
            return banderas.get(contador_preguntas++);
        }

        return null;
    }
    
    public void resetDatos(){
        contador_preguntas = 0;
        Collections.shuffle(banderas);
    }
}
