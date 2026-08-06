package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.util.AgentHeaderCreator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class bv6 {
    public static iy a(pt7 pt7Var) {
        String str;
        int iM = pt7Var.m();
        if (pt7Var.m() != 1684108385) {
            md6.g("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = pt7Var.m();
        byte[] bArr = iv0.a;
        int i = iM2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            d80.a(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        pt7Var.N(4);
        int i2 = iM - 16;
        byte[] bArr2 = new byte[i2];
        pt7Var.k(bArr2, 0, i2);
        return new iy(str, null, 3, bArr2);
    }

    public static rha b(int i, pt7 pt7Var, String str) {
        int iM = pt7Var.m();
        if (pt7Var.m() == 1684108385 && iM >= 22) {
            pt7Var.N(10);
            int iG = pt7Var.G();
            if (iG > 0) {
                String strA = pp2.a(iG, BuildConfig.FLAVOR);
                int iG2 = pt7Var.G();
                if (iG2 > 0) {
                    strA = strA + AgentHeaderCreator.AGENT_DIVIDER + iG2;
                }
                return new rha(str, null, k95.v(strA));
            }
        }
        md6.g("MetadataUtil", "Failed to parse index/count attribute: ".concat(sz6.a(i)));
        return null;
    }

    public static int c(pt7 pt7Var) {
        int iM = pt7Var.m();
        if (pt7Var.m() == 1684108385) {
            pt7Var.N(8);
            int i = iM - 16;
            if (i == 1) {
                return pt7Var.z();
            }
            if (i == 2) {
                return pt7Var.G();
            }
            if (i == 3) {
                return pt7Var.C();
            }
            if (i == 4 && (pt7Var.j() & 128) == 0) {
                return pt7Var.D();
            }
        }
        md6.g("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static v65 d(int i, String str, pt7 pt7Var, boolean z, boolean z2) {
        int iC = c(pt7Var);
        if (z2) {
            iC = Math.min(1, iC);
        }
        if (iC >= 0) {
            return z ? new rha(str, null, k95.v(Integer.toString(iC))) : new fk1("und", str, Integer.toString(iC));
        }
        md6.g("MetadataUtil", "Failed to parse uint8 attribute: ".concat(sz6.a(i)));
        return null;
    }

    public static rha e(int i, pt7 pt7Var, String str) {
        int iM = pt7Var.m();
        if (pt7Var.m() == 1684108385) {
            pt7Var.N(8);
            return new rha(str, null, k95.v(pt7Var.v(iM - 16)));
        }
        md6.g("MetadataUtil", "Failed to parse text attribute: ".concat(sz6.a(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(int i, su6 su6Var, id4.a aVar, su6 su6Var2, su6... su6VarArr) {
        if (su6Var2 == null) {
            su6Var2 = new su6(new su6.a[0]);
        }
        if (su6Var != null) {
            k95.b bVar = k95.u;
            k95.a aVar2 = new k95.a();
            for (su6.a aVar3 : su6Var.a) {
                if (bl6.class.isAssignableFrom(aVar3.getClass())) {
                    aVar2.c((su6.a) bl6.class.cast(aVar3));
                }
            }
            k95.b bVarListIterator = aVar2.g().listIterator(0);
            while (bVarListIterator.hasNext()) {
                bl6 bl6Var = (bl6) bVarListIterator.next();
                if (!bl6Var.a.equals("com.android.capture.fps") || i == 2) {
                    su6Var2 = su6Var2.a(bl6Var);
                }
            }
        }
        for (su6 su6Var3 : su6VarArr) {
            su6Var2 = su6Var2.b(su6Var3);
        }
        if (su6Var2.a.length > 0) {
            aVar.k = su6Var2;
        }
    }
}
