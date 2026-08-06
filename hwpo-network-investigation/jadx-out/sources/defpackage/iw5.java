package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class iw5 implements jac {
    public static final /* synthetic */ iw5 t = new iw5();

    public static final int b(int i, hw5 hw5Var, Object obj) {
        int iD;
        return (obj == null || hw5Var.b() == 0 || (i < hw5Var.b() && obj.equals(hw5Var.f(i))) || (iD = hw5Var.d(obj)) == -1) ? i : iD;
    }

    public static final void c(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = gw4.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final void d(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    @Override // defpackage.jac
    public Object a() {
        return new Boolean(((b5c) a5c.u.t.t).b());
    }
}
