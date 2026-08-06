package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends gw2 implements g58, so5, qb9, txa, ju1, rf7, nb5, mk4 {
    public static final a e0 = new a();
    public h27 J;
    public bb5 K;
    public boolean L;
    public String M;
    public ex8 N;
    public boolean O;
    public mh4<g2b> P;
    public final la4 Q;
    public bb5 R;
    public v6a S;
    public nk4 T;
    public dw2 U;
    public n88.b V;
    public l35 W;
    public final n27<n88.b> X;
    public long Y;
    public n88.b Z;
    public h27 a0;
    public boolean b0;
    public dz9 c0;
    public final a d0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends pi4 implements oh4<Boolean, g2b> {
        /* JADX WARN: Code duplicated, block: B:19:0x0064 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x0066 A[LOOP:0: B:10:0x0026->B:20:0x0066, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:28:0x0069 A[EDGE_INSN: B:28:0x0069->B:21:0x0069 BREAK  A[LOOP:0: B:10:0x0026->B:20:0x0066], SYNTHETIC] */
        @Override // defpackage.oh4
        public final g2b invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            m0 m0Var = (m0) this.receiver;
            n27<n88.b> n27Var = m0Var.X;
            if (zBooleanValue) {
                m0Var.n2();
            } else {
                if (m0Var.J != null) {
                    Object[] objArr = n27Var.c;
                    long[] jArr = n27Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        oy0.d(m0Var.Q1(), null, null, new p0(m0Var, (n88.b) objArr[(i << 3) + i3], null), 3);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                                if (i != length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                    n88.b bVar = m0Var.Z;
                    if (bVar != null) {
                        oy0.d(m0Var.Q1(), null, null, new q0(m0Var, bVar, null), 3);
                    }
                }
                n27Var.a();
                m0Var.Z = null;
                m0Var.o2();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1", f = "Clickable.kt", l = {2214}, m = "invokeSuspend", v = 1)
    public static final class c extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ h27 u;
        public final /* synthetic */ n88.a v;
        public final /* synthetic */ e33 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h27 h27Var, n88.a aVar, e33 e33Var, r02<? super c> r02Var) {
            super(2, r02Var);
            this.u = h27Var;
            this.v = aVar;
            this.w = e33Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new c(this.u, this.v, this.w, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((c) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objC = this.u.c(this.v, this);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            e33 e33Var = this.w;
            if (e33Var != null) {
                e33Var.dispose();
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {2157, 2162, 2163}, m = "invokeSuspend", v = 1)
    public static final class d extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public n88.c t;
        public int u;
        public final /* synthetic */ el5 v;
        public final /* synthetic */ long w;
        public final /* synthetic */ h27 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(el5 el5Var, long j, h27 h27Var, r02<? super d> r02Var) {
            super(2, r02Var);
            this.v = el5Var;
            this.w = j;
            this.x = h27Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new d(this.v, this.w, this.x, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((d) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            if (r1.c(r0, r9) == r6) goto L20;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                int r0 = r9.u
                h27 r1 = r9.x
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                v72 r6 = defpackage.v72.t
                if (r0 == 0) goto L26
                if (r0 == r5) goto L22
                if (r0 == r4) goto L1c
                if (r0 != r3) goto L16
                defpackage.dv8.b(r10)
                goto L56
            L16:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r9)
                return r2
            L1c:
                n88$c r0 = r9.t
                defpackage.dv8.b(r10)
                goto L4b
            L22:
                defpackage.dv8.b(r10)
                goto L34
            L26:
                defpackage.dv8.b(r10)
                r9.u = r5
                el5 r10 = r9.v
                java.lang.Object r10 = r10.p0(r9)
                if (r10 != r6) goto L34
                goto L55
            L34:
                n88$b r10 = new n88$b
                long r7 = r9.w
                r10.<init>(r7)
                n88$c r0 = new n88$c
                r0.<init>(r10)
                r9.t = r0
                r9.u = r4
                java.lang.Object r10 = r1.c(r10, r9)
                if (r10 != r6) goto L4b
                goto L55
            L4b:
                r9.t = r2
                r9.u = r3
                java.lang.Object r9 = r1.c(r0, r9)
                if (r9 != r6) goto L56
            L55:
                return r6
            L56:
                g2b r9 = defpackage.g2b.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$2$1", f = "Clickable.kt", l = {2174}, m = "invokeSuspend", v = 1)
    public static final class e extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ n88.b u;
        public final /* synthetic */ h27 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r02 r02Var, h27 h27Var, n88.b bVar) {
            super(2, r02Var);
            this.u = bVar;
            this.v = h27Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new e(r02Var, this.v, this.u);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((e) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                n88.c cVar = new n88.c(this.u);
                this.t = 1;
                Object objC = this.v.c(cVar, this);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
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
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", l = {2071, 2072}, m = "invokeSuspend", v = 1)
    public static final class f extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ h27 u;
        public final /* synthetic */ n88.b v;
        public final /* synthetic */ m0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h27 h27Var, n88.b bVar, m0 m0Var, r02<? super f> r02Var) {
            super(2, r02Var);
            this.u = h27Var;
            this.v = bVar;
            this.w = m0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new f(this.u, this.v, this.w, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((f) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r7.u.c(r1, r7) == r4) goto L15;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                int r0 = r7.t
                n88$b r1 = r7.v
                r2 = 2
                r3 = 1
                v72 r4 = defpackage.v72.t
                if (r0 == 0) goto L1d
                if (r0 == r3) goto L19
                if (r0 != r2) goto L12
                defpackage.dv8.b(r8)
                goto L36
            L12:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                r7 = 0
                return r7
            L19:
                defpackage.dv8.b(r8)
                goto L2b
            L1d:
                defpackage.dv8.b(r8)
                long r5 = defpackage.bf1.a
                r7.t = r3
                java.lang.Object r8 = defpackage.bw2.b(r5, r7)
                if (r8 != r4) goto L2b
                goto L35
            L2b:
                r7.t = r2
                h27 r8 = r7.u
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r4) goto L36
            L35:
                return r4
            L36:
                m0 r7 = r7.w
                r7.Z = r1
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$2", f = "Clickable.kt", l = {2077}, m = "invokeSuspend", v = 1)
    public static final class g extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ h27 u;
        public final /* synthetic */ n88.b v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r02 r02Var, h27 h27Var, n88.b bVar) {
            super(2, r02Var);
            this.u = h27Var;
            this.v = bVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new g(r02Var, this.u, this.v);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((g) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objC = this.u.c(this.v, this);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
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
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$2$1", f = "Clickable.kt", l = {2088, 2089}, m = "invokeSuspend", v = 1)
    public static final class h extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ h27 u;
        public final /* synthetic */ n88.b v;
        public final /* synthetic */ m0 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(h27 h27Var, n88.b bVar, m0 m0Var, r02<? super h> r02Var) {
            super(2, r02Var);
            this.u = h27Var;
            this.v = bVar;
            this.w = m0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new h(this.u, this.v, this.w, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((h) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r7.u.c(r1, r7) == r4) goto L15;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                int r0 = r7.t
                n88$b r1 = r7.v
                r2 = 2
                r3 = 1
                v72 r4 = defpackage.v72.t
                if (r0 == 0) goto L1d
                if (r0 == r3) goto L19
                if (r0 != r2) goto L12
                defpackage.dv8.b(r8)
                goto L36
            L12:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                r7 = 0
                return r7
            L19:
                defpackage.dv8.b(r8)
                goto L2b
            L1d:
                defpackage.dv8.b(r8)
                long r5 = defpackage.bf1.a
                r7.t = r3
                java.lang.Object r8 = defpackage.bw2.b(r5, r7)
                if (r8 != r4) goto L2b
                goto L35
            L2b:
                r7.t = r2
                h27 r8 = r7.u
                java.lang.Object r8 = r8.c(r1, r7)
                if (r8 != r4) goto L36
            L35:
                return r4
            L36:
                m0 r7 = r7.w
                r7.V = r1
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$2$2", f = "Clickable.kt", l = {2094}, m = "invokeSuspend", v = 1)
    public static final class i extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ h27 u;
        public final /* synthetic */ n88.b v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r02 r02Var, h27 h27Var, n88.b bVar) {
            super(2, r02Var);
            this.u = h27Var;
            this.v = bVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new i(r02Var, this.u, this.v);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((i) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                this.t = 1;
                Object objC = this.u.c(this.v, this);
                v72 v72Var = v72.t;
                if (objC == v72Var) {
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
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1999}, m = "invokeSuspend", v = 1)
    public static final class j extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ n88.b v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(n88.b bVar, r02<? super j> r02Var) {
            super(2, r02Var);
            this.v = bVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return m0.this.new j(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((j) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                h27 h27Var = m0.this.J;
                if (h27Var != null) {
                    this.t = 1;
                    Object objC = h27Var.c(this.v, this);
                    v72 v72Var = v72.t;
                    if (objC == v72Var) {
                        return v72Var;
                    }
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
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$2", f = "Clickable.kt", l = {2011}, m = "invokeSuspend", v = 1)
    public static final class k extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ n88.b v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(n88.b bVar, r02<? super k> r02Var) {
            super(2, r02Var);
            this.v = bVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return m0.this.new k(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((k) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i == 0) {
                dv8.b(obj);
                h27 h27Var = m0.this.J;
                if (h27Var != null) {
                    n88.c cVar = new n88.c(this.v);
                    this.t = 1;
                    Object objC = h27Var.c(cVar, this);
                    v72 v72Var = v72.t;
                    if (objC == v72Var) {
                        return v72Var;
                    }
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
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$1", f = "Clickable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public l(r02<? super l> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return m0.this.new l(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((l) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            m0 m0Var = m0.this;
            if (m0Var.W == null) {
                l35 l35Var = new l35();
                h27 h27Var = m0Var.J;
                if (h27Var != null) {
                    oy0.d(m0Var.Q1(), null, null, new n0(h27Var, l35Var, null), 3);
                }
                m0Var.W = l35Var;
            }
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public m(r02<? super m> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return m0.this.new m(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((m) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            m0 m0Var = m0.this;
            l35 l35Var = m0Var.W;
            if (l35Var != null) {
                m35 m35Var = new m35(l35Var);
                h27 h27Var = m0Var.J;
                if (h27Var != null) {
                    oy0.d(m0Var.Q1(), null, null, new o0(h27Var, m35Var, null), 3);
                }
                m0Var.W = null;
            }
            return g2b.a;
        }
    }

    public m0() {
        throw null;
    }

    public m0(h27 h27Var, bb5 bb5Var, boolean z, boolean z2, String str, ex8 ex8Var, mh4 mh4Var) {
        this.J = h27Var;
        this.K = bb5Var;
        this.L = z;
        this.M = str;
        this.N = ex8Var;
        this.O = z2;
        this.P = mh4Var;
        this.Q = new la4(h27Var, 0, new b(1, this, m0.class, "onFocusChange", "onFocusChange(Z)V", 0));
        int i2 = ne6.a;
        this.X = new n27<>(6);
        this.Y = 0L;
        h27 h27Var2 = this.J;
        this.a0 = h27Var2;
        this.b0 = h27Var2 == null;
        this.d0 = e0;
    }

    @Override // defpackage.so5
    public final boolean C(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.qb9
    public final void E1(hc9 hc9Var) {
        ex8 ex8Var = this.N;
        if (ex8Var != null) {
            ec9.e(hc9Var, ex8Var.a);
        }
        String str = this.M;
        l0 l0Var = new l0(0, this);
        ho5<Object>[] ho5VarArr = ec9.a;
        hc9Var.d(kb9.b, new k3(str, l0Var));
        if (this.O) {
            this.Q.E1(hc9Var);
        } else {
            hc9Var.d(ac9.j, g2b.a);
        }
        f2(hc9Var);
    }

    @Override // defpackage.txa
    public final Object G() {
        return this.d0;
    }

    @Override // defpackage.qb9
    public final boolean G1() {
        return true;
    }

    @Override // ox6.c
    public final boolean R1() {
        return false;
    }

    @Override // ox6.c
    public final void U1() {
        e1();
        if (!this.b0) {
            n2();
        }
        if (this.O) {
            c2(this.Q);
        }
    }

    @Override // ox6.c
    public final void V1() {
        h2();
        if (this.a0 == null) {
            this.J = null;
        }
        dw2 dw2Var = this.U;
        if (dw2Var != null) {
            d2(dw2Var);
        }
        this.U = null;
        nk4 nk4Var = this.T;
        if (nk4Var != null) {
            d2(nk4Var);
        }
        this.T = null;
    }

    public void b0(to toVar, s48 s48Var) {
        n2();
        if (this.O && this.T == null) {
            nk4 nk4Var = new nk4(this);
            c2(nk4Var);
            this.T = nk4Var;
        }
    }

    public void c0(r48 r48Var, s48 s48Var, long j2) {
        v6a v6aVarG2;
        long jB = c43.b(j2);
        this.Y = (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32);
        n2();
        if (this.O) {
            if (this.T == null) {
                nk4 nk4Var = new nk4(this);
                c2(nk4Var);
                this.T = nk4Var;
            }
            if (s48Var == s48.u) {
                int i2 = r48Var.f;
                if (i2 == 4) {
                    oy0.d(Q1(), null, null, new l(null), 3);
                } else if (i2 == 5) {
                    oy0.d(Q1(), null, null, new m(null), 3);
                }
            }
        }
        if (this.S == null && (v6aVarG2 = g2()) != null) {
            c2(v6aVarG2);
            this.S = v6aVarG2;
        }
        v6a v6aVar = this.S;
        if (v6aVar != null) {
            v6aVar.c0(r48Var, s48Var, j2);
        }
    }

    @Override // defpackage.rf7
    public final void e1() {
        if (this.L) {
            sf7.a(this, new mh4() { // from class: j0
                @Override // defpackage.mh4
                public final Object invoke() {
                    dw2 dw2Var;
                    u93 u93Var = xa5.a;
                    m0 m0Var = this.t;
                    va5 va5Var = (va5) ku1.a(m0Var, u93Var);
                    if (!(va5Var instanceof bb5)) {
                        xc5.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + va5Var);
                    }
                    bb5 bb5Var = m0Var.R;
                    bb5 bb5Var2 = (bb5) va5Var;
                    m0Var.R = bb5Var2;
                    if (bb5Var != null && !xj5.a(bb5Var2, bb5Var) && ((dw2Var = m0Var.U) != null || !m0Var.b0)) {
                        if (dw2Var != null) {
                            m0Var.d2(dw2Var);
                        }
                        m0Var.U = null;
                        m0Var.n2();
                    }
                    return g2b.a;
                }
            });
        }
    }

    public v6a g2() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    public final void h2() {
        h27 h27Var = this.J;
        n27<n88.b> n27Var = this.X;
        if (h27Var != null) {
            n88.b bVar = this.V;
            if (bVar != null) {
                h27Var.b(new n88.a(bVar));
            }
            n88.b bVar2 = this.Z;
            if (bVar2 != null) {
                h27Var.b(new n88.a(bVar2));
            }
            l35 l35Var = this.W;
            if (l35Var != null) {
                h27Var.b(new m35(l35Var));
            }
            Object[] objArr = n27Var.c;
            long[] jArr = n27Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                h27Var.b(new n88.a((n88.b) objArr[(i2 << 3) + i4]));
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        this.V = null;
        this.Z = null;
        this.W = null;
        n27Var.a();
    }

    public final long i2(long j2) {
        long jZ1 = ew2.f(this).R.z1(((lgb) ku1.a(this, qu1.t)).d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jZ1 >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jZ1 & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void j2(boolean z) {
        h27 h27Var = this.J;
        if (h27Var != null) {
            dz9 dz9Var = this.c0;
            if (dz9Var == null || !dz9Var.h()) {
                n88.b bVar = z ? this.Z : this.V;
                if (bVar != null) {
                    n88.a aVar = new n88.a(bVar);
                    el5 el5Var = (el5) ((o02) Q1()).t.d0(el5.a.t);
                    oy0.d(Q1(), null, null, new c(h27Var, aVar, el5Var != null ? el5Var.j0(new k0(0, h27Var, aVar)) : null, null), 3);
                }
            } else {
                dz9 dz9Var2 = this.c0;
                if (dz9Var2 != null) {
                    dz9Var2.k(null);
                }
            }
            if (z) {
                this.Z = null;
            } else {
                this.V = null;
            }
        }
    }

    public final void k2(long j2, boolean z) {
        h27 h27Var = this.J;
        if (h27Var != null) {
            dz9 dz9Var = this.c0;
            if (dz9Var == null || !dz9Var.h()) {
                n88.b bVar = z ? this.Z : this.V;
                if (bVar != null) {
                    oy0.d(Q1(), null, null, new e(null, h27Var, bVar), 3);
                }
            } else {
                dz9Var.k(null);
                oy0.d(Q1(), null, null, new d(dz9Var, j2, h27Var, null), 3);
            }
            if (z) {
                this.Z = null;
            } else {
                this.V = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    @Override // defpackage.so5
    public final boolean l0(KeyEvent keyEvent) {
        boolean z;
        n2();
        long jA = db7.a(keyEvent);
        boolean z2 = this.O;
        n27<n88.b> n27Var = this.X;
        if (z2 && db7.b(keyEvent) == 2 && we1.d(keyEvent)) {
            if (n27Var.b(jA)) {
                z = false;
            } else {
                n88.b bVar = new n88.b(this.Y);
                n27Var.g(jA, bVar);
                if (this.J != null) {
                    oy0.d(Q1(), null, null, new j(bVar, null), 3);
                }
                z = true;
            }
            if (p2(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.O && db7.b(keyEvent) == 1 && we1.d(keyEvent)) {
            n88.b bVarF = n27Var.f(jA);
            if (bVarF != null) {
                if (this.J != null) {
                    oy0.d(Q1(), null, null, new k(bVarF, null), 3);
                }
                q2(keyEvent);
            }
            if (bVarF != null) {
                return true;
            }
        }
        return false;
    }

    public final void l2(final jb5 jb5Var) {
        h27 h27Var = this.J;
        if (h27Var != null) {
            n88.b bVar = new n88.b(jb5Var.c);
            final cl8 cl8Var = new cl8();
            yx.e(this, nk4.I, new ok4(new oh4() { // from class: se1
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    boolean zH0 = ((mk4) obj).h0(jb5Var);
                    cl8 cl8Var2 = cl8Var;
                    boolean z = cl8Var2.t || zH0;
                    cl8Var2.t = z;
                    return Boolean.valueOf(!z);
                }
            }));
            if (cl8Var.t || bf1.a(this)) {
                this.c0 = oy0.d(Q1(), null, null, new f(h27Var, bVar, this, null), 3);
            } else {
                this.Z = bVar;
                oy0.d(Q1(), null, null, new g(null, h27Var, bVar), 3);
            }
        }
    }

    public final void m2(a58 a58Var) {
        boolean z;
        h27 h27Var = this.J;
        if (h27Var != null) {
            n88.b bVar = new n88.b(a58Var.c);
            int i2 = 0;
            nk4.a aVar = nk4.I;
            if (a58Var == null) {
                txa txaVarA = yx.a(this, aVar);
                nk4 nk4Var = txaVarA instanceof nk4 ? (nk4) txaVarA : null;
                z = (nk4Var != null ? nk4Var.H : null) != null;
            } else {
                cl8 cl8Var = new cl8();
                yx.e(this, aVar, new ok4(new te1(i2, a58Var, cl8Var)));
                z = cl8Var.t;
            }
            if (((z || bf1.a(this)) ? 1 : 0) != 0) {
                this.c0 = oy0.d(Q1(), null, null, new h(h27Var, bVar, this, null), 3);
            } else {
                this.V = bVar;
                oy0.d(Q1(), null, null, new i(null, h27Var, bVar), 3);
            }
        }
    }

    public final void n2() {
        if (this.U != null) {
            return;
        }
        bb5 bb5Var = this.L ? this.R : this.K;
        if (bb5Var != null) {
            if (this.J == null) {
                this.J = new i27();
            }
            this.Q.h2(this.J);
            h27 h27Var = this.J;
            h27Var.getClass();
            dw2 dw2VarA = bb5Var.a(h27Var);
            c2(dw2VarA);
            this.U = dw2VarA;
        }
    }

    public abstract boolean p2(KeyEvent keyEvent);

    public abstract void q2(KeyEvent keyEvent);

    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    public final void r2(h27 h27Var, bb5 bb5Var, boolean z, boolean z2, String str, ex8 ex8Var, mh4<g2b> mh4Var) {
        boolean z3;
        boolean z4;
        dw2 dw2Var;
        if (xj5.a(this.a0, h27Var)) {
            z3 = false;
        } else {
            h2();
            this.a0 = h27Var;
            this.J = h27Var;
            z3 = true;
        }
        if (!xj5.a(this.K, bb5Var)) {
            this.K = bb5Var;
            z3 = true;
        }
        if (this.L != z) {
            this.L = z;
            if (z) {
                e1();
            }
            z3 = true;
        }
        boolean z5 = this.O;
        la4 la4Var = this.Q;
        if (z5 != z2) {
            if (z2) {
                c2(la4Var);
            } else {
                d2(la4Var);
                h2();
            }
            ew2.f(this).R();
            this.O = z2;
        }
        if (!xj5.a(this.M, str)) {
            this.M = str;
            ew2.f(this).R();
        }
        if (!xj5.a(this.N, ex8Var)) {
            this.N = ex8Var;
            ew2.f(this).R();
        }
        this.P = mh4Var;
        boolean z6 = this.b0;
        h27 h27Var2 = this.a0;
        if (z6 != (h27Var2 == null)) {
            boolean z7 = h27Var2 == null;
            this.b0 = z7;
            z4 = (z7 || this.U != null) ? z3 : true;
        }
        if (z4 && ((dw2Var = this.U) != null || !this.b0)) {
            if (dw2Var != null) {
                d2(dw2Var);
            }
            this.U = null;
            n2();
        }
        la4Var.h2(this.J);
    }

    public void t0() {
        l35 l35Var;
        h27 h27Var = this.J;
        if (h27Var != null && (l35Var = this.W) != null) {
            h27Var.b(new m35(l35Var));
        }
        this.W = null;
        v6a v6aVar = this.S;
        if (v6aVar != null) {
            v6aVar.t0();
        }
    }

    public void o2() {
    }

    public void f2(hc9 hc9Var) {
    }
}
