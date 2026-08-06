package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class hy8 {
    public final nj1 a = new nj1();

    public hy8() {
        new LinkedHashMap();
    }

    public final void a(final lj1... lj1VarArr) {
        final nj1 nj1Var = this.a;
        nj1Var.getClass();
        nj1Var.c.post(new Runnable() { // from class: mj1
            @Override // java.lang.Runnable
            public final void run() {
                g2b g2bVar;
                nj1 nj1Var2 = nj1Var;
                nj1Var2.getClass();
                y10 y10Var = nj1Var2.a;
                lj1[] lj1VarArr2 = lj1VarArr;
                if (y10Var == null) {
                    g2bVar = null;
                } else {
                    y10Var.b(lj1VarArr2);
                    g2bVar = g2b.a;
                }
                if (g2bVar == null) {
                    nj1Var2.b.add(lj1VarArr2);
                }
            }
        });
    }

    public final void b() {
        a(new eh0());
    }

    public final void c(sf4 sf4Var) {
        a(new kd4(sf4Var));
    }

    public final void d(sf4 sf4Var) {
        sf4Var.getClass();
        a(new xh0(null), new tn8(sf4Var));
    }
}
