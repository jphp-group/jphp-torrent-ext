# TorrentFile

- **class** `TorrentFile` (`php\torrent\TorrentFile`)
- **source** `php/torrent/TorrentFile.php`

---

#### Properties

- `->`[`announceURL`](#prop-announceurl) : `string`
- `->`[`comment`](#prop-comment) : `string`
- `->`[`createdBy`](#prop-createdby) : `string`
- `->`[`creationDate`](#prop-creationdate) : `int`
- `->`[`encoding`](#prop-encoding) : `string`
- `->`[`saveAs`](#prop-saveas) : `string`
- `->`[`name`](#prop-name) : `array`
- `->`[`length`](#prop-length) : `array`

---

#### Static Methods

- `TorrentFile ::`[`of()`](#method-of)

---

#### Methods

- `->`[`__construct()`](#method-__construct) - _TorrentFile constructor._

---
# Static Methods

<a name="method-of"></a>

### of()
```php
TorrentFile::of(string $file): php\torrent\TorrentFile
```

---
# Methods

<a name="method-__construct"></a>

### __construct()
```php
__construct(string|null $file): void
```
TorrentFile constructor.