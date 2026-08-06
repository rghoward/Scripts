package defpackage;

import android.view.View;
import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uy5 implements jac {
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ uy5 u = new uy5();

    public static final void b(View view) {
        view.getClass();
        zc9 zc9VarB = xs.b(new fhb(view, null));
        while (zc9VarB.hasNext()) {
            ArrayList<u58> arrayList = c((View) zc9VarB.next()).a;
            for (int iG = ws0.g(arrayList); -1 < iG; iG--) {
                arrayList.get(iG).a();
            }
        }
    }

    public static final v58 c(View view) {
        v58 v58Var = (v58) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (v58Var != null) {
            return v58Var;
        }
        v58 v58Var2 = new v58();
        view.setTag(R.id.pooling_container_listener_holder_tag, v58Var2);
        return v58Var2;
    }

    public static final long d(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : uh1.b(uh1.d(j) * f, j);
    }

    public static final int e(ty5 ty5Var) {
        List<hy5> listG = ty5Var.g();
        if (listG.isEmpty()) {
            return 0;
        }
        int size = listG.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            size2 += listG.get(i).getSize();
        }
        return ty5Var.f() + (size2 / listG.size());
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().j0());
    }
}
