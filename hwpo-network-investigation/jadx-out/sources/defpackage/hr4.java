package defpackage;

import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hr4 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ hr4(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        Object objA = null;
        switch (i) {
            case 0:
                final ya yaVar = (ya) obj;
                yaVar.getClass();
                FrameLayout frameLayout = ((x96) yaVar.u).a;
                frameLayout.getClass();
                xgb.a(frameLayout, new lr4((wq4.b) obj2, yaVar, null));
                yaVar.s(new oh4() { // from class: ir4
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj3) {
                        ((List) obj3).getClass();
                        ya yaVar2 = yaVar;
                        ((x96) yaVar2.u).b.setText(((mr4) yaVar2.t()).b);
                        ((x96) yaVar2.u).b.setChecked(((mr4) yaVar2.t()).c);
                        return g2b.a;
                    }
                });
                return g2b.a;
            default:
                i19 i19Var = (i19) obj2;
                h37 h37Var = (h37) obj;
                if (!(h37Var instanceof uu9)) {
                    z90.a("Failed requirement.");
                    return null;
                }
                uu9 uu9Var = (uu9) h37Var;
                if (uu9Var.getValue() != 0) {
                    T value = uu9Var.getValue();
                    value.getClass();
                    objA = i19Var.a(value);
                }
                wu9 wu9VarA = uu9Var.a();
                wu9VarA.getClass();
                return new dt7(objA, wu9VarA);
        }
    }
}
