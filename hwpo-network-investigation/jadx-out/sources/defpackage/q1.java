package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q1<T> implements p1<T> {
    public final a0a a;
    public final j74 b;
    public Integer c;

    public q1() {
        a0a a0aVarB = b0a.b(null);
        this.a = a0aVarB;
        this.b = new j74(a0aVarB);
    }

    @Override // defpackage.p1
    public final Integer b() {
        return this.c;
    }

    @Override // defpackage.p1
    public final j74 c() {
        return this.b;
    }

    @Override // defpackage.p1
    public final g2b d(int i, ArrayList arrayList) {
        Integer num = new Integer(i);
        this.c = num;
        lr7 lr7Var = new lr7(arrayList, num.intValue() != -1);
        a0a a0aVar = this.a;
        a0aVar.getClass();
        a0aVar.l(null, lr7Var);
        return g2b.a;
    }

    @Override // defpackage.p1
    public final g2b e(int i, ArrayList arrayList) {
        this.c = new Integer(i);
        a0a a0aVar = this.a;
        lr7 lr7Var = (lr7) a0aVar.getValue();
        ArrayList arrayListK = th1.K(lr7Var != null ? lr7Var.a : hf3.t, arrayList);
        Integer num = this.c;
        lr7 lr7Var2 = new lr7(arrayListK, num == null || num.intValue() != -1);
        a0aVar.getClass();
        a0aVar.l(null, lr7Var2);
        return g2b.a;
    }
}
