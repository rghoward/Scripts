package io.intercom.android.sdk.logger;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.Intercom;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class LumberMill {
    private static final Twig MESSENGER_TWIG = new Twig(5, "Intercom", false);
    private static final Twig NEXUS_TWIG = new Twig(5, "Intercom realtime", false);
    private static final Twig ABLY_TWIG = new Twig(5, "Intercom Ably", false);
    private static final Twig BLOCK_TWIG = new Twig(5, "Intercom", false);

    public static Twig getAblyTwig() {
        return ABLY_TWIG;
    }

    public static Twig getBlocksTwig() {
        return BLOCK_TWIG;
    }

    public static Twig getLogger() {
        return MESSENGER_TWIG;
    }

    public static Twig getNexusTwig() {
        return NEXUS_TWIG;
    }

    public static void setLogLevel(@Intercom.LogLevel int i) {
        MESSENGER_TWIG.setLogLevel(i);
        NEXUS_TWIG.setLogLevel(i);
        ABLY_TWIG.setLogLevel(i);
        BLOCK_TWIG.setLogLevel(i);
    }
}
