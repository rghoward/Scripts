package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q56 {
    public static void a(r4a r4aVar, int i, ry1<mc2> ry1Var) {
        long jE = r4aVar.e(i);
        List<ec2> listF = r4aVar.f(jE);
        if (listF.isEmpty()) {
            return;
        }
        if (i == r4aVar.g() - 1) {
            d43.c();
            return;
        }
        long jE2 = r4aVar.e(i + 1) - r4aVar.e(i);
        if (jE2 > 0) {
            ry1Var.accept(new mc2(jE, jE2, listF));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void b(r4a r4aVar, z4a.b bVar, ry1<mc2> ry1Var) {
        int iA;
        boolean z;
        long j = bVar.a;
        if (j == -9223372036854775807L) {
            iA = 0;
        } else {
            iA = r4aVar.a(j);
            if (iA == -1) {
                iA = r4aVar.g();
            }
            if (iA > 0 && r4aVar.e(iA - 1) == j) {
                iA--;
            }
        }
        if (j == -9223372036854775807L || iA >= r4aVar.g()) {
            z = false;
        } else {
            List<ec2> listF = r4aVar.f(j);
            long jE = r4aVar.e(iA);
            if (listF.isEmpty()) {
                z = false;
            } else {
                long j2 = bVar.a;
                if (j2 < jE) {
                    ry1Var.accept(new mc2(j2, jE - j2, listF));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iA; i < r4aVar.g(); i++) {
            a(r4aVar, i, ry1Var);
        }
        if (bVar.b) {
            if (z) {
                iA--;
            }
            for (int i2 = 0; i2 < iA; i2++) {
                a(r4aVar, i2, ry1Var);
            }
            if (z) {
                ry1Var.accept(new mc2(r4aVar.e(iA), j - r4aVar.e(iA), r4aVar.f(j)));
            }
        }
    }
}
