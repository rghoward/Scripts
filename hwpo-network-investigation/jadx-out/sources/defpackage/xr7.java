package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {468}, m = "presentNewList", v = 1)
public final class xr7 extends u02 {
    public int A;
    public int B;
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ ur7<Object> E;
    public int F;
    public List t;
    public vb6 u;
    public vb6 v;
    public sy4 w;
    public mp7 x;
    public sy4 y;
    public mp7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr7(ur7 ur7Var, u02 u02Var) {
        super(u02Var);
        this.E = ur7Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return ur7.a(this.E, null, 0, 0, false, null, null, null, this);
    }
}
