package com.example.android.jokelibrary;

import java.util.Random;

public class Jokes {
    static String[] jokes = {"What is the best thing about Switzerland?\n" +
            "No idea, but the flag is a big plus.",
            "Did you hear about the mathematician who is afraid of negative numbers?\n" +
                    "He will stop at nothing to avoid them.",
            "Why do we tell actors to break a leg?\n" +
                    "Because every play has a cast.",
            "Hear about the new restaurant called Karma?\n" +
                    "There is no menu: You get what you deserve.",
            "Did you hear about the claustrophobic astronaut?\n" +
                    "He just needed a little space."};
    public static String getJoke() {
        return jokes[new Random().nextInt(5)];
    }
}