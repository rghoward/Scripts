package defpackage;

import android.content.Context;
import com.hwpo_training_app.host.presentation.HostActivity;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p15 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ p15(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                HostActivity hostActivity = (HostActivity) obj2;
                gm3 gm3Var = (gm3) obj;
                ho5<Object>[] ho5VarArr = HostActivity.K;
                gm3Var.getClass();
                if (gm3Var instanceof b25) {
                    hostActivity.c(null, ((b25) gm3Var).b);
                } else if (gm3Var instanceof a25) {
                    yz1.a(hostActivity, ((a25) gm3Var).b);
                } else if (gm3Var instanceof c25) {
                    hostActivity.w().d.setPlayer(hostActivity.x());
                    hostActivity.x().d();
                }
                return g2b.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                String str = ((al5) obj2).a;
                LinkedHashSet linkedHashSet = im9.a;
                linkedHashSet.getClass();
                return ws0.h(new fm9(context, str, jm9.a, new hm9(linkedHashSet, null), new gm9(3, null)));
        }
    }
}
