import com.jouhs.model.MowerPosition;
import com.jouhs.service.MowerPositionService;

import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        String filename = "inputData.txt";
        MowerPositionService mowerPositionService = new MowerPositionService();

        try {
            ClassLoader classLoader = App.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(filename);

            Scanner scanner = new Scanner(inputStream);

            int xMaxValue = scanner.nextInt();
            int yMaxValue = scanner.nextInt();

            int scenarioNumber = 0;

            // Ligne suivante si il existe
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                char direction = scanner.next().charAt(0);

                // Ligne suivante
                scanner.nextLine();
                String actions = scanner.nextLine();

                MowerPosition mowerPosition = mowerPositionService.executeActions(actions, x, y, direction, xMaxValue, yMaxValue);

                // Affichage de la position finale de la tondeuse
                scenarioNumber ++;
                logger.info("Résultat du scénario numéro " + scenarioNumber + " ==> " + mowerPosition.getCurrentMowerPosition());
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
