import java.util.Scanner;

public class LLAccess {
    public static void main(String[] args) {
        LL list = new LL();
        list.InsertAtTail(23);
        list.InsertAtTail(223);
        list.INsertAtHead(52);
        list.Display();
        list.DeleteAtHead();
        list.Display();
        list.DeleteAtTail();
        list.DeleteAtTail();
        list.Display();
        System.out.println("Size " + list.size);
        list.DeleteAtIndex(1);
        list.Display();
        System.out.println("Size " + list.size);
        System.out.println("Enter element to search: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x +" Found At Index "+ list.search(x));
        System.out.println("Enter element to Insert at tail: ");
        int y = sc.nextInt();
        
        list.InsertAtTail(y);
        list.Display();

        System.out.println("Enter element to Insert at tail: ");
        int z = sc.nextInt();
        
        list.InsertAtTail(y);
        list.Display();
        System.out.println("Size "+ list.size);

        System.out.println("Enter value to be insert: ");
        int p = sc.nextInt();
        System.out.println("Enter index");
        int q = sc.nextInt();
        list.InsertAtIndex(p,q);
        list.Display();

        System.out.println("Size "+ list.size);

        System.out.println("After deletion at head: ");
        list.DeleteAtHead();
        list.Display();
        
        System.out.println("After Deletion at tail: ");
        list.DeleteAtTail();
        list.Display();
        System.out.println("Enter index to be deleted: ");
        int zz= sc.nextInt();
        //list.DeleteAtIndex(z);
        list.Display();
    }
    
}
