package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fh6 implements lv8 {
    public boolean u;
    public boolean v;
    public boolean t = true;
    public final c37<Object, Object> w = new c37<>((Object) null);

    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063 A[LOOP:0: B:5:0x000d->B:25:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0066 A[EDGE_INSN: B:29:0x0066->B:26:0x0066 BREAK  A[LOOP:0: B:5:0x000d->B:25:0x0063], SYNTHETIC] */
    public final void a() {
        c37<Object, Object> c37Var = this.w;
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
                                t27 t27Var = (t27) obj;
                                Object[] objArr2 = t27Var.a;
                                int i4 = t27Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                    if (obj2 instanceof iv8) {
                                        ((iv8) obj2).a();
                                    }
                                }
                            } else if (obj instanceof iv8) {
                                ((iv8) obj).a();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        c37Var.g();
    }
}
