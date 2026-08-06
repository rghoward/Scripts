package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class we1 {
    public static final ox6 a(ox6 ox6Var, h27 h27Var, va5 va5Var, boolean z, ex8 ex8Var, mh4 mh4Var) {
        ox6 ox6VarA;
        if (va5Var instanceof bb5) {
            ox6VarA = new re1(h27Var, (bb5) va5Var, false, z, null, ex8Var, mh4Var);
        } else if (va5Var == null) {
            ox6VarA = new re1(h27Var, null, false, z, null, ex8Var, mh4Var);
        } else if (h27Var != null) {
            ox6VarA = xa5.a(va5Var, h27Var).H(new re1(h27Var, null, false, z, null, ex8Var, mh4Var));
        } else {
            ox6VarA = it1.a(ox6.a.t, new ve1(va5Var, z, ex8Var, mh4Var));
        }
        return ox6Var.H(ox6VarA);
    }

    public static /* synthetic */ ox6 b(ox6 ox6Var, h27 h27Var, va5 va5Var, boolean z, ex8 ex8Var, mh4 mh4Var, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            ex8Var = null;
        }
        return a(ox6Var, h27Var, va5Var, z2, ex8Var, mh4Var);
    }

    public static ox6 c(ox6 ox6Var, boolean z, String str, mh4 mh4Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return ox6Var.H(new re1(null, null, true, z2, str, null, mh4Var));
    }

    public static final boolean d(KeyEvent keyEvent) {
        long jA = db7.a(keyEvent);
        int i = lo5.O;
        return lo5.a(jA, lo5.h) || lo5.a(jA, lo5.r) || lo5.a(jA, lo5.E) || lo5.a(jA, lo5.q);
    }
}
