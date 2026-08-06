package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zp5 implements oh4<Throwable, g2b> {
    public final /* synthetic */ aq5 t;
    public final /* synthetic */ e41 u;

    public zp5(aq5 aq5Var, e41 e41Var) {
        this.t = aq5Var;
        this.u = e41Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Throwable th) {
        aq5 aq5Var = this.t;
        Object obj = aq5Var.a;
        e41 e41Var = this.u;
        synchronized (obj) {
            aq5Var.b.remove(e41Var);
        }
        return g2b.a;
    }
}
