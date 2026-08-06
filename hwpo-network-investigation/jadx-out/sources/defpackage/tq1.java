package defpackage;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tq1 {
    public final List<qp1<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final qp1<?> qp1Var : componentRegistrar.getComponents()) {
            final String str = qp1Var.a;
            if (str != null) {
                qp1Var = new qp1<>(str, qp1Var.b, qp1Var.c, qp1Var.d, qp1Var.e, new qq1() { // from class: sq1
                    @Override // defpackage.qq1
                    public final Object a(xu8 xu8Var) {
                        String str2 = str;
                        qp1 qp1Var2 = qp1Var;
                        try {
                            Trace.beginSection(str2);
                            return qp1Var2.f.a(xu8Var);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, qp1Var.g);
            }
            arrayList.add(qp1Var);
        }
        return arrayList;
    }
}
