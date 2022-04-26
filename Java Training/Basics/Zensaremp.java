package Basics;

import java.util.Scanner;

public class Zensaremp {
    String Ename;
    String Erole;
    double Esalary;
    String dob;
    double exp;


    
    @Override
    public String toString() {
        return "Zensaremp [Ename=" + Ename + ", Erole=" + Erole + ", Esalary=" + Esalary + ", dob=" + dob + ", exp="
                + exp + "]";
    }
    public String getEname() {
        return Ename;
    }
    public void setEname(String ename) {
        Ename = ename;
    }
    public String getErole() {
        return Erole;
    }
    public void setErole(String erole) {
        Erole = erole;
    }
    public double getEsalary() {
        return Esalary;
    }
    public void setEsalary(double esalary) {
        Esalary = esalary;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public double getExp() {
        return exp;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }
    
    public Zensaremp(String ename, String erole, double esalary, String dob, double exp) {
        Ename = ename;
        Erole = erole;
        Esalary = esalary;
        this.dob = dob;
        this.exp = exp;
    }
}
class Employeesystem{
    static Scanner sc = new Scanner(System.in);
    private static Employee  addEmployee();
}

    
    
}
