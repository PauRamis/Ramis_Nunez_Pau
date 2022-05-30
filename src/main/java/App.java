import com.esliceu.controller.AsteroidController;
import com.esliceu.model.Asteroid;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        AsteroidController asteroidController = new AsteroidController();
        List<Asteroid> meteorits = asteroidController.getAsteroids();

        for (Asteroid meteorit : meteorits) {
            System.out.println(meteorit);
        }
    }
}
