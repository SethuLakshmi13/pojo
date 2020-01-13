package map_exsersise;

public class BoxConstructor {

	private double length;
	private double width;
	private double height;
	private double volume;

	public BoxConstructor(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		this.volume=this.length *this.height*this.width;
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		int volume = (int) (this.length * this.width * this.height);
		return volume;
	}

	@Override
	public boolean equals(Object obj) {
		boolean statusFlag = true;
		BoxConstructor a = (BoxConstructor) obj;
		int volume1 = (int) (a.length * a.width * a.height);
		int volume2 = (int) (this.length * this.width * this.height);
		if (volume1 !=volume2) {
			statusFlag = false;
		}
		return statusFlag;
	}

	@Override
	public String toString() {
		return "[ length=" + getLength() +" " +"width=" +getWidth()+" "+ "height=" + getHeight() + ""+" volume=" + getVolume()+"]";
	}

}
