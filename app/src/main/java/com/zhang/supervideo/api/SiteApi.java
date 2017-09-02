package com.zhang.supervideo.api;

import com.zhang.supervideo.model.Site;



/**
 * Created by 德医互联 on 2017/9/2.
 */

public class SiteApi {
    public void onGetChannelAlbums(Site siteId,int channelId){
        switch (siteId){
            case LETV:
                new LetvApi().onGetChannelAlbums();
                break;
            case SOHU:
                new SohuApi().onGetChannelAlbums();
                break;

        }

    }

}
