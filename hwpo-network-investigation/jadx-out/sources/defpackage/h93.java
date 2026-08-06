package defpackage;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h93 implements ce3 {
    public final pt7 a;
    public final String c;
    public final int d;
    public String f;
    public hsa g;
    public int i;
    public int j;
    public long k;
    public id4 l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public h93(String str, int i, int i2) {
        this.a = new pt7(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) throws ut7 {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int iG;
        int iG2;
        int iG3;
        int i5;
        long jU;
        int i6;
        long jU2;
        int i7;
        int i8;
        int i9;
        int i10;
        this.g.getClass();
        while (pt7Var.a() > 0) {
            int i11 = this.h;
            pt7 pt7Var2 = this.a;
            switch (i11) {
                case 0:
                    while (pt7Var.a() > 0) {
                        int i12 = this.j << 8;
                        this.j = i12;
                        int iZ = i12 | pt7Var.z();
                        this.j = iZ;
                        int iB = i93.b(iZ);
                        this.n = iB;
                        if (iB != 0) {
                            byte[] bArr = pt7Var2.a;
                            int i13 = this.j;
                            bArr[0] = (byte) ((i13 >> 24) & 255);
                            bArr[1] = (byte) ((i13 >> 16) & 255);
                            bArr[2] = (byte) ((i13 >> 8) & 255);
                            bArr[3] = (byte) (i13 & 255);
                            this.i = 4;
                            this.j = 0;
                            if (iB != 3 && iB != 4) {
                                if (iB == 1) {
                                    this.h = 1;
                                } else {
                                    this.h = 2;
                                }
                            }
                            this.h = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (b(pt7Var, pt7Var2.a, 18)) {
                        byte[] bArr2 = pt7Var2.a;
                        if (this.l == null) {
                            String str = this.f;
                            ot7 ot7VarC = i93.c(bArr2);
                            ot7VarC.o(60);
                            int i14 = i93.a[ot7VarC.g(6)];
                            int i15 = i93.b[ot7VarC.g(4)];
                            int iG4 = ot7VarC.g(5);
                            int i16 = iG4 >= 29 ? -1 : (i93.c[iG4] * 1000) / 2;
                            ot7VarC.o(10);
                            int i17 = i14 + (ot7VarC.g(2) > 0 ? 1 : 0);
                            id4.a aVar = new id4.a();
                            aVar.a = str;
                            aVar.m = fv6.n(this.e);
                            aVar.n = fv6.n("audio/vnd.dts");
                            aVar.h = i16;
                            aVar.F = i17;
                            aVar.G = i15;
                            aVar.r = null;
                            aVar.d = this.c;
                            aVar.f = this.d;
                            id4 id4Var = new id4(aVar);
                            this.l = id4Var;
                            this.g.g(id4Var);
                        }
                        this.m = i93.a(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.k = ek5.i1(n6b.S(this.l.H, (((i2 >> 2) | i) + 1) * 32));
                            pt7Var2.M(0);
                            this.g.e(18, pt7Var2);
                            this.h = 6;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.k = ek5.i1(n6b.S(this.l.H, (((i2 >> 2) | i) + 1) * 32));
                        pt7Var2.M(0);
                        this.g.e(18, pt7Var2);
                        this.h = 6;
                        break;
                    }
                    break;
                case 2:
                    if (b(pt7Var, pt7Var2.a, 7)) {
                        ot7 ot7VarC2 = i93.c(pt7Var2.a);
                        ot7VarC2.o(42);
                        this.o = ot7VarC2.g(ot7VarC2.f() ? 12 : 8) + 1;
                        this.h = 3;
                    }
                    break;
                case 3:
                    int i18 = 8;
                    if (b(pt7Var, pt7Var2.a, this.o)) {
                        ot7 ot7VarC3 = i93.c(pt7Var2.a);
                        ot7VarC3.o(40);
                        int iG5 = ot7VarC3.g(2);
                        if (ot7VarC3.f()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        ot7VarC3.o(i4);
                        int iG6 = ot7VarC3.g(i3) + 1;
                        boolean zF = ot7VarC3.f();
                        if (zF) {
                            iG = ot7VarC3.g(2);
                            iG2 = (ot7VarC3.g(3) + 1) * 512;
                            if (ot7VarC3.f()) {
                                ot7VarC3.o(36);
                            }
                            int iG7 = ot7VarC3.g(3) + 1;
                            int iG8 = ot7VarC3.g(3) + 1;
                            if (iG7 != 1 || iG8 != 1) {
                                throw ut7.c("Multiple audio presentations or assets not supported");
                            }
                            int i19 = iG5 + 1;
                            int iG9 = ot7VarC3.g(i19);
                            int i20 = 0;
                            while (i20 < i19) {
                                if (((iG9 >> i20) & 1) == 1) {
                                    ot7VarC3.o(i18);
                                }
                                i20++;
                                i18 = 8;
                            }
                            if (ot7VarC3.f()) {
                                ot7VarC3.o(2);
                                int iG10 = (ot7VarC3.g(2) + 1) << 2;
                                int iG11 = ot7VarC3.g(2) + 1;
                                for (int i21 = 0; i21 < iG11; i21++) {
                                    ot7VarC3.o(iG10);
                                }
                            }
                        } else {
                            iG = -1;
                            iG2 = 0;
                        }
                        ot7VarC3.o(i3);
                        ot7VarC3.o(12);
                        if (zF) {
                            if (ot7VarC3.f()) {
                                ot7VarC3.o(4);
                            }
                            if (ot7VarC3.f()) {
                                ot7VarC3.o(24);
                            }
                            if (ot7VarC3.f()) {
                                ot7VarC3.p(ot7VarC3.g(10) + 1);
                            }
                            ot7VarC3.o(5);
                            i5 = i93.d[ot7VarC3.g(4)];
                            iG3 = ot7VarC3.g(8) + 1;
                        } else {
                            iG3 = -1;
                            i5 = -2147483647;
                        }
                        if (zF) {
                            if (iG == 0) {
                                i6 = 32000;
                            } else if (iG == 1) {
                                i6 = AudioConstants.AUDIO_SAMPLE_RATE;
                            } else {
                                if (iG != 2) {
                                    throw ut7.a(null, "Unsupported reference clock code in DTS HD header: " + iG);
                                }
                                i6 = 48000;
                            }
                            String str2 = n6b.a;
                            jU = n6b.U(iG2, 1000000L, i6, RoundingMode.DOWN);
                        } else {
                            jU = -9223372036854775807L;
                        }
                        g(new i93.a("audio/vnd.dts.hd;profile=lbr", iG3, i5, iG6, jU));
                        this.m = iG6;
                        this.k = jU == -9223372036854775807L ? 0L : jU;
                        pt7Var2.M(0);
                        this.g.e(this.o, pt7Var2);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (b(pt7Var, pt7Var2.a, 6)) {
                        ot7 ot7VarC4 = i93.c(pt7Var2.a);
                        ot7VarC4.o(32);
                        int iD = i93.d(ot7VarC4, i93.i) + 1;
                        this.p = iD;
                        int i22 = this.i;
                        if (i22 > iD) {
                            int i23 = i22 - iD;
                            this.i = i22 - i23;
                            pt7Var.M(pt7Var.b - i23);
                        }
                        this.h = 5;
                    }
                    break;
                case 5:
                    if (b(pt7Var, pt7Var2.a, this.p)) {
                        byte[] bArr3 = pt7Var2.a;
                        ot7 ot7VarC5 = i93.c(bArr3);
                        int i24 = ot7VarC5.g(32) == 1078008818 ? 1 : 0;
                        int iD2 = i93.d(ot7VarC5, i93.e);
                        int i25 = iD2 + 1;
                        if (i24 == 0) {
                            jU2 = -9223372036854775807L;
                            i7 = -2147483647;
                        } else {
                            if (!ot7VarC5.f()) {
                                throw ut7.c("Only supports full channel mask-based audio presentation");
                            }
                            int i26 = iD2 - 1;
                            int i27 = ((bArr3[i26] << 8) & 65535) | (bArr3[iD2] & MessagePack.Code.EXT_TIMESTAMP);
                            String str3 = n6b.a;
                            int i28 = 65535;
                            for (int i29 = 0; i29 < i26; i29++) {
                                byte b4 = bArr3[i29];
                                int i30 = (((b4 & MessagePack.Code.EXT_TIMESTAMP) >> 4) ^ ((i28 >> 12) & 255)) & 255;
                                int[] iArr = n6b.i;
                                int i31 = (iArr[i30] ^ ((i28 << 4) & 65535)) & 65535;
                                i28 = (iArr[((b4 & 15) ^ ((i31 >> 12) & 255)) & 255] ^ ((i31 << 4) & 65535)) & 65535;
                            }
                            if (i27 != i28) {
                                throw ut7.a(null, "CRC check failed");
                            }
                            int iG12 = ot7VarC5.g(2);
                            if (iG12 != 0) {
                                if (iG12 == 1) {
                                    i9 = 480;
                                } else {
                                    if (iG12 != 2) {
                                        throw ut7.a(null, "Unsupported base duration index in DTS UHD header: " + iG12);
                                    }
                                    i9 = 384;
                                }
                                i8 = 3;
                            } else {
                                i8 = 3;
                                i9 = 512;
                            }
                            int iG13 = (ot7VarC5.g(i8) + 1) * i9;
                            int iG14 = ot7VarC5.g(2);
                            if (iG14 == 0) {
                                i10 = 32000;
                            } else if (iG14 == 1) {
                                i10 = AudioConstants.AUDIO_SAMPLE_RATE;
                            } else {
                                if (iG14 != 2) {
                                    throw ut7.a(null, "Unsupported clock rate index in DTS UHD header: " + iG14);
                                }
                                i10 = 48000;
                            }
                            if (ot7VarC5.f()) {
                                ot7VarC5.o(36);
                            }
                            int iG15 = i10 * (1 << ot7VarC5.g(2));
                            jU2 = n6b.U(iG13, 1000000L, i10, RoundingMode.DOWN);
                            i7 = iG15;
                        }
                        int iD3 = 0;
                        for (int i32 = 0; i32 < i24; i32++) {
                            iD3 += i93.d(ot7VarC5, i93.f);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i24 != 0) {
                            atomicInteger.set(i93.d(ot7VarC5, i93.g));
                        }
                        int iD4 = iD3 + (atomicInteger.get() != 0 ? i93.d(ot7VarC5, i93.h) : 0) + i25;
                        i93.a aVar2 = new i93.a("audio/vnd.dts.uhd;profile=p2", 2, i7, iD4, jU2);
                        if (this.n == 3) {
                            g(aVar2);
                        }
                        this.m = iD4;
                        this.k = jU2 == -9223372036854775807L ? 0L : jU2;
                        pt7Var2.M(0);
                        this.g.e(this.p, pt7Var2);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(pt7Var.a(), this.m - this.i);
                    this.g.e(iMin, pt7Var);
                    int i33 = this.i + iMin;
                    this.i = i33;
                    if (i33 == this.m) {
                        xl7.r(this.q != -9223372036854775807L);
                        this.g.a(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                    }
                    break;
                default:
                    d43.c();
                    return;
            }
        }
    }

    public final boolean b(pt7 pt7Var, byte[] bArr, int i) {
        int iMin = Math.min(pt7Var.a(), i - this.i);
        pt7Var.k(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // defpackage.ce3
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.q = j;
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = ls3Var.p(cVar.d, 1);
    }

    public final void g(i93.a aVar) {
        int i = aVar.b;
        String str = aVar.a;
        int i2 = aVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        id4 id4Var = this.l;
        if (id4Var != null && i2 == id4Var.G && i == id4Var.H && str.equals(id4Var.o)) {
            return;
        }
        id4 id4Var2 = this.l;
        id4.a aVar2 = id4Var2 == null ? new id4.a() : id4Var2.a();
        aVar2.a = this.f;
        aVar2.m = fv6.n(this.e);
        aVar2.n = fv6.n(str);
        aVar2.F = i2;
        aVar2.G = i;
        aVar2.d = this.c;
        aVar2.f = this.d;
        id4 id4Var3 = new id4(aVar2);
        this.l = id4Var3;
        this.g.g(id4Var3);
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
    }
}
