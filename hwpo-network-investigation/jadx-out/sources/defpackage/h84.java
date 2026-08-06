package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h84 implements js3 {
    public final pt7 a = new pt7(4);
    public final pt7 b = new pt7(9);
    public final pt7 c = new pt7(11);
    public final pt7 d = new pt7();
    public final b69 e;
    public ls3 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public n90 o;
    public ufb p;

    public h84() {
        b69 b69Var = new b69(new g13());
        b69Var.b = -9223372036854775807L;
        b69Var.c = new long[0];
        b69Var.d = new long[0];
        this.e = b69Var;
        this.g = 1;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:144:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:184:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0291  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a6  */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws k8a.a {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        long j3;
        int i2;
        this.f.getClass();
        while (true) {
            int i3 = this.g;
            boolean z3 = true;
            if (i3 == 1) {
                pt7 pt7Var = this.b;
                if (!ks3Var.b(pt7Var.a, 0, 9, true)) {
                    return -1;
                }
                pt7Var.M(0);
                pt7Var.N(4);
                int iZ = pt7Var.z();
                boolean z4 = (iZ & 4) != 0;
                boolean z5 = (iZ & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new n90(this.f.p(8, 1));
                }
                if (z5 && this.p == null) {
                    i2 = 2;
                    this.p = new ufb(this.f.p(9, 2));
                } else {
                    i2 = 2;
                }
                this.f.k();
                this.j = pt7Var.m() - 5;
                this.g = i2;
            } else if (i3 == 2) {
                ks3Var.m(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                pt7 pt7Var2 = this.c;
                if (!ks3Var.b(pt7Var2.a, 0, 11, true)) {
                    return -1;
                }
                pt7Var2.M(0);
                this.k = pt7Var2.z();
                this.l = pt7Var2.C();
                this.m = pt7Var2.C();
                this.m = (((long) (pt7Var2.z() << 24)) | this.m) * 1000;
                pt7Var2.N(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    d43.c();
                    return 0;
                }
                boolean z6 = this.h;
                b69 b69Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else {
                    if (b69Var.b == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        int i4 = 4;
                        if (i != 9 && this.p != null) {
                            if (!this.n) {
                                this.f.t(new t89.b(-9223372036854775807L));
                                this.n = true;
                            }
                            ufb ufbVar = this.p;
                            pt7 pt7VarH = h(ks3Var);
                            ufbVar.getClass();
                            int iZ2 = pt7VarH.z();
                            int i5 = (iZ2 >> 4) & 15;
                            int i6 = iZ2 & 15;
                            if (i6 != 7) {
                                throw new k8a.a(pp2.a(i6, "Video format not supported: "));
                            }
                            ufbVar.g = i5;
                            if (i5 != 5) {
                                pt7 pt7Var3 = ufbVar.b;
                                hsa hsaVar = ufbVar.a;
                                pt7 pt7Var4 = ufbVar.c;
                                int iZ3 = pt7VarH.z();
                                pt7VarH.f(3);
                                byte[] bArr = pt7VarH.a;
                                int i7 = pt7VarH.b;
                                int i8 = i7 + 1;
                                pt7VarH.b = i8;
                                int i9 = ((bArr[i7] & MessagePack.Code.EXT_TIMESTAMP) << 24) >> 8;
                                int i10 = i7 + 2;
                                pt7VarH.b = i10;
                                int i11 = ((bArr[i8] & MessagePack.Code.EXT_TIMESTAMP) << 8) | i9;
                                pt7VarH.b = i7 + 3;
                                long j4 = (((long) (i11 | (bArr[i10] & MessagePack.Code.EXT_TIMESTAMP))) * 1000) + j2;
                                if (iZ3 != 0 || ufbVar.e) {
                                    if (iZ3 == 1 && ufbVar.e) {
                                        int i12 = ufbVar.g == 1 ? 1 : 0;
                                        if (ufbVar.f || i12 != 0) {
                                            byte[] bArr2 = pt7Var4.a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - ufbVar.d;
                                            int i14 = 0;
                                            while (pt7VarH.a() > 0) {
                                                pt7VarH.k(pt7Var4.a, i13, ufbVar.d);
                                                pt7Var4.M(0);
                                                int iD = pt7Var4.D();
                                                pt7Var3.M(0);
                                                hsaVar.e(i4, pt7Var3);
                                                hsaVar.e(iD, pt7VarH);
                                                i14 = i14 + 4 + iD;
                                                i4 = 4;
                                            }
                                            ufbVar.a.a(j4, i12, i14, 0, null);
                                            ufbVar.f = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[pt7VarH.a()];
                                    pt7 pt7Var5 = new pt7(bArr3);
                                    pt7VarH.k(bArr3, 0, pt7VarH.a());
                                    og0 og0VarA = og0.a(pt7Var5);
                                    ufbVar.d = og0VarA.b;
                                    id4.a aVar = new id4.a();
                                    aVar.m = fv6.n("video/x-flv");
                                    aVar.n = fv6.n("video/avc");
                                    aVar.j = og0VarA.l;
                                    aVar.u = og0VarA.c;
                                    aVar.v = og0VarA.d;
                                    aVar.A = og0VarA.k;
                                    aVar.q = og0VarA.a;
                                    hy1.b(aVar, hsaVar);
                                    ufbVar.e = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (i == 18 || this.n) {
                            ks3Var.m(this.l);
                            z = false;
                            z3 = false;
                        } else {
                            pt7 pt7VarH2 = h(ks3Var);
                            b69Var.getClass();
                            if (pt7VarH2.z() == 2 && "onMetaData".equals(b69.c(pt7VarH2)) && pt7VarH2.a() != 0 && pt7VarH2.z() == 8) {
                                HashMap<String, Object> mapB = b69.b(pt7VarH2);
                                Object obj = mapB.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        b69Var.b = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapB.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        b69Var.c = new long[size];
                                        b69Var.d = new long[size];
                                        for (int i15 = 0; i15 < size; i15++) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                b69Var.c = new long[0];
                                                b69Var.d = new long[0];
                                                break;
                                            }
                                            b69Var.c[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            b69Var.d[i15] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = b69Var.b;
                            if (j5 != -9223372036854775807L) {
                                this.f.t(new qa5(j5, b69Var.d, b69Var.c));
                                this.n = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.n) {
                            this.f.t(new t89.b(-9223372036854775807L));
                            this.n = true;
                        }
                        n90 n90Var = this.o;
                        pt7 pt7VarH3 = h(ks3Var);
                        hsa hsaVar2 = n90Var.a;
                        if (n90Var.b) {
                            pt7VarH3.N(1);
                        } else {
                            int iZ4 = pt7VarH3.z();
                            int i16 = (iZ4 >> 4) & 15;
                            n90Var.d = i16;
                            if (i16 == 2) {
                                int i17 = n90.e[(iZ4 >> 2) & 3];
                                id4.a aVar2 = new id4.a();
                                aVar2.m = fv6.n("video/x-flv");
                                aVar2.n = fv6.n("audio/mpeg");
                                aVar2.F = 1;
                                aVar2.G = i17;
                                hy1.b(aVar2, hsaVar2);
                                n90Var.c = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                id4.a aVar3 = new id4.a();
                                aVar3.m = fv6.n("video/x-flv");
                                aVar3.n = fv6.n(str);
                                aVar3.F = 1;
                                aVar3.G = 8000;
                                hy1.b(aVar3, hsaVar2);
                                n90Var.c = true;
                            } else if (i16 != 10) {
                                throw new k8a.a("Audio format not supported: " + n90Var.d);
                            }
                            n90Var.b = true;
                        }
                        hsa hsaVar3 = n90Var.a;
                        if (n90Var.d == 2) {
                            int iA = pt7VarH3.a();
                            hsaVar3.e(iA, pt7VarH3);
                            n90Var.a.a(j2, 1, iA, 0, null);
                        } else {
                            int iZ5 = pt7VarH3.z();
                            if (iZ5 == 0 && !n90Var.c) {
                                int iA2 = pt7VarH3.a();
                                byte[] bArr4 = new byte[iA2];
                                pt7VarH3.k(bArr4, 0, iA2);
                                x.a aVarB = x.b(new ot7(bArr4, iA2), false);
                                id4.a aVar4 = new id4.a();
                                aVar4.m = fv6.n("video/x-flv");
                                aVar4.n = fv6.n("audio/mp4a-latm");
                                aVar4.j = aVarB.c;
                                aVar4.F = aVarB.b;
                                aVar4.G = aVarB.a;
                                aVar4.q = Collections.singletonList(bArr4);
                                hy1.b(aVar4, hsaVar3);
                                n90Var.c = true;
                            } else if (n90Var.d != 10 || iZ5 == 1) {
                                int iA3 = pt7VarH3.a();
                                hsaVar3.e(iA3, pt7VarH3);
                                n90Var.a.a(j2, 1, iA3, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        if (b69Var.b == -9223372036854775807L) {
                            j3 = -this.m;
                        } else {
                            j3 = 0;
                        }
                        this.i = j3;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z3) {
                        return 0;
                    }
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                    int i18 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        ks3Var.m(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        ks3Var.m(this.l);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i19 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        ks3Var.m(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        ks3Var.m(this.l);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.h) {
                    this.h = true;
                    if (b69Var.b == -9223372036854775807L) {
                        j3 = -this.m;
                    } else {
                        j3 = 0;
                    }
                    this.i = j3;
                }
                this.j = 4;
                this.g = 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        pt7 pt7Var = this.a;
        zq2 zq2Var = (zq2) ks3Var;
        zq2Var.f(pt7Var.a, 0, 3, false);
        pt7Var.M(0);
        if (pt7Var.C() == 4607062) {
            zq2Var.f(pt7Var.a, 0, 2, false);
            pt7Var.M(0);
            if ((pt7Var.G() & 250) == 0) {
                zq2Var.f(pt7Var.a, 0, 4, false);
                pt7Var.M(0);
                int iM = pt7Var.m();
                zq2Var.f = 0;
                zq2Var.o(iM, false);
                zq2Var.f(pt7Var.a, 0, 4, false);
                pt7Var.M(0);
                if (pt7Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.f = ls3Var;
    }

    public final pt7 h(ks3 ks3Var) {
        int i = this.l;
        pt7 pt7Var = this.d;
        byte[] bArr = pt7Var.a;
        if (i > bArr.length) {
            pt7Var.K(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            pt7Var.M(0);
        }
        pt7Var.L(this.l);
        ks3Var.readFully(pt7Var.a, 0, this.l);
        return pt7Var;
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
