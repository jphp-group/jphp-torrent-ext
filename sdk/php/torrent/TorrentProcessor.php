<?

namespace php\torrent;

class TorrentProcessor
{
    /**
     * TorrentProcessor constructor.
     * @param TorrentFile|null $file
     */
    public function __construct(TorrentFile $file = null) {}

    /**
     * @param string $file
     * @return array
     */
    public function parseTorrent(string $file) : array {}

    /**
     * @param array $info
     * @return TorrentFile
     */
    public function getTorrentFile(Array $info) : TorrentFile {}

    /**
     * @param string $path
     * @return TorrentFile
     */
    public function getTorrentFileOfPath(string $path) : TorrentFile {}

    /**
     * @param TorrentFile $file
     */
    public function setTorrent(TorrentFile $file) {}

    /**
     * @param string $url
     */
    public function setAnnounceURL(string $url) {}

    /**
     * @param int $length
     */
    public function setPieceLength(int $length) {}

    /**
     * @param string $name
     */
    public function setName(string $name) {}

    /**
     * @param string $comment
     */
    public function setComment(string $comment) {}

    /**
     * @param string $creator
     */
    public function setCreator(string $creator) {}

    /**
     * @param int $creationDate
     */
    public function setCreationDate(int $creationDate) {}

    /**
     * @param string $encoding
     */
    public function setEncoding(string $encoding) {}

    /**
     * @param string $file
     */
    public function addFile(string $file) {}

    /**
     * @param array $files
     */
    public function addFiles(array $files) {}

    /**
     * @param string $torrentFilePath
     */
    public function save(string $torrentFilePath) {}
}