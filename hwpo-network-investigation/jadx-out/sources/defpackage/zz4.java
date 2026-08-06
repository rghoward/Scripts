package defpackage;

import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.ui.HomeContentScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zz4 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ zz4(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return HomeContentScreenKt.HomeContentScreen$lambda$13$lambda$12((TicketType) obj);
            default:
                cr9 cr9Var = (cr9) obj;
                return new cw(Float.intBitsToFloat((int) (cr9Var.a >> 32)), Float.intBitsToFloat((int) (cr9Var.a & 4294967295L)));
        }
    }
}
