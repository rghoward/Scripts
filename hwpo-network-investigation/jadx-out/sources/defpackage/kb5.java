package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kb5 {
    public final y53 a;
    public a.C0190a b;
    public a.d c;
    public a.c d;
    public a.b e;
    public a f;
    public o1a g;
    public long h = 9205357640488583168L;
    public ura i;
    public final mb5 j;
    public final dg7 k;
    public long l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {

        /* JADX INFO: renamed from: kb5$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0190a extends a {
            public EnumC0191a a = EnumC0191a.v;
            public boolean b = false;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: kb5$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class EnumC0191a {
                public static final EnumC0191a t;
                public static final EnumC0191a u;
                public static final EnumC0191a v;
                public static final /* synthetic */ EnumC0191a[] w;

                static {
                    EnumC0191a enumC0191a = new EnumC0191a("Yes", 0);
                    t = enumC0191a;
                    EnumC0191a enumC0191a2 = new EnumC0191a("No", 1);
                    u = enumC0191a2;
                    EnumC0191a enumC0191a3 = new EnumC0191a("NotInitialized", 2);
                    v = enumC0191a3;
                    w = new EnumC0191a[]{enumC0191a, enumC0191a2, enumC0191a3};
                }

                public EnumC0191a() {
                    throw null;
                }

                public static EnumC0191a valueOf(String str) {
                    return (EnumC0191a) Enum.valueOf(EnumC0191a.class, str);
                }

                public static EnumC0191a[] values() {
                    return (EnumC0191a[]) w.clone();
                }
            }

            public C0190a(int i) {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b extends a {
            public jb5 a;
            public long b;
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends a {
            public jb5 a;
            public long b;
            public boolean c;
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class d extends a {
            public long a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.C0190a.EnumC0191a.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public kb5(y53 y53Var) {
        this.a = y53Var;
        mb5 mb5Var = new mb5();
        mb5Var.b = new t27<>((Object) null);
        this.j = mb5Var;
        dg7 dg7Var = new dg7();
        dg7Var.b = new m27();
        this.k = dg7Var;
        this.l = 0L;
    }

    public static void c(kb5 kb5Var, jb5 jb5Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        y53 y53Var = kb5Var.a;
        a.c cVar = kb5Var.d;
        if (cVar == null) {
            cVar = new a.c();
            cVar.a = null;
            cVar.b = Long.MAX_VALUE;
            cVar.c = false;
            kb5Var.d = cVar;
        }
        cVar.a = jb5Var;
        cVar.b = j;
        ura uraVar = kb5Var.i;
        fl7 fl7Var = y53Var.J;
        if (uraVar == null) {
            kb5Var.i = new ura(fl7Var);
        } else {
            uraVar.a = fl7Var;
            uraVar.b = j2;
        }
        cVar.c = false;
        kb5Var.f = cVar;
    }

    public final void a() {
        a.C0190a c0190a = this.b;
        if (c0190a == null) {
            c0190a = new a.C0190a(0);
            this.b = c0190a;
        }
        c0190a.a = a.C0190a.EnumC0191a.v;
        c0190a.b = false;
        this.f = c0190a;
    }

    public final void b(jb5 jb5Var, long j, ura uraVar) {
        a.b bVar = this.e;
        if (bVar == null) {
            bVar = new a.b();
            bVar.a = null;
            bVar.b = Long.MAX_VALUE;
            this.e = bVar;
        }
        bVar.a = jb5Var;
        bVar.b = j;
        uraVar.b = 0L;
        this.f = bVar;
    }

    public final o1a d() {
        o1a o1aVar = this.g;
        if (o1aVar != null) {
            return o1aVar;
        }
        z90.a("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(jb5 jb5Var, ib5 ib5Var, long j) {
        y53 y53Var = this.a;
        long jF = ew2.e(y53Var).f(0L);
        if (!vf7.b(this.h, 9205357640488583168L) && !vf7.b(jF, this.h)) {
            this.l = vf7.e(this.l, vf7.d(jF, this.h));
        }
        this.h = jF;
        fl7 fl7Var = y53Var.J;
        fl7Var.getClass();
        m63.a aVar = m63.a;
        if (Math.abs(Float.intBitsToFloat((int) (fl7Var == fl7.t ? j & 4294967295L : j >> 32))) > 2.0f) {
            lb5.b(d(), jb5Var, y53Var.J, ib5Var, this.j, this.l);
            dg7 dg7Var = this.k;
            m27 m27Var = dg7Var.b;
            int i = m27Var.b;
            if (i == 3) {
                int i2 = dg7Var.a;
                dg7Var.a = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    r.b("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = m27Var.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                }
            } else {
                m27Var.a(j);
            }
            if (dg7Var.a == 3) {
                dg7Var.a = 0;
            }
            long[] jArr2 = m27Var.a;
            int i3 = m27Var.b;
            float fIntBitsToFloat = 0.0f;
            float fIntBitsToFloat2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fIntBitsToFloat2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = m27Var.b;
            float f = fIntBitsToFloat2 / i5;
            long[] jArr3 = m27Var.a;
            for (int i6 = 0; i6 < i5; i6++) {
                fIntBitsToFloat += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            y53Var.n2(new n53.b((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat / m27Var.b)) & 4294967295L), true));
        }
    }

    public final void f(jb5 jb5Var, jb5 jb5Var2, ib5 ib5Var, long j) {
        if (this.g == null) {
            this.g = new o1a();
        }
        this.l = 0L;
        o1a o1aVarD = d();
        y53 y53Var = this.a;
        lb5.b(o1aVarD, jb5Var, y53Var.J, ib5Var, this.j, this.l);
        long jD = vf7.d(lb5.f(jb5Var2, y53Var.J, ib5Var), j);
        if (y53Var.K.invoke(new n58(1)).booleanValue()) {
            this.h = ew2.e(y53Var).f(0L);
            y53Var.n2(new n53.c(jD));
        }
        dg7 dg7Var = this.k;
        dg7Var.a = 0;
        dg7Var.b.b = 0;
    }
}
