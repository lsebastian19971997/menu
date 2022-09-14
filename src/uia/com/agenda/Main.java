package uia.com.agenda;

import uia.com.agenda.menu.*;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hola, iniciando la agenda, buena suerte");



        String[] opcionesMenuMain ={"Salir", "Contactos", "Eventos", "Recordatorios"};
        MenuMain menuPrincipal = new MenuMain("Menú Principal", "Introduzca la opción deseada ?:",  opcionesMenuMain, "", "");


        //menuContactos.despliega();
        //menuPrincipal.setMenuContactos(menuContactos);


        //menuPrincipal.itera(menuContactos);
        //Agenda agenda = new Agenda();
        //agenda.agregaEvento("Fernando, Cita, 7-09-2022, 6-09-2022, Guadalupe");
    }
}
