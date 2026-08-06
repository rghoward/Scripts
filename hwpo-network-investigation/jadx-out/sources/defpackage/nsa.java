package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nsa {
    public final int a;
    public final mn8[] b;
    public final fq3[] c;
    public final vua d;
    public final Object e;

    public nsa(mn8[] mn8VarArr, fq3[] fq3VarArr, vua vuaVar, Object obj) {
        xl7.g(mn8VarArr.length == fq3VarArr.length);
        this.b = mn8VarArr;
        this.c = (fq3[]) fq3VarArr.clone();
        this.d = vuaVar;
        this.e = obj;
        this.a = mn8VarArr.length;
    }

    public final boolean a(nsa nsaVar, int i) {
        return nsaVar != null && Objects.equals(this.b[i], nsaVar.b[i]) && Objects.equals(this.c[i], nsaVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
