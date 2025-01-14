package Tema3;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {

    public static List<Mobilier> citire() {
        try {
            File file=new File("src/main/resources/mobilier.json");
            ObjectMapper mapper=new ObjectMapper();
            List<Mobilier> mobiliere = mapper.readValue(file, new TypeReference<List<Mobilier>>(){});
            return mobiliere;
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void afisareMobila(List<Mobilier> mobilia)
    {
        for(Mobilier mobilier : mobilia)
        {
            System.out.println("Mobilier: "+mobilier.getNume());
            System.out.println("Placi: ");
            for(Placa placa:mobilier.getPlaci())
            {
                System.out.println(" - "+placa.toString());
            }
            System.out.println();
        }
    }
    public static void afisarePlaci(List<Mobilier> mobila,String numeMobila)
    {
        for(Mobilier mobilier : mobila)
        {
            for(Placa placa:mobilier.getPlaci())
            {
                System.out.println(placa.toString());
            }
        }
    }

    public static void main(String[] args) {
        int opt;
        Scanner scanner1=new Scanner(System.in);
        List<Mobilier> mobile=citire();
        do{
            System.out.println("\n Meniu");
            System.out.println("\n1. Citește datele din mobilier");
            System.out.println("\n2. Afişează elementele de mobilier din colecție şi plăcile care le compun");
            System.out.println("\n 3.Afişează caracteristicile plăcilor care compun o anumită piesă de mobilier");
            System.out.println("\n Alegeti o optiune: ");
            opt=scanner1.nextInt();

            switch(opt){
                case 1:
                    for(Mobilier m: mobile)
                    {
                        System.out.println(mobile);
                    }
                    break;
                case 2:
                    afisareMobila(mobile);
                    break;
                case 3:
                    System.out.println("Dati numele mobilierului: ");
                    String numeMobila = scanner1.next();
                    afisarePlaci(mobile,numeMobila);
                    break;
            }
        }while(opt!=0);
        scanner1.close();
    }
}
