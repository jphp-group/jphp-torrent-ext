package com.mwguy.jphp.torrent;

import com.mwguy.jphp.torrent.classes.PDownloadManager;
import com.mwguy.jphp.torrent.classes.PTorrentFile;
import com.mwguy.jphp.torrent.classes.PTorrentProcessor;
import jBittorrentAPI.DownloadManager;
import jBittorrentAPI.TorrentFile;
import jBittorrentAPI.TorrentProcessor;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class TorrentExtension extends Extension {

    public static final String NS = "php\\torrent";

    @Override
    public Status getStatus() {
        return Status.STABLE;
    }

    @Override
    public void onRegister(CompileScope compileScope) {
        registerWrapperClass(compileScope, TorrentFile.class, PTorrentFile.class);
        registerWrapperClass(compileScope, TorrentProcessor.class, PTorrentProcessor.class);
        registerWrapperClass(compileScope, DownloadManager.class, PDownloadManager.class);
    }
}
