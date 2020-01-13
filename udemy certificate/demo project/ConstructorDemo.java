
public class ConstructorDemo {

	public static void main(String[] args) {
		//Room r1=new Room();
		Room r2=new Room(20,30,40);
		Room r3=new Room(20,30,40,4567);
		ClassRoom r4=new ClassRoom(10,10,10,45,"red");
		
		
		
		/*int floorArea=r1.calculateFloorArea();
		System.out.println(floorArea);
		int paintCost=r1.calculatePaintingCost();
		System.out.println(paintCost);*/
		
		int floorArear2=r2.calculateFloorArea();
		System.out.println(floorArear2);
		int paintCostr2=r2.calculatePaintingCost();
		System.out.println(paintCostr2);
		int heightTwice=r2.doubleHeight();
		System.out.println(heightTwice);
		int roomNo=r3.display();
		System.out.println(roomNo);
		String color=r4.displayColor();
		System.out.println(color);

	}

}
