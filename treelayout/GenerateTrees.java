package treelayout;

import java.util.Random;


public class GenerateTrees {
	
	
	public TreeNode randomTree(int nr){
		TreeNode root = randRoot();
		for(int i = 0 ; i < nr - 1 ; i++){
			root.randExpand(randRoot(), rand);
		}
		return root;
		
	}
	
	public TreeNode rand(){
		return randomTree(nr);
	}
	
	public TreeNode randRoot(){
		return new TreeNode( getRandomInRange(minWidth, maxWidth),
				             getRandomInRange(minHeight, maxHeight));
		
	}
	
	public int getRandomInRange(int start, int end){
		double r = rand.nextDouble();
		return start + (int)Math.rint(r * (end - start));
	}
	
	public double getRandomInRange(double start, double end){
		double r = rand.nextDouble();
		return Math.rint((start + r * (end - start)) * 2)/2;
	}
	
	Random rand;
	public int nr;
	double minWidth, maxWidth;
	double minHeight, maxHeight;
	
	public GenerateTrees(int nr,
			double minWidth,  double maxWidth, double minHeight, 
			double maxHeight, long seed){
		rand = new Random(seed);
		this.nr = nr;
		this.minWidth = minWidth;
		this.maxWidth = maxWidth;
		this.minHeight = minHeight;
		this.maxHeight = maxHeight;
	}




}