package defpackage;

import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b07 implements ce3 {
    public String e;
    public hsa f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final pt7 a = new pt7(new byte[15], 2);
    public final ot7 b = new ot7();
    public final pt7 c = new pt7();
    public final c07.a p = new c07.a();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // defpackage.ce3
    public final void a(pt7 pt7Var) throws ut7 {
        int i;
        int i2;
        int iG;
        int iG2;
        int i3;
        char c;
        byte[] bArr;
        long j;
        long j2;
        ul8 ul8VarW;
        int iG3;
        long j3;
        boolean z;
        int i4;
        this.f.getClass();
        while (pt7Var.a() > 0) {
            int i5 = this.d;
            int i6 = 8;
            int i7 = 3;
            int i8 = 1;
            if (i5 != 0) {
                pt7 pt7Var2 = this.c;
                c07.a aVar = this.p;
                if (i5 == 1) {
                    int iA = pt7Var.a();
                    pt7 pt7Var3 = this.a;
                    int iMin = Math.min(iA, pt7Var3.a());
                    pt7Var.k(pt7Var3.a, pt7Var3.b, iMin);
                    pt7Var3.N(iMin);
                    if (pt7Var3.a() == 0) {
                        int i9 = pt7Var3.c;
                        byte[] bArr2 = pt7Var3.a;
                        ot7 ot7Var = this.b;
                        ot7Var.l(bArr2, i9);
                        ot7Var.d();
                        int iA2 = c07.a(ot7Var, 3, 8, 8);
                        aVar.a = iA2;
                        if (iA2 != -1) {
                            xl7.g(Math.max(Math.max(2, 8), 32) <= 63);
                            le6.a(le6.a(3L, 255L), 4294967296L);
                            if (ot7Var.b() < 2) {
                                j3 = -1;
                            } else {
                                long jI = ot7Var.i(2);
                                if (jI == 3) {
                                    if (ot7Var.b() >= 8) {
                                        long jI2 = ot7Var.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (ot7Var.b() >= 32) {
                                                jI = ot7Var.i(32) + jI;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jI;
                            }
                            aVar.b = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw ut7.c("Contains sub-stream with an invalid packet label " + aVar.b);
                                }
                                if (j3 == 0) {
                                    int i10 = aVar.a;
                                    if (i10 == 1) {
                                        throw ut7.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i10 == 2) {
                                        throw ut7.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i10 == 17) {
                                        throw ut7.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iA3 = c07.a(ot7Var, 11, 24, 24);
                                aVar.c = iA3;
                                if (iA3 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i4 = 0;
                            this.n = 0;
                            this.o = aVar.c + i9 + this.o;
                        } else {
                            i4 = 0;
                        }
                        if (z) {
                            pt7Var3.M(i4);
                            this.f.e(pt7Var3.c, pt7Var3);
                            pt7Var3.J(2);
                            pt7Var2.J(aVar.c);
                            this.m = true;
                            this.d = 2;
                        } else {
                            int i11 = pt7Var3.c;
                            if (i11 < 15) {
                                pt7Var3.L(i11 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i5 != 2) {
                        d43.c();
                        return;
                    }
                    int i12 = aVar.a;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = pt7Var.b;
                        int iMin2 = Math.min(pt7Var.a(), pt7Var2.a());
                        pt7Var.k(pt7Var2.a, pt7Var2.b, iMin2);
                        pt7Var2.N(iMin2);
                        pt7Var.M(i13);
                    }
                    int iMin3 = Math.min(pt7Var.a(), aVar.c - this.n);
                    this.f.e(iMin3, pt7Var);
                    int i14 = this.n + iMin3;
                    this.n = i14;
                    if (i14 != aVar.c) {
                        continue;
                    } else {
                        int i15 = aVar.a;
                        if (i15 == 1) {
                            byte[] bArr3 = pt7Var2.a;
                            ot7 ot7Var2 = new ot7(bArr3, bArr3.length);
                            int iG4 = ot7Var2.g(8);
                            int iG5 = ot7Var2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = 48000;
                                        break;
                                    case 4:
                                        iG2 = AudioConstants.AUDIO_SAMPLE_RATE;
                                        break;
                                    case 5:
                                        iG2 = 32000;
                                        break;
                                    case 6:
                                        iG2 = 24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = 16000;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case 10:
                                        iG2 = 11025;
                                        break;
                                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                        iG2 = 8000;
                                        break;
                                    case 12:
                                        iG2 = 7350;
                                        break;
                                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                    case 14:
                                    default:
                                        throw ut7.c("Unsupported sampling rate index " + iG5);
                                    case h4c.e /* 15 */:
                                        iG2 = 57600;
                                        break;
                                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case 19:
                                        iG2 = 34150;
                                        break;
                                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case 23:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case 25:
                                        iG2 = 14400;
                                        break;
                                    case 26:
                                        iG2 = 12800;
                                        break;
                                    case 27:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = ot7Var2.g(24);
                            }
                            int iG6 = ot7Var2.g(3);
                            if (iG6 == 0) {
                                i3 = 768;
                            } else if (iG6 == 1) {
                                i3 = 1024;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i3 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                            } else {
                                if (iG6 != 4) {
                                    throw ut7.c("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i3 = 4096;
                            }
                            int i16 = i3;
                            if (iG6 == 0 || iG6 == 1) {
                                c = 0;
                            } else if (iG6 == 2) {
                                c = 2;
                            } else if (iG6 == 3) {
                                c = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw ut7.c("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c = 1;
                            }
                            ot7Var2.o(2);
                            c07.c(ot7Var2);
                            int iG7 = ot7Var2.g(5);
                            int i17 = 0;
                            int iA4 = 0;
                            while (true) {
                                int i18 = i8;
                                int i19 = 16;
                                if (i17 < iG7 + 1) {
                                    int iG8 = ot7Var2.g(3);
                                    iA4 = c07.a(ot7Var2, 5, 8, 16) + 1 + iA4;
                                    if ((iG8 == 0 || iG8 == 2) && ot7Var2.f()) {
                                        c07.c(ot7Var2);
                                    }
                                    i17++;
                                    i8 = i18;
                                } else {
                                    int iA5 = c07.a(ot7Var2, 4, 8, 16) + 1;
                                    ot7Var2.n();
                                    int i20 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i20 < iA5) {
                                            int iG9 = ot7Var2.g(2);
                                            if (iG9 == 0) {
                                                ot7Var2.o(i7);
                                                if (ot7Var2.f()) {
                                                    ot7Var2.o(13);
                                                }
                                                if (c > 0) {
                                                    c07.b(ot7Var2);
                                                }
                                            } else if (iG9 == i18) {
                                                ot7Var2.o(i7);
                                                boolean zF = ot7Var2.f();
                                                if (zF) {
                                                    ot7Var2.o(13);
                                                }
                                                if (zF) {
                                                    ot7Var2.n();
                                                }
                                                if (c > 0) {
                                                    c07.b(ot7Var2);
                                                    iG3 = ot7Var2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    ot7Var2.o(6);
                                                    int iG10 = ot7Var2.g(2);
                                                    ot7Var2.o(4);
                                                    if (ot7Var2.f()) {
                                                        ot7Var2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == i7) {
                                                        ot7Var2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        ot7Var2.n();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iA4 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = ot7Var2.g(2);
                                                if (iG11 > 0 && ot7Var2.f()) {
                                                    ot7Var2.o(iFloor);
                                                }
                                                if (ot7Var2.f()) {
                                                    ot7Var2.o(iFloor);
                                                }
                                                if (c == 0 && iG11 == 0) {
                                                    ot7Var2.n();
                                                }
                                            } else if (iG9 == i7) {
                                                c07.a(ot7Var2, 4, i6, i19);
                                                int iA6 = c07.a(ot7Var2, 4, i6, i19);
                                                if (ot7Var2.f()) {
                                                    c07.a(ot7Var2, i6, i19, 0);
                                                }
                                                ot7Var2.n();
                                                if (iA6 > 0) {
                                                    ot7Var2.o(iA6 * 8);
                                                }
                                            }
                                            i20++;
                                            i6 = 8;
                                            i7 = 3;
                                            i19 = 16;
                                            i18 = 1;
                                        } else {
                                            if (ot7Var2.f()) {
                                                int i21 = 8;
                                                int iA7 = c07.a(ot7Var2, 2, 4, 8) + 1;
                                                int i22 = 0;
                                                bArr = null;
                                                while (i22 < iA7) {
                                                    int iA8 = c07.a(ot7Var2, 4, i21, 16);
                                                    int iA9 = c07.a(ot7Var2, 4, i21, 16);
                                                    if (iA8 == 7) {
                                                        int iG12 = ot7Var2.g(4) + 1;
                                                        ot7Var2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i23 = 0; i23 < iG12; i23++) {
                                                            bArr4[i23] = (byte) ot7Var2.g(i21);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        ot7Var2.o(iA9 * i21);
                                                    }
                                                    i22++;
                                                    i21 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = iG4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iG4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            ul8VarW = null;
                                                        } else {
                                                            ul8VarW = k95.w(n6b.b, bArr);
                                                        }
                                                        id4.a aVar2 = new id4.a();
                                                        aVar2.a = this.e;
                                                        aVar2.m = fv6.n("video/mp2t");
                                                        aVar2.n = fv6.n("audio/mhm1");
                                                        aVar2.G = this.q;
                                                        aVar2.j = strConcat;
                                                        aVar2.q = ul8VarW;
                                                        this.f.g(new id4(aVar2));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            ul8VarW = null;
                                                        } else {
                                                            ul8VarW = null;
                                                        }
                                                        id4.a aVar3 = new id4.a();
                                                        aVar3.a = this.e;
                                                        aVar3.m = fv6.n("video/mp2t");
                                                        aVar3.n = fv6.n("audio/mhm1");
                                                        aVar3.G = this.q;
                                                        aVar3.j = strConcat;
                                                        aVar3.q = ul8VarW;
                                                        this.f.g(new id4(aVar3));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            ul8VarW = null;
                                                        } else {
                                                            ul8VarW = null;
                                                        }
                                                        id4.a aVar4 = new id4.a();
                                                        aVar4.a = this.e;
                                                        aVar4.m = fv6.n("video/mp2t");
                                                        aVar4.n = fv6.n("audio/mhm1");
                                                        aVar4.G = this.q;
                                                        aVar4.j = strConcat;
                                                        aVar4.q = ul8VarW;
                                                        this.f.g(new id4(aVar4));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case AudioConstants.AUDIO_SAMPLE_RATE /* 44100 */:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            ul8VarW = null;
                                                        } else {
                                                            ul8VarW = null;
                                                        }
                                                        id4.a aVar5 = new id4.a();
                                                        aVar5.a = this.e;
                                                        aVar5.m = fv6.n("video/mp2t");
                                                        aVar5.n = fv6.n("audio/mhm1");
                                                        aVar5.G = this.q;
                                                        aVar5.j = strConcat;
                                                        aVar5.q = ul8VarW;
                                                        this.f.g(new id4(aVar5));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw ut7.c("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr5 = pt7Var2.a;
                                ot7 ot7Var3 = new ot7(bArr5, bArr5.length);
                                if (ot7Var3.f()) {
                                    ot7Var3.o(2);
                                    iG = ot7Var3.g(13);
                                } else {
                                    iG = 0;
                                }
                                this.s = iG;
                            } else if (i15 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i24 = this.k;
                if ((i24 & 2) == 0) {
                    pt7Var.M(pt7Var.c);
                } else {
                    if ((i24 & 4) == 0) {
                        while (true) {
                            if (pt7Var.a() > 0) {
                                int i25 = this.l << 8;
                                this.l = i25;
                                int iZ = i25 | pt7Var.z();
                                this.l = iZ;
                                if ((iZ & 16777215) == 12583333) {
                                    pt7Var.M(pt7Var.b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // defpackage.ce3
    public final void c() {
        this.d = 0;
        this.l = 0;
        this.a.J(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.ce3
    public final void e(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.ce3
    public final void f(ls3 ls3Var, pya.c cVar) {
        cVar.a();
        cVar.b();
        this.e = cVar.e;
        cVar.b();
        this.f = ls3Var.p(cVar.d, 1);
    }

    @Override // defpackage.ce3
    public final void d(boolean z) {
    }
}
