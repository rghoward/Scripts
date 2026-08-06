package io.intercom.android.sdk.m5.preview.util;

import android.webkit.MimeTypeMap;
import defpackage.z2a;
import io.ably.lib.rest.Auth;
import io.ably.lib.util.AgentHeaderCreator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class MimeTypeResolverKt {
    private static final String FILE_FALLBACK = "application/octet-stream";
    private static final String IMAGE_FALLBACK = "image/png";
    private static final String VIDEO_FALLBACK = "video/mp4";

    private static final boolean isConcreteMimeType(String str) {
        return str.length() > 0 && !z2a.o(str, Auth.WILDCARD_CLIENTID, false) && z2a.o(str, AgentHeaderCreator.AGENT_DIVIDER, false);
    }

    public static final String resolveFileMimeType(String str, String str2) {
        str.getClass();
        str2.getClass();
        return resolveMimeType(str, str2, FILE_FALLBACK);
    }

    public static final String resolveImageMimeType(String str, String str2) {
        str.getClass();
        str2.getClass();
        return resolveMimeType(str, str2, IMAGE_FALLBACK);
    }

    public static /* synthetic */ String resolveImageMimeType$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "image/*";
        }
        return resolveImageMimeType(str, str2);
    }

    private static final String resolveMimeType(String str, String str2, String str3) {
        if (isConcreteMimeType(str2)) {
            return str2;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = (fileExtensionFromUrl == null || fileExtensionFromUrl.length() == 0) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return mimeTypeFromExtension == null ? str3 : mimeTypeFromExtension;
    }

    public static final String resolveVideoMimeType(String str, String str2) {
        str.getClass();
        str2.getClass();
        return resolveMimeType(str, str2, VIDEO_FALLBACK);
    }

    public static /* synthetic */ String resolveVideoMimeType$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "video/*";
        }
        return resolveVideoMimeType(str, str2);
    }
}
