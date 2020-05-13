package com.jit.hashcodeequals;

public class Employee {
	private int empId;
	private String empName;
	private String cmpnyName;

	public Employee(int empId, String empName, String cmpnyName) {
		this.empId = empId;
		this.empName = empName;
		this.cmpnyName = cmpnyName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCmpnyName() {
		return cmpnyName;
	}

	public void setCmpnyName(String cmpnyName) {
		this.cmpnyName = cmpnyName;
	}

	@Override
	public String toString() {
		return "" + "empId= " + empId + ", empName=" + empName + ", cmpnyName=" + cmpnyName + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cmpnyName == null) ? 0 : cmpnyName.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		try {
			Employee e = (Employee) obj;
			if (this.empId == e.empId && this.empName.equals(e.empName) && this.cmpnyName.equals(e.cmpnyName)) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

}
