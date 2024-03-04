public class DataBase {
    CreateUser createUser;
    FileWriterData file;
    public static void recordData(String dataPeople, String pathDB) {
        checkInput(dataPeople);//проверить кол-во введенных данных
        String currentData = CreateUser.createUser(dataPeople);// соберем строку для записи в нужном формате
        FileWriterData.fileWriter(currentData, pathDB); // запись строки (линии) в файл
    }

    public static void checkInput(String dataPeople) {
        CheckInputData.emptyStringException(dataPeople) ; //проверка что строка непустая
        CheckInputData.countInputException(dataPeople); // проверка что данных достаточно
    }
}
