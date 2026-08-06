package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ut0 implements wib.b {
    @Override // wib.b
    public final umb a(View view, umb umbVar, wib.c cVar) {
        cVar.d = umbVar.a() + cVar.d;
        boolean z = view.getLayoutDirection() == 1;
        int iB = umbVar.b();
        int iC = umbVar.c();
        int i = cVar.a + (z ? iC : iB);
        cVar.a = i;
        int i2 = cVar.c;
        if (!z) {
            iB = iC;
        }
        int i3 = i2 + iB;
        cVar.c = i3;
        view.setPaddingRelative(i, cVar.b, i3, cVar.d);
        return umbVar;
    }
}
