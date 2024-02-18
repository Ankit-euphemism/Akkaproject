package COM_ANK;
public class EMPLOYEE{
    public static void main(String[] args) {
        String S="Hello Everyone";
           System.out.println(S.toString());
           System.out.println();
           Empl var=new Empl("Ankit",50000,"Viram Khand-3,Gomti Nagar,Lucknow");
             System.out.println(var.toString());
              // var.setEmpName("Ankit");
             // System.out.println(var.getEmpName());
             // var.setEmpSalary(50000);
             //    System.out.println(var.getEmpSalary());
             // var.setEmpAddress("Viram Khand-3,Gomti Nagar,Lucknow");
             //    System.out.println(var.getEmpAddress());
     }     
}
class Empl{
    public Empl(String empName, int empSalary, String empAddress) {
        EmpName = empName;
        EmpSalary = empSalary;
        EmpAddress = empAddress;
    }

    private String EmpName;
     private int EmpSalary;
      private String EmpAddress;
    public String getEmpName() {
        return EmpName;
    }
    public void setEmpName(String empName) {
        this.EmpName = empName;
    }
    public int getEmpSalary() {
        return EmpSalary;
    }
    public void setEmpSalary(int empSalary) {
        this.EmpSalary = empSalary;
    }
    public String getEmpAddress() {
        return EmpAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.EmpAddress = empAddress;
    }
     @Override
    public String toString(){
        return "\nMy Details:-"+EmpName+" "+"\nEarning:"+EmpSalary+" "+"\nResidency"+EmpAddress+"";
    }
}