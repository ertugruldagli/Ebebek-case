package MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
        //VERGİ HESAPLAMA
    public double tax(){
        if(this.salary<1000){
            return this.salary;
        }else{
            return this.salary*0.03;
        }
    }


    //BONUS HESAPLAMA
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30; //Calisma saatinden, istenilen saati cikarip 30 ile çarpıyoruz.
        }else{
            return 0;
        }
    }


      //ZAM HESAPLAMA
    public double raiseSalary(){
        int year=2021-this.hireYear;

        if(year>19) {
            return this.salary*0.15;
        }else if(year>9 && year <20){
            return this.salary*0.10;
        }
        else {
            return this.salary*0.05;
        }
    }

        //PERSONEL INFO
    public void tostring(){
        System.out.println("ad: " + this.name);
        System.out.println("Maas: " + this.salary);
        System.out.println("Haftalik Calisma Saati: " + this.workHours);
        System.out.println("Ise Giris yili: " + this.hireYear);
        System.out.println("---------------------------");
        System.out.println("Vergi: " + tax());
        System.out.println("bonus: " + bonus());
        System.out.println("---------------------------");
        System.out.println("Maas Artisi: " + raiseSalary());
        System.out.println("---------------------------");
        System.out.println("Vergi ve bonuslarla birlikte maas: " +  (this.salary - tax() +bonus()));
        System.out.println("Toplam maas: " +  (this.salary +bonus()));
    }
}

