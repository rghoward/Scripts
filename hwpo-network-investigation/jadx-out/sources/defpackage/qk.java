package defpackage;

import android.content.pm.ShortcutManager;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qk implements c30.i {
    public static /* bridge */ /* synthetic */ Class b() {
        return ShortcutManager.class;
    }

    @Override // c30.i
    public int a(int i, tq5 tq5Var) {
        return Math.round((1.0f + (tq5Var != tq5.t ? 0.0f * (-1.0f) : 0.0f)) * ((i + 0) / 2.0f));
    }
}
