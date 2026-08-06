package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class my9 implements oy9.c {
    public final /* synthetic */ pa1.b a;

    public my9(pa1.b bVar) {
        this.a = bVar;
    }

    @Override // oy9.c
    public final Iterator a(oy9 oy9Var, CharSequence charSequence) {
        return new ly9(this, oy9Var, charSequence);
    }
}
