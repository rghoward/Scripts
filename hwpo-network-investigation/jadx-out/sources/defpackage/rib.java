package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rib implements bq8 {
    public final ti8 t;
    public final k85 u;
    public final pib<?> v;
    public final s66 w;
    public final el5 x;

    public rib(ti8 ti8Var, k85 k85Var, pib pibVar, s66 s66Var, el5 el5Var) {
        this.t = ti8Var;
        this.u = k85Var;
        this.v = pibVar;
        this.w = s66Var;
        this.x = el5Var;
    }

    @Override // defpackage.bq8
    public final void h() {
        pib<?> pibVar = this.v;
        if (pibVar.a().isAttachedToWindow()) {
            return;
        }
        tib tibVarC = v.c(pibVar.a());
        rib ribVar = tibVarC.w;
        if (ribVar != null) {
            s66 s66Var = ribVar.w;
            ribVar.x.k(null);
            pib<?> pibVar2 = ribVar.v;
            if (pibVar2 instanceof l76) {
                s66Var.c((l76) pibVar2);
            }
            s66Var.c(ribVar);
        }
        tibVarC.w = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // defpackage.as2
    public final void onDestroy(m76 m76Var) {
        tib tibVarC = v.c(this.v.a());
        synchronized (tibVarC) {
            try {
                dz9 dz9Var = tibVarC.v;
                if (dz9Var != null) {
                    dz9Var.k(null);
                }
                dn4 dn4Var = dn4.t;
                et2 et2Var = i23.a;
                tibVarC.v = oy0.d(dn4Var, ag6.a.x0(), null, new sib(tibVarC, null), 2);
                tibVarC.u = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bq8
    public final void start() {
        s66 s66Var = this.w;
        s66Var.a(this);
        pib<?> pibVar = this.v;
        if (pibVar instanceof l76) {
            l76 l76Var = (l76) pibVar;
            s66Var.c(l76Var);
            s66Var.a(l76Var);
        }
        tib tibVarC = v.c(pibVar.a());
        rib ribVar = tibVarC.w;
        if (ribVar != null) {
            s66 s66Var2 = ribVar.w;
            ribVar.x.k(null);
            pib<?> pibVar2 = ribVar.v;
            if (pibVar2 instanceof l76) {
                s66Var2.c((l76) pibVar2);
            }
            s66Var2.c(ribVar);
        }
        tibVarC.w = this;
    }
}
