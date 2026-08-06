package defpackage;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.reflect.Type;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class eo7 implements jac {
    public static final /* synthetic */ eo7 t = new eo7();

    public static ko7 b(int i) {
        float f = (i & 1) != 0 ? 0.0f : 16.0f;
        return new ko7(f, 0.0f, f, 0.0f);
    }

    public static ko7 c(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new ko7(f, f2, f3, f4);
    }

    public static final float d(go7 go7Var, tq5 tq5Var) {
        return tq5Var == tq5.t ? go7Var.c(tq5Var) : go7Var.b(tq5Var);
    }

    public static final float e(go7 go7Var, tq5 tq5Var) {
        return tq5Var == tq5.t ? go7Var.b(tq5Var) : go7Var.c(tq5Var);
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final double g(int i, int i2, int i3, int i4, s39 s39Var) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int iOrdinal = s39Var.ordinal();
        if (iOrdinal == 0) {
            return Math.max(d, d2);
        }
        if (iOrdinal == 1) {
            return Math.min(d, d2);
        }
        u.b();
        return 0.0d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [co7] */
    public static final ox6 h(ox6 ox6Var, final go7 go7Var) {
        return ox6Var.H(new jo7(go7Var, new oh4() { // from class: co7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                pe5 pe5Var = (pe5) obj;
                pe5Var.getClass();
                pe5Var.a.b(go7Var, "paddingValues");
                return g2b.a;
            }
        }));
    }

    public static final ox6 i(ox6 ox6Var, float f) {
        return ox6Var.H(new ao7(f, f, f, f, new o57(1)));
    }

    public static final ox6 j(final float f, final float f2, ox6 ox6Var) {
        return ox6Var.H(new ao7(f, f2, f, f2, new oh4() { // from class: do7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                pe5 pe5Var = (pe5) obj;
                pe5Var.getClass();
                iab iabVar = pe5Var.a;
                iabVar.b(new y43(f), "horizontal");
                iabVar.b(new y43(f2), "vertical");
                return g2b.a;
            }
        }));
    }

    public static ox6 k(ox6 ox6Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return j(f, f2, ox6Var);
    }

    public static final ox6 l(ox6 ox6Var, final float f, final float f2, final float f3, final float f4) {
        return ox6Var.H(new ao7(f, f2, f3, f4, new oh4() { // from class: bo7
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                pe5 pe5Var = (pe5) obj;
                pe5Var.getClass();
                iab iabVar = pe5Var.a;
                iabVar.b(new y43(f), OpsMetricTracker.START);
                iabVar.b(new y43(f2), VerticalAlignment.TOP);
                iabVar.b(new y43(f3), "end");
                iabVar.b(new y43(f4), VerticalAlignment.BOTTOM);
                return g2b.a;
            }
        }));
    }

    public static ox6 m(ox6 ox6Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return l(ox6Var, f, f2, f3, f4);
    }

    public static final KSerializer n(ln4 ln4Var, Type type) {
        ln4Var.getClass();
        type.getClass();
        KSerializer<Object> kSerializerC = xd9.c(ln4Var, type, true);
        if (kSerializerC != null) {
            return kSerializerC;
        }
        Class<?> clsA = xd9.a(type);
        clsA.getClass();
        sd1 sd1VarA = ll8.a(clsA);
        sd1VarA.getClass();
        String strC = sd1VarA.c();
        if (strC == null) {
            strC = "<local class name not available>";
        }
        throw new td9(sk0.c("Serializer for class '", strC, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return u4c.u.get().I();
    }
}
