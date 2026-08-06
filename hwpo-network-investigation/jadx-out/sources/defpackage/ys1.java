package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ys1 {
    public final ArrayList a = new ArrayList();

    public final boolean a(int i, gj4 gj4Var, Object obj) {
        ArrayList<Object> arrayListA = gj4Var.a();
        if (arrayListA == null) {
            b(i, gj4Var, null);
            return true;
        }
        int size = arrayListA.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayListA.get(i2);
            if (!(obj2 instanceof vi4)) {
                if (!(obj2 instanceof gj4)) {
                    tn2.d(obj2, "Unexpected child source info ");
                    break;
                }
                if (a(i, (gj4) obj2, obj)) {
                    b(gj4Var.b(), gj4Var, obj2);
                    return true;
                }
            } else if (obj2.equals(obj)) {
                b(gj4Var.b(), gj4Var, obj2);
                return true;
            }
        }
        return false;
    }

    public final void b(int i, gj4 gj4Var, Object obj) {
        pw9 pw9VarB;
        at1 at1Var;
        String strC;
        String strC2;
        String strC3;
        if (gj4Var == null || (strC3 = gj4Var.c()) == null || strC3.length() == 0) {
            pw9VarB = null;
        } else {
            try {
                pw9VarB = s7.b(strC3);
            } catch (rt7 e) {
                Log.e("ComposeInternal", e.t, e);
                pw9VarB = null;
            }
        }
        if (pw9VarB == null) {
            at1Var = new at1(i, null, null);
        } else if (obj == null) {
            at1Var = new at1(i, pw9VarB, null);
        } else {
            ArrayList<Object> arrayListA = gj4Var.a();
            int i2 = 0;
            if (arrayListA != null) {
                int size = arrayListA.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj2 = arrayListA.get(i4);
                    if (xj5.a(obj2, obj)) {
                        break;
                    }
                    gj4 gj4VarF = f(obj2);
                    if (gj4VarF != null && ((gj4VarF.b() == -127 || (gj4VarF.b() == 0 && (obj2 instanceof vi4) && c((vi4) obj2) == -127)) && gj4VarF.c() == null)) {
                        ArrayList<Object> arrayListA2 = gj4VarF.a();
                        if (arrayListA2 != null) {
                            int size2 = arrayListA2.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                gj4 gj4VarF2 = f(arrayListA2.get(i5));
                                if (gj4VarF2 != null && (strC2 = gj4VarF2.c()) != null && w2a.n(strC2, "C", false)) {
                                    i3++;
                                }
                            }
                        }
                    } else if (gj4VarF != null && (strC = gj4VarF.c()) != null && w2a.n(strC, "C", false)) {
                        i3++;
                    }
                }
                i2 = i3;
            }
            at1Var = new at1(i, pw9VarB, Integer.valueOf(i2));
        }
        this.a.add(at1Var);
    }

    public abstract int c(vi4 vi4Var);

    public final void d(int i, Object obj, gj4 gj4Var, Object obj2) {
        if (gj4Var != null || xj5.a(obj, jt1.a.a)) {
            if (obj2 == null || gj4Var == null) {
                b(i, gj4Var, null);
            } else {
                if (a(i, gj4Var, obj2)) {
                    return;
                }
                b(i, gj4Var, obj2);
            }
        }
    }

    public abstract gj4 e(vi4 vi4Var);

    public final gj4 f(Object obj) {
        if (obj instanceof vi4) {
            return e((vi4) obj);
        }
        if (obj instanceof gj4) {
            return (gj4) obj;
        }
        tn2.d(obj, "Unexpected child source info ");
        return null;
    }
}
