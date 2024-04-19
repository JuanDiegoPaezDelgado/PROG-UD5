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

    public static void editarRestaurante() {
        String nombreAEditar = JOptionPane.showInputDialog(null, "Ingrese el nombre del restaurante a editar", "Editar",
                JOptionPane.QUESTION_MESSAGE);
        for (Restaurante restaurante : listaRestaurantes) {
            if (restaurante.getNombre().equalsIgnoreCase(nombreAEditar)) {
                String[] opciones = { "Nombre", "Localizacion", "Horario", "Puntuacion", "Todo" };

                int opcion = JOptionPane.showOptionDialog(null, "Seleccione que desea editar :", "Edicion",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                switch (opcion) {
                    case 0:
                        String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre",
                                "Editar nombre", JOptionPane.QUESTION_MESSAGE);
                        restaurante.setNombre(nuevoNombre);
                        break;
                    case 1:
                        String nuevaLocalizacion = JOptionPane.showInputDialog(null, "Ingrese la nueva localizacion",
                                "Editar localizacion", JOptionPane.QUESTION_MESSAGE);
                        restaurante.setLocalizacion(nuevaLocalizacion);
                        break;
                    case 2:
                        String nuevoHorario = JOptionPane.showInputDialog(null, "Ingrese el nuevo Horario",
                                "Editar horario", JOptionPane.QUESTION_MESSAGE);
                        restaurante.setHorario(nuevoHorario);
                        break;
                    case 3:
                        String nuevaPuntuacionText = JOptionPane.showInputDialog(null, "Ingrese la nueva puntuacion",
                                "Editar puntuacion", JOptionPane.QUESTION_MESSAGE);
                        float nuevaPuntuacion = Float.parseFloat(nuevaPuntuacionText);
                        restaurante.setPuntuacion(nuevaPuntuacion);
                        break;
                    case 4:
                        String nuevoNombreTodo = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre",
                                "Editar nombre", JOptionPane.QUESTION_MESSAGE);
                        String nuevaLocalizacionTodo = JOptionPane.showInputDialog(null,
                                "Ingrese la nueva localizacion",
                                "Editar localizacion", JOptionPane.QUESTION_MESSAGE);
                        String nuevoHorarioTodo = JOptionPane.showInputDialog(null, "Ingrese el nuevo Horario",
                                "Editar horario", JOptionPane.QUESTION_MESSAGE);
                        String nuevaPuntuacionTextTodo = JOptionPane.showInputDialog(null,
                                "Ingrese la nueva puntuacion",
                                "Editar puntuacion", JOptionPane.QUESTION_MESSAGE);
                        float nuevaPuntuacionTodo = Float.parseFloat(nuevaPuntuacionTextTodo);

                        restaurante.setNombre(nuevoNombreTodo);
                        restaurante.setLocalizacion(nuevaLocalizacionTodo);
                        restaurante.setHorario(nuevoHorarioTodo);
                        restaurante.setPuntuacion(nuevaPuntuacionTodo);

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
                JOptionPane.showMessageDialog(null, "Restaurante editado con éxito", "Edición exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(null, "Restaurante no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
