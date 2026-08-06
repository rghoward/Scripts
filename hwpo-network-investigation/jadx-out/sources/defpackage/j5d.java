package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class j5d {
    public final String a;
    public final w2.a b;
    public final k5d c;
    public final nn3 d;
    public final c6d e;
    public final c6d f;
    public final Object g;
    public final p50 h;
    public List i;

    public j5d(k5d k5dVar, w2.a aVar) {
        final g4d g4dVar = (g4d) this;
        this.f = new c6d(new b5d(g4dVar));
        Object obj = new Object();
        this.g = obj;
        this.i = new ArrayList();
        this.c = k5dVar;
        this.b = aVar;
        this.a = ((z4d) k5dVar).a;
        this.e = new c6d(new rg2((z4d) k5dVar));
        this.d = new nn3();
        this.h = new p50();
        x40 x40Var = new x40() { // from class: g5d
            @Override // defpackage.x40
            public final /* synthetic */ ListenableFuture apply(Object obj2) {
                return g4dVar.e.a();
            }
        };
        synchronized (obj) {
            this.i.add(x40Var);
        }
    }

    public final w2.b a(final c0d c0dVar, final ib6 ib6Var) {
        x40 x40Var = new x40() { // from class: e5d
            @Override // defpackage.x40
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return ti4.k1(c0dVar.apply(obj));
            }
        };
        int i = v7d.a;
        final m7d m7dVar = new m7d(m6d.a(), x40Var);
        rla rlaVar = z7d.a;
        xl7.n(rlaVar, "ticker");
        rlaVar.a();
        String strConcat = "Update ".concat(String.valueOf(this.a));
        this.h.getClass();
        z6d z6dVarD = p50.d(strConcat);
        try {
            final b1 b1VarA = this.f.a();
            nn3 nn3Var = this.d;
            w40 w40Var = new w40() { // from class: c5d
                @Override // defpackage.w40
                public final /* synthetic */ ListenableFuture call() {
                    return b1VarA;
                }
            };
            y03 y03Var = y03.t;
            nn3Var.a(w40Var, y03Var);
            ListenableFuture listenableFutureA = nn3Var.a(v7d.a(new w40() { // from class: d5d
                @Override // defpackage.w40
                public final ListenableFuture call() {
                    final m7d m7dVar2 = m7dVar;
                    final Executor executor = ib6Var;
                    final j5d j5dVar = this.a;
                    x40 x40Var2 = new x40() { // from class: f5d
                        @Override // defpackage.x40
                        public final /* synthetic */ ListenableFuture apply(Object obj) {
                            return ((z4d) j5dVar.c).a(m7dVar2, executor);
                        }
                    };
                    int i2 = v7d.a;
                    return ti4.n1(b1VarA, new m7d(m6d.a(), x40Var2), y03.t);
                }
            }), y03Var);
            ti4.propagateCancellation(listenableFutureA, b1VarA);
            ti4.l1(this.b);
            w2.b bVarM1 = ti4.m1(listenableFutureA, new qi4(), y03Var);
            z6dVarD.h(bVarM1);
            z6dVarD.close();
            return bVarM1;
        } catch (Throwable th) {
            try {
                z6dVarD.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
