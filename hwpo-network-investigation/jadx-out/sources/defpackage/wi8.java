package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {171, 183, 187}, m = "executeMain")
public final class wi8 extends u02 {
    public int A;
    public ti8 t;
    public bq8 u;
    public k85 v;
    public nm3 w;
    public Bitmap x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ti8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi8(ti8 ti8Var, u02 u02Var) {
        super(u02Var);
        this.z = ti8Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return ti8.d(this.z, null, 0, this);
    }
}
