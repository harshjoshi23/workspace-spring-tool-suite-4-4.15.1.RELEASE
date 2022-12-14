package example.demo;

public class Insurance {
	
	private long policyNumber; 
	private String policyHolderName; 
	private double policyAmount;
	
	
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(long policyNumber, String policyHolderName, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
	}
	/**
	 * @return the policyNumber
	 */
	public long getPolicyNumber() {
		return policyNumber;
	}
	/**
	 * @param policyNumber the policyNumber to set
	 */
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	/**
	 * @return the policyHolderName
	 */
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	/**
	 * @param policyHolderName the policyHolderName to set
	 */
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	/**
	 * @return the policyAmount
	 */
	public double getPolicyAmount() {
		return policyAmount;
	}
	/**
	 * @param policyAmount the policyAmount to set
	 */
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	
	@Override
	public String toString() {
//		return super.toString();
//		return this.policyNumber+", " +this.policyHolderName+", "+this.policyAmount+", \n"+super.toString();
		//using string buffer
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.policyNumber).append(", ").append(this.policyHolderName).append(", ").append(this.policyAmount);
		return buffer.toString();
		
	} 
	
	// Writing our own method and overriding it in the sub class 
	
	// Defining the method 
//	public double calculatePremium() {
	protected double calculatePremium() {

		double premium = 5000; 
		if(this.policyAmount > 100000)
			premium = 6000;
		return premium;
	}
	
	

}
