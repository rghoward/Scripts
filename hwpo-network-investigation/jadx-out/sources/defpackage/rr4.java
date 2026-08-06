package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rr4 extends dl0<cs4, pq4> {
    public static final a Companion = new a();
    public final ye7 A;
    public final cm3 B;
    public final bu8 C;
    public final yq6 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final ed6 J;
    public final tp8 x;
    public final xp8 y;
    public final ve7 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr4(q09 q09Var, tp8 tp8Var, xp8 xp8Var, ve7 ve7Var, ye7 ye7Var, cm3 cm3Var, bu8 bu8Var) {
        super(new cs4(false, BuildConfig.FLAVOR, BuildConfig.FLAVOR, hf3.t, false, true, false, new vz7(0, false, false, null, null, null, 127)));
        q09Var.getClass();
        tp8Var.getClass();
        xp8Var.getClass();
        ve7Var.getClass();
        ye7Var.getClass();
        cm3Var.getClass();
        bu8Var.getClass();
        cs4.Companion.getClass();
        this.x = tp8Var;
        this.y = xp8Var;
        this.z = ve7Var;
        this.A = ye7Var;
        this.B = cm3Var;
        this.C = bu8Var;
        this.D = oh7.a(this.u, new nr4());
        this.E = oh7.a(this.u, new or4());
        this.F = oh7.a(this.u, new zy2(1));
        this.G = oh7.a(this.u, new pr4());
        this.H = oh7.a(this.u, new qr4());
        this.I = oh7.a(this.u, new wk3(1));
        Object objA = q09Var.a("com.hwpo_training_app.affilated_gym.filters.location_filter.GymLocationFilterFragment.LOCATION_FILTER_MODE_ARG");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        ed6 ed6Var = (ed6) objA;
        this.J = ed6Var;
        e(new pq4.a(bu8Var.b(ed6Var.c(), new Object[0]), bu8Var.b(ed6Var.a(), new Object[0]), ed6Var.b() != null));
        oy0.d(rhb.b(this), null, null, new sr4(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r15 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r15 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (defpackage.yd3.a(r15, r7, r0) == r6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.rr4 r14, defpackage.u02 r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof defpackage.vr4
            if (r0 == 0) goto L13
            r0 = r15
            vr4 r0 = (defpackage.vr4) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vr4 r0 = new vr4
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.t
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
            defpackage.dv8.b(r15)
            goto L94
        L2e:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            return r2
        L34:
            defpackage.dv8.b(r15)
            goto L7b
        L38:
            defpackage.dv8.b(r15)
            goto L61
        L3c:
            defpackage.dv8.b(r15)
            pq4$f r15 = pq4.f.a
            r14.e(r15)
            ed6 r15 = r14.J
            boolean r1 = r15 instanceof ed6.a
            if (r1 == 0) goto L64
            tp8$a r1 = new tp8$a
            ed6$a r15 = (ed6.a) r15
            java.lang.String r15 = r15.t
            r1.<init>(r15, r5)
            tp8 r15 = r14.x
            r0.v = r5
            r15.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r15, r1, r0)
            if (r15 != r6) goto L61
            goto L93
        L61:
            xd3 r15 = (defpackage.xd3) r15
            goto L7d
        L64:
            boolean r15 = r15 instanceof ed6.b
            if (r15 == 0) goto L97
            xp8$a r15 = new xp8$a
            r15.<init>(r5)
            xp8 r1 = r14.y
            r0.v = r4
            r1.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r1, r15, r0)
            if (r15 != r6) goto L7b
            goto L93
        L7b:
            xd3 r15 = (defpackage.xd3) r15
        L7d:
            wr4 r7 = new wr4
            java.lang.String r12 = "dataRequestFailure(Ljava/lang/Exception;)V"
            r13 = 4
            r8 = 2
            java.lang.Class<rr4> r10 = defpackage.rr4.class
            java.lang.String r11 = "dataRequestFailure"
            r9 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.v = r3
            java.lang.Object r14 = defpackage.yd3.a(r15, r7, r0)
            if (r14 != r6) goto L94
        L93:
            return r6
        L94:
            g2b r14 = defpackage.g2b.a
            return r14
        L97:
            defpackage.u.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.g(rr4, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r15 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r15 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (defpackage.yd3.a(r15, r7, r0) == r6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.rr4 r14, defpackage.u02 r15) throws java.lang.Throwable {
        /*
            r14.getClass()
            boolean r0 = r15 instanceof defpackage.xr4
            if (r0 == 0) goto L16
            r0 = r15
            xr4 r0 = (defpackage.xr4) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.v = r1
            goto L1b
        L16:
            xr4 r0 = new xr4
            r0.<init>(r14, r15)
        L1b:
            java.lang.Object r15 = r0.t
            int r1 = r0.v
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            v72 r6 = defpackage.v72.t
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.dv8.b(r15)
            goto L98
        L31:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r14)
            return r2
        L37:
            defpackage.dv8.b(r15)
            goto L7f
        L3b:
            defpackage.dv8.b(r15)
            goto L65
        L3f:
            defpackage.dv8.b(r15)
            pq4$g r15 = pq4.g.a
            r14.e(r15)
            ed6 r15 = r14.J
            boolean r1 = r15 instanceof ed6.a
            r7 = 0
            if (r1 == 0) goto L68
            tp8$a r1 = new tp8$a
            ed6$a r15 = (ed6.a) r15
            java.lang.String r15 = r15.t
            r1.<init>(r15, r7)
            tp8 r15 = r14.x
            r0.v = r5
            r15.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r15, r1, r0)
            if (r15 != r6) goto L65
            goto L97
        L65:
            xd3 r15 = (defpackage.xd3) r15
            goto L81
        L68:
            boolean r15 = r15 instanceof ed6.b
            if (r15 == 0) goto L9b
            xp8$a r15 = new xp8$a
            r15.<init>(r7)
            xp8 r1 = r14.y
            r0.v = r4
            r1.getClass()
            java.lang.Object r15 = defpackage.g5b.b(r1, r15, r0)
            if (r15 != r6) goto L7f
            goto L97
        L7f:
            xd3 r15 = (defpackage.xd3) r15
        L81:
            yr4 r7 = new yr4
            java.lang.String r12 = "paginationFailure(Ljava/lang/Exception;)V"
            r13 = 4
            r8 = 2
            java.lang.Class<rr4> r10 = defpackage.rr4.class
            java.lang.String r11 = "paginationFailure"
            r9 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.v = r3
            java.lang.Object r14 = defpackage.yd3.a(r15, r7, r0)
            if (r14 != r6) goto L98
        L97:
            return r6
        L98:
            g2b r14 = defpackage.g2b.a
            return r14
        L9b:
            defpackage.u.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.i(rr4, u02):java.lang.Object");
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof pq4.b) {
            return cs4.a(b(), false, null, null, null, false, ((pq4.b) bl0Var).a, false, null, 223);
        }
        if (bl0Var instanceof pq4.i) {
            return cs4.a(b(), false, null, null, null, false, false, ((pq4.i) bl0Var).a, null, 191);
        }
        if (bl0Var instanceof pq4.f) {
            return cs4.a(b(), true, null, null, null, false, false, false, new vz7(0, false, false, null, null, null, 125), 126);
        }
        if (bl0Var instanceof pq4.g) {
            return cs4.a(b(), false, null, null, th1.L(b().d, pr7.a), true, false, false, null, 231);
        }
        if (bl0Var instanceof pq4.h) {
            cs4 cs4VarB = b();
            List<w23> list = b().d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((w23) obj) instanceof pr7)) {
                    arrayList.add(obj);
                }
            }
            return cs4.a(cs4VarB, false, null, null, arrayList, false, false, false, null, 231);
        }
        if (bl0Var instanceof pq4.c) {
            return cs4.a(b(), false, null, null, ((pq4.c) bl0Var).a, false, false, false, vz7.a(b().h), 102);
        }
        boolean z = bl0Var instanceof pq4.e;
        bu8 bu8Var = this.C;
        hf3 hf3Var = hf3.t;
        if (z) {
            cs4 cs4VarB2 = b();
            vz7.Companion.getClass();
            return cs4.a(cs4VarB2, false, null, null, hf3Var, false, false, false, vz7.a.a(bu8Var), 118);
        }
        if (bl0Var instanceof pq4.d) {
            cs4 cs4VarB3 = b();
            vz7.Companion.getClass();
            bu8Var.getClass();
            return cs4.a(cs4VarB3, false, null, null, hf3Var, false, false, false, new vz7(0, true, false, bu8Var.b(R.string.no_results_found, new Object[0]), BuildConfig.FLAVOR, null, 101), 118);
        }
        if (!(bl0Var instanceof pq4.a)) {
            return b();
        }
        pq4.a aVar = (pq4.a) bl0Var;
        return cs4.a(b(), false, aVar.a, aVar.b, null, false, false, aVar.c, null, ModuleDescriptor.MODULE_VERSION);
    }
}
