package defpackage;

import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gd extends dl0<ud, pb> {
    public static final a Companion = new a();
    public final bu8 A;
    public final cm3 B;
    public String C;
    public dz9 D;
    public final ebb E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final yq6 I;
    public final yq6 J;
    public final yq6 K;
    public final yq6 L;
    public final yq6 M;
    public final pta x;
    public final tq8 y;
    public final pf7 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(q09 q09Var, pta ptaVar, tq8 tq8Var, pf7 pf7Var, bu8 bu8Var, cm3 cm3Var) {
        super(ud.l);
        q09Var.getClass();
        ptaVar.getClass();
        tq8Var.getClass();
        pf7Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        ud.Companion.getClass();
        this.x = ptaVar;
        this.y = tq8Var;
        this.z = pf7Var;
        this.A = bu8Var;
        this.B = cm3Var;
        this.C = BuildConfig.FLAVOR;
        ebb ebbVar = (ebb) q09Var.a("com.fitr_training.tracking.presentation.add_value.AddValueFragment.VALUE_TYPE");
        if (ebbVar == null) {
            z90.a("VALUE_TYPE must not be null");
            throw null;
        }
        this.E = ebbVar;
        int i = 0;
        this.F = oh7.a(this.u, new yc(i));
        this.G = oh7.a(this.u, new zc(i));
        this.H = oh7.a(this.u, new ad(i));
        this.I = oh7.a(this.u, new bd(0));
        this.J = oh7.a(this.u, new cd(0));
        this.K = oh7.a(this.u, new dd(0));
        this.L = oh7.a(this.u, new ed(0));
        this.M = oh7.a(this.u, new fd(i));
        ebb ebbVar2 = ebb.BENCHMARK;
        e(new pb.a(bu8Var.b(ebbVar == ebbVar2 ? R.string.track_new_personal_records : R.string.track_new_metric, new Object[0]), bu8Var.b(ebbVar == ebbVar2 ? R.string.select_personal_records : R.string.select_metric, new Object[0]), bu8Var.b(ebbVar == ebbVar2 ? R.string.personal_record_name : R.string.body_metric_name, new Object[0]), bu8Var.b(ebbVar == ebbVar2 ? R.string.search_personal_records_hint : R.string.search_benchmark_workouts_hint, new Object[0])));
        oy0.d(rhb.b(this), null, null, new hd(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r14 == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.gd r12, java.lang.String r13, defpackage.u02 r14) throws java.lang.Throwable {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof defpackage.nd
            if (r0 == 0) goto L16
            r0 = r14
            nd r0 = (defpackage.nd) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.v = r1
            goto L1b
        L16:
            nd r0 = new nd
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            defpackage.dv8.b(r14)
            r7 = r12
            goto L6f
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L35:
            defpackage.dv8.b(r14)
            goto L56
        L39:
            defpackage.dv8.b(r14)
            pb$g r14 = pb.g.a
            r12.e(r14)
            tq8$a r14 = new tq8$a
            ebb r1 = r12.E
            r14.<init>(r1, r3, r13)
            tq8 r13 = r12.y
            r0.v = r3
            r13.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r13, r14, r0)
            if (r14 != r4) goto L56
            goto L6e
        L56:
            xd3 r14 = (defpackage.xd3) r14
            od r5 = new od
            java.lang.String r10 = "dataRequestFailure(Ljava/lang/Exception;)V"
            r11 = 4
            r6 = 2
            java.lang.Class<gd> r8 = defpackage.gd.class
            java.lang.String r9 = "dataRequestFailure"
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.v = r2
            java.lang.Object r14 = defpackage.yd3.a(r14, r5, r0)
            if (r14 != r4) goto L6f
        L6e:
            return r4
        L6f:
            xd3 r14 = (defpackage.xd3) r14
            r14.getClass()
            pb$i r12 = pb.i.a
            r7.e(r12)
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd.g(gd, java.lang.String, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r14, r5, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.gd r12, java.lang.String r13, defpackage.u02 r14) throws java.lang.Throwable {
        /*
            r12.getClass()
            boolean r0 = r14 instanceof defpackage.pd
            if (r0 == 0) goto L16
            r0 = r14
            pd r0 = (defpackage.pd) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.v = r1
            goto L1b
        L16:
            pd r0 = new pd
            r0.<init>(r12, r14)
        L1b:
            java.lang.Object r14 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            defpackage.dv8.b(r14)
            goto L6f
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            r12 = 0
            return r12
        L34:
            defpackage.dv8.b(r14)
            goto L56
        L38:
            defpackage.dv8.b(r14)
            pb$h r14 = pb.h.a
            r12.e(r14)
            tq8$a r14 = new tq8$a
            ebb r1 = r12.E
            r5 = 0
            r14.<init>(r1, r5, r13)
            tq8 r13 = r12.y
            r0.v = r3
            r13.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r13, r14, r0)
            if (r14 != r4) goto L56
            goto L6e
        L56:
            xd3 r14 = (defpackage.xd3) r14
            qd r5 = new qd
            java.lang.String r10 = "paginationFailure(Ljava/lang/Exception;)V"
            r11 = 4
            r6 = 2
            java.lang.Class<gd> r8 = defpackage.gd.class
            java.lang.String r9 = "paginationFailure"
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.v = r2
            java.lang.Object r12 = defpackage.yd3.a(r14, r5, r0)
            if (r12 != r4) goto L6f
        L6e:
            return r4
        L6f:
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd.i(gd, java.lang.String, u02):java.lang.Object");
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof pb.d) {
            return ud.a(b(), null, null, null, null, null, ((pb.d) bl0Var).a, false, false, false, false, null, 2015);
        }
        if (bl0Var instanceof pb.b) {
            return ud.a(b(), null, null, null, null, null, null, false, false, ((pb.b) bl0Var).a, false, null, 1791);
        }
        if (bl0Var instanceof pb.g) {
            return ud.a(b(), null, null, null, null, null, null, true, false, false, false, null, 1983);
        }
        if (bl0Var instanceof pb.i) {
            return ud.a(b(), null, null, null, null, null, null, false, false, false, false, null, 1983);
        }
        if (bl0Var instanceof pb.h) {
            return ud.a(b(), null, null, null, null, th1.L(b().e, or7.a), null, false, true, false, false, null, 1903);
        }
        if (bl0Var instanceof pb.j) {
            ud udVarB = b();
            List<t23> list = b().e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((t23) obj) instanceof or7)) {
                    arrayList.add(obj);
                }
            }
            return ud.a(udVarB, null, null, null, null, arrayList, null, false, false, false, false, null, 1903);
        }
        boolean z = false;
        if (!(bl0Var instanceof pb.c)) {
            boolean z2 = bl0Var instanceof pb.f;
            bu8 bu8Var = this.A;
            hf3 hf3Var = hf3.t;
            if (z2) {
                return ud.a(b(), null, null, null, null, hf3Var, null, false, false, false, false, new vz7(0, true, true, bu8Var.b(R.string.something_went_wrong, new Object[0]), bu8Var.b(R.string.no_internet_description, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65), 943);
            }
            if (bl0Var instanceof pb.e) {
                return ud.a(b(), null, null, null, null, hf3Var, null, false, false, false, false, new vz7(0, true, false, bu8Var.b(R.string.no_results_found, new Object[0]), BuildConfig.FLAVOR, null, 101), 943);
            }
            if (!(bl0Var instanceof pb.a)) {
                return b();
            }
            pb.a aVar = (pb.a) bl0Var;
            return ud.a(b(), aVar.a, aVar.d, aVar.c, aVar.b, null, null, false, false, false, false, null, 2032);
        }
        ud udVarB2 = b();
        ArrayList arrayList2 = ((pb.c) bl0Var).a;
        vz7 vz7VarA = vz7.a(b().k);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            if (obj2 instanceof rc) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                if (((rc) obj3).c) {
                    z = true;
                    break;
                }
            }
        }
        return ud.a(udVarB2, null, null, null, null, arrayList2, null, false, false, false, z, vz7VarA, 303);
    }
}
