package net.salesianos.restaurante;

public class Restaurante {
    String nombre;
    String localizacion;
    String horario;
    float puntuacion;

    public Restaurante(String nombre, String localizacion, String horario, float puntuacion) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.horario = horario;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre +
                "\nLocalizacion : " + localizacion +
                "\nHorario : " + horario +
                "\nPuntuacion : " + puntuacion;
    }

}
