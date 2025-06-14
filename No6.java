interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() {
        System.out.println("Playing media...");
    }

    void pause() {
        System.out.println("Media paused.");
    }

    void stop() {
        System.out.println("Media stopped.");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    public void rewind() {
        System.out.println("Rewinding video...");
    }

    public void fastForward() {
        System.out.println("Fast forwarding video...");
    }

    public void addSong(String song) {
        System.out.println("Added song: " + song);
    }

    public void removeSong(String song) {
        System.out.println("Removed song: " + song);
    }
}

public class No6 {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();
        vp.play();
        vp.pause();
        vp.rewind();
        vp.fastForward();
        vp.addSong("Song 1");
        vp.removeSong("Song 1");
    }
}
