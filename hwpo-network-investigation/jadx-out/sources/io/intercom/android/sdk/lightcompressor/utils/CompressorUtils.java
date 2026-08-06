package io.intercom.android.sdk.lightcompressor.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import defpackage.js7;
import defpackage.px1;
import defpackage.u;
import defpackage.w2a;
import defpackage.wk6;
import defpackage.z2a;
import io.intercom.android.sdk.lightcompressor.VideoQuality;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CompressorUtils {
    public static final CompressorUtils INSTANCE = new CompressorUtils();
    private static final int I_FRAME_INTERVAL = 1;
    private static final double MIN_HEIGHT = 640.0d;
    private static final double MIN_WIDTH = 368.0d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoQuality.values().length];
            try {
                iArr[VideoQuality.VERY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoQuality.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoQuality.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoQuality.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoQuality.VERY_HIGH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CompressorUtils() {
    }

    private final Integer getColorRange(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-range")) {
            return Integer.valueOf(mediaFormat.getInteger("color-range"));
        }
        return null;
    }

    private final Integer getColorStandard(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-standard")) {
            return Integer.valueOf(mediaFormat.getInteger("color-standard"));
        }
        return null;
    }

    private final Integer getColorTransfer(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-transfer")) {
            return Integer.valueOf(mediaFormat.getInteger("color-transfer"));
        }
        return null;
    }

    private final int getFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("frame-rate")) {
            return mediaFormat.getInteger("frame-rate");
        }
        return 30;
    }

    private final int getIFrameIntervalRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("i-frame-interval")) {
            return mediaFormat.getInteger("i-frame-interval");
        }
        return 1;
    }

    public final int findTrack(MediaExtractor mediaExtractor, boolean z) {
        Boolean boolValueOf;
        mediaExtractor.getClass();
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            trackFormat.getClass();
            String string = trackFormat.getString("mime");
            if (z) {
                boolValueOf = string != null ? Boolean.valueOf(w2a.n(string, "video/", false)) : null;
                boolValueOf.getClass();
                if (boolValueOf.booleanValue()) {
                    return i;
                }
            } else {
                boolValueOf = string != null ? Boolean.valueOf(w2a.n(string, "audio/", false)) : null;
                boolValueOf.getClass();
                if (boolValueOf.booleanValue()) {
                    return i;
                }
            }
        }
        return -5;
    }

    public final js7<Integer, Integer> generateWidthAndHeight(double d, double d2, boolean z) {
        int iGenerateWidthHeightValue;
        int iGenerateWidthHeightValue2;
        if (z) {
            return new js7<>(Integer.valueOf(wk6.a(d)), Integer.valueOf(wk6.a(d2)));
        }
        if (d >= 1920.0d || d2 >= 1920.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d, 0.5d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d2, 0.5d);
        } else if (d >= 1280.0d || d2 >= 1280.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d, 0.75d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d2, 0.75d);
        } else if (d >= 960.0d || d2 >= 960.0d) {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d, 0.95d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d2, 0.95d);
        } else {
            iGenerateWidthHeightValue = NumbersUtilsKt.generateWidthHeightValue(d, 0.9d);
            iGenerateWidthHeightValue2 = NumbersUtilsKt.generateWidthHeightValue(d2, 0.9d);
        }
        return new js7<>(Integer.valueOf(iGenerateWidthHeightValue), Integer.valueOf(iGenerateWidthHeightValue2));
    }

    public final int getBitrate(int i, VideoQuality videoQuality) {
        videoQuality.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$0[videoQuality.ordinal()];
        if (i2 == 1) {
            return wk6.a(((double) i) * 0.1d);
        }
        if (i2 == 2) {
            return wk6.a(((double) i) * 0.2d);
        }
        if (i2 == 3) {
            return wk6.a(((double) i) * 0.3d);
        }
        if (i2 == 4) {
            return wk6.a(((double) i) * 0.4d);
        }
        if (i2 == 5) {
            return wk6.a(((double) i) * 0.6d);
        }
        u.b();
        return 0;
    }

    public final boolean hasQTI() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        codecInfos.getClass();
        int i = 0;
        while (true) {
            if (!(i < codecInfos.length)) {
                break;
            }
            int i2 = i + 1;
            try {
                MediaCodecInfo mediaCodecInfo = codecInfos[i];
                Log.i("CODECS: ", mediaCodecInfo.getName());
                String name = mediaCodecInfo.getName();
                name.getClass();
                if (z2a.o(name, "qti.avc", false)) {
                    return true;
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                px1.b(e.getMessage());
            }
        }
        return false;
    }

    public final double prepareVideoHeight(MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.getClass();
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
        return (strExtractMetadata == null || strExtractMetadata.length() == 0) ? MIN_HEIGHT : Double.parseDouble(strExtractMetadata);
    }

    public final double prepareVideoWidth(MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.getClass();
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        return (strExtractMetadata == null || strExtractMetadata.length() == 0) ? MIN_WIDTH : Double.parseDouble(strExtractMetadata);
    }

    public final void printException(Exception exc) {
        exc.getClass();
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "An error has occurred!";
        }
        Log.e("Compressor", localizedMessage, exc);
    }

    public final void setOutputFileParameters(MediaFormat mediaFormat, MediaFormat mediaFormat2, int i) {
        mediaFormat.getClass();
        mediaFormat2.getClass();
        int frameRate = getFrameRate(mediaFormat);
        int iFrameIntervalRate = getIFrameIntervalRate(mediaFormat);
        mediaFormat2.setInteger("color-format", 2130708361);
        mediaFormat2.setInteger("frame-rate", frameRate);
        mediaFormat2.setInteger("i-frame-interval", iFrameIntervalRate);
        mediaFormat2.setInteger("bitrate", i);
        mediaFormat2.setInteger("bitrate-mode", 2);
        CompressorUtils compressorUtils = INSTANCE;
        Integer colorStandard = compressorUtils.getColorStandard(mediaFormat);
        if (colorStandard != null) {
            mediaFormat2.setInteger("color-standard", colorStandard.intValue());
        }
        Integer colorTransfer = compressorUtils.getColorTransfer(mediaFormat);
        if (colorTransfer != null) {
            mediaFormat2.setInteger("color-transfer", colorTransfer.intValue());
        }
        Integer colorRange = compressorUtils.getColorRange(mediaFormat);
        if (colorRange != null) {
            mediaFormat2.setInteger("color-range", colorRange.intValue());
        }
        Log.i("Output file parameters", "videoFormat: " + mediaFormat2);
    }
}
