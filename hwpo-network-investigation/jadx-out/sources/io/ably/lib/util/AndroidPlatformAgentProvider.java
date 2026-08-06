package io.ably.lib.util;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class AndroidPlatformAgentProvider implements PlatformAgentProvider {
    @Override // io.ably.lib.util.PlatformAgentProvider
    public String createPlatformAgent() {
        return "android/" + Build.VERSION.SDK_INT;
    }
}
