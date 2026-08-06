package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vp4 extends vx1 {
    public float r0 = -1.0f;
    public int s0 = -1;
    public int t0 = -1;
    public sx1 u0 = this.K;
    public int v0 = 0;
    public boolean w0;

    public vp4() {
        this.S.clear();
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.u0;
        }
    }

    @Override // defpackage.vx1
    public final void M(j86 j86Var, boolean z) {
        if (this.V == null) {
            return;
        }
        sx1 sx1Var = this.u0;
        j86Var.getClass();
        int iN = j86.n(sx1Var);
        if (this.v0 == 1) {
            this.a0 = iN;
            this.b0 = 0;
            H(this.V.i());
            K(0);
            return;
        }
        this.a0 = 0;
        this.b0 = iN;
        K(this.V.o());
        H(0);
    }

    public final void N(int i) {
        this.u0.i(i);
        this.w0 = true;
    }

    public final void O(int i) {
        if (this.v0 == i) {
            return;
        }
        this.v0 = i;
        ArrayList<sx1> arrayList = this.S;
        arrayList.clear();
        if (this.v0 == 1) {
            this.u0 = this.J;
        } else {
            this.u0 = this.K;
        }
        arrayList.add(this.u0);
        sx1[] sx1VarArr = this.R;
        int length = sx1VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sx1VarArr[i2] = this.u0;
        }
    }

    @Override // defpackage.vx1
    public final void b(j86 j86Var, boolean z) {
        wx1 wx1Var = (wx1) this.V;
        if (wx1Var == null) {
            return;
        }
        Object objG = wx1Var.g(sx1.a.t);
        Object objG2 = wx1Var.g(sx1.a.v);
        vx1 vx1Var = this.V;
        vx1.a aVar = vx1.a.u;
        boolean z2 = vx1Var != null && vx1Var.U[0] == aVar;
        if (this.v0 == 0) {
            objG = wx1Var.g(sx1.a.u);
            objG2 = wx1Var.g(sx1.a.w);
            vx1 vx1Var2 = this.V;
            z2 = vx1Var2 != null && vx1Var2.U[1] == aVar;
        }
        if (this.w0) {
            sx1 sx1Var = this.u0;
            if (sx1Var.c) {
                bw9 bw9VarK = j86Var.k(sx1Var);
                j86Var.d(bw9VarK, this.u0.c());
                if (this.s0 != -1) {
                    if (z2) {
                        j86Var.f(j86Var.k(objG2), bw9VarK, 0, 5);
                    }
                } else if (this.t0 != -1 && z2) {
                    bw9 bw9VarK2 = j86Var.k(objG2);
                    j86Var.f(bw9VarK, j86Var.k(objG), 0, 5);
                    j86Var.f(bw9VarK2, bw9VarK, 0, 5);
                }
                this.w0 = false;
                return;
            }
        }
        if (this.s0 != -1) {
            bw9 bw9VarK3 = j86Var.k(this.u0);
            j86Var.e(bw9VarK3, j86Var.k(objG), this.s0, 8);
            if (z2) {
                j86Var.f(j86Var.k(objG2), bw9VarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.t0 != -1) {
            bw9 bw9VarK4 = j86Var.k(this.u0);
            bw9 bw9VarK5 = j86Var.k(objG2);
            j86Var.e(bw9VarK4, bw9VarK5, -this.t0, 8);
            if (z2) {
                j86Var.f(bw9VarK4, j86Var.k(objG), 0, 5);
                j86Var.f(bw9VarK5, bw9VarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1.0f) {
            bw9 bw9VarK6 = j86Var.k(this.u0);
            bw9 bw9VarK7 = j86Var.k(objG2);
            float f = this.r0;
            q30 q30VarL = j86Var.l();
            q30VarL.d.k(bw9VarK6, -1.0f);
            q30VarL.d.k(bw9VarK7, f);
            j86Var.c(q30VarL);
        }
    }

    @Override // defpackage.vx1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.vx1
    public final sx1 g(sx1.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return null;
                    }
                }
            }
            if (this.v0 == 0) {
                return this.u0;
            }
            return null;
        }
        if (this.v0 == 1) {
            return this.u0;
        }
        return null;
    }

    @Override // defpackage.vx1
    public final boolean y() {
        return this.w0;
    }

    @Override // defpackage.vx1
    public final boolean z() {
        return this.w0;
    }
}
