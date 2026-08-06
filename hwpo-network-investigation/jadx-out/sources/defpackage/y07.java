package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y07<K, V> {
    public final c37<Object, Object> a;

    public /* synthetic */ y07(c37 c37Var) {
        this.a = c37Var;
    }

    public static final void a(c37<Object, Object> c37Var, K k, V v) {
        int i = c37Var.i(k);
        boolean z = i < 0;
        Object obj = z ? null : c37Var.c[i];
        if (obj != null) {
            if (obj instanceof t27) {
                t27 t27Var = (t27) obj;
                t27Var.g(v);
                v = (V) t27Var;
            } else {
                Object[] objArr = me7.a;
                t27 t27Var2 = new t27(2);
                t27Var2.g(obj);
                t27Var2.g(v);
                v = (V) t27Var2;
            }
        }
        if (!z) {
            c37Var.c[i] = v;
            return;
        }
        int i2 = ~i;
        c37Var.b[i2] = k;
        c37Var.c[i2] = v;
    }

    public static c37 b() {
        return new c37((Object) null);
    }

    public static final Object c(c37 c37Var, kz6 kz6Var) {
        Object objD = c37Var.d(kz6Var);
        if (objD == null) {
            return null;
        }
        if (!(objD instanceof t27)) {
            c37Var.k(kz6Var);
            return objD;
        }
        t27 t27Var = (t27) objD;
        if (t27Var.d()) {
            px1.b("List is empty.");
            return null;
        }
        int i = t27Var.b - 1;
        E eB = t27Var.b(i);
        t27Var.l(i);
        eB.getClass();
        if (t27Var.d()) {
            c37Var.k(kz6Var);
        }
        if (t27Var.b == 1) {
            c37Var.m(kz6Var, t27Var.a());
        }
        return eB;
    }

    public static final void d(c37 c37Var, kz6 kz6Var, oh4 oh4Var) {
        Object objD = c37Var.d(kz6Var);
        if (objD != null) {
            if (!(objD instanceof t27)) {
                if (((Boolean) oh4Var.invoke(objD)).booleanValue()) {
                    c37Var.k(kz6Var);
                    return;
                }
                return;
            }
            t27 t27Var = (t27) objD;
            int i = t27Var.b;
            Object[] objArr = t27Var.a;
            int i2 = 0;
            fg5 fg5VarJ = uh8.j(0, i);
            int i3 = fg5VarJ.t;
            int i4 = fg5VarJ.u;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) oh4Var.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            gz3.m(i - i2, i, null, objArr);
            t27Var.b -= i2;
            if (t27Var.d()) {
                c37Var.k(kz6Var);
            }
            if (t27Var.b == 1) {
                c37Var.m(kz6Var, t27Var.a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005f A[LOOP:0: B:9:0x001d->B:22:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[EDGE_INSN: B:25:0x0062->B:23:0x0062 BREAK  A[LOOP:0: B:9:0x001d->B:22:0x005f], SYNTHETIC] */
    public static final t27 e(c37 c37Var) {
        if (c37Var.e()) {
            t27 t27Var = me7.b;
            t27Var.getClass();
            return t27Var;
        }
        t27 t27Var2 = new t27((Object) null);
        Object[] objArr = c37Var.c;
        long[] jArr = c37Var.a;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof t27) {
                                t27Var2.h((t27) obj);
                            } else {
                                obj.getClass();
                                t27Var2.g(obj);
                            }
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
        return t27Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y07) {
            return this.a.equals(((y07) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
