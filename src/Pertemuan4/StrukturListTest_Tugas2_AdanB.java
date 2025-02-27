package Pertemuan4;

// Pengujian Tugas 2 (a)
public class StrukturListTest_Tugas2_AdanB {
    public static void main(String[] args) {
        StrukturListDouble listA = new StrukturListDouble(); 
        listA.addHead(2.1); 
        listA.addTail(3.4);
        listA.addTail(4.5);
        System.out.print("List A: "); // Output : 2.1 3.4 4.5 
        listA.displayElement();

// Pengujian Tugas 2 (b)
        StrukturListDouble listB= new StrukturListDouble(); 
        listB.addHead(3.4); 
        listB.addTail(4.5);
        listB.addTail(5.5);
        listB.addMid(2.1, 2);
        listB.addMid(1.1, 3);
        System.out.println("list B: "); // Output : 3.4 2.1 1.1 4.5 5.5
        listB.displayElement();
    }
}

