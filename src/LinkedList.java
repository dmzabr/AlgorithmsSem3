import java.util.Comparator;

/**
 * Связаный список
 * @param <T>
 */

public class LinkedList<T> {

    /**
     * Ссылка на первый элемент связного списка
     */
    private Node head;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;

        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append("\n");
            node = node.next;
        }

        return stringBuilder.toString();
    }

    /**
     * Узел
     */
    class Node{

        /**
         * Сылка на следющий элемент связного списка
         */
        public Node next;

        /**
         * Значение
         */
        public T value;
    }

    public void addFirst(T value){
        Node node = new Node();
        node.value = value;

        if(head != null){
            node.next = head;
        }

        head = node;
    }

    public void removeFirst(){
        if(head != null){
            head = head.next;
        }
    }

    public T contains(T value){
        Node node = head;
        while (node != null){
            if(node.value.equals(value))
                return node.value;
            node = node.next;
        }
        return null;
    }

    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){
            Node minValueNode = node;
            Node node2 = node.next;

            while (node2 != null){
                if(comparator.compare(minValueNode.value, node2.value) > 0)
                    minValueNode = node2;
                node2 = node2.next;
            }

            if (minValueNode != node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }

            node = node.next;
        }
    }

    /**
     * Добавление значения в конец связанного списка
     * @param value значение
     */
    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    /**
     * Удаление элемента из конца списка
     */
    public void removeLast(){
        if (head == null)
            return;
        Node node = head;
        while (node.next != null){
            if (node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }

    public void reverse(){
        Node node = head;
        while(node != null){
            Node node2 = node.next;
            while (node2 != null){
                T nodeTempVal = node.value;
                node.value = node2.value;
                node2.value = nodeTempVal;

                node2 = node2.next;
            }
            node = node.next;
        }
    }
}
