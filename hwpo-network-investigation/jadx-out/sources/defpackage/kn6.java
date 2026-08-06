package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kn6 implements mn6.d {
    public final /* synthetic */ Context t;
    public final /* synthetic */ id4 u;

    public /* synthetic */ kn6(Context context, id4 id4Var) {
        this.t = context;
        this.u = id4Var;
    }

    @Override // mn6.d
    public final int a(Object obj) {
        en6 en6Var = (en6) obj;
        String str = en6Var.b;
        id4 id4Var = this.u;
        return ((str.equals(id4Var.o) || str.equals(mn6.c(id4Var))) && en6Var.c(this.t, id4Var, false) && en6Var.d(id4Var)) ? 1 : 0;
    }
}
