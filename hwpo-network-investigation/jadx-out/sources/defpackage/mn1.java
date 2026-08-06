package defpackage;

import io.intercom.android.sdk.m5.preview.ui.PreviewRootScreenKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mn1 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ mn1(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = qn1.a0;
                return ((ko1) obj).d;
            case 1:
                int i2 = cm2.I;
                return Boolean.valueOf(((cm2.c) obj).b);
            case 2:
                return g2b.a;
            default:
                return PreviewRootScreenKt.PreviewRootScreenContent$lambda$13$lambda$12(((Integer) obj).intValue());
        }
    }
}
