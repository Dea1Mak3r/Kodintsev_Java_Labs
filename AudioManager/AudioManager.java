package AudioManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AudioManager {
    private static AudioManager instance;
    private int soundVolume;

    private AudioManager() {
        soundVolume = 50; // Значение по умолчанию
    }

    public static AudioManager getInstance() {
        if (instance == null) {
            instance = new AudioManager();
        }
        return instance;
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100.");
        }
        soundVolume = volume;
    }

    public int getVolume() {
        return soundVolume;
    }

    public void playSound(String soundName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sounds.log", true))) {
            writer.write(LocalDateTime.now() + ": Played sound - " + soundName);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Playing sound: " + soundName);
    }

}
