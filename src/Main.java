import java.util.ArrayList;
import java.util.List;

class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> DatosPersonales = new Pair<>(30, "Juan Pérez");
        System.out.println("Edad: " + DatosPersonales.getFirst()); 
        System.out.println("Nombre: " + DatosPersonales.getSecond()); 
        System.out.println("Datos de la persona: " + DatosPersonales); 

        System.out.println( );  
        
        Pair<String, String> EPS = new Pair<>("Sanitas", "2005");
        System.out.println("EPS: " + EPS.getFirst()); 
        System.out.println("Fecha de Nacimiento: " + EPS.getSecond()); 
        System.out.println("Datos de EPS y fecha de nacimiento: " + EPS); 
        
        List<Pair<String, String>> userDatabase = new ArrayList<>();

        userDatabase.add(new Pair<>("Sanitas", "2005"));
        userDatabase.add(new Pair<>("Famisanar", "2006"));
       
        System.out.println( ); 
        
        System.out.println("Base de datos de usuarios:");
        for (Pair<String, String> user : userDatabase) {
            System.out.println("Usuario: " + user);
        }
    }
}