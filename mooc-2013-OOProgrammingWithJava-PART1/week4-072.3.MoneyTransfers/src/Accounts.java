
public class Accounts {
    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
        
    }
    
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account ("account A", 100.0);
        Account b = new Account ("account A", 0.0);
        Account c = new Account ("account A", 0.0);
        
        transfer(a,b,50);
        transfer(b,c,25);
    }


}
