package construction.proxy.media_library;

/**
 * @ClassName: Video
 * @Description: 视频文件
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
