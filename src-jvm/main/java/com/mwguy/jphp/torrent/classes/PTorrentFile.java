package com.mwguy.jphp.torrent.classes;

import com.mwguy.jphp.torrent.TorrentExtension;
import jBittorrentAPI.TorrentFile;
import jBittorrentAPI.TorrentProcessor;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Reflection.Name("TorrentFile")
@Reflection.Namespace(TorrentExtension.NS)
public class PTorrentFile extends BaseWrapper<TorrentFile> {

    public PTorrentFile(Environment env, TorrentFile wrappedObject) {
        super(env, wrappedObject);
    }

    public PTorrentFile(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    public TorrentFile getWrappedObject()
    {
        return (TorrentFile) __wrappedObject;
    }

    @Reflection.Signature
    public void __construct()
    {
        __wrappedObject = new TorrentFile();
    }

    @Reflection.Signature
    public void __construct(String file)
    {
        __wrappedObject = PTorrentFile.of(__env__, file);
    }

    @Reflection.Getter
    public String getAnnounceURL()
    {
        return getWrappedObject().announceURL;
    }

    @Reflection.Getter
    public String getComment()
    {
        return getWrappedObject().comment;
    }

    @Reflection.Getter
    public String getCreatedBy()
    {
        return getWrappedObject().createdBy;
    }

    @Reflection.Getter
    public long getCreationDate()
    {
        return getWrappedObject().creationDate;
    }

    @Reflection.Getter
    public String getEncoding()
    {
        return getWrappedObject().encoding;
    }

    @Reflection.Getter
    public String getSaveAs()
    {
        return getWrappedObject().saveAs;
    }

    @Reflection.Getter
    public ArrayList getName()
    {
        return getWrappedObject().name;
    }

    @Reflection.Getter
    public ArrayList getLength()
    {
        return getWrappedObject().length;
    }

    @Reflection.Signature
    public static TorrentFile of(Environment environment, String file)
    {
        return new PTorrentProcessor(environment, new TorrentProcessor()).getTorrentFileOfPath(file);
    }
}