/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    public Duck(){
        
    }

    public abstract void display();

    public void swimm (){
        System.out.println("I´m swimming");
    }
    
    public void setFlyBehavior(FlyBehavior flyBe){
        flyBehavior=flyBe;
    }
    
    public void setQuackBehavior (QuackBehavior quackBe){
        quackBehavior=quackBe;
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void showDuck(){
        swimm();
        performQuack();
        performFly();
        display();
    }
    
}
