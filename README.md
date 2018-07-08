### Torrent API for JPHP
> JBit Torrent API

### Examples

Get torrent info :

```php
use php\torrent\TorrentFile;

$file = TorrentFile::of("path/to/torrentFile");

for ($i = 0; $i < count($file->length); $i++)
	$size += $file->length[$i];

echo "-> Torrent info : \n";
echo " -> CreatedBy : " . $file->createdBy . "\n";
echo " -> CreationDate : " . $file->creationDate . "\n";
echo " -> Encoding : " . $file->encoding . "\n";
echo " -> SaveAs : " . $file->saveAs . "\n";
echo " -> Comment : " . $file->comment . "\n";
echo " -> AnnounceURL : " . $file->announceURL . "\n";
echo " -> Size : " . $size . " Bytes \n";
echo " -> files :\n";

for ($i = 0; $i < count($file->length); $i++)
{
	echo "  -> [{$file->name[$i]}], size : {$file->length[$i]} Bytes \n";
}
```

Download : 

```php
use php\torrent\{ TorrentFile, DownloadManager };

$dm = new DownloadManager(TorrentFile::of("path/to/torrentFile"));
$dm->startDownload(function () {
    // callback running every 1 second if download doesn't complete
    // callback running not in graphical stream!
});

```

Create torrent file :
```php
use php\torrent\TorrentProcessor;

$tp = TorrentProcessor();
$tp->setCreationDate(date as int);
$tp->setCreator("jphp torrent api");
$tp->setEncoding("UTF-8");
$tp->setComment("test");
$tp->setPieceLength(100);
$tp->setAnnounceURL(null); // Often, you can leave empty, because the tracker itself overwrites this header.
$tp->setName("test"); // In what folder will be the data downloaded through our torrent file
$tp->addFile("path/to/file");
$tp->save("./test.torrent");
```
