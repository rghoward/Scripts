package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ gm0(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                dja djaVar = (dja) this.u;
                oh4 oh4Var = (oh4) this.v;
                ria riaVar = (ria) obj;
                if (djaVar != null) {
                    djaVar.a.setValue(riaVar);
                }
                if (oh4Var != null) {
                    oh4Var.invoke(riaVar);
                }
                return g2b.a;
            default:
                xza xzaVar = (xza) this.u;
                wza wzaVar = (wza) this.v;
                yza yzaVar = (yza) obj;
                synchronized (((rd7) xzaVar.a)) {
                    try {
                        boolean zC = yzaVar.c();
                        nf6 nf6Var = (nf6) xzaVar.b;
                        if (zC) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return g2b.a;
        }
    }
}
