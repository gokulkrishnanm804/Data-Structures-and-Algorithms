import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main{

    static Node insertAtPosition(Node head, int data, int pos){

        Node newNode = new Node(data);

        if(pos == 1){
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        for(int i = 1; i < pos - 1 && temp != null; i++){
            temp = temp.next;
        }

        if(temp == null){
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    static void display(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for(int i = 0; i < n; i++){

            int val = sc.nextInt();
            Node newNode = new Node(val);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }

        int value = sc.nextInt();
        int position = sc.nextInt();

        head = insertAtPosition(head, value, position);

        display(head);
    }
}
