package ThucHanh;

public class GenericStackClient <T>{
    private static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Kích thước ngăn xếp sau thao tác đẩy: " + stack.size());
        System.out.println("1.2. Các phần tử pop từ ngăn xếp : ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("1.3. Kích thước ngăn xếp sau thao tác pop : " + stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        System.out.println("2.1. Kích thước ngăn xếp sau thao tác đẩy: " + stack.size());
        System.out.printf("2.2. Các phần tử pop từ ngăn xếp : ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("3.3 Kích thước ngăn xếp sau thao tác pop : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }
}
