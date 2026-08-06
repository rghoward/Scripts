package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up7 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ up7(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                ((ci4) obj3).invoke(Integer.valueOf(((lx5.c) obj).getIndex()), Integer.valueOf(((vp7) obj2).f().b));
                return g2b.a;
            default:
                xn6 xn6Var = new xn6((mh4) obj, 1);
                zga zgaVar = new zga(0, (tx2) obj3, (h37) obj2);
                if (yf6.a()) {
                    return yf6.a() ? new tf6(xn6Var, zgaVar, Build.VERSION.SDK_INT == 28 ? z08.a : a18.a) : ox6.a.t;
                }
                ru3.f("Magnifier is only supported on API level 28 and higher.");
                return null;
        }
    }
}
