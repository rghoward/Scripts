package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q86<T> implements s54 {
    public final /* synthetic */ t27<qg5> t;
    public final /* synthetic */ r86 u;

    public q86(t27<qg5> t27Var, r86 r86Var) {
        this.t = t27Var;
        this.u = r86Var;
    }

    @Override // defpackage.s54
    public final Object emit(Object obj, r02 r02Var) {
        qg5 qg5Var = (qg5) obj;
        boolean z = qg5Var instanceof l35;
        t27<qg5> t27Var = this.t;
        if (z || (qg5Var instanceof v84) || (qg5Var instanceof n88.b)) {
            t27Var.g(qg5Var);
        } else if (qg5Var instanceof m35) {
            t27Var.k(((m35) qg5Var).a);
        } else if (qg5Var instanceof w84) {
            t27Var.k(((w84) qg5Var).a);
        } else if (qg5Var instanceof n88.c) {
            t27Var.k(((n88.c) qg5Var).a);
        } else if (qg5Var instanceof n88.a) {
            t27Var.k(((n88.a) qg5Var).a);
        }
        Object[] objArr = t27Var.a;
        int i = t27Var.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            r86 r86Var = this.u;
            if (i2 >= i) {
                r86Var.b.j(i3);
                return g2b.a;
            }
            qg5 qg5Var2 = (qg5) objArr[i2];
            if (qg5Var2 instanceof l35) {
                r86Var.getClass();
                i3 |= 2;
            } else if (qg5Var2 instanceof v84) {
                r86Var.getClass();
                i3 |= 1;
            } else if (qg5Var2 instanceof n88.b) {
                r86Var.getClass();
                i3 |= 4;
            }
            i2++;
        }
    }
}
