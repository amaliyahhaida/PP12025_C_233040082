package ElemenListNode;

public class Node {
	private int nilai;
	private Node next;
	
	// inisialisasi Node
	public Node (int nilai) {
		this.nilai = nilai;
		this.next = null; // Default next adalah null
	}
	
		// Setter & Getter
	
    // Setter untuk nilai
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    // Getter untuk nilai
    public int getNilai() {
        return nilai;
    }

    // Setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }
}

