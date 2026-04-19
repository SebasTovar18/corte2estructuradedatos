import java.util.LinkedList;
import java.util.Queue;

public class SistemaCola {
    private Queue<String> solicitudes = new LinkedList<>();
    private Queue<String> atendidas = new LinkedList<>();

    // Agregar solicitudes
    public void agregarSolicitud(String s) {
        solicitudes.add(s);
    }

    // Mostrar todas las solicitudes iniciales
    public void mostrarLlegadas() {
        System.out.println("Solicitudes: " + solicitudes);
    }

    // Atender n solicitudes
    public void atender(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            if (!solicitudes.isEmpty()) {
                String atendida = solicitudes.poll();
                atendidas.add(atendida);
            }
        }
    }

    // Mostrar atendidas
    public void mostrarAtendidas() {
        System.out.println("Atendidos: " + atendidas);
    }

    // Mostrar pendientes
    public void mostrarPendientes() {
        System.out.println("Pendientes: " + solicitudes);
    }
}