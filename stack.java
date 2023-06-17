public class stack {
    class Node{
        int data;
        Node next;
         Node (int data){
            this.data=data;
         }
    }

    public Node top;
 
    public void display(){
        Node current=top;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("stack underflow");
            return;
        }
        top=top.next;
    }

    public static void main(String[] args) {
        stack list=new stack();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);
        list.push(70);
        list.display();
        System.out.println("[][][][][][][][][][][][][][][][]");
        list.pop();
        list.pop();
        list.pop();
        list.display();
    }
}
