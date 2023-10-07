package MyLinkedList;

public class Node<T>
{
    private T element;
    private Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public Node(T element)
    {
        this.element=element;
    }

    public void setNext(Node<T> node)
    {
        next=node;
    }

    public T getElement()
    {
        return this.element;
    }

    public boolean equals(Node<T> node)
    {
        if (node==this)
        {
            return true;
        }

        return node.getElement().equals(this.element);
    }

    public int hashCode()
    {
        return 333 + this.element.hashCode();
    }
}