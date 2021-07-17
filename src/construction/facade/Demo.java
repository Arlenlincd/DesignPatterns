package construction.facade;

import construction.facade.facade.VideoConversionFacade;

import java.io.File;

/**
 * @ClassName: Demo
 * @Description: 复杂视频转换库的简单接口
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
