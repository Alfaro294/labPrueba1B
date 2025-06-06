package jennifer_20210182;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);*/
        ActualizarStock objPro = new ActualizarStock();

        System.out.printf("¿Que producto quiere actualizar?");
        System.out.println("ID: 1 Manzana");
        System.out.println("ID: 2 Pera");
        System.out.println("ID: 3 naranja");
        objPro.Actualizar_Stock();
        }
    }
