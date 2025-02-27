package Pertemuan4;

public class StrukturListDouble {
    private NodeDouble HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(double data) {
        NodeDouble newNode = new NodeDouble(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void addTail(double data) {
        NodeDouble newNode = new NodeDouble(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            NodeDouble current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void addMid(double data, int position) {
        NodeDouble newNode = new NodeDouble(data);
        if (isEmpty() || position == 1) {
            addHead(data);
            return;
        }

        NodeDouble curNode = HEAD;
        NodeDouble prevNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            prevNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        if (prevNode != null) {
            prevNode.setNext(newNode);
            newNode.setNext(curNode);
        }
    }

    public void displayElement() {
        NodeDouble current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}


