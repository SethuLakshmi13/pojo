
public class Room {
	int length;
	int breadth;
	int height;
	int roomNo;
	String color;
	Room (int length,int breadth,int height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	Room(int length,int breadth,int height,int roomNo)
	{
		this(length,breadth,height);
		this.roomNo=roomNo;
	}
	int calculateFloorArea() {
		return(length*breadth);
		
	}
	int calculatePaintingCost() {
		return(((length*height)+(breadth*height)));
	}
	int doubleHeight() {
		return(2*height);
	}
	int display() {
		return(roomNo);
	}
	String displayColor() {
		return(color);
	}
}
