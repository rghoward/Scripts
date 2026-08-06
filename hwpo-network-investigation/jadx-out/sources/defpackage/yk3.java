package defpackage;

import io.intercom.android.sdk.survey.block.TextBlockKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yk3 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ yk3(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = gl3.V;
                xj3 xj3Var = ((il3) obj).d;
                String str = xj3Var != null ? xj3Var.b : null;
                return Boolean.valueOf(true ^ (str == null || str.length() == 0));
            case 1:
                ho5<Object>[] ho5VarArr = ec9.a;
                gc9<g2b> gc9Var = ac9.y;
                g2b g2bVar = g2b.a;
                ((hc9) obj).d(gc9Var, g2bVar);
                return g2bVar;
            case 2:
                int i2 = fj7.K;
                return Boolean.valueOf(((hj7) obj).e);
            case 3:
                int i3 = k48.D;
                s10 s10Var = ((l48) obj).b;
                if (s10Var == null || s10Var == s10.ENGLISH) {
                    return null;
                }
                return s10Var;
            default:
                return TextBlockKt.TextBlock$lambda$3$lambda$2((List) obj);
        }
    }
}
