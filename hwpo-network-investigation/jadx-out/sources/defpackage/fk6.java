package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fk6 implements pg7 {
    public final /* synthetic */ int t;
    public final /* synthetic */ View u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    public fk6(View view, int i, int i2, int i3, int i4) {
        this.t = i;
        this.u = view;
        this.v = i2;
        this.w = i3;
        this.x = i4;
    }

    @Override // defpackage.pg7
    public final umb b(View view, umb umbVar) {
        xd5 xd5VarI = umbVar.a.i(519);
        View view2 = this.u;
        int i = this.t;
        if (i >= 0) {
            view2.getLayoutParams().height = i + xd5VarI.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.v + xd5VarI.a, this.w + xd5VarI.b, this.x + xd5VarI.c, view2.getPaddingBottom());
        return umbVar;
    }
}
