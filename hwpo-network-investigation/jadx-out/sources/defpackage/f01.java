package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f01 implements Iterable<Byte>, Serializable {
    public static final e u = new e(zi5.b);
    public int t = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            c01 c01Var = (c01) this;
            int i = c01Var.t;
            if (i < c01Var.u) {
                c01Var.t = i + 1;
                return Byte.valueOf(c01Var.v.f(i));
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
    public static final class b {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends e {
        public final int w;
        public final int x;

        public c(byte[] bArr, int i, int i2) {
            super(bArr);
            f01.e(i, i + i2, bArr.length);
            this.w = i;
            this.x = i2;
        }

        @Override // f01.e, defpackage.f01
        public final byte d(int i) {
            int i2 = this.x;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.v[this.w + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(pp2.a(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(u.a(i, i2, "Index > length: ", ", "));
        }

        @Override // f01.e, defpackage.f01
        public final byte f(int i) {
            return this.v[this.w + i];
        }

        @Override // f01.e
        public final int o() {
            return this.w;
        }

        @Override // f01.e, defpackage.f01
        public final int size() {
            return this.x;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class d extends f01 {
        @Override // defpackage.f01, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new c01(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends d {
        public final byte[] v;

        public e(byte[] bArr) {
            bArr.getClass();
            this.v = bArr;
        }

        @Override // defpackage.f01
        public byte d(int i) {
            return this.v[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f01) || size() != ((f01) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof e)) {
                return obj.equals(this);
            }
            e eVar = (e) obj;
            int i = this.t;
            int i2 = eVar.t;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > eVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > eVar.size()) {
                StringBuilder sbB = t43.b(size, "Ran off end of other: 0, ", ", ");
                sbB.append(eVar.size());
                throw new IllegalArgumentException(sbB.toString());
            }
            byte[] bArr = eVar.v;
            int iO = o() + size;
            int iO2 = o();
            int iO3 = eVar.o();
            while (iO2 < iO) {
                if (this.v[iO2] != bArr[iO3]) {
                    return false;
                }
                iO2++;
                iO3++;
            }
            return true;
        }

        @Override // defpackage.f01
        public byte f(int i) {
            return this.v[i];
        }

        @Override // defpackage.f01
        public final boolean i() {
            int iO = o();
            return h6b.a.b(this.v, iO, size() + iO) == 0;
        }

        @Override // defpackage.f01
        public final int j(int i, int i2) {
            int iO = o();
            Charset charset = zi5.a;
            for (int i3 = iO; i3 < iO + i2; i3++) {
                i = (i * 31) + this.v[i3];
            }
            return i;
        }

        @Override // defpackage.f01
        public final e k(int i) {
            int iE = f01.e(0, i, size());
            return iE == 0 ? f01.u : new c(this.v, o(), iE);
        }

        @Override // defpackage.f01
        public final String l(Charset charset) {
            return new String(this.v, o(), size(), charset);
        }

        @Override // defpackage.f01
        public final void n(tg1.a aVar) {
            aVar.K1(this.v, o(), size());
        }

        public int o() {
            return 0;
        }

        @Override // defpackage.f01
        public int size() {
            return this.v.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
    }

    static {
        ak.a();
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

    public abstract byte d(int i);

    public abstract byte f(int i);

    public final int hashCode() {
        int iJ = this.t;
        if (iJ == 0) {
            int size = size();
            iJ = j(size, size);
            if (iJ == 0) {
                iJ = 1;
            }
            this.t = iJ;
        }
        return iJ;
    }

    public abstract boolean i();

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new c01(this);
    }

    public abstract int j(int i, int i2);

    public abstract e k(int i);

    public abstract String l(Charset charset);

    public abstract void n(tg1.a aVar);

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strB = size() <= 50 ? nha.b(this) : nha.b(k(47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return av.a(sb, strB, "\">");
    }
}
