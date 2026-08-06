package defpackage;

import java.util.Arrays;
import java.util.Collections;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ae implements ce3 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public hsa h;
    public hsa i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public hsa v;
    public long w;
    public final ot7 b = new ot7(new byte[7], 7);
    public final pt7 c = new pt7(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public ae(String str, String str2, int i, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.h.getClass();
        String str = n6b.a;
        while (pt7Var.a() > 0) {
            int i7 = this.j;
            byte b2 = -1;
            pt7 pt7Var2 = this.c;
            int i8 = 3;
            ot7 ot7Var = this.b;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = pt7Var.a;
                int i12 = pt7Var.b;
                int i13 = pt7Var.c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        byte b3 = bArr[i12];
                        int i16 = b3 & MessagePack.Code.EXT_TIMESTAMP;
                        if (this.l == 512 && ((65280 | (((byte) i16) & MessagePack.Code.EXT_TIMESTAMP ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i17 = i12 - 1;
                                pt7Var.M(i12);
                                byte[] bArr2 = ot7Var.a;
                                if (pt7Var.a() < i11) {
                                    b = -1;
                                } else {
                                    pt7Var.k(bArr2, i9, i11);
                                    ot7Var.m(i10);
                                    int iG = ot7Var.g(i11);
                                    int i18 = this.o;
                                    if (i18 == -1 || iG == i18) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = ot7Var.a;
                                            if (pt7Var.a() >= i11) {
                                                pt7Var.k(bArr3, i9, i11);
                                                ot7Var.m(2);
                                                i4 = 4;
                                                if (ot7Var.g(4) != this.p) {
                                                    b = -1;
                                                } else {
                                                    pt7Var.M(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = ot7Var.a;
                                        if (pt7Var.a() >= i4) {
                                            pt7Var.k(bArr4, i9, i4);
                                            ot7Var.m(14);
                                            int iG2 = ot7Var.g(13);
                                            if (iG2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = pt7Var.a;
                                                int i19 = pt7Var.c;
                                                int i20 = i17 + iG2;
                                                if (i20 < i19) {
                                                    byte b4 = bArr5[i20];
                                                    b = -1;
                                                    if (b4 == -1) {
                                                        int i21 = i20 + 1;
                                                        if (i21 != i19) {
                                                            byte b5 = bArr5[i21];
                                                            if (((65280 | (b5 & MessagePack.Code.EXT_TIMESTAMP ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b5 & 8) >> 3) == iG) {
                                                            }
                                                        }
                                                    } else if (b4 == 73 && ((i5 = i20 + 1) == i19 || (bArr5[i5] == 68 && ((i6 = i20 + 2) == i19 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.q = (b3 & 8) >> 3;
                            this.m = (b3 & 1) == 0;
                            if (this.n) {
                                this.j = i15;
                                this.k = 0;
                            } else {
                                this.j = 1;
                                this.k = 0;
                            }
                            pt7Var.M(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i22 = this.l;
                        int i23 = i16 | i22;
                        if (i23 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 768;
                        } else if (i23 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 512;
                        } else if (i23 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 1024;
                        } else if (i23 != 1075) {
                            c = 256;
                            if (i22 != 256) {
                                this.l = 256;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            pt7Var2.M(0);
                            pt7Var.M(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        pt7Var.M(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = pt7Var2.a;
                    int iMin = Math.min(pt7Var.a(), 10 - this.k);
                    pt7Var.k(bArr6, this.k, iMin);
                    int i24 = this.k + iMin;
                    this.k = i24;
                    if (i24 == 10) {
                        this.i.e(10, pt7Var2);
                        pt7Var2.M(6);
                        hsa hsaVar = this.i;
                        int iY = pt7Var2.y() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = hsaVar;
                        this.w = 0L;
                        this.t = iY;
                    }
                } else if (i7 == 3) {
                    int i25 = this.m ? 7 : 5;
                    byte[] bArr7 = ot7Var.a;
                    int iMin2 = Math.min(pt7Var.a(), i25 - this.k);
                    pt7Var.k(bArr7, this.k, iMin2);
                    int i26 = this.k + iMin2;
                    this.k = i26;
                    if (i26 == i25) {
                        ot7Var.m(0);
                        if (this.r) {
                            ot7Var.o(10);
                        } else {
                            int iG3 = ot7Var.g(2) + 1;
                            if (iG3 != 2) {
                                md6.g("AdtsReader", "Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = 2;
                            }
                            ot7Var.o(5);
                            int iG4 = ot7Var.g(3);
                            int i27 = this.p;
                            byte[] bArr8 = {(byte) (((iG3 << 3) & 248) | ((i27 >> 1) & 7)), (byte) (((iG4 << 3) & 120) | ((i27 << 7) & 128))};
                            x.a aVarB = x.b(new ot7(bArr8, 2), false);
                            id4.a aVar = new id4.a();
                            aVar.a = this.g;
                            aVar.m = fv6.n(this.f);
                            aVar.n = fv6.n("audio/mp4a-latm");
                            aVar.j = aVarB.c;
                            aVar.F = aVarB.b;
                            aVar.G = aVarB.a;
                            aVar.q = Collections.singletonList(bArr8);
                            aVar.d = this.d;
                            aVar.f = this.e;
                            id4 id4Var = new id4(aVar);
                            this.s = 1024000000 / ((long) id4Var.H);
                            this.h.g(id4Var);
                            this.r = true;
                        }
                        ot7Var.o(4);
                        int iG5 = ot7Var.g(13);
                        int i28 = iG5 - 7;
                        if (this.m) {
                            i28 = iG5 - 9;
                        }
                        hsa hsaVar2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = hsaVar2;
                        this.w = j;
                        this.t = i28;
                    }
                } else {
                    if (i7 != 4) {
                        d43.c();
                        return;
                    }
                    int iMin3 = Math.min(pt7Var.a(), this.t - this.k);
                    this.v.e(iMin3, pt7Var);
                    int i29 = this.k + iMin3;
                    this.k = i29;
                    if (i29 == this.t) {
                        xl7.r(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (pt7Var.a() != 0) {
                ot7Var.a[0] = pt7Var.a[pt7Var.b];
                ot7Var.m(2);
                int iG6 = ot7Var.g(4);
                int i30 = this.p;
                if (i30 == -1 || iG6 == i30) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = iG6;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.g = cVar.e;
        cVar.b();
        hsa hsaVarP = ls3Var.p(cVar.d, 1);
        this.h = hsaVarP;
        this.v = hsaVarP;
        if (!this.a) {
            this.i = new g13();
            return;
        }
        cVar.a();
        cVar.b();
        hsa hsaVarP2 = ls3Var.p(cVar.d, 5);
        this.i = hsaVarP2;
        id4.a aVar = new id4.a();
        cVar.b();
        aVar.a = cVar.e;
        aVar.m = fv6.n(this.f);
        aVar.n = fv6.n("application/id3");
        hy1.b(aVar, hsaVarP2);
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
    }
}
