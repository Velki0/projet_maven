package fr.diginamic.gson;

import com.google.gson.Gson;
import fr.diginamic.Personne;

public class TransformerPersonneEnJson {

    public static void main(String[] args) {

            Gson gson = new Gson();
            // Objet simple
            Personne personne = new Personne("DURAND", 25);
            // Conversion en JSON
            String json = gson.toJson(personne);
            System.out.println(json);

    }

}
