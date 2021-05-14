
public class Employee {
	 private Integer empid;
	    private String empname;
	    public Employee(Integer empid, String empname) {
	        this.empid = empid;
	        this.empname = empname;
	    }
	    @Override
	    public boolean equals(Object o) {
	        return true;
	    }
	    @Override
	    public int hashCode() {
	        return 15256;
	    }
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "empid=" + empid +
	                ", empname='" + empname + '\'' +
	                '}';
	    }

}
