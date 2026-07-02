/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package link_doubly;

/**
 *
 * @author HP
 */
/*public class Main_Doub 
{
    Node head;
    Node tail;
    public static void main(String[] args) {
        Main_Doub m = new Main_Doub();
        m.insertAtEnd(10);
        m.insertAtEnd(20);
        m.insertAtEnd(40);
        m.insertAtEnd(50);
        m.forward();
        m.backward();
        
        
    }
    void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = tail = newnode;
            
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            
        }
    }
    void forward()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        
    }
    void backward()
            {
                Node temp=tail;
                while(temp!=null)
                {
                    System.out.println(temp.data+"->");
                    temp = temp.prev;
                }
                        
                
            }
    
          
    
}*/

 
 

 
public class Main_Doub {
 
    Node head;
    Node tail;
 
    public static void main(String[] args) {
 
        Main_Doub m = new Main_Doub();
 
        m.insertAtEnd(10);
        m.insertAtEnd(20);
        m.insertAtEnd(40);
        m.insertAtEnd(50);
        m.insertAtMiddle(30, 3);
        
 
        
        m.forward();
        //m.backward();

    }
 
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
 
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
 
    }
 
    void forward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void backward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    
    void insertAtMiddle(int data, int position)
{
    Node newNode = new Node(data);

    Node temp = head;

    // Move temp to the node before insertion position
    for(int i = 1; i < position -1; i++)
    {
        temp = temp.next;
    }

    // Linking new node
    newNode.next = temp.next;
    newNode.prev = temp;

    temp.next.prev = newNode;
    temp.next = newNode;
}
}

