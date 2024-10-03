public class FriendSPairing {
    /*
    The problem here is about pairing friends. Given n friends, you need to calculate in how many ways these n friends 
    can either: Stay single, or Pair up with one of the other friends.

    For 3 friends, the four possible ways to pair or leave them single are:
    1. All three friends stay single.
    2. Friend 1 stays single, and friends 2 and 3 form a pair.
    3. Friend 2 stays single, and friends 1 and 3 form a pair.
    4. Friend 3 stays single, and friends 1 and 2 form a pair.
     */

     public static int nosOfWayTOPairFriends(int n){
        if(n<=1){
            return 1;
        }
        // for single : let nth person stay single then call remaining nosofPairFriends(n-1) we need to pair n-1 more friends
        // for pairing : nth will pair with any one of the remaining (n-1) friends then we have only n-2 student to pair by call function.
        return nosOfWayTOPairFriends(n-1) + (n-1) * nosOfWayTOPairFriends(n-2);
     }
     public static void main(String[] args) {
        int n=3;
        System.out.println("For 3 student No.s way of Pairing "+ nosOfWayTOPairFriends(n));
     }
}
