package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x07 extends mu9 {
    public final c37<Object, Object> b = z39.b();
    public final ArrayList c = new ArrayList();
    public final d37<sc9<g2b>> d = a49.a();
    public final c37<sc9<g2b>, oh4<Object, g2b>> e = z39.b();
    public final gu9 f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements c {
        public final Object a;
        public final sc9<g2b> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, sc9<? super g2b> sc9Var) {
            this.a = obj;
            this.b = sc9Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements c {
        public final sc9<g2b> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(sc9<? super g2b> sc9Var) {
            this.a = sc9Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c {
    }

    public x07() {
        ci4 ci4Var = new ci4() { // from class: w07
            /* JADX WARN: Code duplicated, block: B:37:0x00af A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[Catch: all -> 0x00a7, LOOP:2: B:26:0x007f->B:38:0x00b1, LOOP_END, TryCatch #0 {all -> 0x00a7, blocks: (B:4:0x000f, B:7:0x002f, B:9:0x003b, B:11:0x0045, B:13:0x004b, B:15:0x0059, B:21:0x0068, B:23:0x0073, B:26:0x007f, B:28:0x008a, B:30:0x0094, B:32:0x009a, B:35:0x00a9, B:38:0x00b1, B:39:0x00b4), top: B:45:0x000f }] */
            /* JADX WARN: Code duplicated, block: B:53:0x00b4 A[EDGE_INSN: B:53:0x00b4->B:39:0x00b4 BREAK  A[LOOP:2: B:26:0x007f->B:38:0x00b1], SYNTHETIC] */
            @Override // defpackage.ci4
            public final Object invoke(Object obj, Object obj2) {
                char c2;
                long j;
                long j2;
                x07 x07Var = this.t;
                Set set = (Set) obj;
                synchronized (x07Var.a) {
                    try {
                        c37<Object, Object> c37Var = x07Var.b;
                        yj1 yj1Var = new yj1(1, set, x07Var);
                        fza.b(1, yj1Var);
                        Object[] objArr = c37Var.b;
                        long[] jArr = c37Var.a;
                        int length = jArr.length - 2;
                        char c3 = 7;
                        if (length >= 0) {
                            int i = 0;
                            j = 128;
                            while (true) {
                                long j3 = jArr[i];
                                j2 = 255;
                                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    int i3 = 0;
                                    while (i3 < i2) {
                                        if ((j3 & 255) < 128) {
                                            yj1Var.invoke(objArr[(i << 3) + i3]);
                                        }
                                        j3 >>= 8;
                                        i3++;
                                        c3 = c3;
                                    }
                                    c2 = c3;
                                    if (i2 != 8) {
                                        break;
                                    }
                                } else {
                                    c2 = c3;
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                                c3 = c2;
                            }
                        } else {
                            c2 = 7;
                            j = 128;
                            j2 = 255;
                        }
                        d37<sc9<g2b>> d37Var = x07Var.d;
                        Object[] objArr2 = d37Var.b;
                        long[] jArr2 = d37Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j4 = jArr2[i4];
                                if ((((~j4) << c2) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i4 != length2) {
                                        break;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((j4 & j2) < j) {
                                            ((sc9) objArr2[(i4 << 3) + i6]).n(g2b.a);
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i5 != 8) {
                                        break;
                                    }
                                    if (i4 != length2) {
                                        break;
                                    }
                                    i4++;
                                }
                            }
                        }
                        x07Var.d.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return g2b.a;
            }
        };
        qu9.e(qu9.a);
        synchronized (qu9.c) {
            qu9.h = th1.L(qu9.h, ci4Var);
            g2b g2bVar = g2b.a;
        }
        this.f = new gu9(ci4Var);
    }

    @Override // defpackage.mu9
    public final void a(sc9<? super g2b> sc9Var) {
        this.c.add(new b(sc9Var));
    }

    @Override // defpackage.mu9
    public final void b() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    c cVar = (c) arrayList.get(i);
                    if (cVar instanceof a) {
                        j59.a(this.b, ((a) cVar).a, ((a) cVar).b);
                    } else {
                        if (!(cVar instanceof b)) {
                            throw new ib7();
                        }
                        j59.c(this.b, ((b) cVar).a);
                    }
                }
                g2b g2bVar = g2b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.mu9
    public final void c() {
        this.f.a();
        this.c.clear();
        this.e.g();
        synchronized (this.a) {
            this.b.g();
            g2b g2bVar = g2b.a;
        }
    }

    @Override // defpackage.mu9
    public final oh4<Object, g2b> d(final sc9<? super g2b> sc9Var) {
        c37<sc9<g2b>, oh4<Object, g2b>> c37Var = this.e;
        oh4<Object, g2b> oh4VarD = c37Var.d(sc9Var);
        if (oh4VarD == null) {
            oh4VarD = new oh4() { // from class: v07
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    this.t.c.add(new x07.a(obj, sc9Var));
                    return g2b.a;
                }
            };
            int i = c37Var.i(sc9Var);
            if (i < 0) {
                i = ~i;
            }
            Object[] objArr = c37Var.c;
            Object obj = objArr[i];
            c37Var.b[i] = sc9Var;
            objArr[i] = oh4VarD;
        }
        return oh4VarD;
    }

    @Override // defpackage.mu9
    public final void e(p91 p91Var) {
        this.e.k(p91Var);
        a(p91Var);
        b();
    }
}
