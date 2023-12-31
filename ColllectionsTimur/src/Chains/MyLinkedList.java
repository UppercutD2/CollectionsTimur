package Chains;


public class MyLinkedList<T> {

    private Node<T> head;
    private int length=-1;
    /////////////////////////////////Nested Class start

    ///////////////////////////////////////// Nested Class End
    public MyLinkedList(){

    }

    public int getLength() {
        return length;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        }
        else {
            Node<T> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
        length++;
    }//add method


    public void setHead(Node<T> node)
    {
        if(head!=null)
        {
            node.setNext(this.head.getNext());
            this.head=node;

        }
    }
//    public void removeNode(Node<T> node)
//    {
//        if(length>=0)
//        {
//            Node<T> tmp = this.head;
//
//            while(tmp.next!=null)
//            {
//                if(tmp.equals(node))
//                {
//                    tmp.setNext(tmp.next.next);
//                    length--;
//                    break;
//                }
//                else
//                {
//                    tmp=tmp.next;
//                }
//            }
//        }
//    }
    public void removeElementData (T element)
    {

        int target = indexOf(element);
        removeElementIndex(target);

    }//method to remove element based on Data element

    public Node<T> getNode(int index)
    {
        Node<T> tmp = this.head;

        if(tmp!=null && index<=length && index>=0)
        {if(index ==0)
        {
            return this.head;
        }
            int target=0;
            while (target!=index)
            {
                target++;
                tmp=tmp.getNext();

            }
            return tmp;
        }
        else
        {
            throw new RuntimeException("Index out of Array Bound Dana");
        }

    } // returns node on index

    public Node<T> getNode4Ops(int index)
    {
        Node<T> tmp = this.head;

        if(tmp!=null && index<=length && index>0)
        {
            int target=-1;
            if(index ==0)
            {
                return this.head;
            }
            target++;
            while (target!=index-1)
            {
                target++;
                tmp=tmp.getNext();

            }

            return tmp;
        }
        else
        {
            throw new RuntimeException("Index out of Array Bound Dana");
        }

    }//used for getting the Node before the required.(used only for Node<T> node.setnext() ops
    public T getElementData(int index)
    {
        Node<T> tmp = this.head;

        if(tmp!=null && index<=length && index>=0)
        {
            int target=0;
            while (target!=index)
            {
                target++;
                tmp=tmp.getNext();

            }
            return tmp.getElement();
       }
        else
        {
            throw new RuntimeException("Index out of Array Bound Dana");
        }
    }//returns data value on index
    public void removeElementIndex(int index)
    {
        if(head!=null && index<=length && index>=0)
        {
            int target=-1;

            if(index==0)
            {
                this.head=head.getNext();
                return;
            }
            Node<T> tmp=head;
            target++;
            while(target!=index-1)
            {
                target++;
                tmp=tmp.getNext();

            }

            tmp.setNext(tmp.getNext().getNext());
            length--;
            System.out.println("Element has been deleted");


        }
        else
        {
            System.err.println("Index out of Array Bound Dana");
        }
    }//method to remove element based on index

    public int indexOf(T element)
    {
            int index =-1;
            Node<T> tmp = this.head;
            boolean found = false;
            while(tmp!=null)
            {    index++;
                if(checkElement(tmp,element))
                {
                    found=true;
                    break;
                }
                else
                {
                    tmp=tmp.getNext();

                }
            }

        if (found)
        {
            return index;
        }
        else
        {
            System.err.println("Searched data is not found in LinkedList");
            return -1;
        }
    }//returns index of Element

    public void insertElement(int index,T element)
    {
        Node<T> newNode = new Node<T>(element);
        if(head!=null && index<=length && index>=0) {
            int target = -1;
            Node<T> tmp = head;
            if (index == 0) {
                this.head = newNode;
                newNode.setNext(tmp);
                length++;
                return;
            }

            target++;
            while (target != index - 1)
            {

                target++;
                tmp = tmp.getNext();

            }

            Node<T> tmp1 = tmp.getNext();
            tmp.setNext(newNode);
            newNode.setNext(tmp1);
            length++;
            System.out.println("Inserted");


        }
        else
        {
            System.err.println("List is Empty, or index is Wrong");
        }
    }
    public void swapNodes(int first,int second)
    {
        Node<T> tmp1 = getNode(first) ;
        Node<T> tmp1Next = tmp1.getNext();
        Node<T> tmp14Ops = getNode4Ops(first);

        Node<T> tmp2 = getNode(second);
        Node<T> tmp2Next = tmp2.getNext();
        Node<T> tmp24Ops = getNode4Ops(second);

        boolean is1Head = tmp1.equals(this.head);
        boolean is2Head = tmp2.equals(this.head);

        Node<T> firstNode = getNode(first);
        Node<T> firstNodeNext  = firstNode.getNext();

        Node<T> secondNode = getNode(second);
        Node<T> secondNodeNext = secondNode.getNext();









        System.out.println("I hope it swapped");





    }//not finished , possible but very tricky and ezziyetli

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int index =0;
        Node<T> start = this.head;
        if(start != null)
        {
            sb.append(start.getElement());
        }
        while(start.getNext()!=null)
        {
            start=start.getNext();
            sb.append(", "+start.getElement());
        }
            sb.append("]");
        return sb.toString();
    }//all elements to String StringBuilder

    ////////////////////////////////////////////////////
    private boolean checkElement(Node<T> node, T element)
    {
        return node.getElement().equals(element);

    }

    private int iteration_LL()
    {
        return -1;
    }//not used
}
