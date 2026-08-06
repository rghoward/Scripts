package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend", v = 1)
public final class dj1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ r54<Object>[] B;
    public final /* synthetic */ n74 C;
    public final /* synthetic */ s54<Object> D;
    public Object[] t;
    public p91 u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ r54<Object>[] u;
        public final /* synthetic */ int v;
        public final /* synthetic */ AtomicInteger w;
        public final /* synthetic */ zx0 x;

        /* JADX INFO: renamed from: dj1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0070a<T> implements s54 {
            public final /* synthetic */ zx0 t;
            public final /* synthetic */ int u;

            /* JADX INFO: renamed from: dj1$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit", v = 1)
            public static final class C0071a extends u02 {
                public /* synthetic */ Object t;
                public final /* synthetic */ C0070a<T> u;
                public int v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0071a(C0070a<? super T> c0070a, r02<? super C0071a> r02Var) {
                    super(r02Var);
                    this.u = c0070a;
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) {
                    this.t = obj;
                    this.v |= Integer.MIN_VALUE;
                    return this.u.emit(null, this);
                }
            }

            public C0070a(zx0 zx0Var, int i) {
                this.t = zx0Var;
                this.u = i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
            
                if (defpackage.md6.i(r0) == r4) goto L21;
             */
            @Override // defpackage.s54
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, defpackage.r02<? super defpackage.g2b> r7) throws java.lang.Throwable {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof dj1.a.C0070a.C0071a
                    if (r0 == 0) goto L13
                    r0 = r7
                    dj1$a$a$a r0 = (dj1.a.C0070a.C0071a) r0
                    int r1 = r0.v
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.v = r1
                    goto L18
                L13:
                    dj1$a$a$a r0 = new dj1$a$a$a
                    r0.<init>(r5, r7)
                L18:
                    java.lang.Object r7 = r0.t
                    int r1 = r0.v
                    r2 = 2
                    r3 = 1
                    v72 r4 = defpackage.v72.t
                    if (r1 == 0) goto L35
                    if (r1 == r3) goto L31
                    if (r1 != r2) goto L2a
                    defpackage.dv8.b(r7)
                    goto L53
                L2a:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r5)
                    r5 = 0
                    return r5
                L31:
                    defpackage.dv8.b(r7)
                    goto L4a
                L35:
                    defpackage.dv8.b(r7)
                    sa5 r7 = new sa5
                    int r1 = r5.u
                    r7.<init>(r1, r6)
                    r0.v = r3
                    zx0 r5 = r5.t
                    java.lang.Object r5 = r5.a(r0, r7)
                    if (r5 != r4) goto L4a
                    goto L52
                L4a:
                    r0.v = r2
                    java.lang.Object r5 = defpackage.md6.i(r0)
                    if (r5 != r4) goto L53
                L52:
                    return r4
                L53:
                    g2b r5 = defpackage.g2b.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: dj1.a.C0070a.emit(java.lang.Object, r02):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r54[] r54VarArr, int i, AtomicInteger atomicInteger, zx0 zx0Var, r02 r02Var) {
            super(2, r02Var);
            this.u = r54VarArr;
            this.v = i;
            this.w = atomicInteger;
            this.x = zx0Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new a(this.u, this.v, this.w, this.x, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            AtomicInteger atomicInteger = this.w;
            zx0 zx0Var = this.x;
            try {
                if (i == 0) {
                    dv8.b(obj);
                    r54<Object>[] r54VarArr = this.u;
                    int i2 = this.v;
                    r54<Object> r54Var = r54VarArr[i2];
                    C0070a c0070a = new C0070a(zx0Var, i2);
                    this.t = 1;
                    Object objCollect = r54Var.collect(c0070a, this);
                    v72 v72Var = v72.t;
                    if (objCollect == v72Var) {
                        return v72Var;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    zx0Var.g(null);
                }
                return g2b.a;
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    zx0Var.g(null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj1(r54[] r54VarArr, n74 n74Var, s54 s54Var, r02 r02Var) {
        super(2, r02Var);
        this.B = r54VarArr;
        this.C = n74Var;
        this.D = s54Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        dj1 dj1Var = new dj1(this.B, this.C, this.D, r02Var);
        dj1Var.A = obj;
        return dj1Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((dj1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc A[DONT_INVERT, EDGE_INSN: B:33:0x00bc->B:19:0x0079 BREAK  A[LOOP:0: B:26:0x009d->B:39:?]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:26:0x009d->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:19:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
