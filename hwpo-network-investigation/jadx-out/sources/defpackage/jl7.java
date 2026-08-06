package defpackage;

import io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl7 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ jl7(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0((mh4) obj2, (String) obj);
            case 1:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                ma6 ma6Var = (ma6) yaVar.u;
                ma6Var.c.setSelected(((pr8) yaVar.t()).a);
                ma6Var.b.setText(((pr8) yaVar.t()).b.u);
                return g2b.a;
            default:
                ((jz7.a) obj).l((jz7) obj2, 0, 0, 0.0f);
                return g2b.a;
        }
    }
}
