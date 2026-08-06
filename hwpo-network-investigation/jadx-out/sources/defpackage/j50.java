package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j50 implements lr9 {
    public final /* synthetic */ Object t;

    public j50(uoc uocVar, byte[] bArr) {
        this.t = bArr;
        Objects.requireNonNull(uocVar);
    }

    @Override // defpackage.lr9
    public Object b(wi8 wi8Var) {
        return yk2.k(new i50(((f50) this.t).z), wi8Var);
    }

    public j50(f50 f50Var) {
        this.t = f50Var;
    }
}
