/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author xaca
 */
public class Pregunta {

    private String rutaImagen;
    private String pregunta;
    private String[] respuestas;
    private int correcta;
    
    public Pregunta(){
        
    }
    public Pregunta(String ruta,String pregunta,String[] respuestas,int correcta){
        this.rutaImagen = ruta;
        this.pregunta = pregunta;
        this.respuestas = respuestas;
        this.correcta = correcta;
    }
    /**
     * @return the ruta
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @return the respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * @return the correcta
     */
    public int getCorrecta() {
        return correcta;
    }
}
