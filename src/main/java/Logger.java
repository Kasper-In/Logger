import java.text.SimpleDateFormat;
import java.util.Date;

public final class Logger {

    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    protected int num = 1;

    public void log(String msg) {
        String date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
        System.out.println("[" + date +  " " + num++ + "] " + msg);
    }
}
