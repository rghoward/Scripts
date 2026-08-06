package defpackage;

import android.content.res.Resources;
import com.hwpo_training_app.R;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qm {
    public static final boolean a(ub9 ub9Var) {
        return !ub9Var.k().t.b(ac9.j);
    }

    public static final boolean b(ub9 ub9Var, Resources resources) {
        Object objD = ub9Var.d.t.d(ac9.a);
        if (objD == null) {
            objD = null;
        }
        List list = (List) objD;
        return !zb9.g(ub9Var) && (ub9Var.d.v || (ub9Var.q() && ((list != null ? (String) th1.A(list) : null) != null || e(ub9Var) != null || d(ub9Var, resources) != null || c(ub9Var))));
    }

    public static final boolean c(ub9 ub9Var) {
        Object objD = ub9Var.d.t.d(ac9.K);
        if (objD == null) {
            objD = null;
        }
        fqa fqaVar = (fqa) objD;
        c37<gc9<?>, Object> c37Var = ub9Var.d.t;
        Object objD2 = c37Var.d(ac9.z);
        if (objD2 == null) {
            objD2 = null;
        }
        ex8 ex8Var = (ex8) objD2;
        boolean z = fqaVar != null;
        Object objD3 = c37Var.d(ac9.J);
        if (((Boolean) (objD3 != null ? objD3 : null)) == null || (ex8Var != null && ex8Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String d(ub9 ub9Var, Resources resources) {
        int iG;
        Float fValueOf = Float.valueOf(0.0f);
        lb9 lb9Var = ub9Var.d;
        lb9 lb9Var2 = ub9Var.d;
        Object objD = lb9Var.t.d(ac9.b);
        String string = null;
        if (objD == null) {
            objD = null;
        }
        c37<gc9<?>, Object> c37Var = lb9Var2.t;
        Object objD2 = c37Var.d(ac9.K);
        if (objD2 == null) {
            objD2 = null;
        }
        fqa fqaVar = (fqa) objD2;
        Object objD3 = c37Var.d(ac9.z);
        if (objD3 == null) {
            objD3 = null;
        }
        ex8 ex8Var = (ex8) objD3;
        if (fqaVar != null) {
            int iOrdinal = fqaVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        u.b();
                        return null;
                    }
                    if (objD == null) {
                        objD = resources.getString(R.string.indeterminate);
                    }
                } else if (ex8Var != null && ex8Var.a == 2 && objD == null) {
                    objD = resources.getString(R.string.state_off);
                }
            } else if (ex8Var != null && ex8Var.a == 2 && objD == null) {
                objD = resources.getString(R.string.state_on);
            }
        }
        Object objD4 = c37Var.d(ac9.J);
        if (objD4 == null) {
            objD4 = null;
        }
        Boolean bool = (Boolean) objD4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((ex8Var == null || ex8Var.a != 4) && objD == null) {
                objD = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objD5 = c37Var.d(ac9.c);
        if (objD5 == null) {
            objD5 = null;
        }
        ud8 ud8Var = (ud8) objD5;
        if (ud8Var != null) {
            if (ud8Var != ud8.c) {
                if (objD == null) {
                    gg1 gg1Var = ud8Var.b;
                    float fFloatValue = Float.valueOf(gg1Var.a).floatValue() - fValueOf.floatValue() == 0.0f ? 0.0f : (ud8Var.a - fValueOf.floatValue()) / (Float.valueOf(gg1Var.a).floatValue() - fValueOf.floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iG = 0;
                    } else {
                        iG = fFloatValue == 1.0f ? 100 : uh8.g(Math.round(fFloatValue * 100.0f), 1, 99);
                    }
                    objD = resources.getString(R.string.template_percent, Integer.valueOf(iG));
                }
            } else if (objD == null) {
                objD = resources.getString(R.string.in_progress);
            }
        }
        gc9<iw> gc9Var = ac9.G;
        if (c37Var.b(gc9Var)) {
            c37<gc9<?>, Object> c37Var2 = new ub9(ub9Var.a, true, ub9Var.c, lb9Var2).k().t;
            Object objD6 = c37Var2.d(ac9.a);
            if (objD6 == null) {
                objD6 = null;
            }
            Collection collection = (Collection) objD6;
            if (collection == null || collection.isEmpty()) {
                Object objD7 = c37Var2.d(ac9.C);
                if (objD7 == null) {
                    objD7 = null;
                }
                Collection collection2 = (Collection) objD7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objD8 = c37Var2.d(gc9Var);
                    if (objD8 == null) {
                        objD8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objD8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objD = string;
        }
        return (String) objD;
    }

    public static final iw e(ub9 ub9Var) {
        Object objD = ub9Var.d.t.d(ac9.G);
        if (objD == null) {
            objD = null;
        }
        iw iwVar = (iw) objD;
        Object objD2 = ub9Var.d.t.d(ac9.C);
        if (objD2 == null) {
            objD2 = null;
        }
        List list = (List) objD2;
        return iwVar == null ? list != null ? (iw) th1.A(list) : null : iwVar;
    }
}
