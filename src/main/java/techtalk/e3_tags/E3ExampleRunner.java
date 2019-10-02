package techtalk.e3_tags;

import techtalk.pojos.PersonDetails;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class E3ExampleRunner {
    public static void main(String[] args) throws FileNotFoundException {
        Yaml yml = new Yaml();
        PersonDetails personDetails = yml.loadAs(new FileReader(new File("src\\main\\java\\com\\techtalk\\e3_tags\\personDetails.yaml")), PersonDetails.class);
        System.out.println(personDetails);
    }
}
