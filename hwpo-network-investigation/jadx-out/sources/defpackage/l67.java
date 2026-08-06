package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l67 {
    public final h67 a;
    public final fx9<c67> b = new fx9<>(0);
    public int c;
    public String d;
    public String e;

    public l67(h67 h67Var) {
        this.a = h67Var;
    }

    public final c67 a(int i) {
        return c(i, this.a, null, false);
    }

    public final c67 b(String str, boolean z) {
        Object next;
        h67 h67Var;
        c67 c67Var;
        str.getClass();
        fx9<c67> fx9Var = this.b;
        fx9Var.getClass();
        Iterator it = ((rx1) ed9.c(new hx9(fx9Var))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c67Var = (c67) next;
            if (w2a.i(c67Var.u.e, str, false)) {
                break;
            }
        } while (c67Var.u.a(str) == null);
        c67 c67Var2 = (c67) next;
        if (c67Var2 != null) {
            return c67Var2;
        }
        if (!z || (h67Var = this.a.v) == null) {
            return null;
        }
        l67 l67Var = h67Var.y;
        l67Var.getClass();
        if (z2a.w(str)) {
            return null;
        }
        return l67Var.b(str, true);
    }

    public final c67 c(int i, c67 c67Var, c67 c67Var2, boolean z) {
        fx9<c67> fx9Var = this.b;
        c67 c67VarC = fx9Var.c(i);
        if (c67Var2 != null) {
            if (xj5.a(c67VarC, c67Var2) && xj5.a(c67VarC.v, c67Var2.v)) {
                return c67VarC;
            }
            c67VarC = null;
        } else if (c67VarC != null) {
            return c67VarC;
        }
        h67 h67Var = this.a;
        if (z) {
            Iterator it = ((rx1) ed9.c(new hx9(fx9Var))).iterator();
            do {
                if (!it.hasNext()) {
                    c67VarC = null;
                    break;
                }
                c67 c67Var3 = (c67) it.next();
                c67VarC = (!(c67Var3 instanceof h67) || c67Var3.equals(c67Var)) ? null : ((h67) c67Var3).y.c(i, h67Var, c67Var2, true);
            } while (c67VarC == null);
        }
        if (c67VarC != null) {
            return c67VarC;
        }
        h67 h67Var2 = h67Var.v;
        if (h67Var2 == null || h67Var2.equals(c67Var)) {
            return null;
        }
        h67 h67Var3 = h67Var.v;
        h67Var3.getClass();
        return h67Var3.y.c(i, h67Var, c67Var2, z);
    }

    public final c67.b d(c67.b bVar, b67 b67Var, boolean z, c67 c67Var) {
        c67.b bVarJ;
        ArrayList arrayList = new ArrayList();
        h67 h67Var = this.a;
        Iterator<c67> it = h67Var.iterator();
        while (true) {
            k67 k67Var = (k67) it;
            bVarJ = null;
            if (!k67Var.hasNext()) {
                break;
            }
            c67 c67Var2 = (c67) k67Var.next();
            bVarJ = xj5.a(c67Var2, c67Var) ? null : c67Var2.i(b67Var);
            if (bVarJ != null) {
                arrayList.add(bVarJ);
            }
        }
        c67.b bVar2 = (c67.b) th1.I(arrayList);
        h67 h67Var2 = h67Var.v;
        if (h67Var2 != null && z && !h67Var2.equals(c67Var)) {
            bVarJ = h67Var2.j(b67Var, h67Var);
        }
        return (c67.b) th1.I(u30.v(new c67.b[]{bVar, bVar2, bVarJ}));
    }
}
