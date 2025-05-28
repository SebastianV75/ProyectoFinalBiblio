/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Suba
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Biblioteca {

    private List<MaterialBibliografico> inventario;

    public Biblioteca() {
        this.inventario = new ArrayList<>();
    }

    public void agregarMaterial(MaterialBibliografico material) {
        // Validación básica para evitar null
        if (material == null) {
            throw new DatosInvalidosException("No se puede agregar un material nulo.");
        }
        inventario.add(material);
        System.out.println("Material '" + material.getTitulo() + "' agregado al inventario.");
    }

    public MaterialBibliografico buscarMaterial(String titulo) {
        for (MaterialBibliografico material : inventario) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        throw new MaterialNoEncontradoException("El material con título '" + titulo + "' no fue encontrado.");
    }

    public void prestarMaterial(String titulo) {
        MaterialBibliografico material = buscarMaterial(titulo); // Puede lanzar MaterialNoEncontradoException
        if (material.getCantidad() > 0) {
            material.setCantidad(material.getCantidad() - 1);
            System.out.println("Se ha prestado una unidad de '" + material.getTitulo() + "'. Cantidad restante: " + material.getCantidad());
        } else {
            throw new DatosInvalidosException("No hay ejemplares disponibles para prestar de '" + titulo + "'."); //
        }
    }

    public void devolverMaterial(String titulo) {
        MaterialBibliografico material = buscarMaterial(titulo); // Puede lanzar MaterialNoEncontradoException
        material.setCantidad(material.getCantidad() + 1);
        System.out.println("Se ha devuelto una unidad de '" + material.getTitulo() + "'. Cantidad total: " + material.getCantidad());
    }

    public void obtenerInventario() {
        if (inventario == null) {
            throw new MaterialNoEncontradoException("Inventario vacio");
        }
        for (MaterialBibliografico mB : inventario) {
            JOptionPane.showMessageDialog(null, "Titulo: " + mB.getTitulo() + "\n" + "Autor: " + mB.getAutor() + "\n" + "Cantidad: " + mB.getCantidad() + "\n");
        }
    }
}
