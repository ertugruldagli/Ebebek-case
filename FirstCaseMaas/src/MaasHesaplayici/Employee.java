package MaasHesaplayici;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    double vergi;
    double maas;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

     public void tax(){
        tostring();
        if (this.salary>1000) {
            vergi = this.salary * 0.03;
            maas = this.salary - vergi;
            System.out.println("vergili maasi: " + maas);
        }
    }



     public void bonus(){
        if(this.workHours>40){
                while(true){
                    this.salary+=30;
                }
        }
    }



    public void raiseSalary(){
        double year=2021-this.hireYear;
        double yeni=0.0;

        if (year<9){
            yeni=this.salary*0.05;
            yeni+=this.salary;
            System.out.println("zamli maasi: " + yeni);
        } else if (year>=9 && year<20) {
            yeni=this.salary*0.10;
            yeni+=this.salary;
            System.out.println("zamli maasi: " + yeni);
        }else{
            yeni=this.salary*0.15;
            yeni+=this.salary;
            System.out.println("zamli maasi: " + yeni);
        }

    }

     public void tostring(){
         System.out.println("Calisanin adi: " + this.name);
         System.out.println("Calisanin maasi: " + this.salary);
         System.out.println("Calisanin haftalik calisma saati: " + this.workHours);
         System.out.println("Calisanin ise baslangic yili: " + this.hireYear);

    }
}
