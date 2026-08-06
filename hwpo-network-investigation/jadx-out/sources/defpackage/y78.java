package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y78 extends ek4<y78, a> implements cu6 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final y78 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile tt7<y78> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends ek4.a<y78, a> implements cu6 {
        public a() {
            super(y78.DEFAULT_INSTANCE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b A;
        public static final b B;
        public static final /* synthetic */ b[] C;
        public static final b t;
        public static final b u;
        public static final b v;
        public static final b w;
        public static final b x;
        public static final b y;
        public static final b z;

        static {
            b bVar = new b("BOOLEAN", 0);
            t = bVar;
            b bVar2 = new b("FLOAT", 1);
            u = bVar2;
            b bVar3 = new b("INTEGER", 2);
            v = bVar3;
            b bVar4 = new b("LONG", 3);
            w = bVar4;
            b bVar5 = new b("STRING", 4);
            x = bVar5;
            b bVar6 = new b("STRING_SET", 5);
            y = bVar6;
            b bVar7 = new b("DOUBLE", 6);
            z = bVar7;
            b bVar8 = new b("BYTES", 7);
            A = bVar8;
            b bVar9 = new b("VALUE_NOT_SET", 8);
            B = bVar9;
            C = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) C.clone();
        }
    }

    static {
        y78 y78Var = new y78();
        DEFAULT_INSTANCE = y78Var;
        ek4.o(y78.class, y78Var);
    }

    public static y78 A() {
        return DEFAULT_INSTANCE;
    }

    public static a I() {
        return (a) ((ek4.a) DEFAULT_INSTANCE.h(ek4.f.x));
    }

    public static void p(y78 y78Var, long j) {
        y78Var.valueCase_ = 4;
        y78Var.value_ = Long.valueOf(j);
    }

    public static void q(y78 y78Var, String str) {
        y78Var.getClass();
        y78Var.valueCase_ = 5;
        y78Var.value_ = str;
    }

    public static void r(y78 y78Var, x78 x78Var) {
        y78Var.getClass();
        y78Var.value_ = x78Var;
        y78Var.valueCase_ = 6;
    }

    public static void s(y78 y78Var, double d) {
        y78Var.valueCase_ = 7;
        y78Var.value_ = Double.valueOf(d);
    }

    public static void t(y78 y78Var, e01.f fVar) {
        y78Var.getClass();
        y78Var.valueCase_ = 8;
        y78Var.value_ = fVar;
    }

    public static void v(y78 y78Var, boolean z) {
        y78Var.valueCase_ = 1;
        y78Var.value_ = Boolean.valueOf(z);
    }

    public static void w(y78 y78Var, float f) {
        y78Var.valueCase_ = 2;
        y78Var.value_ = Float.valueOf(f);
    }

    public static void x(y78 y78Var, int i) {
        y78Var.valueCase_ = 3;
        y78Var.value_ = Integer.valueOf(i);
    }

    public final double B() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float C() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int D() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long E() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String F() {
        return this.valueCase_ == 5 ? (String) this.value_ : BuildConfig.FLAVOR;
    }

    public final x78 G() {
        return this.valueCase_ == 6 ? (x78) this.value_ : x78.r();
    }

    public final b H() {
        switch (this.valueCase_) {
            case 0:
                return b.B;
            case 1:
                return b.t;
            case 2:
                return b.u;
            case 3:
                return b.v;
            case 4:
                return b.w;
            case 5:
                return b.x;
            case 6:
                return b.y;
            case 7:
                return b.z;
            case 8:
                return b.A;
            default:
                return null;
        }
    }

    @Override // defpackage.ek4
    public final Object h(ek4.f fVar) {
        tt7 bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new yh8(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", x78.class});
            case 3:
                return new y78();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                tt7<y78> tt7Var = PARSER;
                if (tt7Var != null) {
                    return tt7Var;
                }
                synchronized (y78.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new ek4.b();
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

    public final boolean y() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final e01 z() {
        return this.valueCase_ == 8 ? (e01) this.value_ : e01.u;
    }
}
