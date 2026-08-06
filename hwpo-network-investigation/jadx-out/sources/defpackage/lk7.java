package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lk7 {
    public static final boolean[] a = new boolean[3];

    public static void a(wx1 wx1Var, j86 j86Var, vx1 vx1Var) {
        vx1Var.o = -1;
        sx1 sx1Var = vx1Var.N;
        vx1.a[] aVarArr = vx1Var.U;
        sx1 sx1Var2 = vx1Var.M;
        sx1 sx1Var3 = vx1Var.K;
        sx1 sx1Var4 = vx1Var.L;
        sx1 sx1Var5 = vx1Var.J;
        vx1Var.p = -1;
        vx1.a[] aVarArr2 = wx1Var.U;
        vx1.a aVar = aVarArr2[0];
        vx1.a aVar2 = vx1.a.w;
        vx1.a aVar3 = vx1.a.u;
        if (aVar != aVar3 && aVarArr[0] == aVar2) {
            int i = sx1Var5.g;
            int iO = wx1Var.o() - sx1Var4.g;
            sx1Var5.i = j86Var.k(sx1Var5);
            sx1Var4.i = j86Var.k(sx1Var4);
            j86Var.d(sx1Var5.i, i);
            j86Var.d(sx1Var4.i, iO);
            vx1Var.o = 2;
            vx1Var.a0 = i;
            int i2 = iO - i;
            vx1Var.W = i2;
            int i3 = vx1Var.d0;
            if (i2 < i3) {
                vx1Var.W = i3;
            }
        }
        if (aVarArr2[1] == aVar3 || aVarArr[1] != aVar2) {
            return;
        }
        int i4 = sx1Var3.g;
        int i5 = wx1Var.i() - sx1Var2.g;
        sx1Var3.i = j86Var.k(sx1Var3);
        sx1Var2.i = j86Var.k(sx1Var2);
        j86Var.d(sx1Var3.i, i4);
        j86Var.d(sx1Var2.i, i5);
        if (vx1Var.c0 > 0 || vx1Var.i0 == 8) {
            bw9 bw9VarK = j86Var.k(sx1Var);
            sx1Var.i = bw9VarK;
            j86Var.d(bw9VarK, vx1Var.c0 + i4);
        }
        vx1Var.p = 2;
        vx1Var.b0 = i4;
        int i6 = i5 - i4;
        vx1Var.X = i6;
        int i7 = vx1Var.e0;
        if (i6 < i7) {
            vx1Var.X = i7;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
