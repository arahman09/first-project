package constructor;

public class Computer {
	String computerModel;
	int ramSize;
	
    public Computer() {}
	
	public Computer(String computerModel) {
		this.computerModel = computerModel;
	}
	
	public Computer(String computerModel, int ramSize) {
		this.computerModel = computerModel;
		this.ramSize = ramSize;
	}
	
	public void setComputerModel(String computerModel) {
		this.computerModel = computerModel;
	}
	
	public String getComputerModel() {
		return computerModel;
	}
	
	public int getComputerRamSize() {
		return ramSize;
	}
	
	public void getValue() {
		int total = 10;
		System.out.println(total);
	}
	
	

}
