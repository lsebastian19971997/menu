package uia.com.agenda.menuEv;

import uia.com.agenda.Contacto;
import uia.com.agenda.menu.APantalla;

import java.util.Scanner;

public class MenuNuevoEvento extends APantalla {
    private static final String OPTION_EXIT="0";
    private static final String LEVEL_INDENTATION ="    ";
    private int level=0;
    private Contacto nuevoContacto;
    private int opcionEvento=-1;

    public MenuNuevoEvento(String menú_principal, String s, String[] opciones, String s1, String s2) {
        super(menú_principal,s,opciones,s1,s2);

        Scanner in = new Scanner(System.in);
        despliega();
        opcionEvento = in.nextInt();

        switch (opcionEvento) {
            case 0:
                System.out.println("Hasta luego del menu de contactos");
                return;
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

    public MenuNuevoEvento() {

    }



    @Override
    public void despliega() {
        super.despliega();
    }


    public void itera() {
    }


    public void modificaEvento() {
    }

    public void borraEvento() {
    }



    public void pregunta() {
        System.out.println("¿Quiere continuar o salir ??");
        System.out.println("Para continuar, confirme introduciendo: "+opcionEvento);
        System.out.println("Si desea salir introduzca 0.");

        Scanner q = new Scanner(System.in);

        switch (q.nextInt()) {
            case 0:
                System.out.println("Thank you and godbye.");
                break;

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



}


