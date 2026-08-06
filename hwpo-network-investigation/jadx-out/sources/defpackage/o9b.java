package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o9b extends dl0<gab, d8b> {
    public static final /* synthetic */ int m0 = 0;
    public final rq8 A;
    public final pl4 B;
    public final qk4 C;
    public final mz9 D;
    public final r31 E;
    public final ox2 F;
    public final fl4 G;
    public final q68 H;
    public final e70 I;
    public final uc8 J;
    public final r60 K;
    public final ad8 L;
    public final cm3 M;
    public final int N;
    public final ebb O;
    public final xn0 P;
    public final m2b Q;
    public final String R;
    public final boolean S;
    public final DecimalFormat T;
    public final SimpleDateFormat U;
    public final SimpleDateFormat V;
    public final SimpleDateFormat W;
    public Integer X;
    public final yq6 Y;
    public final yq6 Z;
    public final yq6 a0;
    public final yq6 b0;
    public final yq6 c0;
    public final yq6 d0;
    public final yq6 e0;
    public final yq6 f0;
    public final yq6 g0;
    public final yq6 h0;
    public final yq6 i0;
    public final yq6 j0;
    public final yq6 k0;
    public final yq6 l0;
    public final pta x;
    public final k55 y;
    public final bu8 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ebb.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9b(q09 q09Var, pta ptaVar, k55 k55Var, bu8 bu8Var, rq8 rq8Var, nf7 nf7Var, pl4 pl4Var, qk4 qk4Var, mf7 mf7Var, mz9 mz9Var, r31 r31Var, af7 af7Var, ox2 ox2Var, fl4 fl4Var, q68 q68Var, e70 e70Var, uc8 uc8Var, r60 r60Var, ad8 ad8Var, cm3 cm3Var) {
        super(new gab(hf3.t, null, null, BuildConfig.FLAVOR, false, false, BuildConfig.FLAVOR, false, false, null, true, new t59(0), m59.w, new vz7(0, false, false, null, null, null, 127)));
        q09Var.getClass();
        ptaVar.getClass();
        k55Var.getClass();
        bu8Var.getClass();
        rq8Var.getClass();
        nf7Var.getClass();
        pl4Var.getClass();
        qk4Var.getClass();
        mf7Var.getClass();
        mz9Var.getClass();
        r31Var.getClass();
        af7Var.getClass();
        ox2Var.getClass();
        fl4Var.getClass();
        q68Var.getClass();
        e70Var.getClass();
        uc8Var.getClass();
        r60Var.getClass();
        ad8Var.getClass();
        cm3Var.getClass();
        gab.Companion.getClass();
        this.x = ptaVar;
        this.y = k55Var;
        this.z = bu8Var;
        this.A = rq8Var;
        this.B = pl4Var;
        this.C = qk4Var;
        this.D = mz9Var;
        this.E = r31Var;
        this.F = ox2Var;
        this.G = fl4Var;
        this.H = q68Var;
        this.I = e70Var;
        this.J = uc8Var;
        this.K = r60Var;
        this.L = ad8Var;
        this.M = cm3Var;
        Integer num = (Integer) q09Var.a("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.ID");
        if (num == null) {
            z90.a("ID must not be null");
            throw null;
        }
        this.N = num.intValue();
        ebb ebbVar = (ebb) q09Var.a("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.VALUE_TYPE");
        if (ebbVar == null) {
            z90.a("VALUE_TYPE must not be null");
            throw null;
        }
        this.O = ebbVar;
        xn0 xn0Var = (xn0) q09Var.a("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.MEASURE_TYPE");
        if (xn0Var == null) {
            z90.a("MEASURE_TYPE must not be null");
            throw null;
        }
        this.P = xn0Var;
        m2b m2bVar = (m2b) q09Var.a("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.UNITS");
        if (m2bVar == null) {
            z90.a("UNITS must not be null");
            throw null;
        }
        this.Q = m2bVar;
        String str = (String) q09Var.a("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.NAME");
        if (str == null) {
            z90.a("NAME must not be null");
            throw null;
        }
        this.R = str;
        Boolean bool = (Boolean) q09Var.a("com.fitr_training.tracking.presentation.value_details.ValueDetailsFragment.CAME_FROM_LEADERBOARDS");
        if (bool == null) {
            z90.a("CAME_FROM_LEADERBOARDS must not be null");
            throw null;
        }
        this.S = bool.booleanValue();
        this.T = new DecimalFormat("0.###");
        this.U = new SimpleDateFormat("d MMM, yyyy", Locale.getDefault());
        this.V = new SimpleDateFormat("d MMM", Locale.getDefault());
        this.W = new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
        e(new d8b.a(str, ebbVar != ebb.CHALLENGES));
        j(c13.v);
        g2b g2bVar = g2b.a;
        yk2.o(new k74(nf7Var.b(g2bVar), new u9b(this, null)), rhb.b(this));
        yk2.o(new k74(new w9b(mf7Var.b(g2bVar), this), new x9b(this, null)), rhb.b(this));
        yk2.o(new k74(af7Var.b(g2bVar), new v9b(this, null)), rhb.b(this));
        this.Y = oh7.a(this.u, new upa(1));
        this.Z = oh7.a(this.u, new kz5());
        this.a0 = oh7.a(this.u, new n9b());
        this.b0 = oh7.a(this.u, new nl7(4, this));
        this.c0 = oh7.a(this.u, new ev0(2));
        this.d0 = oh7.a(this.u, new m32(4));
        this.e0 = oh7.a(this.u, new bf5(1));
        this.f0 = oh7.a(this.u, new o32(3));
        this.g0 = oh7.a(this.u, new p32(3));
        this.h0 = oh7.a(this.u, new q32(4));
        this.i0 = oh7.a(this.u, new vpa(1));
        this.j0 = oh7.a(this.u, new zj2(2));
        this.k0 = oh7.a(this.u, new v32(1));
        this.l0 = oh7.a(this.u, new m9b());
    }

    public static final void g(o9b o9bVar, Exception exc, c13 c13Var) {
        boolean z = c13Var == c13.v;
        if (z) {
            o9bVar.e(d8b.h.a);
        } else if (z) {
            u.b();
        } else {
            o9bVar.e(d8b.k.a);
            o9bVar.f(new i8b(o9bVar.M.a(exc)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r9, r1, r0) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(final defpackage.o9b r8, defpackage.u02 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.dab
            if (r0 == 0) goto L13
            r0 = r9
            dab r0 = (defpackage.dab) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dab r0 = new dab
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.t
            int r1 = r0.v
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            v72 r6 = defpackage.v72.t
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L38
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.dv8.b(r9)
            goto L7d
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r8)
            return r2
        L34:
            defpackage.dv8.b(r9)
            goto L6d
        L38:
            defpackage.dv8.b(r9)
            goto L54
        L3c:
            defpackage.dv8.b(r9)
            fl4 r9 = r8.G
            fl4$a r1 = new fl4$a
            int r7 = r8.N
            r1.<init>(r7)
            r0.v = r5
            r9.getClass()
            java.lang.Object r9 = defpackage.g5b.b(r9, r1, r0)
            if (r9 != r6) goto L54
            goto L7c
        L54:
            xd3 r9 = (defpackage.xd3) r9
            l9b r1 = new l9b
            r1.<init>()
            xd3 r9 = defpackage.yd3.g(r9, r1)
            eab r1 = new eab
            r1.<init>(r8, r2)
            r0.v = r4
            java.lang.Object r9 = defpackage.yd3.b(r9, r1, r0)
            if (r9 != r6) goto L6d
            goto L7c
        L6d:
            xd3 r9 = (defpackage.xd3) r9
            fab r1 = new fab
            r1.<init>(r8, r2)
            r0.v = r3
            java.lang.Object r8 = defpackage.yd3.a(r9, r1, r0)
            if (r8 != r6) goto L7d
        L7c:
            return r6
        L7d:
            g2b r8 = defpackage.g2b.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9b.i(o9b, u02):java.lang.Object");
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        String strB;
        String strB2;
        bl0Var.getClass();
        if (bl0Var instanceof d8b.i) {
            return gab.a(b(), null, null, null, null, true, false, null, false, false, null, false, null, null, null, 16335);
        }
        if (bl0Var instanceof d8b.j) {
            return gab.a(b(), null, null, null, null, true, false, null, false, false, null, false, null, null, null, 16367);
        }
        if (bl0Var instanceof d8b.k) {
            return gab.a(b(), null, null, null, null, false, false, null, false, false, null, false, null, null, null, 16367);
        }
        if (bl0Var instanceof d8b.f) {
            return gab.a(b(), null, null, null, ((d8b.f) bl0Var).a, false, false, null, false, false, null, false, null, null, null, 16375);
        }
        if (bl0Var instanceof d8b.a) {
            d8b.a aVar = (d8b.a) bl0Var;
            return gab.a(b(), null, null, null, null, false, false, aVar.a, false, false, null, aVar.b, null, null, null, 15295);
        }
        if (bl0Var instanceof d8b.e) {
            return gab.a(b(), ((d8b.e) bl0Var).a, null, null, null, false, true, null, false, false, null, false, null, null, vz7.a(b().n), 8142);
        }
        if (bl0Var instanceof d8b.c) {
            d8b.c cVar = (d8b.c) bl0Var;
            return gab.a(b(), null, null, cVar.a, null, false, false, null, false, false, cVar.b, false, null, null, null, 15867);
        }
        if (bl0Var instanceof d8b.b) {
            d8b.b bVar = (d8b.b) bl0Var;
            return gab.a(b(), null, bVar.a, null, null, false, false, null, false, false, bVar.b, false, null, null, null, 15869);
        }
        if (bl0Var instanceof d8b.d) {
            d8b.d dVar = (d8b.d) bl0Var;
            return gab.a(b(), null, null, null, null, false, false, null, dVar.a, dVar.b, null, false, null, null, null, 15999);
        }
        boolean z = bl0Var instanceof d8b.h;
        bu8 bu8Var = this.z;
        hf3 hf3Var = hf3.t;
        if (z) {
            return gab.a(b(), hf3Var, null, null, null, false, false, null, false, false, null, false, null, null, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 8174);
        }
        if (!(bl0Var instanceof d8b.g)) {
            if (bl0Var instanceof d8b.m) {
                return gab.a(b(), null, null, null, null, false, false, null, false, false, null, false, ((d8b.m) bl0Var).a, null, null, 14335);
            }
            return bl0Var instanceof d8b.l ? gab.a(b(), null, null, null, null, false, false, null, false, false, null, false, null, ((d8b.l) bl0Var).a, null, 12287) : b();
        }
        gab gabVarB = b();
        ebb ebbVar = this.O;
        int iOrdinal = ebbVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            strB = bu8Var.b(R.string.no_entries, new Object[0]);
        } else {
            if (iOrdinal != 2) {
                u.b();
                return null;
            }
            strB = bu8Var.b(R.string.no_scores, new Object[0]);
        }
        String str = strB;
        int iOrdinal2 = ebbVar.ordinal();
        if (iOrdinal2 == 0 || iOrdinal2 == 1) {
            strB2 = bu8Var.b(R.string.no_entries_hint, new Object[0]);
        } else {
            if (iOrdinal2 != 2) {
                u.b();
                return null;
            }
            strB2 = BuildConfig.FLAVOR;
        }
        return gab.a(gabVarB, hf3Var, null, null, null, false, false, null, false, false, null, false, null, null, new vz7(0, true, false, str, strB2, null, 101), 8142);
    }

    public final dz9 j(c13 c13Var) {
        return oy0.d(rhb.b(this), null, null, new cab(null, c13Var, this), 3);
    }
}
