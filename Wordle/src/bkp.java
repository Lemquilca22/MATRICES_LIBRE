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

        int intentos=5, filas=5;
        int posicionpalabra= getrandom();
        String palabra= getpalabra(listapalabras, posicionpalabra);
        System.out.println("LA PALABRA DEL DÍA");
        print(palabra);
        System.out.println();
        String mipalabra="";

        //COMIENZA EL JUEGO
        //QUIERO HACER UN ARRAY PARA GUARDAR LOS COLORES DE LOS CARACTERES
        String[] colores = new String[palabra.length()];
        while (intentos>0){
            System.out.println("INGRESA LA PALABRA");
            mipalabra=sc.next();
            int tammipalabra =mipalabra.length();
            intentos-=1;

            //COMPROBAR QUE LAS LETRAS COINCIDAN
            for (int i = 0; i < tammipalabra; i++) {
                if (mipalabra.charAt(i)==palabra.charAt(i)){

                }
            }
            for (int i = 0; i < tammipalabra; i++) {

            }
            //BUCLE QUE IMPRIME LOS CARACTERES DE COLORES
        }









    }
}
