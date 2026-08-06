package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yh6 implements wh6 {
    @Override // defpackage.wh6
    public final uh6 a(Object obj, Object obj2) {
        uh6 uh6VarC = (uh6) obj;
        uh6 uh6Var = (uh6) obj2;
        if (!uh6Var.isEmpty()) {
            if (!uh6VarC.t) {
                uh6VarC = uh6VarC.c();
            }
            uh6VarC.b();
            if (!uh6Var.isEmpty()) {
                uh6VarC.putAll(uh6Var);
            }
        }
        return uh6VarC;
    }

    @Override // defpackage.wh6
    public final Object b(Object obj) {
        ((uh6) obj).t = false;
        return obj;
    }

    @Override // defpackage.wh6
    public final sh6.a<?, ?> c(Object obj) {
        return ((sh6) obj).a;
    }

    @Override // defpackage.wh6
    public final int d(int i, Object obj, Object obj2) {
        uh6 uh6Var = (uh6) obj;
        sh6 sh6Var = (sh6) obj2;
        int iB = 0;
        if (uh6Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : uh6Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sh6Var.getClass();
            int iK1 = tg1.k1(i);
            int iA = sh6.a(sh6Var.a, key, value);
            iB = h44.b(iA, iA, iK1, iB);
        }
        return iB;
    }

    @Override // defpackage.wh6
    public final uh6 e(Object obj) {
        return (uh6) obj;
    }
}
