package defpackage;

import android.net.Uri;
import defpackage.gz4;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nz3<T extends gz4> implements vt7.a<T> {
    public final vt7.a<? extends T> a;
    public final List<r1a> b;

    public nz3(vt7.a<? extends T> aVar, List<r1a> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // vt7.a
    public final Object a(Uri uri, mf2 mf2Var) {
        gz4 gz4Var = (gz4) this.a.a(uri, mf2Var);
        List<r1a> list = this.b;
        return (list == null || list.isEmpty()) ? gz4Var : (gz4) gz4Var.a(list);
    }
}
