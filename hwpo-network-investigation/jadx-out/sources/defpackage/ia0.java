package defpackage;

import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 implements ja0 {
    public static final Object b(lb9 lb9Var, gc9 gc9Var) {
        Object objD = lb9Var.t.d(gc9Var);
        if (objD == null) {
            return null;
        }
        return objD;
    }

    public static final boolean c(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    @Override // defpackage.ja0
    public jp8 a(dy8 dy8Var, qu8 qu8Var) {
        return null;
    }
}
