package ua.vodafone.homeworks.classes.musicstyles;

public class PopMusic extends MusicStyles {

    public PopMusic(String name) {

        this.name = name;

    }

    @Override
    public void playMusic() {
        System.out.println(name + " plays Pop music.");
    }
}
