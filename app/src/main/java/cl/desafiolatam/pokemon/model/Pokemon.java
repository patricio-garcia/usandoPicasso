package cl.desafiolatam.pokemon.model;

import androidx.annotation.NonNull;

import java.util.Arrays;
import java.util.List;

/*
*************************************************************
***   Pojo que representa un Pokemón con su información   ***
*************************************************************
 */
public class Pokemon {

    private String id;
    private String imageSrc;
    private String name;
    private List<String> labels;

    public Pokemon(String id, String imageSrc, String name, List<String> labels) {
        this.id = id;
        this.imageSrc = imageSrc;
        this.name = name;
        this.labels = labels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @Override
    @NonNull
    public String toString() {
        return "Pokemon{" +
                "id='" + id + '\'' +
                ", imageSrc='" + imageSrc + '\'' +
                ", name='" + name + '\'' +
                ", labels=" + labels +
                '}';
    }

    /*public void create() {
        new Pokemon("", "", "", Arrays.asList(new String[]{"", ""}));
    } */
}
