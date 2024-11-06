package fr.diginamic.props;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;

public class TestConfigurationProps {
    public static void main(String[] args) {
            ResourceBundle config = ResourceBundle.getBundle("fichier");
            String drivername = config.getString("database.driver");
        System.out.println(drivername);

        Path pathfile = Paths.get("src\\main\\resources\\fichier.properties");
        try {
            List<String> lines = Files.readAllLines(pathfile, StandardCharsets.UTF_8);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
