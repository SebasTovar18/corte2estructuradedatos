import java.util.Stack;

public class Navegacion {
    private Stack<String> pantallas = new Stack<>();

    public void entrarPantalla(String pantalla) {
        pantallas.push(pantalla);
        System.out.println("Entra " + pantalla + " -> " + pantallas);
    }

    public void atras() {
        if (!pantallas.isEmpty()) {
            pantallas.pop();
            System.out.println("Atrás -> " + pantallas);
        }
    }
}