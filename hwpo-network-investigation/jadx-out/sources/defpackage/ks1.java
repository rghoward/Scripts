package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 extends d67<js1.a> {
    public final js1 g;
    public final fr1 h;
    public oh4<ru<r47>, th3> i;
    public oh4<ru<r47>, jo3> j;
    public oh4<ru<r47>, th3> k;
    public oh4<ru<r47>, jo3> l;

    public ks1(js1 js1Var, String str, fr1 fr1Var) {
        super(js1Var, str);
        this.g = js1Var;
        this.h = fr1Var;
    }

    @Override // defpackage.d67
    public final c67 a() {
        js1.a aVar = (js1.a) super.a();
        aVar.z = this.i;
        aVar.A = this.j;
        aVar.B = this.k;
        aVar.C = this.l;
        return aVar;
    }

    @Override // defpackage.d67
    public final c67 b() {
        return new js1.a(this.g, this.h);
    }
}
