package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {102}, m = "bringIntoView", v = 1)
public final class iw0 extends u02 {
    public sk8 t;
    public Object[] u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ jw0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw0(jw0 jw0Var, u02 u02Var) {
        super(u02Var);
        this.y = jw0Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, this);
    }
}
