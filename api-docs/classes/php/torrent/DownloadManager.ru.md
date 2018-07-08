# DownloadManager

- **класс** `DownloadManager` (`php\torrent\DownloadManager`)
- **исходники** `php/torrent/DownloadManager.php`

---

#### Методы

- `->`[`__construct()`](#method-__construct) - _DownloadManager constructor._
- `->`[`isComplete()`](#method-iscomplete)
- `->`[`startDownload()`](#method-startdownload)
- `->`[`stopDownload()`](#method-stopdownload)

---
# Методы

<a name="method-__construct"></a>

### __construct()
```php
__construct(php\torrent\TorrentFile $file): void
```
DownloadManager constructor.

---

<a name="method-iscomplete"></a>

### isComplete()
```php
isComplete(): bool
```

---

<a name="method-startdownload"></a>

### startDownload()
```php
startDownload(callable|null $callback): void
```

---

<a name="method-stopdownload"></a>

### stopDownload()
```php
stopDownload(): void
```