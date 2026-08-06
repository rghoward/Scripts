package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
public final class jk8 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public gu9 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ gk8 w;
    public final /* synthetic */ lk8 x;
    public final /* synthetic */ xx6 y;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ Object u;
        public final /* synthetic */ lk8 v;
        public final /* synthetic */ xx6 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lk8 lk8Var, xx6 xx6Var, r02 r02Var) {
            super(2, r02Var);
            this.v = lk8Var;
            this.w = xx6Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.v, this.w, r02Var);
            aVar.u = obj;
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    dv8.b(obj);
                    return g2b.a;
                }
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            t72 t72Var = (t72) this.u;
            this.t = 1;
            this.v.invoke(t72Var, this.w, this);
            return v72.t;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk8(gk8 gk8Var, lk8 lk8Var, xx6 xx6Var, r02 r02Var) {
        super(2, r02Var);
        this.w = gk8Var;
        this.x = lk8Var;
        this.y = xx6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        jk8 jk8Var = new jk8(this.w, this.x, this.y, r02Var);
        jk8Var.v = obj;
        return jk8Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((jk8) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0107 A[EDGE_INSN: B:117:0x0107->B:66:0x0107 BREAK  A[LOOP:0: B:62:0x00f3->B:118:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0149 A[EDGE_INSN: B:119:0x0149->B:91:0x0149 BREAK  A[LOOP:1: B:86:0x0134->B:121:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00da A[Catch: all -> 0x00dd, TryCatch #5 {all -> 0x00dd, blocks: (B:51:0x00d6, B:53:0x00da, B:56:0x00df, B:58:0x00e5, B:59:0x00ea), top: B:112:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5 A[Catch: all -> 0x00dd, TryCatch #5 {all -> 0x00dd, blocks: (B:51:0x00d6, B:53:0x00da, B:56:0x00df, B:58:0x00e5, B:59:0x00ea), top: B:112:0x00d6 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0101  */
    /* JADX WARN: Code duplicated, block: B:77:0x011b A[Catch: all -> 0x011e, TryCatch #6 {all -> 0x011e, blocks: (B:75:0x0117, B:77:0x011b, B:80:0x0120, B:82:0x0126, B:83:0x012b), top: B:114:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0126 A[Catch: all -> 0x011e, TryCatch #6 {all -> 0x011e, blocks: (B:75:0x0117, B:77:0x011b, B:80:0x0120, B:82:0x0126, B:83:0x012b), top: B:114:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        el5 el5VarE;
        a0a a0aVar;
        ix7 ix7Var;
        gx7 gx7VarAdd;
        gu9 gu9Var;
        Throwable th;
        List<x02> listG;
        gk8 gk8Var;
        gk8.c cVar;
        a0a a0aVar2;
        ix7 ix7Var2;
        gx7 gx7VarY;
        gk8 gk8Var2;
        gk8.c cVar2;
        a0a a0aVar3;
        ix7 ix7Var3;
        gx7 gx7VarY2;
        v72 v72Var = v72.t;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gu9Var = this.t;
            el5VarE = (el5) this.v;
            try {
                dv8.b(obj);
                gu9Var.a();
                gk8Var2 = this.w;
                synchronized (gk8Var2.c) {
                    try {
                        if (gk8Var2.d == el5VarE) {
                            gk8Var2.d = null;
                        }
                        if (gk8Var2.B() != null) {
                            pt1.a("called outside of runRecomposeAndApplyChanges");
                        }
                        g2b g2bVar = g2b.a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                a0a a0aVar4 = gk8.z;
                cVar2 = this.w.y;
                do {
                    a0aVar3 = gk8.z;
                    ix7Var3 = (ix7) a0aVar3.getValue();
                    gx7VarY2 = ix7Var3.Y(cVar2);
                    if (ix7Var3 != gx7VarY2) {
                        break;
                    }
                } while (!a0aVar3.c(ix7Var3, gx7VarY2));
                return g2b.a;
            } catch (Throwable th3) {
                th = th3;
                gu9Var.a();
                gk8Var = this.w;
                synchronized (gk8Var.c) {
                    try {
                        if (gk8Var.d == el5VarE) {
                            gk8Var.d = null;
                        }
                        if (gk8Var.B() != null) {
                            pt1.a("called outside of runRecomposeAndApplyChanges");
                        }
                        g2b g2bVar2 = g2b.a;
                        a0a a0aVar5 = gk8.z;
                        cVar = this.w.y;
                        do {
                            a0aVar2 = gk8.z;
                            ix7Var2 = (ix7) a0aVar2.getValue();
                            gx7VarY = ix7Var2.Y(cVar);
                            if (ix7Var2 != gx7VarY) {
                                break;
                            }
                        } while (!a0aVar2.c(ix7Var2, gx7VarY));
                        throw th;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
        dv8.b(obj);
        el5VarE = sd.e(((t72) this.v).getCoroutineContext());
        gk8 gk8Var3 = this.w;
        synchronized (gk8Var3.c) {
            try {
                Throwable th5 = gk8Var3.e;
                if (th5 != null) {
                    throw th5;
                }
                if (((gk8.d) gk8Var3.u.getValue()).compareTo(gk8.d.u) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (gk8Var3.d != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                gk8Var3.d = el5VarE;
                if (gk8Var3.B() != null) {
                    pt1.a("called outside of runRecomposeAndApplyChanges");
                }
                g2b g2bVar3 = g2b.a;
            } catch (Throwable th6) {
                throw th6;
            }
        }
        final gk8 gk8Var4 = this.w;
        ci4 ci4Var = new ci4() { // from class: ik8
            /* JADX WARN: Code duplicated, block: B:27:0x0078 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:28:0x007a A[Catch: all -> 0x006d, LOOP:0: B:11:0x0035->B:28:0x007a, LOOP_END, TryCatch #0 {all -> 0x006d, blocks: (B:4:0x000f, B:6:0x001f, B:8:0x0026, B:11:0x0035, B:13:0x0045, B:15:0x0051, B:17:0x005a, B:19:0x0063, B:24:0x006f, B:25:0x0072, B:28:0x007a, B:38:0x009f, B:29:0x007d, B:30:0x0083, B:32:0x0089, B:34:0x0091, B:37:0x009b), top: B:48:0x000f }] */
            /* JADX WARN: Code duplicated, block: B:51:0x009f A[EDGE_INSN: B:51:0x009f->B:38:0x009f BREAK  A[LOOP:0: B:11:0x0035->B:28:0x007a], SYNTHETIC] */
            @Override // defpackage.ci4
            public final Object invoke(Object obj2, Object obj3) {
                c41<g2b> c41VarB;
                gk8 gk8Var5 = gk8Var4;
                Set set = (Set) obj2;
                synchronized (gk8Var5.c) {
                    try {
                        if (((gk8.d) gk8Var5.u.getValue()).compareTo(gk8.d.x) >= 0) {
                            d37<Object> d37Var = gk8Var5.h;
                            if (set instanceof b49) {
                                d37 d37Var2 = ((b49) set).t;
                                Object[] objArr = d37Var2.b;
                                long[] jArr = d37Var2.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        long j = jArr[i2];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i2 != length) {
                                                break;
                                                break;
                                            }
                                            i2++;
                                        } else {
                                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                                            for (int i4 = 0; i4 < i3; i4++) {
                                                if ((255 & j) < 128) {
                                                    Object obj4 = objArr[(i2 << 3) + i4];
                                                    if (!(obj4 instanceof n0a) || ((n0a) obj4).m(1)) {
                                                        d37Var.a(obj4);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i3 != 8) {
                                                break;
                                            }
                                            if (i2 != length) {
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof n0a) || ((n0a) obj5).m(1)) {
                                        d37Var.a(obj5);
                                    }
                                }
                            }
                            c41VarB = gk8Var5.B();
                        } else {
                            c41VarB = null;
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                if (c41VarB != null) {
                    ((e41) c41VarB).resumeWith(g2b.a);
                }
                return g2b.a;
            }
        };
        qu9.e(qu9.a);
        synchronized (qu9.c) {
            qu9.h = th1.L(qu9.h, ci4Var);
        }
        gu9 gu9Var2 = new gu9(ci4Var);
        a0a a0aVar6 = gk8.z;
        gk8.c cVar3 = this.w.y;
        do {
            a0aVar = gk8.z;
            ix7Var = (ix7) a0aVar.getValue();
            gx7VarAdd = ix7Var.add((Object) cVar3);
            if (ix7Var == gx7VarAdd) {
                break;
            }
        } while (!a0aVar.c(ix7Var, gx7VarAdd));
        try {
            gk8 gk8Var5 = this.w;
            synchronized (gk8Var5.c) {
                listG = gk8Var5.G();
            }
            int size = listG.size();
            for (int i2 = 0; i2 < size; i2++) {
                listG.get(i2).B();
            }
            a aVar = new a(this.x, this.y, null);
            this.v = el5VarE;
            this.t = gu9Var2;
            this.u = 1;
            if (u72.d(aVar, this) == v72Var) {
                return v72Var;
            }
            gu9Var = gu9Var2;
            gu9Var.a();
            gk8Var2 = this.w;
            synchronized (gk8Var2.c) {
                if (gk8Var2.d == el5VarE) {
                    gk8Var2.d = null;
                }
                if (gk8Var2.B() != null) {
                    pt1.a("called outside of runRecomposeAndApplyChanges");
                }
                g2b g2bVar4 = g2b.a;
                a0a a0aVar7 = gk8.z;
                cVar2 = this.w.y;
                do {
                    a0aVar3 = gk8.z;
                    ix7Var3 = (ix7) a0aVar3.getValue();
                    gx7VarY2 = ix7Var3.Y(cVar2);
                    if (ix7Var3 != gx7VarY2) {
                        break;
                        break;
                    }
                } while (!a0aVar3.c(ix7Var3, gx7VarY2));
                return g2b.a;
            }
        } catch (Throwable th7) {
            gu9Var = gu9Var2;
            th = th7;
            gu9Var.a();
            gk8Var = this.w;
            synchronized (gk8Var.c) {
                if (gk8Var.d == el5VarE) {
                    gk8Var.d = null;
                }
                if (gk8Var.B() != null) {
                    pt1.a("called outside of runRecomposeAndApplyChanges");
                }
                g2b g2bVar5 = g2b.a;
            }
            a0a a0aVar8 = gk8.z;
            cVar = this.w.y;
            do {
                a0aVar2 = gk8.z;
                ix7Var2 = (ix7) a0aVar2.getValue();
                gx7VarY = ix7Var2.Y(cVar);
                if (ix7Var2 != gx7VarY) {
                    break;
                    break;
                }
            } while (!a0aVar2.c(ix7Var2, gx7VarY));
            throw th;
        }
    }
}
