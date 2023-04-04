package Apr03.Employee;

public class Employee {
    private String id,fname,lname;
    Employee(String id,String fname,String lname){
        this.id=id;
        this.fname=fname;
        this.lname=lname;
    }
    public String getRegnum() {
        return id;
    }
    public void setRegnum(String id) {
        this.id = id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public String createShortName(){
        return this.fname.charAt(0)+". "+this.lname;
    }
}
