public class ListaEnlazada {
    private Nodo cabeza;

    public void agregar(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void eliminar(int posicion) {
        if (cabeza == null) return;

        if (posicion == 0) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;

        for (int i = 0; i < posicion - 1; i++) {
            if (actual.siguiente == null) return;
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}