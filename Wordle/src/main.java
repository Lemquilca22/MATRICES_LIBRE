import java.util.Random;

public class main {
    public static void print(String[] nomPalabra){
        Random random = new Random();
        int palabraleatoria= random.nextInt(100);
        String palabra=nomPalabra[palabraleatoria];
        System.out.println("PALABRA DEL DÍA");
        //IMPRIMIR CON UN FOR I LA CANTIDAD DE LETRAS DE LA PALABRA
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print("_ ");
        }
    }
    static void main(String[] args) {

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

        print(listapalabras);

    }
}
