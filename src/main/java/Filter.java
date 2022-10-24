import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        int count = 0;
        List<Integer> result = new ArrayList<>();
        for (Integer element : source) {
            if (element > treshold){
                result.add(element);
                logger.log("Элемент " + element + " проходит");
                count++;
            } else {
                logger.log("Элемент " + element + " не проходит") ;
            }
        }
        logger.log("Прошло " + count + " элементов из " + source.size());
        return result;
    }
}
