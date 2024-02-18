package COM_ANK;

public class Staff {
int EmpID;
String EmpName;
String EmpAddress;
int EmpSalary;
 Staff(){
    
    
}
 Staff(int empID ){
    this.EmpID=empID;
 }
 Staff(int empID,String empname){
    this.EmpID=empID;
    this.EmpName=empname;
 }
 Staff(int empID,String empname,String empaddress,int empsalary){
   this.EmpID=empID;
   this.EmpName=empname;
   this.EmpAddress=empaddress;
   this.EmpSalary=empsalary;
 }
 void displaydetails(){
     System.out.println("EmployeID:-"+this.EmpID+"\nEmploye Name:-"+this.EmpName+"\nEmploye Address:-"+this.EmpAddress+"\nEmploye Salary:-"+this.EmpSalary);
 }
    public static void main(String[] args) {
      Staff st=new Staff(13,"Ankit","Gomti Nagar Lucknow",100000);
       
      st.displaydetails();
    }
}
