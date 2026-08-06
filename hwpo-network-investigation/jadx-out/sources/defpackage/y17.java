package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y17 {
    public final j52 a = new j52();
    public final a0a b;
    public final li8 c;

    public y17() {
        a0a a0aVarB = b0a.b(null);
        this.b = a0aVarB;
        this.c = yk2.b(a0aVarB);
    }

    public static ub6 a(ub6 ub6Var, ub6 ub6Var2, ub6 ub6Var3, ub6 ub6Var4) {
        if (ub6Var4 == null) {
            return ub6Var3;
        }
        if (ub6Var instanceof ub6.b) {
            return (((ub6Var2 instanceof ub6.c) && (ub6Var4 instanceof ub6.c)) || (ub6Var4 instanceof ub6.a)) ? ub6Var4 : ub6Var;
        }
        return ub6Var4;
    }

    public final void b(vb6 vb6Var, vb6 vb6Var2) {
        a0a a0aVar;
        Object value;
        ub6 ub6Var;
        ub6 ub6Var2;
        jj1 jj1Var;
        ub6 ub6Var3;
        vb6Var.getClass();
        do {
            a0aVar = this.b;
            value = a0aVar.getValue();
            jj1 jj1Var2 = (jj1) value;
            ub6 ub6Var4 = ub6.c.c;
            if (jj1Var2 == null || (ub6Var = jj1Var2.a) == null) {
                ub6Var = ub6Var4;
            }
            ub6 ub6Var5 = vb6Var.a;
            ub6 ub6VarA = a(ub6Var, ub6Var5, ub6Var5, vb6Var2 != null ? vb6Var2.a : null);
            if (jj1Var2 == null || (ub6Var2 = jj1Var2.b) == null) {
                ub6Var2 = ub6Var4;
            }
            ub6 ub6VarA2 = a(ub6Var2, ub6Var5, vb6Var.b, vb6Var2 != null ? vb6Var2.b : null);
            if (jj1Var2 != null && (ub6Var3 = jj1Var2.c) != null) {
                ub6Var4 = ub6Var3;
            }
            jj1Var = new jj1(ub6VarA, ub6VarA2, a(ub6Var4, ub6Var5, vb6Var.c, vb6Var2 != null ? vb6Var2.c : null), vb6Var, vb6Var2);
            if (xj5.a(jj1Var2, jj1Var)) {
                return;
            }
        } while (!a0aVar.c(value, jj1Var));
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((oh4) it.next()).invoke(jj1Var);
        }
    }
}
