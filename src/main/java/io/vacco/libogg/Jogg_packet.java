package io.vacco.libogg;

/**
 * ogg_packet is used to encapsulate the data and metadata belonging to a single raw Ogg/Vorbis
 * packet
 *
 * <p>Changes from C to Java:
 *
 * <p><code>byte data = packet_base[packet]</code><br>
 * <code>int data = ((int)packet_base[packet]) &amp; 0xff</code><br>
 * <br>
 * <code>void ogg_packet_clear(Jogg_packet op)</code> -&gt; <code>Jogg_packet op = null</code>
 */
public final class Jogg_packet {
  public byte[] packet_base;
  public int packet;
  public int bytes;
  public boolean b_o_s;
  public boolean e_o_s;

  public long granulepos;
  /**
   * sequence number for decode; the framing knows where there's a hole in the data, but we need
   * coupling so that the codec (which is in a separate abstraction layer) also knows about the gap
   */
  public long packetno;
  //
  public final void clear() {
    packet_base = null;
    packet = 0;
    bytes = 0;
    b_o_s = false;
    e_o_s = false;
    granulepos = 0;
    packetno = 0;
  }
}
