package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final gi1 b = gi1.N;
    public static final gi1 c = gi1.P;
    public static final float d = 0.38f;
    public static final float e = 6.0f;
    public static final float f = 1.0f;

    public static final int a(r30 r30Var, Object obj, int i) {
        int i2 = r30Var.v;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iD = ty1.d(i2, i, r30Var.t);
            if (iD < 0 || xj5.a(obj, r30Var.u[iD])) {
                return iD;
            }
            int i3 = iD + 1;
            while (i3 < i2 && r30Var.t[i3] == i) {
                if (xj5.a(obj, r30Var.u[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iD - 1; i4 >= 0 && r30Var.t[i4] == i; i4--) {
                if (xj5.a(obj, r30Var.u[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            yk.b();
            return 0;
        }
    }
}
