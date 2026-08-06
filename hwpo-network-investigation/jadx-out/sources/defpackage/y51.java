package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y51 {
    public static void a(long j, pt7 pt7Var, hsa[] hsaVarArr) {
        int i;
        int iZ;
        while (true) {
            if (pt7Var.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (pt7Var.a() == 0) {
                    i = -1;
                    break;
                }
                int iZ2 = pt7Var.z();
                i2 += iZ2;
                if (iZ2 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (pt7Var.a() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iZ = pt7Var.z();
                    i3 += iZ;
                }
            } while (iZ == 255);
            int i4 = pt7Var.b + i3;
            if (i3 == -1 || i3 > pt7Var.a()) {
                md6.g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = pt7Var.c;
            } else if (i == 4 && i3 >= 8) {
                int iZ3 = pt7Var.z();
                int iG = pt7Var.G();
                int iM = iG == 49 ? pt7Var.m() : 0;
                int iZ4 = pt7Var.z();
                if (iG == 47) {
                    pt7Var.N(1);
                }
                boolean z = iZ3 == 181 && (iG == 49 || iG == 47) && iZ4 == 3;
                if (iG == 49) {
                    z &= iM == 1195456820;
                }
                if (z) {
                    b(j, pt7Var, hsaVarArr);
                }
            }
            pt7Var.M(i4);
        }
    }

    public static void b(long j, pt7 pt7Var, hsa[] hsaVarArr) {
        int iZ = pt7Var.z();
        if ((iZ & 64) != 0) {
            pt7Var.N(1);
            int i = (iZ & 31) * 3;
            int i2 = pt7Var.b;
            for (hsa hsaVar : hsaVarArr) {
                pt7Var.M(i2);
                hsaVar.e(i, pt7Var);
                xl7.r(j != -9223372036854775807L);
                hsaVar.a(j, 1, i, 0, null);
            }
        }
    }
}
