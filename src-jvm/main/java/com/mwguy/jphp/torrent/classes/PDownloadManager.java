package com.mwguy.jphp.torrent.classes;

import com.mwguy.jphp.torrent.TorrentExtension;
import jBittorrentAPI.DownloadManager;
import jBittorrentAPI.TorrentFile;
import jBittorrentAPI.Utils;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.invoke.Invoker;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("DownloadManager")
@Reflection.Namespace(TorrentExtension.NS)
public class PDownloadManager extends BaseWrapper<DownloadManager> {

    public PDownloadManager(Environment env, DownloadManager wrappedObject) {
        super(env, wrappedObject);
    }

    public PDownloadManager(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    public DownloadManager gwtWrappedObject()
    {
        return (DownloadManager) __wrappedObject;
    }

    @Reflection.Signature
    public void __construct(TorrentFile file)
    {
        __wrappedObject = new DownloadManager(file, Utils.generateID());
    }

    @Reflection.Signature
    public boolean isComplete()
    {
        return getWrappedObject().isComplete();
    }

    @Reflection.Signature
    public void startDownload(Invoker callback)
    {
        getWrappedObject().startListening(6882, 6889);
        getWrappedObject().startTrackerUpdate();

        new Thread(() -> {
            while (true)
            {
                try {
                    callback.call(null);
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                    break;
                }

                if (this.isComplete()) break;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Reflection.Signature
    public void startDownload()
    {
        getWrappedObject().startListening(6882, 6889);
        getWrappedObject().startTrackerUpdate();
    }

    @Reflection.Signature
    public void stopDownload()
    {
        getWrappedObject().stopTrackerUpdate();
        getWrappedObject().closeTempFiles();
    }
}
