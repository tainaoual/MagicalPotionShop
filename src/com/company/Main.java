package com.company;

import com.sun.beans.introspect.PropertyInfo;

//   Create a MagicalPotionShop class, this class needs a field called potions.
//        The potions field should be an ArrayList of the type Potion.
//        Create a MagicalPotion class, this class needs two fields one called name,
//        the other called effect. Both of the fields should be Strings.
public class Main {

    public static void main(String[] args) {
        // write your code here
        potions potions0 = new potions("");
          Type type1 = new Type("LOVE");
        System.out.println();
        System.out.println("portion0  is " + potions0.portion);
        System.out.println("portion0 type  is " + type1.types);
        MagicalPotion magicalPotion = new MagicalPotion();
        System.out.println("magicalpotion "+magicalPotion.name+magicalPotion.effect );

    }}