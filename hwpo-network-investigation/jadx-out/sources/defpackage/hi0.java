package defpackage;

import android.content.Context;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.survey.block.VideoFileBlockKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi0 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ hi0(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.v;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ii0 ii0Var = (ii0) obj2;
                tr5 tr5Var = (tr5) obj;
                ii0Var.P = ii0Var.K.mo0createOutlinePq9zytI(tr5Var.t.c(), tr5Var.getLayoutDirection(), tr5Var);
                return g2b.a;
            case 1:
                return HomeScreenKt.HomeScreen$lambda$14$lambda$8$lambda$7$lambda$6((PoweredBy) obj2, (Context) obj);
            default:
                return VideoFileBlockKt.VideoFileBlock$lambda$2$lambda$1((String) obj2, (Context) obj);
        }
    }
}
