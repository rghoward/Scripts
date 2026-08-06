package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lu9 {
    public mu9 a;

    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[LOOP:0: B:22:0x004d->B:34:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[EDGE_INSN: B:53:0x0095->B:35:0x0095 BREAK  A[LOOP:0: B:22:0x004d->B:34:0x0092], SYNTHETIC] */
    public final Object a(p91 p91Var, mh4 mh4Var) {
        sq9 sq9Var;
        sc9<? super g2b> sc9Var;
        if (this.a == null) {
            c78.b("Called runAndWatch on a manager that has been disposed of");
        }
        mu9 mu9Var = this.a;
        if ((mu9Var instanceof sq9) && (sc9Var = (sq9Var = (sq9) mu9Var).f) != null && !sc9Var.equals(p91Var)) {
            x07 x07Var = new x07();
            sc9<? super g2b> sc9Var2 = sq9Var.f;
            if (sc9Var2 == null) {
                c78.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            d37<Object> d37Var = sq9Var.d;
            ArrayList arrayList = x07Var.c;
            if (d37Var != null) {
                Object[] objArr = d37Var.b;
                long[] jArr = d37Var.a;
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
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new x07.a(objArr[(i << 3) + i4], sc9Var2));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = sq9Var.b;
                obj.getClass();
                arrayList.add(new x07.a(obj, sc9Var2));
            }
            x07Var.b();
            sq9Var.c();
            this.a = x07Var;
        }
        mu9 mu9Var2 = this.a;
        mu9Var2.getClass();
        hu9 hu9VarU = qu9.j().u(mu9Var2.d(p91Var));
        mu9Var2.a(p91Var);
        try {
            hu9 hu9VarJ = hu9VarU.j();
            try {
                Object objInvoke = mh4Var.invoke();
                hu9.q(hu9VarJ);
                hu9VarU.c();
                mu9Var2.b();
                return objInvoke;
            } catch (Throwable th) {
                hu9.q(hu9VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            hu9VarU.c();
            throw th2;
        }
    }
}
