package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rr5 extends wp5 implements mh4<g2b> {
    public final /* synthetic */ qr5 u;
    public final /* synthetic */ gl8<lb9> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr5(qr5 qr5Var, gl8<lb9> gl8Var) {
        super(0);
        this.u = qr5Var;
        this.v = gl8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ox6$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [k37] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [k37] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, lb9] */
    @Override // defpackage.mh4
    public final g2b invoke() {
        kb7 kb7Var = this.u.Y;
        if ((kb7Var.f.w & 8) != 0) {
            for (ox6.c cVar = kb7Var.e; cVar != null; cVar = cVar.x) {
                if ((cVar.v & 8) != 0) {
                    ?? B = cVar;
                    ?? k37Var = 0;
                    while (B != 0) {
                        if (B instanceof qb9) {
                            qb9 qb9Var = (qb9) B;
                            boolean zV0 = qb9Var.v0();
                            gl8<lb9> gl8Var = this.v;
                            if (zV0) {
                                ?? lb9Var = new lb9();
                                gl8Var.t = lb9Var;
                                lb9Var.w = true;
                            }
                            if (qb9Var.G1()) {
                                gl8Var.t.v = true;
                            }
                            qb9Var.E1(gl8Var.t);
                        } else if ((B.v & 8) != 0 && (B instanceof gw2)) {
                            ox6.c cVar2 = ((gw2) B).I;
                            int i = 0;
                            while (cVar2 != null) {
                                if ((cVar2.v & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        B = B;
                                        k37Var = k37Var;
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
                                } else {
                                    B = B;
                                    k37Var = k37Var;
                                }
                                cVar2 = cVar2.y;
                                B = B;
                                k37Var = k37Var;
                            }
                            if (i == 1) {
                                B = B;
                                k37Var = k37Var;
                            } else {
                                B = B;
                                k37Var = k37Var;
                            }
                        }
                        B = ew2.b(k37Var);
                    }
                }
            }
        }
        return g2b.a;
    }
}
