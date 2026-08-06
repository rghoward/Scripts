package defpackage;

import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw0 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ dw0(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                ((ew0) obj3).a.n((dz1.a) obj2);
                break;
            default:
                td1 td1Var = (td1) obj;
                td1Var.getClass();
                td1.a(td1Var, "key", ((KSerializer) obj3).getDescriptor());
                td1.a(td1Var, "value", ((KSerializer) obj2).getDescriptor());
                break;
        }
        return g2b.a;
    }
}
