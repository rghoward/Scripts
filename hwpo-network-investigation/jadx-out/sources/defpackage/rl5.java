package defpackage;

import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rl5 implements js3 {
    public ls3 b;
    public int c;
    public int d;
    public int e;
    public sy6 g;
    public ks3 h;
    public qz9 i;
    public vz6 j;
    public final pt7 a = new pt7(2);
    public long f = -1;

    @Override // defpackage.js3
    public final void a() {
        vz6 vz6Var = this.j;
        if (vz6Var != null) {
            vz6Var.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        String strU;
        qy6 qy6VarA;
        ul8 ul8Var;
        int i;
        sy6 sy6Var;
        long j;
        int i2 = this.c;
        long j2 = -1;
        pt7 pt7Var = this.a;
        if (i2 == 0) {
            pt7Var.J(2);
            ks3Var.readFully(pt7Var.a, 0, 2);
            int iG = pt7Var.G();
            this.d = iG;
            if (iG == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                h();
                return 0;
            }
            if ((iG < 65488 || iG > 65497) && iG != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            pt7Var.J(2);
            ks3Var.n(pt7Var.a, 0, 2);
            this.e = pt7Var.G() - 2;
            ks3Var.m(2);
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    d43.c();
                    return 0;
                }
                if (this.i == null || ks3Var != this.h) {
                    this.h = ks3Var;
                    this.i = new qz9(ks3Var, this.f);
                }
                vz6 vz6Var = this.j;
                vz6Var.getClass();
                int iC = vz6Var.c(this.i, o68Var);
                if (iC == 1) {
                    o68Var.a += this.f;
                }
                return iC;
            }
            long position = ks3Var.getPosition();
            long j3 = this.f;
            if (position != j3) {
                o68Var.a = j3;
                return 1;
            }
            if (!ks3Var.f(pt7Var.a, 0, 1, true)) {
                h();
                return 0;
            }
            ks3Var.l();
            if (this.j == null) {
                this.j = new vz6(z4a.a.a, 8);
            }
            qz9 qz9Var = new qz9(ks3Var, this.f);
            this.i = qz9Var;
            if (!this.j.d(qz9Var)) {
                h();
                return 0;
            }
            vz6 vz6Var2 = this.j;
            long j4 = this.f;
            ls3 ls3Var = this.b;
            ls3Var.getClass();
            vz6Var2.g(new rz9(j4, ls3Var));
            sy6 sy6Var2 = this.g;
            sy6Var2.getClass();
            ls3 ls3Var2 = this.b;
            ls3Var2.getClass();
            hsa hsaVarP = ls3Var2.p(1024, 4);
            id4.a aVar = new id4.a();
            aVar.m = fv6.n("image/jpeg");
            aVar.k = new su6(sy6Var2);
            hy1.b(aVar, hsaVarP);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            pt7 pt7Var2 = new pt7(this.e);
            ks3Var.readFully(pt7Var2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(pt7Var2.u()) && (strU = pt7Var2.u()) != null) {
                long jA = ks3Var.a();
                if (jA == -1) {
                    sy6Var = null;
                } else {
                    try {
                        qy6VarA = krb.a(strU);
                    } catch (NumberFormatException | XmlPullParserException | ut7 unused) {
                        md6.g("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        qy6VarA = null;
                    }
                    if (qy6VarA != null && (i = (ul8Var = qy6VarA.b).w) >= 2) {
                        int i3 = i - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (i3 >= 0) {
                            qy6.a aVar2 = (qy6.a) ul8Var.get(i3);
                            String str = aVar2.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i3 == 0) {
                                jA -= aVar2.c;
                                j = 0;
                            } else {
                                j = jA - aVar2.b;
                            }
                            long j9 = jA;
                            jA = j;
                            if (z && jA != j9) {
                                j8 = j9 - jA;
                                j7 = jA;
                            }
                            if (i3 == 0) {
                                j6 = j9;
                                j5 = jA;
                            }
                            i3--;
                            j2 = j2;
                        }
                        long j10 = j2;
                        if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                            sy6Var = null;
                        } else {
                            sy6Var = new sy6(j5, j6, qy6VarA.a, j7, j8);
                        }
                    } else {
                        sy6Var = null;
                    }
                }
                this.g = sy6Var;
                if (sy6Var != null) {
                    this.f = sy6Var.d;
                }
            }
        } else {
            ks3Var.m(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        String strU;
        zq2 zq2Var = (zq2) ks3Var;
        pt7 pt7Var = this.a;
        pt7Var.J(2);
        zq2Var.f(pt7Var.a, 0, 2, false);
        if (pt7Var.G() == 65496) {
            while (true) {
                pt7Var.J(2);
                zq2Var.f(pt7Var.a, 0, 2, false);
                int iG = pt7Var.G();
                this.d = iG;
                if (iG == 65498) {
                    break;
                }
                pt7Var.J(2);
                zq2Var.n(pt7Var.a, 0, 2);
                int iG2 = pt7Var.G() - 2;
                if (iG2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    zq2Var.o(iG2, false);
                } else {
                    pt7Var.J(iG2);
                    zq2Var.f(pt7Var.a, 0, iG2, false);
                    if (Objects.equals(pt7Var.u(), "http://ns.adobe.com/xap/1.0/") && (strU = pt7Var.u()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (strU.contains(krb.a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            vz6 vz6Var = this.j;
            vz6Var.getClass();
            vz6Var.e(j, j2);
        }
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        this.b = ls3Var;
    }

    public final void h() {
        ls3 ls3Var = this.b;
        ls3Var.getClass();
        ls3Var.k();
        this.b.t(new t89.b(-9223372036854775807L));
        this.c = 6;
    }
}
