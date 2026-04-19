import java.util.Stack;

public class Deshacer {
    private Stack<String> acciones = new Stack<>();

    public void realizarAccion(String accion) {
        acciones.push(accion);
        System.out.println("Acción realizada: " + accion);
        System.out.println("Estado: " + acciones);
    }

    public void deshacer() {
        if (!acciones.isEmpty()) {
            String accion = acciones.pop();
            System.out.println("Deshacer: " + accion);
            System.out.println("Estado: " + acciones);
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial final: " + acciones);
    }
}