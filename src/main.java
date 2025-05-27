import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> zahlenListe = new ArrayList<>(List.of(5,9,3,2,90,74));
        int laengeZahlenListe = zahlenListe.size();

        System.out.println("Unsortierte Liste:" + zahlenListe);

        for (int i=0; i < laengeZahlenListe; i++){

            for(int j=0; j < laengeZahlenListe-i-1; j++)
                {if (zahlenListe.get(j) > zahlenListe.get(j+1)){
                    int helpVar = zahlenListe.get(j);
                    zahlenListe.set(j, zahlenListe.get(j+1));
                    zahlenListe.set(j+1, helpVar);
            }

            }
        }
        System.out.println("Sortierte Liste: " + zahlenListe);
    }
}
