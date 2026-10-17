

public class Main
{
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static  final String AZUL = "\u001B[34m";

    // Punto de entrada: prueba todos los métodos de la lista
    public static void main(String[] args)
    {
        // Lista creada con un primer nodo de valor 10
        DoublyLinkedList list = new DoublyLinkedList(10);

        System.out.println(AMARILLO + "--- INSERCION ---" );
        list.append(20);
        list.append(30);
        list.prepend(5);
        list.insert(3, 15);
        list.printList();
        System.out.println("=============="+RESET + "\n");

        System.out.println(AZUL + "--- LECTURA ---" );
        list.getHead();
        list.getTail();
        list.getLength();

        System.out.println("--- getNode, setNode y medio ---");
        // Nodo en la posición 3
        DoublyLinkedList.Node temp = list.getNode(3);
        System.out.println("Nodo en posicion 3: " + temp.value);
        list.setNode(3, 99);
        System.out.println("Nodo en posicion 3 tras setNode: " + list.getNode(3).value);
        // Nodo del medio de la lista
        DoublyLinkedList.Node aux = list.medio();
        System.out.println("Nodo del medio: " + aux.value);
        System.out.println("=============="+RESET + "\n");

        System.out.println(ROJO + "--- ELIMINACION ---" );
        // Nodo eliminado, usado para mostrar su valor
        DoublyLinkedList.Node post = list.removeFirst();
        System.out.println("removeFirst: " + post.value);
        post = list.removeLast();
        System.out.println("removeLast: " + post.value);
        post = list.remove(2);
        System.out.println("remove(2): " + post.value);
        list.printList();
        System.out.println("=============="+RESET + "\n");

        System.out.println(VERDE + "--- ORDEN ---" );
        System.out.println("--- Reverse ---");
        list.append(40);
        list.append(50);
        System.out.println("Antes:");
        list.printList();
        list.reverse();
        System.out.println("Despues:");
        list.printList();
        list.getHead();
        list.getTail();

        System.out.println("--- Ciclo ---");
        System.out.println("Lista sin ciclo: " + list.ciclo());

        // Lista nueva para probar la detección de ciclo
        DoublyLinkedList cyclic = new DoublyLinkedList(1);
        cyclic.append(2);
        cyclic.append(3);
        cyclic.append(4);
        // Se enlaza el último nodo con el segundo para crear el ciclo
        cyclic.getNode(4).next = cyclic.getNode(2);
        System.out.println("Lista con ciclo: " + cyclic.ciclo());
        System.out.println("=============="+RESET);
    }
}
/* AMIGO GPT AYUDO EN  COMENTAR  EL CODIGO CREDITO  TOTAL A OPEN IA Y TODOS LOS INVOLUCRADOS EN LA CREACION
DE ESTA MARAVILLOSA HERRAMIENTA DE IA QUE AGILIZO ESTE MARTIRIO DE CODIGO jejeje
 */