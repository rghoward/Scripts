package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hxa<T> implements bxa<T> {
    public final ef0 a;
    public final String b;
    public final ag3 c;
    public final nva<T, byte[]> d;
    public final pxa e;

    public hxa(ef0 ef0Var, String str, ag3 ag3Var, nva nvaVar, pxa pxaVar) {
        this.a = ef0Var;
        this.b = str;
        this.c = ag3Var;
        this.d = nvaVar;
        this.e = pxaVar;
    }

    public final void a(ae0 ae0Var, rxa rxaVar) {
        String str = this.b;
        if (str == null) {
            ac4.c("Null transportName");
            return;
        }
        nva<T, byte[]> nvaVar = this.d;
        if (nvaVar == null) {
            ac4.c("Null transformer");
            return;
        }
        xe0 xe0Var = new xe0(this.a, str, ae0Var, nvaVar, this.c);
        pxa pxaVar = this.e;
        q49 q49Var = pxaVar.c;
        ef0 ef0Var = xe0Var.a;
        ae0 ae0Var2 = xe0Var.c;
        ef0 ef0VarD = ef0Var.d(ae0Var2.b);
        be0.a aVar = new be0.a();
        aVar.f = new HashMap();
        aVar.d = Long.valueOf(pxaVar.a.getTime());
        aVar.e = Long.valueOf(pxaVar.b.getTime());
        String str2 = xe0Var.b;
        if (str2 == null) {
            ac4.c("Null transportName");
            return;
        }
        aVar.a = str2;
        aVar.c = new vf3(xe0Var.e, xe0Var.d.apply(ae0Var2.a));
        ae0Var2.getClass();
        aVar.b = null;
        re0 re0Var = ae0Var2.c;
        if (re0Var != null && re0Var.a() != null) {
            aVar.g = ae0Var2.c.a();
        }
        ae0Var2.getClass();
        q49Var.a(ef0VarD, aVar.b(), rxaVar);
    }
}
