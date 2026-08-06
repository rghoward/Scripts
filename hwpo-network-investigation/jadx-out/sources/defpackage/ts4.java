package defpackage;

import java.util.Arrays;
import java.util.Collections;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ts4 implements ce3 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final n5b a;
    public final pt7 b;
    public final boolean[] c = new boolean[4];
    public final a d;
    public final e47 e;
    public b f;
    public long g;
    public String h;
    public hsa i;
    public boolean j;
    public long k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final byte[] f = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;

        public final void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c + i3;
                if (length < i4) {
                    this.e = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final hsa a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(hsa hsaVar) {
            this.a = hsaVar;
        }

        public final void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = (i2 - i) + i3;
                } else {
                    this.d = ((bArr[i4] & MessagePack.Code.NIL) >> 6) == 0;
                    this.c = false;
                }
            }
        }

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
        public final void b(int i, long j, boolean z) {
            xl7.r(this.h != -9223372036854775807L);
            if (this.e == 182 && z && this.b) {
                this.a.a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
            }
            if (this.e != 179) {
                this.g = j;
            }
        }
    }

    public ts4(n5b n5bVar) {
        this.a = n5bVar;
        a aVar = new a();
        aVar.e = new byte[128];
        this.d = aVar;
        this.k = -9223372036854775807L;
        this.e = new e47(178);
        this.b = new pt7();
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0230  */
    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = pt7Var.b;
        int i6 = pt7Var.c;
        byte[] bArr = pt7Var.a;
        this.g += (long) pt7Var.a();
        this.i.e(pt7Var.a(), pt7Var);
        while (true) {
            int iB = f47.b(bArr, i5, i6, this.c);
            a aVar = this.d;
            e47 e47Var = this.e;
            if (iB == i6) {
                if (!this.j) {
                    aVar.a(bArr, i5, i6);
                }
                this.f.a(bArr, i5, i6);
                if (e47Var != null) {
                    e47Var.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iB + 3;
            byte b2 = pt7Var.a[i7];
            int i8 = b2 & MessagePack.Code.EXT_TIMESTAMP;
            int i9 = iB - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    aVar.a(bArr, i5, iB);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = aVar.b;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            md6.g("H263Reader", "Unexpected start code value");
                            aVar.a = false;
                            aVar.c = 0;
                            aVar.b = 0;
                        } else {
                            aVar.b = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                d43.c();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                aVar.c -= i10;
                                aVar.a = false;
                                hsa hsaVar = this.i;
                                int i12 = aVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(aVar.e, aVar.c);
                                ot7 ot7Var = new ot7(bArrCopyOf, bArrCopyOf.length);
                                ot7Var.p(i12);
                                ot7Var.p(4);
                                ot7Var.n();
                                ot7Var.o(8);
                                if (ot7Var.f()) {
                                    ot7Var.o(4);
                                    ot7Var.o(3);
                                }
                                int iG = ot7Var.g(4);
                                if (iG == 15) {
                                    int iG2 = ot7Var.g(8);
                                    int iG3 = ot7Var.g(8);
                                    if (iG3 == 0) {
                                        md6.g("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iG2 / iG3;
                                    }
                                } else if (iG < 7) {
                                    f = l[iG];
                                } else {
                                    md6.g("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (ot7Var.f()) {
                                    ot7Var.o(2);
                                    ot7Var.o(1);
                                    if (ot7Var.f()) {
                                        ot7Var.o(15);
                                        ot7Var.n();
                                        ot7Var.o(15);
                                        ot7Var.n();
                                        ot7Var.o(15);
                                        ot7Var.n();
                                        ot7Var.o(3);
                                        ot7Var.o(11);
                                        ot7Var.n();
                                        ot7Var.o(15);
                                        ot7Var.n();
                                    }
                                }
                                if (ot7Var.g(2) != 0) {
                                    md6.g("H263Reader", "Unhandled video object layer shape");
                                }
                                ot7Var.n();
                                int iG4 = ot7Var.g(16);
                                ot7Var.n();
                                if (ot7Var.f()) {
                                    if (iG4 == 0) {
                                        md6.g("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i13 = 0;
                                        for (int i14 = iG4 - 1; i14 > 0; i14 >>= 1) {
                                            i13++;
                                        }
                                        ot7Var.o(i13);
                                    }
                                }
                                ot7Var.n();
                                int iG5 = ot7Var.g(13);
                                ot7Var.n();
                                int iG6 = ot7Var.g(13);
                                ot7Var.n();
                                ot7Var.n();
                                id4.a aVar2 = new id4.a();
                                aVar2.a = str;
                                aVar2.m = fv6.n("video/mp2t");
                                aVar2.n = fv6.n("video/mp4v-es");
                                aVar2.u = iG5;
                                aVar2.v = iG6;
                                aVar2.A = f;
                                aVar2.q = Collections.singletonList(bArrCopyOf);
                                hy1.b(aVar2, hsaVar);
                                this.j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b2 & 240) != 32) {
                            md6.g("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            aVar.a = false;
                            aVar.c = 0;
                            aVar.b = 0;
                        } else {
                            i4 = 0;
                            aVar.d = aVar.c;
                            aVar.b = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            md6.g("H263Reader", "Unexpected start code value");
                            aVar.a = false;
                            aVar.c = 0;
                            aVar.b = 0;
                        } else {
                            aVar.b = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        aVar.b = 1;
                        aVar.a = true;
                    }
                }
                aVar.a(a.f, i4, 3);
            }
            this.f.a(bArr, i5, iB);
            if (e47Var == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    e47Var.a(bArr, i5, iB);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (e47Var.b(i3)) {
                    int iM = f47.m(e47Var.d, e47Var.e);
                    String str2 = n6b.a;
                    byte[] bArr2 = e47Var.d;
                    pt7 pt7Var2 = this.b;
                    pt7Var2.K(bArr2, iM);
                    this.a.a(this.k, pt7Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (pt7Var.a[iB + 2] == 1) {
                        e47Var.d(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i15 = i - iB;
            this.f.b(i15, this.g - ((long) i15), this.j);
            b bVar = this.f;
            long j = this.k;
            bVar.e = i8;
            bVar.d = false;
            bVar.b = (i8 == 182 || i8 == 179) ? z : false;
            bVar.c = i8 == 182 ? z : false;
            bVar.f = 0;
            bVar.h = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        f47.a(this.c);
        a aVar = this.d;
        aVar.a = false;
        aVar.c = 0;
        aVar.b = 0;
        b bVar = this.f;
        if (bVar != null) {
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
        e47 e47Var = this.e;
        if (e47Var != null) {
            e47Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
        this.f.getClass();
        if (z) {
            this.f.b(0, this.g, this.j);
            b bVar = this.f;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.h = cVar.e;
        cVar.b();
        hsa hsaVarP = ls3Var.p(cVar.d, 2);
        this.i = hsaVarP;
        this.f = new b(hsaVarP);
        this.a.b(ls3Var, cVar);
    }
}
