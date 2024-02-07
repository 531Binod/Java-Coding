import java.util.Scanner;

public class LLAccess {
    public static void main(String[] args) {
        LL list = new LL();
        list.INsertAtHead(12);
        list.INsertAtHead(32);
        list.INsertAtHead(52);
        list.INsertAtHead(122);
        list.INsertAtHead(124);
        list.Display();
        System.out.println("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x +" Found At Index "+ list.search(x));
        
        
        list.InsertAtTail(100);
        list.Display();
        list.InsertAtIndex(1000, 2);
        list.Display();
        /*/
        list.DeleteAtHead();
        list.Display();
        */
        
        list.DeleteAtTail();
        list.Display();
        /* 
        list.DeleteAtTail();
        list.Display();
        list.DeleteAtTail();
        list.Display();
        list.DeleteAtIndex(1);
        list.Display();*/
    }
    
}
