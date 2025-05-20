package fr.andrew.model;

public class JukeBox {
    private Amplifier amplifier;
    private AudioPlayer audioPlayer;
    private Speaker speaker;

    public void playMusic(){
        amplifier.turnOn();
        amplifier.setVolume(5);
        speaker.connect();
        audioPlayer.load("Eminem - Ass Like That");
        audioPlayer.play();
        speaker.outputSound();
    }
}
