package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vh7 {
    public final k37<qr5> a = new k37<>(new qr5[16]);
    public qr5[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void b(qr5 qr5Var) {
        if (qr5Var.i0 > 0) {
            if (qr5Var.Z.d == qr5.d.x && !qr5Var.D() && !qr5Var.E() && !qr5Var.j0 && qr5Var.j()) {
                ox6.c cVar = qr5Var.Y.f;
                if ((cVar.w & 256) != 0) {
                    while (cVar != null) {
                        if ((cVar.v & 256) != 0) {
                            ?? B = cVar;
                            ?? k37Var = 0;
                            while (B != 0) {
                                if (B instanceof bn4) {
                                    bn4 bn4Var = (bn4) B;
                                    bn4Var.Q0(ew2.d(bn4Var, 256));
                                } else if ((B.v & 256) != 0 && (B instanceof gw2)) {
                                    ox6.c cVar2 = ((gw2) B).I;
                                    int i = 0;
                                    B = B;
                                    k37Var = k37Var;
                                    while (cVar2 != null) {
                                        if ((cVar2.v & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                k37Var = k37Var;
                                                B = cVar2;
                                            } else {
                                                if (k37Var == 0) {
                                                    k37Var = new k37(new ox6.c[16]);
                                                }
                                                if (B != 0) {
                                                    k37Var.d(B);
                                                    B = 0;
                                                }
                                                k37Var.d(cVar2);
                                            }
                                        }
                                        cVar2 = cVar2.y;
                                        B = B;
                                        k37Var = k37Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                B = ew2.b(k37Var);
                            }
                        }
                        if ((cVar.w & 256) == 0) {
                            break;
                        } else {
                            cVar = cVar.y;
                        }
                    }
                }
            }
            qr5Var.h0 = false;
            k37<qr5> k37VarL = qr5Var.L();
            qr5[] qr5VarArr = k37VarL.t;
            int i2 = k37VarL.v;
            for (int i3 = 0; i3 < i2; i3++) {
                b(qr5VarArr[i3]);
            }
        }
    }

    public final void a() {
        k37<qr5> k37Var = this.a;
        Arrays.sort(k37Var.t, 0, k37Var.v, uh7.t);
        int i = k37Var.v;
        qr5[] qr5VarArr = this.b;
        if (qr5VarArr == null || qr5VarArr.length < i) {
            qr5VarArr = new qr5[Math.max(16, i)];
        }
        this.b = null;
        for (int i2 = 0; i2 < i; i2++) {
            qr5VarArr[i2] = k37Var.t[i2];
        }
        k37Var.k();
        while (true) {
            i--;
            if (-1 >= i) {
                this.b = qr5VarArr;
                return;
            }
            qr5 qr5Var = qr5VarArr[i];
            qr5Var.getClass();
            if (qr5Var.h0) {
                b(qr5Var);
            }
            qr5VarArr[i] = null;
        }
    }
}
