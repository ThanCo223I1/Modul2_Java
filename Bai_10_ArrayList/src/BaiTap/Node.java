package BaiTap;

public class Node<E>{
     Node next;
     Object data;
    public Node(E data){
        this.data=data;
    }
    public Object data(){
        return data;
    }
}
