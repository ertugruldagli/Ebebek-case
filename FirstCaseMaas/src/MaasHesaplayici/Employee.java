package MaasHesaplayici;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

     public void tax(int salary){

        if (salary>1000){
            double vergi=salary*0.03;
            double maas=salary-vergi;
        }

    }

     public void bonus(int workHours){
        if(workHours>40){

        }
    }

    public void raiseSalary(){

    }

     public void tostring(){
         System.out.println("Calisanin adi: " + this.name);
         System.out.println("Calisanin maasi: " + this.salary);
         System.out.println("Calisanin haftalik calisma saati: " + this.workHours);
         System.out.println("Calisanin ise baslangic yili: " + this.hireYear);

    }
}
