package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh0 implements oh4 {
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ mh0(ih0 ih0Var, fs1 fs1Var) {
        this.u = ih0Var;
        this.v = fs1Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                ih0 ih0Var = (ih0) obj3;
                fs1 fs1Var = (fs1) obj2;
                ih0Var.a(fs1Var);
                return new ph0(ih0Var, fs1Var);
            default:
                final fr3 fr3Var = (fr3) obj3;
                final xv9 xv9Var = (xv9) obj2;
                hc9 hc9Var = (hc9) obj;
                ec9.e(hc9Var, 6);
                hc9Var.d(kb9.b, new k3(null, new mh4() { // from class: dr3
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        fr3Var.invoke();
                        return Boolean.TRUE;
                    }
                }));
                return g2b.a;
        }
    }

    public /* synthetic */ mh0(boolean z, String str, String str2, String str3, fr3 fr3Var, xv9 xv9Var) {
        this.u = fr3Var;
        this.v = xv9Var;
    }
}
