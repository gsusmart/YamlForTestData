package techtalk.e1_syntax;

import techtalk.pojos.PersonDetails;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class E1_SyntaxRunner {
    public static void main(String[] args) throws FileNotFoundException {
        Yaml yml = new Yaml();
        PersonDetails personDetails = yml.loadAs(new FileReader(new File("src\\main\\java\\com\\techtalk\\e1_syntax\\personDetails.yml")), PersonDetails.class);
        System.out.println(personDetails);
    }
}
