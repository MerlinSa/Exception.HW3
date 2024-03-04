import java.io.*;


public class FileWriterData {
    public static void fileWriter(String dataPeople, String pathDB) {
        String[] currentPeople = dataPeople.split(" ");
        String pathFile = pathDB + currentPeople[0];
        try (FileWriter writer = new FileWriter(pathFile, true)) {
            writer.write(dataPeople + "\n");

        } catch (IOException e) {
            System.out.println("ошибка записи данных: указанный путь не существует. " + e.getClass().getSimpleName());
            e.printStackTrace();
        }
    }

}




