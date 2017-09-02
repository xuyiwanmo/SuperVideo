package com.zhang.supervideo.api;

import com.zhang.supervideo.model.Channel;

/**
 * Created by 德医互联 on 2017/9/2.
 */

public abstract class BaseSiteApi {
    public abstract void onGetChannelAlbums(Channel channel,int pageNo,int pageSize,OnGetChannelAlbumListener onGetChannelAlbumListener);

}
