package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zy4 extends xm6 {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public az4 C;
    public pz4 D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public k95<Integer> I;
    public boolean J;
    public long K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final if2 p;
    public final of2 q;
    public final az4 r;
    public final boolean s;
    public final boolean t;
    public final apa u;
    public final yy4 v;
    public final List<id4> w;
    public final h83 x;
    public final u65 y;
    public final pt7 z;

    public zy4(yy4 yy4Var, if2 if2Var, of2 of2Var, id4 id4Var, boolean z, if2 if2Var2, of2 of2Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, apa apaVar, h83 h83Var, az4 az4Var, u65 u65Var, pt7 pt7Var, boolean z6, boolean z7, x38 x38Var) {
        super(if2Var, of2Var, id4Var, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3 ? j2 - j : -9223372036854775807L;
        this.l = i3;
        this.q = of2Var2;
        this.p = if2Var2;
        this.F = of2Var2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = apaVar;
        this.t = z4;
        this.v = yy4Var;
        this.w = list;
        this.x = h83Var;
        this.r = az4Var;
        this.y = u65Var;
        this.z = pt7Var;
        this.L = z6;
        this.n = z7;
        k95.b bVar = k95.u;
        this.I = ul8.x;
        this.k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (h40.f(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // yb6.d
    public final void a() {
        az4 az4Var;
        this.D.getClass();
        if (this.C == null && (az4Var = this.r) != null) {
            js3 js3VarB = ((xy0) az4Var).a.b();
            if ((js3VarB instanceof oya) || (js3VarB instanceof bh4)) {
                this.C = this.r;
                this.F = false;
            }
        }
        of2 of2Var = this.q;
        if2 if2Var = this.p;
        if (this.F) {
            if2Var.getClass();
            of2Var.getClass();
            c(if2Var, of2Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            c(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // yb6.d
    public final void b() {
        this.G = true;
    }

    public final void c(if2 if2Var, of2 of2Var, boolean z, boolean z2) {
        of2 of2Var2;
        boolean z3;
        long j;
        int i = this.E;
        if (z) {
            z3 = i != 0;
            of2Var2 = of2Var;
        } else {
            long j2 = i;
            long j3 = of2Var.f;
            long j4 = j3 != -1 ? j3 - j2 : -1L;
            of2Var2 = (j2 == 0 && j3 == j4) ? of2Var : new of2(of2Var.a, of2Var.b, of2Var.c, of2Var.d, of2Var.e + j2, j4, of2Var.g);
            z3 = false;
        }
        try {
            zq2 zq2VarG = g(if2Var, of2Var2, z2);
            if (z3) {
                zq2VarG.e(this.E, false);
            }
            while (!this.G && ((xy0) this.C).a.c(zq2VarG, xy0.f) == 0) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((xy0) this.C).a.e(0L, 0L);
                        j = zq2VarG.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (zq2VarG.d - of2Var.e);
                    throw th;
                }
            }
            j = zq2VarG.d;
            this.E = (int) (j - of2Var.e);
            nf2.a(if2Var);
        } catch (Throwable th2) {
            nf2.a(if2Var);
            throw th2;
        }
    }

    public final int e(int i) {
        xl7.r(!this.L);
        if (i >= this.I.size()) {
            return 0;
        }
        return this.I.get(i).intValue();
    }

    public final boolean f() {
        return this.K != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:106:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:128:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x01e7, please report this as an issue */
    public final zq2 g(if2 if2Var, of2 of2Var, boolean z) throws Throwable {
        zq2 zq2Var;
        long j;
        long jT;
        az4 az4Var;
        xy0 xy0VarA;
        js3 js3VarB;
        pz4 pz4Var;
        int i;
        xy0 xy0Var;
        js3 js3Var;
        js3 js3VarB2;
        boolean z2;
        boolean z3;
        Class<?> cls;
        js3 pz6Var;
        su6.a aVar;
        long jC = if2Var.c(of2Var);
        long jB = this.g;
        apa apaVar = this.u;
        if (z) {
            try {
                apaVar.g(jB, this.s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        zq2 zq2Var2 = new zq2(if2Var, of2Var.e, jC);
        int i2 = 0;
        if (this.C == null) {
            pt7 pt7Var = this.z;
            zq2Var2.f = 0;
            try {
                pt7Var.J(10);
                zq2Var2.f(pt7Var.a, 0, 10, false);
                if (pt7Var.C() != 4801587) {
                    zq2Var = null;
                } else {
                    pt7Var.N(3);
                    int iY = pt7Var.y();
                    int i3 = iY + 10;
                    byte[] bArr = pt7Var.a;
                    zq2Var = null;
                    if (i3 > bArr.length) {
                        pt7Var.J(i3);
                        System.arraycopy(bArr, 0, pt7Var.a, 0, 10);
                    }
                    zq2Var2.f(pt7Var.a, 10, iY, false);
                    su6 su6VarH1 = this.y.h1(pt7Var.a, iY);
                    if (su6VarH1 != null) {
                        su6.a[] aVarArr = su6VarH1.a;
                        int length = aVarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                j = -9223372036854775807L;
                                aVar = null;
                                break;
                            }
                            su6.a aVar2 = aVarArr[i4];
                            j = -9223372036854775807L;
                            if (v98.class.isAssignableFrom(aVar2.getClass())) {
                                aVar = (su6.a) v98.class.cast(aVar2);
                                if (!((v98) aVar).b.equals("com.apple.streaming.transportStreamTimestamp")) {
                                    aVar = null;
                                }
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                break;
                            }
                            i4++;
                        }
                        v98 v98Var = (v98) aVar;
                        if (v98Var == null) {
                            jT = j;
                        } else {
                            System.arraycopy(v98Var.c, 0, pt7Var.a, 0, 8);
                            pt7Var.M(0);
                            pt7Var.L(8);
                            jT = pt7Var.t() & 8589934591L;
                        }
                    }
                    zq2Var2.f = 0;
                    az4Var = this.r;
                    if (az4Var != null) {
                        xy0Var = (xy0) az4Var;
                        js3Var = xy0Var.a;
                        js3VarB2 = js3Var.b();
                        if (!(js3VarB2 instanceof oya) || (js3VarB2 instanceof bh4)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        xl7.r(!z2);
                        if (js3Var.b() == js3Var) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        cls = js3Var.getClass();
                        if (z3) {
                            aa0.c(p2a.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                            return zq2Var;
                        }
                        if (js3Var instanceof llb) {
                            pz6Var = new llb(xy0Var.b.d, xy0Var.c, xy0Var.d, xy0Var.e);
                        } else if (js3Var instanceof zd) {
                            pz6Var = new zd(0);
                        } else if (js3Var instanceof d3) {
                            pz6Var = new d3();
                        } else if (js3Var instanceof h3) {
                            pz6Var = new h3();
                        } else {
                            if (js3Var instanceof pz6) {
                                aa0.c("Unexpected extractor type for recreation: ".concat(js3Var.getClass().getSimpleName()));
                                return zq2Var;
                            }
                            pz6Var = new pz6(0);
                        }
                        xy0VarA = new xy0(pz6Var, xy0Var.b, xy0Var.c, xy0Var.d, xy0Var.e);
                    } else {
                        xy0VarA = this.v.a(of2Var.a, this.d, this.w, this.u, if2Var.k(), zq2Var2);
                        zq2Var2 = zq2Var2;
                    }
                    xy0 xy0Var2 = xy0VarA;
                    this.C = xy0Var2;
                    js3VarB = xy0Var2.a.b();
                    if (!(js3VarB instanceof zd) || (js3VarB instanceof d3) || (js3VarB instanceof h3) || (js3VarB instanceof pz6)) {
                        pz4Var = this.D;
                        if (jT != j) {
                            jB = apaVar.b(jT);
                        }
                        if (pz4Var.p0 != jB) {
                            pz4Var.p0 = jB;
                            for (pz4.b bVar : pz4Var.O) {
                                if (bVar.H != jB) {
                                    bVar.H = jB;
                                    bVar.B = true;
                                }
                            }
                        }
                    } else {
                        pz4 pz4Var2 = this.D;
                        if (pz4Var2.p0 != 0) {
                            pz4Var2.p0 = 0L;
                            for (pz4.b bVar2 : pz4Var2.O) {
                                if (bVar2.H != 0) {
                                    bVar2.H = 0L;
                                    bVar2.B = true;
                                }
                            }
                        }
                    }
                    this.D.Q.clear();
                    ((xy0) this.C).a.g(this.D);
                }
                jT = -9223372036854775807L;
                j = -9223372036854775807L;
            } catch (EOFException unused2) {
                zq2Var = null;
                j = -9223372036854775807L;
            }
            zq2Var2.f = 0;
            az4Var = this.r;
            if (az4Var != null) {
                xy0Var = (xy0) az4Var;
                js3Var = xy0Var.a;
                js3VarB2 = js3Var.b();
                if (js3VarB2 instanceof oya) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                xl7.r(!z2);
                if (js3Var.b() == js3Var) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                cls = js3Var.getClass();
                if (z3) {
                    aa0.c(p2a.a("Can't recreate wrapped extractors. Outer type: %s", cls));
                    return zq2Var;
                }
                if (js3Var instanceof llb) {
                    pz6Var = new llb(xy0Var.b.d, xy0Var.c, xy0Var.d, xy0Var.e);
                } else if (js3Var instanceof zd) {
                    pz6Var = new zd(0);
                } else if (js3Var instanceof d3) {
                    pz6Var = new d3();
                } else if (js3Var instanceof h3) {
                    pz6Var = new h3();
                } else {
                    if (js3Var instanceof pz6) {
                        aa0.c("Unexpected extractor type for recreation: ".concat(js3Var.getClass().getSimpleName()));
                        return zq2Var;
                    }
                    pz6Var = new pz6(0);
                }
                xy0VarA = new xy0(pz6Var, xy0Var.b, xy0Var.c, xy0Var.d, xy0Var.e);
            } else {
                xy0VarA = this.v.a(of2Var.a, this.d, this.w, this.u, if2Var.k(), zq2Var2);
                zq2Var2 = zq2Var2;
            }
            xy0 xy0Var3 = xy0VarA;
            this.C = xy0Var3;
            js3VarB = xy0Var3.a.b();
            if (js3VarB instanceof zd) {
                pz4Var = this.D;
                if (jT != j) {
                    jB = apaVar.b(jT);
                }
                if (pz4Var.p0 != jB) {
                    pz4Var.p0 = jB;
                    while (i < r3) {
                        if (bVar.H != jB) {
                            bVar.H = jB;
                            bVar.B = true;
                        }
                    }
                }
            } else {
                pz4Var = this.D;
                if (jT != j) {
                    jB = apaVar.b(jT);
                }
                if (pz4Var.p0 != jB) {
                    pz4Var.p0 = jB;
                    while (i < r3) {
                        if (bVar.H != jB) {
                            bVar.H = jB;
                            bVar.B = true;
                        }
                    }
                }
            }
            this.D.Q.clear();
            ((xy0) this.C).a.g(this.D);
        }
        pz4 pz4Var3 = this.D;
        h83 h83Var = pz4Var3.q0;
        h83 h83Var2 = this.x;
        if (!Objects.equals(h83Var, h83Var2)) {
            pz4Var3.q0 = h83Var2;
            while (true) {
                pz4.b[] bVarArr = pz4Var3.O;
                if (i2 >= bVarArr.length) {
                    break;
                }
                if (pz4Var3.h0[i2]) {
                    pz4.b bVar3 = bVarArr[i2];
                    bVar3.K = h83Var2;
                    bVar3.B = true;
                }
                i2++;
            }
        }
        return zq2Var2;
    }
}
