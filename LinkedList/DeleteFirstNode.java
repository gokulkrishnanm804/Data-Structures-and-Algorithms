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

    static Node deleteFirst(Node head){

        if(head == null)
            return null;

        return head.next;
    }

    static Node insertEnd(Node head, int data){

        Node newNode = new Node(data);

        if(head == null)
            return newNode;

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

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

        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            head = insertEnd(head, val);
        }

        head = deleteFirst(head);

        display(head);
    }
}


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

    static Node deleteFirst(Node head){

        if(head == null)
            return null;

        return head.next;
    }

    static Node insertEnd(Node head, int data){

        Node newNode = new Node(data);

        if(head == null)
            return newNode;

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

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

        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            head = insertEnd(head, val);
        }

        head = deleteFirst(head);

        display(head);
    }
}


5
10 20 30 40 50
20 30 40 50
