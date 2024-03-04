import java.util.ArrayList;
import java.util.Arrays;

public class CheckInputData {
    public static void emptyStringException(String dataPeople) {
        if (dataPeople.isEmpty()) {
            throw new LocalException("Пустые строки вводить нельзя!");
        }
    }

    public static void countInputException(String dataPeople) throws LocalException {

        ArrayList<String> currentPeople = new ArrayList<>(Arrays.asList(dataPeople.split(" ")));
        while (currentPeople.contains("")) {
            currentPeople.remove("");
        }

        if (currentPeople.size() > 6) {
            System.out.println("Ошибка: данные превышают лимит");
            throw new LocalException("данные превышают лимит");
        } else if (currentPeople.size() < 6) {
            System.out.println("Ошибка: мало данных");
            throw new LocalException("мало данных");
        }
    }

    public static void emptyInputData(String item, String description) {
        if (item.isEmpty()) {
            throw new LocalException("в данных отсутствует: " + description);
        }
    }


    public static void fullInputFIO(String[] item, int count) {
        if (count < item.length) {
            throw new LocalException("неполные ФИО: " + String.join(" ", item[0], item[1], item[2]));
        }
    }
}
