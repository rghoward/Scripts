package defpackage;

import com.google.android.material.card.MaterialCardView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g06 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ g06(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                m09 m09Var = (m09) obj2;
                return Boolean.valueOf(m09Var != null ? m09Var.a(obj) : true);
            default:
                ya yaVar = (ya) obj2;
                ((List) obj).getClass();
                MaterialCardView materialCardView = ((qa6) yaVar.u).a;
                materialCardView.getClass();
                hv5.b(materialCardView, (wab) yaVar.t());
                return g2b.a;
        }
    }
}
