package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yda implements oh4 {
    public final /* synthetic */ nd3 t;
    public final /* synthetic */ oh4 u;
    public final /* synthetic */ gl8 v;

    public /* synthetic */ yda(nd3 nd3Var, g75 g75Var, gl8 gl8Var) {
        this.t = nd3Var;
        this.u = g75Var;
        this.v = gl8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        gia giaVar = (gia) this.v.t;
        kha khaVarA = this.t.a((List) obj);
        if (giaVar != null) {
            giaVar.a(null, khaVarA);
        }
        this.u.invoke(khaVarA);
        return g2b.a;
    }
}
