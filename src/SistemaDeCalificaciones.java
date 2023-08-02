import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaDeCalificaciones {

    public static void main(String[] args) {
// funcion escaner para pedir datos por consola
        Scanner leer = new Scanner(System.in);
//implente una ventana con el JOptionpane
        String num1 =   JOptionPane.showInputDialog("SISTEMA DE CALIFICACIONES\n"+"Ingrese la calificacion: ");
        System.out.println(num1);
        int num = Integer.parseInt(num1);//convertimos la variable a entero
        //validaciones
        if ( num > 10){//si el numero es mayor a 10 no permitira seguir en el programa
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el rango establecido","Error",0);

        }else if (num<0){
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el rango establecido","Error",0);
        }
        if (num == 9 || num == 10){//si e numero es igual a 9 o igual a 10 imprime la letra A
            JOptionPane.showMessageDialog(null,"SISTEMA DE CALIFICAICONES POR LETRAS\n"+"A");
            String op =   JOptionPane.showInputDialog("Menu\n"+"Elija una Opcion: ");
            System.out.println(op);

            String [] valoresAceptados = {"1","2" };
            String input2  =(String)JOptionPane.showInputDialog(null,
                    "Elija una Opcion:\n 1.Peliculas 2.Series",
                    "Menu",
                    2,
                    null,
                    valoresAceptados,
                    valoresAceptados[1]);

            switch (op){
                case "1":
                    String [] valoresAceptados2 = {"Rapidos y Furiosos 20", "Super Man","Iron Man","Hulk","Batman Return"};
                    String input  =(String)JOptionPane.showInputDialog(null,
                            "Peliculas para ver:",
                            "Peliculas",
                            2,
                            null,
                            valoresAceptados2,
                            valoresAceptados2[1]);
                    break;
                case "2":
                    String [] valoresAceptados3 = {"Flash", "Manifiesto","Merlina","Hulk","Batman Return"};
                    String inpu  =(String)JOptionPane.showInputDialog(null,
                            "Peliculas para ver:",
                            "Peliculas",
                            2,
                            null,
                            valoresAceptados3,
                            valoresAceptados3[1]);
                    break;
            }
        }else  if (num >= 8 && num < 9){
            JOptionPane.showMessageDialog(null,"SISTEMA DE CALIFICAICONES POR LETRAS\n"+"B");


        }else  if (num >= 7 && num < 8){
            JOptionPane.showMessageDialog(null,"SISTEMA DE CALIFICAICONES POR LETRAS\n"+"C");

        }else  if (num >= 6 && num < 7){
            JOptionPane.showMessageDialog(null,"SISTEMA DE CALIFICAICONES POR LETRAS\n"+"D");

        }else  if (num >= 0 && num < 6){
            JOptionPane.showMessageDialog(null,"SISTEMA DE CALIFICAICONES POR LETRAS\n"+"F");
        }
    }
}
