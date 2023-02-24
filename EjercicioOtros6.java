import java.util.Scanner;

public class EjercicioOtros6 {
    //agregamos el main
    public static void main(String[] args) {

            //agregamos el new
            int[] n = new int[20];
        //agregamos el ++
	    for (int i = 0; i < 20; i++) {
                n[i] = (int)(Math.random() * 381) + 20;
                //agregamos el out
                System.out.print(n[i] + " ");
            }
	    //agregamos ln
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        //agregamos el parentesis
        Scanner scan = new Scanner(System.in);
        int opcion = Integer.parseInt(scan.nextLine());
            //cambiamos de lugar el ? :
            int multiplo = (opcion == 1) ? 5 : 7;


            //cambiamos el foreach por for
            for(int e : n) {
                if (e % multiplo == 0) {
                    System.out.print("[" + e + "] ");
                //cerramos la llave
                }
	       else {
               //cambiamos el in por out
               System.out.print(e + " ");
                    }
                }


    }
}
