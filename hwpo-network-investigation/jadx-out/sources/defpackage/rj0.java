package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rj0 extends dw4 {
    public int t0 = 0;
    public boolean u0 = true;
    public int v0 = 0;
    public boolean w0 = false;

    public final boolean O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.s0;
            if (i4 >= i) {
                break;
            }
            vx1 vx1Var = this.r0[i4];
            if ((this.u0 || vx1Var.c()) && ((((i2 = this.t0) == 0 || i2 == 1) && !vx1Var.y()) || (((i3 = this.t0) == 2 || i3 == 3) && !vx1Var.z()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.s0; i5++) {
            vx1 vx1Var2 = this.r0[i5];
            if (this.u0 || vx1Var2.c()) {
                sx1.a aVar = sx1.a.w;
                sx1.a aVar2 = sx1.a.u;
                sx1.a aVar3 = sx1.a.v;
                sx1.a aVar4 = sx1.a.t;
                if (!z2) {
                    int i6 = this.t0;
                    if (i6 == 0) {
                        iMax = vx1Var2.g(aVar4).c();
                    } else if (i6 == 1) {
                        iMax = vx1Var2.g(aVar3).c();
                    } else if (i6 == 2) {
                        iMax = vx1Var2.g(aVar2).c();
                    } else if (i6 == 3) {
                        iMax = vx1Var2.g(aVar).c();
                    }
                    z2 = true;
                }
                int i7 = this.t0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, vx1Var2.g(aVar4).c());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, vx1Var2.g(aVar3).c());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, vx1Var2.g(aVar2).c());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, vx1Var2.g(aVar).c());
                }
            }
        }
        int i8 = iMax + this.v0;
        int i9 = this.t0;
        if (i9 == 0 || i9 == 1) {
            F(i8, i8);
        } else {
            G(i8, i8);
        }
        this.w0 = true;
        return true;
    }

    public final int P() {
        int i = this.t0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.vx1
    public final void b(j86 j86Var, boolean z) {
        boolean z2;
        int i;
        sx1[] sx1VarArr = this.R;
        sx1 sx1Var = this.J;
        sx1VarArr[0] = sx1Var;
        int i2 = 2;
        sx1 sx1Var2 = this.K;
        sx1VarArr[2] = sx1Var2;
        sx1 sx1Var3 = this.L;
        sx1VarArr[1] = sx1Var3;
        sx1 sx1Var4 = this.M;
        sx1VarArr[3] = sx1Var4;
        for (sx1 sx1Var5 : sx1VarArr) {
            sx1Var5.i = j86Var.k(sx1Var5);
        }
        int i3 = this.t0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        sx1 sx1Var6 = sx1VarArr[i3];
        if (!this.w0) {
            O();
        }
        if (this.w0) {
            this.w0 = false;
            int i4 = this.t0;
            if (i4 == 0 || i4 == 1) {
                j86Var.d(sx1Var.i, this.a0);
                j86Var.d(sx1Var3.i, this.a0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    j86Var.d(sx1Var2.i, this.b0);
                    j86Var.d(sx1Var4.i, this.b0);
                    return;
                }
                return;
            }
        }
        int i5 = 0;
        while (true) {
            if (i5 >= this.s0) {
                z2 = false;
                break;
            }
            vx1 vx1Var = this.r0[i5];
            if (this.u0 || vx1Var.c()) {
                int i6 = this.t0;
                vx1.a aVar = vx1.a.v;
                if (((i6 == 0 || i6 == 1) && vx1Var.U[0] == aVar && vx1Var.J.f != null && vx1Var.L.f != null) || ((i6 == 2 || i6 == 3) && vx1Var.U[1] == aVar && vx1Var.K.f != null && vx1Var.M.f != null)) {
                    z2 = true;
                    break;
                }
            }
            i5++;
        }
        boolean z3 = sx1Var.e() || sx1Var3.e();
        boolean z4 = sx1Var2.e() || sx1Var4.e();
        int i7 = !(!z2 && (((i = this.t0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.s0) {
            vx1 vx1Var2 = this.r0[i8];
            if (this.u0 || vx1Var2.c()) {
                bw9 bw9VarK = j86Var.k(vx1Var2.R[this.t0]);
                sx1[] sx1VarArr2 = vx1Var2.R;
                int i9 = this.t0;
                sx1 sx1Var7 = sx1VarArr2[i9];
                sx1Var7.i = bw9VarK;
                sx1 sx1Var8 = sx1Var7.f;
                int i10 = (sx1Var8 == null || sx1Var8.d != this) ? 0 : sx1Var7.g;
                if (i9 == 0 || i9 == i2) {
                    bw9 bw9Var = sx1Var6.i;
                    int i11 = this.v0 - i10;
                    q30 q30VarL = j86Var.l();
                    bw9 bw9VarM = j86Var.m();
                    bw9VarM.w = 0;
                    q30VarL.d(bw9Var, bw9VarK, bw9VarM, i11);
                    j86Var.c(q30VarL);
                } else {
                    bw9 bw9Var2 = sx1Var6.i;
                    int i12 = this.v0 + i10;
                    q30 q30VarL2 = j86Var.l();
                    bw9 bw9VarM2 = j86Var.m();
                    bw9VarM2.w = 0;
                    q30VarL2.c(bw9Var2, bw9VarK, bw9VarM2, i12);
                    j86Var.c(q30VarL2);
                }
                j86Var.e(sx1Var6.i, bw9VarK, this.v0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.t0;
        if (i13 == 0) {
            j86Var.e(sx1Var3.i, sx1Var.i, 0, 8);
            j86Var.e(sx1Var.i, this.V.L.i, 0, 4);
            j86Var.e(sx1Var.i, this.V.J.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            j86Var.e(sx1Var.i, sx1Var3.i, 0, 8);
            j86Var.e(sx1Var.i, this.V.J.i, 0, 4);
            j86Var.e(sx1Var.i, this.V.L.i, 0, 0);
        } else if (i13 == 2) {
            j86Var.e(sx1Var4.i, sx1Var2.i, 0, 8);
            j86Var.e(sx1Var2.i, this.V.M.i, 0, 4);
            j86Var.e(sx1Var2.i, this.V.K.i, 0, 0);
        } else if (i13 == 3) {
            j86Var.e(sx1Var2.i, sx1Var4.i, 0, 8);
            j86Var.e(sx1Var2.i, this.V.K.i, 0, 4);
            j86Var.e(sx1Var2.i, this.V.M.i, 0, 0);
        }
    }

    @Override // defpackage.vx1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.vx1
    public final String toString() {
        String strA = av.a(new StringBuilder("[Barrier] "), this.j0, " {");
        for (int i = 0; i < this.s0; i++) {
            vx1 vx1Var = this.r0[i];
            if (i > 0) {
                strA = strA.concat(", ");
            }
            StringBuilder sbA = bl2.a(strA);
            sbA.append(vx1Var.j0);
            strA = sbA.toString();
        }
        return strA.concat("}");
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
