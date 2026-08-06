package defpackage;

import androidx.media3.exoplayer.d;
import io.intercom.android.sdk.m5.preview.ui.PreviewUriKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r52 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ r52(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (i) {
            case 0:
                u56 u56Var = (u56) obj3;
                fx0 fx0Var = (fx0) obj2;
                cz1 cz1Var = (cz1) obj;
                cz1Var.K1();
                if (((Boolean) u56Var.s.getValue()).booleanValue() || ((Boolean) u56Var.t.getValue()).booleanValue()) {
                    d73.Q(cz1Var, fx0Var, 0L, 0L, 0.0f, null, null, 126);
                }
                return g2b.a;
            default:
                return PreviewUriKt.VideoPlayer$lambda$11$lambda$10((d) obj3, (h37) obj2, (c33) obj);
        }
    }
}
