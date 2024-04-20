package net.salesianos.menu;

import javax.swing.JOptionPane;

import net.salesianos.gestor.Gestor;

public class Menu {
    public static void mostrarMenu() {
        String[] options = { "Añadir restaurante", "Editar restaurante", "Mostrar restaurantes", "Eliminar restaurante",
                "Salir del programa" };
        int opcion;

        do {
            String choiceString = (String) JOptionPane.showInputDialog(null, "Seleccione una opción:", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            opcion = -1;
            for (int i = 0; i < options.length; i++) {
                if (options[i].equals(choiceString)) {
                    opcion = i;
                    break;
                }
            }
            switch (opcion) {
                case 0:
                    try {
                        Gestor.agregarRestaurante();
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido para la puntuación",
                                "Error de entrada",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    break;
                case 1:
                    try {
                        Gestor.editarRestaurante();
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido para la puntuación",
                                "Error de entrada",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    break;
                case 2:
                    Gestor.mostrarRestaurantes();
                    break;
                case 3:
                    Gestor.borrarRestaurante();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Hasta luego!!!", "Saliendo del programa...",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        } while (opcion != 4);
    }
}
