package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Пришлый Иван Сергеевич","Директор","director@mail.ru","894537984",100001,41);
        persArray[1] = new Employee("Петухова Анастасия Сергеевна","Главный бухгалтер","nastya@mail.ru","894532638",60000,25);
        persArray[2] = new Employee("Бондаренко Алексей Юрьевич","Заместитель директора","bondar@mail.ru","894532233",90000,70);
        persArray[3] = new Employee("Хоменко Стефания Игоревна", "Секретарь","xomyachok@mail.ru","894535117",60000,27);
        persArray[4] = new Employee("Мазур Андрей Николаевич","Водитель", "rulit@mail.ru","894672218", 55000,47);

        for (Employee employee : persArray) {
            if (employee.age > 40) employee.printInfo();
        }
    }
}
