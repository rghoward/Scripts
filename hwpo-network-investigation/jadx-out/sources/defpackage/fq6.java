package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fq6 implements ry1 {
    public final /* synthetic */ jq6.a t;
    public final /* synthetic */ rb6 u;
    public final /* synthetic */ mp6 v;
    public final /* synthetic */ IOException w;
    public final /* synthetic */ boolean x;

    public /* synthetic */ fq6(jq6.a aVar, rb6 rb6Var, mp6 mp6Var, IOException iOException, boolean z) {
        this.t = aVar;
        this.u = rb6Var;
        this.v = mp6Var;
        this.w = iOException;
        this.x = z;
    }

    @Override // defpackage.ry1
    public final void accept(Object obj) {
        jq6 jq6Var = (jq6) obj;
        jq6.a aVar = this.t;
        jq6Var.D(aVar.a, aVar.b, this.u, this.v, this.w, this.x);
    }
}
