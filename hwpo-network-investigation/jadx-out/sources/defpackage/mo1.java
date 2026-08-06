package defpackage;

import io.intercom.android.sdk.post.IntercomPostActivityKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mo1 implements ci4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ ei4 w;

    public /* synthetic */ mo1(Object obj, ei4 ei4Var, int i, int i2) {
        this.t = i2;
        this.v = obj;
        this.w = ei4Var;
        this.u = i;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        int i2 = this.u;
        ei4 ei4Var = this.w;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                no1.a((qga) obj3, (fr1) ei4Var, (jt1) obj, gz3.s(i2 | 1));
                return g2b.a;
            default:
                return IntercomPostActivityKt.BottomBarContent$lambda$5((ox6) obj3, ei4Var, i2, (jt1) obj, ((Integer) obj2).intValue());
        }
    }
}
