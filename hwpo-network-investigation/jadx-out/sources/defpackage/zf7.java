package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zf7 {
    public static final zf7 a = new zf7();

    public static final Object a(r9a r9aVar, qe5 qe5Var) throws Exception {
        if (!r9aVar.m()) {
            e41 e41Var = new e41(1, th0.e(qe5Var));
            e41Var.t();
            r9aVar.c(x03.t, new daa(e41Var));
            return e41Var.r();
        }
        Exception excI = r9aVar.i();
        if (excI != null) {
            throw excI;
        }
        if (!r9aVar.l()) {
            return r9aVar.j();
        }
        throw new CancellationException("Task " + r9aVar + " was cancelled normally.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [yf7] */
    public static final ox6 b(final float f, final float f2, ox6 ox6Var) {
        return ox6Var.H(new xf7(f, f2, new oh4() { // from class: yf7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                pe5 pe5Var = (pe5) obj;
                pe5Var.getClass();
                iab iabVar = pe5Var.a;
                iabVar.b(new y43(f), "x");
                iabVar.b(new y43(f2), "y");
                return g2b.a;
            }
        }));
    }
}
