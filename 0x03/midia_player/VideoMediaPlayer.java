

public class VideoMediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void reproduzirVlc(String vlc) {
        System.out.printf("Reproduzindo VLC: " + vlc);
    }

    @Override
    public void reproduzirMp4(String mp4) {
        System.out.printf("Reproduzindo MP4: " +mp4);
    }
}
