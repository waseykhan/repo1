package count;

public class Counter {
	Egg egg;
	Milk milk;

	public Counter(Milk milk) {
		this(milk, null);
	}

	public Counter(Egg egg) {
		this(null, egg);
	}

	public Counter(Milk milk, Egg egg) {
		this.milk = milk;
		this.egg = egg;
	}

	public int decrementunitEgg(int numEggs) {
		if (numEggs == 0) {
			egg.cond = true;
			throw new IllegalArgumentException("No more eggs");
		}
		numEggs--;
		egg.setEggQunatitiy(numEggs);
		return numEggs;
	}

	public int decrementunitMilk(int numPackets) {
		if (numPackets == 0) {
			throw new IllegalArgumentException("No more Milk");
		}
		numPackets--;
		milk.setNumOfPackets(numPackets);
		return numPackets;
	}

	public void decrementUnit(int numEggs, int numPackets) {
		if(numPackets == 0 && numEggs == 0){
			egg.cond = true;
			throw new IllegalArgumentException("No more Milk and Eggs");
		}else if (numPackets == 0) {
			throw new IllegalArgumentException("No more Milk");
		}else if(numEggs == 0) {
			egg.cond = true;
			throw new IllegalArgumentException("No more Eggs");
		}
		numPackets--;
		numEggs--;
		milk.setNumOfPackets(numPackets);
		egg.setEggQunatitiy(numEggs);
	}
	
	public void decrementEggsVariable(int numEggs, int variable) {
		if(numEggs == 0) {
			egg.cond = true;
			throw new IllegalArgumentException("No more Milk");
		}else if(variable - numEggs > 0 || numEggs == 0 || variable < 1) {
			throw new IllegalArgumentException("Invalid entry");
		}
		numEggs = numEggs - variable;
		egg.setEggQunatitiy(numEggs);
	}
	
	public void decrementunitMilkVariable(int numPackets, int variable) {
		if (numPackets == 0) {
			throw new IllegalArgumentException("No more Milk");
		}else if(variable - numPackets > 0 || numPackets == 0 || variable < 1) {
			throw new IllegalArgumentException("Invalid entry");
		}
		numPackets = numPackets - variable;
		milk.setNumOfPackets(numPackets);
	}
	
	public void decrementMilkEggsVariable(int numEggs, int variableEggs, int numPackets, int variableMilk) {
		if(numEggs == 0) {
			egg.cond = true;
			throw new IllegalArgumentException("No more Milk");
		}else if(variableEggs - numEggs > 0 || numEggs == 0 || variableEggs < 1) {
			throw new IllegalArgumentException("Invalid entry");
		}else if (numPackets == 0) {
			throw new IllegalArgumentException("No more Milk");
		}else if(variableMilk - numPackets > 0 || numPackets == 0 || variableMilk < 1) {
			throw new IllegalArgumentException("Invalid entry");
		}else if(variableEggs - numEggs > 0 || variableMilk - numPackets > 0 || variableMilk < 1 || variableEggs < 1) {
			throw new IllegalArgumentException("Invalid entry");
		}
		numPackets = numPackets - variableMilk;
		milk.setNumOfPackets(numPackets);
		
		numEggs = numEggs - variableEggs;
		egg.setEggQunatitiy(numEggs);
	}
	
	
	public int checkNumofBags(int numOfPacks) {
		int result = 0;
		double div = numOfPacks/3.0;
		if(div % 3 ==0) {
			result = (int) div;
		}else {
			result = (int) Math.floor(div); 
		}
		return result;
	}
	
	
	public int resetMilk() {
		milk.setNumOfPackets(0);
		milk.setNumOfBags(0);
		return 0;
	}
	
	public void resetEgg() {
		egg.setEggQunatitiy(0);
		egg.setNumOfTray(0);
	}
	
	public void reset() {
		milk.setNumOfPackets(0);
		milk.setNumOfBags(0);
		egg.setEggQunatitiy(0);
		egg.setNumOfTray(0);
	}
	
}
