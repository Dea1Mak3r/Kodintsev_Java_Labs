package AudioManager;

public class Lab6Task1 {
    public static void main(String[] args)
    {
        AudioManager audioManager = AudioManager.getInstance();

        audioManager.setVolume(20);
        audioManager.getVolume();
        audioManager.playSound("Telescope");
    }
}
