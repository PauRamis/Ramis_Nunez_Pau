import com.esliceu.controller.MeteoritController;
import com.esliceu.model.Meteorit;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        MeteoritController asteroidController = new MeteoritController();
        List<Meteorit> meteorits = asteroidController.getAsteroids();

        for (Meteorit meteorit : meteorits) {
            System.out.println(meteorit);
        }
    }
}
