package srl.neotech.dto;

public class DepartmentDTO {

	private String department_id;
	private String department_name;
	
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	
	@Override
	public String toString() {
		return "DepartmentDTO [department_id=" + department_id + ", department_name=" + department_name + "]";
	}
	
	
	
	
	
}
