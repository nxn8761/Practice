package com.naga.beans;

public class EmpBean 
{
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpBean other = (EmpBean) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	private int empId;
	
	private int empName;

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public int getEmpName()
	{
		return empName;
	}

	public void setEmpName(int empName)
	{
		this.empName = empName;
	}
	
}
