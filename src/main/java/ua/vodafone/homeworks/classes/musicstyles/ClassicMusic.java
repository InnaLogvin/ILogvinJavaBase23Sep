package ua.vodafone.homeworks.classes.musicstyles;

public class ClassicMusic extends MusicStyles {
    private final String name;

    public ClassicMusic(String name) {

        this.name = name;

    }

    @Override
    public void playMusic() {
        System.out.println(name + " plays Classical music.");
    }
}
