package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h88 {
    public static final a a;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    static {
        a aVar;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                aVar = new a();
            } else {
                aVar = null;
            }
        } else {
            aVar = null;
        }
        a = aVar;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements g88 {
        @Override // defpackage.g88
        public final void a(c88.a aVar) {
        }
    }
}
