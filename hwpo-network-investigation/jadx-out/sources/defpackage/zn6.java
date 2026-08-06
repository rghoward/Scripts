package defpackage;

import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zn6 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ zn6(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$3$lambda$2((oh4) obj);
            default:
                bf9.a aVar = bf9.Companion;
                return new jw3(new m67(2, (bf9) obj), R.color.attachmentsBackground);
        }
    }
}
