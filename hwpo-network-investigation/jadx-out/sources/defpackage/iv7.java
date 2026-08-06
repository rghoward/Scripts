package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iv7 extends fk4<iv7, b> implements bu6 {
    private static final iv7 DEFAULT_INSTANCE;
    private static volatile st7<iv7> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final yi5<Integer, lh9> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = BuildConfig.FLAVOR;
    private zi5.b sessionVerbosity_ = nf5.w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements yi5<Integer, lh9> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends fk4.a<iv7, b> implements bu6 {
        public b() {
            super(iv7.DEFAULT_INSTANCE);
        }
    }

    static {
        iv7 iv7Var = new iv7();
        DEFAULT_INSTANCE = iv7Var;
        fk4.w(iv7.class, iv7Var);
    }

    public static b C() {
        return DEFAULT_INSTANCE.o();
    }

    public static void y(iv7 iv7Var, String str) {
        iv7Var.getClass();
        str.getClass();
        iv7Var.bitField0_ |= 1;
        iv7Var.sessionId_ = str;
    }

    public static void z(iv7 iv7Var) {
        iv7Var.getClass();
        RandomAccess randomAccess = iv7Var.sessionVerbosity_;
        if (!((m2) randomAccess).t) {
            nf5 nf5Var = (nf5) randomAccess;
            int i = nf5Var.v;
            int i2 = i == 0 ? 10 : i * 2;
            if (i2 < i) {
                zn3.b();
                return;
            }
            iv7Var.sessionVerbosity_ = new nf5(Arrays.copyOf(nf5Var.u, i2), nf5Var.v, true);
        }
        ((nf5) iv7Var.sessionVerbosity_).e(1);
    }

    public final lh9 A() {
        lh9 lh9Var;
        int i = ((nf5) this.sessionVerbosity_).i(0);
        lh9 lh9Var2 = lh9.SESSION_VERBOSITY_NONE;
        if (i != 0) {
            lh9Var = i != 1 ? null : lh9.GAUGES_AND_SYSTEM_EVENTS;
        } else {
            lh9Var = lh9Var2;
        }
        return lh9Var == null ? lh9Var2 : lh9Var;
    }

    public final int B() {
        return ((nf5) this.sessionVerbosity_).size();
    }

    @Override // defpackage.fk4
    public final Object p(fk4.e eVar) {
        st7 bVar;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new xh8(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", lh9.a.a});
            case 3:
                return new iv7();
            case 4:
                return new b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                st7<iv7> st7Var = PARSER;
                if (st7Var != null) {
                    return st7Var;
                }
                synchronized (iv7.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new fk4.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                e44.b();
                return null;
        }
    }
}
