package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j59<Key, Scope> {
    public static final void a(c37<Object, Object> c37Var, Key key, Scope scope) {
        int i = c37Var.i(key);
        boolean z = i < 0;
        Object obj = z ? null : c37Var.c[i];
        if (obj != null) {
            if (obj instanceof d37) {
                ((d37) obj).a(scope);
            } else if (obj != scope) {
                d37 d37Var = new d37((Object) null);
                d37Var.a(obj);
                d37Var.a(scope);
                scope = (Scope) d37Var;
            }
            scope = (Scope) obj;
        }
        if (!z) {
            c37Var.c[i] = scope;
            return;
        }
        int i2 = ~i;
        c37Var.b[i2] = key;
        c37Var.c[i2] = scope;
    }

    public static final boolean b(c37<Object, Object> c37Var, Key key, Scope scope) {
        Object objD = c37Var.d(key);
        if (objD == null) {
            return false;
        }
        if (!(objD instanceof d37)) {
            if (!objD.equals(scope)) {
                return false;
            }
            c37Var.k(key);
            return true;
        }
        d37 d37Var = (d37) objD;
        boolean zL = d37Var.l(scope);
        if (zL && d37Var.g()) {
            c37Var.k(key);
        }
        return zL;
    }

    public static final void c(c37<Object, Object> c37Var, Scope scope) {
        boolean zG;
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
                        Object obj = c37Var.b[i4];
                        Object obj2 = c37Var.c[i4];
                        if (obj2 instanceof d37) {
                            d37 d37Var = (d37) obj2;
                            d37Var.l(scope);
                            zG = d37Var.g();
                        } else {
                            zG = obj2 == scope;
                        }
                        if (zG) {
                            c37Var.l(i4);
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
}
