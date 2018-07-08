# TorrentProcessor

- **class** `TorrentProcessor` (`php\torrent\TorrentProcessor`)
- **source** `php/torrent/TorrentProcessor.php`

---

#### Methods

- `->`[`__construct()`](#method-__construct) - _TorrentProcessor constructor._
- `->`[`parseTorrent()`](#method-parsetorrent)
- `->`[`getTorrentFile()`](#method-gettorrentfile)
- `->`[`getTorrentFileOfPath()`](#method-gettorrentfileofpath)
- `->`[`setTorrent()`](#method-settorrent)
- `->`[`setAnnounceURL()`](#method-setannounceurl)
- `->`[`setPieceLength()`](#method-setpiecelength)
- `->`[`setName()`](#method-setname)
- `->`[`setComment()`](#method-setcomment)
- `->`[`setCreator()`](#method-setcreator)
- `->`[`setCreationDate()`](#method-setcreationdate)
- `->`[`setEncoding()`](#method-setencoding)
- `->`[`addFile()`](#method-addfile)
- `->`[`addFiles()`](#method-addfiles)
- `->`[`save()`](#method-save)

---
# Methods

<a name="method-__construct"></a>

### __construct()
```php
__construct(php\torrent\TorrentFile $file): void
```
TorrentProcessor constructor.

---

<a name="method-parsetorrent"></a>

### parseTorrent()
```php
parseTorrent(string $file): array
```

---

<a name="method-gettorrentfile"></a>

### getTorrentFile()
```php
getTorrentFile(array $info): php\torrent\TorrentFile
```

---

<a name="method-gettorrentfileofpath"></a>

### getTorrentFileOfPath()
```php
getTorrentFileOfPath(string $path): php\torrent\TorrentFile
```

---

<a name="method-settorrent"></a>

### setTorrent()
```php
setTorrent(php\torrent\TorrentFile $file): void
```

---

<a name="method-setannounceurl"></a>

### setAnnounceURL()
```php
setAnnounceURL(string $url): void
```

---

<a name="method-setpiecelength"></a>

### setPieceLength()
```php
setPieceLength(int $length): void
```

---

<a name="method-setname"></a>

### setName()
```php
setName(string $name): void
```

---

<a name="method-setcomment"></a>

### setComment()
```php
setComment(string $comment): void
```

---

<a name="method-setcreator"></a>

### setCreator()
```php
setCreator(string $creator): void
```

---

<a name="method-setcreationdate"></a>

### setCreationDate()
```php
setCreationDate(int $creationDate): void
```

---

<a name="method-setencoding"></a>

### setEncoding()
```php
setEncoding(string $encoding): void
```

---

<a name="method-addfile"></a>

### addFile()
```php
addFile(string $file): void
```

---

<a name="method-addfiles"></a>

### addFiles()
```php
addFiles(array $files): void
```

---

<a name="method-save"></a>

### save()
```php
save(string $torrentFilePath): void
```