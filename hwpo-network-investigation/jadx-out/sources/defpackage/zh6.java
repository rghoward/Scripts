package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zh6 implements xh6 {
    @Override // defpackage.xh6
    public final vh6 a(Object obj, Object obj2) {
        vh6 vh6VarC = (vh6) obj;
        vh6 vh6Var = (vh6) obj2;
        if (!vh6Var.isEmpty()) {
            if (!vh6VarC.t) {
                vh6VarC = vh6VarC.c();
            }
            vh6VarC.b();
            if (!vh6Var.isEmpty()) {
                vh6VarC.putAll(vh6Var);
            }
        }
        return vh6VarC;
    }

    @Override // defpackage.xh6
    public final Object b(Object obj) {
        ((vh6) obj).t = false;
        return obj;
    }

    @Override // defpackage.xh6
    public final rh6.a<?, ?> c(Object obj) {
        return ((rh6) obj).a;
    }

    @Override // defpackage.xh6
    public final int d(int i, Object obj, Object obj2) {
        vh6 vh6Var = (vh6) obj;
        rh6 rh6Var = (rh6) obj2;
        int iN1 = 0;
        if (vh6Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : vh6Var.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            rh6Var.getClass();
            int iM1 = sg1.m1(i);
            int iA = rh6.a(rh6Var.a, key, value);
            iN1 += sg1.n1(iA) + iA + iM1;
        }
        return iN1;
    }

    @Override // defpackage.xh6
    public final vh6 e(Object obj) {
        return (vh6) obj;
    }

    @Override // defpackage.xh6
    public final vh6 f() {
        return vh6.u.c();
    }

    @Override // defpackage.xh6
    public final vh6 g(Object obj) {
        return (vh6) obj;
    }

    @Override // defpackage.xh6
    public final boolean h(Object obj) {
        return !((vh6) obj).t;
    }
}
