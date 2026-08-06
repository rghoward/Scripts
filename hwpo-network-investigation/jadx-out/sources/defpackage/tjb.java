package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tjb extends u1a {
    public a n;
    public int o;
    public boolean p;
    public ujb.c q;
    public ujb.a r;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ujb.c a;
        public final ujb.a b;
        public final byte[] c;
        public final ujb.b[] d;
        public final int e;

        public a(ujb.c cVar, ujb.a aVar, byte[] bArr, ujb.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    @Override // defpackage.u1a
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        ujb.c cVar = this.q;
        this.o = cVar != null ? cVar.e : 0;
    }

    @Override // defpackage.u1a
    public final long b(pt7 pt7Var) {
        byte b = pt7Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        a aVar = this.n;
        aVar.getClass();
        boolean z = aVar.d[(b >> 1) & (255 >>> (8 - aVar.e))].a;
        ujb.c cVar = aVar.a;
        int i = !z ? cVar.e : cVar.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = pt7Var.a;
        int length = bArr.length;
        int i2 = pt7Var.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            pt7Var.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            pt7Var.L(i2);
        }
        byte[] bArr2 = pt7Var.a;
        int i3 = pt7Var.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x03ac  */
    @Override // defpackage.u1a
    public final boolean c(pt7 pt7Var, long j, u1a.a aVar) throws ut7 {
        a aVar2;
        if (this.n != null) {
            aVar.a.getClass();
            return false;
        }
        ujb.c cVar = this.q;
        int i = 4;
        if (cVar != null) {
            ujb.a aVar3 = this.r;
            if (aVar3 == null) {
                this.r = ujb.b(pt7Var, true, true);
            } else {
                int i2 = pt7Var.c;
                byte[] bArr = new byte[i2];
                System.arraycopy(pt7Var.a, 0, bArr, 0, i2);
                int i3 = cVar.a;
                int i4 = 5;
                ujb.c(5, pt7Var, false);
                int iZ = pt7Var.z() + 1;
                rjb rjbVar = new rjb(pt7Var.a);
                int i5 = 8;
                rjbVar.c(pt7Var.b * 8);
                int i6 = 0;
                while (true) {
                    int i7 = i5;
                    int i8 = 16;
                    if (i6 >= iZ) {
                        ujb.c cVar2 = cVar;
                        int i9 = 6;
                        int iB = rjbVar.b(6) + 1;
                        for (int i10 = 0; i10 < iB; i10++) {
                            if (rjbVar.b(16) != 0) {
                                throw ut7.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i11 = 1;
                        int iB2 = rjbVar.b(6) + 1;
                        int i12 = 0;
                        while (true) {
                            int i13 = 3;
                            if (i12 >= iB2) {
                                int iB3 = rjbVar.b(i9) + 1;
                                int i14 = 0;
                                while (i14 < iB3) {
                                    if (rjbVar.b(16) > 2) {
                                        throw ut7.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    rjbVar.c(24);
                                    rjbVar.c(24);
                                    rjbVar.c(24);
                                    int iB4 = rjbVar.b(i9) + 1;
                                    int i15 = 8;
                                    rjbVar.c(8);
                                    int[] iArr = new int[iB4];
                                    for (int i16 = 0; i16 < iB4; i16++) {
                                        iArr[i16] = ((rjbVar.a() ? rjbVar.b(5) : 0) * 8) + rjbVar.b(3);
                                    }
                                    int i17 = 0;
                                    while (i17 < iB4) {
                                        int i18 = 0;
                                        while (i18 < i15) {
                                            if ((iArr[i17] & (1 << i18)) != 0) {
                                                rjbVar.c(i15);
                                            }
                                            i18++;
                                            i15 = 8;
                                        }
                                        i17++;
                                        i15 = 8;
                                    }
                                    i14++;
                                    i9 = 6;
                                }
                                int iB5 = rjbVar.b(i9) + 1;
                                for (int i19 = 0; i19 < iB5; i19++) {
                                    int iB6 = rjbVar.b(16);
                                    if (iB6 != 0) {
                                        md6.d("VorbisUtil", "mapping type other than 0 not supported: " + iB6);
                                    } else {
                                        int iB7 = rjbVar.a() ? rjbVar.b(4) + 1 : 1;
                                        if (rjbVar.a()) {
                                            int iB8 = rjbVar.b(8) + 1;
                                            for (int i20 = 0; i20 < iB8; i20++) {
                                                int i21 = i3 - 1;
                                                int i22 = 0;
                                                for (int i23 = i21; i23 > 0; i23 >>>= 1) {
                                                    i22++;
                                                }
                                                rjbVar.c(i22);
                                                int i24 = 0;
                                                while (i21 > 0) {
                                                    i24++;
                                                    i21 >>>= 1;
                                                }
                                                rjbVar.c(i24);
                                            }
                                        }
                                        if (rjbVar.b(2) != 0) {
                                            throw ut7.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iB7 > 1) {
                                            for (int i25 = 0; i25 < i3; i25++) {
                                                rjbVar.c(4);
                                            }
                                        }
                                        for (int i26 = 0; i26 < iB7; i26++) {
                                            rjbVar.c(8);
                                            rjbVar.c(8);
                                            rjbVar.c(8);
                                        }
                                    }
                                }
                                int iB9 = rjbVar.b(6);
                                int i27 = iB9 + 1;
                                ujb.b[] bVarArr = new ujb.b[i27];
                                for (int i28 = 0; i28 < i27; i28++) {
                                    boolean zA = rjbVar.a();
                                    rjbVar.b(16);
                                    rjbVar.b(16);
                                    rjbVar.b(8);
                                    bVarArr[i28] = new ujb.b(zA);
                                }
                                if (!rjbVar.a()) {
                                    throw ut7.a(null, "framing bit after modes not set as expected");
                                }
                                int i29 = 0;
                                while (iB9 > 0) {
                                    i29++;
                                    iB9 >>>= 1;
                                }
                                aVar2 = new a(cVar2, aVar3, bArr, bVarArr, i29);
                                break;
                            }
                            int iB10 = rjbVar.b(i8);
                            if (iB10 == 0) {
                                int i30 = i7;
                                rjbVar.c(i30);
                                rjbVar.c(16);
                                rjbVar.c(16);
                                rjbVar.c(6);
                                rjbVar.c(i30);
                                int iB11 = rjbVar.b(4) + 1;
                                int i31 = 0;
                                while (i31 < iB11) {
                                    rjbVar.c(i30);
                                    i31++;
                                    i30 = 8;
                                }
                            } else {
                                if (iB10 != i11) {
                                    throw ut7.a(null, "floor type greater than 1 not decodable: " + iB10);
                                }
                                int iB12 = rjbVar.b(5);
                                int[] iArr2 = new int[iB12];
                                int i32 = -1;
                                for (int i33 = 0; i33 < iB12; i33++) {
                                    int iB13 = rjbVar.b(4);
                                    iArr2[i33] = iB13;
                                    if (iB13 > i32) {
                                        i32 = iB13;
                                    }
                                }
                                int i34 = i32 + 1;
                                int[] iArr3 = new int[i34];
                                int i35 = 0;
                                while (i35 < i34) {
                                    iArr3[i35] = rjbVar.b(i13) + 1;
                                    int iB14 = rjbVar.b(2);
                                    int i36 = i7;
                                    if (iB14 > 0) {
                                        rjbVar.c(i36);
                                    }
                                    int i37 = i34;
                                    int i38 = 0;
                                    for (int i39 = 1; i38 < (i39 << iB14); i39 = 1) {
                                        rjbVar.c(i36);
                                        i38++;
                                        i36 = 8;
                                    }
                                    i35++;
                                    i34 = i37;
                                    i7 = 8;
                                    i13 = 3;
                                }
                                rjbVar.c(2);
                                int iB15 = rjbVar.b(4);
                                int i40 = 0;
                                int i41 = 0;
                                for (int i42 = 0; i42 < iB12; i42++) {
                                    i40 += iArr3[iArr2[i42]];
                                    while (i41 < i40) {
                                        rjbVar.c(iB15);
                                        i41++;
                                    }
                                }
                            }
                            i12++;
                            i7 = 8;
                            i9 = 6;
                            i11 = 1;
                            i8 = 16;
                        }
                    } else {
                        if (rjbVar.b(24) != 5653314) {
                            throw ut7.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((rjbVar.c * 8) + rjbVar.d));
                        }
                        int iB16 = rjbVar.b(16);
                        int iB17 = rjbVar.b(24);
                        if (rjbVar.a()) {
                            rjbVar.c(i4);
                            int iB18 = 0;
                            while (iB18 < iB17) {
                                int i43 = 0;
                                for (int i44 = iB17 - iB18; i44 > 0; i44 >>>= 1) {
                                    i43++;
                                }
                                iB18 += rjbVar.b(i43);
                            }
                        } else {
                            boolean zA2 = rjbVar.a();
                            for (int i45 = 0; i45 < iB17; i45++) {
                                if (!zA2) {
                                    rjbVar.c(i4);
                                } else if (rjbVar.a()) {
                                    rjbVar.c(i4);
                                }
                            }
                        }
                        int iB19 = rjbVar.b(i);
                        if (iB19 > 2) {
                            throw ut7.a(null, "lookup type greater than 2 not decodable: " + iB19);
                        }
                        if (iB19 == 1 || iB19 == 2) {
                            rjbVar.c(32);
                            rjbVar.c(32);
                            int iB20 = rjbVar.b(i) + 1;
                            rjbVar.c(1);
                            rjbVar.c((int) ((iB19 == 1 ? iB16 != 0 ? (long) Math.floor(Math.pow(iB17, 1.0d / ((double) iB16))) : 0L : ((long) iB16) * ((long) iB17)) * ((long) iB20)));
                        } else {
                            cVar = cVar;
                        }
                        i6++;
                        i5 = i7;
                        cVar = cVar;
                        i = 4;
                        i4 = 5;
                    }
                }
            }
            this.n = aVar2;
            if (aVar2 == null) {
                return true;
            }
            ujb.c cVar3 = aVar2.a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar3.g);
            arrayList.add(aVar2.c);
            su6 su6VarA = ujb.a(k95.r(aVar2.b.a));
            id4.a aVar4 = new id4.a();
            aVar4.m = fv6.n("audio/ogg");
            aVar4.n = fv6.n("audio/vorbis");
            aVar4.h = cVar3.d;
            aVar4.i = cVar3.c;
            aVar4.F = cVar3.a;
            aVar4.G = cVar3.b;
            aVar4.q = arrayList;
            aVar4.k = su6VarA;
            aVar.a = new id4(aVar4);
            return true;
        }
        ujb.c(1, pt7Var, false);
        pt7Var.r();
        int iZ2 = pt7Var.z();
        int iR = pt7Var.r();
        int iO = pt7Var.o();
        int i46 = iO <= 0 ? -1 : iO;
        int iO2 = pt7Var.o();
        int i47 = iO2 <= 0 ? -1 : iO2;
        pt7Var.o();
        int iZ3 = pt7Var.z();
        int iPow = (int) Math.pow(2.0d, iZ3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iZ3 & 240) >> 4);
        pt7Var.z();
        this.q = new ujb.c(iZ2, iR, i46, i47, iPow, iPow2, Arrays.copyOf(pt7Var.a, pt7Var.c));
        aVar2 = null;
        this.n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ujb.c cVar4 = aVar2.a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cVar4.g);
        arrayList2.add(aVar2.c);
        su6 su6VarA2 = ujb.a(k95.r(aVar2.b.a));
        id4.a aVar5 = new id4.a();
        aVar5.m = fv6.n("audio/ogg");
        aVar5.n = fv6.n("audio/vorbis");
        aVar5.h = cVar4.d;
        aVar5.i = cVar4.c;
        aVar5.F = cVar4.a;
        aVar5.G = cVar4.b;
        aVar5.q = arrayList2;
        aVar5.k = su6VarA2;
        aVar.a = new id4(aVar5);
        return true;
    }

    @Override // defpackage.u1a
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
