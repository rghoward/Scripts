package defpackage;

import android.util.SparseArray;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uf8 implements js3 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public sf8 i;
    public ls3 j;
    public boolean k;
    public final apa a = new apa(0);
    public final pt7 c = new pt7(4096);
    public final SparseArray<a> b = new SparseArray<>();
    public final tf8 d = new tf8();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ce3 a;
        public final apa b;
        public final ot7 c = new ot7(new byte[64], 64);
        public boolean d;
        public boolean e;
        public boolean f;
        public long g;

        public a(ce3 ce3Var, apa apaVar) {
            this.a = ce3Var;
            this.b = apaVar;
        }
    }

    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) {
        char c;
        int i;
        ce3 ss4Var;
        long j;
        this.j.getClass();
        long jA = ks3Var.a();
        long j2 = -9223372036854775807L;
        tf8 tf8Var = this.d;
        if (jA != -1) {
            c = 3;
            if (!tf8Var.c) {
                apa apaVar = tf8Var.a;
                pt7 pt7Var = tf8Var.b;
                if (!tf8Var.e) {
                    long jA2 = ks3Var.a();
                    int iMin = (int) Math.min(20000L, jA2);
                    long j3 = jA2 - ((long) iMin);
                    if (ks3Var.getPosition() != j3) {
                        o68Var.a = j3;
                        return 1;
                    }
                    pt7Var.J(iMin);
                    ks3Var.l();
                    ks3Var.n(pt7Var.a, 0, iMin);
                    int i2 = pt7Var.b;
                    for (int i3 = pt7Var.c - 4; i3 >= i2; i3--) {
                        if (tf8.b(pt7Var.a, i3) == 442) {
                            pt7Var.M(i3 + 4);
                            long jC = tf8.c(pt7Var);
                            if (jC != -9223372036854775807L) {
                                j2 = jC;
                                break;
                            }
                        }
                    }
                    tf8Var.g = j2;
                    tf8Var.e = true;
                    return 0;
                }
                if (tf8Var.g == -9223372036854775807L) {
                    tf8Var.a(ks3Var);
                    return 0;
                }
                if (tf8Var.d) {
                    long j4 = tf8Var.f;
                    if (j4 == -9223372036854775807L) {
                        tf8Var.a(ks3Var);
                        return 0;
                    }
                    tf8Var.h = apaVar.c(tf8Var.g) - apaVar.b(j4);
                    tf8Var.a(ks3Var);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, ks3Var.a());
                if (ks3Var.getPosition() != 0) {
                    o68Var.a = 0L;
                    return 1;
                }
                pt7Var.J(iMin2);
                ks3Var.l();
                ks3Var.n(pt7Var.a, 0, iMin2);
                int i4 = pt7Var.c;
                for (int i5 = pt7Var.b; i5 < i4 - 3; i5++) {
                    if (tf8.b(pt7Var.a, i5) == 442) {
                        pt7Var.M(i5 + 4);
                        long jC2 = tf8.c(pt7Var);
                        if (jC2 != -9223372036854775807L) {
                            j = jC2;
                            tf8Var.f = j;
                            tf8Var.d = true;
                            return 0;
                        }
                    }
                }
                j = -9223372036854775807L;
                tf8Var.f = j;
                tf8Var.d = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            i = 4;
        } else {
            this.k = true;
            long j5 = tf8Var.h;
            if (j5 != -9223372036854775807L) {
                i = 4;
                sf8 sf8Var = new sf8(new bq0.b(), new sf8.a(tf8Var.a), j5, j5 + 1, 0L, jA, 188L, 1000);
                this.i = sf8Var;
                this.j.t(sf8Var.a);
            } else {
                i = 4;
                this.j.t(new t89.b(j5));
            }
        }
        sf8 sf8Var2 = this.i;
        if (sf8Var2 != null && sf8Var2.c != null) {
            return sf8Var2.a(ks3Var, o68Var);
        }
        ks3Var.l();
        long jG = jA != -1 ? jA - ks3Var.g() : -1L;
        if (jG != -1 && jG < 4) {
            return -1;
        }
        pt7 pt7Var2 = this.c;
        if (!ks3Var.f(pt7Var2.a, 0, i, true)) {
            return -1;
        }
        pt7Var2.M(0);
        int iM = pt7Var2.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            ks3Var.n(pt7Var2.a, 0, 10);
            pt7Var2.M(9);
            ks3Var.m((pt7Var2.z() & 7) + 14);
            return 0;
        }
        if (iM == 443) {
            ks3Var.n(pt7Var2.a, 0, 2);
            pt7Var2.M(0);
            ks3Var.m(pt7Var2.G() + 6);
            return 0;
        }
        if (((iM & (-256)) >> 8) != 1) {
            ks3Var.m(1);
            return 0;
        }
        int i6 = iM & 255;
        SparseArray<a> sparseArray = this.b;
        a aVar = sparseArray.get(i6);
        if (!this.e) {
            if (aVar == null) {
                if (i6 == 189) {
                    ss4Var = new e3("video/mp2p");
                    this.f = true;
                    this.h = ks3Var.getPosition();
                } else if ((iM & 224) == 192) {
                    ss4Var = new zz6(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = ks3Var.getPosition();
                } else if ((iM & 240) == 224) {
                    ss4Var = new ss4(null, "video/mp2p");
                    this.g = true;
                    this.h = ks3Var.getPosition();
                } else {
                    ss4Var = null;
                }
                if (ss4Var != null) {
                    ss4Var.f(this.j, new pya.c(i6, 256));
                    aVar = new a(ss4Var, this.a);
                    sparseArray.put(i6, aVar);
                }
            }
            if (ks3Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.k();
            }
        }
        ks3Var.n(pt7Var2.a, 0, 2);
        pt7Var2.M(0);
        int iG = pt7Var2.G() + 6;
        if (aVar == null) {
            ks3Var.m(iG);
            return 0;
        }
        pt7Var2.J(iG);
        ks3Var.readFully(pt7Var2.a, 0, iG);
        pt7Var2.M(6);
        ce3 ce3Var = aVar.a;
        ot7 ot7Var = aVar.c;
        pt7Var2.k(ot7Var.a, 0, 3);
        ot7Var.m(0);
        ot7Var.o(8);
        aVar.d = ot7Var.f();
        aVar.e = ot7Var.f();
        ot7Var.o(6);
        pt7Var2.k(ot7Var.a, 0, ot7Var.g(8));
        ot7Var.m(0);
        apa apaVar2 = aVar.b;
        aVar.g = 0L;
        if (aVar.d) {
            ot7Var.o(4);
            long jG2 = ((long) ot7Var.g(3)) << 30;
            ot7Var.o(1);
            long jG3 = jG2 | ((long) (ot7Var.g(15) << 15));
            ot7Var.o(1);
            long jG4 = jG3 | ((long) ot7Var.g(15));
            ot7Var.o(1);
            if (!aVar.f && aVar.e) {
                ot7Var.o(4);
                long jG5 = ((long) ot7Var.g(3)) << 30;
                ot7Var.o(1);
                long jG6 = jG5 | ((long) (ot7Var.g(15) << 15));
                ot7Var.o(1);
                long jG7 = jG6 | ((long) ot7Var.g(15));
                ot7Var.o(1);
                apaVar2.b(jG7);
                aVar.f = true;
            }
            aVar.g = apaVar2.b(jG4);
        }
        ce3Var.e(4, aVar.g);
        ce3Var.a(pt7Var2);
        ce3Var.d(false);
        pt7Var2.L(pt7Var2.a.length);
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        byte[] bArr = new byte[14];
        zq2 zq2Var = (zq2) ks3Var;
        zq2Var.f(bArr, 0, 14, false);
        if (442 == (((bArr[0] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[3] & MessagePack.Code.EXT_TIMESTAMP)) && (bArr[4] & MessagePack.Code.BIN8) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zq2Var.o(bArr[13] & 7, false);
            zq2Var.f(bArr, 0, 3, false);
            if (1 == (((bArr[0] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[1] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[2] & MessagePack.Code.EXT_TIMESTAMP))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        long j3;
        SparseArray<a> sparseArray = this.b;
        apa apaVar = this.a;
        synchronized (apaVar) {
            j3 = apaVar.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = apaVar.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            apaVar.f(j2);
        }
        sf8 sf8Var = this.i;
        if (sf8Var != null) {
            sf8Var.c(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            a aVarValueAt = sparseArray.valueAt(i);
            aVarValueAt.f = false;
            aVarValueAt.a.c();
        }
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.j = ls3Var;
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
