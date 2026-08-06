package defpackage;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q70 {
    public static final q70 b = new q70();
    public AudioAttributes a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static void a(AudioAttributes.Builder builder) {
            builder.setHapticChannelsMuted(true);
        }

        public static void b(AudioAttributes.Builder builder) {
            builder.setAllowedCapturePolicy(1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static void a(AudioAttributes.Builder builder) {
            builder.setIsContentSpatialized(false);
        }

        public static void b(AudioAttributes.Builder builder) {
            builder.setSpatializationBehavior(0);
        }
    }

    static {
        ra.b(0, 1, 2, 3, 4);
        n6b.H(5);
        n6b.H(6);
    }

    public final AudioAttributes a() {
        if (this.a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                a.b(usage);
                a.a(usage);
            }
            if (i >= 32) {
                b.b(usage);
                b.a(usage);
            }
            this.a = usage.build();
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q70.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
