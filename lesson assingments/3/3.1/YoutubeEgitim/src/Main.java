public class Main {
    public static void main(String[] args) {

/*        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;

        System.out.println(sayi1);*/

/*        int[] sayilar1 = {1,2,3};
        int[] sayilar2 = {10,20,30};

        sayilar1 = sayilar2;

        sayilar2[0]= 1000;

        System.out.println(sayilar1[0]);*/

        // dakika 47.54 de kalındı

/*        CreditManager creditManager = new CreditManager();

        creditManager.calculate();
        creditManager.save();*/

/*        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Gaziantep");

        Company company = new Company();
        company.setCompanyName("Arcelik");
        company.setTaxNumber("12312123123");
        company.setId(1);

        Customer customer1 = new Customer();
        Customer customer2 = new Company();
        Customer customer3 = new Person();

        CustomerManager customerManager = new CustomerManager(new Company());
        customerManager.save(company);
        customerManager.delete(company);*/

        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.giveCredit();
    }


}