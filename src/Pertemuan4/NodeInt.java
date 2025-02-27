package Pertemuan4;

public class NodeInt {
    private int data;
    private NodeInt next;

    // inisialisasi atribut node
    public NodeInt(int data) {
        this.data = data;
    }

    // setter & getter
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public NodeInt getNext() {
        return next;
    }
    public void setNext(NodeInt next) {
        this.next = next;
    }
}