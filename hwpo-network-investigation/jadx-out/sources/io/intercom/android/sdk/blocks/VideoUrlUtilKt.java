package io.intercom.android.sdk.blocks;

import com.intercom.twig.BuildConfig;
import defpackage.aa;
import defpackage.ct1;
import defpackage.sk0;
import defpackage.th1;
import defpackage.u;
import defpackage.z2a;
import defpackage.z97;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoUrlUtilKt {
    private static final String ID_SEPARATOR = "|";

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoProvider.values().length];
            try {
                iArr[VideoProvider.YOUTUBE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoProvider.VIMEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoProvider.WISTIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoProvider.LOOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoProvider.VIDYARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoProvider.BRIGHTCOVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoProvider.JWPLAYER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoProvider.MICROSOFTSTREAM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoProvider.SYNTHESIA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VideoProvider.GUIDDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VideoProvider.DESCRIPT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VideoProvider.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getEmbedUrl(VideoProvider videoProvider, String str) {
        videoProvider.getClass();
        str.getClass();
        List listI = z2a.I(str, new String[]{ID_SEPARATOR}, 6);
        String str2 = (String) th1.y(listI);
        List listV = th1.v(listI);
        switch (WhenMappings.$EnumSwitchMapping$0[videoProvider.ordinal()]) {
            case 1:
                return sk0.c("https://www.youtube.com/embed/", str2, "?rel=0");
            case 2:
                if (listV.isEmpty()) {
                    return ct1.a("https://player.vimeo.com/video/", str2);
                }
                StringBuilder sbA = aa.a("https://player.vimeo.com/video/", str2, "?h=");
                sbA.append((String) listV.get(0));
                return sbA.toString();
            case 3:
                return ct1.a("https://fast.wistia.net/embed/iframe/", str2);
            case 4:
                return ct1.a("https://www.loom.com/embed/", str2);
            case 5:
                return ct1.a("https://play.vidyard.com/", str2);
            case 6:
                StringBuilder sbA2 = aa.a("https://players.brightcove.net/", str2, "/default_default/index.html?videoId=");
                sbA2.append((String) listV.get(0));
                return sbA2.toString();
            case 7:
                return sk0.c("https://content.jwplatform.com/players/", str2, ".html");
            case 8:
                if (listV.isEmpty()) {
                    return ct1.a("https://web.microsoftstream.com/embed/video/", str2);
                }
                StringBuilder sbA3 = aa.a("https://", str2, ".sharepoint.com/:v:/");
                sbA3.append((String) listV.get(0));
                return sbA3.toString();
            case 9:
                return ct1.a("https://share.synthesia.io/embeds/videos/", str2);
            case 10:
                return ct1.a("https://embed.app.guidde.com/playbooks/", str2);
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return ct1.a("https://share.descript.com/embed/", str2);
            case 12:
                return BuildConfig.FLAVOR;
            default:
                u.b();
                return null;
        }
    }
}
