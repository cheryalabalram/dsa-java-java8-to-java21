package com.balram.demo.actions.SG.main;

public class SG {

    static class A {
        public void m1(){
            System.out.println("m1 from A");
        }

        private void a(){
            System.out.println("private a");
        }

        public final void a(int a){
            System.out.println("param int a with final in A");
        }
    }

    static class B extends A{
        public void m1(){
            System.out.println("m1 from B");
        }

        public void a(){
            System.out.println("no issue because A have private member for the a method");
        }

        public final void a(int a, int b){
            System.out.println("param int a & b with final in B");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalizing ...!");
        super.finalize();
    }

    public static void main(String[] args) {
//        A a = new B();
//        a.m1();
//        a.a();
//        a.a(1);
//
//        a = new A();
//        a.m1();
//        a.a();
//        a.a(2);
//
//        B b = new B();
//        b.m1();
//        b.a();
//        b.a(1);
//        b.a(2,3);
    }
}
