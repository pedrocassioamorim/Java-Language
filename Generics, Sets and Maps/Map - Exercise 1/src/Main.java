import entities.Politico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String path = "/home/amorim/IdeaProjects/Generics_Set_Map/Exercicio_FIX_Map/src/votos";
        Map<String, Integer> votes = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)){
                    int votesSoFar = votes.get(name);
                    votes.put(name, count + votesSoFar);
                }
                else {
                    votes.put(name, count);
                }
                line = br.readLine();
            }

            for (String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;







        sc.close();
    }
}