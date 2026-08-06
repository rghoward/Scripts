package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ bm0(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, ok9] */
    @Override // defpackage.mh4
    public final Object invoke() {
        int i;
        long jA;
        i45[] i45VarArr;
        switch (this.t) {
            case 0:
                kha khaVar = (kha) this.u;
                h37 h37Var = (h37) this.v;
                if (!lja.b(khaVar.b, ((kha) h37Var.getValue()).b) || !xj5.a(khaVar.c, ((kha) h37Var.getValue()).c)) {
                    h37Var.setValue(khaVar);
                }
                return g2b.a;
            case 1:
                c45.c cVar = (c45.c) this.u;
                ok9 ok9Var = (ok9) this.v;
                final gl8 gl8Var = new gl8();
                final c45 c45Var = c45.this;
                synchronized (c45Var.P) {
                    synchronized (c45Var) {
                        try {
                            ok9 ok9Var2 = c45Var.K;
                            ?? ok9Var3 = new ok9();
                            ok9Var2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & ok9Var2.a) != 0) {
                                    ok9Var3.b(i2, ok9Var2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & ok9Var.a) != 0) {
                                    ok9Var3.b(i3, ok9Var.b[i3]);
                                }
                            }
                            gl8Var.t = ok9Var3;
                            jA = ((long) ok9Var3.a()) - ((long) ok9Var2.a());
                            i45VarArr = (jA == 0 || c45Var.u.isEmpty()) ? null : (i45[]) c45Var.u.values().toArray(new i45[0]);
                            ok9 ok9Var4 = (ok9) gl8Var.t;
                            ok9Var4.getClass();
                            c45Var.K = ok9Var4;
                            y9a.c(c45Var.C, c45Var.v + " onSettings", 0L, new mh4() { // from class: f45
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    c45 c45Var2 = c45Var;
                                    c45Var2.t.b(c45Var2, (ok9) gl8Var.t);
                                    return g2b.a;
                                }
                            }, 6);
                            g2b g2bVar = g2b.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c45Var.P.h((ok9) gl8Var.t);
                    } catch (IOException e) {
                        ul3 ul3Var = ul3.PROTOCOL_ERROR;
                        c45Var.h(ul3Var, ul3Var, e);
                    }
                    g2b g2bVar2 = g2b.a;
                    break;
                }
                if (i45VarArr != null) {
                    for (i45 i45Var : i45VarArr) {
                        synchronized (i45Var) {
                            i45Var.e += jA;
                            if (jA > 0) {
                                i45Var.notifyAll();
                            }
                            g2b g2bVar3 = g2b.a;
                        }
                    }
                }
                return g2b.a;
            default:
                wa7 wa7Var = (wa7) this.u;
                bk8 bk8Var = (bk8) this.v;
                if (wa7Var.a.get() == 0) {
                    bk8Var.invoke();
                }
                return g2b.a;
        }
    }
}
