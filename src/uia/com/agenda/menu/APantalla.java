package uia.com.agenda.menu;

import java.util.Scanner;

public class APantalla implements IPantalla{

    String titulo="";
    String subTitulo="";
    String[] opciones;
    String  seleccion="";
    String subSeleccion="";

    public APantalla() {
    }

    public APantalla(String titulo, String subTitulo, String[] opciones, String seleccion, String subSeleccion) {
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.opciones = opciones;
        this.seleccion = seleccion;
        this.subSeleccion = subSeleccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public String getSubSeleccion() {
        return subSeleccion;
    }

    public void setSubSeleccion(String subSeleccion) {
        this.subSeleccion = subSeleccion;
    }

    @Override
    public void despliega() {

        System.out.println("\n\n\n");
        System.out.println("\t\t"+"\t"+titulo+"\n\n");

        for(int i=0; i<this.opciones.length;  i++)
        {

            System.out.println("\t\t"+i+"\t"+this.opciones[i]);
        }

        System.out.println("\n\n\n\t\t"+"\t"+subTitulo);

    }




}
