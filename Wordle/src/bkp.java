import java.util.Random;
import java.util.Scanner;

public class bkp {
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

        int intentos=5, jugadashechas=0;
        int posicionpalabra= getrandom();
        String palabra= getpalabra(listapalabras, posicionpalabra);
        System.out.println("LA PALABRA DEL DÍA");
        print(palabra);
        System.out.println();
        String mipalabra="";


        //COMIENZA EL JUEGO
        //QUIERO HACER UN ARRAY PARA GUARDAR LOS COLORES DE LOS CARACTERES

        boolean jugar=true;
        while (jugar){
            while (intentos>0){
                System.out.println("INTENTOS RESTANTES: "+intentos);
                boolean tampalabra=true;
                System.out.println("INGRESA LA PALABRA");
                mipalabra=sc.next();
                int tammipalabra =mipalabra.length();
                palabra=palabra.toUpperCase();


                if (tammipalabra!=palabra.length()){
                    System.out.println("La palabra debe tener "+palabra.length()+" letras");
                    continue;
                }
                mipalabra=mipalabra.toUpperCase();
                //COMPROBAR QUE LAS LETRAS COINCIDAN
                intentos-=1;
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
                for (int i = 0; i < colores.length; i++) {
                    if (colores[i].equals("VERDE")) System.out.print("\u001B[32m" + mipalabra.charAt(i) + " \u001B[0m");
                    else if (colores[i].equals("AMARILLO")) System.out.print("\u001B[33m" + mipalabra.charAt(i) + " \u001B[0m");
                    else System.out.print("\u001B[37m" + mipalabra.charAt(i) + " \u001B[0m");
                }
                System.out.println();

                if (mipalabra.equals(palabra)){
                    System.out.println("FELICIDADES! GANASTE");
                    break;
                }
                if (intentos<=0){
                    System.out.println("GAME OVER. LA PALABRA ERA "+palabra);
                }


            }
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
