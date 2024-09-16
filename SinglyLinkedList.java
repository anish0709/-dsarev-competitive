public class SinglyLinkedList
{
    private ListNode head;

    private static class ListNode
    {
        private int data;  //generic type - please revise this concept
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void display()
    {
        ListNode current = head;
        while (current!= null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value)
    {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value)
    {   
        ListNode newNode = new ListNode(value);
        if(head==null)
        {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next!=null)
        {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value)
    {
        ListNode node = new ListNode(value);

        if(position == 1)
        {
            node.next = head;
            head = node;
        }
        else
        {
            ListNode previous = head;
            int count = 1;

            while(count<position-1)
            {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public ListNode deleteFirst()
    {
        if(head==null)
        return null;

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public void delete(int positon)
    {
        if(positon==1)
        {
            head = head.next;
        }
        else
        {
            ListNode previous = head;
            int count = 1;
            while(count<position - 1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public ListNode deleteLast()
    {
        if(head==null || head.next==null)
        return null;

        ListNode current = head;
        ListNode previous = null;

        while(current.next!=null)
        {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }   

    public static void main(String[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();
        // list.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(11);

        // sll.head.next = second;
        // second.next = third;
        // third.next = fourth; 


        //insert at head of list
        // list.insertFirst(11);
        // list.insertFirst(8);
        // list.insertFirst(1);

        //insert at last of list
        list.insertLast(11);
        list.insertLast(8);
        list.insertLast(1);

        list.display();

        System.out.println(sll.delereFirst().data);
        list.display();
    }
}
















// os, networking, dbms and chatgpt ne jo bola h 

// stack, queue, linkedlist ache se sare   &&    main h sorting&&searching jitne bhe h sare

// java language = exception handling && garbage collection

// bfs and dfs and heap 

// reverse a linkedlist and palindrome of a linkedlist

//geeksforgeeks ka interview experience bhe dekh lena

// jo resume me likha h woh bhe padna h kyuke woh puchega microservice, spring security, etc, typescript;

// and project bhe sare khtm kar jitna ho sake fatafat

// detect a loop in a singly linked list



                       // 1      ->       2      ->       3         ->           4

//prev=null;   <-    cur=head             next
//curr=head;
  