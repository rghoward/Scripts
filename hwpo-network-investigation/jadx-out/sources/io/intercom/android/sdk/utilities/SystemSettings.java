package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.provider.Settings;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class SystemSettings {
    private static final Twig twig = LumberMill.getLogger();

    public static float getTransitionScale(Context context) {
        try {
            return Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale");
        } catch (Exception e) {
            twig.internal("Couldn't get animation scale: " + e.getMessage());
            return 1.0f;
        }
    }
}
