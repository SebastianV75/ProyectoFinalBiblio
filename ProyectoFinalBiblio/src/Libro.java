/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Libro extends MaterialBibliografico {
    private int numeroPaginas;
    private String genero;

    // Constructor que utiliza super para inicializar atributos heredados
    public Libro(String titulo, String autor, int yearPublicacion, String editorial, String idioma, int numeroPaginas, String genero) {
        super(titulo, autor, yearPublicacion, editorial, idioma); // Llama al constructor de la clase base
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getDescripcion() {
        return "Libro: " + getTitulo() + " por " + getAutor() + ", género: " + genero + ", páginas: " + numeroPaginas;
    }
}

