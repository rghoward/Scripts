package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ka2 {
    public static final ql6 a = new ql6();

    public static q6d a(r9a r9aVar, r9a r9aVar2) {
        final k41 k41Var = new k41();
        final t9a t9aVar = new t9a(k41Var.a);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        s02 s02Var = new s02() { // from class: ja2
            @Override // defpackage.s02
            public final Object a(r9a r9aVar3) {
                boolean zN = r9aVar3.n();
                t9a t9aVar2 = t9aVar;
                if (zN) {
                    t9aVar2.d(r9aVar3.j());
                } else if (r9aVar3.i() != null) {
                    t9aVar2.c(r9aVar3.i());
                } else if (atomicBoolean.getAndSet(true)) {
                    k41Var.a.a.q(null);
                }
                return caa.e(null);
            }
        };
        ql6 ql6Var = a;
        r9aVar.h(ql6Var, s02Var);
        r9aVar2.h(ql6Var, s02Var);
        return t9aVar.a;
    }
}
