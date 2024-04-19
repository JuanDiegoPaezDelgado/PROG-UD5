package net.salesianos.gestor;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import net.salesianos.restaurante.Restaurante;

public class Gestor {
     private static ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();

     public static void agregarRestaurante() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del restaurante", "Nombre restaurante",
                JOptionPane.QUESTION_MESSAGE);
        String localizacion = JOptionPane.showInputDialog(null, "Ingrese la localizacion del restaurante",
                "Localizacion restaurante",
                JOptionPane.QUESTION_MESSAGE);
        String horario = JOptionPane.showInputDialog(null, "Ingrese el Horario del restaurante", "Horario restaurante",
                JOptionPane.QUESTION_MESSAGE);
        String puntuacionTexto = JOptionPane.showInputDialog(null, "Ingrese la puntuacion del restaurante",
                "Puntuacion restaurante",
                JOptionPane.QUESTION_MESSAGE);
        float puntuacion = Float.parseFloat(puntuacionTexto);
        Restaurante restaurante = new Restaurante(nombre, localizacion, horario, puntuacion);
        listaRestaurantes.add(restaurante);
        JOptionPane.showMessageDialog(null, "El restaurante ha agregado con éxito", "Agregacion exitosa",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
