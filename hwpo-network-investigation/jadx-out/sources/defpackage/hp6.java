package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hp6 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ hp6(int i) {
        this.t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        fja fjaVarB;
        ww9 ww9Var;
        switch (this.t) {
            case 0:
                ip6.b bVar = ip6.Companion;
                return ((lp6) obj).g;
            default:
                iw.c cVar = (iw.c) obj;
                T t = cVar.a;
                if (!(t instanceof l86) || (fjaVarB = ((l86) t).b()) == null || (fjaVarB.a == null && fjaVarB.b == null && fjaVarB.c == null && fjaVarB.d == null)) {
                    return ws0.c(cVar);
                }
                T t2 = cVar.a;
                t2.getClass();
                fja fjaVarB2 = ((l86) t2).b();
                if (fjaVarB2 == null || (ww9Var = fjaVarB2.a) == null) {
                    ww9Var = new ww9(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                }
                return ws0.c(cVar, new iw.c(cVar.b, cVar.c, ww9Var));
        }
    }
}
