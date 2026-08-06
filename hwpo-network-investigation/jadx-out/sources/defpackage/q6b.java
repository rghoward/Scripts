package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q6b {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static q6b c;
    public final y7a a;

    public q6b(y7a y7aVar) {
        this.a = y7aVar;
    }

    public final boolean a(qe0 qe0Var) {
        if (TextUtils.isEmpty(qe0Var.d)) {
            return true;
        }
        long j = qe0Var.f + qe0Var.g;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
