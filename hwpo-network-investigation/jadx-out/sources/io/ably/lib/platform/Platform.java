package io.ably.lib.platform;

import android.content.Context;
import defpackage.sk0;
import io.ably.lib.transport.NetworkConnectivity;
import io.ably.lib.types.AblyException;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Platform {
    private static final String TAG = "io.ably.lib.platform.Platform";
    public static final String name = "android";
    private Context applicationContext;
    private final NetworkConnectivity.DelegatedNetworkConnectivity networkConnectivity = new NetworkConnectivity.DelegatedNetworkConnectivity();

    public Context getApplicationContext() {
        return this.applicationContext;
    }

    public NetworkConnectivity getNetworkConnectivity() {
        return this.networkConnectivity;
    }

    public boolean hasApplicationContext() {
        return this.applicationContext != null;
    }

    public void setAndroidContext(Context context) throws AblyException {
        String str = TAG;
        Log.v(str, "setAndroidContext: context=" + context);
        Context applicationContext = context.getApplicationContext();
        if (this.applicationContext == null) {
            Log.v(str, "setAndroidContext(): there was no existing applicationContext");
            this.applicationContext = applicationContext;
            AndroidNetworkConnectivity.getNetworkConnectivity(applicationContext).addListener(this.networkConnectivity);
        } else {
            Log.v(str, "setAndroidContext(): applicationContext has already been set");
            if (applicationContext != this.applicationContext) {
                throw sk0.b(40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS, "Incompatible application context set");
            }
            Log.v(str, "setAndroidContext(): existing applicationContext is compatible with that being set");
        }
    }
}
