package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fz0 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ fz0(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                ec9.e((hc9) obj, 0);
                return g2b.a;
            case 1:
                sk1.a aVar = (sk1.a) obj;
                int i = qn1.a0;
                aVar.getClass();
                return aVar.k;
            case 2:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            default:
                ybb.a aVar2 = ybb.Companion;
                return ((icb) obj).e;
        }
    }
}
