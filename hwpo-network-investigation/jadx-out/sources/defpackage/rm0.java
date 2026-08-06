package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rm0 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ rm0(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                dja djaVar = (dja) obj2;
                iw iwVar = (iw) obj;
                if (djaVar == null) {
                    return iwVar;
                }
                fv9<oh4<cba, g2b>> fv9Var = djaVar.c;
                boolean zIsEmpty = fv9Var.isEmpty();
                iw iwVar2 = djaVar.b;
                if (!zIsEmpty) {
                    cba cbaVar = new cba(iwVar2);
                    int size = fv9Var.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        fv9Var.get(i2).invoke(cbaVar);
                    }
                    iwVar2 = cbaVar.b;
                }
                djaVar.b = iwVar2;
                return iwVar2 == null ? iwVar : iwVar2;
            default:
                lj9.a aVar = lj9.Companion;
                ((lj9) obj2).i((h08) obj);
                return g2b.a;
        }
    }
}
