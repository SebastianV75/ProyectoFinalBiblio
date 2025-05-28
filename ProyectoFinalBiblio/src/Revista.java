/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Revista extends MaterialBibliografico {

    //Atributos
    private int numeroEdicion;
    private String mesPublicacion;

    // Constructor que utiliza super para inicializar atributos heredados
    public Revista(String titulo, String autor, int cantidad, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, cantidad); // Llama al constructor de la clase base
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    //Getters y Setters
    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String getDescripcion() {
        return "Revista: " + getTitulo() + "\n" + "Autor: " + getAutor() + "\n" + "Numero de edicion: " + numeroEdicion + "\n" + "Mes de publicacion: " + mesPublicacion;
    }
}
