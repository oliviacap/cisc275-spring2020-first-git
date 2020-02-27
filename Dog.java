import java.util.*;

class Animal{
    public int legs;
    
    public Animal(int legs){			
		this.legs = legs;
    }
     public int getLegs(){
	return this.legs;
}
}

class Dog extends Animal{
    public String name;
    public Dog (String name, int legs){
	super(legs);
	this.name = name;

    }
    public String toString(){
		return name+" "+ legs;
}
   
}
