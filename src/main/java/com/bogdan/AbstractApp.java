package com.bogdan;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 *
 * @author Bogdan
 */

public abstract class AbstractApp {

    /**
     *
     *
     * @author Bogdan
     */
    public static void main(final String param) throws HobbyException {

        final Logger log = Logger.getLogger(AbstractApp.class.getName());

        final Hobby[] Arr_r = new Hobby[4];

        log.fine("Hello, tell me some information about u");

        final Scanner scn = new Scanner(System.in, "UTF-8");

        log.fine("What is ur name");
        final String name = scn.nextLine();

        log.fine("How old are u?");
        final int age = scn.nextInt();

        log.fine("What is ur favourite dish?");
        final String dish = scn.next();

        log.fine("How long have u been cooking?");
        final int howlong = scn.nextInt();


        final Hobby obj1 = new Cooking(name, age, dish, howlong);
        final Hobby obj2 = new Cooking("John", 19, "cream soup", 3);

        log.fine("What is ur name");
        final String name1 = scn.next();

        log.fine("How old are u?");
        final int age1 = scn.nextInt();

        log.fine("The height of the largest wave u seen");
        final int high = scn.nextInt();

        log.fine("Where are u surfing?");
        final String place = scn.next();

        final Hobby obj3 = new Surfing(name1, age1, high, place);
        final Hobby obj4 = new Surfing("Nick", 19, 5, "Gold Coast");

        Arr_r[0] = obj1;
        Arr_r[1] = obj2;
        Arr_r[2] = obj3;
        Arr_r[3] = obj4;


        for (final Hobby b : Arr_r)
        {
            try
            {
                b.tellAboutHobby();
            } catch(HobbyException ex)
            {
                System.err.println(ex.getMessage());
            }

        }

    }
}

