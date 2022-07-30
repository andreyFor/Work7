public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("задание номер 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "ФИО сотрудника - " + lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        System.out.println("задание номер 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("задание номер 3");

        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println(fullName1);

        System.out.println("задание номер 4");

        String fullName2 = "Ivanov Ivan Ivanovich";
        System.out.println(fullName2.indexOf('I'));
        System.out.println(fullName2.indexOf(' '));
        System.out.println(fullName2.indexOf('I',6));
        System.out.println(fullName2.indexOf(' ',7));
        System.out.println(fullName2.lastIndexOf('I'));
        System.out.println(fullName2.lastIndexOf('h'));
        String firstName2 = fullName2.substring(7,11);
        String middleName2 = fullName2.substring(0,6);
        String lastName2 = fullName2.substring(12,21);
        System.out.println("Имя сотруднеика - " + firstName2);
        System.out.println("Фамилия сотруднеика - " + middleName2);
        System.out.println("Отчество сотруднеика - " + lastName2);
    }
}