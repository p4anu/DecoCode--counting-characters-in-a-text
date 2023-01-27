import java.util.Scanner;

public class Main {
    //most of the varibal names are in Spanish
    //Algorithm written by Miguel Angel De Zan (p4anu)
    //Algoritmo escrito por Miguel Angel De Zan (p4anu)
    public static void main(String[] args) {
        //algorithm to count the number of times a letter is repeated in an input text
        //algoritmo para contar la cantidad de veces que se repite una letra en un texto ingresado
        //presentación/presentation
        System.out.println("██████████████████████████████████████████████████████████████");
        System.out.println("█▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒CONTADOR DE LETRAS▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓█");
        System.out.println("██████████████████████████████████████████████████████████████");

        //user input:
        String textoIngresado;
        System.out.println("█▓▓▒▒▒▒ [Esp] Ingrese, o escriba un texto: ");
        System.out.println("█▓▓▒▒▒▒ [Eng] Enter, or type in text: ");
        System.out.println("***Luego presione ENTER para continuar / Then press ENTER to continue***");
        Scanner inUser = new Scanner(System.in);
        textoIngresado = inUser.nextLine();

        //Receive keyboard input of one character
        //Recibir ingreso por teclado de un caracter
        char letra;
        Scanner in0 = new Scanner(System.in);
        System.out.println("█▓▓▒▒▒▒ ¿que letra desea contabilizar?: ");
        System.out.println("█▓▓▒▒▒▒ which letter do you wish to trace? ");
        letra = in0.next().charAt(0);
        System.out.println("█▓▓▒▒▒▒ EL contador contará la letra/the letter: "+ letra);

        //Block - user decides whether to case-sensitive or not
        //Bloque - usuario decide si distinguir mayusculas de minusculas, o no

        //Receive input by option keyboard
        //Recibir ingreso x teclado de opción
        int opcionBusqueda;
        Scanner inOpc = new Scanner(System.in);
        System.out.println("█▓▓▒▒▒▒ [Esp] Si desea que el buscador distinga mayúsculas de minúsculas ingrese 1 / si prefiere ignorar esa diferencia ingrese 2");
        System.out.println("█▓▓▒▒▒▒ O ignore todos los mensaje referentes a mayusculas/minusculas si ha ingresado un numero a rastrear");
        System.out.println("█▓▓▒▒▒▒ [Eng]If you want the search engine to distinguish between upper and lower case enter 1 /if you prefer to ignore that difference enter 2");
        System.out.println("█▓▓▒▒▒▒ Or ignore all case sensitive messages if you have entered a number to be tracked");
        opcionBusqueda = inOpc.nextInt();
        //Swicht, to take the user's choice as a condition
        //Swicht, para tomar la elección del usuario como condición
        switch (opcionBusqueda){
            case 1 :
                int cantidadDeLetras = 0;
                char contador;
                for (int i = 0; i < textoIngresado.length(); i++) {
                    contador = textoIngresado.charAt(i);
                    //charAt(i) is a class/operation that allows the primitive data entered in the String class to be counted.
                    //charAt(i) es una clase/operación que permite contabilizar el dato primitivo ingresado en la clase String
                    if (contador == letra){
                        cantidadDeLetras++;}
                }
                System.out.println("█▓▓▒▒▒▒ [Esp] Distinguiendo mayusculas de minusculas (ignorar si lo ingresado es un número)");
                System.out.println("█▓▓▒▒▒▒ [Eng] Case-sensitive (ignore if input is a number)");
                System.out.println("█▓▓▒▒▒▒ la letra [the letter] " + letra + " se repite [is repeated] " + cantidadDeLetras + " veces en el texto ingresado [number of times in the text entered]");
                break;
            case 2:
                int cantidadDeLetras2 = 0;
                String contador2;
                for (int i = 0; i < textoIngresado.length(); i++) {
                    contador2 = String.valueOf(textoIngresado.charAt(i));
                    if (contador2.equalsIgnoreCase(String.valueOf(letra))){
                        cantidadDeLetras2++;}
                } //valueOf was entered at the suggestion of the IntelliJ IDEA IA, when I couldn't resolve the bug myself.
                //valueOf fue ingresado por sugerencia de la IA de IntelliJ IDEA, cuando no podía resolver el error yo mismo.
                System.out.println("█▓▓▒▒▒▒ [Esp] Sin distinguir mayusculas de minusculas (ignorar si lo ingresado es un número)");
                System.out.println("█▓▓▒▒▒▒ [Eng] Case insensitive (ignore if input is a number)");
                System.out.println("█▓▓▒▒▒▒ la letra [the letter] " + letra + " se repite [is repeated] " + cantidadDeLetras2 + " veces en el texto ingresado [number of times in the text entered]");
                break;
            default:
                System.out.println("█▓▓▒▒▒▒ La opción ingresada es INCORRECTA/The option entered is INCORRECT");

        }


    }
    }