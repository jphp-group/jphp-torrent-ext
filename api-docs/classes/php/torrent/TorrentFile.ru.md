# TorrentFile

- **класс** `TorrentFile` (`php\torrent\TorrentFile`)
- **исходники** `php/torrent/TorrentFile.php`

---

#### Свойства

- `->`[`announceURL`](#prop-announceurl) : `string`
- `->`[`comment`](#prop-comment) : `string`
- `->`[`createdBy`](#prop-createdby) : `string`
- `->`[`creationDate`](#prop-creationdate) : `int`
- `->`[`encoding`](#prop-encoding) : `string`
- `->`[`saveAs`](#prop-saveas) : `string`
- `->`[`name`](#prop-name) : `array`
- `->`[`length`](#prop-length) : `array`

---

#### Статичные Методы

- `TorrentFile ::`[`of()`](#method-of)

---

#### Методы

- `->`[`__construct()`](#method-__construct) - _TorrentFile constructor._

---
# Статичные Методы

<a name="method-of"></a>

### of()
```php
TorrentFile::of(string $file): php\torrent\TorrentFile
```

---
# Методы

<a name="method-__construct"></a>

### __construct()
```php
__construct(string|null $file): void
```
TorrentFile constructor.