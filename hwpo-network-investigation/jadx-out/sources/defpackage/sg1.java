package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sg1 extends ln4 {
    public static final Logger y = Logger.getLogger(sg1.class.getName());
    public static final boolean z = i3b.e;
    public vg1 x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a extends sg1 {
        public final byte[] A;
        public final int B;
        public int C;

        public a(int i) {
            if (i < 0) {
                z90.a("bufferSize must be >= 0");
                throw null;
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.A = bArr;
            this.B = bArr.length;
        }

        public final void M1(int i) {
            int i2 = this.C;
            int i3 = i2 + 1;
            this.C = i3;
            byte[] bArr = this.A;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.C = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.C = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.C = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        public final void N1(long j) {
            int i = this.C;
            int i2 = i + 1;
            this.C = i2;
            byte[] bArr = this.A;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.C = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.C = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.C = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
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
        }

        public final void O1(int i, int i2) {
            P1((i << 3) | i2);
        }

        public final void P1(int i) {
            boolean z = sg1.z;
            byte[] bArr = this.A;
            if (z) {
                while (true) {
                    int i2 = i & (-128);
                    int i3 = this.C;
                    if (i2 == 0) {
                        this.C = i3 + 1;
                        i3b.j(bArr, i3, (byte) i);
                        return;
                    } else {
                        this.C = i3 + 1;
                        i3b.j(bArr, i3, (byte) ((i | 128) & 255));
                        i >>>= 7;
                    }
                }
            } else {
                while (true) {
                    int i4 = i & (-128);
                    int i5 = this.C;
                    if (i4 == 0) {
                        this.C = i5 + 1;
                        bArr[i5] = (byte) i;
                        return;
                    } else {
                        this.C = i5 + 1;
                        bArr[i5] = (byte) ((i | 128) & 255);
                        i >>>= 7;
                    }
                }
            }
        }

        public final void Q1(long j) {
            boolean z = sg1.z;
            byte[] bArr = this.A;
            if (z) {
                while (true) {
                    long j2 = j & (-128);
                    int i = this.C;
                    if (j2 == 0) {
                        this.C = i + 1;
                        i3b.j(bArr, i, (byte) j);
                        return;
                    } else {
                        this.C = i + 1;
                        i3b.j(bArr, i, (byte) ((((int) j) | 128) & 255));
                        j >>>= 7;
                    }
                }
            } else {
                while (true) {
                    long j3 = j & (-128);
                    int i2 = this.C;
                    if (j3 == 0) {
                        this.C = i2 + 1;
                        bArr[i2] = (byte) j;
                        return;
                    } else {
                        this.C = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends sg1 {
        public final byte[] A;
        public final int B;
        public int C;

        public b(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.A = bArr;
            this.C = 0;
            this.B = i;
        }

        @Override // defpackage.sg1
        public final void A1(int i) throws c {
            if (i >= 0) {
                J1(i);
            } else {
                L1(i);
            }
        }

        @Override // defpackage.sg1
        public final void B1(int i, au6 au6Var, w49 w49Var) throws c {
            H1(i, 2);
            J1(((z1) au6Var).f(w49Var));
            w49Var.i(au6Var, this.x);
        }

        @Override // defpackage.sg1
        public final void C1(au6 au6Var) throws c {
            J1(au6Var.b());
            au6Var.d(this);
        }

        @Override // defpackage.sg1
        public final void D1(int i, au6 au6Var) throws c {
            H1(1, 3);
            I1(2, i);
            H1(3, 2);
            C1(au6Var);
            H1(1, 4);
        }

        @Override // defpackage.sg1
        public final void E1(int i, e01 e01Var) throws c {
            H1(1, 3);
            I1(2, i);
            t1(3, e01Var);
            H1(1, 4);
        }

        @Override // defpackage.sg1
        public final void F1(int i, String str) throws c {
            H1(i, 2);
            G1(str);
        }

        @Override // defpackage.sg1
        public final void G1(String str) throws c {
            int i = this.C;
            try {
                int iN1 = sg1.n1(str.length() * 3);
                int iN2 = sg1.n1(str.length());
                int i2 = this.B;
                byte[] bArr = this.A;
                if (iN2 != iN1) {
                    J1(g6b.a(str));
                    int i3 = this.C;
                    this.C = g6b.a.b(str, bArr, i3, i2 - i3);
                    return;
                }
                int i4 = i + iN2;
                this.C = i4;
                int iB = g6b.a.b(str, bArr, i4, i2 - i4);
                this.C = i;
                J1((iB - i) - iN2);
                this.C = iB;
            } catch (g6b.d e) {
                this.C = i;
                p1(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        @Override // defpackage.sg1
        public final void H1(int i, int i2) throws c {
            J1((i << 3) | i2);
        }

        @Override // defpackage.sg1
        public final void I1(int i, int i2) throws c {
            H1(i, 0);
            J1(i2);
        }

        @Override // defpackage.sg1
        public final void J1(int i) throws c {
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
                        bArr[i3] = (byte) ((i | 128) & 255);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
                    }
                }
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
            }
        }

        @Override // defpackage.sg1
        public final void K1(int i, long j) throws c {
            H1(i, 0);
            L1(j);
        }

        @Override // defpackage.sg1
        public final void L1(long j) throws c {
            boolean z = sg1.z;
            int i = this.B;
            byte[] bArr = this.A;
            if (!z || i - this.C < 10) {
                while (true) {
                    long j2 = j & (-128);
                    int i2 = this.C;
                    if (j2 == 0) {
                        this.C = i2 + 1;
                        bArr[i2] = (byte) j;
                        return;
                    } else {
                        try {
                            this.C = i2 + 1;
                            bArr[i2] = (byte) ((((int) j) | 128) & 255);
                            j >>>= 7;
                        } catch (IndexOutOfBoundsException e) {
                            throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(i), 1), e);
                        }
                    }
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(i), 1), e);
                }
            }
            while (true) {
                long j3 = j & (-128);
                int i3 = this.C;
                if (j3 == 0) {
                    this.C = i3 + 1;
                    i3b.j(bArr, i3, (byte) j);
                    return;
                } else {
                    this.C = i3 + 1;
                    i3b.j(bArr, i3, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        }

        public final void M1(byte[] bArr, int i, int i2) throws c {
            try {
                System.arraycopy(bArr, i, this.A, this.C, i2);
                this.C += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), Integer.valueOf(i2)), e);
            }
        }

        @Override // defpackage.ln4
        public final void a1(byte[] bArr, int i, int i2) throws c {
            M1(bArr, i, i2);
        }

        @Override // defpackage.sg1
        public final void q1(byte b) throws c {
            try {
                byte[] bArr = this.A;
                int i = this.C;
                this.C = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
            }
        }

        @Override // defpackage.sg1
        public final void r1(int i, boolean z) throws c {
            H1(i, 0);
            q1(z ? (byte) 1 : (byte) 0);
        }

        @Override // defpackage.sg1
        public final void s1(byte[] bArr, int i) throws c {
            J1(i);
            M1(bArr, 0, i);
        }

        @Override // defpackage.sg1
        public final void t1(int i, e01 e01Var) throws c {
            H1(i, 2);
            u1(e01Var);
        }

        @Override // defpackage.sg1
        public final void u1(e01 e01Var) throws c {
            J1(e01Var.size());
            e01Var.n(this);
        }

        @Override // defpackage.sg1
        public final void v1(int i, int i2) throws c {
            H1(i, 5);
            w1(i2);
        }

        @Override // defpackage.sg1
        public final void w1(int i) throws c {
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
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
            }
        }

        @Override // defpackage.sg1
        public final void x1(int i, long j) throws c {
            H1(i, 1);
            y1(j);
        }

        @Override // defpackage.sg1
        public final void y1(long j) throws c {
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
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.C), Integer.valueOf(this.B), 1), e);
            }
        }

        @Override // defpackage.sg1
        public final void z1(int i, int i2) throws c {
            H1(i, 0);
            A1(i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends a {
        public final s1b D;

        public d(s1b s1bVar, int i) {
            super(i);
            this.D = s1bVar;
        }

        @Override // defpackage.sg1
        public final void A1(int i) throws IOException {
            if (i >= 0) {
                J1(i);
            } else {
                L1(i);
            }
        }

        @Override // defpackage.sg1
        public final void B1(int i, au6 au6Var, w49 w49Var) throws IOException {
            H1(i, 2);
            J1(((z1) au6Var).f(w49Var));
            w49Var.i(au6Var, this.x);
        }

        @Override // defpackage.sg1
        public final void C1(au6 au6Var) throws IOException {
            J1(au6Var.b());
            au6Var.d(this);
        }

        @Override // defpackage.sg1
        public final void D1(int i, au6 au6Var) throws IOException {
            H1(1, 3);
            I1(2, i);
            H1(3, 2);
            C1(au6Var);
            H1(1, 4);
        }

        @Override // defpackage.sg1
        public final void E1(int i, e01 e01Var) throws IOException {
            H1(1, 3);
            I1(2, i);
            t1(3, e01Var);
            H1(1, 4);
        }

        @Override // defpackage.sg1
        public final void F1(int i, String str) throws IOException {
            H1(i, 2);
            G1(str);
        }

        @Override // defpackage.sg1
        public final void G1(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iN1 = sg1.n1(length);
                int i = iN1 + length;
                int i2 = this.B;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iB = g6b.a.b(str, bArr, 0, length);
                    J1(iB);
                    T1(bArr, 0, iB);
                    return;
                }
                if (i > i2 - this.C) {
                    R1();
                }
                int iN2 = sg1.n1(str.length());
                int i3 = this.C;
                byte[] bArr2 = this.A;
                try {
                    try {
                        if (iN2 == iN1) {
                            int i4 = i3 + iN2;
                            this.C = i4;
                            int iB2 = g6b.a.b(str, bArr2, i4, i2 - i4);
                            this.C = i3;
                            P1((iB2 - i3) - iN2);
                            this.C = iB2;
                        } else {
                            int iA = g6b.a(str);
                            P1(iA);
                            this.C = g6b.a.b(str, bArr2, this.C, iA);
                        }
                    } catch (g6b.d e) {
                        this.C = i3;
                        throw e;
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new c(e2);
                }
            } catch (g6b.d e3) {
                p1(str, e3);
            }
        }

        @Override // defpackage.sg1
        public final void H1(int i, int i2) throws IOException {
            J1((i << 3) | i2);
        }

        @Override // defpackage.sg1
        public final void I1(int i, int i2) throws IOException {
            S1(20);
            O1(i, 0);
            P1(i2);
        }

        @Override // defpackage.sg1
        public final void J1(int i) throws IOException {
            S1(5);
            P1(i);
        }

        @Override // defpackage.sg1
        public final void K1(int i, long j) throws IOException {
            S1(20);
            O1(i, 0);
            Q1(j);
        }

        @Override // defpackage.sg1
        public final void L1(long j) throws IOException {
            S1(10);
            Q1(j);
        }

        public final void R1() throws IOException {
            this.D.write(this.A, 0, this.C);
            this.C = 0;
        }

        public final void S1(int i) throws IOException {
            if (this.B - this.C < i) {
                R1();
            }
        }

        public final void T1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.C;
            int i4 = this.B;
            int i5 = i4 - i3;
            byte[] bArr2 = this.A;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.C += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.C = i4;
            R1();
            if (i7 > i4) {
                this.D.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.C = i7;
            }
        }

        @Override // defpackage.ln4
        public final void a1(byte[] bArr, int i, int i2) throws IOException {
            T1(bArr, i, i2);
        }

        @Override // defpackage.sg1
        public final void q1(byte b) throws IOException {
            if (this.C == this.B) {
                R1();
            }
            int i = this.C;
            this.C = i + 1;
            this.A[i] = b;
        }

        @Override // defpackage.sg1
        public final void r1(int i, boolean z) throws IOException {
            S1(11);
            O1(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.C;
            this.C = i2 + 1;
            this.A[i2] = b;
        }

        @Override // defpackage.sg1
        public final void s1(byte[] bArr, int i) throws IOException {
            J1(i);
            T1(bArr, 0, i);
        }

        @Override // defpackage.sg1
        public final void t1(int i, e01 e01Var) throws IOException {
            H1(i, 2);
            u1(e01Var);
        }

        @Override // defpackage.sg1
        public final void u1(e01 e01Var) throws IOException {
            J1(e01Var.size());
            e01Var.n(this);
        }

        @Override // defpackage.sg1
        public final void v1(int i, int i2) throws IOException {
            S1(14);
            O1(i, 5);
            M1(i2);
        }

        @Override // defpackage.sg1
        public final void w1(int i) throws IOException {
            S1(4);
            M1(i);
        }

        @Override // defpackage.sg1
        public final void x1(int i, long j) throws IOException {
            S1(18);
            O1(i, 1);
            N1(j);
        }

        @Override // defpackage.sg1
        public final void y1(long j) throws IOException {
            S1(8);
            N1(j);
        }

        @Override // defpackage.sg1
        public final void z1(int i, int i2) throws IOException {
            S1(20);
            O1(i, 0);
            if (i2 >= 0) {
                P1(i2);
            } else {
                Q1(i2);
            }
        }
    }

    public sg1() {
        super(4);
    }

    public static int h1(int i, e01 e01Var) {
        int iM1 = m1(i);
        int size = e01Var.size();
        return n1(size) + size + iM1;
    }

    public static int i1(ct5 ct5Var) {
        int iB;
        if (ct5Var.b != null) {
            iB = ct5Var.b.size();
        } else {
            iB = ct5Var.a != null ? ct5Var.a.b() : 0;
        }
        return n1(iB) + iB;
    }

    public static int j1(int i) {
        return n1((i >> 31) ^ (i << 1));
    }

    public static int k1(long j) {
        return o1((j >> 63) ^ (j << 1));
    }

    public static int l1(String str) {
        int length;
        try {
            length = g6b.a(str);
        } catch (g6b.d unused) {
            length = str.getBytes(xi5.a).length;
        }
        return n1(length) + length;
    }

    public static int m1(int i) {
        return n1(i << 3);
    }

    public static int n1(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int o1(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void A1(int i);

    public abstract void B1(int i, au6 au6Var, w49 w49Var);

    public abstract void C1(au6 au6Var);

    public abstract void D1(int i, au6 au6Var);

    public abstract void E1(int i, e01 e01Var);

    public abstract void F1(int i, String str);

    public abstract void G1(String str);

    public abstract void H1(int i, int i2);

    public abstract void I1(int i, int i2);

    public abstract void J1(int i);

    public abstract void K1(int i, long j);

    public abstract void L1(long j);

    public final void p1(String str, g6b.d dVar) throws c {
        y.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(xi5.a);
        try {
            J1(bytes.length);
            a1(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new c(e);
        }
    }

    public abstract void q1(byte b2);

    public abstract void r1(int i, boolean z2);

    public abstract void s1(byte[] bArr, int i);

    public abstract void t1(int i, e01 e01Var);

    public abstract void u1(e01 e01Var);

    public abstract void v1(int i, int i2);

    public abstract void w1(int i);

    public abstract void x1(int i, long j);

    public abstract void y1(long j);

    public abstract void z1(int i, int i2);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends IOException {
        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }

        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
