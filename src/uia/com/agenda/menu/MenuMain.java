package uia.com.agenda.menu;

import uia.com.agenda.MenuModificaContacto;

import java.util.Scanner;

public class MenuMain extends APantalla {
    private static final String OPTION_EXIT="0";
    private static final String LEVEL_INDENTATION ="    ";
    private int level=0;
    private int opcionContacto=-1;

    public MenuMain(String menú_principal, String s, String[] opciones, String s1, String s2) {
        super(menú_principal,s,opciones,s1,s2);

        Scanner in = new Scanner(System.in);
        despliega();
        opcionContacto = in.nextInt();

        switch (opcionContacto) {
            case 1:
                System.out.println("Seleccionó opción  1");
                pregunta();
                break;

            case 2:
                System.out.println("Seleccionó opción  2");
                pregunta();
                break;

            case 3:
                System.out.println("Seleccionó opción  3");
                pregunta();
                break;

            default:
                System.err.println("opción no reconocida");
                break;
        }
    }

    public MenuMain() {

    }



    @Override
    public void despliega() {
        super.despliega();
    }



    public void pregunta() {
        System.out.println("¿Quiere continuar o salir ??");
        System.out.println("Para continuar, confirme introduciendo: "+opcionContacto);
        System.out.println("Si desea salir introduzca 0.");

        Scanner q = new Scanner(System.in);

        switch (q.nextInt()) {
            case 0:
                System.out.println("Thank you and godbye.");
                break;

            case 1:
                System.out.println("Seleccionó opción  1");
                String[] opcionesMenuContactos ={"Salir", "Nuevo", "Modificar", "Borrar"};
                MenuContactos menuContactos = new MenuContactos("Menú Contactos", "Introduzca la opción deseada ?:",  opcionesMenuContactos, "", "");
                pregunta();
                break;

            case 2:
                System.out.println("Seleccionó opción  2");
                pregunta();
                break;

            case 3:
                System.out.println("Seleccionó opción  3");
                pregunta();
                break;

            default:
                System.err.println("opción no reconocida");
                break;

        }
    }



}
