package defpackage;

import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class te1 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ te1(int i, Object obj, Object obj2) {
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
                cl8 cl8Var = (cl8) obj2;
                boolean z = cl8Var.t || ((mk4) obj).L0((a58) obj3);
                cl8Var.t = z;
                return Boolean.valueOf(!z);
            default:
                return InboxScreenKt.InboxContent$lambda$7$lambda$6((m76) obj3, (a06) obj2, (c33) obj);
        }
    }
}
