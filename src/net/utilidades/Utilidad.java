package net.utilidades;

import javax.swing.JOptionPane;

public class Utilidad {
    public static void validacionEntradaDato(String string) {
        if (string == null || string.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operación cancelada. No se ingreso ningun dato.",
                    "Cancelado", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
