package com.balram.demo.actions.SG.main;

public class S_Core_Main {
    public static void main(String[] args) {
        try {
            // This works because B's print method is called due to polymorphism
            S_CoreA x = new S_CoreB();
            x.print(); // This prints "in B"

            // This is invalid and corrected to:
//            S_CoreB x = new S_CoreA(); // This would cause a compilation error
            S_CoreB y = (S_CoreB) new S_CoreA(); // This compiles but will throw a ClassCastException at runtime
            y.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
