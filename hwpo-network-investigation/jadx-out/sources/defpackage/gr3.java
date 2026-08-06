package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gr3 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ gr3(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((jz7.a) obj).l((jz7) obj2, 0, 0, 0.0f);
                return g2b.a;
            case 1:
                dr7 dr7Var = (dr7) obj2;
                z87 z87Var = (z87) obj;
                hu9 hu9VarA = hu9.a.a();
                oh4<Object, g2b> oh4VarE = hu9VarA != null ? hu9VarA.e() : null;
                hu9 hu9VarB = hu9.a.b(hu9VarA);
                try {
                    z87Var.a(dr7Var.e);
                    g2b g2bVar = g2b.a;
                    return g2b.a;
                } finally {
                    hu9.a.d(hu9VarA, hu9VarB, oh4VarE);
                }
            default:
                return new mwa((tva) obj2);
        }
    }
}
