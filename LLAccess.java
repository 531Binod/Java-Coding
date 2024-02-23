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
        System.out.println("Enter element to Insert at tail: ");
        int y = sc.nextInt();
        
        list.InsertAtTail(y);
        list.Display();
        System.out.println("Enter value to be insert: ");
        int p = sc.nextInt();
        System.out.println("Enter index");
        int q = sc.nextInt();
        list.InsertAtIndex(p,q);
        list.Display();
        System.out.println("After deletion at head: ");
        list.DeleteAtHead();
        list.Display();
        
        System.out.println("After Deletion at tail: ");
        list.DeleteAtTail();
        list.Display();
        System.out.println("Enter index to be deleted: ");
        int z= sc.nextInt();
        list.DeleteAtIndex(z);
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
