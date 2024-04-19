package net.salesianos.utilidades;

public class Utilidad {
    public static boolean validacionEntradaDatoString(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }


}
