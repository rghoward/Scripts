package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class g69 {
    public final dt7 a = bl7.i(Boolean.FALSE);

    public final void a(cm cmVar, yb9 yb9Var, h72 h72Var, Consumer consumer) {
        k37 k37Var = new k37(new h69[16]);
        bs4.a(yb9Var.a(), 0, new d69(1, k37Var, k37.class, "add", "add(Ljava/lang/Object;)Z", 8));
        final oh4[] oh4VarArr = {e69.v, f69.u};
        Arrays.sort(k37Var.t, 0, k37Var.v, new Comparator() { // from class: zo1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                for (oh4 oh4Var : oh4VarArr) {
                    int iF = eo7.f((Comparable) oh4Var.invoke(obj), (Comparable) oh4Var.invoke(obj2));
                    if (iF != 0) {
                        return iF;
                    }
                }
                return 0;
            }
        });
        int i = k37Var.v;
        h69 h69Var = (h69) (i == 0 ? null : k37Var.t[i - 1]);
        if (h69Var == null) {
            return;
        }
        gg5 gg5Var = h69Var.c;
        rs1 rs1Var = new rs1(h69Var.a, gg5Var, u72.a(h72Var), this, cmVar);
        mb7 mb7Var = h69Var.d;
        sk8 sk8VarZ = rq5.d(mb7Var).Z(mb7Var, true);
        long jC = gg5Var.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(cmVar, h40.c(qk1.d(sk8VarZ)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), rs1Var);
        scrollCaptureTarget.setScrollBounds(h40.c(gg5Var));
        consumer.accept(scrollCaptureTarget);
    }
}
