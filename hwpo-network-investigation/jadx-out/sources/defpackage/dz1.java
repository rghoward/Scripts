package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dz1 extends ox6.c implements ju1, ml6 {
    public fl7 H;
    public final z79 I;
    public boolean J;
    public pw0 K;
    public final vf6 L;
    public boolean N;
    public boolean P;
    public final ew0 M = new ew0();
    public long O = -1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final nw0.a.C0207a a;
        public final e41 b;

        public a(nw0.a.C0207a c0207a, e41 e41Var) {
            this.a = c0207a;
            this.b = e41Var;
        }

        public final String toString() {
            e41 e41Var = this.b;
            StringBuilder sb = new StringBuilder("Request@");
            int iHashCode = hashCode();
            ta1.a(16);
            String string = Integer.toString(iHashCode, 16);
            string.getClass();
            sb.append(string);
            sb.append("(currentBounds()=");
            sb.append(this.a.invoke());
            sb.append(", continuation=");
            sb.append(e41Var);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {212}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ r3b w;
        public final /* synthetic */ pw0 x;
        public final /* synthetic */ long y;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {219}, m = "invokeSuspend", v = 1)
        public static final class a extends p6a implements ci4<k97, r02<? super g2b>, Object> {
            public int t;
            public /* synthetic */ Object u;
            public final /* synthetic */ r3b v;
            public final /* synthetic */ dz1 w;
            public final /* synthetic */ pw0 x;
            public final /* synthetic */ long y;
            public final /* synthetic */ el5 z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r3b r3bVar, dz1 dz1Var, pw0 pw0Var, long j, el5 el5Var, r02<? super a> r02Var) {
                super(2, r02Var);
                this.v = r3bVar;
                this.w = dz1Var;
                this.x = pw0Var;
                this.y = j;
                this.z = el5Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                a aVar = new a(this.v, this.w, this.x, this.y, this.z, r02Var);
                aVar.u = obj;
                return aVar;
            }

            @Override // defpackage.ci4
            public final Object invoke(k97 k97Var, r02<? super g2b> r02Var) {
                return ((a) create(k97Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [ez1] */
            /* JADX WARN: Type inference failed for: r7v3, types: [fz1] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.t;
                if (i == 0) {
                    dv8.b(obj);
                    k97 k97Var = (k97) this.u;
                    long j = this.y;
                    final dz1 dz1Var = this.w;
                    final pw0 pw0Var = this.x;
                    float fC2 = dz1.c2(dz1Var, pw0Var, j);
                    final r3b r3bVar = this.v;
                    r3bVar.e = fC2;
                    ?? r2 = new oh4(r3bVar, this.z, k97Var) { // from class: ez1
                        public final /* synthetic */ el5 u;
                        public final /* synthetic */ k97 v;

                        {
                            this.u = el5Var;
                            this.v = k97Var;
                        }

                        @Override // defpackage.oh4
                        public final Object invoke(Object obj2) {
                            float fFloatValue = ((Float) obj2).floatValue();
                            dz1 dz1Var2 = this.t;
                            float f = dz1Var2.J ? 1.0f : -1.0f;
                            z79 z79Var = dz1Var2.I;
                            float fG = z79Var.g(z79Var.e(this.v.a(z79Var.e(z79Var.h(f * fFloatValue))))) * f;
                            if (Math.abs(fG) < Math.abs(fFloatValue)) {
                                CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                                cancellationException.initCause(null);
                                this.u.k(cancellationException);
                            }
                            return g2b.a;
                        }
                    };
                    ?? r7 = new mh4() { // from class: fz1
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            sk8 sk8Var;
                            dz1 dz1Var2 = dz1Var;
                            ew0 ew0Var = dz1Var2.M;
                            while (true) {
                                k37<dz1.a> k37Var = ew0Var.a;
                                int i2 = k37Var.v;
                                if (i2 == 0) {
                                    break;
                                }
                                if (i2 == 0) {
                                    px1.b("MutableVector is empty.");
                                    return null;
                                }
                                sk8 sk8Var2 = (sk8) k37Var.t[i2 - 1].a.invoke();
                                if (!(sk8Var2 == null ? true : dz1.e2(dz1Var2, sk8Var2, 0L, 0L, 3))) {
                                    break;
                                }
                                k37<dz1.a> k37Var2 = ew0Var.a;
                                k37Var2.o(k37Var2.v - 1).b.resumeWith(g2b.a);
                            }
                            if (dz1Var2.N && (sk8Var = (sk8) dz1Var2.L.invoke()) != null && dz1.e2(dz1Var2, sk8Var, 0L, 0L, 3)) {
                                dz1Var2.N = false;
                            }
                            r3bVar.e = dz1.c2(dz1Var2, pw0Var, 0L);
                            return g2b.a;
                        }
                    };
                    this.t = 1;
                    Object objA = r3bVar.a(r2, r7, this);
                    v72 v72Var = v72.t;
                    if (objA == v72Var) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r3b r3bVar, pw0 pw0Var, long j, r02<? super b> r02Var) {
            super(2, r02Var);
            this.w = r3bVar;
            this.x = pw0Var;
            this.y = j;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = dz1.this.new b(this.w, this.x, this.y, r02Var);
            bVar.u = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dz1 dz1Var = dz1.this;
            ew0 ew0Var = dz1Var.M;
            int i = this.t;
            try {
                try {
                    if (i == 0) {
                        dv8.b(obj);
                        el5 el5VarE = sd.e(((t72) this.u).getCoroutineContext());
                        dz1Var.P = true;
                        z79 z79Var = dz1Var.I;
                        o37 o37Var = o37.t;
                        a aVar = new a(this.w, dz1Var, this.x, this.y, el5VarE, null);
                        this.t = 1;
                        Object objF = z79Var.f(o37Var, aVar, this);
                        v72 v72Var = v72.t;
                        if (objF == v72Var) {
                            return v72Var;
                        }
                    } else {
                        if (i != 1) {
                            aa0.c("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dv8.b(obj);
                    }
                    ew0Var.b();
                    dz1Var.P = false;
                    ew0Var.a(null);
                    dz1Var.N = false;
                    return g2b.a;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                dz1Var.P = false;
                ew0Var.a(null);
                dz1Var.N = false;
                throw th;
            }
        }
    }

    public dz1(fl7 fl7Var, z79 z79Var, boolean z, pw0 pw0Var, vf6 vf6Var) {
        this.H = fl7Var;
        this.I = z79Var;
        this.J = z;
        this.K = pw0Var;
        this.L = vf6Var;
    }

    public static final float c2(dz1 dz1Var, pw0 pw0Var, long j) {
        float f;
        sk8 sk8Var;
        int iCompare;
        long j2 = dz1Var.O;
        k37<a> k37Var = dz1Var.M.a;
        int i = k37Var.v - 1;
        a[] aVarArr = k37Var.t;
        if (i < aVarArr.length) {
            sk8Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                sk8 sk8Var2 = (sk8) aVarArr[i].a.invoke();
                if (sk8Var2 != null) {
                    long jC = sk8Var2.c();
                    long jC2 = c43.c(dz1Var.d2());
                    f = 0.0f;
                    int iOrdinal = dz1Var.H.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jC2 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            u.b();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jC2 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (sk8Var != null) {
                            break;
                        }
                        sk8Var = sk8Var2;
                        break;
                    }
                    sk8Var = sk8Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            sk8Var = null;
        }
        if (sk8Var == null) {
            sk8 sk8Var3 = dz1Var.N ? (sk8) dz1Var.L.invoke() : null;
            if (sk8Var3 == null) {
                return f;
            }
            sk8Var = sk8Var3;
        }
        long jC3 = c43.c(j2);
        int iOrdinal2 = dz1Var.H.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = sk8Var.b;
            return pw0Var.a(f2 - ((int) (j & 4294967295L)), sk8Var.d - f2, Float.intBitsToFloat((int) (jC3 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = sk8Var.a;
            return pw0Var.a(f3 - ((int) (j >> 32)), sk8Var.c - f3, Float.intBitsToFloat((int) (jC3 >> 32)));
        }
        u.b();
        return f;
    }

    public static boolean e2(dz1 dz1Var, sk8 sk8Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = dz1Var.d2();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jG2 = dz1Var.g2(sk8Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jG2 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jG2 & 4294967295L))) <= 0.5f;
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    public final long d2() {
        long j = this.O;
        if (kg5.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void f2(long j) {
        pw0 pw0Var = this.K;
        if (pw0Var == null) {
            pw0Var = (pw0) ku1.a(this, rw0.a);
        }
        pw0 pw0Var2 = pw0Var;
        if (this.P) {
            xc5.c("launchAnimation called when previous animation was running");
        }
        pw0 pw0Var3 = this.K;
        if (pw0Var3 == null) {
            pw0Var3 = (pw0) ku1.a(this, rw0.a);
        }
        pw0Var3.getClass();
        pw0.a.getClass();
        r3b r3bVar = new r3b(pw0.a.b);
        oy0.d(Q1(), null, x72.w, new b(r3bVar, pw0Var2, j, null), 1);
    }

    @Override // defpackage.ml6
    public final void g(long j) {
        int iB;
        long j2;
        long jD2 = d2();
        this.O = j;
        int iOrdinal = this.H.ordinal();
        if (iOrdinal == 0) {
            iB = xj5.b((int) (j & 4294967295L), (int) (jD2 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                u.b();
                return;
            }
            iB = xj5.b((int) (j >> 32), (int) (jD2 >> 32));
        }
        if (iB >= 0) {
            return;
        }
        if (this.J) {
            j2 = 0;
        } else {
            j2 = this.H == fl7.t ? ((long) (((int) (jD2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jD2 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        sk8 sk8Var = (sk8) this.L.invoke();
        if (sk8Var == null || this.P || this.N || !e2(this, sk8Var, jD2, 0L, 2) || e2(this, sk8Var, 0L, j3, 1)) {
            return;
        }
        this.N = true;
        f2(j3);
    }

    public final long g2(sk8 sk8Var, long j, long j2) {
        long jC = c43.c(j);
        int iOrdinal = this.H.ordinal();
        if (iOrdinal == 0) {
            pw0 pw0Var = this.K;
            if (pw0Var == null) {
                pw0Var = (pw0) ku1.a(this, rw0.a);
            }
            float f = sk8Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(pw0Var.a(f - ((int) (j2 & 4294967295L)), sk8Var.d - f, Float.intBitsToFloat((int) (jC & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            u.b();
            return 0L;
        }
        pw0 pw0Var2 = this.K;
        if (pw0Var2 == null) {
            pw0Var2 = (pw0) ku1.a(this, rw0.a);
        }
        float f2 = sk8Var.a;
        return (((long) Float.floatToRawIntBits(pw0Var2.a(f2 - ((int) (j2 >> 32)), sk8Var.c - f2, Float.intBitsToFloat((int) (jC >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
