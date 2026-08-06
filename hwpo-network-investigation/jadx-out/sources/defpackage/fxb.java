package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fxb implements fh7 {
    public final /* synthetic */ t9a t;
    public final /* synthetic */ cub u;

    public fxb(cub cubVar, t9a t9aVar) {
        this.t = t9aVar;
        Objects.requireNonNull(cubVar);
        this.u = cubVar;
    }

    @Override // defpackage.fh7
    public final void b(r9a r9aVar) {
        this.u.b.remove(this.t);
    }
}
