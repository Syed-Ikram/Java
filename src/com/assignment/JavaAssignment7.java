package com.assignment;
//1
class Rodent{
    public void eats(){
        System.out.println("eats whatever they like");
    }
}
class Mouse extends Rodent{
    @Override
    public void eats() {
        System.out.println("eats cheese a lot");
    }
}
class Hamster extends Rodent{
    @Override
    public void eats() {
        System.out.println("eats fruits a lot");
    }
}
class Gerbil extends Rodent{
    @Override
    public void eats() {
        System.out.println("eats insects a lot");
    }
}
//2
class Cycle{
    public void balance(){
        System.out.println("need to balance ...to ride it");
    }

}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("it is very though to balance unicycle");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("it is not dat though to balance a bicycle");
    }

}
class Tricycle extends Cycle{

}
//3
interface Interface1{
    public void func1();
    //public void func2();
}
interface Interface2{
    public void func3();
    //public void func4();
}
interface Interface3{
    public void func5();
    //public void func6();
}
interface Interface123 extends Interface1,Interface2,Interface3{
    public void func7();
}
class ConcreteClass{
    public void func8(){
        System.out.println("in func8");
    }
}
class Demo3 extends ConcreteClass implements Interface123{
    @Override
    public void func1() {
        System.out.println("in func1");
    }

    @Override
    public void func3() {
        System.out.println("in func3");
    }

    @Override
    public void func5() {
        System.out.println("in func5");
    }

    @Override
    public void func7() {
        System.out.println("in func7");
    }
}
//4
interface Cycle1{
    public void drive();
}
class Unicycle1 implements Cycle1{
    @Override
    public void drive() {
        System.out.println("circus ppl drive it");
    }
}
class Bicycle1 implements Cycle1{
    @Override
    public void drive() {
        System.out.println("all people drive it");
    }
}
class Tricycle1 implements Cycle1{
    @Override
    public void drive() {
        System.out.println("small kids drive it");
    }
}
class CycleFactory {
    public Cycle1 createCycle(String cycle){
        if(cycle.equals("Unicycle"))
            return new Unicycle1();
        else if(cycle.equals("Bicycle"))
            return new Bicycle1();
        else if(cycle.equals("Tricycle"))
            return new Tricycle1();
        else
            return new Bicycle1();
    }
}
//5
class Outer{
    public class Inner1{
        int num;
        Inner1(int n){
            this.num=n;
            System.out.println("inner class 1   num = "+this.num);
        }
    }
    public class Inner2 extends Inner1{

        Inner2(int n) {
            super(n);
            System.out.println("inner class 2");
        }
    }

}
public class JavaAssignment7 {
    public static void main(String[] args){
        //1
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        rodent[0].eats();
        rodent[1].eats();
        rodent[2].eats();

        //2
        Cycle[] cycle = new Cycle[3];
        cycle[0]=new Unicycle();
        cycle[1]=new Bicycle();
        cycle[2]=new Tricycle();
        cycle[0].balance();
        cycle[1].balance();
        cycle[2].balance();

        //3
        Demo3 fun = new Demo3();
        fun.func1();
        fun.func3();
        fun.func5();
        fun.func7();
        fun.func8();

        //4
        CycleFactory factory = new CycleFactory();
        Cycle1 cycle1 = factory.createCycle("Unicycle");
        cycle1.drive();
        cycle1 = factory.createCycle("Bicycle");
        cycle1.drive();
        cycle1 = factory.createCycle("Tricycle");
        cycle1.drive();

        //5
        Outer outerClass = new Outer();
        Outer.Inner1 innerClass1 = outerClass.new Inner1(4);
        Outer.Inner2 innnerClass2 = outerClass.new Inner2(6);

    }
}
