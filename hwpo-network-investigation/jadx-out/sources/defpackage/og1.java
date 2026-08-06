package defpackage;

import android.util.Pair;
import com.intercom.twig.BuildConfig;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class og1 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {BuildConfig.FLAVOR, "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = n6b.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:160:0x0236  */
    /* JADX WARN: Code duplicated, block: B:17:0x009f  */
    /* JADX WARN: Code duplicated, block: B:20:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:236:0x0317  */
    /* JADX WARN: Code duplicated, block: B:239:0x0322  */
    /* JADX WARN: Code duplicated, block: B:420:0x056a  */
    /* JADX WARN: Code duplicated, block: B:422:0x0570  */
    /* JADX WARN: Code duplicated, block: B:473:0x0636  */
    /* JADX WARN: Code duplicated, block: B:538:0x0723  */
    /* JADX WARN: Code duplicated, block: B:540:0x0729  */
    /* JADX WARN: Code duplicated, block: B:541:0x072c  */
    /* JADX WARN: Code duplicated, block: B:542:0x072f  */
    /* JADX WARN: Code duplicated, block: B:543:0x0732  */
    /* JADX WARN: Code duplicated, block: B:544:0x0735  */
    /* JADX WARN: Code duplicated, block: B:545:0x0738  */
    /* JADX WARN: Code duplicated, block: B:546:0x073b  */
    /* JADX WARN: Code duplicated, block: B:547:0x073d A[PHI: r4
      0x073d: PHI (r4v17 int) = (r4v13 int), (r4v14 int), (r4v22 int), (r4v27 int), (r4v28 int), (r4v29 int), (r4v30 int) binds: [B:540:0x0729, B:561:0x076e, B:555:0x0758, B:550:0x0745, B:549:0x0742, B:548:0x073f, B:546:0x073b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:548:0x073f  */
    /* JADX WARN: Code duplicated, block: B:549:0x0742  */
    /* JADX WARN: Code duplicated, block: B:550:0x0745  */
    /* JADX WARN: Code duplicated, block: B:551:0x0748  */
    /* JADX WARN: Code duplicated, block: B:552:0x074c  */
    /* JADX WARN: Code duplicated, block: B:553:0x0750  */
    /* JADX WARN: Code duplicated, block: B:554:0x0754  */
    /* JADX WARN: Code duplicated, block: B:555:0x0758  */
    /* JADX WARN: Code duplicated, block: B:556:0x075b  */
    /* JADX WARN: Code duplicated, block: B:557:0x075f  */
    /* JADX WARN: Code duplicated, block: B:558:0x0763  */
    /* JADX WARN: Code duplicated, block: B:559:0x0767  */
    /* JADX WARN: Code duplicated, block: B:560:0x076b  */
    /* JADX WARN: Code duplicated, block: B:561:0x076e  */
    /* JADX WARN: Code duplicated, block: B:563:0x0772  */
    /* JADX WARN: Code duplicated, block: B:565:0x0778  */
    /* JADX WARN: Code duplicated, block: B:669:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:688:0x0933  */
    /* JADX WARN: Code duplicated, block: B:690:0x0939  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:86:0x015f  */
    public static Pair<Integer, Integer> b(id4 id4Var) {
        byte b2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Integer num;
        Integer num2 = 1024;
        Integer numValueOf = Integer.valueOf(AudioConstants.AUDIO_FILE_BUFFER_SIZE);
        String str = id4Var.k;
        xh1 xh1Var = id4Var.E;
        String str2 = id4Var.k;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(id4Var.o)) {
            if (strArrSplit.length < 3) {
                g3.d("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                return null;
            }
            Matcher matcher = c.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                g3.d("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup) {
                    case "00":
                        num = 1;
                        break;
                    case "01":
                        num = 2;
                        break;
                    case "02":
                        num = 4;
                        break;
                    case "03":
                        num = 8;
                        break;
                    case "04":
                        num = 16;
                        break;
                    case "05":
                        num = 32;
                        break;
                    case "06":
                        num = 64;
                        break;
                    case "07":
                        num = 128;
                        break;
                    case "08":
                        num = 256;
                        break;
                    case "09":
                        num = 512;
                        break;
                    case "10":
                        num = num2;
                        break;
                    default:
                        num = null;
                        break;
                }
            } else {
                num = null;
            }
            if (num == null) {
                g3.d("Unknown Dolby Vision profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            String str3 = strArrSplit[2];
            if (str3 != null) {
                switch (str3) {
                    case "01":
                        num2 = 1;
                        break;
                    case "02":
                        num2 = 2;
                        break;
                    case "03":
                        num2 = 4;
                        break;
                    case "04":
                        num2 = 8;
                        break;
                    case "05":
                        num2 = 16;
                        break;
                    case "06":
                        num2 = 32;
                        break;
                    case "07":
                        num2 = 64;
                        break;
                    case "08":
                        num2 = 128;
                        break;
                    case "09":
                        num2 = 256;
                        break;
                    case "10":
                        num2 = 512;
                        break;
                    case "11":
                        break;
                    case "12":
                        num2 = numValueOf;
                        break;
                    case "13":
                        num2 = 4096;
                        break;
                    default:
                        num2 = null;
                        break;
                }
            } else {
                num2 = null;
            }
            if (num2 != null) {
                return new Pair<>(num, num2);
            }
            g3.d("Unknown Dolby Vision level string: ", str3, "CodecSpecificDataUtil");
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "ac-4":
                b2 = 0;
                break;
            case "apv1":
                b2 = 1;
                break;
            case "av01":
                b2 = 2;
                break;
            case "avc1":
                b2 = 3;
                break;
            case "avc2":
                b2 = 4;
                break;
            case "hev1":
                b2 = 5;
                break;
            case "hvc1":
                b2 = 6;
                break;
            case "iamf":
                b2 = 7;
                break;
            case "mp4a":
                b2 = 8;
                break;
            case "s263":
                b2 = 9;
                break;
            case "vp09":
                b2 = 10;
                break;
            case "vvc1":
                b2 = 11;
                break;
            case "vvi1":
                b2 = 12;
                break;
            default:
                b2 = -1;
                break;
        }
        int i18 = 8192;
        switch (b2) {
            case 0:
                if (strArrSplit.length != 4) {
                    g3.d("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i19 = Integer.parseInt(strArrSplit[1]);
                    int i20 = Integer.parseInt(strArrSplit[2]);
                    int i21 = Integer.parseInt(strArrSplit[3]);
                    if (i19 != 0) {
                        if (i19 != 1) {
                            if (i19 != 2) {
                                i = -1;
                            } else if (i20 == 1) {
                                i = 1026;
                            } else if (i20 == 2) {
                                i = 1028;
                            } else {
                                i = -1;
                            }
                        } else if (i20 == 0) {
                            i = 513;
                        } else if (i20 == 1) {
                            i = 514;
                        } else {
                            i = -1;
                        }
                    } else if (i20 == 0) {
                        i = 257;
                    } else {
                        i = -1;
                    }
                    if (i == -1) {
                        md6.g("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i19 + "." + i20);
                        return null;
                    }
                    if (i21 == 0) {
                        i2 = 1;
                    } else if (i21 == 1) {
                        i2 = 2;
                    } else if (i21 == 2) {
                        i2 = 4;
                    } else {
                        if (i21 != 3) {
                            if (i21 != 4) {
                                i3 = -1;
                                i2 = -1;
                            } else {
                                i2 = 16;
                            }
                            if (i2 == i3) {
                                return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
                            }
                            d80.a(i21, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        i2 = 8;
                    }
                    i3 = -1;
                    if (i2 == i3) {
                        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                    d80.a(i21, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    g3.d("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case 1:
                if (strArrSplit.length < 4) {
                    g3.d("Ignoring malformed APV codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i22 = Integer.parseInt(strArrSplit[1].substring(4));
                    int i23 = Integer.parseInt(strArrSplit[2].substring(4));
                    int i24 = Integer.parseInt(strArrSplit[3].substring(4));
                    if (i22 == 33) {
                        i18 = 1;
                    } else if (i22 != 44) {
                        d80.a(i22, "Ignoring invalid APV profile: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    int i25 = (i23 / 30) * 2;
                    if (i23 % 30 == 0) {
                        i25--;
                    }
                    return new Pair<>(Integer.valueOf(i18), Integer.valueOf((256 << (i25 - 1)) | (1 << i24)));
                } catch (NumberFormatException e) {
                    md6.h("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str2, e);
                    return null;
                }
            case 2:
                if (strArrSplit.length < 4) {
                    g3.d("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i26 = Integer.parseInt(strArrSplit[1]);
                    int i27 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i28 = Integer.parseInt(strArrSplit[3]);
                    if (i26 != 0) {
                        d80.a(i26, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    int i29 = 8;
                    if (i28 != 8 && i28 != 10) {
                        d80.a(i28, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    if (i28 == 8) {
                        i4 = 1;
                    } else {
                        i4 = (xh1Var == null || !(xh1Var.d != null || (i5 = xh1Var.c) == 7 || i5 == 6)) ? 2 : 4096;
                    }
                    switch (i27) {
                        case 0:
                            i29 = 1;
                            break;
                        case 1:
                            i29 = 2;
                            break;
                        case 2:
                            i29 = 4;
                            break;
                        case 3:
                            break;
                        case 4:
                            i29 = 16;
                            break;
                        case 5:
                            i29 = 32;
                            break;
                        case 6:
                            i29 = 64;
                            break;
                        case 7:
                            i29 = 128;
                            break;
                        case 8:
                            i29 = 256;
                            break;
                        case 9:
                            i29 = 512;
                            break;
                        case 10:
                            i29 = 1024;
                            break;
                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            i29 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                            break;
                        case 12:
                            i29 = 4096;
                            break;
                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            i29 = 8192;
                            break;
                        case 14:
                            i29 = 16384;
                            break;
                        case h4c.e /* 15 */:
                            i29 = 32768;
                            break;
                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                            i29 = 65536;
                            break;
                        case 17:
                            i29 = 131072;
                            break;
                        case 18:
                            i29 = 262144;
                            break;
                        case 19:
                            i29 = 524288;
                            break;
                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                            i29 = 1048576;
                            break;
                        case 21:
                            i29 = 2097152;
                            break;
                        case 22:
                            i29 = 4194304;
                            break;
                        case 23:
                            i29 = 8388608;
                            break;
                        default:
                            i29 = -1;
                            break;
                    }
                    if (i29 != -1) {
                        return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i29));
                    }
                    d80.a(i27, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    g3.d("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case 3:
            case 4:
                if (strArrSplit.length < 2) {
                    g3.d("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i6 = 16;
                        i7 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i8 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        i6 = 16;
                        if (strArrSplit.length < 3) {
                            md6.g("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                            return null;
                        }
                        i7 = Integer.parseInt(strArrSplit[1]);
                        i8 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i7 != 66) {
                        if (i7 == 77) {
                            i10 = -1;
                            i9 = 2;
                        } else if (i7 == 88) {
                            i10 = -1;
                            i9 = 4;
                        } else if (i7 == 100) {
                            i10 = -1;
                            i9 = 8;
                        } else if (i7 == 110) {
                            i9 = i6;
                        } else if (i7 == 122) {
                            i10 = -1;
                            i9 = 32;
                        } else if (i7 != 244) {
                            i10 = -1;
                            i9 = -1;
                        } else {
                            i10 = -1;
                            i9 = 64;
                        }
                        if (i9 == i10) {
                            d80.a(i7, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                            return null;
                        }
                        switch (i8) {
                            case 10:
                                i6 = 1;
                                i11 = -1;
                                break;
                            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                i11 = -1;
                                i6 = 4;
                                break;
                            case 12:
                                i11 = -1;
                                i6 = 8;
                                break;
                            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                i11 = -1;
                                break;
                            default:
                                switch (i8) {
                                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                                        i11 = -1;
                                        i6 = 32;
                                        break;
                                    case 21:
                                        i11 = -1;
                                        i6 = 64;
                                        break;
                                    case 22:
                                        i11 = -1;
                                        i6 = 128;
                                        break;
                                    default:
                                        switch (i8) {
                                            case 30:
                                                i6 = 256;
                                                i11 = -1;
                                                break;
                                            case 31:
                                                i11 = -1;
                                                i6 = 512;
                                                break;
                                            case 32:
                                                i11 = -1;
                                                i6 = 1024;
                                                break;
                                            default:
                                                switch (i8) {
                                                    case 40:
                                                        i11 = -1;
                                                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                                                        break;
                                                    case 41:
                                                        i11 = -1;
                                                        i6 = 4096;
                                                        break;
                                                    case 42:
                                                        i6 = 8192;
                                                        i11 = -1;
                                                        break;
                                                    default:
                                                        switch (i8) {
                                                            case 50:
                                                                i6 = 16384;
                                                                i11 = -1;
                                                                break;
                                                            case 51:
                                                                i6 = 32768;
                                                                i11 = -1;
                                                                break;
                                                            case 52:
                                                                i6 = 65536;
                                                                i11 = -1;
                                                                break;
                                                            default:
                                                                i11 = -1;
                                                                i6 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i6 == i11) {
                            return new Pair<>(Integer.valueOf(i9), Integer.valueOf(i6));
                        }
                        d80.a(i8, "Unknown AVC level: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    i9 = 1;
                    i10 = -1;
                    if (i9 == i10) {
                        d80.a(i7, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    switch (i8) {
                        case 10:
                            i6 = 1;
                            i11 = -1;
                            break;
                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            i11 = -1;
                            i6 = 4;
                            break;
                        case 12:
                            i11 = -1;
                            i6 = 8;
                            break;
                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            i11 = -1;
                            break;
                        default:
                            switch (i8) {
                                case InboxPagingSource.PAGE_SIZE /* 20 */:
                                    i11 = -1;
                                    i6 = 32;
                                    break;
                                case 21:
                                    i11 = -1;
                                    i6 = 64;
                                    break;
                                case 22:
                                    i11 = -1;
                                    i6 = 128;
                                    break;
                                default:
                                    switch (i8) {
                                        case 30:
                                            i6 = 256;
                                            i11 = -1;
                                            break;
                                        case 31:
                                            i11 = -1;
                                            i6 = 512;
                                            break;
                                        case 32:
                                            i11 = -1;
                                            i6 = 1024;
                                            break;
                                        default:
                                            switch (i8) {
                                                case 40:
                                                    i11 = -1;
                                                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                                                    break;
                                                case 41:
                                                    i11 = -1;
                                                    i6 = 4096;
                                                    break;
                                                case 42:
                                                    i6 = 8192;
                                                    i11 = -1;
                                                    break;
                                                default:
                                                    switch (i8) {
                                                        case 50:
                                                            i6 = 16384;
                                                            i11 = -1;
                                                            break;
                                                        case 51:
                                                            i6 = 32768;
                                                            i11 = -1;
                                                            break;
                                                        case 52:
                                                            i6 = 65536;
                                                            i11 = -1;
                                                            break;
                                                        default:
                                                            i11 = -1;
                                                            i6 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i6 == i11) {
                        return new Pair<>(Integer.valueOf(i9), Integer.valueOf(i6));
                    }
                    d80.a(i8, "Unknown AVC level: ", "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused3) {
                    g3.d("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case 5:
            case 6:
                return c(str2, strArrSplit, xh1Var);
            case 7:
                if (strArrSplit.length < 4) {
                    g3.d("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i30 = 1 << (Integer.parseInt(strArrSplit[1]) + 16);
                    String str5 = strArrSplit[3];
                    str5.getClass();
                    switch (str5) {
                        case "Opus":
                            i12 = 1;
                            break;
                        case "fLaC":
                            i12 = 4;
                            break;
                        case "ipcm":
                            i12 = 8;
                            break;
                        case "mp4a":
                            i12 = 2;
                            break;
                        default:
                            md6.g("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArrSplit[3]);
                            return null;
                    }
                    return new Pair<>(Integer.valueOf(i30 | 16777216 | i12), 0);
                } catch (NumberFormatException e2) {
                    md6.h("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArrSplit[1], e2);
                    return null;
                }
            case 8:
                if (strArrSplit.length != 3) {
                    g3.d("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    if ("audio/mp4a-latm".equals(fv6.e(Integer.parseInt(strArrSplit[1], 16)))) {
                        int i31 = Integer.parseInt(strArrSplit[2]);
                        int i32 = 17;
                        if (i31 == 17) {
                            i13 = -1;
                        } else {
                            if (i31 != 20) {
                                i32 = 23;
                                if (i31 != 23) {
                                    i32 = 29;
                                    if (i31 != 29) {
                                        i32 = 39;
                                        if (i31 != 39) {
                                            i32 = 42;
                                            if (i31 != 42) {
                                                switch (i31) {
                                                    case 1:
                                                        i32 = 1;
                                                        break;
                                                    case 2:
                                                        i13 = -1;
                                                        i32 = 2;
                                                        break;
                                                    case 3:
                                                        i32 = 3;
                                                        break;
                                                    case 4:
                                                        i13 = -1;
                                                        i32 = 4;
                                                        break;
                                                    case 5:
                                                        i32 = 5;
                                                        break;
                                                    case 6:
                                                        i13 = -1;
                                                        i32 = 6;
                                                        break;
                                                    default:
                                                        i13 = -1;
                                                        i32 = -1;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                i32 = 20;
                            }
                            i13 = -1;
                        }
                        if (i32 != i13) {
                            return new Pair<>(Integer.valueOf(i32), 0);
                        }
                    }
                } catch (NumberFormatException unused4) {
                    g3.d("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                }
                return null;
            case 9:
                Pair<Integer, Integer> pair = new Pair<>(1, 1);
                if (strArrSplit.length < 3) {
                    g3.d("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                    return pair;
                }
                try {
                    return new Pair<>(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                } catch (NumberFormatException unused5) {
                    g3.d("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                    return pair;
                }
            case 10:
                if (strArrSplit.length < 3) {
                    g3.d("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i33 = Integer.parseInt(strArrSplit[1]);
                    int i34 = Integer.parseInt(strArrSplit[2]);
                    if (i33 == 0) {
                        i14 = 1;
                    } else if (i33 == 1) {
                        i14 = 2;
                    } else if (i33 != 2) {
                        i14 = i33 != 3 ? -1 : 8;
                    } else {
                        i14 = 4;
                    }
                    if (i14 == -1) {
                        d80.a(i33, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    if (i34 != 10) {
                        if (i34 == 11) {
                            i16 = -1;
                            i15 = 2;
                        } else if (i34 == 20) {
                            i16 = -1;
                            i15 = 4;
                        } else if (i34 == 21) {
                            i16 = -1;
                            i15 = 8;
                        } else if (i34 == 30) {
                            i16 = -1;
                            i15 = 16;
                        } else if (i34 == 31) {
                            i16 = -1;
                            i15 = 32;
                        } else if (i34 == 40) {
                            i16 = -1;
                            i15 = 64;
                        } else if (i34 == 41) {
                            i16 = -1;
                            i15 = 128;
                        } else if (i34 == 50) {
                            i15 = 256;
                        } else if (i34 != 51) {
                            switch (i34) {
                                case 60:
                                    i16 = -1;
                                    i15 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                                    break;
                                case 61:
                                    i16 = -1;
                                    i15 = 4096;
                                    break;
                                case 62:
                                    i15 = 8192;
                                    break;
                                default:
                                    i16 = -1;
                                    i15 = -1;
                                    break;
                            }
                        } else {
                            i16 = -1;
                            i15 = 512;
                        }
                        if (i15 == i16) {
                            return new Pair<>(Integer.valueOf(i14), Integer.valueOf(i15));
                        }
                        d80.a(i34, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                        return null;
                    }
                    i15 = 1;
                    i16 = -1;
                    if (i15 == i16) {
                        return new Pair<>(Integer.valueOf(i14), Integer.valueOf(i15));
                    }
                    d80.a(i34, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused6) {
                    g3.d("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 12:
                if (strArrSplit.length < 3) {
                    g3.d("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
                try {
                    int i35 = Integer.parseInt(strArrSplit[1]);
                    if (i35 == 1) {
                        if (xh1Var == null || xh1Var.c != 6) {
                            i17 = (xh1Var == null || xh1Var.e != 8) ? 2 : 1;
                        } else {
                            i17 = 4096;
                        }
                    } else {
                        if (i35 != 65) {
                            md6.g("CodecSpecificDataUtil", "Unknown VVC profile IDC: " + strArrSplit[1]);
                            return null;
                        }
                        i17 = 4;
                    }
                    String str6 = strArrSplit[2];
                    if (str6 != null) {
                        switch (str6) {
                            case "H64":
                                num2 = 64;
                                break;
                            case "H67":
                                num2 = 256;
                                break;
                            case "H80":
                                break;
                            case "H83":
                                num2 = 4096;
                                break;
                            case "H86":
                                num2 = 16384;
                                break;
                            case "H96":
                                num2 = 65536;
                                break;
                            case "L16":
                                num2 = 1;
                                break;
                            case "L32":
                                num2 = 2;
                                break;
                            case "L35":
                                num2 = 4;
                                break;
                            case "L48":
                                num2 = 8;
                                break;
                            case "L51":
                                num2 = 16;
                                break;
                            case "L64":
                                num2 = 32;
                                break;
                            case "L67":
                                num2 = 128;
                                break;
                            case "L80":
                                num2 = 512;
                                break;
                            case "L83":
                                num2 = numValueOf;
                                break;
                            case "L86":
                                num2 = 8192;
                                break;
                            case "L96":
                                num2 = 32768;
                                break;
                            case "H112":
                                num2 = 262144;
                                break;
                            case "H128":
                                num2 = 1048576;
                                break;
                            case "H144":
                                num2 = 4194304;
                                break;
                            case "L112":
                                num2 = 131072;
                                break;
                            case "L128":
                                num2 = 524288;
                                break;
                            case "L144":
                                num2 = 2097152;
                                break;
                            default:
                                num2 = null;
                                break;
                        }
                    } else {
                        num2 = null;
                    }
                    if (num2 != null) {
                        return new Pair<>(Integer.valueOf(i17), num2);
                    }
                    g3.d("Unknown VVC level string: ", str6, "CodecSpecificDataUtil");
                    return null;
                } catch (NumberFormatException unused7) {
                    g3.d("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    public static Pair<Integer, Integer> c(String str, String[] strArr, xh1 xh1Var) {
        int i;
        Integer numValueOf;
        if (strArr.length < 4) {
            g3.d("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            g3.d("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else if ("2".equals(strGroup)) {
            i = (xh1Var == null || xh1Var.c != 6) ? 2 : 4096;
        } else {
            if (!Defaults.ABLY_PROTOCOL_VERSION.equals(strGroup)) {
                g3.d("Unknown HEVC profile string: ", strGroup, "CodecSpecificDataUtil");
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2) {
                case "H30":
                    numValueOf = 2;
                    break;
                case "H60":
                    numValueOf = 8;
                    break;
                case "H63":
                    numValueOf = 32;
                    break;
                case "H90":
                    numValueOf = 128;
                    break;
                case "H93":
                    numValueOf = 512;
                    break;
                case "L30":
                    numValueOf = 1;
                    break;
                case "L60":
                    numValueOf = 4;
                    break;
                case "L63":
                    numValueOf = 16;
                    break;
                case "L90":
                    numValueOf = 64;
                    break;
                case "L93":
                    numValueOf = 256;
                    break;
                case "H120":
                    numValueOf = Integer.valueOf(AudioConstants.AUDIO_FILE_BUFFER_SIZE);
                    break;
                case "H123":
                    numValueOf = 8192;
                    break;
                case "H150":
                    numValueOf = 32768;
                    break;
                case "H153":
                    numValueOf = 131072;
                    break;
                case "H156":
                    numValueOf = 524288;
                    break;
                case "H180":
                    numValueOf = 2097152;
                    break;
                case "H183":
                    numValueOf = 8388608;
                    break;
                case "H186":
                    numValueOf = 33554432;
                    break;
                case "L120":
                    numValueOf = 1024;
                    break;
                case "L123":
                    numValueOf = 4096;
                    break;
                case "L150":
                    numValueOf = 16384;
                    break;
                case "L153":
                    numValueOf = 65536;
                    break;
                case "L156":
                    numValueOf = 262144;
                    break;
                case "L180":
                    numValueOf = 1048576;
                    break;
                case "L183":
                    numValueOf = 4194304;
                    break;
                case "L186":
                    numValueOf = 16777216;
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new Pair<>(Integer.valueOf(i), numValueOf);
        }
        g3.d("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
        return null;
    }
}
