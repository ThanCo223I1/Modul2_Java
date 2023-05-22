package BaiTap;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(1);

        myLinkedList.add(0, 3);
        myLinkedList.add(1, 30);
        myLinkedList.add(2, 33);
        myLinkedList.add(3, 32);
        myLinkedList.add(4, 39);
        myLinkedList.addLast(399);

        myLinkedList.show();
//        myLinkedList.remove(1);
    }
}
