public class App {
    public static void main(String[] args) throws Exception {
        Red red = new Red();

        Nodo a = new Nodo("A");
        Nodo b = new Nodo("B");
        Nodo c = new Nodo("C");
        Nodo d = new Nodo("D");
        Nodo e = new Nodo("E");

        red.agregarNodo(a);
        red.agregarNodo(b);
        red.agregarNodo(c);
        red.agregarNodo(d);
        red.agregarNodo(e);

        red.connectar(a, b);
        red.connectar(b, d);
        red.connectar(b, c);
        red.connectar(d, c);
        red.connectar(d, e);
        red.connectar(e, c);

        red.mostrar();
    }
}
