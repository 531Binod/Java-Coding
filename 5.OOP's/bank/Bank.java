 package bank;
class Account{
    public String name; // public access modifier
    int age;            // default access modifier
    protected String emil;  // protected access modifier
    private String password; // private access modifier

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
class Bank {
    public static void main(String[] args) {
        Account  account1 = new Account();
        account1.name = "Binod";
        account1.age= 23;
        account1.emil = "234binod@gmail.com";
        //account1.password = "bidsj361#$"; // Error bcz passsword is private and we are accessing outside their class Account.
        // Solution is make a setter and getter method in the class Account. u can also give access modifier to that function.

        account1.setPassword("fgfhe&*736");
        System.out.println(account1.getPassword());
    }

}