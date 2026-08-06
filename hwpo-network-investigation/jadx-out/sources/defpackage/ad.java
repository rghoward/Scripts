package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ad implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ad(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                gd.a aVar = gd.Companion;
                return ((ud) obj).k;
            case 1:
                int i = cd4.B;
                return Boolean.valueOf(((dd4) obj).c);
            case 2:
                return ((r47) obj).y;
            default:
                w89 w89Var = (w89) obj;
                long j = w89Var.f;
                jv9 jv9Var = w89Var.h;
                if (jv9Var != null) {
                    jv9Var.d(w89Var, owa.a, w89Var.g);
                }
                long j2 = w89Var.f;
                if (j != j2) {
                    w89.a aVar2 = w89Var.o;
                    if (aVar2 != null) {
                        if (aVar2.a > j2) {
                            w89Var.z();
                        } else {
                            aVar2.g = j2;
                            if (aVar2.b == null) {
                                aVar2.h = wk6.c((1.0d - ((double) aVar2.e.a(0))) * w89Var.f);
                            }
                        }
                    } else if (j2 != 0) {
                        w89Var.C();
                    }
                }
                return g2b.a;
        }
    }
}
