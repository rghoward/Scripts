package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e01 implements Iterable<Byte>, Serializable {
    public static final f u = new f(xi5.b);
    public static final d v;
    public int t = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            d01 d01Var = (d01) this;
            int i = d01Var.t;
            if (i < d01Var.u) {
                d01Var.t = i + 1;
                return Byte.valueOf(d01Var.v.j(i));
            }
            vl.b();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements d {
        @Override // e01.d
        public final byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends f {
        public final int x;
        public final int y;

        public c(byte[] bArr, int i, int i2) {
            super(bArr);
            e01.e(i, i + i2, bArr.length);
            this.x = i;
            this.y = i2;
        }

        @Override // e01.f, defpackage.e01
        public final byte d(int i) {
            int i2 = this.y;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.w[this.x + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(pp2.a(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(u.a(i, i2, "Index > length: ", ", "));
        }

        @Override // e01.f, defpackage.e01
        public final void i(byte[] bArr, int i) {
            System.arraycopy(this.w, this.x, bArr, 0, i);
        }

        @Override // e01.f, defpackage.e01
        public final byte j(int i) {
            return this.w[this.x + i];
        }

        @Override // e01.f
        public final int o() {
            return this.x;
        }

        @Override // e01.f, defpackage.e01
        public final int size() {
            return this.y;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface d {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class e extends e01 {
        @Override // defpackage.e01, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new d01(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f extends e {
        public final byte[] w;

        public f(byte[] bArr) {
            bArr.getClass();
            this.w = bArr;
        }

        @Override // defpackage.e01
        public byte d(int i) {
            return this.w[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof e01) || size() != ((e01) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int i = this.t;
            int i2 = fVar.t;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > fVar.size()) {
                StringBuilder sbB = t43.b(size, "Ran off end of other: 0, ", ", ");
                sbB.append(fVar.size());
                throw new IllegalArgumentException(sbB.toString());
            }
            byte[] bArr = fVar.w;
            int iO = o() + size;
            int iO2 = o();
            int iO3 = fVar.o();
            while (iO2 < iO) {
                if (this.w[iO2] != bArr[iO3]) {
                    return false;
                }
                iO2++;
                iO3++;
            }
            return true;
        }

        @Override // defpackage.e01
        public void i(byte[] bArr, int i) {
            System.arraycopy(this.w, 0, bArr, 0, i);
        }

        @Override // defpackage.e01
        public byte j(int i) {
            return this.w[i];
        }

        @Override // defpackage.e01
        public final int k(int i, int i2) {
            int iO = o();
            Charset charset = xi5.a;
            for (int i3 = iO; i3 < iO + i2; i3++) {
                i = (i * 31) + this.w[i3];
            }
            return i;
        }

        @Override // defpackage.e01
        public final f l(int i) {
            int iE = e01.e(0, i, size());
            return iE == 0 ? e01.u : new c(this.w, o(), iE);
        }

        @Override // defpackage.e01
        public final void n(sg1 sg1Var) {
            sg1Var.a1(this.w, o(), size());
        }

        public int o() {
            return 0;
        }

        @Override // defpackage.e01
        public int size() {
            return this.w.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g implements d {
        @Override // e01.d
        public final byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        v = bk.a() ? new g() : new b();
    }

    public static int e(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            r.b(pk.d(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            r.b(u.a(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        r.b(u.a(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static f f(byte[] bArr, int i, int i2) {
        e(i, i + i2, bArr.length);
        return new f(v.a(bArr, i, i2));
    }

    public abstract byte d(int i);

    public final int hashCode() {
        int iK = this.t;
        if (iK == 0) {
            int size = size();
            iK = k(size, size);
            if (iK == 0) {
                iK = 1;
            }
            this.t = iK;
        }
        return iK;
    }

    public abstract void i(byte[] bArr, int i);

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new d01(this);
    }

    public abstract byte j(int i);

    public abstract int k(int i, int i2);

    public abstract f l(int i);

    public abstract void n(sg1 sg1Var);

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strI = size() <= 50 ? f31.i(this) : f31.i(l(47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return av.a(sb, strI, "\">");
    }
}
