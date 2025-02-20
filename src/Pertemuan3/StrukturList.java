package Pertemuan3;

public class StrukturList {
	    private Node HEAD;

	    public StrukturList() {
	        this.HEAD = null; 
	    }

	    public boolean isEmpty() {
	        return HEAD == null;
	    }

	 // Latihan - 2 addTail
	    public void addTail(int data) {
	        Node posNode = null, curNode = null; // Pointer sementara
	        Node newNode = new Node(data); // Buat node baru

	        if (isEmpty()) {
	            HEAD = newNode; // Jika kosong, HEAD langsung diisi newNode
	        } else {
	            curNode = HEAD; // Mulai dari HEAD
	            while (curNode != null) { // Iterasi sampai node terakhir
	                posNode = curNode;
	                curNode = curNode.getNext();
	            }
	            posNode.setNext(newNode); // Set node terakhir menunjuk ke newNode
	        }
	    }

	 // Latihan - 3
	    public void displayElement() {
	        Node curNode = HEAD; // Mulai dari HEAD
	        while (curNode != null) { // Iterasi selama node tidak null
	            System.out.print(curNode.getData() + " -> ");
	            curNode = curNode.getNext(); // Pindah ke node berikutnya
	        }
	        System.out.println("null"); // Akhiran tampilan
	    }


	 // Latihan - 5 addHead
	    public void addHead(int data) {
	        Node newNode = new Node(data); // Buat node baru dengan data

	        if (isEmpty()) { // Jika list kosong
	            HEAD = newNode; // Jadikan newNode sebagai HEAD
	        } else {
	            newNode.setNext (HEAD); // Hubungkan newNode ke HEAD lama
	            HEAD = newNode; // Perbarui HEAD ke newNode
	        }
	    }
	} 




