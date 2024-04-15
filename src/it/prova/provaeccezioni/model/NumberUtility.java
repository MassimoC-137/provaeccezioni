package it.prova.provaeccezioni.model;

import java.util.Scanner;

public class NumberUtility {

    public static  Integer parsFomIntToString(String daConvertire) {

        Integer result = null;

        try {
            result = Integer.parseInt(daConvertire);
            }catch(NumberFormatException e){
                result = null;
            }
        return result;

    }

}