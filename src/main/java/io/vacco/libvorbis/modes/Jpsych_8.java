package io.vacco.libvorbis.modes;

import io.vacco.libvorbis.Jadj_stereo;
import io.vacco.libvorbis.Jatt3;
import io.vacco.libvorbis.Jcompandblock;
import io.vacco.libvorbis.Jnoise3;
import io.vacco.libvorbis.Jnoiseguard;
import io.vacco.libvorbis.Jvp_adjblock;

/** 8kHz psychoacoustic settings */
public final class Jpsych_8 {

  protected static final Jatt3 _psy_tone_masteratt_8[] = { // [3]
    new Jatt3(new int[] {32, 25, 12}, 0, 0), /* 0 */
    new Jatt3(new int[] {30, 25, 12}, 0, 0), /* 0 */
    new Jatt3(new int[] {20, 0, -14}, 0, 0), /* 0 */
  };

  protected static final Jvp_adjblock _vp_tonemask_adj_8[] = { // [3]
    /* adjust for mode zero */
    /* 63     125     250     500     1     2     4     8    16 */
    new Jvp_adjblock(
        new int[] {-15, -15, -15, -15, -10, -10, -6, 0, 0, 0, 0, 10, 0, 0, 99, 99, 99}), /* 1 */
    new Jvp_adjblock(
        new int[] {-15, -15, -15, -15, -10, -10, -6, 0, 0, 0, 0, 10, 0, 0, 99, 99, 99}), /* 1 */
    new Jvp_adjblock(
        new int[] {-15, -15, -15, -15, -10, -10, -6, 0, 0, 0, 0, 0, 0, 0, 99, 99, 99}), /* 1 */
  };

  protected static final Jnoise3 _psy_noisebias_8[] = { // [3]
    /*  63     125     250     500      1k       2k      4k      8k     16k*/
    new Jnoise3(
        new int[][] {
          {-10, -10, -10, -10, -5, -5, -5, 0, 4, 8, 8, 8, 10, 10, 99, 99, 99},
          {-10, -10, -10, -10, -5, -5, -5, 0, 0, 4, 4, 4, 4, 4, 99, 99, 99},
          {-30, -30, -30, -30, -30, -24, -20, -14, -10, -6, -8, -8, -6, -6, 99, 99, 99}
        }),
    new Jnoise3(
        new int[][] {
          {-10, -10, -10, -10, -5, -5, -5, 0, 4, 8, 8, 8, 10, 10, 99, 99, 99},
          {-10, -10, -10, -10, -10, -10, -5, -5, -5, 0, 0, 0, 0, 0, 99, 99, 99},
          {-30, -30, -30, -30, -30, -24, -20, -14, -10, -6, -8, -8, -6, -6, 99, 99, 99}
        }),
    new Jnoise3(
        new int[][] {
          {-15, -15, -15, -15, -15, -12, -10, -8, 0, 2, 4, 4, 5, 5, 99, 99, 99},
          {-30, -30, -30, -30, -26, -22, -20, -14, -12, -12, -10, -10, -10, -10, 99, 99, 99},
          {-30, -30, -30, -30, -26, -26, -26, -26, -26, -26, -26, -26, -26, -24, 99, 99, 99}
        }),
  };

  /** stereo mode by base quality level */
  protected static final Jadj_stereo _psy_stereo_modes_8[] = { // [3]
    /*  0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  */
    new Jadj_stereo(
        new int[] {4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
        new int[] {6, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
        new float[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        new float[] {99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99}),
    new Jadj_stereo(
        new int[] {4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
        new int[] {6, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
        new float[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        new float[] {99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99}),
    new Jadj_stereo(
        new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
        new int[] {4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4},
        new float[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        new float[] {99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99}),
  };

  protected static final Jnoiseguard _psy_noiseguards_8[] = { // [2]
    new Jnoiseguard(10, 10, -1), new Jnoiseguard(10, 10, -1),
  };

  protected static final Jcompandblock _psy_compand_8[] = { // [2]
    new Jcompandblock(
        new int[] {
          0, 1, 2, 3, 4, 5, 6, 7, /* 7dB */
          8, 8, 9, 9, 10, 10, 11, 11, /* 15dB */
          12, 12, 13, 13, 14, 14, 15, 15, /* 23dB */
          16, 16, 17, 17, 17, 18, 18, 19, /* 31dB */
          19, 19, 20, 21, 22, 23, 24, 25, /* 39dB */
        }),
    new Jcompandblock(
        new int[] {
          0, 1, 2, 3, 4, 5, 6, 6, /* 7dB */
          7, 7, 6, 6, 5, 5, 4, 4, /* 15dB */
          3, 3, 3, 4, 5, 6, 7, 8, /* 23dB */
          9, 10, 11, 12, 13, 14, 15, 16, /* 31dB */
          17, 18, 19, 20, 21, 22, 23, 24, /* 39dB */
        }),
  };

  protected static final double _psy_lowpass_8[] = {3., 4., 4.}; // [3]

  protected static final int _noise_start_8[] = { // [2]
    64, 64,
  };

  protected static final int _noise_part_8[] = { // [2]
    8, 8,
  };

  protected static final int _psy_ath_floater_8[] = { // [3]
    -100, -100, -105,
  };

  protected static final int _psy_ath_abs_8[] = { // [3]
    -130, -130, -140,
  };
}
