package defpackage;

import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xk2 {
    public static String a(long j) {
        return f6b.b("yMMMd", Locale.getDefault()).format(new Date(j));
    }
}
