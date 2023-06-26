import java.util.Timer;

public class main {
    public static void main(String[] args) {
        Timer t = new Timer();
        CronJobPlazo mTask = new CronJobPlazo();

        t.scheduleAtFixedRate(mTask,0,10000 );
    }

}
