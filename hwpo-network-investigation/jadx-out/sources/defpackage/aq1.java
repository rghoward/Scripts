package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aq1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ aq1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return dq1.defaultViewModelProviderFactory_delegate$lambda$0((dq1) obj);
            case 1:
                Boolean bool = (Boolean) ((h37) obj).getValue();
                bool.booleanValue();
                return bool;
            default:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$7$lambda$6((oh4) obj);
        }
    }
}
