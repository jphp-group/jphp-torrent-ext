<?

use php\torrent\TorrentFile;

namespace php\torrent;

class DownloadManager {

    /**
     * DownloadManager constructor.
     * @param TorrentFile $file
     */
    public function __construct(TorrentFile $file) {}

    /**
     * @return bool
     */
    public function isComplete() : bool {}

    /**
     * @param callable|null $callback
     */
    public function startDownload(callable $callback = null) {}

    public function stopDownload() {}
}
