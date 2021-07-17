package construction.proxy.media_library;

import java.util.HashMap;

/**
 * @ClassName: ThirdPartyYouTubeLib
 * @Description: 远程服务接口
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
