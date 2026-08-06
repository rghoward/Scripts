package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class gz3 implements uf1 {
    public static final gi1 A;
    public static final gi1 B;
    public static final gi1 C;
    public static final gi1 D;
    public static final gi1 E;
    public static final gi1 F;
    public static final gi1 G;
    public static final gi1 H;
    public static final gi1 I;
    public static final gi1 J;
    public static final gi1 K;
    public static final gi1 a;
    public static final gi1 b;
    public static final gi1 c;
    public static final pl9 d;
    public static final gi1 e;
    public static final float f;
    public static final gi1 g;
    public static final float h;
    public static final gi1 i;
    public static final float j;
    public static final gi1 k;
    public static final float l;
    public static final gi1 m;
    public static final float n;
    public static final gi1 o;
    public static final float p;
    public static final gi1 q;
    public static final gi1 r;
    public static final gi1 s;
    public static final gi1 t;
    public static final gi1 u;
    public static final gi1 v;
    public static final gi1 w;
    public static final gi1 x;
    public static final gi1 y;
    public static final gi1 z;

    static {
        gi1 gi1Var = gi1.B;
        a = gi1Var;
        gi1 gi1Var2 = gi1.F;
        b = gi1Var2;
        c = gi1.N;
        d = pl9.w;
        gi1 gi1Var3 = gi1.A;
        e = gi1Var3;
        f = 0.38f;
        g = gi1Var3;
        h = 0.38f;
        i = gi1Var3;
        j = 0.38f;
        k = gi1Var3;
        l = 0.38f;
        m = gi1Var3;
        n = 0.38f;
        o = gi1Var3;
        p = 0.38f;
        gi1 gi1Var4 = gi1.t;
        q = gi1Var4;
        r = gi1Var4;
        s = gi1Var3;
        t = gi1Var4;
        u = gi1Var;
        v = gi1Var4;
        w = gi1Var4;
        x = gi1Var2;
        y = gi1Var3;
        z = gi1Var2;
        A = gi1Var;
        B = gi1Var;
        C = gi1Var;
        D = gi1Var3;
        E = gi1Var;
        F = gi1Var;
        G = gi1Var;
        H = gi1Var;
        I = gi1Var;
        J = gi1Var;
        K = gi1Var;
    }

    public static pq0 a(po poVar, int i2) {
        Bitmap bitmap = poVar.a;
        pq0 pq0Var = new pq0(poVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        pq0Var.A = i2;
        return pq0Var;
    }

    public static final int b(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = objArr[i2];
                Object obj2 = objArr2[i2];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!c((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof n0b) && (obj2 instanceof n0b)) {
                            if (!Arrays.equals(((n0b) obj).t, ((n0b) obj2).t)) {
                            }
                        } else if ((obj instanceof e1b) && (obj2 instanceof e1b)) {
                            if (!Arrays.equals(((e1b) obj).t, ((e1b) obj2).t)) {
                            }
                        } else if ((obj instanceof s0b) && (obj2 instanceof s0b)) {
                            if (!Arrays.equals(((s0b) obj).t, ((s0b) obj2).t)) {
                            }
                        } else if ((obj instanceof x0b) && (obj2 instanceof x0b)) {
                            if (!Arrays.equals(((x0b) obj).t, ((x0b) obj2).t)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void d(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
    }

    public static void e(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static void f(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static void g(long[] jArr, long[] jArr2, int i2, int i3, int i4) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i3, jArr2, i2, i4 - i3);
    }

    public static /* synthetic */ void h(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        e(i2, 0, i3, iArr, iArr2);
    }

    public static /* synthetic */ void i(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        f(0, i2, i3, objArr, objArr2);
    }

    public static byte[] j(byte[] bArr, int i2, int i3) {
        bArr.getClass();
        l(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] k(int i2, int i3, Object[] objArr) {
        objArr.getClass();
        l(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static final void l(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        r.b(a30.b("toIndex (", ") is greater than size (", ").", i2, i3));
    }

    public static void m(int i2, int i3, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i2, i3, obj);
    }

    public static void n(int[] iArr, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        Arrays.fill(iArr, 0, i3, i2);
    }

    public static void o(long[] jArr, long j2) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j2);
    }

    public static final boolean q(jt1 jt1Var) {
        return (((Configuration) jt1Var.F(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
    }

    public static Object[] r(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        return objArrCopyOf;
    }

    public static final int s(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    @Override // defpackage.uf1
    public long getTime() {
        return SystemClock.elapsedRealtime();
    }
}
