package Pertemuan3;

public class Node {
	    private int data;
	    private Node next;

	    /** Inisialisasi atribut node */
	    public Node(int data) {
	        this.data = data;
	    }
	    
	 // Setter $ Getter

	    /** Setter untuk data */
	    public void setData(int data) {
	        this.data = data;
	    }

	    /** Getter untuk data */
	    public int getData() {
	        return data;
	    }

	    /** Setter untuk next */
	    public void setNext(Node next) {
	        this.next = next;
	    }

	    /** Getter untuk next */
	    public Node getNext() {
	        return next;
	    }
	}

