package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class i5d implements z3d {
    public final /* synthetic */ j5d a;

    public /* synthetic */ i5d(g4d g4dVar) {
        Objects.requireNonNull(g4dVar);
        this.a = g4dVar;
    }

    @Override // defpackage.z3d
    public final w2.b a(final m7d m7dVar) {
        ListenableFuture listenableFutureL1 = ti4.l1(this.a.e.a());
        x40 x40Var = new x40() { // from class: h5d
            @Override // defpackage.x40
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                k5d k5dVar = this.a.a.c;
                return ((z4d) k5dVar).a(m7dVar, y03.t);
            }
        };
        int i = v7d.a;
        m7d m7dVar2 = new m7d(m6d.a(), x40Var);
        y03 y03Var = y03.t;
        return ti4.m1(ti4.n1(listenableFutureL1, m7dVar2, y03Var), new qi4(), y03Var);
    }
}
