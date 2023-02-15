package entities;

public class Employee {
	
	private String name;
	protected Integer hours;
	protected Double valueHr;
	
	
	public Employee() {
		
	}
	
	
	public Employee(String name, Integer hours, Double valueHr) {
		
		this.name = name;
		this.hours = hours;
		this.valueHr = valueHr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValueHr() {
		return valueHr;
	}
	public void setValueHr(Double valueHr) {
		this.valueHr = valueHr;
	}
	
	@Override
	public String toString() {
		return "name = " + name + "";
	}
	
	public Double payment(){
		return hours * valueHr;		
		
	}

	
	
}
