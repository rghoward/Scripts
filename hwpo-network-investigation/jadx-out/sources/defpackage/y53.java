package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y53 extends gw2 implements g58, nb5, ju1, mk4 {
    public fl7 J;
    public oh4<? super n58, Boolean> K;
    public boolean L;
    public h27 M;
    public nk4 N;
    public zx0 O;
    public d63 P;
    public boolean Q;
    public boolean R;
    public m53.a S;
    public m53.d T;
    public m53.c U;
    public m53.b V;
    public m53 W;
    public o1a X;
    public ura Z;
    public kb5 a0;
    public long Y = 9205357640488583168L;
    public long b0 = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m53.a.EnumC0198a.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {508, 510, 512, 519, 521, 524}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public gl8 t;
        public gl8 u;
        public int v;
        public /* synthetic */ Object w;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {515}, m = "invokeSuspend", v = 1)
        public static final class a extends p6a implements ci4<oh4<? super n53.b, ? extends g2b>, r02<? super g2b>, Object> {
            public gl8 t;
            public int u;
            public /* synthetic */ Object v;
            public final /* synthetic */ gl8<n53> w;
            public final /* synthetic */ y53 x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gl8<n53> gl8Var, y53 y53Var, r02<? super a> r02Var) {
                super(2, r02Var);
                this.w = gl8Var;
                this.x = y53Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                a aVar = new a(this.w, this.x, r02Var);
                aVar.v = obj;
                return aVar;
            }

            @Override // defpackage.ci4
            public final Object invoke(oh4<? super n53.b, ? extends g2b> oh4Var, r02<? super g2b> r02Var) {
                return ((a) create(oh4Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0028  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004b -> B:24:0x004e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0051 -> B:26:0x0052). Please report as a decompilation issue!!! */
            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                oh4 oh4Var;
                gl8<n53> gl8Var;
                n53 n53Var;
                T t;
                int i = this.u;
                if (i == 0) {
                    dv8.b(obj);
                    oh4Var = (oh4) this.v;
                    gl8Var = this.w;
                    n53Var = gl8Var.t;
                    if (!(n53Var instanceof n53.d) || (n53Var instanceof n53.a)) {
                        return g2b.a;
                    }
                    n53.b bVar = n53Var instanceof n53.b ? (n53.b) n53Var : null;
                    if (bVar != null) {
                        oh4Var.invoke(bVar);
                    }
                    zx0 zx0Var = this.x.O;
                    if (zx0Var != null) {
                        this.v = oh4Var;
                        this.t = gl8Var;
                        this.u = 1;
                        obj = zx0.K(zx0Var, this);
                        v72 v72Var = v72.t;
                        if (obj == v72Var) {
                            return v72Var;
                        }
                    } else {
                        t = 0;
                    }
                    gl8Var.t = t;
                    gl8Var = this.w;
                    n53Var = gl8Var.t;
                    if (n53Var instanceof n53.d) {
                    }
                    return g2b.a;
                }
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gl8Var = this.t;
                oh4Var = (oh4) this.v;
                dv8.b(obj);
                t = (n53) obj;
                gl8Var.t = t;
                gl8Var = this.w;
                n53Var = gl8Var.t;
                if (n53Var instanceof n53.d) {
                }
                return g2b.a;
            }
        }

        public b(r02<? super b> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = y53.this.new b(r02Var);
            bVar.w = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r0 r4
          0x0030: PHI (r0v11 gl8) = (r0v3 gl8), (r0v15 gl8) binds: [B:13:0x002d, B:36:0x00a6] A[DONT_GENERATE, DONT_INLINE]
          0x0030: PHI (r4v6 t72) = (r4v4 t72), (r4v7 t72) binds: [B:13:0x002d, B:36:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:19:0x0054 A[PHI: r5
          0x0054: PHI (r5v7 t72) = (r5v0 t72), (r5v3 t72), (r5v3 t72), (r5v3 t72), (r5v5 t72), (r5v8 t72) binds: [B:18:0x004c, B:45:0x00c3, B:47:0x00d0, B:41:0x00bc, B:30:0x0080, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x005a  */
        /* JADX WARN: Code duplicated, block: B:23:0x0063  */
        /* JADX WARN: Code duplicated, block: B:26:0x0074  */
        /* JADX WARN: Code duplicated, block: B:31:0x0082  */
        /* JADX WARN: Code duplicated, block: B:34:0x0094  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c1 A[Catch: CancellationException -> 0x00bf, TryCatch #0 {CancellationException -> 0x00bf, blocks: (B:38:0x00a9, B:40:0x00af, B:44:0x00c1, B:46:0x00c5), top: B:55:0x00a9 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: CancellationException -> 0x00bf, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00bf, blocks: (B:38:0x00a9, B:40:0x00af, B:44:0x00c1, B:46:0x00c5), top: B:55:0x00a9 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0080 -> B:19:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bc -> B:19:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c3 -> B:19:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d0 -> B:19:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00de -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.ak0
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: y53.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public y53(oh4<? super n58, Boolean> oh4Var, boolean z, h27 h27Var, fl7 fl7Var) {
        this.J = fl7Var;
        this.K = oh4Var;
        this.L = z;
        this.M = h27Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f2(y53 y53Var, u02 u02Var) throws Throwable {
        z53 z53Var;
        if (u02Var instanceof z53) {
            z53Var = (z53) u02Var;
            int i = z53Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                z53Var.v = i - Integer.MIN_VALUE;
            } else {
                z53Var = new z53(y53Var, u02Var);
            }
        } else {
            z53Var = new z53(y53Var, u02Var);
        }
        Object obj = z53Var.t;
        int i2 = z53Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            d63 d63Var = y53Var.P;
            if (d63Var != null) {
                h27 h27Var = y53Var.M;
                if (h27Var != null) {
                    c63 c63Var = new c63(d63Var);
                    z53Var.v = 1;
                    Object objC = h27Var.c(c63Var, z53Var);
                    v72 v72Var = v72.t;
                    if (objC == v72Var) {
                        return v72Var;
                    }
                }
            }
            y53Var.p2(new n53.d(0L, false));
            return g2b.a;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        y53Var.P = null;
        y53Var.p2(new n53.d(0L, false));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g2(y53 y53Var, n53.c cVar, u02 u02Var) throws Throwable {
        a63 a63Var;
        h27 h27Var;
        d63 d63Var;
        n53.c cVar2;
        d63 d63Var2;
        if (u02Var instanceof a63) {
            a63Var = (a63) u02Var;
            int i = a63Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                a63Var.x = i - Integer.MIN_VALUE;
            } else {
                a63Var = new a63(y53Var, u02Var);
            }
        } else {
            a63Var = new a63(y53Var, u02Var);
        }
        Object obj = a63Var.v;
        int i2 = a63Var.x;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(obj);
            d63 d63Var3 = y53Var.P;
            if (d63Var3 != null && (h27Var = y53Var.M) != null) {
                c63 c63Var = new c63(d63Var3);
                a63Var.t = cVar;
                a63Var.x = 1;
                if (h27Var.c(c63Var, a63Var) != v72Var) {
                }
                return v72Var;
            }
            y53Var.P = d63Var;
            y53Var.o2(cVar.a);
            return g2b.a;
        }
        if (i2 == 1) {
            cVar = a63Var.t;
            dv8.b(obj);
        } else {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d63Var2 = a63Var.u;
            cVar2 = a63Var.t;
            dv8.b(obj);
        }
        d63Var = d63Var2;
        cVar = cVar2;
        y53Var.P = d63Var;
        y53Var.o2(cVar.a);
        return g2b.a;
        d63Var = new d63();
        h27 h27Var2 = y53Var.M;
        if (h27Var2 != null) {
            a63Var.t = cVar;
            a63Var.u = d63Var;
            a63Var.x = 2;
            if (h27Var2.c(d63Var, a63Var) != v72Var) {
                cVar2 = cVar;
                d63Var2 = d63Var;
                d63Var = d63Var2;
                cVar = cVar2;
            }
            return v72Var;
        }
        y53Var.P = d63Var;
        y53Var.o2(cVar.a);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h2(y53 y53Var, n53.d dVar, u02 u02Var) throws Throwable {
        b63 b63Var;
        if (u02Var instanceof b63) {
            b63Var = (b63) u02Var;
            int i = b63Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                b63Var.w = i - Integer.MIN_VALUE;
            } else {
                b63Var = new b63(y53Var, u02Var);
            }
        } else {
            b63Var = new b63(y53Var, u02Var);
        }
        Object obj = b63Var.u;
        int i2 = b63Var.w;
        if (i2 == 0) {
            dv8.b(obj);
            d63 d63Var = y53Var.P;
            if (d63Var != null) {
                h27 h27Var = y53Var.M;
                if (h27Var != null) {
                    e63 e63Var = new e63(d63Var);
                    b63Var.t = dVar;
                    b63Var.w = 1;
                    Object objC = h27Var.c(e63Var, b63Var);
                    v72 v72Var = v72.t;
                    if (objC == v72Var) {
                        return v72Var;
                    }
                }
            }
            y53Var.p2(dVar);
            return g2b.a;
        }
        if (i2 != 1) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dVar = b63Var.t;
        dv8.b(obj);
        y53Var.P = null;
        y53Var.p2(dVar);
        return g2b.a;
    }

    public static void m2(y53 y53Var, a58 a58Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        m53.c cVar = y53Var.U;
        if (cVar == null) {
            cVar = new m53.c();
            cVar.a = null;
            cVar.b = Long.MAX_VALUE;
            cVar.c = false;
            y53Var.U = cVar;
        }
        cVar.a = a58Var;
        cVar.b = j;
        ura uraVar = y53Var.Z;
        fl7 fl7Var = y53Var.J;
        if (uraVar == null) {
            y53Var.Z = new ura(fl7Var);
        } else {
            uraVar.a = fl7Var;
            uraVar.b = j2;
        }
        cVar.c = false;
        y53Var.W = cVar;
    }

    @Override // defpackage.mk4
    public final boolean L0(a58 a58Var) {
        if (z69.e(a58Var)) {
            return this.L;
        }
        if (!z69.g(a58Var)) {
            if (this.Z == null) {
                this.Z = new ura(this.J);
            }
            float f = ((lgb) ku1.a(this, qu1.t)).f();
            long j = z69.j(a58Var, false);
            ura uraVar = this.Z;
            if (uraVar == null) {
                z90.a("Touch slop detector not initialized.");
                return false;
            }
            if (!vf7.b(uraVar.a(j, f, false), 9205357640488583168L)) {
                long jE = vf7.e(uraVar.b, j);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jE & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jE >> 32))))) * 180.0f)) / 3.141592653589793d;
                fl7 fl7Var = uraVar.a;
                int i = fl7Var == null ? -1 : ura.a.a[fl7Var.ordinal()];
                if (i == 1 ? dAtan2 < 30.0d : !(i != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ox6.c
    public final void V1() {
        this.Q = false;
        i2();
        this.b0 = 0L;
        nk4 nk4Var = this.N;
        if (nk4Var != null) {
            d2(nk4Var);
        }
        this.N = null;
    }

    @Override // defpackage.nb5
    public final void X0() {
        kb5 kb5Var = this.a0;
        if (kb5Var != null) {
            kb5Var.a();
            y53 y53Var = kb5Var.a;
            if (y53Var.Q) {
                y53Var.n2(n53.a.a);
            }
            kb5Var.g = null;
            dg7 dg7Var = kb5Var.k;
            dg7Var.a = 0;
            dg7Var.b.b = 0;
        }
    }

    @Override // defpackage.nb5
    public final void b0(to toVar, s48 s48Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i = toVar.b;
        ArrayList arrayList = toVar.a;
        if (this.N == null) {
            nk4 nk4Var = new nk4(this);
            c2(nk4Var);
            this.N = nk4Var;
        }
        if (this.L) {
            if (this.a0 == null) {
                this.a0 = new kb5(this);
            }
            kb5 kb5Var = this.a0;
            if (kb5Var != null) {
                y53 y53Var = kb5Var.a;
                if (kb5Var.f == null) {
                    kb5.a.C0190a c0190a = kb5Var.b;
                    if (c0190a == null) {
                        c0190a = new kb5.a.C0190a(0);
                        kb5Var.b = c0190a;
                    }
                    kb5Var.f = c0190a;
                }
                kb5.a aVar = kb5Var.f;
                if (aVar == null) {
                    z90.a("currentDragState should not be null");
                    return;
                }
                boolean z = aVar instanceof kb5.a.C0190a;
                s48 s48Var2 = s48.t;
                boolean z2 = true;
                s48 s48Var3 = s48.u;
                if (z) {
                    kb5.a.C0190a c0190a2 = (kb5.a.C0190a) aVar;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!lb5.d((jb5) arrayList.get(i2))) {
                            return;
                        }
                    }
                    jb5 jb5Var = (jb5) th1.y(arrayList);
                    int i3 = kb5.b.a[c0190a2.a.ordinal()];
                    kb5.a.C0190a.EnumC0191a enumC0191a = kb5.a.C0190a.EnumC0191a.u;
                    kb5.a.C0190a.EnumC0191a enumC0191a2 = kb5.a.C0190a.EnumC0191a.t;
                    kb5.a.C0190a.EnumC0191a enumC0191a3 = i3 == 1 ? !y53Var.u2() ? enumC0191a2 : enumC0191a : c0190a2.a;
                    c0190a2.a = enumC0191a3;
                    if (s48Var == s48Var2 && enumC0191a3 == enumC0191a) {
                        jb5Var.i = true;
                        c0190a2.b = true;
                    }
                    if (s48Var == s48Var3) {
                        if (enumC0191a3 == enumC0191a2) {
                            kb5.c(kb5Var, jb5Var, jb5Var.a, 0L, 12);
                            return;
                        }
                        if (c0190a2.b) {
                            kb5Var.f(jb5Var, jb5Var, new ib5(i), 0L);
                            kb5Var.e(jb5Var, new ib5(i), 0L);
                            long j = jb5Var.a;
                            kb5.a.d dVar = kb5Var.c;
                            if (dVar == null) {
                                dVar = new kb5.a.d();
                                dVar.a = Long.MAX_VALUE;
                                kb5Var.c = dVar;
                            }
                            dVar.a = j;
                            kb5Var.f = dVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = aVar instanceof kb5.a.c;
                s48 s48Var4 = s48.v;
                if (!z3) {
                    if (aVar instanceof kb5.a.b) {
                        kb5.a.b bVar = (kb5.a.b) aVar;
                        if (s48Var != s48Var4) {
                            return;
                        }
                        int size2 = arrayList.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            if (((jb5) arrayList.get(i4)).i) {
                                z2 = false;
                                break;
                            }
                        }
                        int size3 = arrayList.size();
                        for (int i5 = 0; i5 < size3; i5++) {
                            if (((jb5) arrayList.get(i5)).d) {
                                if (arrayList.isEmpty()) {
                                    break;
                                }
                                if (z2) {
                                    long jF = lb5.f((jb5) th1.y(arrayList), y53Var.J, new ib5(i));
                                    jb5 jb5Var2 = bVar.a;
                                    jb5Var2.getClass();
                                    long jD = vf7.d(jF, lb5.f(jb5Var2, y53Var.J, new ib5(i)));
                                    jb5 jb5Var3 = bVar.a;
                                    if (jb5Var3 != null) {
                                        kb5.c(kb5Var, jb5Var3, bVar.b, jD, 8);
                                        return;
                                    } else {
                                        z90.a("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        kb5Var.a();
                        return;
                    }
                    if (!(aVar instanceof kb5.a.d)) {
                        u.b();
                        return;
                    }
                    kb5.a.d dVar2 = (kb5.a.d) aVar;
                    if (s48Var != s48Var3) {
                        return;
                    }
                    long j2 = dVar2.a;
                    int size4 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i6);
                        if (zj7.a(((jb5) obj).a, j2)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    jb5 jb5Var4 = (jb5) obj;
                    if (jb5Var4 == null) {
                        return;
                    }
                    if (!lb5.c(jb5Var4)) {
                        if (jb5Var4.i) {
                            y53Var.n2(n53.a.a);
                            return;
                        } else {
                            if (vf7.c(lb5.e(jb5Var4, y53Var.J, new ib5(i), true)) == 0.0f) {
                                return;
                            }
                            kb5Var.e(jb5Var4, new ib5(i), lb5.e(jb5Var4, y53Var.J, new ib5(i), false));
                            jb5Var4.i = true;
                            return;
                        }
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i7);
                        if (((jb5) obj2).d) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    jb5 jb5Var5 = (jb5) obj2;
                    if (jb5Var5 != null) {
                        dVar2.a = jb5Var5.a;
                        return;
                    }
                    if (jb5Var4.i || !lb5.c(jb5Var4)) {
                        y53Var.n2(n53.a.a);
                    } else {
                        lb5.b(kb5Var.d(), jb5Var4, y53Var.J, new ib5(i), kb5Var.j, kb5Var.l);
                        float fE = ((lgb) ku1.a(y53Var, qu1.t)).e();
                        long jC = kb5Var.d().c(sdb.a(fE, fE));
                        jv2 jv2Var = (jv2) kb5Var.d().a;
                        tdb tdbVar = jv2Var.a;
                        df2[] df2VarArr = tdbVar.d;
                        gz3.m(0, df2VarArr.length, null, df2VarArr);
                        tdbVar.e = 0;
                        tdb tdbVar2 = jv2Var.b;
                        df2[] df2VarArr2 = tdbVar2.d;
                        gz3.m(0, df2VarArr2.length, null, df2VarArr2);
                        tdbVar2.e = 0;
                        jv2Var.c = 0L;
                        y53Var.n2(new n53.d(m63.a(jC), true));
                    }
                    kb5Var.a();
                    return;
                }
                kb5.a.c cVar = (kb5.a.c) aVar;
                if (s48Var == s48Var2) {
                    return;
                }
                int size6 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i8);
                    if (zj7.a(((jb5) obj3).a, cVar.b)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                jb5 jb5Var6 = (jb5) obj3;
                if (jb5Var6 == null) {
                    int size7 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj5 = null;
                            break;
                        }
                        obj5 = arrayList.get(i9);
                        if (((jb5) obj5).d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    jb5Var6 = (jb5) obj5;
                    if (jb5Var6 == null) {
                        kb5Var.a();
                        return;
                    }
                    cVar.b = jb5Var6.a;
                }
                jb5 jb5Var7 = jb5Var6;
                if (s48Var == s48Var3) {
                    if (jb5Var7.i) {
                        jb5 jb5Var8 = cVar.a;
                        if (jb5Var8 == null) {
                            z90.a("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j3 = cVar.b;
                        ura uraVar = kb5Var.i;
                        if (uraVar == null) {
                            z90.a("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        kb5Var.b(jb5Var8, j3, uraVar);
                    } else if (lb5.c(jb5Var7)) {
                        int size8 = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size8) {
                                obj4 = null;
                                break;
                            }
                            Object obj6 = arrayList.get(i10);
                            if (((jb5) obj6).d) {
                                obj4 = obj6;
                                break;
                            }
                            i10++;
                        }
                        jb5 jb5Var9 = (jb5) obj4;
                        if (jb5Var9 == null) {
                            kb5Var.a();
                        } else {
                            cVar.b = jb5Var9.a;
                        }
                    } else {
                        lgb lgbVar = (lgb) ku1.a(y53Var, qu1.t);
                        float f = x53.a;
                        float f2 = lgbVar.f();
                        ura uraVar2 = kb5Var.i;
                        if (uraVar2 == null) {
                            z90.a("Touch slop detector not initialized.");
                            return;
                        }
                        long jA = uraVar2.a(lb5.e(jb5Var7, y53Var.J, new ib5(i), true), f2, true);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            jb5Var7.i = true;
                            jb5 jb5Var10 = cVar.a;
                            jb5Var10.getClass();
                            kb5Var.f(jb5Var10, jb5Var7, new ib5(i), jA);
                            kb5Var.e(jb5Var7, new ib5(i), jA);
                            long j4 = jb5Var7.a;
                            kb5.a.d dVar3 = kb5Var.c;
                            if (dVar3 == null) {
                                dVar3 = new kb5.a.d();
                                dVar3.a = Long.MAX_VALUE;
                                kb5Var.c = dVar3;
                            }
                            dVar3.a = j4;
                            kb5Var.f = dVar3;
                        } else {
                            cVar.c = true;
                        }
                    }
                }
                if (s48Var == s48Var4 && cVar.c) {
                    if (!jb5Var7.i) {
                        cVar.c = false;
                        return;
                    }
                    jb5 jb5Var11 = cVar.a;
                    if (jb5Var11 == null) {
                        z90.a("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = cVar.b;
                    ura uraVar3 = kb5Var.i;
                    if (uraVar3 != null) {
                        kb5Var.b(jb5Var11, j5, uraVar3);
                    } else {
                        z90.a("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    public void c0(r48 r48Var, s48 s48Var, long j) {
        a58 a58Var;
        a58 a58Var2;
        a58 a58Var3;
        a58 a58Var4;
        a58 a58Var5;
        boolean z = true;
        this.R = true;
        if (this.N == null) {
            nk4 nk4Var = new nk4(this);
            c2(nk4Var);
            this.N = nk4Var;
        }
        if (this.L) {
            if (this.W == null) {
                m53.a aVar = this.S;
                if (aVar == null) {
                    aVar = new m53.a(0);
                    this.S = aVar;
                }
                this.W = aVar;
            }
            m53 m53Var = this.W;
            if (m53Var == null) {
                z90.a("currentDragState should not be null");
                return;
            }
            boolean z2 = m53Var instanceof m53.a;
            s48 s48Var2 = s48.t;
            s48 s48Var3 = s48.u;
            if (z2) {
                m53.a aVar2 = (m53.a) m53Var;
                if (!r48Var.a.isEmpty() && o8a.e(r48Var, false)) {
                    a58 a58Var6 = (a58) th1.y(r48Var.a);
                    int i = a.a[aVar2.a.ordinal()];
                    m53.a.EnumC0198a enumC0198a = m53.a.EnumC0198a.u;
                    m53.a.EnumC0198a enumC0198a2 = m53.a.EnumC0198a.t;
                    m53.a.EnumC0198a enumC0198a3 = i == 1 ? !u2() ? enumC0198a2 : enumC0198a : aVar2.a;
                    aVar2.a = enumC0198a3;
                    if (s48Var == s48Var2 && enumC0198a3 == enumC0198a) {
                        a58Var6.a();
                        aVar2.b = true;
                    }
                    if (s48Var == s48Var3) {
                        if (enumC0198a3 == enumC0198a2) {
                            m2(this, a58Var6, a58Var6.a, 0L, 12);
                            return;
                        }
                        if (aVar2.b) {
                            t2(a58Var6, a58Var6, 0L);
                            s2(0L, a58Var6);
                            long j2 = a58Var6.a;
                            m53.d dVar = this.T;
                            if (dVar == null) {
                                dVar = new m53.d();
                                dVar.a = Long.MAX_VALUE;
                                this.T = dVar;
                            }
                            dVar.a = j2;
                            this.W = dVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z3 = m53Var instanceof m53.c;
            s48 s48Var4 = s48.v;
            if (!z3) {
                if (m53Var instanceof m53.b) {
                    m53.b bVar = (m53.b) m53Var;
                    if (s48Var != s48Var4) {
                        return;
                    }
                    List<a58> list = r48Var.a;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (list.get(i2).b()) {
                            z = false;
                            break;
                        }
                    }
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        if (list.get(i3).d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long j3 = ((a58) th1.y(list)).c;
                                a58 a58Var7 = bVar.a;
                                a58Var7.getClass();
                                long jD = vf7.d(j3, a58Var7.c);
                                a58 a58Var8 = bVar.a;
                                if (a58Var8 != null) {
                                    m2(this, a58Var8, bVar.b, jD, 8);
                                    return;
                                } else {
                                    z90.a("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    k2();
                    return;
                }
                if (!(m53Var instanceof m53.d)) {
                    u.b();
                    return;
                }
                m53.d dVar2 = (m53.d) m53Var;
                if (s48Var != s48Var3) {
                    return;
                }
                long j4 = dVar2.a;
                List<a58> list2 = r48Var.a;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        a58Var = null;
                        break;
                    }
                    a58Var = list2.get(i4);
                    if (zj7.a(a58Var.a, j4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                a58 a58Var9 = a58Var;
                if (a58Var9 == null) {
                    return;
                }
                if (!z69.g(a58Var9)) {
                    if (a58Var9.b()) {
                        q2().n(n53.a.a);
                        return;
                    } else {
                        if (vf7.c(z69.j(a58Var9, true)) == 0.0f) {
                            return;
                        }
                        s2(z69.j(a58Var9, false), a58Var9);
                        a58Var9.a();
                        return;
                    }
                }
                List<a58> list3 = r48Var.a;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        a58Var2 = null;
                        break;
                    }
                    a58Var2 = list3.get(i5);
                    if (a58Var2.d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                a58 a58Var10 = a58Var2;
                if (a58Var10 != null) {
                    dVar2.a = a58Var10.a;
                    return;
                }
                if (a58Var9.b() || !z69.g(a58Var9)) {
                    q2().n(n53.a.a);
                } else {
                    oj5.b(r2(), a58Var9, 0L);
                    float fE = ((lgb) ku1.a(this, qu1.t)).e();
                    long jC = r2().c(sdb.a(fE, fE));
                    jv2 jv2Var = (jv2) r2().a;
                    tdb tdbVar = jv2Var.a;
                    df2[] df2VarArr = tdbVar.d;
                    gz3.m(0, df2VarArr.length, null, df2VarArr);
                    tdbVar.e = 0;
                    tdb tdbVar2 = jv2Var.b;
                    df2[] df2VarArr2 = tdbVar2.d;
                    gz3.m(0, df2VarArr2.length, null, df2VarArr2);
                    tdbVar2.e = 0;
                    jv2Var.c = 0L;
                    q2().n(new n53.d(m63.a(jC), false));
                    this.R = false;
                }
                k2();
                return;
            }
            m53.c cVar = (m53.c) m53Var;
            if (s48Var == s48Var2) {
                return;
            }
            List<a58> list4 = r48Var.a;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    a58Var3 = null;
                    break;
                }
                a58Var3 = list4.get(i6);
                int i7 = size5;
                if (zj7.a(a58Var3.a, cVar.b)) {
                    break;
                }
                i6++;
                size5 = i7;
            }
            a58 a58Var11 = a58Var3;
            if (a58Var11 == null) {
                int size6 = list4.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        a58Var5 = null;
                        break;
                    }
                    a58Var5 = list4.get(i8);
                    if (a58Var5.d) {
                        break;
                    } else {
                        i8++;
                    }
                }
                a58Var11 = a58Var5;
                if (a58Var11 == null) {
                    k2();
                    return;
                }
                cVar.b = a58Var11.a;
            }
            if (s48Var == s48Var3) {
                if (a58Var11.b()) {
                    a58 a58Var12 = cVar.a;
                    if (a58Var12 == null) {
                        z90.a("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = cVar.b;
                    ura uraVar = this.Z;
                    if (uraVar == null) {
                        z90.a("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    l2(a58Var12, j5, uraVar);
                } else if (z69.g(a58Var11)) {
                    int size7 = list4.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            a58Var4 = null;
                            break;
                        }
                        a58 a58Var13 = list4.get(i9);
                        if (a58Var13.d) {
                            a58Var4 = a58Var13;
                            break;
                        }
                        i9++;
                    }
                    a58 a58Var14 = a58Var4;
                    if (a58Var14 == null) {
                        k2();
                    } else {
                        cVar.b = a58Var14.a;
                    }
                } else {
                    float fG = x53.g((lgb) ku1.a(this, qu1.t), a58Var11.i);
                    ura uraVar2 = this.Z;
                    if (uraVar2 == null) {
                        z90.a("Touch slop detector not initialized.");
                        return;
                    }
                    long jA = uraVar2.a(z69.j(a58Var11, true), fG, true);
                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                        boolean zL0 = L0(a58Var11);
                        txa txaVarA = yx.a(this, nk4.I);
                        nk4 nk4Var2 = txaVarA instanceof nk4 ? (nk4) txaVarA : null;
                        mk4 mk4Var = nk4Var2 != null ? nk4Var2.H : null;
                        boolean z4 = mk4Var != null && mk4Var.L0(a58Var11);
                        if (zL0 || !z4) {
                            a58Var11.a();
                            a58 a58Var15 = cVar.a;
                            a58Var15.getClass();
                            t2(a58Var15, a58Var11, jA);
                            s2(jA, a58Var11);
                            long j6 = a58Var11.a;
                            m53.d dVar3 = this.T;
                            if (dVar3 == null) {
                                dVar3 = new m53.d();
                                dVar3.a = Long.MAX_VALUE;
                                this.T = dVar3;
                            }
                            dVar3.a = j6;
                            this.W = dVar3;
                        } else {
                            cVar.c = true;
                        }
                    } else {
                        cVar.c = true;
                    }
                }
            }
            if (s48Var == s48Var4 && cVar.c) {
                if (!a58Var11.b()) {
                    cVar.c = false;
                    return;
                }
                a58 a58Var16 = cVar.a;
                if (a58Var16 == null) {
                    z90.a("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = cVar.b;
                ura uraVar3 = this.Z;
                if (uraVar3 != null) {
                    l2(a58Var16, j7, uraVar3);
                } else {
                    z90.a("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    @Override // defpackage.mk4
    public final boolean h0(jb5 jb5Var) {
        return lb5.d(jb5Var) && this.L;
    }

    public final void i2() {
        d63 d63Var = this.P;
        if (d63Var != null) {
            h27 h27Var = this.M;
            if (h27Var != null) {
                h27Var.b(new c63(d63Var));
            }
            this.P = null;
        }
    }

    public abstract Object j2(b.a aVar, b bVar);

    public final void k2() {
        m53.a aVar = this.S;
        if (aVar == null) {
            aVar = new m53.a(0);
            this.S = aVar;
        }
        aVar.a = m53.a.EnumC0198a.v;
        aVar.b = false;
        this.W = aVar;
    }

    public final void l2(a58 a58Var, long j, ura uraVar) {
        m53.b bVar = this.V;
        if (bVar == null) {
            bVar = new m53.b();
            bVar.a = null;
            bVar.b = Long.MAX_VALUE;
            this.V = bVar;
        }
        bVar.a = a58Var;
        bVar.b = j;
        uraVar.b = 0L;
        this.W = bVar;
    }

    public final void n2(n53 n53Var) {
        if ((n53Var instanceof n53.c) && !this.Q) {
            this.Q = true;
            v2();
        }
        q2().n(n53Var);
    }

    public abstract void o2(long j);

    public abstract void p2(n53.d dVar);

    public final p91<n53> q2() {
        zx0 zx0Var = this.O;
        if (zx0Var != null) {
            return zx0Var;
        }
        z90.a("Events channel not initialized.");
        return null;
    }

    public final o1a r2() {
        o1a o1aVar = this.X;
        if (o1aVar != null) {
            return o1aVar;
        }
        z90.a("Velocity Tracker not initialized.");
        return null;
    }

    public final void s2(long j, a58 a58Var) {
        long jF = ew2.e(this.t).f(0L);
        if (!vf7.b(this.Y, 9205357640488583168L) && !vf7.b(jF, this.Y)) {
            this.b0 = vf7.e(this.b0, vf7.d(jF, this.Y));
        }
        this.Y = jF;
        oj5.b(r2(), a58Var, this.b0);
        q2().n(new n53.b(j, false));
    }

    @Override // defpackage.g58
    public final void t0() {
        if (this.R) {
            k2();
            if (this.Q) {
                q2().n(n53.a.a);
            }
            this.X = null;
        }
        this.R = false;
    }

    public final void t2(a58 a58Var, a58 a58Var2, long j) {
        if (this.X == null) {
            this.X = new o1a();
        }
        oj5.b(r2(), a58Var, 0L);
        long jD = vf7.d(a58Var2.c, j);
        this.b0 = 0L;
        if (this.K.invoke(new n58(a58Var.i)).booleanValue()) {
            if (!this.Q) {
                if (this.O == null) {
                    this.O = da1.a(Integer.MAX_VALUE, 6, null);
                }
                v2();
            }
            this.Y = ew2.e(this).f(0L);
            q2().n(new n53.c(jD));
        }
    }

    public abstract boolean u2();

    public final void v2() {
        this.Q = true;
        if (this.O == null) {
            this.O = da1.a(Integer.MAX_VALUE, 6, null);
        }
        oy0.d(Q1(), null, null, new b(null), 3);
    }

    public final void w2(oh4<? super n58, Boolean> oh4Var, boolean z, h27 h27Var, fl7 fl7Var, boolean z2) {
        this.K = oh4Var;
        boolean z3 = true;
        if (this.L != z) {
            this.L = z;
            if (!z) {
                i2();
                this.a0 = null;
            }
            z2 = true;
        }
        if (!xj5.a(this.M, h27Var)) {
            i2();
            this.M = h27Var;
        }
        if (this.J != fl7Var) {
            this.J = fl7Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            if (this.R) {
                k2();
                if (this.Q) {
                    q2().n(n53.a.a);
                }
                this.X = null;
            }
            kb5 kb5Var = this.a0;
            if (kb5Var != null) {
                kb5Var.a();
                y53 y53Var = kb5Var.a;
                if (y53Var.Q) {
                    y53Var.n2(n53.a.a);
                }
                kb5Var.g = null;
                dg7 dg7Var = kb5Var.k;
                dg7Var.a = 0;
                dg7Var.b.b = 0;
            }
        }
    }
}
