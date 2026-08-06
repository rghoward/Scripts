package io.intercom.android.sdk.overlay;

import android.content.Context;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class LauncherOpenBehaviour {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum LauncherType {
        DEFAULT,
        CUSTOM
    }

    public void openMessenger(Context context) {
        Injector.get().getMetricTracker().clickedLauncher();
        IntercomRootActivityLauncher.INSTANCE.startHome(context);
    }
}
