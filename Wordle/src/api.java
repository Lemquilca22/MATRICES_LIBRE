import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class api {
    public static String getpalabra() {
        String palabra="";
        try {
            URL url = new URL("https://random-word-api.herokuapp.com/word?length=5&lang=es");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            String respuesta = br.readLine(); //devuelve palabra
            br.close();

             palabra = respuesta
                    .replace("[", "")
                    .replace("]", "")
                    .replace("\"", "");

        } catch (Exception e) {
            System.out.println("error obteniendo pal");
        }

        return palabra;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        boolean jugar=true;
        while (jugar){
            String palabrasecreta=getpalabra();
            int intentostotales=5, jugadashechas=0;

            String palabra= palabrasecreta;
            String mipalabra="";
            palabra=palabra.toUpperCase();
            String[]historial=new String[intentostotales];//ARRAY DONDE SE GUARDAN LAS PALABRAS QUE UTILIZAMOS EN PARTIDA.
            int tamaño=palabra.length();
            boolean partidaganada=false;

            while (jugadashechas<intentostotales){
                //DA UN SALTO DE 20 LINEAS PARA QUE LA TERMINAL "QUEDE LIMPIA"
                for (int i = 0; i < 20; i++) System.out.println();

                //TABLERO
                System.out.println("WORDLE");
                // Esta parte imprime lo que ya jugamos, la cantidad de veces que se repite es la cantidad de jugadas que hemos hecho, que inicializa en 0
                for (int i = 0; i < jugadashechas; i++) {
                    System.out.println(historial[i]);
                }
                // Aquí el objetivo es completar la tabla con los espacios vacios, si hicimos 2 jugadas, que esto se imprima 3 vecess por eso (intentos totales - jugadashechas)
                for (int i = 0; i < (intentostotales - jugadashechas); i++) {
                    for(int j = 0; j < palabra.length(); j++) System.out.print("_ ");
                    System.out.println();
                }

                //
                System.out.print("\nINTENTO " + (jugadashechas + 1) + ": ");
                mipalabra=sc.next();
                int tammipalabra =mipalabra.length();

                //Comprobar que mi palabra sea de igual longitud que la palabra secreta
                if (tammipalabra!=palabra.length()){
                    System.out.println("La palabra debe tener "+palabra.length()+" letras");
                    continue;//Aprendí que el continue hace que si no se cumple la condición regrese al bucle más cercano
                }
                mipalabra=mipalabra.toUpperCase();


                //COMPROBAR QUE LAS LETRAS COINCIDAN
                boolean[] usadaenSecreto = new boolean[palabra.length()];//ARRAY DE BOOLEANS, los espacios en default están en False
                String[] colores = new String[palabra.length()];//Array de colores con tamaño igual a la cantidad de letras "PALABRA SECRETA"

                //COMPROBAR LAS LETRAS EN VERDE
                for (int i = 0; i < tammipalabra; i++) {
                    if (mipalabra.charAt(i)==palabra.charAt(i)){
                        colores[i]="VERDE";
                        usadaenSecreto[i]=true;
                    }
                }
                //COMPROBAR LAS AMARILLAS y GRISES/ Estas son las que en la posición array colores[i] continuen en Null, coincidan en una posición j y que en la posición[j] continue en false
                for (int i = 0; i < tammipalabra; i++) {
                    if (colores[i]== null){
                        boolean encontrada=false;
                        for (int j = 0; j < tammipalabra; j++) {
                            if (!usadaenSecreto[j] && mipalabra.charAt(i)==palabra.charAt(j)){
                                colores[i]="AMARILLO";
                                usadaenSecreto[j]=true;
                                encontrada=true;
                                break;
                            }
                        }
                        if (!encontrada){
                            colores[i]="GRIS";
                        }
                    }
                }
                String filacoloreada= "";
                for (int i = 0; i < tamaño; i++) {
                    if (colores[i].equals("VERDE")) filacoloreada += "\u001B[32m" + mipalabra.charAt(i) + " \u001B[0m";
                    else if (colores[i].equals("AMARILLO")) filacoloreada+="\u001B[33m" + mipalabra.charAt(i) + " \u001B[0m";
                    else filacoloreada += "\u001B[37m" + mipalabra.charAt(i) + " \u001B[0m";
                }

                historial[jugadashechas] = filacoloreada;
                jugadashechas++;

                if (mipalabra.equals(palabra)){
                    partidaganada=true;
                    break;
                }
            }


            for (int i = 0; i < 20; i++) System.out.println();
            System.out.println("=== RESULTADO FINAL ===");
            for (int i = 0; i < jugadashechas; i++) System.out.println(historial[i]);

            if (partidaganada) {
                System.out.println("\n¡FELICIDADES! GANASTE.");
            } else {
                System.out.println("\nGAME OVER. LA PALABRA ERA: " + palabra);
            }


            System.out.println("¿VOLVER A JUGAR (SI/NO)?");
            String volverajugar=sc.next();
            if (volverajugar.equalsIgnoreCase("SI")){

                jugar=true;
            }
            if (volverajugar.equalsIgnoreCase("NO")){
                return;
            }
        }














    }
}
