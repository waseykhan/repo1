package count;


public class TestCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Milk m1 = new Milk("regular");
		System.out.println("default number of packets = " +  m1.getNumOfPackets() + " count = " + Milk.cloneNumBags);
		
		Milk m2 = new Milk("not regular", 2.5, 3);
		System.out.println("not regular packs = " + m2.getNumOfPackets());
		Counter c = new Counter(m2);
		System.out.println(c.checkNumofBags(m2.getNumOfPackets()));
		m2.setNumOfPackets(c.decrementunitMilk(m2.getNumOfPackets()));
		System.out.println("Check = " + m2.getNumOfPackets());
		System.out.println("num of bags = " + c.checkNumofBags(m2.getNumOfPackets()) + " num of packets " + m2.getNumOfPackets());
		
		Milk m3 = new Milk(m1);
		System.out.println("cloned regular packs = " + m3.getNumOfPackets() + " cloned bags " + Milk.cloneNumBags);
		
		Egg e1 = new Egg("reg eggs", 'S');
		System.out.println(e1.getCompanyName() + " " + e1.getEggQunatitiy());
		
		Egg e2 = new Egg("reg eggs", "yello", 1, 0, 'M');
		Counter c1 = new Counter(e2);
		System.out.println(e2.getCompanyName() + " " + e2.getEggQunatitiy());
		e2.setEggQunatitiy(c1.decrementunitEgg(e2.getEggQunatitiy()));
		System.out.println(e2.getEggQunatitiy());
		e2.setEggQunatitiy(c1.decrementunitEgg(e2.getEggQunatitiy()));
		System.out.println(e2.getEggQunatitiy());
		
		Egg e3 = new Egg(e2);
		Counter c2 = new Counter(m3, e3);
		System.out.println("Cloned regular eggs = " + e3.getCompanyName() + " " + e3.getEggQunatitiy());
		c2.decrementUnit(e3.getEggQunatitiy(), m3.getNumOfPackets());
		System.out.println("egg = " + e3.getEggQunatitiy() + " milk = " + m3.getNumOfPackets());
		System.out.println("result = " + c2.checkNumofBags(m3.getNumOfPackets()));
		c2.decrementEggsVariable(e3.getEggQunatitiy(), 3);
		System.out.println("Num of eggs after subtracting by 3 = " + e3.getEggQunatitiy());
		c2.decrementunitMilkVariable(m3.getNumOfPackets(), 1);
		System.out.println("Value of milk packets after subtracting by 1 = " + m3.getNumOfPackets());
		c2.decrementMilkEggsVariable(e3.getEggQunatitiy(), 3, m3.getNumOfPackets(), 1);
		System.out.println("value of milk and eggs after subtracting by 3 and 1 = " + e3.getEggQunatitiy() + " : " + m3.getNumOfPackets());
		
		System.out.println("default number of packets = " +  m1.getNumOfPackets());
		int j = c2.resetMilk();
		m1.setNumOfPackets(j);
		System.out.println("default number of packets After reset = " +  m1.getNumOfPackets());
		
		
	}

}
