package Tema2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main1
{
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/numere.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        try {
            File file=new File("src/main/resources/numere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> numere = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return numere;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        List<PerecheNumere> numere = citire();
        System.out.println(numere);

        for (PerecheNumere p : numere) {
            System.out.println(p);
            System.out.println("Consecutive Fibonacci: " + p.suntConsecutive());
            System.out.println("CMMMC: " + p.cmmmc());
        }
        numere.add(new PerecheNumere(10, 33));
        scriere(numere);
    }
}
