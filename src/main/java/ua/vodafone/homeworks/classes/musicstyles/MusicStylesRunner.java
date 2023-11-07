package ua.vodafone.homeworks.classes.musicstyles;

import ua.vodafone.homeworks.classes.smartphones.Androids;
import ua.vodafone.homeworks.classes.smartphones.Iphone;
import ua.vodafone.homeworks.classes.smartphones.Smartphones;

public class MusicStylesRunner {
    public static void main(String[] args) {
        MusicStyles[] bands = {
                new PopMusic("Spice Girls"),
                new ClassicMusic("Symphony Orchestra"),
                new RockMusic("Linkin Park")
        };
        for (MusicStyles band : bands) {
            band.playMusic();
        }

    }

}
