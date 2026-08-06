package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g9 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ g9(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                int i = qn1.a0;
                return Boolean.valueOf(((ko1) obj).b);
            case 2:
                int i2 = cm2.I;
                return ((cm2.c) obj).d;
            default:
                ybb.a aVar = ybb.Companion;
                return ((icb) obj).a;
        }
    }
}
