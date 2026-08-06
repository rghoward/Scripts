package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s76 extends mhb {
    public final e27<t27<b>> t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        i41 a(t76 t76Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final r76 a;
        public final r76 b;
        public boolean c;
        public i41 d;

        public b() {
            r76 r76Var = new r76();
            this.a = r76Var;
            this.b = r76Var;
        }
    }

    public s76() {
        e27 e27Var = ag5.a;
        this.t = new e27<>();
    }

    @Override // defpackage.mhb
    public final void onCleared() {
        e27<t27<b>> e27Var = this.t;
        int[] iArr = e27Var.b;
        Object[] objArr = e27Var.c;
        long[] jArr = e27Var.a;
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
                        int i5 = iArr[i4];
                        t27 t27Var = (t27) objArr[i4];
                        Object[] objArr2 = t27Var.a;
                        int i6 = t27Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            b bVar = (b) objArr2[i7];
                            i41 i41Var = bVar.d;
                            if (i41Var != null) {
                                i41Var.cancel();
                            }
                            bVar.d = null;
                            fh6 fh6Var = (fh6) bVar.a.t;
                            fh6Var.u = true;
                            fh6Var.t = false;
                            fh6Var.a();
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
