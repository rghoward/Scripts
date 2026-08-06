package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class en6 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public int k;
    public float l;

    public en6(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z5;
        this.h = z6;
        this.i = fv6.m(str2);
        this.l = -3.4028235E38f;
        this.j = -1;
        this.k = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(n6b.g(i, widthAlignment) * widthAlignment, n6b.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    public static en6 i(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z4 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        return new en6(str, str2, str3, codecCapabilities, z, z2, z3, z5, z6, z4);
    }

    public final pn2 b(id4 id4Var, id4 id4Var2) {
        id4 id4Var3;
        id4 id4Var4;
        int i;
        String str = id4Var.o;
        xh1 xh1Var = id4Var.E;
        String str2 = id4Var2.o;
        xh1 xh1Var2 = id4Var2.E;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (id4Var.A != id4Var2.A) {
                i2 |= 1024;
            }
            boolean z = (id4Var.v == id4Var2.v && id4Var.w == id4Var2.w) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!xh1.e(xh1Var) || !xh1.e(xh1Var2)) && !Objects.equals(xh1Var, xh1Var2)) {
                i2 |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !id4Var.b(id4Var2)) {
                i2 |= 2;
            }
            int i3 = id4Var.x;
            if (i3 != -1 && (i = id4Var.y) != -1 && i3 == id4Var2.x && i == id4Var2.y && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(id4Var2.o, "video/dolby-vision")) {
                Pair<Integer, Integer> pairB = og1.b(id4Var);
                Pair<Integer, Integer> pairB2 = og1.b(id4Var2);
                if (pairB == null || pairB2 == null || !((Integer) pairB.first).equals(pairB2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new pn2(this.a, id4Var, id4Var2, id4Var.b(id4Var2) ? 3 : 2, 0);
            }
            id4Var3 = id4Var;
            id4Var4 = id4Var2;
        } else {
            id4Var3 = id4Var;
            id4Var4 = id4Var2;
            if (id4Var3.G != id4Var4.G) {
                i2 |= 4096;
            }
            if (id4Var3.H != id4Var4.H) {
                i2 |= 8192;
            }
            if (id4Var3.I != id4Var4.I) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair<Integer, Integer> pairB3 = og1.b(id4Var3);
                Pair<Integer, Integer> pairB4 = og1.b(id4Var4);
                if (pairB3 != null && pairB4 != null) {
                    int iIntValue = ((Integer) pairB3.first).intValue();
                    int iIntValue2 = ((Integer) pairB4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new pn2(this.a, id4Var3, id4Var4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairB3.equals(pairB4)) {
                        return new pn2(this.a, id4Var3, id4Var4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new pn2(this.a, id4Var3, id4Var4, 3, 0);
            }
            if (!id4Var3.b(id4Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new pn2(this.a, id4Var3, id4Var4, 1, 0);
            }
        }
        return new pn2(this.a, id4Var3, id4Var4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[PHI: r2
      0x00c3: PHI (r2v1 android.util.Pair<java.lang.Integer, java.lang.Integer>) = 
      (r2v0 android.util.Pair<java.lang.Integer, java.lang.Integer>)
      (r2v0 android.util.Pair<java.lang.Integer, java.lang.Integer>)
      (r2v0 android.util.Pair<java.lang.Integer, java.lang.Integer>)
      (r2v14 android.util.Pair<java.lang.Integer, java.lang.Integer>)
     binds: [B:3:0x000e, B:5:0x0016, B:10:0x002a, B:37:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean c(Context context, id4 id4Var, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair<Integer, Integer> pair;
        String strA;
        Pair<Integer, Integer> pairB = og1.b(id4Var);
        String str = id4Var.o;
        String str2 = this.c;
        if (str != null && str.equals("video/mv-hevc")) {
            String strN = fv6.n(str2);
            if (strN.equals("video/mv-hevc")) {
                return true;
            }
            if (strN.equals("video/hevc")) {
                HashMap<mn6.a, List<en6>> map = mn6.a;
                List<byte[]> list = id4Var.r;
                int i = 0;
                loop0: while (true) {
                    if (i >= list.size()) {
                        pair = null;
                        strA = null;
                        break;
                    }
                    byte[] bArr = list.get(i);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        k95.b bVar = k95.u;
                        k95.a aVar = new k95.a();
                        int i2 = 0;
                        while (i2 < bArr.length) {
                            int iB = f47.b(bArr, i2, bArr.length, zArr);
                            if (iB != bArr.length) {
                                aVar.c(Integer.valueOf(iB));
                            }
                            i2 = iB + 3;
                        }
                        ul8 ul8VarG = aVar.g();
                        for (int i3 = 0; i3 < ul8VarG.w; i3++) {
                            if (((Integer) ul8VarG.get(i3)).intValue() + 3 < length) {
                                qt7 qt7Var = new qt7(bArr, ((Integer) ul8VarG.get(i3)).intValue() + 3, length);
                                f47.b bVarF = f47.f(qt7Var);
                                if (bVarF.a == 33 && bVarF.b == 0) {
                                    qt7Var.j(4);
                                    int iE = qt7Var.e(3);
                                    qt7Var.i();
                                    pair = null;
                                    f47.c cVarG = f47.g(qt7Var, true, iE, null);
                                    strA = og1.a(cVarG.a, cVarG.b, cVarG.c, cVarG.d, cVarG.e, cVarG.f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i++;
                }
                if (strA == null) {
                    pairB = pair;
                } else {
                    String strTrim = strA.trim();
                    String str3 = n6b.a;
                    pairB = og1.c(strA, strTrim.split("\\.", -1), id4Var.E);
                }
            }
        }
        if (pairB == null) {
            return true;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.b;
        if (zEquals) {
            str4.getClass();
            switch (str4) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.i && !str4.equals("audio/ac4") && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
            int i4 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
            codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{mn6.b(1026, i4)} : new MediaCodecInfo.CodecProfileLevel[]{mn6.b(257, i4), mn6.b(513, i4), mn6.b(514, i4), mn6.b(1026, i4), mn6.b(1028, i4)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == iIntValue && (codecProfileLevel.level >= iIntValue2 || !z)) {
                if (!"video/hevc".equals(str4) || 2 != iIntValue) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        h("codec.profileLevel, " + id4Var.k + ", " + str2);
        return false;
    }

    public final boolean d(id4 id4Var) {
        return (Objects.equals(id4Var.o, "audio/flac") && id4Var.I == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, id4 id4Var) {
        int i;
        int i2;
        String str = id4Var.o;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(mn6.c(id4Var))) || !c(context, id4Var, true) || !d(id4Var)) {
            return false;
        }
        if (this.i) {
            int i3 = id4Var.v;
            if (i3 > 0 && (i2 = id4Var.w) > 0) {
                return g(i3, i2, id4Var.z);
            }
        } else {
            int i4 = id4Var.H;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    h("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = id4Var.G;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    h("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    h("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    md6.g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.a + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    h("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f(id4 id4Var) {
        if (this.i) {
            return this.e;
        }
        Pair<Integer, Integer> pairB = og1.b(id4Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    public final boolean g(int i, int i2, double d) {
        String str;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int iA = (i3 < 29 || ((bool = gn6.a) != null && bool.booleanValue())) ? 0 : gn6.a.a(videoCapabilities, i, i2, d);
            if (iA != 2) {
                if (iA == 1) {
                    StringBuilder sbB = u43.b("sizeAndRate.cover, ", "x", "@", i, i2);
                    sbB.append(d);
                    h(sbB.toString());
                    return false;
                }
                if (!a(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.a;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbB2 = u43.b("sizeAndRate.rotated, ", "x", "@", i, i2);
                            sbB2.append(d);
                            StringBuilder sbA = vb0.a("AssumedSupport [", sbB2.toString(), "] [", str, ", ");
                            sbA.append(this.b);
                            sbA.append("] [");
                            sbA.append(n6b.a);
                            sbA.append("]");
                            md6.c("MediaCodecInfo", sbA.toString());
                            return true;
                        }
                        StringBuilder sbB3 = u43.b("sizeAndRate.rotated, ", "x", "@", i, i2);
                        sbB3.append(d);
                        StringBuilder sbA2 = vb0.a("AssumedSupport [", sbB3.toString(), "] [", str, ", ");
                        sbA2.append(this.b);
                        sbA2.append("] [");
                        sbA2.append(n6b.a);
                        sbA2.append("]");
                        md6.c("MediaCodecInfo", sbA2.toString());
                        return true;
                    }
                    StringBuilder sbB4 = u43.b("sizeAndRate.support, ", "x", "@", i, i2);
                    sbB4.append(d);
                    h(sbB4.toString());
                    return false;
                }
            }
        } else if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.a;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder sbB5 = u43.b("sizeAndRate.rotated, ", "x", "@", i, i2);
                    sbB5.append(d);
                    StringBuilder sbA3 = vb0.a("AssumedSupport [", sbB5.toString(), "] [", str, ", ");
                    sbA3.append(this.b);
                    sbA3.append("] [");
                    sbA3.append(n6b.a);
                    sbA3.append("]");
                    md6.c("MediaCodecInfo", sbA3.toString());
                    return true;
                }
            }
            StringBuilder sbB6 = u43.b("sizeAndRate.support, ", "x", "@", i, i2);
            sbB6.append(d);
            h(sbB6.toString());
            return false;
        }
        return true;
    }

    public final void h(String str) {
        StringBuilder sbA = aa.a("NoSupport [", str, "] [");
        sbA.append(this.a);
        sbA.append(", ");
        sbA.append(this.b);
        sbA.append("] [");
        sbA.append(n6b.a);
        sbA.append("]");
        md6.c("MediaCodecInfo", sbA.toString());
    }

    public final String toString() {
        return this.a;
    }
}
