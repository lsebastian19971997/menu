package uia.com.agenda;

import java.util.HashMap;

public class Contacto {

    String nombre="";

    HashMap<String, Evento> eventos = new HashMap<String, Evento>();

    public Contacto(String nom)
    {
        nombre=nom;
    }

    public Contacto(String tipo, String fecha, String fechaRecordatorio, String nombre) {
        agregaEvento(tipo, fecha, fechaRecordatorio, nombre);
    }

    public void agregaEvento(String tipo, String fecha, String fechaRecordatorio, String nombre)
    {
        Evento newEvento = new Evento(tipo, fecha, fechaRecordatorio, nombre);
        eventos.put(fecha, newEvento);
    }

    public HashMap<String, Evento> getEventos() {
        return eventos;
    }

    public void setEventos(HashMap<String, Evento> eventos) {
        this.eventos = eventos;
    }
}
