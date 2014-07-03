package com.cybozu.labs.langdetect;

import com.cybozu.labs.langdetect.profiles.defaultprofile.DefaultProfile;
import com.cybozu.labs.langdetect.util.Utils;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Maxence on 03/07/2014.
 */
public class main {
    public static void main(String[] Args) throws FileNotFoundException {
        Utils utility = new Utils();
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Détecter la langue à partir d'un fichier");
        System.out.println("2-Détecter la langue à partir d'un texte entré manuellement");
        String answer = sc.next();

        if (answer.equals("1")) {
            System.out.println("Spécifiez le chemin...");
            String path = sc.next();
            sc.close();
            input = utility.lireFichier(path);
            try {
                DetectorFactory.loadProfile(new DefaultProfile()); // SmProfile is also available
                Detector detector = DetectorFactory.create();
                detector.append(input);
                String result = detector.detect();
                System.out.println("result : "+result);
            } catch (LangDetectException e) {
                e.printStackTrace();
            }

        } else if (answer.equals("2")) {
            System.out.println("Très bien , donnez maintenant une chaine de caractère...");

            input = sc.next();
            sc.close();
            try {
                DetectorFactory.loadProfile(new DefaultProfile()); // SmProfile is also available
                Detector detector = DetectorFactory.create();
                detector.append(input);
                String result = detector.detect();
                System.out.println("result : "+result);
            } catch (LangDetectException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Je n'ai pas compris !");
        }





// maybe work with detector.getProbabilities()
    }
}
