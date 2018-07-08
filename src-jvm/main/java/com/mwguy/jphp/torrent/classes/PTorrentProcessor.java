package com.mwguy.jphp.torrent.classes;

import com.mwguy.jphp.torrent.TorrentExtension;
import jBittorrentAPI.TorrentFile;
import jBittorrentAPI.TorrentProcessor;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

@Reflection.Name("TorrentProcessor")
@Reflection.Namespace(TorrentExtension.NS)
public class PTorrentProcessor extends BaseWrapper<TorrentProcessor> {

    public PTorrentProcessor(Environment env, TorrentProcessor wrappedObject) {
        super(env, wrappedObject);
    }

    public PTorrentProcessor(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    public TorrentProcessor getWrappedObject()
    {
        return (TorrentProcessor) __wrappedObject;
    }

    @Reflection.Signature
    public void __construct()
    {
        __wrappedObject = new TorrentProcessor();
    }

    @Reflection.Signature
    public void __construct(TorrentFile file)
    {
        __construct();
        setTorrent(file);
    }

    @Reflection.Signature
    public Map parseTorrent(String file)
    {
        return getWrappedObject().parseTorrent(file);
    }

    @Reflection.Signature
    public TorrentFile getTorrentFile(Map info)
    {
        return getWrappedObject().getTorrentFile(info);
    }

    @Reflection.Signature
    public TorrentFile getTorrentFileOfPath(String file)
    {
        return getTorrentFile(parseTorrent(file));
    }

    @Reflection.Signature
    public void setTorrent(TorrentFile file)
    {
        getWrappedObject().setTorrent(file);
    }

    @Reflection.Signature
    public void setAnnounceURL(String url)
    {
        getWrappedObject().setAnnounceURL(url);
    }

    @Reflection.Signature
    public void setPieceLength(int length)
    {
        getWrappedObject().setPieceLength(length);
    }

    @Reflection.Signature
    public void setName(String name)
    {
        getWrappedObject().setName(name);
    }

    @Reflection.Signature
    public void setComment(String comment)
    {
        getWrappedObject().setComment(comment);
    }

    @Reflection.Signature
    public void setCreator(String creator)
    {
        getWrappedObject().setCreator(creator);
    }

    @Reflection.Signature
    public void setCreationDate(long creationDate)
    {
        getWrappedObject().setCreationDate(creationDate);
    }

    @Reflection.Signature
    public void setEncoding(String encoding)
    {
        getWrappedObject().setEncoding(encoding);
    }

    @Reflection.Signature
    public void addFile(String file)
    {
        getWrappedObject().addFile(file);
    }

    @Reflection.Signature
    public void addFiles(String[] files)
    {
        for (String file : files) addFile(file);
    }

    @Reflection.Signature
    public void save(String path) throws IOException {
        getWrappedObject().generatePieceHashes();

        File torrentFile = new File(path);
        torrentFile.createNewFile();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(torrentFile));

        dos.write(getWrappedObject().generateTorrent());
        dos.flush();
        dos.close();
    }
}
