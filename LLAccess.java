public class LLAccess {
    public static void main(String[] args) {
        LL list = new LL();
        list.INsertAtHead(12);
        list.INsertAtHead(32);
        list.INsertAtHead(52);
        list.INsertAtHead(122);
        list.INsertAtHead(124);
        list.Display();
        list.InsertAtTail(100);
        list.Display();
        list.InsertAtIndex(100, 2);
        list.Display();
    }
    
}
