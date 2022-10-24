import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner sc = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользоваля ввести данные для списка");

        System.out.println("Введите размер списка:");
        int sizeList = sc.nextInt();
        System.out.println("Введите верхнюю границу значений списка:");
        int maxValue = sc.nextInt();

        logger.log("Формируем список");
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < sizeList; i++) {
            randomList.add(random.nextInt(maxValue));
        }

        logger.log("Выводим список на экран");
        System.out.print("Исходный список: ");
        randomList.stream().map(i -> i.toString() + " ").forEach(System.out::print);
        System.out.println();

        logger.log("Просим пользоваля ввести данные для фильтра");

        System.out.println("Введите порог для фильтра:");
        int treshold = sc.nextInt();
        Filter filter = new Filter(treshold);
        List<Integer> resultList = filter.filterOut(randomList);

        logger.log("Выводим новый список на экран");
        System.out.print("Отфильтрованный список: ");
        resultList.stream().map(i -> i.toString() + " ").forEach(System.out::print);
        System.out.println();

        logger.log("Завершаем программу");
    }
}
