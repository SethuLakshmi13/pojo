
public class Exhibition {

	void exhibit(Animal a) {
		if(a instanceof Cat) {
			Cat cat=(Cat)a;
			cat.category();
			cat.sound();
			//cat.habit();
			
		}
	}
}
