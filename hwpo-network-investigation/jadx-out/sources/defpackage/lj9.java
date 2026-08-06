package defpackage;

import android.icu.text.SimpleDateFormat;
import com.hwpo_training_app.R;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class lj9 extends dl0<xj9, kj9> implements as2 {
    public static final a Companion = new a();
    public final al4 A;
    public final yk4 B;
    public final b09 C;
    public final ef7 D;
    public final zk4 E;
    public final n89 F;
    public final p43 G;
    public final bu8 H;
    public final cm3 I;
    public final xi9 J;
    public boolean K;
    public boolean L;
    public rm0 M;
    public final yq6 N;
    public final yq6 O;
    public final yq6 P;
    public final yq6 Q;
    public final yq6 R;
    public final yq6 S;
    public final yq6 T;
    public final yq6 U;
    public final ri9 x;
    public final fp1 y;
    public final t1b z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u60.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$onPlanOptionChanged$1", f = "SessionsViewModel.kt", l = {283, 283, 283}, m = "invokeSuspend", v = 2)
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public int u;
        public final /* synthetic */ h08 w;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$onPlanOptionChanged$1$1", f = "SessionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends p6a implements ci4<g2b, r02<? super g2b>, Object> {
            public final /* synthetic */ lj9 t;
            public final /* synthetic */ h08 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lj9 lj9Var, h08 h08Var, r02<? super a> r02Var) {
                super(2, r02Var);
                this.t = lj9Var;
                this.u = h08Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new a(this.t, this.u, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(g2b g2bVar, r02<? super g2b> r02Var) {
                return ((a) create(g2bVar, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                dv8.b(obj);
                a aVar = lj9.Companion;
                this.t.j(this.u);
                return g2b.a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class b extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
            @Override // defpackage.ci4
            public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
                ((rma.a) this.receiver).b(th);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h08 h08Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.w = h08Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return lj9.this.new c(this.w, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        
            if (defpackage.yd3.a((defpackage.xd3) r2, r9, r16) == r8) goto L24;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.u
                h08 r2 = r0.w
                r3 = 3
                r4 = 2
                r5 = 1
                lj9 r6 = defpackage.lj9.this
                r7 = 0
                v72 r8 = defpackage.v72.t
                if (r1 == 0) goto L31
                if (r1 == r5) goto L29
                if (r1 == r4) goto L21
                if (r1 != r3) goto L1b
                defpackage.dv8.b(r17)
                goto L8f
            L1b:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r0)
                return r7
            L21:
                int r1 = r0.t
                defpackage.dv8.b(r17)
                r2 = r17
                goto L73
            L29:
                int r1 = r0.t
                defpackage.dv8.b(r17)
                r5 = r17
                goto L61
            L31:
                defpackage.dv8.b(r17)
                lj9$a r1 = defpackage.lj9.Companion
                el0 r1 = r6.b()
                xj9 r1 = (defpackage.xj9) r1
                bc8 r1 = r1.a
                if (r1 == 0) goto L92
                yz7 r1 = r1.u
                java.lang.Integer r1 = r1.t
                if (r1 == 0) goto L92
                int r1 = r1.intValue()
                zz7 r9 = new zz7
                int r10 = r2.t
                r9.<init>(r1, r10)
                b09 r10 = r6.C
                r0.t = r1
                r0.u = r5
                r10.getClass()
                java.lang.Object r5 = defpackage.g5b.b(r10, r9, r0)
                if (r5 != r8) goto L61
                goto L8e
            L61:
                xd3 r5 = (defpackage.xd3) r5
                lj9$c$a r9 = new lj9$c$a
                r9.<init>(r6, r2, r7)
                r0.t = r1
                r0.u = r4
                java.lang.Object r2 = defpackage.yd3.b(r5, r9, r0)
                if (r2 != r8) goto L73
                goto L8e
            L73:
                xd3 r2 = (defpackage.xd3) r2
                lj9$c$b r9 = new lj9$c$b
                rma$a r11 = defpackage.rma.a
                java.lang.String r14 = "e(Ljava/lang/Throwable;)V"
                r15 = 4
                r10 = 2
                java.lang.Class<rma$a> r12 = rma.a.class
                java.lang.String r13 = "e"
                r9.<init>(r10, r11, r12, r13, r14, r15)
                r0.t = r1
                r0.u = r3
                java.lang.Object r0 = defpackage.yd3.a(r2, r9, r0)
                if (r0 != r8) goto L8f
            L8e:
                return r8
            L8f:
                g2b r0 = defpackage.g2b.a
                return r0
            L92:
                g2b r0 = defpackage.g2b.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lj9.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public lj9(q09 q09Var, ri9 ri9Var, pf9 pf9Var, de9 de9Var, fp1 fp1Var, t1b t1bVar, al4 al4Var, yk4 yk4Var, b09 b09Var, ef7 ef7Var, zk4 zk4Var, n89 n89Var, p43 p43Var, td8 td8Var, bu8 bu8Var, cm3 cm3Var) {
        String strB;
        q09Var.getClass();
        ri9Var.getClass();
        pf9Var.getClass();
        de9Var.getClass();
        fp1Var.getClass();
        t1bVar.getClass();
        al4Var.getClass();
        yk4Var.getClass();
        b09Var.getClass();
        ef7Var.getClass();
        zk4Var.getClass();
        n89Var.getClass();
        p43Var.getClass();
        td8Var.getClass();
        bu8Var.getClass();
        cm3Var.getClass();
        xj9.a aVar = xj9.Companion;
        Boolean bool = (Boolean) q09Var.a("com.fitr_training.client.ui.sessions.SessionsFragment.ARG_CAN_RESCHEDULE");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        aVar.getClass();
        vz7 vz7Var = new vz7(0, false, false, null, null, null, 127);
        yl2 yl2Var = yl2.t;
        super(new xj9(null, hf3.t, false, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, vz7Var, zBooleanValue, yl2Var, yl2Var));
        this.x = ri9Var;
        this.y = fp1Var;
        this.z = t1bVar;
        this.A = al4Var;
        this.B = yk4Var;
        this.C = b09Var;
        this.D = ef7Var;
        this.E = zk4Var;
        this.F = n89Var;
        this.G = p43Var;
        this.H = bu8Var;
        this.I = cm3Var;
        Object objA = q09Var.a("com.fitr_training.client.ui.sessions.SessionsFragment.DATASOURCE");
        if (objA == null) {
            z90.a("Required value was null.");
            throw null;
        }
        this.J = (xi9) objA;
        oh7.a(this.u, new ig(2));
        this.N = oh7.a(this.u, new jg(1));
        this.O = oh7.a(this.u, new kg(2));
        this.P = oh7.a(this.u, new w19(1));
        this.Q = oh7.a(this.u, new mg(1));
        this.R = oh7.a(this.u, new y19(1));
        this.S = oh7.a(this.u, new kf3(2));
        this.T = oh7.a(this.u, new fs6(1));
        this.U = oh7.a(this.u, new qm0(2));
        String str = (String) q09Var.a("com.fitr_training.client.ui.sessions.SessionsFragment.ARG_TITLE");
        String str2 = BuildConfig.FLAVOR;
        str = str == null ? BuildConfig.FLAVOR : str;
        qi9 qi9Var = (qi9) q09Var.a("com.fitr_training.client.ui.sessions.SessionsFragment.ARG_SUBTITLE");
        if (qi9Var != null) {
            if (qi9Var instanceof qi9.c) {
                strB = bu8Var.b(R.string.program_date, Integer.valueOf(((qi9.c) qi9Var).u));
            } else {
                if (!(qi9Var instanceof qi9.b)) {
                    u.b();
                    throw null;
                }
                strB = ((SimpleDateFormat) qi9Var.t.getValue()).format(Long.valueOf(yk2.v(((qi9.b) qi9Var).u)));
                strB.getClass();
            }
            str2 = strB;
        }
        e(new kj9.c(str, str2));
        oy0.d(rhb.b(this), null, null, new nj9(this, null), 3);
        yk2.o(new k74(new oj9(pf9Var.b, this), new pj9(this, null)), rhb.b(this));
        yk2.o(new k74(de9Var.b, new tj9(this, null)), rhb.b(this));
        yk2.o(new k74(new rj9(td8Var.b, this), new sj9(this, null)), rhb.b(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(lj9 lj9Var, bc8 bc8Var, u02 u02Var) throws Throwable {
        uj9 uj9Var;
        Object obj;
        Object obj2;
        if (u02Var instanceof uj9) {
            uj9Var = (uj9) u02Var;
            int i = uj9Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                uj9Var.w = i - Integer.MIN_VALUE;
            } else {
                uj9Var = new uj9(lj9Var, u02Var);
            }
        } else {
            uj9Var = new uj9(lj9Var, u02Var);
        }
        Object objB = uj9Var.u;
        int i2 = uj9Var.w;
        if (i2 == 0) {
            dv8.b(objB);
            Integer num = bc8Var.u.t;
            yk4.a aVar = new yk4.a(num != null ? num.intValue() : -1);
            yk4 yk4Var = lj9Var.B;
            uj9Var.t = bc8Var;
            uj9Var.w = 1;
            yk4Var.getClass();
            objB = g5b.b(yk4Var, aVar, uj9Var);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bc8Var = uj9Var.t;
            dv8.b(objB);
        }
        Integer num2 = (Integer) yd3.e((xd3) objB, null);
        ArrayList arrayList = bc8Var.u.w;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            int i5 = ((h08) obj).t;
            if (num2 != null && i5 == num2.intValue()) {
                break;
            }
        }
        h08 h08Var = (h08) obj;
        if (h08Var == null) {
            int size2 = arrayList.size();
            do {
                if (i3 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i3);
                i3++;
            } while (!((h08) obj2).v);
            h08Var = (h08) obj2;
        }
        boolean z = bc8Var.E;
        yl2 yl2Var = yl2.t;
        yl2 yl2Var2 = yl2.u;
        yl2 yl2Var3 = z ? yl2Var2 : yl2Var;
        if (bc8Var.D) {
            yl2Var = yl2Var2;
        }
        lj9Var.e(new kj9.h(yl2Var, yl2Var3));
        lj9Var.e(new kj9.e(bc8Var));
        lj9Var.j(h08Var);
        Integer num3 = bc8Var.u.t;
        if (num3 != null) {
            yk2.o(new k74(lj9Var.D.b(new ef7.a(num3.intValue())), new qj9(lj9Var, null)), rhb.b(lj9Var));
        }
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    public static ArrayList k(int i, List list, boolean z, boolean z2) {
        ep1 ep1VarB;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s23 s23Var = (s23) it.next();
            ep1 ep1Var = s23Var instanceof ep1 ? (ep1) s23Var : null;
            if (ep1Var == null) {
                ep1VarB = null;
            } else {
                if (((ep1) s23Var).getId() != i) {
                    ep1Var = null;
                }
                if (ep1Var != null) {
                    ep1VarB = ep1Var.b(z, z2);
                } else {
                    ep1VarB = null;
                }
            }
            s23 s23Var2 = ep1VarB instanceof s23 ? (s23) ep1VarB : null;
            if (s23Var2 != null) {
                s23Var = s23Var2;
            }
            arrayList.add(s23Var);
        }
        return arrayList;
    }

    public static ArrayList l(gd8 gd8Var, List list) {
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        for (Object objD : list) {
            if (objD instanceof fd8) {
                fd8 fd8Var = (fd8) objD;
                int i = fd8Var.t;
                int i2 = gd8Var.a;
                if (i == i2) {
                    objD = fd8.d(fd8Var, i2, gd8Var.b, gd8Var.c, gd8Var.d, gd8Var.e, gd8Var.f, gd8Var.g, 2);
                }
            }
            arrayList.add(objD);
        }
        return arrayList;
    }

    @Override // defpackage.as2
    public final void E(m76 m76Var) {
        m76Var.getClass();
        this.L = true;
        rm0 rm0Var = this.M;
        if (rm0Var != null) {
            rm0Var.invoke();
            this.M = null;
        }
        m(b().a);
    }

    @Override // defpackage.dl0
    public final el0 d(bl0 bl0Var) {
        bl0Var.getClass();
        if (bl0Var instanceof kj9.g) {
            return xj9.a(b(), null, null, true, null, null, null, null, null, null, 1019);
        }
        if (bl0Var instanceof kj9.b) {
            return xj9.a(b(), null, null, false, null, null, null, null, null, null, 1019);
        }
        if (bl0Var instanceof kj9.f) {
            return xj9.a(b(), null, ((kj9.f) bl0Var).a, false, null, null, null, null, null, null, 1021);
        }
        if (bl0Var instanceof kj9.c) {
            kj9.c cVar = (kj9.c) bl0Var;
            return xj9.a(b(), null, null, false, cVar.a, cVar.b, null, null, null, null, 999);
        }
        if (bl0Var instanceof kj9.a) {
            xj9 xj9VarB = b();
            vz7.Companion.getClass();
            return xj9.a(xj9VarB, null, null, false, null, null, null, vz7.a.a(this.H), null, null, 959);
        }
        if (bl0Var instanceof kj9.e) {
            return xj9.a(b(), ((kj9.e) bl0Var).a, null, false, null, null, null, vz7.a(b().g), null, null, 958);
        }
        if (bl0Var instanceof kj9.d) {
            kj9.d dVar = (kj9.d) bl0Var;
            return xj9.a(b(), null, dVar.b, false, null, null, dVar.a, dVar.c, null, null, 925);
        }
        if (!(bl0Var instanceof kj9.h)) {
            return b();
        }
        kj9.h hVar = (kj9.h) bl0Var;
        return xj9.a(b(), null, null, false, null, null, null, null, hVar.a, hVar.b, 255);
    }

    public final void i(h08 h08Var) {
        h08Var.getClass();
        oy0.d(rhb.b(this), null, null, new c(h08Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [hf3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public final void j(h08 h08Var) {
        ?? arrayList;
        vz7 vz7VarA;
        bc8 bc8Var = b().a;
        h08 h08Var2 = null;
        Object obj = null;
        List<s23> list = bc8Var != null ? bc8Var.A : null;
        if (h08Var != null) {
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!(((s23) obj2) instanceof h08)) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    s23 s23Var = (s23) obj3;
                    if (!(s23Var instanceof r89) || ((r89) s23Var).a() == h08Var.t) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!(((s23) obj4) instanceof h08)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = hf3.t;
                }
            }
        } else if (list != null) {
            arrayList = new ArrayList();
            while (r0.hasNext()) {
                if (!(((s23) obj4) instanceof h08)) {
                    arrayList.add(obj4);
                }
            }
        } else {
            arrayList = hf3.t;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        bc8 bc8Var2 = b().a;
        if (bc8Var2 != null) {
            ArrayList arrayList3 = bc8Var2.u.w;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj5 = arrayList3.get(i2);
                i2++;
                if (((h08) obj5).v) {
                    obj = obj5;
                    break;
                }
            }
            h08Var2 = (h08) obj;
        }
        if (zIsEmpty && h08Var != null && !h08Var.v && h08Var2 != null) {
            boolean z = this.L;
            if (z) {
                i(h08Var2);
            } else {
                if (z) {
                    u.b();
                    return;
                }
                this.M = new rm0(1, this, h08Var2);
            }
        }
        if (zIsEmpty) {
            bu8 bu8Var = this.H;
            vz7VarA = new vz7(0, true, false, bu8Var.b(R.string.need_a_rest, new Object[0]), bu8Var.b(R.string.no_programs_in_calendar, new Object[0]), null, 97);
        } else {
            if (zIsEmpty) {
                u.b();
                return;
            }
            vz7VarA = vz7.a(b().g);
        }
        e96 e96VarF = ws0.f();
        if (h08Var != null) {
            bc8 bc8Var3 = b().a;
            if ((bc8Var3 != null ? bc8Var3.u.w.size() : 0) > 1) {
                e96VarF.add(h08Var);
            }
        }
        e96VarF.addAll(arrayList);
        e(new kj9.d(h08Var, ws0.e(e96VarF), vz7VarA));
    }

    public final void m(bc8 bc8Var) {
        tf0 tf0Var;
        if (bc8Var == null) {
            this.K = true;
            return;
        }
        boolean z = bc8Var.E;
        boolean z2 = bc8Var.D;
        if (z2 && z) {
            tf0Var = tf0.u;
        } else if (z) {
            tf0Var = tf0.v;
        } else {
            tf0Var = z2 ? tf0.t : tf0.w;
        }
        f(new ai9(tf0Var, this.J));
        this.K = false;
    }

    @Override // defpackage.as2
    public final void u(m76 m76Var) {
        this.L = false;
    }
}
