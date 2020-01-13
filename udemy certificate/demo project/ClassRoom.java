
public class ClassRoom extends Room {
	
	ClassRoom(int length,int breadth,int height){
		super(length,breadth,height);
	}
	ClassRoom(int length,int breadth,int height ,int roomNo,String color){
		super(length,breadth,height,roomNo);
		this.color=color;
	}
	
	
	
}
