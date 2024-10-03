public class TowerOfHanoi{
    static int count=0; // No need to pass as argument
    public static void TOH(int n, String source, String helper, String destination){
        if(n==1){
            count++;
            System.out.println(source +" --> "+ destination+ " Transfered "+ n);
            //System.out.println("nos of steps "+ count);
            return;
        }
        TOH(n-1, source, destination , helper);
        //TOH(1,source, helper, destination);
        count++;
        System.out.println(source + " --> " + destination + " Transferred "+ n);  // Move the nth disk from source to destination
        TOH(n-1, helper, source , destination);
    }
    public static void main(String[] args) {
        int n=3;
        String source = "A";
        String helper = "B";
        String dest = "C";
        //int count=0; must be static class variable. not inside main
        // since count is static class level variable. no need to pass as argument inside function TOH
        TOH(n, source, helper, dest);
        System.out.println("no.s of steps: "+ count);

    }
}