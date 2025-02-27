package Pertemuan4;

public class NodeDouble {
	double data;
    NodeDouble next;

    // inisialisasi atribut node
    public NodeDouble(double data) {
        this.data = data;
        this.next = null;
    }

    // setter & getter
    public double getData() {
        return data;
    }

    public NodeDouble getNext() {
        return next;
    }

    public void setNext(NodeDouble next) {
        this.next = next;
    }
}

