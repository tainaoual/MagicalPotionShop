package com.company;

public class MagicalPotion {
    public String name;
    public String effect;




    public MagicalPotion() {

     this.name = "glamour";
     this.effect ="make you happy" ;
}

    public MagicalPotion(String name, String effect) {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEffect() {
        return effect;
    }
    public void setEffect(String effect) {
        this.effect = effect;
    }
    public void addName(String name) {
    }
}


