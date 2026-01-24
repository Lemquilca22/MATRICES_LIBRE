import java.util.Random;
import java.util.Scanner;

public class main {
    public static int getrandom(){
        Random random = new Random();
        return random.nextInt(100);

    }
    public static String getpalabra(String[] listapalabras, int posicionpalabra){
         return listapalabras[posicionpalabra];
    }
    public static void print (String palabra){
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print("_ ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] listapalabras= {"Agua", "Arena", "Arroz", "Asado", "Audio", "Baile", "Barco", "Bello", "Broma", "Busca",
                "Cable", "Calor", "Canto", "Carro", "Cebra", "Chapa", "Cielo", "Cofre", "Comer", "Cuadro",
                "Dardo", "Datos", "Debajo", "Dedo", "Deseo", "Disco", "Dicha", "Dosis", "Duda", "Dueño",
                "Echar", "Efecto", "Eje", "Elite", "Enano", "Enero", "Envío", "Epoca", "Erizo", "Error",
                "Feria", "Ficha", "Fiesta", "Firma", "Flaco", "Flora", "Fuego", "Fuerte", "Funda", "Fútbol",
                "Gafas", "Gallo", "Gente", "Globo", "Golpe", "Goma", "Gorra", "Grano", "Grito", "Guante",
                "Hacha", "Hielo", "Hierro", "Higo", "Hilo", "Hojas", "Hongo", "Horno", "Hueso", "Huevo",
                "Icono", "Imán", "Indio", "Isla", "Items", "Jarra", "Jaula", "Joven", "Juego", "Jugo",
                "Kilo", "Kiosco", "Lápiz", "Leche", "Lento", "Libro", "Limón", "Llama", "Llave", "Lobo",
                "Madre", "Mago", "Mapa", "Marco", "Martes", "Marzo", "Mesa", "Metro", "Miedo", "Móvil"};


        //BUCLE DEL JUEGO
        boolean jugar=true;
        while (jugar){
            int intentostotales=5, jugadashechas=0;
            int posicionpalabra= getrandom();
            String palabra= getpalabra(listapalabras, posicionpalabra);
            String mipalabra="";
            palabra=palabra.toUpperCase();
            String[]historial=new String[intentostotales];
            int tamaño=palabra.length();
            boolean partidaganada=false;

            while (jugadashechas<intentostotales){
                //PARA QUE LA TERMINAL QUEDE LIMPIA
                for (int i = 0; i < 20; i++) System.out.println();

                //TABLERO
                System.out.println("WORDLE");
                // Imprimir lo que ya jugamos
                for (int i = 0; i < jugadashechas; i++) {
                    System.out.println(historial[i]);
                }
                for (int i = 0; i < (intentostotales - jugadashechas); i++) {
                    for(int j = 0; j < palabra.length(); j++) System.out.print("_ ");
                    System.out.println();
                }

                System.out.print("\nINTENTO " + (jugadashechas + 1) + ": ");
                mipalabra=sc.next();
                int tammipalabra =mipalabra.length();

                if (tammipalabra!=palabra.length()){
                    System.out.println("La palabra debe tener "+palabra.length()+" letras");
                    continue;
                }
                mipalabra=mipalabra.toUpperCase();


                //COMPROBAR QUE LAS LETRAS COINCIDAN
                boolean[] usadaenSecreto = new boolean[palabra.length()];
                String[] colores = new String[palabra.length()];

                for (int i = 0; i < tammipalabra; i++) {
                    if (mipalabra.charAt(i)==palabra.charAt(i)){
                        colores[i]="VERDE";
                        usadaenSecreto[i]=true;
                    }
                }
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
