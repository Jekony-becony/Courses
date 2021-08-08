package Courses;

class Sotrydnik {
    private String fio;
    private String doljnost;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public void Start() {
        Sotrydnik[] sotrydnikiArray = CreateWorkerArray();
        ShowInfo();
        ShowInfoArray(sotrydnikiArray);
        ShowInfoOver40Years(sotrydnikiArray);

    }


    public Sotrydnik(String fio, String doljnost, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.doljnost = doljnost;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    private void ShowInfoArray(Sotrydnik[] m) {

        for (int i = 0; i < m.length; i++) {
            System.out.println("Info ¹" + (i + 1));
            System.out.println("Fio:" + m[i].fio);
            System.out.println("Doljnost:" + m[i].doljnost);
            System.out.println("Email:" + m[i].email);
            System.out.println("PhoneNumber:" + m[i].phoneNumber);
            System.out.println("Salary:" + m[i].salary);
            System.out.println("Age:" + m[i].age);
            System.out.println("--------------------");
        }
    }

    private void ShowInfoOver40Years(Sotrydnik[] m) {
        System.out.println("");
        System.out.println("The list of worker over 40 y.o: ");
        System.out.println("");
        for (int i = 0; i < m.length; i++) {
            if (m[i].age > 40) {
                System.out.println("Info ¹" + (i + 1));
                System.out.println("Fio:" + m[i].fio);
                System.out.println("Doljnost:" + m[i].doljnost);
                System.out.println("Email:" + m[i].email);
                System.out.println("PhoneNumber:" + m[i].phoneNumber);
                System.out.println("Salary:" + m[i].salary);
                System.out.println("Age:" + m[i].age);
                System.out.println("--------------------");
            }
        }
    }

    private void ShowInfo() {
        System.out.println("Main info:");
        System.out.println("Fio:" + fio);
        System.out.println("Doljnost:" + doljnost);
        System.out.println("Email:" + email);
        System.out.println("PhoneNumber:" + phoneNumber);
        System.out.println("Salary:" + salary);
        System.out.println("Age:" + age);
        System.out.println("--------------------");
    }

    private Sotrydnik[] CreateWorkerArray() {
        Sotrydnik[] sotrydniksArray = new Sotrydnik[5];
        sotrydniksArray[0] = new Sotrydnik("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        sotrydniksArray[1] = new Sotrydnik("Arbuzor Arbuz", "Engineer1", "Arbuz@mailbox.com", "123456789", 31000, 46);
        sotrydniksArray[2] = new Sotrydnik("Valerun Valeri", "Engineer2", "Valeri@mailbox.com", "098765432", 32000, 51);
        sotrydniksArray[3] = new Sotrydnik("Olexandrov Olexandr", "Engineer3", "Olexandr@mailbox.com", "852895258", 33000, 28);
        sotrydniksArray[4] = new Sotrydnik("Vitaliov Vitalii", "Engineer4", "Vitalii@mailbox.com", "530265938", 34000, 40);
        return sotrydniksArray;
    }


}