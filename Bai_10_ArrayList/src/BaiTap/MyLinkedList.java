package BaiTap;

public class MyLinkedList<E> {
    Node head;
    int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(E element) {
        head = new Node<E>(element);
        numNodes++;
    }

    public void add(int index, E element) {
        Node temp;
        Node newTemp = head;
        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes) {
            for (int i = 0; i < index - 1; i++) {
                newTemp = newTemp.next;
            }
            temp = newTemp.next;
            newTemp.next = new Node(element);
            (newTemp.next).next = temp;
            numNodes++;
        }
    }

    public boolean checkIndex(int index) {
        if (index < 0 || index > numNodes) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        Node temp = head;
        head = newNode;
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
     while (temp.next!=null){
         temp=temp.next;
     }
        temp.next = new Node<E>(element);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node newtemp;
        if (index < 0 || index >= numNodes) {
            return null;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            newtemp = temp.next;
            newtemp.next = temp.next.next;
        }
        return null;
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}

