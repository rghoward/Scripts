package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0c implements Iterable, Serializable {
    public static final o0c u = new o0c(g2c.a);
    public int t = 0;

    static {
        int i = h0c.a;
    }

    public static o0c n(byte[] bArr, int i, int i2) {
        try {
            return o(bArr, i, i2);
        } catch (k2c e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static o0c o(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return u;
        }
        q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new o0c(bArr2);
    }

    public static int q(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static /* synthetic */ boolean r(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        q(i, i4, bArr.length);
        q(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte d(int i);

    public abstract int e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p0c)) {
            return false;
        }
        p0c p0cVar = (p0c) obj;
        int iE = e();
        if (iE != p0cVar.e()) {
            return false;
        }
        if (iE == 0) {
            return true;
        }
        int i = this.t;
        int i2 = p0cVar.t;
        if (i == 0 || i2 == 0 || i == i2) {
            return k(p0cVar);
        }
        return false;
    }

    public abstract n0c f(int i, int i2);

    public final int hashCode() {
        int iL = this.t;
        if (iL == 0) {
            int iE = e();
            iL = l(iE, iE);
            if (iL == 0) {
                iL = 1;
            }
            this.t = iL;
        }
        return iL;
    }

    public abstract void i(byte[] bArr, int i);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new l0c(this);
    }

    public abstract void j(b1c b1cVar);

    public abstract boolean k(p0c p0cVar);

    public abstract int l(int i, int i2);

    public final byte[] p() {
        int iE = e();
        if (iE == 0) {
            return g2c.a;
        }
        byte[] bArr = new byte[iE];
        i(bArr, iE);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iE = e();
        String strD = e() <= 50 ? m20.d(p()) : m20.d(f(0, 47).p()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iE);
        sb.append(" contents=\"");
        return av.a(sb, strD, "\">");
    }
}
