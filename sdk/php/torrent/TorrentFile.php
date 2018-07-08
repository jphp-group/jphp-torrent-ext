<?

namespace php\torrent;

class TorrentFile
{
    /**
     * TorrentFile constructor.
     * @param string|null $file
     */
    public function __construct(string $file = null) {}

    /**
     * @param string $file
     * @return TorrentFile
     */
    public static function of(string $file) : TorrentFile {}

    /**
     * @var string
     */
    public $announceURL;

    /**
     * @var string
     */
    public $comment;

    /**
     * @var string
     */
    public $createdBy;

    /**
     * @var int
     */
    public $creationDate;

    /**
     * @var string
     */
    public $encoding;

    /**
     * @var string
     */
    public $saveAs;

    /**
     * @var array
     */
    public $name;

    /**
     * @var array
     */
    public $length;
}