package ua.vodafone.homeworks.classes.musicstyles;

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
