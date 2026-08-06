package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tg1 extends ln4 {
    public static final Logger y = Logger.getLogger(tg1.class.getName());
    public static final boolean z = h3b.e;
    public ug1 x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends tg1 {
        public final byte[] A;
        public final int B;
        public int C;

        public a(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.A = bArr;
            this.C = 0;
            this.B = i;
        }

        @Override // defpackage.tg1
        public final void A1(int i, zt6 zt6Var) throws b {
            E1(1, 3);
            F1(2, i);
            E1(3, 2);
            z1(zt6Var);
            E1(1, 4);
        }

        @Override // defpackage.tg1
        public final void B1(int i, f01 f01Var) throws b {
            E1(1, 3);
            F1(2, i);
            q1(3, f01Var);
            E1(1, 4);
        }

        @Override // defpackage.tg1
        public final void C1(int i, String str) throws b {
            E1(i, 2);
            D1(str);
        }

        @Override // defpackage.tg1
        public final void D1(String str) throws b {
            int i = this.C;
            try {
                int iL1 = tg1.l1(str.length() * 3);
                int iL2 = tg1.l1(str.length());
                byte[] bArr = this.A;
                if (iL2 != iL1) {
                    G1(h6b.b(str));
                    this.C = h6b.a.a(str, bArr, this.C, J1());
                    return;
                }
                int i2 = i + iL2;
                this.C = i2;
                int iA = h6b.a.a(str, bArr, i2, J1());
                this.C = i;
                G1((iA - i) - iL2);
                this.C = iA;
            } catch (h6b.c e) {
                this.C = i;
                tg1.y.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(zi5.a);
                try {
                    G1(bytes.length);
                    K1(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(e2);
                }
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        @Override // defpackage.tg1
        public final void E1(int i, int i2) throws b {
            G1((i << 3) | i2);
        }

        @Override // defpackage.tg1
        public final void F1(int i, int i2) throws b {
            E1(i, 0);
            G1(i2);
        }

        @Override // defpackage.tg1
        public final void G1(int i) throws b {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.C;
                byte[] bArr = this.A;
                if (i2 == 0) {
                    this.C = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        this.C = i3 + 1;
                        bArr[i3] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
                    }
                }
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
            }
        }

        @Override // defpackage.tg1
        public final void H1(int i, long j) throws b {
            E1(i, 0);
            I1(j);
        }

        @Override // defpackage.tg1
        public final void I1(long j) throws b {
            boolean z = tg1.z;
            byte[] bArr = this.A;
            if (!z || J1() < 10) {
                while (true) {
                    long j2 = j & (-128);
                    int i = this.C;
                    if (j2 == 0) {
                        this.C = i + 1;
                        bArr[i] = (byte) j;
                        return;
                    } else {
                        try {
                            this.C = i + 1;
                            bArr[i] = (byte) ((((int) j) & 127) | 128);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
                        }
                    }
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
                }
            }
            while (true) {
                long j3 = j & (-128);
                int i2 = this.C;
                if (j3 == 0) {
                    this.C = i2 + 1;
                    h3b.k(bArr, i2, (byte) j);
                    return;
                } else {
                    this.C = i2 + 1;
                    h3b.k(bArr, i2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        public final int J1() {
            return this.B - this.C;
        }

        public final void K1(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.A, this.C, i2);
                this.C += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), Integer.valueOf(i2)), e);
            }
        }

        @Override // defpackage.tg1
        public final void n1(byte b) throws b {
            try {
                byte[] bArr = this.A;
                int i = this.C;
                this.C = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
            }
        }

        @Override // defpackage.tg1
        public final void o1(int i, boolean z) throws b {
            E1(i, 0);
            n1(z ? (byte) 1 : (byte) 0);
        }

        @Override // defpackage.tg1
        public final void p1(byte[] bArr, int i) throws b {
            G1(i);
            K1(bArr, 0, i);
        }

        @Override // defpackage.tg1
        public final void q1(int i, f01 f01Var) throws b {
            E1(i, 2);
            r1(f01Var);
        }

        @Override // defpackage.tg1
        public final void r1(f01 f01Var) throws b {
            G1(f01Var.size());
            f01Var.n(this);
        }

        @Override // defpackage.tg1
        public final void s1(int i, int i2) throws b {
            E1(i, 5);
            t1(i2);
        }

        @Override // defpackage.tg1
        public final void t1(int i) throws b {
            try {
                byte[] bArr = this.A;
                int i2 = this.C;
                int i3 = i2 + 1;
                this.C = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.C = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.C = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.C = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
            }
        }

        @Override // defpackage.tg1
        public final void u1(int i, long j) throws b {
            E1(i, 1);
            v1(j);
        }

        @Override // defpackage.tg1
        public final void v1(long j) throws b {
            try {
                byte[] bArr = this.A;
                int i = this.C;
                int i2 = i + 1;
                this.C = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.C = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.C = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.C = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.C = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.C = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.C = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.C = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
            }
        }

        @Override // defpackage.tg1
        public final void w1(int i, int i2) throws b {
            E1(i, 0);
            x1(i2);
        }

        @Override // defpackage.tg1
        public final void x1(int i) throws b {
            if (i >= 0) {
                G1(i);
            } else {
                I1(i);
            }
        }

        @Override // defpackage.tg1
        public final void y1(int i, zt6 zt6Var, v49 v49Var) throws b {
            E1(i, 2);
            G1(((a2) zt6Var).m(v49Var));
            v49Var.e(zt6Var, this.x);
        }

        @Override // defpackage.tg1
        public final void z1(zt6 zt6Var) throws b {
            G1(zt6Var.b());
            zt6Var.e(this);
        }
    }

    public tg1() {
        super(3);
    }

    public static int h1(int i) {
        if (i >= 0) {
            return l1(i);
        }
        return 10;
    }

    public static int i1(bt5 bt5Var) {
        int iB;
        if (bt5Var.b != null) {
            iB = bt5Var.b.size();
        } else {
            iB = bt5Var.a != null ? bt5Var.a.b() : 0;
        }
        return l1(iB) + iB;
    }

    public static int j1(String str) {
        int length;
        try {
            length = h6b.b(str);
        } catch (h6b.c unused) {
            length = str.getBytes(zi5.a).length;
        }
        return l1(length) + length;
    }

    public static int k1(int i) {
        return l1(i << 3);
    }

    public static int l1(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int m1(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A1(int i, zt6 zt6Var);

    public abstract void B1(int i, f01 f01Var);

    public abstract void C1(int i, String str);

    public abstract void D1(String str);

    public abstract void E1(int i, int i2);

    public abstract void F1(int i, int i2);

    public abstract void G1(int i);

    public abstract void H1(int i, long j);

    public abstract void I1(long j);

    public abstract void n1(byte b2);

    public abstract void o1(int i, boolean z2);

    public abstract void p1(byte[] bArr, int i);

    public abstract void q1(int i, f01 f01Var);

    public abstract void r1(f01 f01Var);

    public abstract void s1(int i, int i2);

    public abstract void t1(int i);

    public abstract void u1(int i, long j);

    public abstract void v1(long j);

    public abstract void w1(int i, int i2);

    public abstract void x1(int i);

    public abstract void y1(int i, zt6 zt6Var, v49 v49Var);

    public abstract void z1(zt6 zt6Var);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends IOException {
        public b(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }

        public b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
