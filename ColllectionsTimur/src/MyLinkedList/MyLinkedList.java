package MyLinkedList;

public class MyLinkedList<T> {

    private Node<T> head;
    static class Node<T>{
        private T element;
        private Node<T> next;

        public Node(T element)
        {
            this.element=element;
        }

        public void setNext(Node<T> node)
        {
            this.next=node;
        }

        public T getElement()
        {
            return this.element;
        }

    }

    public MyLinkedList(){

    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        }
        else {
            Node<T> tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.setNext(newNode);
        }
    }
    public void remove (T element)
    {

    }

    public int indexOf(T element)
    {
            int index =-1;
            Node<T> tmp = this.head;
            boolean found = false;
            if(tmp)
                while (!found) {




                }



                System.err.println("Searched data is not found in LinkedList");

            return found? index:-1;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> start = this.head;
        if(start != null)
        {
            sb.append(start.element);
        }
        while(start.next!=null)
        {
            start=start.next;
            sb.append(", "+start.element);
        }
            sb.append("]");
        return sb.toString();
    }

}
