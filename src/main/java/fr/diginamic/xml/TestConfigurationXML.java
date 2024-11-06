package fr.diginamic.xml;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class TestConfigurationXML {
    public static void main(String[] args) {

        Configurations configs = new Configurations();

        try {
            XMLConfiguration config = configs.xml("fichier.xml");
            String nomHost = config.getString("database.host");
            String nomBase = config.getString("database[@nom]");
            System.out.println(nomBase);
            System.out.println(nomHost);
            Iterator<String> iterkeys = config.getKeys();
            while(iterkeys.hasNext()){
                System.out.println(iterkeys.next());
            }
        } catch (ConfigurationException e) {
            throw new RuntimeException(e);
        }


//        Path pathfile = Paths.get("src\\main\\resources\\fichier.xml");
//        try {
//            List<String> lines = Files.readAllLines(pathfile, StandardCharsets.UTF_8);
//            for (String line : lines) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
