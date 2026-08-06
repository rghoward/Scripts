package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ up1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return dq1.fullyDrawnReporter_delegate$lambda$0((dq1) obj);
            case 1:
                return new gga((fl7) obj);
            case 2:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$19$lambda$18((oh4) obj);
            case 3:
                return ((ca8) ((aa8) obj).e.getValue()).a;
            case 4:
                qga qgaVar = (qga) obj;
                kha khaVarE = qga.e(qgaVar.n().a, ay.c(0, qgaVar.n().a.u.length()));
                qgaVar.c.invoke(khaVarE);
                long j = khaVarE.b;
                qgaVar.w = new lja(j);
                qgaVar.u = kha.a(qgaVar.u, null, j, 5);
                qgaVar.h(true);
                return g2b.a;
            default:
                return (rua.a) ga1.a(((p91) obj).d());
        }
    }
}
