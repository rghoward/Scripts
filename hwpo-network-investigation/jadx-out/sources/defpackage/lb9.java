package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lb9 implements hc9, Iterable<Map.Entry<? extends gc9<?>, ? extends Object>>, zn5 {
    public final c37<gc9<?>, Object> t = z39.b();
    public gi6 u;
    public boolean v;
    public boolean w;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hc9
    public final <T> void d(gc9<T> gc9Var, T t) {
        boolean z = t instanceof k3;
        c37<gc9<?>, Object> c37Var = this.t;
        if (z && c37Var.b(gc9Var)) {
            Object objD = c37Var.d(gc9Var);
            objD.getClass();
            k3 k3Var = (k3) objD;
            k3 k3Var2 = (k3) t;
            String str = k3Var2.a;
            if (str == null) {
                str = k3Var.a;
            }
            di4 di4Var = k3Var2.b;
            if (di4Var == null) {
                di4Var = k3Var.b;
            }
            c37Var.m(gc9Var, new k3(str, di4Var));
        } else {
            c37Var.m(gc9Var, t);
        }
        gc9Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    public final lb9 e() {
        lb9 lb9Var = new lb9();
        lb9Var.v = this.v;
        lb9Var.w = this.w;
        c37<gc9<?>, Object> c37Var = lb9Var.t;
        c37Var.getClass();
        c37<gc9<?>, Object> c37Var2 = this.t;
        c37Var2.getClass();
        Object[] objArr = c37Var2.b;
        Object[] objArr2 = c37Var2.c;
        long[] jArr = c37Var2.a;
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
                            int i4 = (i << 3) + i3;
                            c37Var.m((gc9<?>) objArr[i4], objArr2[i4]);
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
        return lb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb9)) {
            return false;
        }
        lb9 lb9Var = (lb9) obj;
        return xj5.a(this.t, lb9Var.t) && this.v == lb9Var.v && this.w == lb9Var.w;
    }

    public final <T> T f(gc9<T> gc9Var) {
        T t = (T) this.t.d(gc9Var);
        if (t != null) {
            return t;
        }
        sp2.b(gc9Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + uo2.a(this.t.hashCode() * 31, this.v, 31);
    }

    public final void i(lb9 lb9Var) {
        c37<gc9<?>, Object> c37Var = lb9Var.t;
        Object[] objArr = c37Var.b;
        Object[] objArr2 = c37Var.c;
        long[] jArr = c37Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        gc9<?> gc9Var = (gc9) obj;
                        c37<gc9<?>, Object> c37Var2 = this.t;
                        Object objD = c37Var2.d(gc9Var);
                        gc9Var.getClass();
                        Object objInvoke = gc9Var.b.invoke(objD, obj2);
                        if (objInvoke != null) {
                            c37Var2.m(gc9Var, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends gc9<?>, ? extends Object>> iterator() {
        gi6 gi6Var = this.u;
        if (gi6Var == null) {
            c37<gc9<?>, Object> c37Var = this.t;
            c37Var.getClass();
            gi6 gi6Var2 = new gi6(c37Var);
            this.u = gi6Var2;
            gi6Var = gi6Var2;
        }
        return ((pj3) gi6Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.v) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (this.w) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        c37<gc9<?>, Object> c37Var = this.t;
        Object[] objArr = c37Var.b;
        Object[] objArr2 = c37Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((gc9) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return ie3.b(this) + "{ " + ((Object) sb) + " }";
    }
}
