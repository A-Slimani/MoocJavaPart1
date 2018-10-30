
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        cashInRegister = 1000;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum > 0){
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        // price of the economical lunch is 2.50 euros
        double economicalLunch = 2.50;
        // if the given cash is at least the price of the lunch:
        if (card.balance() >= economicalLunch) {
            //    the amount of sold lunch is incremented by one
            economicalSold++;
            //    method returns card.pay(lunch price)
            card.pay(economicalLunch);
            return true;
        } else {
            return false;
        }

    }

    public boolean payGourmet(LyyraCard card) {
        // price of the gourmet lunch is 4.00 euros
        double gourmetLunch = 4;
        // if the given cash is at least the price of the lunch:
        if(card.balance() >= gourmetLunch){
        //    the amount of sold lunch is incremented by one
        gourmetSold++;
        //    method returns true & returns card.pay(lunch price)
        card.pay(gourmetLunch);
        return true;
        } else {
            return false;
        }
    }
    
    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double economicalLunch = 2.50;
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= economicalLunch) {
            //    the price of lunch is added to register
            cashInRegister += economicalLunch;
            //    the amount of sold lunch is incremented by one
            economicalSold++;
            //    method returns cashGiven - lunch price
            return cashGiven - economicalLunch;
        } else {
            return cashGiven;
        }

    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double gourmetLunch = 4;
        // if the given cash is at least the price of the lunch:
        if(cashGiven >= gourmetLunch){
        //    the price of lunch is added to register
        cashInRegister += gourmetLunch;
        //    the amount of sold lunch is incremented by one
        gourmetSold++;
        //    method returns true
        return cashGiven - gourmetLunch;
        } else {
            return cashGiven;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    
}
