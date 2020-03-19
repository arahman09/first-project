package constructor;

public class TestComputer {

	public static void main(String[] args) {
		Computer dell1 = new Computer();
		dell1.setComputerModel("inspiron1000");
		String model1 = dell1.getComputerModel();
		System.out.println(model1);
		
		Computer dell2 = new Computer();
		dell2.setComputerModel("inspiron2000");
		String model2 = dell2.getComputerModel();
		System.out.println(model2);
		
		Computer dell3 = new Computer("inspiron3000");
		String model3 = dell3.getComputerModel();
		System.out.println(model3);
		
		Computer dell4 = new Computer("inspiron4000", 16);
		String model4 = dell4.getComputerModel();
		int ram = dell4.getComputerRamSize();
		System.out.println(model4 + " Ram: "+ ram);
		

	}

}
