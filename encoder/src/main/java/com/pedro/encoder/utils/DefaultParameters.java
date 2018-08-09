package com.pedro.encoder.utils;

public class DefaultParameters {

  public class Video {
    public static final int width = 640;
    public static final int height = 480;
    public static final int fps = 30;
    public static final int bitRate = 1200 * 1024;
    public static final int rotation = 90; //portrait
    public static final boolean hardwareRotation = false;
    public static final int iFrameInterval = 2;
  }

  public class Audio {
    public static final int sampleRate = 44100;
    public static final int bitRate = 128 * 1024;
    public static final boolean isStereo = true;
  }
}
