package count;

public class Milk {
	private String milkName;
	private double milkPercentage;
	private int numOfBags;
	private int numOfPackets;
	public static int cloneNumBags;
	
	/*
	 * default value takes one bag 
	 * where the num of packets is a default value of 3 
	 * 
	 * */
	public Milk(String milkName) {
		this(milkName, 0.0, 1, 3);
		cloneNumBags++;
	}
	
	public Milk(String milkName, double milkPercentage, int numOfBags) {
		this(milkName, milkPercentage, numOfBags, 0);
	}
	
	public Milk(String milkName, double milkPercentage, int numOfBags, int numOfPackets) {
		this.milkName = milkName;
		this.milkPercentage = milkPercentage;
		this.numOfPackets = numOfBags*3;
		this.numOfBags = numOfBags;
	}
	
	/*
	 * if num of bags is greater than 1 use the copy constructor
	 * */
	public Milk(Milk obj) {
		this.milkName = obj.milkName;
		this.milkPercentage = obj.milkPercentage;
		this.numOfPackets = obj.numOfPackets;
		cloneNumBags++;
	}

	public String getMilkName() {
		return milkName;
	}

	public void setMilkName(String milkName) {
		this.milkName = milkName;
	}

	public double getMilkPercentage() {
		return milkPercentage;
	}

	public void setMilkPercentage(double milkPercentage) {
		this.milkPercentage = milkPercentage;
	}

	public int getNumOfPackets() {
		return numOfPackets;
	}

	public void setNumOfPackets(int numOfPackets) {
		this.numOfPackets = numOfPackets;
	}
	
	public int getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}
	
	
}
