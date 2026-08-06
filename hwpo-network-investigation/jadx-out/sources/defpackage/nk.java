package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nk extends of0 implements nb9, c94 {
    public final f27 A;
    public boolean B;
    public final l08 t;
    public final yb9 u;
    public final cm v;
    public final xk8 w;
    public final String x;
    public final Rect y = new Rect();
    public final AutofillId z;

    public nk(l08 l08Var, yb9 yb9Var, cm cmVar, xk8 xk8Var, String str) {
        this.t = l08Var;
        this.u = yb9Var;
        this.v = cmVar;
        this.w = xk8Var;
        this.x = str;
        cmVar.setImportantForAutofill(1);
        nf0 nf0VarA = fgb.a(cmVar);
        AutofillId autofillId = nf0VarA != null ? (AutofillId) nf0VarA.a : null;
        if (autofillId == null) {
            throw ik.a("Required value was null.");
        }
        this.z = autofillId;
        this.A = new f27((Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    @Override // defpackage.nb9
    public final void a(qr5 qr5Var, lb9 lb9Var) {
        String str;
        String str2;
        fqa fqaVar;
        fqa fqaVar2;
        dz3 dz3Var;
        Boolean bool;
        lb9 lb9VarR = qr5Var.r();
        int i = qr5Var.u;
        Object obj = null;
        if (lb9Var != null) {
            Object objD = lb9Var.t.d(ac9.F);
            if (objD == null) {
                objD = null;
            }
            iw iwVar = (iw) objD;
            if (iwVar != null) {
                str = iwVar.u;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (lb9VarR != null) {
            Object objD2 = lb9VarR.t.d(ac9.F);
            if (objD2 == null) {
                objD2 = null;
            }
            iw iwVar2 = (iw) objD2;
            if (iwVar2 != null) {
                str2 = iwVar2.u;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        boolean z = false;
        l08 l08Var = this.t;
        cm cmVar = this.v;
        if (str != str2) {
            if (str == null) {
                l08Var.e(cmVar, i, true);
            } else if (str2 == null) {
                l08Var.e(cmVar, i, false);
            } else if (xj5.a((bz1) ia0.b(lb9VarR, ac9.s), bz1.a.a)) {
                l08Var.b(cmVar, i, gf0.a(str2));
            }
        }
        if (lb9Var != null) {
            Object objD3 = lb9Var.t.d(ac9.K);
            if (objD3 == null) {
                objD3 = null;
            }
            fqaVar = (fqa) objD3;
        } else {
            fqaVar = null;
        }
        if (lb9VarR != null) {
            Object objD4 = lb9VarR.t.d(ac9.K);
            if (objD4 == null) {
                objD4 = null;
            }
            fqaVar2 = (fqa) objD4;
        } else {
            fqaVar2 = null;
        }
        if (fqaVar != fqaVar2) {
            if (fqaVar == null) {
                l08Var.e(cmVar, i, true);
            } else if (fqaVar2 == null) {
                l08Var.e(cmVar, i, false);
            } else if (xj5.a((bz1) ia0.b(lb9VarR, ac9.s), bz1.a.b)) {
                int iOrdinal = fqaVar2.ordinal();
                if (iOrdinal != 0) {
                    bool = iOrdinal != 1 ? null : Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
                if (bool != null) {
                    l08Var.b(cmVar, i, gf0.b(bool.booleanValue()));
                }
            }
        }
        if (lb9Var != null) {
            Object objD5 = lb9Var.t.d(ac9.t);
            if (objD5 == null) {
                objD5 = null;
            }
            dz3Var = (dz3) objD5;
        } else {
            dz3Var = null;
        }
        if (lb9VarR != null) {
            Object objD6 = lb9VarR.t.d(ac9.t);
            obj = (dz3) (objD6 != null ? objD6 : null);
        }
        if (!xj5.a(dz3Var, obj)) {
            if (dz3Var == null) {
                l08Var.e(cmVar, i, true);
            } else if (obj == null) {
                l08Var.e(cmVar, i, false);
            } else {
                l08Var.b(cmVar, i, ((fo) obj).a);
            }
        }
        boolean z2 = lb9Var != null && lb9Var.t.a(ac9.r);
        if (lb9VarR != null && lb9VarR.t.a(ac9.r)) {
            z = true;
        }
        if (z2 != z) {
            f27 f27Var = this.A;
            if (z) {
                f27Var.a(i);
            } else {
                f27Var.g(i);
            }
        }
    }

    @Override // defpackage.c94
    public final void b(aa4 aa4Var, ba4 ba4Var) {
        qr5 qr5VarF;
        lb9 lb9VarR;
        qr5 qr5VarF2;
        lb9 lb9VarR2;
        if (aa4Var != null && (qr5VarF2 = ew2.f(aa4Var)) != null && (lb9VarR2 = qr5VarF2.r()) != null) {
            c37<gc9<?>, Object> c37Var = lb9VarR2.t;
            if (c37Var.a(kb9.g) || c37Var.a(kb9.h)) {
                this.t.d(this.v, qr5VarF2.u);
            }
        }
        if (ba4Var == null || (qr5VarF = ew2.f(ba4Var)) == null || (lb9VarR = qr5VarF.r()) == null) {
            return;
        }
        c37<gc9<?>, Object> c37Var2 = lb9VarR.t;
        if (c37Var2.a(kb9.g) || c37Var2.a(kb9.h)) {
            int i = qr5VarF.u;
            this.w.b.e(i, new lk(this, i));
        }
    }

    public final void c(SparseArray<AutofillValue> sparseArray) {
        lb9 lb9VarR;
        oh4 oh4Var;
        oh4 oh4Var2;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueB = kk.b(sparseArray.get(iKeyAt));
            qr5 qr5VarB = this.u.c.b(iKeyAt);
            if (qr5VarB != null && (lb9VarR = qr5VarB.r()) != null) {
                c37<gc9<?>, Object> c37Var = lb9VarR.t;
                Object objD = c37Var.d(kb9.g);
                if (objD == null) {
                    objD = null;
                }
                k3 k3Var = (k3) objD;
                if (k3Var != null && (oh4Var2 = (oh4) k3Var.b) != null) {
                }
                Object objD2 = c37Var.d(kb9.h);
                k3 k3Var2 = (k3) (objD2 != null ? objD2 : null);
                if (k3Var2 != null && (oh4Var = (oh4) k3Var2.b) != null) {
                }
            }
        }
    }
}
