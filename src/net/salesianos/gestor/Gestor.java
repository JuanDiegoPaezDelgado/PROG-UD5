package net.salesianos.gestor;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import net.salesianos.restaurante.Restaurante;

public class Gestor {
        private static ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();

        public static void agregarRestaurante() {
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del restaurante",
                                "Nombre restaurante",
                                JOptionPane.QUESTION_MESSAGE);
              
                String localizacion = JOptionPane.showInputDialog(null, "Ingrese la localizacion del restaurante",
                                "Localizacion restaurante",
                                JOptionPane.QUESTION_MESSAGE);
                String horario = JOptionPane.showInputDialog(null, "Ingrese el Horario del restaurante",
                                "Horario restaurante",
                                JOptionPane.QUESTION_MESSAGE);
                String puntuacionTexto = JOptionPane.showInputDialog(null, "Ingrese la puntuacion del restaurante",
                                "Puntuacion restaurante",
                                JOptionPane.QUESTION_MESSAGE);
                float puntuacion = Float.parseFloat(puntuacionTexto);

                if (puntuacion < 0 || puntuacion > 10) {
                        JOptionPane.showMessageDialog(null,
                                        "Ingrese un número de puntuación válido (entre 0 y 10)",
                                        "Error de entrada",
                                        JOptionPane.ERROR_MESSAGE);
                        return;
                }
                Restaurante restaurante = new Restaurante(nombre, localizacion, horario, puntuacion);
                listaRestaurantes.add(restaurante);
                JOptionPane.showMessageDialog(null, "El restaurante ha agregado con éxito", "Agregacion exitosa",
                                JOptionPane.INFORMATION_MESSAGE);

        }

        public static void editarRestaurante() {
                String nombreAEditar = JOptionPane.showInputDialog(null, "Ingrese el nombre del restaurante a editar",
                                "Editar",
                                JOptionPane.QUESTION_MESSAGE);
                for (Restaurante restaurante : listaRestaurantes) {
                        if (restaurante.getNombre().equalsIgnoreCase(nombreAEditar)) {
                                String[] opciones = { "Nombre", "Localizacion", "Horario", "Puntuacion", "Todo" };

                                int opcion = JOptionPane.showOptionDialog(null, "Seleccione que desea editar :",
                                                "Edicion",
                                                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones,
                                                opciones[0]);

                                switch (opcion) {
                                        case 0:
                                                String nuevoNombre = JOptionPane.showInputDialog(null,
                                                                "Ingrese el nuevo nombre",
                                                                "Editar nombre", JOptionPane.QUESTION_MESSAGE);
                                                restaurante.setNombre(nuevoNombre);
                                                break;
                                        case 1:
                                                String nuevaLocalizacion = JOptionPane.showInputDialog(null,
                                                                "Ingrese la nueva localizacion",
                                                                "Editar localizacion", JOptionPane.QUESTION_MESSAGE);
                                                restaurante.setLocalizacion(nuevaLocalizacion);
                                                break;
                                        case 2:
                                                String nuevoHorario = JOptionPane.showInputDialog(null,
                                                                "Ingrese el nuevo Horario",
                                                                "Editar horario", JOptionPane.QUESTION_MESSAGE);
                                                restaurante.setHorario(nuevoHorario);
                                                break;
                                        case 3:
                                                String nuevaPuntuacionText = JOptionPane.showInputDialog(null,
                                                                "Ingrese la nueva puntuacion",
                                                                "Editar puntuacion", JOptionPane.QUESTION_MESSAGE);
                                                float nuevaPuntuacion = Float.parseFloat(nuevaPuntuacionText);
                                                restaurante.setPuntuacion(nuevaPuntuacion);
                                                break;
                                        case 4:
                                                String nuevoNombreTodo = JOptionPane.showInputDialog(null,
                                                                "Ingrese el nuevo nombre",
                                                                "Editar nombre", JOptionPane.QUESTION_MESSAGE);
                                                String nuevaLocalizacionTodo = JOptionPane.showInputDialog(null,
                                                                "Ingrese la nueva localizacion",
                                                                "Editar localizacion", JOptionPane.QUESTION_MESSAGE);
                                                String nuevoHorarioTodo = JOptionPane.showInputDialog(null,
                                                                "Ingrese el nuevo Horario",
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
                                                JOptionPane.showMessageDialog(null, "Opción no válida", "Error",
                                                                JOptionPane.ERROR_MESSAGE);
                                                break;
                                }
                                JOptionPane.showMessageDialog(null, "Restaurante editado con éxito", "Edición exitosa",
                                                JOptionPane.INFORMATION_MESSAGE);
                                return;
                        }
                        JOptionPane.showMessageDialog(null, "Restaurante no encontrado", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }

        public static void mostrarRestaurantes() {
                Collections.sort(listaRestaurantes, (r1, r2) -> Float.compare(r2.getPuntuacion(), r1.getPuntuacion()));

                String restauranteInfo = "------------------------------------------\n";
                for (Restaurante restaurante : listaRestaurantes) {
                        restauranteInfo += restaurante.toString() + "\n------------------------------------------\n";
                }
                JOptionPane.showMessageDialog(null, restauranteInfo, "Lista de Restaurantes",
                                JOptionPane.PLAIN_MESSAGE);
        }

        public static void borrarRestaurante() {
                String nombreABorrar = JOptionPane.showInputDialog("Ingrese el nombre del restaurante a eliminar:");
                for (Restaurante restaurante : listaRestaurantes) {
                        if (restaurante.getNombre().equalsIgnoreCase(nombreABorrar)) {
                                listaRestaurantes.remove(restaurante);
                                JOptionPane.showMessageDialog(null, "El restaurante fue eliminado correctamente",
                                                "Eliminacion exitosa",
                                                JOptionPane.INFORMATION_MESSAGE);
                                return;
                        }
                }
                JOptionPane.showMessageDialog(null, "Restaurante no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
