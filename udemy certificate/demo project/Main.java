
public class Main {

	public static void main(String[] args) {
		Animal a=new Animal();
		//a.category();
		//a.sound();
		Cat c=new Cat();
		//c.category();
		//c.sound();
		//c.habit();
		Dog d=new Dog();
		//d.category();
		//d.sound();
		//Animal a1=c;
		//a1.category();
		//a1.sound();
		//a1.habit();
		
		//Cat c1=(Cat) a1;
		//c1.category();
		//c1.sound();
		//c1.habit();
		int option=1;
		Exhibition ex=new Exhibition();
		if(option==1)
		{
			ex.exhibit(new Cat());
		}
		
	}

}
