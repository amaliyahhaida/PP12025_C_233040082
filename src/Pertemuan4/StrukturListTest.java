package Pertemuan4;


public class StrukturListTest {
    public static void main(String[] args) {
        StrukturListInt list = new StrukturListInt();

        // latihan 3
        list.addTail(3);
        list.addTail(4);
        list.addMid(7, 2);
        list.addMid(8, 2);
        list.addHead(5);
        list.displayElement(); // Output : 5 3 8 7 4 
    }
}
