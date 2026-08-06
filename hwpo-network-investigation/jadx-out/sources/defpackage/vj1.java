package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vj1 implements ei4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ vj1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ei4
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.t;
        boolean z = false;
        Object obj4 = this.u;
        switch (i) {
            case 0:
                oh4 oh4Var = (oh4) obj4;
                v23 v23Var = (v23) obj;
                ((Integer) obj3).getClass();
                v23Var.getClass();
                ((List) obj2).getClass();
                if ((v23Var instanceof sk1.a) && ((Boolean) oh4Var.invoke(((sk1.a) v23Var).k)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                btb btbVar = (btb) obj4;
                umb umbVar = (umb) obj2;
                btb.a aVar = btb.Companion;
                ((View) obj).getClass();
                umbVar.getClass();
                ((ec5) obj3).getClass();
                umb.q qVar = umbVar.a;
                int i2 = qVar.i(1).b;
                int i3 = qVar.i(2).d;
                int i4 = qVar.i(2).c;
                int i5 = qVar.i(2).a;
                ConstraintLayout constraintLayout = ((etb) btbVar.J.a(btbVar, btb.L[0])).a;
                constraintLayout.getClass();
                constraintLayout.setPadding(i5, i2, i4, i3);
                return g2b.a;
        }
    }
}
