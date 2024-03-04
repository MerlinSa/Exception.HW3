import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pathDB = "db.txt"; // путь к файлу базы данных

        System.out.println("введите данные: \n "
                + " \"Фамилия Имя Отчество, дату рождения (dd.mm.yyyy), номер телефона(только цифры), пол(f/m)\"");

        Scanner scanner = new Scanner(System.in);
        DataBase.recordData(scanner.nextLine(), pathDB);

    }
}