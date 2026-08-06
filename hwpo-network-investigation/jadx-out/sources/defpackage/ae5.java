package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ae5 extends ox6.c implements txa {
    public omb H;
    public omb I;

    public ae5() {
        j34 j34Var = gnb.a;
        this.H = j34Var;
        this.I = j34Var;
    }

    @Override // defpackage.txa
    public final Object G() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // ox6.c
    public void U1() {
        yx.e(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new m13(1, this));
        d2();
    }

    @Override // ox6.c
    public void V1() {
        this.I = this.H;
        yx.g(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new zd5(this));
    }

    @Override // ox6.c
    public final void W1() {
        this.H = gnb.a;
    }

    public abstract omb c2(omb ombVar);

    public void d2() {
        this.I = c2(this.H);
        yx.g(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new zd5(this));
    }
}
