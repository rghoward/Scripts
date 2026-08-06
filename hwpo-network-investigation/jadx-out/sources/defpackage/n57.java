package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.d;
import io.intercom.android.sdk.m5.preview.ui.PreviewUriKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n57 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ n57(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                c67 c67Var = (c67) obj;
                c67Var.getClass();
                return Boolean.valueOf(!((q57) obj2).l.containsKey(Integer.valueOf(c67Var.u.d)));
            default:
                return PreviewUriKt.VideoPlayer$lambda$7$lambda$6((d) obj2, (Context) obj);
        }
    }
}
