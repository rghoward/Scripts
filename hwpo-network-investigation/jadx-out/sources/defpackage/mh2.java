package defpackage;

import com.hwpo_training_app.tracking.presentation.widget.ScoreInfoExpandableLayout;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mh2 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ mh2(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                hc9 hc9Var = (hc9) obj;
                ec9.c(hc9Var, 0);
                ec9.b((String) obj2, hc9Var);
                return g2b.a;
            case 1:
                l89 l89Var = (l89) obj;
                int i2 = ScoreInfoExpandableLayout.N;
                l89Var.getClass();
                oh4<? super l89, g2b> oh4Var = ((ScoreInfoExpandableLayout) obj2).J;
                if (oh4Var != null) {
                    oh4Var.invoke(l89Var);
                }
                return g2b.a;
            default:
                return WrapReportingTextKt.WrapReportingText_T042LqI$lambda$4$lambda$3((h37) obj2, (cz1) obj);
        }
    }
}
