package count;

public class Egg {
	private String companyName;
	private String eggType;
	private int eggQunatitiy;
	private char traySize;
	private int numOfTray;
	boolean cond = true;
	
	public Egg(String companyName, char traySize) {
		this(companyName, null, 1, 0, traySize);
	}
	
	public Egg(String companyName, String eggType, int numOfTray, int eggQuantitiy, char traySize) {
		this.companyName = companyName;
		this.eggType = eggType;
		this.numOfTray = numOfTray;
		this.traySize = traySize;
		this.eggQunatitiy = eggQuantitiy;
	}
	
	/*
	 * if num of tray is greater than 1 use the copy constructor
	 * */
	public Egg(Egg obj) {
		this.companyName = obj.companyName;
		this.eggType = obj.eggType;
		this.eggQunatitiy = obj.eggQunatitiy;
		this.traySize = obj.traySize;
		this.numOfTray = obj.numOfTray;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEggType() {
		return eggType;
	}

	public void setEggType(String eggType) {
		this.eggType = eggType;
	}

	public int getEggQunatitiy() {
		if((this.traySize == 'S' || this.traySize == 's') && cond) {
			eggQunatitiy = this.numOfTray * 12;
		}else if((this.traySize == 'M' || this.traySize == 'm') && cond) {
			eggQunatitiy = this.numOfTray * 15;
		}else if((this.traySize == 'L' || this.traySize == 'l') && cond) {
			eggQunatitiy = this.numOfTray * 24;
		}
		return this.eggQunatitiy;
	}

	public void setEggQunatitiy(int eggQunatitiy) {
		cond = false;
		this.eggQunatitiy = eggQunatitiy;
	}

	public char getTraySize() {
		return traySize;
	}

	public void setTraySize(char traySize) {
		this.traySize = traySize;
	}

	public int getNumOfTray() {
		return numOfTray;
	}

	public void setNumOfTray(int numOfTray) {
		this.numOfTray = numOfTray;
	}
}
