package defpackage;

import com.hwpo_training_app.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cm2 extends dl0<c, b> {
    public static final /* synthetic */ int I = 0;
    public final uc9 A;
    public final n89 B;
    public final p43 C;
    public final bu8 D;
    public final yq6 E;
    public final yq6 F;
    public final yq6 G;
    public final yq6 H;
    public final spb x;
    public final long y;
    public final wk4 z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.workouts.presentation.day_workouts.DayViewModel$1", f = "DayViewModel.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;

        public a(r02<? super a> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return cm2.this.new a(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objG = cm2.g(cm2.this, this);
                v72 v72Var = v72.t;
                if (objG == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class b implements bl0 {

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a extends b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 17602369;
            }

            public final String toString() {
                return "DataLoadedEmpty";
            }
        }

        /* JADX INFO: renamed from: cm2$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0044b extends b {
            public static final C0044b a = new C0044b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0044b);
            }

            public final int hashCode() {
                return -1131072649;
            }

            public final String toString() {
                return "FinishRefreshing";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c extends b {
            public final ArrayList a;

            public c(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ml.a("ProgramsLoaded(programs=", this.a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class d extends b {
            public final List<s23> a;

            /* JADX WARN: Multi-variable type inference failed */
            public d(List<? extends s23> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a.equals(((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "SessionsLoaded(sessions=" + this.a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class e extends b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1134177836;
            }

            public final String toString() {
                return "StartRefreshing";
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cm2(spb spbVar, long j, wk4 wk4Var, uc9 uc9Var, td8 td8Var, pf9 pf9Var, de9 de9Var, n89 n89Var, p43 p43Var, bu8 bu8Var) {
        spbVar.getClass();
        wk4Var.getClass();
        uc9Var.getClass();
        td8Var.getClass();
        pf9Var.getClass();
        de9Var.getClass();
        n89Var.getClass();
        p43Var.getClass();
        bu8Var.getClass();
        int i = 0;
        super(new c(i));
        this.x = spbVar;
        this.y = j;
        this.z = wk4Var;
        this.A = uc9Var;
        this.B = n89Var;
        this.C = p43Var;
        this.D = bu8Var;
        yk2.o(new k74(new fm2(td8Var.b, this), new gm2(this, null)), rhb.b(this));
        yk2.o(new k74(new jm2(pf9Var.b, this, i), new km2(this, null)), rhb.b(this));
        yk2.o(new k74(de9Var.b, new hm2(this, null)), rhb.b(this));
        oy0.d(rhb.b(this), null, null, new a(null), 3);
        this.E = oh7.a(this.u, new ln1(1));
        this.F = oh7.a(this.u, new mn1(1));
        this.G = oh7.a(this.u, new nn1(1));
        this.H = oh7.a(this.u, new g9(2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (defpackage.yd3.b(r14, r5, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(final defpackage.cm2 r13, defpackage.u02 r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.lm2
            if (r0 == 0) goto L13
            r0 = r14
            lm2 r0 = (defpackage.lm2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lm2 r0 = new lm2
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.dv8.b(r14)
            goto L70
        L2a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            r13 = 0
            return r13
        L31:
            defpackage.dv8.b(r14)
            goto L4d
        L35:
            defpackage.dv8.b(r14)
            wk4$a r14 = new wk4$a
            long r5 = r13.y
            r14.<init>(r5)
            wk4 r1 = r13.z
            r0.v = r3
            r1.getClass()
            java.lang.Object r14 = defpackage.g5b.b(r1, r14, r0)
            if (r14 != r4) goto L4d
            goto L6f
        L4d:
            xd3 r14 = (defpackage.xd3) r14
            bm2 r1 = new bm2
            r1.<init>()
            xd3 r14 = defpackage.yd3.g(r14, r1)
            mm2 r5 = new mm2
            r11 = 4
            r12 = 0
            r6 = 2
            java.lang.Class<cm2> r8 = defpackage.cm2.class
            java.lang.String r9 = "programsLoaded"
            java.lang.String r10 = "programsLoaded(Lkotlin/Pair;)V"
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.v = r2
            java.lang.Object r13 = defpackage.yd3.b(r14, r5, r0)
            if (r13 != r4) goto L70
        L6f:
            return r4
        L70:
            g2b r13 = defpackage.g2b.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm2.g(cm2, u02):java.lang.Object");
    }

    public static Set i(int i, ArrayList arrayList) {
        Object next;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bc8 bc8Var = (bc8) obj;
            Iterator<T> it = bc8Var.A.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((s23) next).getId() != i);
            if (next != null) {
                linkedHashSet.add(Integer.valueOf(bc8Var.t));
            }
        }
        return th1.X(linkedHashSet);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof b.e) {
            return c.a(b(), true, null, null, null, 29);
        }
        if (bl0Var instanceof b.C0044b) {
            return c.a(b(), false, null, null, null, 29);
        }
        int i = 0;
        if (bl0Var instanceof b.a) {
            c cVarB = b();
            bu8 bu8Var = this.D;
            vz7 vz7Var = new vz7(0, true, false, bu8Var.b(R.string.need_a_rest, new Object[0]), bu8Var.b(R.string.no_programs_in_calendar, new Object[0]), bu8Var.b(R.string.reload, new Object[0]), 65);
            hf3 hf3Var = hf3.t;
            return c.a(cVarB, false, vz7Var, hf3Var, hf3Var, 2);
        }
        if (bl0Var instanceof b.c) {
            return c.a(b(), false, vz7.a(b().c), ((b.c) bl0Var).a, null, 18);
        }
        if (!(bl0Var instanceof b.d)) {
            return new c(i);
        }
        return c.a(b(), false, vz7.a(b().c), null, ((b.d) bl0Var).a, 10);
    }

    public final ArrayList j() {
        List<x23> list = b().d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof bc8) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements el0 {
        public final boolean a;
        public final boolean b;
        public final vz7 c;
        public final List<x23> d;
        public final List<s23> e;

        public /* synthetic */ c(int i) {
            vz7 vz7Var = new vz7(0, false, false, null, null, null, 127);
            hf3 hf3Var = hf3.t;
            this(false, false, vz7Var, hf3Var, hf3Var);
        }

        public static c a(c cVar, boolean z, vz7 vz7Var, List list, List list2, int i) {
            boolean z2 = (i & 1) != 0 ? cVar.a : false;
            if ((i & 2) != 0) {
                z = cVar.b;
            }
            if ((i & 4) != 0) {
                vz7Var = cVar.c;
            }
            if ((i & 8) != 0) {
                list = cVar.d;
            }
            if ((i & 16) != 0) {
                list2 = cVar.e;
            }
            List list3 = list2;
            cVar.getClass();
            vz7Var.getClass();
            list.getClass();
            list3.getClass();
            List list4 = list;
            return new c(z2, z, vz7Var, list4, list3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && xj5.a(this.c, cVar.c) && xj5.a(this.d, cVar.d) && xj5.a(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ho2.a((this.c.hashCode() + uo2.a(Boolean.hashCode(this.a) * 31, this.b, 31)) * 31, 31, this.d);
        }

        public final String toString() {
            return "State(isProgress=" + this.a + ", isRefreshing=" + this.b + ", placeholderState=" + this.c + ", programs=" + this.d + ", sessions=" + this.e + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z, boolean z2, vz7 vz7Var, List<? extends x23> list, List<? extends s23> list2) {
            this.a = z;
            this.b = z2;
            this.c = vz7Var;
            this.d = list;
            this.e = list2;
        }

        public c() {
            this(0);
        }
    }
}
