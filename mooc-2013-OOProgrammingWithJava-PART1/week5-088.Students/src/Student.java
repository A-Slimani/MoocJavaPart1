/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aboud
 */
public class Student {

    private String name;
    private String number;

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void add(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return number;
    }

    public String toString() {
        return name + " (" + number + ")";
    }

    public String search(String letters) {
        while (true) {
            if (name.contains(letters)) {
                return toString();
            } else {
                break;
            }
        }
        return "";
    }

    public boolean searchTwo(String letters) {
        if (name.contains(letters)) {
            return true;
        } else {
            return false;
        }

    }
}
