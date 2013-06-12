package treelayout;

import static java.lang.Math.max;

public class BoundingBox{
	public double width, height;
	
	public BoundingBox(double width,double height) {
		this.width  = width;
		this.height = height;
	}
	
	BoundingBox merge(BoundingBox b){
		return new BoundingBox(
				max(b.width,this.width), max(b.height,this.height));
	}
}