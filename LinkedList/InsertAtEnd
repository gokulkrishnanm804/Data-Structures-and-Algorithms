4
10 20 30 40
50

10 20 30 40 50

import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    static Node end(Node head,int data) {
        Node newnode = new Node(data);
        
        if(head == null) {
            return newnode;
        }
        
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }
    static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Node head = null;
        for(int i = 0;i < n;i++) {
            int val = sc.nextInt();
            head = end(head,val);
        }
        int addend = sc.nextInt();
        head = end(head,addend);
        display(head);
    }
}
