package com.cybozu.labs.langdetect.util;

import java.io.*;
import java.util.ArrayList;
import com.google.common.base.Joiner;

/**
 * Created by Maxence on 03/07/2014.
 */
public class Utils {
    public String lireFichier(String path) throws FileNotFoundException {
    ArrayList<String> stringList = new ArrayList<String>();
    try{
        InputStream flux = new FileInputStream(path);
        InputStreamReader lecture = new InputStreamReader(flux);
        BufferedReader buff = new BufferedReader(lecture);
        String ligne;
        while((ligne=buff.readLine())!=null){
            stringList.add(ligne);
        }
        buff.close();
    }
    catch (Exception e){
        System.out.println(e.toString());
    }
    Joiner joiner =  Joiner.on("");
    String finalString = joiner.join(stringList);
    return finalString;
}
}
