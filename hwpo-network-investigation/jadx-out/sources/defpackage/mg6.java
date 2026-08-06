package defpackage;

import android.widget.ImageView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class mg6 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ hk0 u;

    public /* synthetic */ mg6(hk0 hk0Var, int i) {
        this.t = i;
        this.u = hk0Var;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        hk0 hk0Var = this.u;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                og6 og6Var = (og6) hk0Var;
                ho5<Object>[] ho5VarArr = og6.F;
                if (iIntValue == R.id.calendar) {
                    og6Var.s(og6Var.q().b().x);
                } else if (iIntValue == R.id.leaderBoard) {
                    og6Var.s(og6Var.q().c().x);
                } else if (iIntValue == R.id.notificaions) {
                    og6Var.s(og6Var.q().a().x);
                } else if (iIntValue == R.id.profile) {
                    og6Var.s(og6Var.q().d().x);
                }
                break;
            default:
                ipa.b bVar = (ipa.b) obj;
                opa opaVar = (opa) hk0Var;
                opa.a aVar = opa.Companion;
                opaVar.p().e.setVisibility(bVar != null ? 0 : 8);
                if (bVar != null) {
                    ImageView imageView = opaVar.p().b;
                    u60 u60Var = bVar.u;
                    imageView.setVisibility((u60Var == u60.u || u60Var == u60.t) ? 0 : 8);
                    e85.b(opaVar.p().c, bVar.t, 0, false);
                }
                break;
        }
        return g2b.a;
    }
}
