public class Main {
    public static void main(String[] args) {

        // PILA - Navegación
        Navegacion nav = new Navegacion();

        nav.entrarPantalla("A");
        nav.entrarPantalla("B");
        nav.entrarPantalla("C");
        nav.atras();
        nav.atras();

        System.out.println("--------------------------");

        // PILA - Deshacer
        Deshacer d = new Deshacer();
        d.realizarAccion("Editar perfil");
        d.realizarAccion("Cambiar contraseña");
        d.realizarAccion("Eliminar registro");
        d.deshacer();
        d.deshacer();
        d.mostrarHistorial();

        System.out.println("--------------------------");

        // COLA
        SistemaCola cola = new SistemaCola();

        cola.agregarSolicitud("S1");
        cola.agregarSolicitud("S2");
        cola.agregarSolicitud("S3");
        cola.agregarSolicitud("S4");
        cola.agregarSolicitud("S5");

        cola.mostrarLlegadas();

        cola.atender(3);

        cola.mostrarAtendidas();
        cola.mostrarPendientes();

        System.out.println("--------------------------");

        // LISTA ENLAZADA
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("U1");
        lista.agregar("U2");
        lista.agregar("U3");
        lista.agregar("U4");
        lista.agregar("U5");
        lista.agregar("U6");
        lista.mostrar();
        lista.eliminar(2);
        lista.mostrar();
    }
}
/*
Un desarrollador propone lo siguiente:
Usar una pila para gestionar turnos de atención.
Usar una cola para implementar deshacer.
Usar un arreglo fijo para almacenar usuarios en un sistema dinámico.

 */