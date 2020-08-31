import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercices {
    public List exercice1(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont tous les éléments sont en majuscules
         */
        liste = liste.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList());
        return liste;
    }

    public List exercice2(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont les string "INUTILE" ont été retirées
         */
        liste = liste.stream().filter(
                (str) ->!str.contains("INUTILE")
            ).collect(Collectors.toList());
        return liste;
    }

    public String exercice3(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une string composée
        de toutes les string de la liste concaténées
         */
        String listeString = liste.stream().collect(Collectors.joining());
        return listeString;
    }


    public String exercice4(List<String> liste){
        /*
        Utilisez les streams pour transformer la liste en paramètre de la façon suivante:
        1. Mettre tous les éléments de la liste en majuscule
        2. Retirer tous les éléments "AAA"
        3. Concaténer tous les éléments de la liste pour former une string
         */
        String listeString = liste.stream()
                .map((str) -> str.toUpperCase())
                .filter((str) -> !str.contains("AAA"))
                .collect(Collectors.joining());
        return listeString;
    }

    public List exercice5(List<Integer> liste){
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner une nouvelle liste
        dont les éléments ont été doublés
         */
        liste = liste.stream().map((n) -> n*2).collect(Collectors.toList());
        return liste;
    }

    public Integer exercice6(List<Integer> liste){
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner le produit des éléments de la liste.
         */
        Integer intListe = liste.stream().reduce((acc,pro) -> acc * pro).get();
        return intListe;
    }

    public List exercice7(List<Integer> liste){
        /*
        Utilisez les streams pour trouver tous les éléments dont le carré est supérieur à 50. Retournez une liste.
         */
        liste = liste.stream()
                .map((n) -> n*n).filter((n) -> n > 50)
                .collect(Collectors.toList());
        return liste;
    }

    public List exercice8(List<Integer> liste){
        /*
        Utilisez les streams pour trouver le premier chiffre des nombres de la liste passée en paramètre lorsqu'on
         les multiplie par 9.
         */
        liste = liste.stream()
                .map((n) -> n*9).map((n) -> n.toString())
                .map((str) -> str.substring(0,0))
                .map((str) -> Integer.parseInt(str))
                .collect(Collectors.toList());
        return liste;
    }

    public List exercice9(){
        /*
        Créez un stream infini d'entiers et utilisez le pour trouver les 10 premiers nombres divisibles par 3 et par 7.
         */
        List<Integer> intlist = IntStream.iterate(0,(n) -> n++)
                .boxed()
                .filter((n) -> n % 3 == 0 && n % 7 == 0)
                .limit(10)
                .collect(Collectors.toList());
        return intlist;
    }

    public List exercice10(){
        /*
        Générez la liste des 20 premiers carrés parfaits grâce à un stream infini.
         */
        List<Integer> intList = IntStream.iterate(0, (n) -> n++)
                .boxed()
                .filter((n) -> n % Math.sqrt(n) == 0)
                .limit(20)
                .collect(Collectors.toList());
        return Arrays.asList();
    }
}
