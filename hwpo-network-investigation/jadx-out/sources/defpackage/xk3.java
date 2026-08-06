package defpackage;

import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.survey.block.TextBlockKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xk3 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ xk3(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        String str;
        switch (this.t) {
            case 0:
                int i = gl3.V;
                xj3 xj3Var = ((il3) obj).d;
                return (xj3Var == null || (str = xj3Var.b) == null) ? BuildConfig.FLAVOR : str;
            case 1:
                int i2 = fj7.K;
                return ((hj7) obj).f;
            case 2:
                int i3 = k48.D;
                return Boolean.valueOf(((l48) obj).a);
            case 3:
                return TextBlockKt.TextBlock$lambda$1$lambda$0((ria) obj);
            default:
                ec9.h((hc9) obj);
                return g2b.a;
        }
    }
}
