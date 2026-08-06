package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class agb extends egb.b<Boolean> {
    @Override // egb.b
    public final Boolean a(View view) {
        return Boolean.valueOf(egb.h.c(view));
    }

    @Override // egb.b
    public final void b(View view, Boolean bool) {
        egb.h.f(view, bool.booleanValue());
    }

    @Override // egb.b
    public final boolean d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
