class Account
{
    long accno, balance;
    String name;
    void getData(long accno, long balance, String name)
    {
        this.accno = accno;
        this.balance = balance;
        this.name = name;
    }
    void display()
    {
        System.out.println("Account Number : " + this.accno);
        System.out.println("Name : " + this.name);
        System.out.println("Balance : " + this.balance);
    }
}
class Test 
{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.getData(13323443339L, 19999, "kartikey negi");
        a1.display();
    }
}