package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v66 {
    public final s66 a;
    public final z13 b;
    public final u66 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l76, u66] */
    public v66(s66 s66Var, z13 z13Var, final el5 el5Var) {
        s66Var.getClass();
        z13Var.getClass();
        this.a = s66Var;
        this.b = z13Var;
        ?? r4 = new g76() { // from class: u66
            @Override // defpackage.g76
            public final void t(m76 m76Var, s66.a aVar) {
                s66.b bVarB = m76Var.getLifecycle().b();
                s66.b bVar = s66.b.t;
                v66 v66Var = this.t;
                if (bVarB == bVar) {
                    el5Var.k(null);
                    v66Var.a();
                    return;
                }
                int iCompareTo = m76Var.getLifecycle().b().compareTo(s66.b.v);
                z13 z13Var2 = v66Var.b;
                if (iCompareTo < 0) {
                    z13Var2.a = true;
                    return;
                }
                if (z13Var2.a) {
                    if (z13Var2.b) {
                        aa0.c("Cannot resume a finished dispatcher");
                    } else {
                        z13Var2.a = false;
                        z13Var2.a();
                    }
                }
            }
        };
        this.c = r4;
        if (s66Var.b() != s66.b.t) {
            s66Var.a(r4);
        } else {
            el5Var.k(null);
            a();
        }
    }

    public final void a() {
        this.a.c(this.c);
        z13 z13Var = this.b;
        z13Var.b = true;
        z13Var.a();
    }
}
