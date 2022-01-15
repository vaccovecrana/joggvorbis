# joggvorbis

Java versions of the Ogg Vorbis libraries.

Forked and adapted from http://dmilvdv.narod.ru/Apps/oggvorbis.html

## Conformity

- `libogg-1.3.3`
- `libvorbis-1.3.6`

Includes tests, examples, java SPI.

```groovy
dependencies {
  compile 'io.vacco.joggvorbis:joggvorbis:<VERSION>'
}
```

Source file labels:

- `FIXME` - Suspicious places in the C source code.
- `XXX` - The labels for test code and comments.
- `TODO` - Java code needs to be refined.

## See also:

- [Ogg, home page](http://www.xiph.org/ogg/)
- [Vorbis, home page](http://www.xiph.org/vorbis/)
- [OggVorbis libraries, including vorbis-java-1.0.0-beta based on libvorbis-1.1.2, libogg-1.1.3](http://www.xiph.org/downloads/)
- [JOrbis, a pure Java(TM) Ogg Vorbis decoder](http://www.jcraft.com/jorbis/)
- [Vorbis SPI](http://www.javazoom.net/vorbisspi/vorbisspi.html)
