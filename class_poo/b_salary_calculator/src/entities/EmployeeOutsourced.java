package entities;

public class EmployeeOutsourced extends Employee  {
	private Double addCharge;
	
	
	public EmployeeOutsourced() {
		
	}


	public EmployeeOutsourced(String name, Integer hours, Double valueHr, Double addCharge) {
		super(name, hours, valueHr);
		this.addCharge = addCharge;
	}


	public Double getAddCharge() {
		return addCharge;
	}


	public void setAddCharge(Double addCharge) {
		this.addCharge = addCharge;
	}
	
	@Override
	public Double payment(){
				
		return super.payment() + (this.addCharge * 1.1) ;
	}
	
	
	
}
