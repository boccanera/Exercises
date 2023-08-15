package DesignPattern.Proxy;

public class RealVideoDownloader implements VideoDownloaderService {
    @Override
    public Video getVideo(String videoName) {
        //connecting to youtube.com, download video and retrieve video metadata.
        return new Video();
    }
}
