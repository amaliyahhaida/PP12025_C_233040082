package Pertemuan4;

public class StrukturListInt {
    private NodeInt HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Latihan - 2 addTail
    public void addTail(int data) {
        NodeInt newNode = new NodeInt(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            NodeInt current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // Latihan - 3 displayElement
    public void displayElement() {
        NodeInt current = HEAD;
        System.out.println("Elemen : ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Latihan - 5 addHead
    public void addHead(int data) {
        NodeInt newNode = new NodeInt(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    // (Modul ke - 3) Latihan - 2 addMid
    public void addMid(int data, int position) {
        NodeInt newNode = new NodeInt(data);

        if (isEmpty() || position == 1) { 
            HEAD = newNode;
            return;
        }

        NodeInt curNode = HEAD;
        NodeInt posNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            posNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        if (posNode != null) {
            posNode.setNext(newNode);
            newNode.setNext(curNode);
        }
    }
}


