import java.util.Random;
import java.util.Scanner;

public class bkp {
    public static int getrandom(){
        Random random = new Random();
        return random.nextInt(100);

    }
    public static String getpalabra(String[] listapalabras, int posicionpalabra){
        String  palabraescogida=listapalabras[posicionpalabra];
        return palabraescogida;
    }
    public static void print (String palabra){
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print("_ ");
        }
    }
    public static String verificarpalabra(String palabrauser, String palabraescogida){
        Scanner sc=new Scanner(System.in);
        boolean comprobar=true;
        try{
            palabrauser=sc.next();
            if (!(palabrauser.length()>palabraescogida.length())){
                throw new Exception("La palabra es de maximo"+palabraescogida.length()+" letras");
            }
            comprobar=false;
        }catch (Exception e){
            System.out.println(e);
        }
        return palabrauser;
    }
    public static void main(String[] args) {

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
        String palabrauser="";
        String palabraescogida=getpalabra(listapalabras, posicionpalabra);
        String caracterespalabra= palabraescogida;
        System.out.println("LA PALABRA DEL DÍA");
        print(caracterespalabra);
        System.out.println();
        System.out.println("INGRESA LA PALABRA");
        palabrauser=verificarpalabra(palabrauser, palabraescogida);
        System.out.println(palabrauser);







    }
}
