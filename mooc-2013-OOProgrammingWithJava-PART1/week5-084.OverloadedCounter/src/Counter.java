/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aboud
 */
public class Counter {

    public int number;
    public boolean check = number >= 0;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;

    }

    public Counter(int startingValue) {
        this.number = startingValue;
        this.check = true;
    }

    public Counter(boolean check) {
        this.number = 0;
        this.check = check;
    }

    public Counter() {
        this.number = 0;
        this.check = true;

    }

    public int value() {
        return number;
    }

    public void increase() {
        number++;
    }

    public void decrease() {
       number--;
       if(check == true && this.number < 0){
           this.number = 0;
       }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0){
            this.number += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if(decreaseAmount >= 0){
            this.number -= decreaseAmount;
        }
        if(check == true && this.number < 0){
            this.number = 0;
        }

    }

}
