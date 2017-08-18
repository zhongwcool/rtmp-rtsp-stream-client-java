package com.pedro.encoder.video;

/**
 * Created by pedro on 15/08/17.
 */
public enum MimeType {

  H264, H265;

  public String getMime(){
    switch (this){
      case H264:
        return "video/avc";
      case H265:
        return "video/hevc";
      default:
        return null;
    }
  }
}
