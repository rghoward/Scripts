package defpackage;

import android.util.Pair;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iv0 {
    public static final byte[] a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final pt7 f;
        public final pt7 g;
        public int h;
        public int i;

        public b(pt7 pt7Var, pt7 pt7Var2, boolean z) throws ut7 {
            this.g = pt7Var;
            this.f = pt7Var2;
            this.e = z;
            pt7Var2.M(12);
            this.a = pt7Var2.D();
            pt7Var.M(12);
            this.i = pt7Var.D();
            ms3.a("first_chunk must be 1", pt7Var.m() == 1);
            this.b = -1;
        }

        public final boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            boolean z = this.e;
            pt7 pt7Var = this.f;
            this.d = z ? pt7Var.F() : pt7Var.B();
            if (this.b == this.h) {
                pt7 pt7Var2 = this.g;
                this.c = pt7Var2.D();
                pt7Var2.N(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? pt7Var2.D() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;

        public c(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public final f a;

        public d(f fVar) {
            this.a = fVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public f(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public final csa[] a;
        public id4 b;
        public int c;
        public int d = 0;

        public g(int i) {
            this.a = new csa[i];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements e {
        public final int a;
        public final int b;
        public final pt7 c;

        public h(sz6.b bVar, id4 id4Var) {
            pt7 pt7Var = bVar.b;
            this.c = pt7Var;
            pt7Var.M(12);
            int iD = pt7Var.D();
            if ("audio/raw".equals(id4Var.o)) {
                int iS = n6b.s(id4Var.I) * id4Var.G;
                if (iD % iS != 0) {
                    md6.g("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iS + ", stsz sample size: " + iD);
                    iD = iS;
                }
            }
            this.a = iD == 0 ? -1 : iD;
            this.b = pt7Var.D();
        }

        @Override // iv0.e
        public final int a() {
            return this.a;
        }

        @Override // iv0.e
        public final int b() {
            return this.b;
        }

        @Override // iv0.e
        public final int c() {
            int i = this.a;
            return i == -1 ? this.c.D() : i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class i implements e {
        public final pt7 a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public i(sz6.b bVar) {
            pt7 pt7Var = bVar.b;
            this.a = pt7Var;
            pt7Var.M(12);
            this.c = pt7Var.D() & 255;
            this.b = pt7Var.D();
        }

        @Override // iv0.e
        public final int a() {
            return -1;
        }

        @Override // iv0.e
        public final int b() {
            return this.b;
        }

        @Override // iv0.e
        public final int c() {
            pt7 pt7Var = this.a;
            int i = this.c;
            if (i == 8) {
                return pt7Var.z();
            }
            if (i == 16) {
                return pt7Var.G();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int iZ = pt7Var.z();
            this.e = iZ;
            return (iZ & 240) >> 4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public j(int i, int i2, int i3, int i4, int i5, long j) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k {
        public final d a;

        public k(d dVar) {
            this.a = dVar;
        }
    }

    static {
        String str = n6b.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(pt7 pt7Var) {
        int i2 = pt7Var.b;
        pt7Var.N(4);
        if (pt7Var.m() != 1751411826) {
            i2 += 4;
        }
        pt7Var.M(i2);
    }

    /* JADX WARN: Code duplicated, block: B:205:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:274:0x0592  */
    /* JADX WARN: Code duplicated, block: B:286:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:292:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:366:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:93:0x016a  */
    public static void b(pt7 pt7Var, int i2, int i3, int i4, int i5, String str, boolean z, h83 h83Var, g gVar, int i6) throws ut7 {
        int iG;
        int i7;
        int iG2;
        int iM;
        int i8;
        int i9;
        int i10;
        h83 h83VarA;
        String str2;
        int iZ;
        String str3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean zF;
        int iG3;
        int iG4;
        int i20;
        int i21;
        boolean z2;
        boolean zF2;
        int i22;
        int iG5;
        String str4;
        pt7 pt7Var2 = pt7Var;
        int iIntValue = i2;
        int i23 = i4;
        pt7Var2.M(i3 + 16);
        if (z) {
            iG = pt7Var2.G();
            pt7Var2.N(6);
        } else {
            pt7Var2.N(8);
            iG = 0;
        }
        int i24 = 32;
        if (iG == 0 || iG == 1) {
            i7 = 2;
            iG2 = pt7Var2.G();
            pt7Var2.N(6);
            int iA = pt7Var2.A();
            pt7Var2.M(pt7Var2.b - 4);
            iM = pt7Var2.m();
            if (iG == 1) {
                pt7Var2.N(16);
            }
            i8 = iA;
            i9 = -1;
        } else {
            if (iG != 2) {
                return;
            }
            pt7Var2.N(16);
            int iRound = (int) Math.round(Double.longBitsToDouble(pt7Var2.t()));
            int iD = pt7Var2.D();
            pt7Var2.N(4);
            i7 = 2;
            int iD2 = pt7Var2.D();
            int iD3 = pt7Var2.D();
            boolean z3 = (iD3 & 1) != 0;
            boolean z4 = (iD3 & 2) != 0;
            if (z3) {
                if (z4 || iD2 != 32) {
                    i9 = -1;
                } else {
                    i9 = 4;
                }
            } else if (iD2 == 8) {
                i9 = 3;
            } else if (iD2 == 16) {
                i9 = z4 ? 268435456 : 2;
            } else if (iD2 == 24) {
                i9 = z4 ? 1342177280 : 21;
            } else if (iD2 == 32) {
                i9 = z4 ? 1610612736 : 22;
            } else {
                i9 = -1;
            }
            pt7Var2.N(8);
            i8 = iRound;
            iG2 = iD;
            iM = 0;
        }
        if (iIntValue == 1767992678) {
            iG2 = -1;
            i8 = -1;
        } else {
            if (iIntValue != 1935764850) {
                i10 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            i8 = i10;
            iG2 = 1;
        }
        int i25 = pt7Var2.b;
        if (iIntValue == 1701733217) {
            Pair<Integer, csa> pairH = h(pt7Var2, i3, i23);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                h83VarA = h83Var == null ? null : h83Var.a(((csa) pairH.second).b);
                gVar.a[i6] = (csa) pairH.second;
            } else {
                h83VarA = h83Var;
            }
            pt7Var2.M(i25);
        } else {
            h83VarA = h83Var;
        }
        String str5 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            iZ = i9;
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            iZ = i9;
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            iZ = i9;
            str2 = "audio/ac4";
        } else {
            if (iIntValue == 1685353315) {
                str2 = "audio/vnd.dts";
            } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
                str2 = "audio/vnd.dts.hd";
            } else if (iIntValue == 1685353317) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            } else if (iIntValue == 1685353336) {
                str2 = "audio/vnd.dts.uhd;profile=p2";
            } else if (iIntValue == 1935764850) {
                str2 = "audio/3gpp";
            } else if (iIntValue == 1935767394) {
                str2 = "audio/amr-wb";
            } else if (iIntValue == 1936684916) {
                iZ = i7;
                str2 = "audio/raw";
            } else if (iIntValue == 1953984371) {
                str2 = "audio/raw";
                iZ = 268435456;
            } else if (iIntValue == 1819304813) {
                if (i9 == -1) {
                    iZ = i7;
                } else {
                    iZ = i9;
                }
                str2 = "audio/raw";
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else if (iIntValue == 1767992678) {
                str2 = "audio/iamf";
            } else {
                iZ = i9;
                str2 = null;
            }
            iZ = i9;
        }
        c cVar = null;
        String strA = null;
        List<byte[]> listV = null;
        a aVar = null;
        while (i25 - i3 < i23) {
            pt7Var2.M(i25);
            int iM2 = pt7Var2.m();
            iZ = iZ;
            ms3.a("childAtomSize must be positive", iM2 > 0);
            int iM3 = pt7Var2.m();
            strA = strA;
            if (iM3 == 1835557187) {
                pt7Var2.M(i25 + 8);
                pt7Var2.N(1);
                int iZ2 = pt7Var2.z();
                pt7Var2.N(1);
                strA = Objects.equals(str2, str5) ? String.format("mhm1.%02X", Integer.valueOf(iZ2)) : String.format("mha1.%02X", Integer.valueOf(iZ2));
                int iG6 = pt7Var2.G();
                byte[] bArr = new byte[iG6];
                str3 = str2;
                pt7Var2.k(bArr, 0, iG6);
                listV = listV == null ? k95.v(bArr) : k95.w(bArr, listV.get(0));
            } else {
                str3 = str2;
                if (iM3 == 1835557200) {
                    pt7Var2.M(i25 + 8);
                    int iZ3 = pt7Var2.z();
                    if (iZ3 > 0) {
                        byte[] bArr2 = new byte[iZ3];
                        pt7Var2.k(bArr2, 0, iZ3);
                        listV = listV == null ? k95.v(bArr2) : k95.w(listV.get(0), bArr2);
                    }
                    listV = listV;
                    strA = strA;
                } else {
                    if (iM3 == 1702061171) {
                        i11 = 1702061171;
                    } else if (z && iM3 == 2002876005) {
                        i11 = 1702061171;
                    } else if (iM3 == 1651798644) {
                        pt7Var2.M(i25 + 8);
                        pt7Var2.N(4);
                        aVar = new a(pt7Var2.B(), pt7Var2.B());
                        i25 = i25;
                        str5 = str5;
                        listV = listV;
                        iZ = iZ;
                        strA = strA;
                        iM2 = iM2;
                        str3 = str3;
                        iIntValue = iIntValue;
                    } else {
                        iM2 = iM2;
                        int[] iArr = f3.d;
                        int[] iArr2 = f3.b;
                        if (iM3 == 1684103987) {
                            pt7Var2.M(i25 + 8);
                            String string = Integer.toString(i5);
                            ot7 ot7Var = new ot7();
                            ot7Var.k(pt7Var2);
                            int i26 = iArr2[ot7Var.g(i7)];
                            ot7Var.o(8);
                            int i27 = iArr[ot7Var.g(3)];
                            if (ot7Var.g(1) != 0) {
                                i27++;
                            }
                            int i28 = f3.e[ot7Var.g(5)] * 1000;
                            ot7Var.c();
                            pt7Var2.M(ot7Var.d());
                            id4.a aVar2 = new id4.a();
                            aVar2.a = string;
                            aVar2.n = fv6.n("audio/ac3");
                            aVar2.F = i27;
                            aVar2.G = i26;
                            aVar2.r = h83VarA;
                            aVar2.d = str;
                            aVar2.h = i28;
                            aVar2.i = i28;
                            gVar.b = new id4(aVar2);
                        } else if (iM3 == 1684366131) {
                            pt7Var2.M(i25 + 8);
                            String string2 = Integer.toString(i5);
                            ot7 ot7Var2 = new ot7();
                            ot7Var2.k(pt7Var2);
                            int iG7 = ot7Var2.g(13) * 1000;
                            ot7Var2.o(3);
                            int i29 = iArr2[ot7Var2.g(2)];
                            ot7Var2.o(10);
                            int i30 = iArr[ot7Var2.g(3)];
                            if (ot7Var2.g(1) != 0) {
                                i30++;
                            }
                            ot7Var2.o(3);
                            int iG8 = ot7Var2.g(4);
                            ot7Var2.o(1);
                            int i31 = i30;
                            if (iG8 > 0) {
                                ot7Var2.o(6);
                                i30 = ot7Var2.g(1) != 0 ? i31 + 2 : i31;
                                ot7Var2.o(1);
                            }
                            if (ot7Var2.b() > 7) {
                                ot7Var2.o(7);
                                if (ot7Var2.g(1) != 0) {
                                    str4 = "audio/eac3-joc";
                                } else {
                                    str4 = "audio/eac3";
                                }
                            } else {
                                str4 = "audio/eac3";
                            }
                            ot7Var2.c();
                            pt7Var2.M(ot7Var2.d());
                            id4.a aVar3 = new id4.a();
                            aVar3.a = string2;
                            aVar3.n = fv6.n(str4);
                            aVar3.F = i30;
                            aVar3.G = i29;
                            aVar3.r = h83VarA;
                            aVar3.d = str;
                            aVar3.i = iG7;
                            gVar.b = new id4(aVar3);
                        } else {
                            str5 = str5;
                            listV = listV;
                            if (iM3 == 1684103988) {
                                pt7Var2.M(i25 + 8);
                                String string3 = Integer.toString(i5);
                                ot7 ot7Var3 = new ot7();
                                ot7Var3.k(pt7Var2);
                                int iB = ot7Var3.b();
                                int iG9 = ot7Var3.g(3);
                                if (iG9 > 1) {
                                    throw ut7.c("Unsupported AC-4 DSI version: " + iG9);
                                }
                                int iG10 = ot7Var3.g(7);
                                int i32 = ot7Var3.f() ? 48000 : AudioConstants.AUDIO_SAMPLE_RATE;
                                ot7Var3.o(4);
                                int iG11 = ot7Var3.g(9);
                                if (iG10 > 1) {
                                    if (iG9 == 0) {
                                        throw ut7.c("Invalid AC-4 DSI version: " + iG9);
                                    }
                                    if (ot7Var3.f()) {
                                        ot7Var3.o(16);
                                        if (ot7Var3.f()) {
                                            ot7Var3.o(128);
                                        }
                                    }
                                }
                                if (iG9 == 1) {
                                    if (ot7Var3.b() < 66) {
                                        throw ut7.c("Invalid AC-4 DSI bitrate.");
                                    }
                                    ot7Var3.o(66);
                                    ot7Var3.c();
                                }
                                j3.a aVar4 = new j3.a();
                                aVar4.a = true;
                                aVar4.b = -1;
                                aVar4.c = -1;
                                aVar4.d = true;
                                i25 = i25;
                                aVar4.e = 2;
                                aVar4.f = 1;
                                aVar4.g = 0;
                                int i33 = 0;
                                while (true) {
                                    if (i33 < iG11) {
                                        if (iG9 == 0) {
                                            i15 = i8;
                                            zF = ot7Var3.f();
                                            iG3 = ot7Var3.g(5);
                                            iG4 = ot7Var3.g(5);
                                            i20 = 0;
                                            i21 = 0;
                                            z2 = false;
                                        } else {
                                            int i34 = iG11;
                                            int iG12 = ot7Var3.g(8);
                                            i15 = i8;
                                            int iG13 = ot7Var3.g(8);
                                            if (iG13 == 255) {
                                                iG13 = ot7Var3.g(16) + iG13;
                                            }
                                            if (iG12 > 2) {
                                                ot7Var3.o(iG13 * 8);
                                                i33++;
                                                iG11 = i34;
                                                i8 = i15;
                                            } else {
                                                int iB2 = (iB - ot7Var3.b()) / 8;
                                                int i35 = iG13;
                                                int iG14 = ot7Var3.g(5);
                                                z2 = iG14 == 31;
                                                iG3 = iG14;
                                                i21 = iB2;
                                                i20 = i35;
                                                iG4 = iG12;
                                                zF = false;
                                            }
                                        }
                                        aVar4.f = iG4;
                                        i14 = iG2;
                                        if (zF || z2 || iG3 != 6) {
                                            aVar4.g = ot7Var3.g(3);
                                            if (ot7Var3.f()) {
                                                ot7Var3.o(5);
                                            }
                                            ot7Var3.o(2);
                                            int i36 = 1;
                                            if (iG9 == 1 && (iG4 == 1 || iG4 == 2)) {
                                                ot7Var3.o(2);
                                            }
                                            ot7Var3.o(5);
                                            ot7Var3.o(10);
                                            if (iG9 == 1) {
                                                if (iG4 > 0) {
                                                    aVar4.a = ot7Var3.f();
                                                }
                                                if (aVar4.a) {
                                                    if (iG4 != 1) {
                                                        i22 = 2;
                                                        if (iG4 == 2) {
                                                            iG5 = ot7Var3.g(5);
                                                            if (iG5 >= 0 && iG5 <= 15) {
                                                                aVar4.b = iG5;
                                                            }
                                                            if (iG5 >= 11 || iG5 > 14) {
                                                                i22 = 2;
                                                            } else {
                                                                aVar4.d = ot7Var3.f();
                                                                i22 = 2;
                                                                aVar4.e = ot7Var3.g(2);
                                                            }
                                                        }
                                                    } else {
                                                        iG5 = ot7Var3.g(5);
                                                        if (iG5 >= 0) {
                                                            aVar4.b = iG5;
                                                        }
                                                        if (iG5 >= 11) {
                                                            i22 = 2;
                                                        } else {
                                                            i22 = 2;
                                                        }
                                                    }
                                                    ot7Var3.o(24);
                                                    i36 = 1;
                                                } else {
                                                    i22 = 2;
                                                }
                                                if (iG4 == i36 || iG4 == i22) {
                                                    if (ot7Var3.f() && ot7Var3.f()) {
                                                        ot7Var3.o(i22);
                                                    }
                                                    if (ot7Var3.f()) {
                                                        ot7Var3.n();
                                                        int i37 = 8;
                                                        int iG15 = ot7Var3.g(8);
                                                        int i38 = 0;
                                                        while (i38 < iG15) {
                                                            ot7Var3.o(i37);
                                                            i38++;
                                                            i37 = 8;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!zF && !z2) {
                                                ot7Var3.n();
                                                if (iG3 == 0 || iG3 == 1 || iG3 == 2) {
                                                    if (iG4 == 0) {
                                                        for (int i39 = 0; i39 < 2; i39++) {
                                                            j3.c(ot7Var3, aVar4);
                                                        }
                                                    } else {
                                                        for (int i40 = 0; i40 < 2; i40++) {
                                                            j3.d(ot7Var3, aVar4);
                                                        }
                                                    }
                                                } else if (iG3 == 3 || iG3 == 4) {
                                                    if (iG4 == 0) {
                                                        for (int i41 = 0; i41 < 3; i41++) {
                                                            j3.c(ot7Var3, aVar4);
                                                        }
                                                    } else {
                                                        for (int i42 = 0; i42 < 3; i42++) {
                                                            j3.d(ot7Var3, aVar4);
                                                        }
                                                    }
                                                } else if (iG3 != 5) {
                                                    int iG16 = ot7Var3.g(7);
                                                    for (int i43 = 0; i43 < iG16; i43++) {
                                                        ot7Var3.o(8);
                                                    }
                                                } else if (iG4 == 0) {
                                                    j3.c(ot7Var3, aVar4);
                                                } else {
                                                    int iG17 = ot7Var3.g(3);
                                                    for (int i44 = 0; i44 < iG17 + 2; i44++) {
                                                        j3.d(ot7Var3, aVar4);
                                                    }
                                                }
                                            } else if (iG4 == 0) {
                                                j3.c(ot7Var3, aVar4);
                                            } else {
                                                j3.d(ot7Var3, aVar4);
                                            }
                                            ot7Var3.n();
                                            zF2 = ot7Var3.f();
                                        } else {
                                            iG4 = iG4;
                                            zF2 = true;
                                        }
                                        if (zF2) {
                                            int iG18 = ot7Var3.g(7);
                                            for (int i45 = 0; i45 < iG18; i45++) {
                                                ot7Var3.o(15);
                                            }
                                        }
                                        if (iG4 <= 0) {
                                            i16 = 8;
                                        } else {
                                            if (ot7Var3.f()) {
                                                if (ot7Var3.b() < 66) {
                                                    throw ut7.c("Can't parse bitrate DSI.");
                                                }
                                                ot7Var3.o(66);
                                            }
                                            if (ot7Var3.f()) {
                                                ot7Var3.c();
                                                ot7Var3.p(ot7Var3.g(16));
                                                int iG19 = ot7Var3.g(5);
                                                for (int i46 = 0; i46 < iG19; i46++) {
                                                    ot7Var3.o(3);
                                                    ot7Var3.o(8);
                                                }
                                                i16 = 8;
                                            } else {
                                                i16 = 8;
                                            }
                                        }
                                        ot7Var3.c();
                                        if (iG9 == 1) {
                                            int iB3 = ((iB - ot7Var3.b()) / i16) - i21;
                                            if (i20 < iB3) {
                                                throw ut7.c("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            ot7Var3.p(i20 - iB3);
                                        }
                                        if (aVar4.a && aVar4.b == -1) {
                                            throw ut7.c("Can't determine channel mode of presentation " + i33);
                                        }
                                    } else {
                                        iIntValue = iIntValue;
                                        i14 = iG2;
                                        i15 = i8;
                                        i16 = 8;
                                    }
                                    if (aVar4.a) {
                                        int i47 = aVar4.b;
                                        boolean z5 = aVar4.d;
                                        int i48 = aVar4.e;
                                        switch (i47) {
                                            case 0:
                                                i18 = 11;
                                                i19 = 1;
                                                break;
                                            case 1:
                                                i18 = 11;
                                                i19 = 2;
                                                break;
                                            case 2:
                                                i18 = 11;
                                                i19 = 3;
                                                break;
                                            case 3:
                                                i18 = 11;
                                                i19 = 5;
                                                break;
                                            case 4:
                                                i18 = 11;
                                                i19 = 6;
                                                break;
                                            case 5:
                                            case 7:
                                            case 9:
                                                i18 = 11;
                                                i19 = 7;
                                                break;
                                            case 6:
                                            case 8:
                                            case 10:
                                                i19 = i16;
                                                i18 = 11;
                                                break;
                                            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                                i18 = 11;
                                                i19 = 11;
                                                break;
                                            case 12:
                                                i19 = 12;
                                                i18 = 11;
                                                break;
                                            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                                i18 = 11;
                                                i19 = 13;
                                                break;
                                            case 14:
                                                i18 = 11;
                                                i19 = 14;
                                                break;
                                            case h4c.e /* 15 */:
                                                i18 = 11;
                                                i19 = 24;
                                                break;
                                            default:
                                                i18 = 11;
                                                i19 = -1;
                                                break;
                                        }
                                        if (i47 == i18 || i47 == 12 || i47 == 13 || i47 == 14) {
                                            if (!z5) {
                                                i19 -= 2;
                                            }
                                            if (i48 == 0) {
                                                i19 -= 4;
                                            } else if (i48 == 1) {
                                                i19 -= 2;
                                            }
                                        }
                                        i17 = i19;
                                    } else {
                                        int i49 = aVar4.c;
                                        int i50 = aVar4.g;
                                        if (i49 > 0) {
                                            i17 = i49 + 1;
                                            if (i50 == 4 && i17 == 17) {
                                                i17 = 21;
                                            }
                                        } else if (i50 == 0) {
                                            i17 = 2;
                                        } else if (i50 == 1) {
                                            i17 = 6;
                                        } else if (i50 == 2) {
                                            i17 = i16;
                                        } else if (i50 == 3) {
                                            i17 = 10;
                                        } else if (i50 != 4) {
                                            md6.g("Ac4Util", "AC-4 level " + aVar4.g + " has not been defined.");
                                            i17 = 2;
                                        } else {
                                            i17 = 12;
                                        }
                                    }
                                    if (i17 <= 0) {
                                        throw ut7.c("Cannot determine channel count of presentation.");
                                    }
                                    Object[] objArr = {Integer.valueOf(iG10), Integer.valueOf(aVar4.f), Integer.valueOf(aVar4.g)};
                                    String str6 = n6b.a;
                                    String str7 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                    id4.a aVar5 = new id4.a();
                                    aVar5.a = string3;
                                    aVar5.n = fv6.n("audio/ac4");
                                    aVar5.F = i17;
                                    aVar5.G = i32;
                                    aVar5.r = h83VarA;
                                    aVar5.d = str;
                                    aVar5.j = str7;
                                    gVar.b = new id4(aVar5);
                                    i8 = i15;
                                    iG2 = i14;
                                    iIntValue = iIntValue;
                                }
                            } else {
                                iIntValue = iIntValue;
                                i25 = i25;
                                iG2 = iG2;
                                i8 = i8;
                                if (iM3 == 1684892784) {
                                    if (iM <= 0) {
                                        throw ut7.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM);
                                    }
                                    i8 = iM;
                                    iG2 = 2;
                                } else if (iM3 == 1684305011 || iM3 == 1969517683) {
                                    iIntValue = iIntValue;
                                    id4.a aVar6 = new id4.a();
                                    aVar6.a = Integer.toString(i5);
                                    aVar6.n = fv6.n(str3);
                                    iG2 = iG2;
                                    aVar6.F = iG2;
                                    i8 = i8;
                                    aVar6.G = i8;
                                    aVar6.r = h83VarA;
                                    aVar6.d = str;
                                    gVar.b = new id4(aVar6);
                                } else if (iM3 == 1682927731) {
                                    int i51 = iM2 - 8;
                                    byte[] bArr3 = a;
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i51);
                                    pt7Var2.M(i25 + 8);
                                    pt7Var2.k(bArrCopyOf, bArr3.length, i51);
                                    listV = bl7.b(bArrCopyOf);
                                    i8 = i8;
                                    iG2 = iG2;
                                } else {
                                    if (iM3 == 1684425825) {
                                        byte[] bArr4 = new byte[iM2 - 8];
                                        bArr4[0] = 102;
                                        bArr4[1] = 76;
                                        bArr4[2] = 97;
                                        bArr4[3] = 67;
                                        pt7Var2.M(i25 + 12);
                                        pt7Var2.k(bArr4, 4, iM2 - 12);
                                        listV = k95.v(bArr4);
                                        strA = strA;
                                    } else if (iM3 == 1634492771) {
                                        int i52 = iM2 - 12;
                                        byte[] bArr5 = new byte[i52];
                                        pt7Var2.M(i25 + 12);
                                        pt7Var2.k(bArr5, 0, i52);
                                        byte[] bArr6 = og1.a;
                                        pt7 pt7Var3 = new pt7(bArr5);
                                        pt7Var3.M(5);
                                        int iZ4 = pt7Var3.z();
                                        pt7Var3.M(9);
                                        int iZ5 = pt7Var3.z();
                                        pt7Var3.M(20);
                                        int[] iArr3 = {pt7Var3.D(), iZ5, iZ4};
                                        int i53 = iArr3[0];
                                        int i54 = iArr3[1];
                                        int i55 = iArr3[2];
                                        String str8 = n6b.a;
                                        str3 = str3;
                                        iZ = n6b.z(i55, ByteOrder.LITTLE_ENDIAN);
                                        iG2 = i54;
                                        listV = k95.v(bArr5);
                                        strA = strA;
                                        iM2 = iM2;
                                        i25 = i25;
                                        cVar = cVar;
                                        i8 = i53;
                                        iIntValue = iIntValue;
                                    } else if (iM3 == 1767990114) {
                                        pt7Var2.M(i25 + 9);
                                        int iE = pt7Var2.E();
                                        byte[] bArr7 = new byte[iE];
                                        pt7Var2.k(bArr7, 0, iE);
                                        byte[] bArr8 = og1.a;
                                        pt7 pt7Var4 = new pt7(bArr7);
                                        String str9 = null;
                                        String strX = null;
                                        while (pt7Var4.a() > 0 && (str9 == null || strX == null)) {
                                            int iZ6 = pt7Var4.z();
                                            int i56 = iZ6 >> 3;
                                            boolean z6 = (iZ6 & 2) != 0;
                                            boolean z7 = (iZ6 & 1) != 0;
                                            int iE2 = pt7Var4.E();
                                            if (i56 > 4 && i56 < 24 && z6) {
                                                do {
                                                } while ((pt7Var4.z() & 128) != 0);
                                                for (i13 = 128; (pt7Var4.z() & i13) != 0; i13 = 128) {
                                                }
                                            }
                                            if (z7) {
                                                pt7Var4.N(pt7Var4.E());
                                            }
                                            int i57 = pt7Var4.b + iE2;
                                            if (i56 == 31) {
                                                pt7Var4.N(4);
                                                Object[] objArr2 = {Integer.valueOf(pt7Var4.z()), Integer.valueOf(pt7Var4.z())};
                                                String str10 = n6b.a;
                                                str9 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                            } else {
                                                if (i56 == 0) {
                                                    while ((pt7Var4.z() & 128) != 0) {
                                                    }
                                                    strX = pt7Var4.x(4, StandardCharsets.UTF_8);
                                                    if (strX.equals("mp4a")) {
                                                        while ((pt7Var4.z() & 128) != 0) {
                                                        }
                                                        pt7Var4.N(2);
                                                        ot7 ot7Var4 = new ot7();
                                                        ot7Var4.k(pt7Var4);
                                                        int iG20 = ot7Var4.g(5);
                                                        if (iG20 == 31) {
                                                            iG20 = ot7Var4.g(6) + 32;
                                                        }
                                                        strX = strX + ".40." + iG20;
                                                    }
                                                    pt7Var4.M(i57);
                                                }
                                                pt7Var4.M(i57);
                                            }
                                            pt7Var4.M(i57);
                                        }
                                        strA = (str9 == null || strX == null) ? null : cj2.a(str9, ".", strX);
                                        listV = k95.v(bArr7);
                                    } else if (iM3 == 1885564227) {
                                        pt7Var2.M(i25 + 12);
                                        ByteOrder byteOrder = (pt7Var2.z() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int iZ7 = pt7Var2.z();
                                        iIntValue = iIntValue;
                                        iZ = iIntValue == 1768973165 ? n6b.z(iZ7, byteOrder) : (iIntValue == 1718641517 && iZ7 == i24 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : iZ;
                                        cVar = cVar;
                                        str3 = iZ != -1 ? "audio/raw" : str3;
                                    } else {
                                        iIntValue = iIntValue;
                                        i8 = i8;
                                        iG2 = iG2;
                                    }
                                    iIntValue = iIntValue;
                                }
                            }
                            str3 = str3;
                            iG2 = iG2;
                            iZ = iZ;
                            strA = strA;
                            iM2 = iM2;
                            i25 = i25;
                            cVar = cVar;
                        }
                        iIntValue = iIntValue;
                        str3 = str3;
                        iG2 = iG2;
                        iZ = iZ;
                        strA = strA;
                        iM2 = iM2;
                        i25 = i25;
                        cVar = cVar;
                    }
                    int i58 = iM2;
                    int i59 = iG2;
                    str5 = str5;
                    listV = listV;
                    if (iM3 == i11) {
                        iM2 = i58;
                        i12 = i25;
                        i25 = i12;
                    } else {
                        i12 = pt7Var2.b;
                        i25 = i25;
                        ms3.a(null, i12 >= i25);
                        while (true) {
                            iM2 = i58;
                            if (i12 - i25 < iM2) {
                                pt7Var2.M(i12);
                                int iM4 = pt7Var2.m();
                                ms3.a("childAtomSize must be positive", iM4 > 0);
                                if (pt7Var2.m() != 1702061171) {
                                    i12 += iM4;
                                    i58 = iM2;
                                }
                            } else {
                                i12 = -1;
                            }
                        }
                    }
                    if (i12 != -1) {
                        c cVarC = c(i12, pt7Var2);
                        str3 = cVarC.a;
                        byte[] bArr9 = cVarC.b;
                        if (bArr9 != null) {
                            if ("audio/vorbis".equals(str3)) {
                                pt7 pt7Var5 = new pt7(bArr9);
                                pt7Var5.N(1);
                                int i60 = 0;
                                while (pt7Var5.a() > 0 && pt7Var5.j() == 255) {
                                    i60 += 255;
                                    pt7Var5.N(1);
                                }
                                int iZ8 = pt7Var5.z() + i60;
                                int i61 = 0;
                                while (true) {
                                    if (pt7Var5.a() > 0) {
                                        cVar = cVarC;
                                        if (pt7Var5.j() == 255) {
                                            i61 += 255;
                                            pt7Var5.N(1);
                                            cVarC = cVar;
                                        }
                                    } else {
                                        cVar = cVarC;
                                    }
                                }
                                int iZ9 = pt7Var5.z() + i61;
                                byte[] bArr10 = new byte[iZ8];
                                int i62 = pt7Var5.b;
                                System.arraycopy(bArr9, i62, bArr10, 0, iZ8);
                                int i63 = i62 + iZ8 + iZ9;
                                int length = bArr9.length - i63;
                                byte[] bArr11 = new byte[length];
                                System.arraycopy(bArr9, i63, bArr11, 0, length);
                                listV = k95.w(bArr10, bArr11);
                            } else {
                                if ("audio/mp4a-latm".equals(str3)) {
                                    x.a aVarB = x.b(new ot7(bArr9, bArr9.length), false);
                                    i8 = aVarB.a;
                                    iG2 = aVarB.b;
                                    strA = aVarB.c;
                                } else {
                                    iG2 = i59;
                                    strA = strA;
                                }
                                cVar = cVarC;
                                listV = k95.v(bArr9);
                            }
                            iZ = iZ;
                        } else {
                            cVar = cVarC;
                        }
                    } else {
                        str3 = str3;
                    }
                    iG2 = i59;
                    strA = strA;
                    cVar = cVar;
                    iZ = iZ;
                }
                int i64 = i25 + iM2;
                i7 = 2;
                i24 = 32;
                i23 = i4;
                cVar = cVar;
                iIntValue = iIntValue;
                str2 = str3;
                str5 = str5;
                listV = listV;
                i25 = i64;
                pt7Var2 = pt7Var;
            }
            str3 = str3;
            iIntValue = iIntValue;
            int i65 = i25 + iM2;
            i7 = 2;
            i24 = 32;
            i23 = i4;
            cVar = cVar;
            iIntValue = iIntValue;
            str2 = str3;
            str5 = str5;
            listV = listV;
            i25 = i65;
            pt7Var2 = pt7Var;
        }
        String str11 = str2;
        int i66 = iG2;
        int i67 = iZ;
        String str12 = strA;
        List<byte[]> list = listV;
        if (gVar.b != null || str11 == null) {
            return;
        }
        id4.a aVar7 = new id4.a();
        aVar7.a = Integer.toString(i5);
        aVar7.n = fv6.n(str11);
        aVar7.j = str12;
        aVar7.F = i66;
        aVar7.G = i8;
        aVar7.H = i67;
        aVar7.q = list;
        aVar7.r = h83VarA;
        aVar7.d = str;
        if (cVar != null) {
            c cVar2 = cVar;
            aVar7.h = ek5.l1(cVar2.c);
            aVar7.i = ek5.l1(cVar2.d);
        } else {
            a aVar8 = aVar;
            if (aVar8 != null) {
                aVar7.h = ek5.l1(aVar8.a);
                aVar7.i = ek5.l1(aVar8.b);
            }
        }
        gVar.b = new id4(aVar7);
    }

    public static c c(int i2, pt7 pt7Var) {
        pt7Var.M(i2 + 12);
        pt7Var.N(1);
        d(pt7Var);
        pt7Var.N(2);
        int iZ = pt7Var.z();
        if ((iZ & 128) != 0) {
            pt7Var.N(2);
        }
        if ((iZ & 64) != 0) {
            pt7Var.N(pt7Var.z());
        }
        if ((iZ & 32) != 0) {
            pt7Var.N(2);
        }
        pt7Var.N(1);
        d(pt7Var);
        String strE = fv6.e(pt7Var.z());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new c(strE, null, -1L, -1L);
        }
        pt7Var.N(4);
        long jB = pt7Var.B();
        long jB2 = pt7Var.B();
        pt7Var.N(1);
        int iD = d(pt7Var);
        long j2 = jB2;
        byte[] bArr = new byte[iD];
        pt7Var.k(bArr, 0, iD);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new c(strE, bArr, j2, jB > 0 ? jB : -1L);
    }

    public static int d(pt7 pt7Var) {
        int iZ = pt7Var.z();
        int i2 = iZ & 127;
        while ((iZ & 128) == 128) {
            iZ = pt7Var.z();
            i2 = (i2 << 7) | (iZ & 127);
        }
        return i2;
    }

    public static int e(int i2) {
        return (i2 >> 24) & 255;
    }

    public static su6 f(sz6.a aVar) {
        bl6 bl6Var;
        sz6.b bVarC = aVar.c(1751411826);
        sz6.b bVarC2 = aVar.c(1801812339);
        sz6.b bVarC3 = aVar.c(1768715124);
        if (bVarC == null || bVarC2 == null || bVarC3 == null) {
            return null;
        }
        pt7 pt7Var = bVarC.b;
        pt7Var.M(16);
        if (pt7Var.m() != 1835299937) {
            return null;
        }
        pt7 pt7Var2 = bVarC2.b;
        pt7Var2.M(12);
        int iM = pt7Var2.m();
        String[] strArr = new String[iM];
        for (int i2 = 0; i2 < iM; i2++) {
            int iM2 = pt7Var2.m();
            pt7Var2.N(4);
            strArr[i2] = pt7Var2.x(iM2 - 8, StandardCharsets.UTF_8);
        }
        pt7 pt7Var3 = bVarC3.b;
        pt7Var3.M(8);
        ArrayList arrayList = new ArrayList();
        while (pt7Var3.a() > 8) {
            int i3 = pt7Var3.b;
            int iM3 = pt7Var3.m();
            int iM4 = pt7Var3.m() - 1;
            if (iM4 < 0 || iM4 >= iM) {
                d80.a(iM4, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                String str = strArr[iM4];
                int i4 = i3 + iM3;
                while (true) {
                    int i5 = pt7Var3.b;
                    if (i5 < i4) {
                        int iM5 = pt7Var3.m();
                        if (pt7Var3.m() == 1684108385) {
                            int iM6 = pt7Var3.m();
                            int iM7 = pt7Var3.m();
                            int i6 = iM5 - 16;
                            byte[] bArr = new byte[i6];
                            pt7Var3.k(bArr, 0, i6);
                            try {
                                bl6Var = new bl6(str, bArr, iM7, iM6);
                                break;
                            } catch (Exception unused) {
                                g3.d("Failed to parse metadata entry with key: ", str, "MetadataUtil");
                                bl6Var = null;
                                break;
                            }
                        }
                        pt7Var3.M(i5 + iM5);
                    }
                    bl6Var = null;
                    break;
                }
                if (bl6Var != null) {
                    arrayList.add(bl6Var);
                }
            }
            pt7Var3.M(i3 + iM3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new su6(arrayList);
    }

    public static xz6 g(pt7 pt7Var) {
        long jT;
        long jT2;
        pt7Var.M(8);
        if (e(pt7Var.m()) == 0) {
            jT = pt7Var.B();
            jT2 = pt7Var.B();
        } else {
            jT = pt7Var.t();
            jT2 = pt7Var.t();
        }
        return new xz6(jT, jT2, pt7Var.B());
    }

    public static Pair<Integer, csa> h(pt7 pt7Var, int i2, int i3) throws ut7 {
        csa csaVar;
        Pair<Integer, csa> pairCreate;
        int i4;
        int i5;
        int i6 = pt7Var.b;
        while (i6 - i2 < i3) {
            pt7Var.M(i6);
            int iM = pt7Var.m();
            ms3.a("childAtomSize must be positive", iM > 0);
            if (pt7Var.m() == 1936289382) {
                int i7 = i6 + 8;
                int i8 = 0;
                int i9 = -1;
                Integer numValueOf = null;
                String strX = null;
                while (i7 - i6 < iM) {
                    pt7Var.M(i7);
                    int iM2 = pt7Var.m();
                    int iM3 = pt7Var.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(pt7Var.m());
                    } else if (iM3 == 1935894637) {
                        pt7Var.N(4);
                        strX = pt7Var.x(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i9 = i7;
                        i8 = iM2;
                    }
                    i7 += iM2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strX) || "cbc1".equals(strX) || "cens".equals(strX) || "cbcs".equals(strX)) {
                    ms3.a("frma atom is mandatory", numValueOf != null);
                    ms3.a("schi atom is mandatory", i9 != -1);
                    int i10 = i9 + 8;
                    while (true) {
                        if (i10 - i9 >= i8) {
                            csaVar = null;
                            break;
                        }
                        pt7Var.M(i10);
                        int iM4 = pt7Var.m();
                        if (pt7Var.m() == 1952804451) {
                            int iE = e(pt7Var.m());
                            pt7Var.N(1);
                            if (iE == 0) {
                                pt7Var.N(1);
                                i5 = 0;
                                i4 = 0;
                            } else {
                                int iZ = pt7Var.z();
                                i4 = iZ & 15;
                                i5 = (iZ & 240) >> 4;
                            }
                            boolean z = pt7Var.z() == 1;
                            int iZ2 = pt7Var.z();
                            byte[] bArr2 = new byte[16];
                            pt7Var.k(bArr2, 0, 16);
                            if (z && iZ2 == 0) {
                                int iZ3 = pt7Var.z();
                                byte[] bArr3 = new byte[iZ3];
                                pt7Var.k(bArr3, 0, iZ3);
                                bArr = bArr3;
                            }
                            csaVar = new csa(z, strX, iZ2, bArr2, i5, i4, bArr);
                            break;
                        }
                        i10 += iM4;
                    }
                    ms3.a("tenc atom is mandatory", csaVar != null);
                    String str = n6b.a;
                    pairCreate = Pair.create(numValueOf, csaVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i6 += iM;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:441:0x0934  */
    /* JADX WARN: Code duplicated, block: B:443:0x0954  */
    /* JADX WARN: Code duplicated, block: B:445:0x095a  */
    /* JADX WARN: Code duplicated, block: B:446:0x0969  */
    /* JADX WARN: Code duplicated, block: B:451:0x098b  */
    /* JADX WARN: Code duplicated, block: B:453:0x0999  */
    /* JADX WARN: Code duplicated, block: B:454:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:456:0x09ae  */
    /* JADX WARN: Code duplicated, block: B:457:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:459:0x09c3  */
    /* JADX WARN: Code duplicated, block: B:460:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:462:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:464:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:468:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:469:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:472:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:475:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:476:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:478:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:483:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a4b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:490:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:493:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:496:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a73 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:503:0x0a7d  */
    /* JADX WARN: Code duplicated, block: B:506:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a8c  */
    /* JADX WARN: Code duplicated, block: B:509:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:680:0x09ec A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:441:0x0934, please report this as an issue */
    public static g i(pt7 pt7Var, j jVar, String str, h83 h83Var, boolean z) throws ut7 {
        int i2;
        h83 h83Var2;
        String str2;
        int i3;
        int i4;
        int i5;
        String str3;
        String str4;
        int iG;
        String str5;
        int i6;
        int i7;
        int i8;
        int i9;
        byte[] bArrCopyOfRange;
        int i10;
        int i11;
        int i12;
        int iG2;
        boolean zF;
        int iG3;
        int i13;
        int iG4;
        int i14;
        int i15;
        boolean zF2;
        int i16;
        int iG5;
        boolean z2;
        int i17;
        int iG6;
        xh1 xh1Var;
        int iG7;
        int i18;
        xh1 xh1Var2;
        int i19;
        d dVar;
        int i20;
        int iZ;
        int iZ2;
        h83 h83VarA;
        int i21;
        String str6;
        ul8 ul8VarV;
        long j2;
        pt7 pt7Var2 = pt7Var;
        j jVar2 = jVar;
        String str7 = str;
        int i22 = jVar2.a;
        pt7Var2.M(12);
        int iM = pt7Var2.m();
        g gVar = new g(iM);
        int i23 = 0;
        while (i23 < iM) {
            int i24 = pt7Var2.b;
            int iM2 = pt7Var2.m();
            String str8 = "childAtomSize must be positive";
            ms3.a("childAtomSize must be positive", iM2 > 0);
            int iM3 = pt7Var2.m();
            int i25 = 8;
            byte b2 = 3;
            String str9 = null;
            if (iM3 == 1635148593 || iM3 == 1635148595 || iM3 == 1701733238 || iM3 == 1831958048 || iM3 == 1836070006 || iM3 == 1752589105 || iM3 == 1751479857 || iM3 == 1987470129 || iM3 == 1987471665 || iM3 == 1932670515 || iM3 == 1211250227 || iM3 == 1748121139 || iM3 == 1987063864 || iM3 == 1987063865 || iM3 == 1635135537 || iM3 == 1685479798 || iM3 == 1685479729 || iM3 == 1685481573 || iM3 == 1685481521 || iM3 == 1634760241 || iM3 == 1684108849) {
                int i26 = jVar2.c;
                pt7Var2.M(i24 + 16);
                pt7Var2.N(16);
                int iG8 = pt7Var2.G();
                int iG9 = pt7Var2.G();
                pt7Var2.N(50);
                int i27 = pt7Var2.b;
                i2 = i23;
                if (iM3 == 1701733238) {
                    Pair<Integer, csa> pairH = h(pt7Var2, i24, iM2);
                    if (pairH != null) {
                        iM3 = ((Integer) pairH.first).intValue();
                        h83VarA = h83Var == null ? null : h83Var.a(((csa) pairH.second).b);
                        gVar.a[i2] = (csa) pairH.second;
                    } else {
                        i24 = i24;
                        h83VarA = h83Var;
                    }
                    pt7Var2.M(i27);
                    h83Var2 = h83VarA;
                } else {
                    i24 = i24;
                    h83Var2 = h83Var;
                }
                if (iM3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM3 == 1211250227 ? "video/3gpp" : null;
                }
                h83 h83Var3 = h83Var2;
                i3 = i22;
                i4 = iM;
                int i28 = i27;
                int i29 = 8;
                List<byte[]> listV = null;
                f47.k kVar = null;
                ByteBuffer byteBuffer = null;
                String string = null;
                byte[] bArr = null;
                e43 e43VarA = null;
                a aVar = null;
                c cVar = null;
                String str10 = str2;
                float fD = 1.0f;
                int i30 = -1;
                int i31 = -1;
                int i32 = -1;
                int iF = -1;
                boolean z3 = false;
                int i33 = -1;
                int i34 = -1;
                int i35 = -1;
                int i36 = -1;
                int i37 = 8;
                while (i28 - i24 < iM2) {
                    pt7Var2.M(i28);
                    int i38 = pt7Var2.b;
                    int i39 = i28;
                    int iM4 = pt7Var2.m();
                    if (iM4 == 0 && pt7Var2.b - i24 == iM2) {
                        break;
                    }
                    ms3.a(str8, iM4 > 0);
                    int iM5 = pt7Var2.m();
                    int i40 = iM2;
                    if (iM5 == 1635148611) {
                        ms3.a(str9, str10 == null);
                        pt7Var2.M(i38 + 8);
                        og0 og0VarA = og0.a(pt7Var2);
                        listV = og0VarA.a;
                        gVar.c = og0VarA.b;
                        float f2 = !z3 ? og0VarA.k : fD;
                        String str11 = og0VarA.l;
                        int i41 = og0VarA.j;
                        int i42 = og0VarA.g;
                        int i43 = og0VarA.h;
                        int i44 = og0VarA.i;
                        int i45 = og0VarA.e;
                        i29 = og0VarA.f;
                        i7 = iM3;
                        str8 = str8;
                        iG = i44;
                        fD = f2;
                        i34 = i41;
                        i37 = i45;
                        kVar = kVar;
                        str5 = "video/avc";
                        string = str11;
                        iF = i42;
                        i32 = i43;
                        i8 = i25;
                    } else {
                        int i46 = iM3;
                        if (iM5 == 1752589123) {
                            ms3.a(null, str10 == null);
                            pt7Var2.M(i38 + 8);
                            ew4 ew4VarA = ew4.a(pt7Var2, false, null);
                            listV = ew4VarA.a;
                            gVar.c = ew4VarA.b;
                            float f3 = !z3 ? ew4VarA.l : fD;
                            int i47 = ew4VarA.m;
                            int i48 = ew4VarA.c;
                            String str12 = ew4VarA.n;
                            int i49 = ew4VarA.k;
                            if (i49 != -1) {
                                i30 = i49;
                            }
                            int i50 = ew4VarA.d;
                            int i51 = ew4VarA.e;
                            int i52 = ew4VarA.h;
                            int i53 = ew4VarA.i;
                            int i54 = ew4VarA.j;
                            int i55 = ew4VarA.f;
                            i29 = ew4VarA.g;
                            str5 = "video/hevc";
                            kVar = ew4VarA.o;
                            str8 = str8;
                            i35 = i51;
                            i36 = i50;
                            fD = f3;
                            i32 = i53;
                            i8 = i25;
                            iG = i54;
                            i37 = i55;
                            i7 = i46;
                            i34 = i47;
                            iF = i52;
                            i33 = i48;
                            string = str12;
                        } else {
                            int i56 = i30;
                            if (iM5 == 1818785347) {
                                ms3.a("lhvC must follow hvcC atom", "video/hevc".equals(str10));
                                ms3.a("must have at least two layers", kVar != null && kVar.a.size() >= 2);
                                pt7Var2.M(i38 + 8);
                                kVar.getClass();
                                ew4 ew4VarA2 = ew4.a(pt7Var2, true, kVar);
                                ms3.a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", gVar.c == ew4VarA2.b);
                                int i57 = ew4VarA2.h;
                                if (i57 != -1) {
                                    ms3.a("colorSpace must be the same for both views", iF == i57);
                                }
                                int i58 = ew4VarA2.i;
                                if (i58 != -1) {
                                    ms3.a("colorRange must be the same for both views", i32 == i58);
                                }
                                int i59 = ew4VarA2.j;
                                if (i59 != -1) {
                                    ms3.a("colorTransfer must be the same for both views", i31 == i59);
                                }
                                ms3.a("bitdepthLuma must be the same for both views", i37 == ew4VarA2.f);
                                ms3.a("bitdepthChroma must be the same for both views", i29 == ew4VarA2.g);
                                if (listV != null) {
                                    k95.b bVar = k95.u;
                                    k95.a aVar2 = new k95.a();
                                    aVar2.d(listV);
                                    aVar2.d(ew4VarA2.a);
                                    listV = aVar2.g();
                                } else {
                                    ms3.a("initializationData must be already set from hvcC atom", false);
                                }
                                string = ew4VarA2.n;
                                str5 = "video/mv-hevc";
                                iG = i31;
                                str8 = str8;
                                kVar = kVar;
                                i8 = i25;
                                i7 = i46;
                                i30 = i56;
                            } else {
                                int i60 = 7;
                                if (iM5 == 1987470147) {
                                    ms3.a(null, str10 == null);
                                    pt7Var2.M(i38 + 8);
                                    try {
                                        if (pt7Var2.m() != 0) {
                                            throw ut7.a(null, "Unsupported VVC version");
                                        }
                                        int iZ3 = pt7Var2.z();
                                        int i61 = (iZ3 >> 1) & 3;
                                        boolean z4 = (iZ3 & 1) != 0;
                                        int i62 = i61 + 1;
                                        String str13 = "L";
                                        if (z4) {
                                            pt7Var2.N(1);
                                            int iZ4 = (pt7Var2.z() >> 4) & 7;
                                            iZ = (pt7Var2.z() >> 5) & 7;
                                            int iZ5 = pt7Var2.z() & 63;
                                            int iZ6 = pt7Var2.z();
                                            int i63 = (iZ6 >> 1) & 127;
                                            str13 = (iZ6 & 1) != 0 ? "H" : "L";
                                            iZ2 = pt7Var2.z();
                                            pt7Var2.N(iZ5);
                                            int i64 = 1;
                                            if (iZ4 > 1) {
                                                int iZ7 = pt7Var2.z();
                                                int i65 = 0;
                                                while (i65 < iZ4 - 1) {
                                                    if (((iZ7 >> (7 - i65)) & i64) != 0) {
                                                        pt7Var2.N(i64);
                                                    }
                                                    i65++;
                                                    i64 = 1;
                                                }
                                            }
                                            pt7Var2.N(pt7Var2.z() * 4);
                                            pt7Var2.N(6);
                                            i20 = i63;
                                        } else {
                                            i20 = 0;
                                            iZ = 0;
                                            iZ2 = 0;
                                        }
                                        int iZ8 = pt7Var2.z();
                                        int i66 = pt7Var2.b;
                                        int i67 = iZ;
                                        int i68 = 0;
                                        int i69 = 0;
                                        while (i69 < iZ8) {
                                            int i70 = i32;
                                            int iZ9 = pt7Var2.z() & 31;
                                            int i71 = i69;
                                            int iG10 = (iZ9 == 13 || iZ9 == 12) ? 1 : pt7Var2.G();
                                            int i72 = 0;
                                            while (i72 < iG10) {
                                                int i73 = i68;
                                                int iG11 = pt7Var2.G();
                                                pt7Var2.N(iG11);
                                                i72++;
                                                i68 = iG11 + 4 + i73;
                                            }
                                            i69 = i71 + 1;
                                            i32 = i70;
                                        }
                                        int i74 = i32;
                                        pt7Var2.M(i66);
                                        byte[] bArr2 = new byte[i68];
                                        int i75 = 0;
                                        int i76 = 0;
                                        while (i75 < iZ8) {
                                            int iZ10 = pt7Var2.z() & 31;
                                            int i77 = iZ8;
                                            int iG12 = (iZ10 == 13 || iZ10 == 12) ? 1 : pt7Var2.G();
                                            int i78 = 0;
                                            while (i78 < iG12) {
                                                int i79 = iG12;
                                                int iG13 = pt7Var2.G();
                                                System.arraycopy(f47.a, 0, bArr2, i76, 4);
                                                int i80 = i76 + 4;
                                                pt7Var2.k(bArr2, i80, iG13);
                                                i76 = i80 + iG13;
                                                i78++;
                                                iG12 = i79;
                                                i75 = i75;
                                                i31 = i31;
                                            }
                                            i75++;
                                            iZ8 = i77;
                                        }
                                        iG = i31;
                                        Locale locale = Locale.US;
                                        String str14 = "vvc1." + i20 + "." + str13 + iZ2;
                                        listV = k95.v(bArr2);
                                        i37 = i67 + 8;
                                        gVar.c = i62;
                                        string = str14;
                                        str5 = "video/vvc";
                                        str8 = str8;
                                        i29 = i37;
                                        kVar = kVar;
                                        i8 = i25;
                                        i7 = i46;
                                        i30 = i56;
                                        i32 = i74;
                                        i34 = 16;
                                    } catch (ArrayIndexOutOfBoundsException e2) {
                                        throw ut7.a(e2, "Error parsing VVC configuration");
                                    }
                                } else {
                                    iG = i31;
                                    i32 = i32;
                                    if (iM5 == 1986361461) {
                                        pt7Var2.M(i38 + 8);
                                        int i81 = pt7Var2.b;
                                        d dVar2 = null;
                                        while (i81 - i38 < iM4) {
                                            pt7Var2.M(i81);
                                            int iM6 = pt7Var2.m();
                                            ms3.a(str8, iM6 > 0);
                                            if (pt7Var2.m() == 1702454643) {
                                                pt7Var2.M(i81 + 8);
                                                int i82 = pt7Var2.b;
                                                while (true) {
                                                    if (i82 - i81 >= iM6) {
                                                        dVar = null;
                                                        break;
                                                    }
                                                    pt7Var2.M(i82);
                                                    int iM7 = pt7Var2.m();
                                                    ms3.a(str8, iM7 > 0);
                                                    if (pt7Var2.m() == 1937011305) {
                                                        pt7Var2.N(4);
                                                        int iZ11 = pt7Var2.z();
                                                        dVar = new d(new f((iZ11 & 1) == 1, (iZ11 & 2) == 2, (iZ11 & 8) == i25));
                                                        break;
                                                    }
                                                    i82 += iM7;
                                                    i25 = 8;
                                                }
                                                dVar2 = dVar;
                                            } else {
                                                i29 = i29;
                                                i81 = i81;
                                            }
                                            i81 += iM6;
                                            i29 = i29;
                                            i25 = 8;
                                        }
                                        int i83 = i29;
                                        k kVar2 = dVar2 == null ? null : new k(dVar2);
                                        if (kVar2 != null) {
                                            f fVar = kVar2.a.a;
                                            boolean z5 = fVar.c;
                                            if (kVar == null || kVar.a.size() < 2) {
                                                i19 = i56;
                                                if (i19 == -1) {
                                                    i30 = z5 ? 5 : 4;
                                                } else {
                                                    i30 = i19;
                                                }
                                            } else {
                                                ms3.a("both eye views must be marked as available", fVar.a && fVar.b);
                                                ms3.a("for MV-HEVC, eye_views_reversed must be set to false", !z5);
                                                i19 = i56;
                                                i30 = i19;
                                            }
                                        } else {
                                            i19 = i56;
                                            i30 = i19;
                                        }
                                        str8 = str8;
                                        str5 = str10;
                                        kVar = kVar;
                                        i7 = i46;
                                        i29 = i83;
                                    } else {
                                        int i84 = i29;
                                        i30 = i56;
                                        if (iM5 == 1685480259 || iM5 == 1685485123 || iM5 == 1685485379) {
                                            str8 = str8;
                                            str5 = str10;
                                            i6 = i37;
                                            kVar = kVar;
                                            i7 = i46;
                                            i8 = 8;
                                            iG = iG;
                                            e43VarA = e43.a(pt7Var2);
                                        } else if (iM5 == 1987076931) {
                                            ms3.a(null, str10 == null);
                                            String str15 = i46 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            pt7Var2.M(i38 + 12);
                                            byte bZ = (byte) pt7Var2.z();
                                            byte bZ2 = (byte) pt7Var2.z();
                                            int iZ12 = pt7Var2.z();
                                            int i85 = iZ12 >> 4;
                                            byte b3 = (byte) ((iZ12 >> 1) & 7);
                                            if (str15.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr3 = og1.a;
                                                byte[] bArr4 = new byte[12];
                                                bArr4[0] = 1;
                                                bArr4[1] = 1;
                                                bArr4[2] = bZ;
                                                bArr4[b2] = 2;
                                                bArr4[4] = 1;
                                                bArr4[5] = bZ2;
                                                bArr4[6] = b2;
                                                bArr4[7] = 1;
                                                bArr4[8] = (byte) i85;
                                                bArr4[9] = 4;
                                                bArr4[10] = 1;
                                                bArr4[11] = b3;
                                                listV = k95.v(bArr4);
                                            }
                                            boolean z6 = (iZ12 & 1) != 0;
                                            int iZ13 = pt7Var2.z();
                                            int iZ14 = pt7Var2.z();
                                            iF = xh1.f(iZ13);
                                            int i86 = z6 ? 1 : 2;
                                            iG = xh1.g(iZ14);
                                            i37 = i85;
                                            i7 = i46;
                                            str5 = str15;
                                            i32 = i86;
                                            i8 = 8;
                                            i29 = i37;
                                        } else {
                                            int i87 = 11;
                                            if (iM5 == 1635135811) {
                                                int i88 = iM4 - 8;
                                                byte[] bArr5 = new byte[i88];
                                                pt7Var2.k(bArr5, 0, i88);
                                                listV = k95.v(bArr5);
                                                pt7Var2.M(i38 + 8);
                                                byte[] bArr6 = pt7Var2.a;
                                                ot7 ot7Var = new ot7(bArr6, bArr6.length);
                                                ot7Var.m(pt7Var2.b * 8);
                                                ot7Var.p(1);
                                                int iG14 = ot7Var.g(b2);
                                                ot7Var.o(6);
                                                boolean zF3 = ot7Var.f();
                                                boolean zF4 = ot7Var.f();
                                                int i89 = -1;
                                                if (iG14 == 2 && zF3) {
                                                    int i90 = zF4 ? 12 : 10;
                                                    i12 = zF4 ? 12 : 10;
                                                    i10 = i90;
                                                } else {
                                                    if (iG14 <= 2) {
                                                        int i91 = zF3 ? 10 : 8;
                                                        i12 = zF3 ? 10 : 8;
                                                        i10 = i91;
                                                    } else {
                                                        i10 = -1;
                                                        i11 = -1;
                                                    }
                                                    ot7Var.o(13);
                                                    ot7Var.n();
                                                    iG2 = ot7Var.g(4);
                                                    if (iG2 != 1) {
                                                        md6.f("BoxParsers", "Unsupported obu_type: " + iG2);
                                                        xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                    } else if (ot7Var.f()) {
                                                        md6.f("BoxParsers", "Unsupported obu_extension_flag");
                                                        xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                    } else {
                                                        zF = ot7Var.f();
                                                        ot7Var.n();
                                                        if (zF || ot7Var.g(8) <= 127) {
                                                            iG3 = ot7Var.g(3);
                                                            ot7Var.n();
                                                            if (ot7Var.f()) {
                                                                md6.f("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                            } else if (ot7Var.f()) {
                                                                md6.f("BoxParsers", "Unsupported timing_info_present_flag");
                                                                xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                            } else {
                                                                if (ot7Var.f()) {
                                                                    md6.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                    xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                                } else {
                                                                    i13 = 5;
                                                                    iG4 = ot7Var.g(5);
                                                                    i14 = 0;
                                                                    while (i14 <= iG4) {
                                                                        ot7Var.o(12);
                                                                        if (ot7Var.g(i13) > i60) {
                                                                            ot7Var.n();
                                                                        }
                                                                        i14++;
                                                                        i13 = 5;
                                                                        i60 = 7;
                                                                    }
                                                                    int iG15 = ot7Var.g(4);
                                                                    int iG16 = ot7Var.g(4);
                                                                    ot7Var.o(iG15 + 1);
                                                                    ot7Var.o(iG16 + 1);
                                                                    if (ot7Var.f()) {
                                                                        i15 = 7;
                                                                        ot7Var.o(7);
                                                                    } else {
                                                                        i15 = 7;
                                                                    }
                                                                    ot7Var.o(i15);
                                                                    zF2 = ot7Var.f();
                                                                    if (zF2) {
                                                                        ot7Var.o(2);
                                                                    }
                                                                    if (ot7Var.f()) {
                                                                        iG5 = 2;
                                                                        i16 = 1;
                                                                    } else {
                                                                        i16 = 1;
                                                                        iG5 = ot7Var.g(1);
                                                                    }
                                                                    if (iG5 > 0 && !ot7Var.f()) {
                                                                        ot7Var.o(i16);
                                                                    }
                                                                    if (zF2) {
                                                                        ot7Var.o(3);
                                                                    }
                                                                    ot7Var.o(3);
                                                                    boolean zF5 = ot7Var.f();
                                                                    if (iG3 == 2 && zF5) {
                                                                        ot7Var.n();
                                                                    }
                                                                    if (iG3 == 1 && ot7Var.f()) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    if (ot7Var.f()) {
                                                                        int iG17 = ot7Var.g(8);
                                                                        int iG18 = ot7Var.g(8);
                                                                        int iG19 = ot7Var.g(8);
                                                                        if (z2 && iG17 == 1 && iG18 == 13 && iG19 == 0) {
                                                                            iG7 = 1;
                                                                        } else {
                                                                            iG7 = ot7Var.g(1);
                                                                        }
                                                                        int iF2 = xh1.f(iG17);
                                                                        if (iG7 == 1) {
                                                                            i18 = 1;
                                                                        } else {
                                                                            i18 = 2;
                                                                        }
                                                                        i17 = iF2;
                                                                        iG6 = xh1.g(iG18);
                                                                        i89 = i18;
                                                                    } else {
                                                                        i17 = -1;
                                                                        iG6 = -1;
                                                                    }
                                                                    xh1Var = new xh1(i17, i89, iG6, i10, i11, null);
                                                                }
                                                                i37 = xh1Var.e;
                                                                int i92 = xh1Var.f;
                                                                iF = xh1Var.a;
                                                                int i93 = xh1Var.b;
                                                                iG = xh1Var.c;
                                                                str5 = "video/av01";
                                                                i7 = i46;
                                                                i32 = i93;
                                                                i8 = 8;
                                                                i29 = i92;
                                                            }
                                                        } else {
                                                            md6.f("BoxParsers", "Excessive obu_size");
                                                            xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                        }
                                                    }
                                                    xh1Var = xh1Var2;
                                                    i37 = xh1Var.e;
                                                    int i94 = xh1Var.f;
                                                    iF = xh1Var.a;
                                                    int i95 = xh1Var.b;
                                                    iG = xh1Var.c;
                                                    str5 = "video/av01";
                                                    i7 = i46;
                                                    i32 = i95;
                                                    i8 = 8;
                                                    i29 = i94;
                                                }
                                                i11 = i12;
                                                ot7Var.o(13);
                                                ot7Var.n();
                                                iG2 = ot7Var.g(4);
                                                if (iG2 != 1) {
                                                    md6.f("BoxParsers", "Unsupported obu_type: " + iG2);
                                                    xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                } else if (ot7Var.f()) {
                                                    md6.f("BoxParsers", "Unsupported obu_extension_flag");
                                                    xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                } else {
                                                    zF = ot7Var.f();
                                                    ot7Var.n();
                                                    if (zF) {
                                                        iG3 = ot7Var.g(3);
                                                        ot7Var.n();
                                                        if (ot7Var.f()) {
                                                            md6.f("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                        } else if (ot7Var.f()) {
                                                            md6.f("BoxParsers", "Unsupported timing_info_present_flag");
                                                            xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                        } else if (ot7Var.f()) {
                                                            md6.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                        } else {
                                                            i13 = 5;
                                                            iG4 = ot7Var.g(5);
                                                            i14 = 0;
                                                            while (i14 <= iG4) {
                                                                ot7Var.o(12);
                                                                if (ot7Var.g(i13) > i60) {
                                                                    ot7Var.n();
                                                                }
                                                                i14++;
                                                                i13 = 5;
                                                                i60 = 7;
                                                            }
                                                            int iG110 = ot7Var.g(4);
                                                            int iG111 = ot7Var.g(4);
                                                            ot7Var.o(iG110 + 1);
                                                            ot7Var.o(iG111 + 1);
                                                            if (ot7Var.f()) {
                                                                i15 = 7;
                                                                ot7Var.o(7);
                                                            } else {
                                                                i15 = 7;
                                                            }
                                                            ot7Var.o(i15);
                                                            zF2 = ot7Var.f();
                                                            if (zF2) {
                                                                ot7Var.o(2);
                                                            }
                                                            if (ot7Var.f()) {
                                                                iG5 = 2;
                                                                i16 = 1;
                                                            } else {
                                                                i16 = 1;
                                                                iG5 = ot7Var.g(1);
                                                            }
                                                            if (iG5 > 0) {
                                                                ot7Var.o(i16);
                                                            }
                                                            if (zF2) {
                                                                ot7Var.o(3);
                                                            }
                                                            ot7Var.o(3);
                                                            boolean zF6 = ot7Var.f();
                                                            if (iG3 == 2) {
                                                                ot7Var.n();
                                                            }
                                                            if (iG3 == 1) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (ot7Var.f()) {
                                                                int iG112 = ot7Var.g(8);
                                                                int iG113 = ot7Var.g(8);
                                                                int iG114 = ot7Var.g(8);
                                                                if (z2) {
                                                                    iG7 = ot7Var.g(1);
                                                                } else {
                                                                    iG7 = ot7Var.g(1);
                                                                }
                                                                int iF3 = xh1.f(iG112);
                                                                if (iG7 == 1) {
                                                                    i18 = 1;
                                                                } else {
                                                                    i18 = 2;
                                                                }
                                                                i17 = iF3;
                                                                iG6 = xh1.g(iG113);
                                                                i89 = i18;
                                                            } else {
                                                                i17 = -1;
                                                                iG6 = -1;
                                                            }
                                                            xh1Var = new xh1(i17, i89, iG6, i10, i11, null);
                                                        }
                                                    } else {
                                                        iG3 = ot7Var.g(3);
                                                        ot7Var.n();
                                                        if (ot7Var.f()) {
                                                            md6.f("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                        } else if (ot7Var.f()) {
                                                            md6.f("BoxParsers", "Unsupported timing_info_present_flag");
                                                            xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                        } else if (ot7Var.f()) {
                                                            md6.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            xh1Var2 = new xh1(-1, -1, -1, i10, i11, null);
                                                        } else {
                                                            i13 = 5;
                                                            iG4 = ot7Var.g(5);
                                                            i14 = 0;
                                                            while (i14 <= iG4) {
                                                                ot7Var.o(12);
                                                                if (ot7Var.g(i13) > i60) {
                                                                    ot7Var.n();
                                                                }
                                                                i14++;
                                                                i13 = 5;
                                                                i60 = 7;
                                                            }
                                                            int iG115 = ot7Var.g(4);
                                                            int iG116 = ot7Var.g(4);
                                                            ot7Var.o(iG115 + 1);
                                                            ot7Var.o(iG116 + 1);
                                                            if (ot7Var.f()) {
                                                                i15 = 7;
                                                                ot7Var.o(7);
                                                            } else {
                                                                i15 = 7;
                                                            }
                                                            ot7Var.o(i15);
                                                            zF2 = ot7Var.f();
                                                            if (zF2) {
                                                                ot7Var.o(2);
                                                            }
                                                            if (ot7Var.f()) {
                                                                iG5 = 2;
                                                                i16 = 1;
                                                            } else {
                                                                i16 = 1;
                                                                iG5 = ot7Var.g(1);
                                                            }
                                                            if (iG5 > 0) {
                                                                ot7Var.o(i16);
                                                            }
                                                            if (zF2) {
                                                                ot7Var.o(3);
                                                            }
                                                            ot7Var.o(3);
                                                            boolean zF7 = ot7Var.f();
                                                            if (iG3 == 2) {
                                                                ot7Var.n();
                                                            }
                                                            if (iG3 == 1) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (ot7Var.f()) {
                                                                int iG117 = ot7Var.g(8);
                                                                int iG118 = ot7Var.g(8);
                                                                int iG119 = ot7Var.g(8);
                                                                if (z2) {
                                                                    iG7 = ot7Var.g(1);
                                                                } else {
                                                                    iG7 = ot7Var.g(1);
                                                                }
                                                                int iF4 = xh1.f(iG117);
                                                                if (iG7 == 1) {
                                                                    i18 = 1;
                                                                } else {
                                                                    i18 = 2;
                                                                }
                                                                i17 = iF4;
                                                                iG6 = xh1.g(iG118);
                                                                i89 = i18;
                                                            } else {
                                                                i17 = -1;
                                                                iG6 = -1;
                                                            }
                                                            xh1Var = new xh1(i17, i89, iG6, i10, i11, null);
                                                        }
                                                    }
                                                    i37 = xh1Var.e;
                                                    int i96 = xh1Var.f;
                                                    iF = xh1Var.a;
                                                    int i97 = xh1Var.b;
                                                    iG = xh1Var.c;
                                                    str5 = "video/av01";
                                                    i7 = i46;
                                                    i32 = i97;
                                                    i8 = 8;
                                                    i29 = i96;
                                                }
                                                xh1Var = xh1Var2;
                                                i37 = xh1Var.e;
                                                int i98 = xh1Var.f;
                                                iF = xh1Var.a;
                                                int i99 = xh1Var.b;
                                                iG = xh1Var.c;
                                                str5 = "video/av01";
                                                i7 = i46;
                                                i32 = i99;
                                                i8 = 8;
                                                i29 = i98;
                                            } else {
                                                if (iM5 == 1668050025) {
                                                    ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    byteBufferOrder.position(21);
                                                    byteBufferOrder.putShort(pt7Var2.w());
                                                    byteBufferOrder.putShort(pt7Var2.w());
                                                    byteBuffer = byteBufferOrder;
                                                    i7 = i46;
                                                    str8 = str8;
                                                    str5 = str10;
                                                    kVar = kVar;
                                                } else {
                                                    if (iM5 == 1835295606) {
                                                        ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        short sW = pt7Var2.w();
                                                        short sW2 = pt7Var2.w();
                                                        short sW3 = pt7Var2.w();
                                                        short sW4 = pt7Var2.w();
                                                        i7 = i46;
                                                        short sW5 = pt7Var2.w();
                                                        str8 = str8;
                                                        short sW6 = pt7Var2.w();
                                                        str5 = str10;
                                                        short sW7 = pt7Var2.w();
                                                        i6 = i37;
                                                        short sW8 = pt7Var2.w();
                                                        long jB = pt7Var2.B();
                                                        long jB2 = pt7Var2.B();
                                                        kVar = kVar;
                                                        byteBufferOrder2.position(1);
                                                        byteBufferOrder2.putShort(sW5);
                                                        byteBufferOrder2.putShort(sW6);
                                                        byteBufferOrder2.putShort(sW);
                                                        byteBufferOrder2.putShort(sW2);
                                                        byteBufferOrder2.putShort(sW3);
                                                        byteBufferOrder2.putShort(sW4);
                                                        byteBufferOrder2.putShort(sW7);
                                                        byteBufferOrder2.putShort(sW8);
                                                        byteBufferOrder2.putShort((short) (jB / 10000));
                                                        byteBufferOrder2.putShort((short) (jB2 / 10000));
                                                        byteBuffer = byteBufferOrder2;
                                                    } else {
                                                        i7 = i46;
                                                        str8 = str8;
                                                        str5 = str10;
                                                        i6 = i37;
                                                        kVar = kVar;
                                                        if (iM5 == 1681012275) {
                                                            ms3.a(null, str5 == null);
                                                            i30 = i30;
                                                            str5 = "video/3gpp";
                                                        } else if (iM5 == 1702061171) {
                                                            ms3.a(null, str5 == null);
                                                            c cVarC = c(i38, pt7Var2);
                                                            String str16 = cVarC.a;
                                                            byte[] bArr7 = cVarC.b;
                                                            if (bArr7 != null) {
                                                                listV = k95.v(bArr7);
                                                            }
                                                            cVar = cVarC;
                                                            str5 = str16;
                                                        } else if (iM5 == 1651798644) {
                                                            pt7Var2.M(i38 + 8);
                                                            pt7Var2.N(4);
                                                            i30 = i30;
                                                            aVar = new a(pt7Var2.B(), pt7Var2.B());
                                                        } else if (iM5 == 1885434736) {
                                                            pt7Var2.M(i38 + 8);
                                                            fD = pt7Var2.D() / pt7Var2.D();
                                                            i32 = i32;
                                                            i37 = i6;
                                                            i8 = 8;
                                                            z3 = true;
                                                            i30 = i30;
                                                            i29 = i84;
                                                        } else if (iM5 == 1937126244) {
                                                            int i100 = i38 + 8;
                                                            while (true) {
                                                                if (i100 - i38 >= iM4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                pt7Var2.M(i100);
                                                                int iM8 = pt7Var2.m();
                                                                if (pt7Var2.m() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(pt7Var2.a, i100, iM8 + i100);
                                                                    break;
                                                                }
                                                                i100 += iM8;
                                                            }
                                                            i30 = i30;
                                                            bArr = bArrCopyOfRange;
                                                        } else if (iM5 == 1936995172) {
                                                            int iZ15 = pt7Var2.z();
                                                            pt7Var2.N(3);
                                                            if (iZ15 == 0) {
                                                                int iZ16 = pt7Var2.z();
                                                                if (iZ16 == 0) {
                                                                    i30 = 0;
                                                                } else if (iZ16 == 1) {
                                                                    i30 = 1;
                                                                } else if (iZ16 == 2) {
                                                                    i30 = 2;
                                                                } else if (iZ16 == 3) {
                                                                    i30 = 3;
                                                                }
                                                            }
                                                            i30 = i30;
                                                        } else if (iM5 == 1634760259) {
                                                            int i101 = iM4 - 12;
                                                            byte[] bArr8 = new byte[i101];
                                                            pt7Var2.M(i38 + 12);
                                                            int i102 = 0;
                                                            pt7Var2.k(bArr8, 0, i101);
                                                            byte[] bArr9 = og1.a;
                                                            xl7.d(i101, "Invalid APV CSD length: %s", i101 >= 17);
                                                            byte b4 = bArr8[0];
                                                            xl7.d(b4, "Invalid APV CSD version: %s", b4 == 1);
                                                            int i103 = bArr8[5] & MessagePack.Code.EXT_TIMESTAMP;
                                                            int i104 = bArr8[6] & MessagePack.Code.EXT_TIMESTAMP;
                                                            int i105 = bArr8[7] & MessagePack.Code.EXT_TIMESTAMP;
                                                            String str17 = n6b.a;
                                                            Locale locale2 = Locale.US;
                                                            StringBuilder sbB = u43.b("apv1.apvf", ".apvl", ".apvb", i103, i104);
                                                            sbB.append(i105);
                                                            string = sbB.toString();
                                                            listV = k95.v(bArr8);
                                                            pt7 pt7Var3 = new pt7(bArr8);
                                                            ot7 ot7Var2 = new ot7(bArr8, i101);
                                                            i8 = 8;
                                                            ot7Var2.m(pt7Var3.b * 8);
                                                            ot7Var2.p(1);
                                                            int iG20 = ot7Var2.g(8);
                                                            int i106 = 0;
                                                            int i107 = -1;
                                                            int i108 = -1;
                                                            int i109 = -1;
                                                            int i110 = -1;
                                                            int i111 = -1;
                                                            while (i106 < iG20) {
                                                                ot7Var2.p(1);
                                                                int iG21 = ot7Var2.g(8);
                                                                int i112 = i111;
                                                                int i113 = i110;
                                                                int iG22 = i109;
                                                                int iG23 = i108;
                                                                int i114 = i102;
                                                                while (i114 < iG21) {
                                                                    ot7Var2.o(6);
                                                                    boolean zF8 = ot7Var2.f();
                                                                    ot7Var2.n();
                                                                    ot7Var2.p(i87);
                                                                    ot7Var2.o(4);
                                                                    iG22 = ot7Var2.g(4) + 8;
                                                                    ot7Var2.p(1);
                                                                    if (zF8) {
                                                                        int iG24 = ot7Var2.g(8);
                                                                        int iG25 = ot7Var2.g(8);
                                                                        ot7Var2.p(1);
                                                                        boolean zF9 = ot7Var2.f();
                                                                        int iF5 = xh1.f(iG24);
                                                                        i113 = zF9 ? 1 : 2;
                                                                        iG23 = xh1.g(iG25);
                                                                        i112 = iF5;
                                                                    }
                                                                    i114++;
                                                                    i107 = iG22;
                                                                    i87 = 11;
                                                                }
                                                                i106++;
                                                                i108 = iG23;
                                                                i109 = iG22;
                                                                i110 = i113;
                                                                i111 = i112;
                                                                i102 = 0;
                                                                i87 = 11;
                                                            }
                                                            str5 = "video/apv";
                                                            iG = i108;
                                                            i37 = i109;
                                                            i32 = i110;
                                                            iF = i111;
                                                            i30 = i30;
                                                            i29 = i107;
                                                        } else {
                                                            i8 = 8;
                                                            if (iM5 == 1668246642) {
                                                                i9 = iG;
                                                                if (iF == -1 && i9 == -1) {
                                                                    int iM9 = pt7Var2.m();
                                                                    if (iM9 == 1852009592 || iM9 == 1852009571) {
                                                                        int iG26 = pt7Var2.G();
                                                                        int iG27 = pt7Var2.G();
                                                                        pt7Var2.N(2);
                                                                        boolean z7 = iM4 == 19 && (pt7Var2.z() & 128) != 0;
                                                                        iF = xh1.f(iG26);
                                                                        i32 = z7 ? 1 : 2;
                                                                        iG = xh1.g(iG27);
                                                                    } else {
                                                                        md6.g("BoxParsers", "Unsupported color type: ".concat(sz6.a(iM9)));
                                                                    }
                                                                    i37 = i6;
                                                                    i30 = i30;
                                                                    i29 = i84;
                                                                }
                                                            } else {
                                                                i9 = iG;
                                                            }
                                                            iG = i9;
                                                        }
                                                        i29 = i84;
                                                        i37 = i6;
                                                    }
                                                    i37 = i6;
                                                }
                                                i8 = 8;
                                                i30 = i30;
                                                i29 = i84;
                                            }
                                        }
                                        i32 = i32;
                                        i37 = i6;
                                        i30 = i30;
                                        i29 = i84;
                                    }
                                    i8 = 8;
                                }
                            }
                        }
                    }
                    i28 = i39 + iM4;
                    i25 = i8;
                    iM3 = i7;
                    iM2 = i40;
                    str8 = str8;
                    str10 = str5;
                    i31 = iG;
                    kVar = kVar;
                    b2 = 3;
                    str9 = null;
                }
                int i115 = i29;
                int i116 = i30;
                i5 = iM2;
                int i117 = i31;
                String str18 = str10;
                int i118 = i37;
                int i119 = i32;
                if (e43VarA != null) {
                    str3 = e43VarA.a;
                    str4 = "video/dolby-vision";
                } else {
                    str3 = string;
                    str4 = str18;
                }
                if (str4 == null) {
                    str7 = str;
                } else {
                    id4.a aVar3 = new id4.a();
                    aVar3.a = Integer.toString(i3);
                    aVar3.n = fv6.n(str4);
                    aVar3.j = str3;
                    aVar3.u = iG8;
                    aVar3.v = iG9;
                    aVar3.w = i36;
                    aVar3.x = i35;
                    aVar3.A = fD;
                    aVar3.z = i26;
                    aVar3.B = bArr;
                    aVar3.C = i116;
                    aVar3.q = listV;
                    aVar3.p = i34;
                    aVar3.E = i33;
                    aVar3.r = h83Var3;
                    str7 = str;
                    aVar3.d = str7;
                    aVar3.D = new xh1(iF, i119, i117, i118, i115, byteBuffer != null ? byteBuffer.array() : null);
                    a aVar4 = aVar;
                    if (aVar4 != null) {
                        aVar3.h = ek5.l1(aVar4.a);
                        aVar3.i = ek5.l1(aVar4.b);
                    } else {
                        c cVar2 = cVar;
                        if (cVar2 != null) {
                            aVar3.h = ek5.l1(cVar2.c);
                            aVar3.i = ek5.l1(cVar2.d);
                        }
                    }
                    gVar.b = new id4(aVar3);
                }
            } else {
                if (iM3 == 1836069985 || iM3 == 1701733217 || iM3 == 1633889587 || iM3 == 1700998451 || iM3 == 1633889588 || iM3 == 1835823201 || iM3 == 1685353315 || iM3 == 1685353317 || iM3 == 1685353320 || iM3 == 1685353324 || iM3 == 1685353336 || iM3 == 1935764850 || iM3 == 1935767394 || iM3 == 1819304813 || iM3 == 1936684916 || iM3 == 1953984371 || iM3 == 778924082 || iM3 == 778924083 || iM3 == 1835557169 || iM3 == 1835560241 || iM3 == 1634492771 || iM3 == 1634492791 || iM3 == 1970037111 || iM3 == 1332770163 || iM3 == 1716281667 || iM3 == 1767992678 || iM3 == 1768973165 || iM3 == 1718641517) {
                    i24 = i24;
                    pt7Var2 = pt7Var;
                    iM2 = iM2;
                    b(pt7Var2, iM3, i24, iM2, jVar2.a, str7, z, h83Var, gVar, i23);
                    str7 = str;
                } else if (iM3 == 1414810956 || iM3 == 1954034535 || iM3 == 2004251764 || iM3 == 1937010800 || iM3 == 1664495672 || iM3 == 1836070003) {
                    pt7Var2.M(i24 + 16);
                    String str19 = "application/ttml+xml";
                    long j3 = Long.MAX_VALUE;
                    if (iM3 != 1414810956) {
                        if (iM3 == 1954034535) {
                            int i120 = iM2 - 16;
                            byte[] bArr10 = new byte[i120];
                            pt7Var2.k(bArr10, 0, i120);
                            ul8VarV = k95.v(bArr10);
                            str19 = "application/x-quicktime-tx3g";
                            i24 = i24;
                            i21 = iM2;
                        } else {
                            if (iM3 == 2004251764) {
                                str19 = "application/x-mp4-vtt";
                            } else if (iM3 == 1937010800) {
                                j3 = 0;
                            } else if (iM3 == 1664495672) {
                                gVar.d = 1;
                                str19 = "application/x-mp4-cea-608";
                            } else {
                                if (iM3 != 1836070003) {
                                    d43.c();
                                    return null;
                                }
                                int i121 = pt7Var2.b;
                                pt7Var2.N(4);
                                if (pt7Var2.m() == 1702061171) {
                                    byte[] bArr11 = c(i121, pt7Var2).b;
                                    if (bArr11 == null || bArr11.length != 64) {
                                        i24 = i24;
                                        i21 = iM2;
                                    } else {
                                        int i122 = jVar2.d;
                                        int i123 = jVar2.e;
                                        xl7.r(bArr11.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i124 = 0;
                                        while (i124 < bArr11.length - 3) {
                                            byte[] bArr12 = bArr11;
                                            int iJ1 = ek5.j1(bArr11[i124], bArr11[i124 + 1], bArr11[i124 + 2], bArr12[i124 + 3]);
                                            int i125 = (iJ1 >> 16) & 255;
                                            int i126 = ((iJ1 >> 8) & 255) - 128;
                                            int i127 = (iJ1 & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(n6b.i(vr0.b(i127, 17790, 10000, i125), 0, 255) | (n6b.i((i125 - ((i127 * 3455) / 10000)) - ((i126 * 7169) / 10000), 0, 255) << 8) | (n6b.i(vr0.b(i126, 14075, 10000, i125), 0, 255) << 16))));
                                            i124 += 4;
                                            bArr11 = bArr12;
                                            i24 = i24;
                                            iM2 = iM2;
                                        }
                                        i24 = i24;
                                        i21 = iM2;
                                        StringBuilder sbB2 = u43.b("size: ", "x", "\npalette: ", i122, i123);
                                        sbB2.append(new pl5(", ").b(arrayList));
                                        sbB2.append("\n");
                                        String string2 = sbB2.toString();
                                        String str20 = n6b.a;
                                        ul8VarV = k95.v(string2.getBytes(StandardCharsets.UTF_8));
                                        str6 = "application/vobsub";
                                    }
                                } else {
                                    i24 = i24;
                                    i21 = iM2;
                                    str6 = null;
                                    ul8VarV = null;
                                }
                                str19 = str6;
                            }
                            i24 = i24;
                            i21 = iM2;
                            ul8VarV = null;
                        }
                        j2 = j3;
                        if (str19 != null) {
                            id4.a aVar5 = new id4.a();
                            aVar5.a = Integer.toString(i22);
                            aVar5.n = fv6.n(str19);
                            aVar5.d = str7;
                            aVar5.s = j2;
                            aVar5.q = ul8VarV;
                            gVar.b = new id4(aVar5);
                        }
                    } else {
                        i24 = i24;
                        i21 = iM2;
                        ul8VarV = null;
                        j2 = j3;
                        if (str19 != null) {
                            id4.a aVar6 = new id4.a();
                            aVar6.a = Integer.toString(i22);
                            aVar6.n = fv6.n(str19);
                            aVar6.d = str7;
                            aVar6.s = j2;
                            aVar6.q = ul8VarV;
                            gVar.b = new id4(aVar6);
                        }
                    }
                    pt7Var2 = pt7Var;
                    i3 = i22;
                    i4 = iM;
                    i5 = i21;
                    i2 = i23;
                } else {
                    if (iM3 == 1835365492) {
                        pt7Var2.M(i24 + 16);
                        if (iM3 == 1835365492) {
                            pt7Var2.u();
                            String strU = pt7Var2.u();
                            if (strU != null) {
                                id4.a aVar7 = new id4.a();
                                aVar7.a = Integer.toString(i22);
                                aVar7.n = fv6.n(strU);
                                gVar.b = new id4(aVar7);
                            }
                        }
                    } else if (iM3 == 1667329389) {
                        id4.a aVar8 = new id4.a();
                        aVar8.a = Integer.toString(i22);
                        aVar8.n = fv6.n("application/x-camera-motion");
                        gVar.b = new id4(aVar8);
                    }
                    i24 = i24;
                }
                i5 = iM2;
                i2 = i23;
                i3 = i22;
                i4 = iM;
            }
            pt7Var2.M(i24 + i5);
            i23 = i2 + 1;
            jVar2 = jVar;
            i22 = i3;
            iM = i4;
        }
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ec A[EDGE_INSN: B:105:0x01ec->B:104:0x01e9 BREAK  A[LOOP:18: B:95:0x01cc->B:106:0x01f8]] */
    /* JADX WARN: Code duplicated, block: B:106:0x01f8 A[LOOP:18: B:95:0x01cc->B:106:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0225  */
    /* JADX WARN: Code duplicated, block: B:120:0x0244  */
    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:156:0x0300  */
    /* JADX WARN: Code duplicated, block: B:158:0x0314  */
    /* JADX WARN: Code duplicated, block: B:212:0x0492  */
    /* JADX WARN: Code duplicated, block: B:215:0x049a  */
    /* JADX WARN: Code duplicated, block: B:216:0x049d  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:221:0x04ad A[LOOP:1: B:219:0x04a7->B:221:0x04ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:0x04c0 A[LOOP:2: B:223:0x04be->B:224:0x04c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:229:0x04f5 A[LOOP:4: B:228:0x04f3->B:229:0x04f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x0535  */
    /* JADX WARN: Code duplicated, block: B:235:0x0539  */
    /* JADX WARN: Code duplicated, block: B:237:0x053d  */
    /* JADX WARN: Code duplicated, block: B:239:0x0541  */
    /* JADX WARN: Code duplicated, block: B:242:0x0554  */
    /* JADX WARN: Code duplicated, block: B:244:0x0557  */
    /* JADX WARN: Code duplicated, block: B:245:0x055a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0560  */
    /* JADX WARN: Code duplicated, block: B:249:0x0563  */
    /* JADX WARN: Code duplicated, block: B:252:0x0569  */
    /* JADX WARN: Code duplicated, block: B:253:0x056c  */
    /* JADX WARN: Code duplicated, block: B:256:0x0572  */
    /* JADX WARN: Code duplicated, block: B:257:0x0575  */
    /* JADX WARN: Code duplicated, block: B:260:0x0597  */
    /* JADX WARN: Code duplicated, block: B:262:0x059b  */
    /* JADX WARN: Code duplicated, block: B:264:0x05a1 A[LOOP:14: B:261:0x0599->B:264:0x05a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x05bf A[EDGE_INSN: B:269:0x05bf->B:300:0x0676 BREAK  A[LOOP:13: B:259:0x0595->B:298:0x065a]] */
    /* JADX WARN: Code duplicated, block: B:270:0x05d9 A[EDGE_INSN: B:270:0x05d9->B:300:0x0676 BREAK  A[LOOP:13: B:259:0x0595->B:298:0x065a]] */
    /* JADX WARN: Code duplicated, block: B:271:0x05e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:272:0x05e5 A[ADDED_TO_REGION, LOOP:15: B:272:0x05e5->B:274:0x05e9, LOOP_START, PHI: r3 r24 r25
      0x05e5: PHI (r3v10 int) = (r3v3 int), (r3v11 int) binds: [B:271:0x05e3, B:274:0x05e9] A[DONT_GENERATE, DONT_INLINE]
      0x05e5: PHI (r24v8 int) = (r24v6 int), (r24v10 int) binds: [B:271:0x05e3, B:274:0x05e9] A[DONT_GENERATE, DONT_INLINE]
      0x05e5: PHI (r25v7 int) = (r25v2 int), (r25v8 int) binds: [B:271:0x05e3, B:274:0x05e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:278:0x0601  */
    /* JADX WARN: Code duplicated, block: B:280:0x0604  */
    /* JADX WARN: Code duplicated, block: B:282:0x0612  */
    /* JADX WARN: Code duplicated, block: B:283:0x0614  */
    /* JADX WARN: Code duplicated, block: B:286:0x0619  */
    /* JADX WARN: Code duplicated, block: B:288:0x062a  */
    /* JADX WARN: Code duplicated, block: B:290:0x0630 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x064c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x067b A[DONT_INVERT, LOOP:16: B:302:0x067b->B:306:0x0685, LOOP_START, PHI: r25
      0x067b: PHI (r25v4 int) = (r25v2 int), (r25v5 int) binds: [B:301:0x0679, B:306:0x0685] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:303:0x067d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0685 A[LOOP:16: B:302:0x067b->B:306:0x0685, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x068b A[EDGE_INSN: B:307:0x068b->B:308:0x068c BREAK  A[LOOP:16: B:302:0x067b->B:306:0x0685]] */
    /* JADX WARN: Code duplicated, block: B:316:0x069e  */
    /* JADX WARN: Code duplicated, block: B:318:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:319:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:324:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:331:0x072f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:332:0x0731  */
    /* JADX WARN: Code duplicated, block: B:335:0x0745  */
    /* JADX WARN: Code duplicated, block: B:337:0x074b  */
    /* JADX WARN: Code duplicated, block: B:343:0x076c  */
    /* JADX WARN: Code duplicated, block: B:346:0x0770  */
    /* JADX WARN: Code duplicated, block: B:348:0x0776  */
    /* JADX WARN: Code duplicated, block: B:352:0x0793  */
    /* JADX WARN: Code duplicated, block: B:377:0x084d  */
    /* JADX WARN: Code duplicated, block: B:380:0x0857  */
    /* JADX WARN: Code duplicated, block: B:382:0x0861  */
    /* JADX WARN: Code duplicated, block: B:385:0x086a A[LOOP:6: B:383:0x0867->B:385:0x086a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:387:0x0898  */
    /* JADX WARN: Code duplicated, block: B:390:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:391:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:395:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:397:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:400:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:402:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:403:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:410:0x0907  */
    /* JADX WARN: Code duplicated, block: B:416:0x091a  */
    /* JADX WARN: Code duplicated, block: B:421:0x0928  */
    /* JADX WARN: Code duplicated, block: B:426:0x093e  */
    /* JADX WARN: Code duplicated, block: B:427:0x0940  */
    /* JADX WARN: Code duplicated, block: B:429:0x0948  */
    /* JADX WARN: Code duplicated, block: B:433:0x0966  */
    /* JADX WARN: Code duplicated, block: B:434:0x0968  */
    /* JADX WARN: Code duplicated, block: B:437:0x096e  */
    /* JADX WARN: Code duplicated, block: B:438:0x0971  */
    /* JADX WARN: Code duplicated, block: B:440:0x0974  */
    /* JADX WARN: Code duplicated, block: B:441:0x0977  */
    /* JADX WARN: Code duplicated, block: B:443:0x097a  */
    /* JADX WARN: Code duplicated, block: B:445:0x097e  */
    /* JADX WARN: Code duplicated, block: B:446:0x0981  */
    /* JADX WARN: Code duplicated, block: B:448:0x0984  */
    /* JADX WARN: Code duplicated, block: B:449:0x098a  */
    /* JADX WARN: Code duplicated, block: B:453:0x099b  */
    /* JADX WARN: Code duplicated, block: B:455:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:458:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:460:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:463:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:467:0x09ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:475:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:495:0x077a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x08fd A[EDGE_INSN: B:500:0x08fd->B:407:0x08fd BREAK  A[LOOP:8: B:398:0x08e8->B:406:0x08fa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x08fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0914 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0935 A[ADDED_TO_REGION, EDGE_INSN: B:506:0x0935->B:424:0x0935 BREAK  A[LOOP:10: B:419:0x0922->B:423:0x092e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0a00 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x066c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x065a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x05b2 A[EDGE_INSN: B:520:0x05b2->B:265:0x05b2 BREAK  A[LOOP:14: B:261:0x0599->B:264:0x05a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x0683 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x068b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    public static ArrayList j(sz6.a aVar, lj4 lj4Var, long j2, h83 h83Var, boolean z, boolean z2, yh4 yh4Var, boolean z3) {
        int i2;
        int i3;
        long j3;
        long jU;
        long j4;
        int i4;
        int i5;
        j jVar;
        long j5;
        long j6;
        long j7;
        long jU2;
        pt7 pt7Var;
        int iE;
        int i6;
        long jB;
        int i7;
        int i8;
        int i9;
        long j8;
        char[] cArr;
        int i10;
        String str;
        sz6.b bVarC;
        g gVarI;
        long[] jArr;
        long[] jArr2;
        id4 id4Var;
        int i11;
        id4 id4Var2;
        bsa bsaVar;
        rz6 rz6Var;
        su6 su6Var;
        su6 su6Var2;
        sz6.a aVarB;
        Pair pairCreate;
        char c2;
        long jF;
        long j9;
        e iVar;
        boolean z4;
        ArrayList arrayList;
        int iD;
        int iD2;
        int iD3;
        int iA;
        pt7 pt7Var2;
        boolean z5;
        ArrayList arrayList2;
        boolean z6;
        long[] jArr3;
        int[] iArrCopyOf;
        e eVar;
        long[] jArr4;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        long j12;
        int i16;
        int iM;
        int i17;
        int iD4;
        int i18;
        int iD5;
        pt7 pt7Var3;
        int i19;
        ArrayList arrayList3;
        long[] jArr5;
        long[] jArr6;
        int[] iArrCopyOf2;
        int i20;
        boolean z7;
        String str2;
        int i21;
        int i22;
        int[] iArr2;
        long j13;
        long j14;
        boolean zA;
        int i23;
        ArrayList arrayList4;
        int iC;
        int i24;
        int[] iArr3;
        ArrayList arrayList5;
        int i25;
        long[] jArr7;
        int[] iArr4;
        long j15;
        int i26;
        long j16;
        id4 id4Var3;
        long[] jArr8;
        long[] jArr9;
        long jU3;
        int[] iArrM1;
        long[] jArr10;
        long j17;
        int i27;
        int[] iArr5;
        int i28;
        boolean z8;
        int[] iArr6;
        int[] iArr7;
        int i29;
        int i30;
        boolean z9;
        int i31;
        int[] iArr8;
        int[] iArr9;
        boolean z10;
        boolean z11;
        long[] jArr11;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList6;
        long[] jArr12;
        int i32;
        boolean z12;
        int i33;
        int i34;
        long j18;
        id4 id4Var4;
        isa isaVar;
        long j19;
        int i35;
        int i36;
        int i37;
        int i38;
        long jU4;
        int[] iArr12;
        long j20;
        int[] iArr13;
        int i39;
        long jU5;
        int iB;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        boolean z13;
        int i45;
        long j21;
        int i46;
        isa isaVar2;
        int i47;
        long jU6;
        long jU7;
        int i48;
        long[] jArr13;
        int[] iArr14;
        long j22;
        int i49;
        int i50;
        int iG;
        int[] iArr15;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        long j23;
        int i56;
        int i57;
        int i58;
        sz6.a aVar2 = aVar;
        ArrayList arrayList7 = aVar2.d;
        ArrayList arrayList8 = new ArrayList();
        int i59 = 0;
        while (i59 < arrayList7.size()) {
            sz6.a aVar3 = (sz6.a) arrayList7.get(i59);
            if (aVar3.a != 1953653099) {
                arrayList = arrayList7;
                arrayList8 = arrayList8;
                i3 = i59;
            } else {
                sz6.b bVarC2 = aVar2.c(1836476516);
                bVarC2.getClass();
                sz6.a aVarB2 = aVar3.b(1835297121);
                aVarB2.getClass();
                sz6.b bVarC3 = aVarB2.c(1751411826);
                bVarC3.getClass();
                pt7 pt7Var4 = bVarC3.b;
                pt7Var4.M(16);
                int iM2 = pt7Var4.m();
                if (iM2 == 1936684398) {
                    i2 = 1;
                } else if (iM2 == 1986618469) {
                    i2 = 2;
                } else if (iM2 == 1952807028 || iM2 == 1935832172 || iM2 == 1937072756 || iM2 == 1668047728 || iM2 == 1937072752) {
                    i2 = 3;
                } else {
                    i2 = iM2 == 1835365473 ? 5 : -1;
                }
                int i60 = 1;
                i3 = i59;
                if (i2 == -1) {
                    bsaVar = null;
                    j3 = 0;
                } else {
                    j3 = 0;
                    sz6.b bVarC4 = aVar3.c(1953196132);
                    bVarC4.getClass();
                    pt7 pt7Var5 = bVarC4.b;
                    pt7Var5.M(8);
                    int iE2 = e(pt7Var5.m());
                    pt7Var5.N(iE2 != 0 ? 16 : 8);
                    int iM3 = pt7Var5.m();
                    pt7Var5.N(4);
                    int i61 = pt7Var5.b;
                    int i62 = iE2 == 0 ? 4 : 8;
                    int i63 = 0;
                    while (true) {
                        jU = -9223372036854775807L;
                        if (i63 >= i62) {
                            pt7Var5.N(i62);
                        } else {
                            if (pt7Var5.a[i61 + i63] != -1) {
                                long jB2 = iE2 == 0 ? pt7Var5.B() : pt7Var5.F();
                                if (jB2 != 0) {
                                    j4 = jB2;
                                    break;
                                }
                                break;
                            }
                            i63++;
                        }
                        j4 = -9223372036854775807L;
                        break;
                    }
                    pt7Var5.N(10);
                    int iG2 = pt7Var5.G();
                    pt7Var5.N(4);
                    int iM4 = pt7Var5.m();
                    int iM5 = pt7Var5.m();
                    pt7Var5.N(4);
                    int iM6 = pt7Var5.m();
                    int iM7 = pt7Var5.m();
                    if (iM4 == 0 && iM5 == 65536 && ((iM6 == -65536 || iM6 == 65536) && iM7 == 0)) {
                        i4 = 90;
                    } else if (iM4 == 0 && iM5 == -65536 && ((iM6 == 65536 || iM6 == -65536) && iM7 == 0)) {
                        i4 = 270;
                    } else {
                        if ((iM4 == -65536 || iM4 == 65536) && iM5 == 0 && iM6 == 0 && iM7 == -65536) {
                            i4 = 180;
                        } else {
                            i5 = 0;
                        }
                        pt7Var5.N(16);
                        short sW = pt7Var5.w();
                        pt7Var5.N(2);
                        jVar = new j(iM3, iG2, i5, sW, pt7Var5.w(), j4);
                        if (j2 == -9223372036854775807L) {
                            j5 = j4;
                        } else {
                            j5 = j2;
                        }
                        j6 = g(bVarC2.b).c;
                        if (j5 == -9223372036854775807L) {
                            j7 = j6;
                            jU2 = -9223372036854775807L;
                        } else {
                            String str3 = n6b.a;
                            j7 = j6;
                            jU2 = n6b.U(j5, 1000000L, j7, RoundingMode.DOWN);
                        }
                        sz6.a aVarB3 = aVarB2.b(1835626086);
                        aVarB3.getClass();
                        sz6.a aVarB4 = aVarB3.b(1937007212);
                        aVarB4.getClass();
                        sz6.b bVarC5 = aVarB2.c(1835296868);
                        bVarC5.getClass();
                        pt7Var = bVarC5.b;
                        pt7Var.M(8);
                        iE = e(pt7Var.m());
                        if (iE == 0) {
                            i6 = 8;
                        } else {
                            i6 = 16;
                        }
                        pt7Var.N(i6);
                        jB = pt7Var.B();
                        i7 = pt7Var.b;
                        if (iE == 0) {
                            i8 = 4;
                        } else {
                            i8 = 8;
                        }
                        i9 = 0;
                        while (true) {
                            if (i9 < i8) {
                                pt7Var.N(i8);
                                break;
                            }
                            if (pt7Var.a[i7 + i9] != -1) {
                                if (iE == 0) {
                                    jF = pt7Var.B();
                                } else {
                                    jF = pt7Var.F();
                                }
                                j9 = jF;
                                if (j9 != 0) {
                                    break;
                                }
                                String str4 = n6b.a;
                                jU = n6b.U(j9, 1000000L, jB, RoundingMode.DOWN);
                                break;
                            }
                            i9++;
                        }
                        j8 = jU;
                        int iG3 = pt7Var.G();
                        cArr = new char[]{(char) (((iG3 >> 10) & 31) + 96), (char) (((iG3 >> 5) & 31) + 96), (char) ((iG3 & 31) + 96)};
                        i10 = 0;
                        while (true) {
                            if (i10 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c2 = cArr[i10];
                            if (c2 >= 'a' || c2 > 'z') {
                                str = null;
                                break;
                            }
                            i10++;
                        }
                        bVarC = aVarB4.c(1937011556);
                        if (bVarC == null) {
                            md6.g("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            gVarI = i(bVarC.b, jVar, str, h83Var, z2);
                            if (!z || (aVarB = aVar3.b(1701082227)) == null) {
                                jArr = null;
                                jArr2 = null;
                            } else {
                                sz6.b bVarC6 = aVarB.c(1701606260);
                                if (bVarC6 == null) {
                                    pairCreate = null;
                                } else {
                                    pt7 pt7Var6 = bVarC6.b;
                                    pt7Var6.M(8);
                                    int iE3 = e(pt7Var6.m());
                                    int iD6 = pt7Var6.D();
                                    long[] jArr14 = new long[iD6];
                                    long[] jArr15 = new long[iD6];
                                    int i64 = 0;
                                    while (i64 < iD6) {
                                        int i65 = i64;
                                        int i66 = i60;
                                        jArr14[i65] = iE3 == i66 ? pt7Var6.F() : pt7Var6.B();
                                        jArr15[i65] = iE3 == i66 ? pt7Var6.t() : pt7Var6.m();
                                        if (pt7Var6.w() != 1) {
                                            z90.a("Unsupported media rate.");
                                            return null;
                                        }
                                        pt7Var6.N(2);
                                        i64 = i65 + 1;
                                        i60 = 1;
                                    }
                                    pairCreate = Pair.create(jArr14, jArr15);
                                }
                                if (pairCreate != null) {
                                    long[] jArr16 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr16;
                                } else {
                                    jArr = null;
                                    jArr2 = null;
                                }
                            }
                            id4Var = gVarI.b;
                            if (id4Var == null) {
                                i11 = jVar.b;
                                if (i11 != 0) {
                                    rz6Var = new rz6(i11);
                                    id4.a aVarA = id4Var.a();
                                    su6Var = gVarI.b.l;
                                    if (su6Var != null) {
                                        su6Var2 = su6Var.a(rz6Var);
                                    } else {
                                        su6Var2 = new su6(rz6Var);
                                    }
                                    aVarA.k = su6Var2;
                                    id4Var2 = new id4(aVarA);
                                } else {
                                    id4Var2 = id4Var;
                                }
                                bsaVar = new bsa(jVar.a, i2, jB, j7, jU2, j8, id4Var2, gVarI.d, gVarI.a, gVarI.c, jArr, jArr2);
                            }
                        }
                        bsaVar = null;
                    }
                    i5 = i4;
                    pt7Var5.N(16);
                    short sW2 = pt7Var5.w();
                    pt7Var5.N(2);
                    jVar = new j(iM3, iG2, i5, sW2, pt7Var5.w(), j4);
                    if (j2 == -9223372036854775807L) {
                        j5 = j4;
                    } else {
                        j5 = j2;
                    }
                    j6 = g(bVarC2.b).c;
                    if (j5 == -9223372036854775807L) {
                        j7 = j6;
                        jU2 = -9223372036854775807L;
                    } else {
                        String str5 = n6b.a;
                        j7 = j6;
                        jU2 = n6b.U(j5, 1000000L, j7, RoundingMode.DOWN);
                    }
                    sz6.a aVarB5 = aVarB2.b(1835626086);
                    aVarB5.getClass();
                    sz6.a aVarB6 = aVarB5.b(1937007212);
                    aVarB6.getClass();
                    sz6.b bVarC7 = aVarB2.c(1835296868);
                    bVarC7.getClass();
                    pt7Var = bVarC7.b;
                    pt7Var.M(8);
                    iE = e(pt7Var.m());
                    if (iE == 0) {
                        i6 = 8;
                    } else {
                        i6 = 16;
                    }
                    pt7Var.N(i6);
                    jB = pt7Var.B();
                    i7 = pt7Var.b;
                    if (iE == 0) {
                        i8 = 4;
                    } else {
                        i8 = 8;
                    }
                    i9 = 0;
                    while (true) {
                        if (i9 < i8) {
                            pt7Var.N(i8);
                            break;
                        }
                        if (pt7Var.a[i7 + i9] != -1) {
                            if (iE == 0) {
                                jF = pt7Var.B();
                            } else {
                                jF = pt7Var.F();
                            }
                            j9 = jF;
                            if (j9 != 0) {
                                break;
                            }
                            String str6 = n6b.a;
                            jU = n6b.U(j9, 1000000L, jB, RoundingMode.DOWN);
                            break;
                        }
                        i9++;
                    }
                    j8 = jU;
                    int iG4 = pt7Var.G();
                    cArr = new char[]{(char) (((iG4 >> 10) & 31) + 96), (char) (((iG4 >> 5) & 31) + 96), (char) ((iG4 & 31) + 96)};
                    i10 = 0;
                    while (true) {
                        if (i10 < 3) {
                            c2 = cArr[i10];
                            if (c2 >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i10++;
                    }
                    bVarC = aVarB6.c(1937011556);
                    if (bVarC == null) {
                        md6.g("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        gVarI = i(bVarC.b, jVar, str, h83Var, z2);
                        if (z) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                        id4Var = gVarI.b;
                        if (id4Var == null) {
                            i11 = jVar.b;
                            if (i11 != 0) {
                                rz6Var = new rz6(i11);
                                id4.a aVarA2 = id4Var.a();
                                su6Var = gVarI.b.l;
                                if (su6Var != null) {
                                    su6Var2 = su6Var.a(rz6Var);
                                } else {
                                    su6Var2 = new su6(rz6Var);
                                }
                                aVarA2.k = su6Var2;
                                id4Var2 = new id4(aVarA2);
                            } else {
                                id4Var2 = id4Var;
                            }
                            bsaVar = new bsa(jVar.a, i2, jB, j7, jU2, j8, id4Var2, gVarI.d, gVarI.a, gVarI.c, jArr, jArr2);
                        }
                    }
                    bsaVar = null;
                }
                bsa bsaVarA = (bsa) yh4Var.apply(bsaVar);
                if (bsaVarA == null) {
                    arrayList = arrayList7;
                    arrayList8 = arrayList8;
                } else {
                    id4 id4Var5 = bsaVarA.g;
                    sz6.a aVarB7 = aVar3.b(1835297121);
                    aVarB7.getClass();
                    sz6.a aVarB8 = aVarB7.b(1835626086);
                    aVarB8.getClass();
                    sz6.a aVarB9 = aVarB8.b(1937007212);
                    aVarB9.getClass();
                    sz6.b bVarC8 = aVarB9.c(1937011578);
                    if (bVarC8 != null) {
                        iVar = new h(bVarC8, id4Var5);
                    } else {
                        sz6.b bVarC9 = aVarB9.c(1937013298);
                        if (bVarC9 == null) {
                            throw ut7.a(null, "Track has no sample table size information");
                        }
                        iVar = new i(bVarC9);
                    }
                    int iB2 = iVar.b();
                    if (iB2 == 0) {
                        isaVar = new isa(bsaVarA, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                        arrayList = arrayList7;
                    } else {
                        if (bsaVarA.b == 2) {
                            long j24 = bsaVarA.f;
                            if (j24 > j3) {
                                id4.a aVarA3 = id4Var5.a();
                                aVarA3.y = iB2 / (j24 / 1000000.0f);
                                bsaVarA = bsaVarA.a(new id4(aVarA3));
                            }
                        }
                        id4 id4Var6 = bsaVarA.g;
                        sz6.b bVarC10 = aVarB9.c(1937007471);
                        if (bVarC10 == null) {
                            bVarC10 = aVarB9.c(1668232756);
                            bVarC10.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        pt7 pt7Var7 = bVarC10.b;
                        sz6.b bVarC11 = aVarB9.c(1937011555);
                        bVarC11.getClass();
                        pt7 pt7Var8 = bVarC11.b;
                        sz6.b bVarC12 = aVarB9.c(1937011827);
                        bVarC12.getClass();
                        pt7 pt7Var9 = bVarC12.b;
                        sz6.b bVarC13 = aVarB9.c(1937011571);
                        pt7 pt7Var10 = bVarC13 != null ? bVarC13.b : null;
                        sz6.b bVarC14 = aVarB9.c(1668576371);
                        pt7 pt7Var11 = bVarC14 != null ? bVarC14.b : null;
                        b bVar = new b(pt7Var8, pt7Var7, z4);
                        pt7Var9.M(12);
                        int iD7 = pt7Var9.D() - 1;
                        int iD8 = pt7Var9.D();
                        arrayList = arrayList7;
                        int iD9 = pt7Var9.D();
                        if (pt7Var11 != null) {
                            pt7Var11.M(12);
                            iD = pt7Var11.D();
                        } else {
                            iD = 0;
                        }
                        if (pt7Var10 != null) {
                            pt7Var10.M(12);
                            iD2 = pt7Var10.D();
                            if (iD2 > 0) {
                                iD3 = pt7Var10.D() - 1;
                            } else {
                                pt7Var10 = null;
                            }
                            iA = iVar.a();
                            pt7Var2 = pt7Var11;
                            String str7 = id4Var6.o;
                            if (iA == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && iD7 == 0 && iD == 0 && iD2 == 0)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (pt7Var10 == null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                                i48 = bVar.a;
                                jArr13 = new long[i48];
                                iArr14 = new int[i48];
                                while (bVar.a()) {
                                    int i67 = bVar.b;
                                    jArr13[i67] = bVar.d;
                                    iArr14[i67] = bVar.c;
                                }
                                j22 = iD9;
                                i49 = 8192 / iA;
                                iG = 0;
                                for (i50 = 0; i50 < i48; i50++) {
                                    iG += n6b.g(iArr14[i50], i49);
                                }
                                jArr5 = new long[iG];
                                iArr15 = new int[iG];
                                jArr6 = new long[iG];
                                iArrCopyOf2 = new int[iG];
                                i51 = 0;
                                i52 = 0;
                                i53 = 0;
                                i54 = 0;
                                i55 = 0;
                                while (i51 < i48) {
                                    int i68 = iArr14[i51];
                                    j23 = jArr13[i51];
                                    int i69 = i55;
                                    int i70 = i51;
                                    i56 = i54;
                                    i57 = i69;
                                    int i71 = i48;
                                    i58 = i68;
                                    while (i58 > 0) {
                                        int iMin = Math.min(i49, i58);
                                        jArr5[i57] = j23;
                                        int i72 = i49;
                                        int i73 = iA * iMin;
                                        iArr15[i57] = i73;
                                        i53 += i73;
                                        int iMax = Math.max(i56, i73);
                                        jArr6[i57] = ((long) i52) * j22;
                                        iArrCopyOf2[i57] = 1;
                                        j23 += (long) iArr15[i57];
                                        i52 += iMin;
                                        i58 -= iMin;
                                        i57++;
                                        i49 = i72;
                                        i56 = iMax;
                                    }
                                    int i74 = i49;
                                    int i75 = i70 + 1;
                                    i55 = i57;
                                    i48 = i71;
                                    i54 = i56;
                                    i51 = i75;
                                    i49 = i74;
                                }
                                long j25 = j22 * ((long) i52);
                                j14 = i53;
                                if (z3) {
                                    jArr5 = new long[0];
                                }
                                if (z3) {
                                    iArr15 = new int[0];
                                }
                                if (z3) {
                                    jArr6 = new long[0];
                                }
                                if (z3) {
                                    iArrCopyOf2 = new int[0];
                                }
                                arrayList3 = arrayList2;
                                j13 = j25;
                                i21 = iG;
                                iArr2 = iArr15;
                                i22 = i54;
                            } else {
                                if (z3) {
                                    jArr3 = new long[0];
                                } else {
                                    jArr3 = new long[iB2];
                                }
                                if (z3) {
                                    iArrCopyOf = new int[0];
                                } else {
                                    iArrCopyOf = new int[iB2];
                                }
                                eVar = iVar;
                                if (z3) {
                                    jArr4 = new long[0];
                                } else {
                                    jArr4 = new long[iB2];
                                }
                                int i76 = iD2;
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iB2];
                                }
                                i12 = iD7;
                                i13 = iD;
                                i14 = iD9;
                                i15 = i76;
                                j10 = j3;
                                j11 = j10;
                                j12 = j11;
                                i16 = 0;
                                iM = 0;
                                i17 = 0;
                                iD4 = 0;
                                i18 = iD8;
                                iD5 = iD3;
                                pt7Var3 = pt7Var10;
                                i19 = 0;
                                while (true) {
                                    if (i19 < iB2) {
                                        arrayList3 = arrayList2;
                                        jArr5 = jArr3;
                                        jArr6 = jArr4;
                                        iArrCopyOf2 = iArr;
                                        i20 = i17;
                                        break;
                                    }
                                    zA = true;
                                    while (i17 == 0) {
                                        zA = bVar.a();
                                        if (zA) {
                                            break;
                                        }
                                        j12 = bVar.d;
                                        i17 = bVar.c;
                                        arrayList2 = arrayList2;
                                        i14 = i14;
                                    }
                                    i23 = i14;
                                    arrayList4 = arrayList2;
                                    if (!zA) {
                                        md6.g("BoxParsers", "Unexpected end of chunk data");
                                        if (z3) {
                                            long[] jArrCopyOf = Arrays.copyOf(jArr3, i19);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                            long[] jArrCopyOf2 = Arrays.copyOf(jArr4, i19);
                                            jArr5 = jArrCopyOf;
                                            iArrCopyOf2 = Arrays.copyOf(iArr, i19);
                                            iB2 = i19;
                                            i20 = i17;
                                            arrayList3 = arrayList4;
                                            jArr6 = jArrCopyOf2;
                                            break;
                                        }
                                        jArr5 = jArr3;
                                        iArrCopyOf2 = iArr;
                                        iB2 = i19;
                                        i20 = i17;
                                        arrayList3 = arrayList4;
                                        jArr6 = jArr4;
                                        break;
                                    }
                                    if (pt7Var2 != null) {
                                        while (iD4 == 0 && i13 > 0) {
                                            iD4 = pt7Var2.D();
                                            iM = pt7Var2.m();
                                            i13--;
                                        }
                                        iD4--;
                                    }
                                    iC = eVar.c();
                                    int i77 = iB2;
                                    long j26 = iC;
                                    j11 += j26;
                                    if (iC > i16) {
                                        i16 = iC;
                                    }
                                    if (z3) {
                                        i24 = i16;
                                        iArr3 = iArrCopyOf;
                                    } else {
                                        jArr3[i19] = j12;
                                        iArrCopyOf[i19] = iC;
                                        i24 = i16;
                                        iArr3 = iArrCopyOf;
                                        jArr4[i19] = j10 + ((long) iM);
                                        if (pt7Var3 == null) {
                                            i25 = 1;
                                        } else {
                                            i25 = 0;
                                        }
                                        iArr[i19] = i25;
                                        if (i19 == iD5) {
                                            iArr[i19] = 1;
                                            arrayList5 = arrayList4;
                                            arrayList5.add(Integer.valueOf(i19));
                                        }
                                        if (pt7Var3 != null && i19 == iD5 && (i15 = i15 - 1) > 0) {
                                            iD5 = pt7Var3.D() - 1;
                                        }
                                        int i78 = iM;
                                        int i79 = i23;
                                        ArrayList arrayList9 = arrayList5;
                                        j10 += (long) i79;
                                        i18--;
                                        if (i18 != 0 && i12 > 0) {
                                            int iD10 = pt7Var9.D();
                                            int iM8 = pt7Var9.m();
                                            i12--;
                                            i18 = iD10;
                                            i79 = iM8;
                                        }
                                        j12 += j26;
                                        i17--;
                                        i19++;
                                        iArrCopyOf = iArr3;
                                        iB2 = i77;
                                        iM = i78;
                                        arrayList2 = arrayList9;
                                        i14 = i79;
                                        i16 = i24;
                                    }
                                    arrayList5 = arrayList4;
                                    if (pt7Var3 != null) {
                                        iD5 = pt7Var3.D() - 1;
                                    }
                                    int i710 = iM;
                                    int i711 = i23;
                                    ArrayList arrayList10 = arrayList5;
                                    j10 += (long) i711;
                                    i18--;
                                    if (i18 != 0) {
                                    }
                                    j12 += j26;
                                    i17--;
                                    i19++;
                                    iArrCopyOf = iArr3;
                                    iB2 = i77;
                                    iM = i710;
                                    arrayList2 = arrayList10;
                                    i14 = i711;
                                    i16 = i24;
                                }
                                long j27 = j10 + ((long) iM);
                                if (pt7Var2 != null) {
                                    z7 = true;
                                    break;
                                }
                                while (true) {
                                    if (i13 > 0) {
                                        z7 = true;
                                        break;
                                    }
                                    if (pt7Var2.D() != 0) {
                                        z7 = false;
                                        break;
                                    }
                                    pt7Var2.m();
                                    i13--;
                                }
                                if (i15 == 0 || i18 != 0 || i20 != 0 || i12 != 0 || iD4 != 0 || !z7) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    p23.a(sb, bsaVarA.a, ": remainingSynchronizationSamples ", i15, ", remainingSamplesAtTimestampDelta ");
                                    p23.a(sb, i18, ", remainingSamplesInChunk ", i20, ", remainingTimestampDeltaChanges ");
                                    sb.append(i12);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(iD4);
                                    if (z7) {
                                        str2 = BuildConfig.FLAVOR;
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb.append(str2);
                                    md6.g("BoxParsers", sb.toString());
                                }
                                i21 = iB2;
                                i22 = i16;
                                iArr2 = iArrCopyOf;
                                j13 = j27;
                                j14 = j11;
                            }
                            jArr7 = jArr5;
                            iArr4 = iArrCopyOf2;
                            j15 = bsaVarA.f;
                            if (j15 > j3) {
                                jU7 = n6b.U(j14 * 8, 1000000L, j15, RoundingMode.HALF_DOWN);
                                if (jU7 > j3 && jU7 < 2147483647L) {
                                    id4.a aVarA4 = id4Var6.a();
                                    aVarA4.h = (int) jU7;
                                    bsaVarA = bsaVarA.a(new id4(aVarA4));
                                }
                            }
                            i26 = bsaVarA.b;
                            j16 = bsaVarA.c;
                            id4Var3 = bsaVarA.g;
                            jArr8 = bsaVarA.j;
                            jArr9 = bsaVarA.i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jU3 = n6b.U(j13, 1000000L, j16, roundingMode);
                            iArrM1 = ek5.m1(arrayList3);
                            if (jArr9 == null) {
                                if (!z3) {
                                    n6b.T(jArr6, j16);
                                }
                                isaVar2 = new isa(bsaVarA, jArr7, iArr2, i22, jArr6, iArr4, iArrM1, z6, jU3, i21);
                            } else {
                                jArr10 = jArr6;
                                if (z3) {
                                    jArr8.getClass();
                                    if (jArr9.length == 1 || jArr9[0] != j3) {
                                        for (i47 = 0; i47 < jArr9.length; i47++) {
                                            if (jArr8[i47] != -1) {
                                                j3 += jArr9[i47];
                                            }
                                        }
                                        jU6 = n6b.U(j3, 1000000L, bsaVarA.d, RoundingMode.DOWN);
                                    } else {
                                        jU6 = n6b.U(j13 - jArr8[0], 1000000L, bsaVarA.c, roundingMode);
                                    }
                                    isaVar2 = new isa(bsaVarA, jArr7, iArr2, i22, jArr10, iArr4, iArrM1, z6, jU6, i21);
                                } else {
                                    if (jArr9.length == 1 || i26 != 1 || jArr10.length < 2) {
                                        j17 = -1;
                                    } else {
                                        jArr8.getClass();
                                        long j28 = jArr8[0];
                                        j17 = -1;
                                        long jU8 = j28 + n6b.U(jArr9[0], bsaVarA.c, bsaVarA.d, roundingMode);
                                        int length = jArr10.length - 1;
                                        int i80 = n6b.i(4, 0, length);
                                        int i81 = n6b.i(jArr10.length - 4, 0, length);
                                        if (jArr10[0] <= j28 && j28 < jArr10[i80] && jArr10[i81] < jU8 && jU8 <= 2 + j13) {
                                            long jMax = Math.max(j3, j13 - jU8);
                                            long jU9 = n6b.U(j28 - jArr10[0], id4Var3.H, bsaVarA.c, roundingMode);
                                            long jU10 = n6b.U(jMax, id4Var3.H, bsaVarA.c, roundingMode);
                                            if ((jU9 != j3 || jU10 != j3) && jU9 <= 2147483647L && jU10 <= 2147483647L) {
                                                lj4Var.a = (int) jU9;
                                                lj4Var.b = (int) jU10;
                                                n6b.T(jArr10, j16);
                                                isaVar2 = new isa(bsaVarA, jArr7, iArr2, i22, jArr10, iArr4, iArrM1, z6, n6b.U(jArr9[0], 1000000L, bsaVarA.d, roundingMode), i21);
                                            }
                                        }
                                    }
                                    i27 = 1;
                                    if (jArr9.length == 1) {
                                        if (jArr9[0] == 0) {
                                            jArr8.getClass();
                                            j21 = jArr8[0];
                                            for (i46 = 0; i46 < jArr10.length; i46++) {
                                                jArr10[i46] = n6b.U(jArr10[i46] - j21, 1000000L, bsaVarA.c, RoundingMode.DOWN);
                                            }
                                            isaVar2 = new isa(bsaVarA, jArr7, iArr2, i22, jArr10, iArr4, iArrM1, z6, n6b.U(j13 - j21, 1000000L, bsaVarA.c, RoundingMode.DOWN), i21);
                                        } else {
                                            i27 = 1;
                                        }
                                    }
                                    iArr5 = iArr2;
                                    i28 = i21;
                                    if (i26 == i27) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    iArr6 = new int[jArr9.length];
                                    iArr7 = new int[jArr9.length];
                                    jArr8.getClass();
                                    i29 = 0;
                                    i30 = 0;
                                    z9 = false;
                                    i31 = 0;
                                    while (i30 < jArr9.length) {
                                        iArr12 = iArr6;
                                        j20 = jArr8[i30];
                                        if (j20 != j17) {
                                            iArr13 = iArr7;
                                            i39 = i30;
                                            jU5 = n6b.U(jArr9[i30], bsaVarA.c, bsaVarA.d, RoundingMode.DOWN) + j20;
                                            boolean z14 = z9;
                                            iArr12[i39] = n6b.f(jArr10, j20, true);
                                            iB = n6b.b(jArr10, jU5, z8);
                                            i40 = iB - 1;
                                            i41 = 0;
                                            while (iB < jArr10.length) {
                                                if (jArr10[iB] >= jU5) {
                                                    i41++;
                                                    if (i41 > id4Var3.q) {
                                                        break;
                                                    }
                                                } else {
                                                    i40 = iB;
                                                }
                                                iB++;
                                            }
                                            iArr13[i39] = i40 + 1;
                                            i42 = iArr12[i39];
                                            while (true) {
                                                i43 = iArr12[i39];
                                                if (i43 > 0 || (iArr4[i43] & 1) != 0) {
                                                    break;
                                                    break;
                                                }
                                                iArr12[i39] = i43 - 1;
                                            }
                                            if (i43 == 0 && (iArr4[0] & 1) == 0) {
                                                iArr12[i39] = i42;
                                                while (true) {
                                                    i45 = iArr12[i39];
                                                    if (i45 < iArr13[i39] || (iArr4[i45] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr12[i39] = i45 + 1;
                                                }
                                            }
                                            int i82 = iArr13[i39];
                                            i44 = iArr12[i39];
                                            int i83 = (i82 - i44) + i31;
                                            if (i29 != i44) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            z9 = z14 | z13;
                                            i31 = i83;
                                            i29 = i82;
                                        } else {
                                            iArr13 = iArr7;
                                            i39 = i30;
                                        }
                                        i30 = i39 + 1;
                                        iArr6 = iArr12;
                                        iArr7 = iArr13;
                                        z8 = z8;
                                    }
                                    iArr8 = iArr6;
                                    iArr9 = iArr7;
                                    boolean z15 = z9;
                                    if (i31 != i28) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    z11 = z15 | z10;
                                    if (z11) {
                                        jArr11 = new long[i31];
                                    } else {
                                        jArr11 = jArr7;
                                    }
                                    if (z11) {
                                        iArr10 = new int[i31];
                                    } else {
                                        iArr10 = iArr5;
                                    }
                                    if (z11) {
                                        i22 = 0;
                                    }
                                    if (z11) {
                                        iArr11 = new int[i31];
                                    } else {
                                        iArr11 = iArr4;
                                    }
                                    if (z11) {
                                        arrayList6 = new ArrayList();
                                    } else {
                                        arrayList6 = arrayList3;
                                    }
                                    jArr12 = new long[i31];
                                    i32 = 0;
                                    z12 = false;
                                    i33 = 0;
                                    i34 = i22;
                                    j18 = 0;
                                    while (i32 < jArr9.length) {
                                        j19 = jArr8[i32];
                                        i35 = iArr8[i32];
                                        id4 id4Var7 = id4Var3;
                                        i36 = iArr9[i32];
                                        long[] jArr17 = jArr9;
                                        if (z11) {
                                            int i84 = i36 - i35;
                                            System.arraycopy(jArr7, i35, jArr11, i33, i84);
                                            System.arraycopy(iArr5, i35, iArr10, i33, i84);
                                            System.arraycopy(iArr4, i35, iArr11, i33, i84);
                                        }
                                        i37 = i34;
                                        while (i35 < i36) {
                                            i38 = i35;
                                            int i85 = i36;
                                            long j29 = bsaVarA.d;
                                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                                            long jU11 = n6b.U(j18, 1000000L, j29, roundingMode2);
                                            jU4 = n6b.U(jArr10[i38] - j19, 1000000L, bsaVarA.c, roundingMode2);
                                            if (jU4 < 0) {
                                                z12 = true;
                                            }
                                            jArr12[i33] = jU11 + jU4;
                                            if (z11 && iArr10[i33] > i37) {
                                                i37 = iArr5[i38];
                                            }
                                            if (!z11 && !z6 && (iArr11[i33] & 1) != 0) {
                                                arrayList6.add(Integer.valueOf(i33));
                                            }
                                            i33++;
                                            i35 = i38 + 1;
                                            i36 = i85;
                                        }
                                        j18 += jArr17[i32];
                                        i32++;
                                        i34 = i37;
                                        id4Var3 = id4Var7;
                                        jArr9 = jArr17;
                                    }
                                    id4Var4 = id4Var3;
                                    long jU12 = n6b.U(j18, 1000000L, bsaVarA.d, RoundingMode.DOWN);
                                    if (z12) {
                                        id4.a aVarA5 = id4Var4.a();
                                        aVarA5.t = true;
                                        bsaVarA = bsaVarA.a(new id4(aVarA5));
                                    }
                                    isaVar = new isa(bsaVarA, jArr11, iArr10, i34, jArr12, iArr11, ek5.m1(arrayList6), z6, jU12, jArr11.length);
                                }
                            }
                            isaVar = isaVar2;
                        } else {
                            iD2 = 0;
                        }
                        iD3 = -1;
                        iA = iVar.a();
                        pt7Var2 = pt7Var11;
                        String str8 = id4Var6.o;
                        if (iA == -1) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (pt7Var10 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5) {
                            i48 = bVar.a;
                            jArr13 = new long[i48];
                            iArr14 = new int[i48];
                            while (bVar.a()) {
                                int i610 = bVar.b;
                                jArr13[i610] = bVar.d;
                                iArr14[i610] = bVar.c;
                            }
                            j22 = iD9;
                            i49 = 8192 / iA;
                            iG = 0;
                            while (i50 < i48) {
                                iG += n6b.g(iArr14[i50], i49);
                            }
                            jArr5 = new long[iG];
                            iArr15 = new int[iG];
                            jArr6 = new long[iG];
                            iArrCopyOf2 = new int[iG];
                            i51 = 0;
                            i52 = 0;
                            i53 = 0;
                            i54 = 0;
                            i55 = 0;
                            while (i51 < i48) {
                                int i611 = iArr14[i51];
                                j23 = jArr13[i51];
                                int i612 = i55;
                                int i712 = i51;
                                i56 = i54;
                                i57 = i612;
                                int i713 = i48;
                                i58 = i611;
                                while (i58 > 0) {
                                    int iMin2 = Math.min(i49, i58);
                                    jArr5[i57] = j23;
                                    int i714 = i49;
                                    int i715 = iA * iMin2;
                                    iArr15[i57] = i715;
                                    i53 += i715;
                                    int iMax2 = Math.max(i56, i715);
                                    jArr6[i57] = ((long) i52) * j22;
                                    iArrCopyOf2[i57] = 1;
                                    j23 += (long) iArr15[i57];
                                    i52 += iMin2;
                                    i58 -= iMin2;
                                    i57++;
                                    i49 = i714;
                                    i56 = iMax2;
                                }
                                int i716 = i49;
                                int i717 = i712 + 1;
                                i55 = i57;
                                i48 = i713;
                                i54 = i56;
                                i51 = i717;
                                i49 = i716;
                            }
                            long j210 = j22 * ((long) i52);
                            j14 = i53;
                            if (z3) {
                                jArr5 = new long[0];
                            }
                            if (z3) {
                                iArr15 = new int[0];
                            }
                            if (z3) {
                                jArr6 = new long[0];
                            }
                            if (z3) {
                                iArrCopyOf2 = new int[0];
                            }
                            arrayList3 = arrayList2;
                            j13 = j210;
                            i21 = iG;
                            iArr2 = iArr15;
                            i22 = i54;
                        } else {
                            if (z3) {
                                jArr3 = new long[0];
                            } else {
                                jArr3 = new long[iB2];
                            }
                            if (z3) {
                                iArrCopyOf = new int[0];
                            } else {
                                iArrCopyOf = new int[iB2];
                            }
                            eVar = iVar;
                            if (z3) {
                                jArr4 = new long[0];
                            } else {
                                jArr4 = new long[iB2];
                            }
                            int i718 = iD2;
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iB2];
                            }
                            i12 = iD7;
                            i13 = iD;
                            i14 = iD9;
                            i15 = i718;
                            j10 = j3;
                            j11 = j10;
                            j12 = j11;
                            i16 = 0;
                            iM = 0;
                            i17 = 0;
                            iD4 = 0;
                            i18 = iD8;
                            iD5 = iD3;
                            pt7Var3 = pt7Var10;
                            i19 = 0;
                            while (true) {
                                if (i19 < iB2) {
                                    arrayList3 = arrayList2;
                                    jArr5 = jArr3;
                                    jArr6 = jArr4;
                                    iArrCopyOf2 = iArr;
                                    i20 = i17;
                                    break;
                                }
                                zA = true;
                                while (i17 == 0) {
                                    zA = bVar.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    j12 = bVar.d;
                                    i17 = bVar.c;
                                    arrayList2 = arrayList2;
                                    i14 = i14;
                                }
                                i23 = i14;
                                arrayList4 = arrayList2;
                                if (!zA) {
                                    md6.g("BoxParsers", "Unexpected end of chunk data");
                                    if (z3) {
                                        jArr5 = jArr3;
                                        iArrCopyOf2 = iArr;
                                        iB2 = i19;
                                        i20 = i17;
                                        arrayList3 = arrayList4;
                                        jArr6 = jArr4;
                                        break;
                                    }
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i19);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                                    long[] jArrCopyOf4 = Arrays.copyOf(jArr4, i19);
                                    jArr5 = jArrCopyOf3;
                                    iArrCopyOf2 = Arrays.copyOf(iArr, i19);
                                    iB2 = i19;
                                    i20 = i17;
                                    arrayList3 = arrayList4;
                                    jArr6 = jArrCopyOf4;
                                    break;
                                }
                                if (pt7Var2 != null) {
                                    while (iD4 == 0) {
                                        iD4 = pt7Var2.D();
                                        iM = pt7Var2.m();
                                        i13--;
                                    }
                                    iD4--;
                                }
                                iC = eVar.c();
                                int i719 = iB2;
                                long j211 = iC;
                                j11 += j211;
                                if (iC > i16) {
                                    i16 = iC;
                                }
                                if (z3) {
                                    jArr3[i19] = j12;
                                    iArrCopyOf[i19] = iC;
                                    i24 = i16;
                                    iArr3 = iArrCopyOf;
                                    jArr4[i19] = j10 + ((long) iM);
                                    if (pt7Var3 == null) {
                                        i25 = 1;
                                    } else {
                                        i25 = 0;
                                    }
                                    iArr[i19] = i25;
                                    if (i19 == iD5) {
                                        iArr[i19] = 1;
                                        arrayList5 = arrayList4;
                                        arrayList5.add(Integer.valueOf(i19));
                                    }
                                    if (pt7Var3 != null) {
                                        iD5 = pt7Var3.D() - 1;
                                    }
                                    int i7110 = iM;
                                    int i7111 = i23;
                                    ArrayList arrayList11 = arrayList5;
                                    j10 += (long) i7111;
                                    i18--;
                                    if (i18 != 0) {
                                    }
                                    j12 += j211;
                                    i17--;
                                    i19++;
                                    iArrCopyOf = iArr3;
                                    iB2 = i719;
                                    iM = i7110;
                                    arrayList2 = arrayList11;
                                    i14 = i7111;
                                    i16 = i24;
                                } else {
                                    i24 = i16;
                                    iArr3 = iArrCopyOf;
                                }
                                arrayList5 = arrayList4;
                                if (pt7Var3 != null) {
                                    iD5 = pt7Var3.D() - 1;
                                }
                                int i7112 = iM;
                                int i7113 = i23;
                                ArrayList arrayList12 = arrayList5;
                                j10 += (long) i7113;
                                i18--;
                                if (i18 != 0) {
                                }
                                j12 += j211;
                                i17--;
                                i19++;
                                iArrCopyOf = iArr3;
                                iB2 = i719;
                                iM = i7112;
                                arrayList2 = arrayList12;
                                i14 = i7113;
                                i16 = i24;
                            }
                            long j212 = j10 + ((long) iM);
                            if (pt7Var2 != null) {
                                z7 = true;
                                break;
                            }
                            while (true) {
                                if (i13 > 0) {
                                    z7 = true;
                                    break;
                                }
                                if (pt7Var2.D() != 0) {
                                    z7 = false;
                                    break;
                                }
                                pt7Var2.m();
                                i13--;
                            }
                            if (i15 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                p23.a(sb2, bsaVarA.a, ": remainingSynchronizationSamples ", i15, ", remainingSamplesAtTimestampDelta ");
                                p23.a(sb2, i18, ", remainingSamplesInChunk ", i20, ", remainingTimestampDeltaChanges ");
                                sb2.append(i12);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(iD4);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = BuildConfig.FLAVOR;
                                }
                                sb2.append(str2);
                                md6.g("BoxParsers", sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                p23.a(sb3, bsaVarA.a, ": remainingSynchronizationSamples ", i15, ", remainingSamplesAtTimestampDelta ");
                                p23.a(sb3, i18, ", remainingSamplesInChunk ", i20, ", remainingTimestampDeltaChanges ");
                                sb3.append(i12);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iD4);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = BuildConfig.FLAVOR;
                                }
                                sb3.append(str2);
                                md6.g("BoxParsers", sb3.toString());
                            }
                            i21 = iB2;
                            i22 = i16;
                            iArr2 = iArrCopyOf;
                            j13 = j212;
                            j14 = j11;
                        }
                        jArr7 = jArr5;
                        iArr4 = iArrCopyOf2;
                        j15 = bsaVarA.f;
                        if (j15 > j3) {
                            jU7 = n6b.U(j14 * 8, 1000000L, j15, RoundingMode.HALF_DOWN);
                            if (jU7 > j3) {
                                id4.a aVarA6 = id4Var6.a();
                                aVarA6.h = (int) jU7;
                                bsaVarA = bsaVarA.a(new id4(aVarA6));
                            }
                        }
                        i26 = bsaVarA.b;
                        j16 = bsaVarA.c;
                        id4Var3 = bsaVarA.g;
                        jArr8 = bsaVarA.j;
                        jArr9 = bsaVarA.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        jU3 = n6b.U(j13, 1000000L, j16, roundingMode3);
                        iArrM1 = ek5.m1(arrayList3);
                        if (jArr9 == null) {
                            if (!z3) {
                                n6b.T(jArr6, j16);
                            }
                            isaVar2 = new isa(bsaVarA, jArr7, iArr2, i22, jArr6, iArr4, iArrM1, z6, jU3, i21);
                        } else {
                            jArr10 = jArr6;
                            if (z3) {
                                jArr8.getClass();
                                if (jArr9.length == 1) {
                                    while (i47 < jArr9.length) {
                                        if (jArr8[i47] != -1) {
                                            j3 += jArr9[i47];
                                        }
                                    }
                                    jU6 = n6b.U(j3, 1000000L, bsaVarA.d, RoundingMode.DOWN);
                                } else {
                                    while (i47 < jArr9.length) {
                                        if (jArr8[i47] != -1) {
                                            j3 += jArr9[i47];
                                        }
                                    }
                                    jU6 = n6b.U(j3, 1000000L, bsaVarA.d, RoundingMode.DOWN);
                                }
                                isaVar2 = new isa(bsaVarA, jArr7, iArr2, i22, jArr10, iArr4, iArrM1, z6, jU6, i21);
                            } else if (jArr9.length == 1) {
                                j17 = -1;
                                i27 = 1;
                                if (jArr9.length == 1) {
                                    if (jArr9[0] == 0) {
                                        jArr8.getClass();
                                        j21 = jArr8[0];
                                        while (i46 < jArr10.length) {
                                            jArr10[i46] = n6b.U(jArr10[i46] - j21, 1000000L, bsaVarA.c, RoundingMode.DOWN);
                                        }
                                        isaVar2 = new isa(bsaVarA, jArr7, iArr2, i22, jArr10, iArr4, iArrM1, z6, n6b.U(j13 - j21, 1000000L, bsaVarA.c, RoundingMode.DOWN), i21);
                                    } else {
                                        i27 = 1;
                                    }
                                }
                                iArr5 = iArr2;
                                i28 = i21;
                                if (i26 == i27) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr6 = new int[jArr9.length];
                                iArr7 = new int[jArr9.length];
                                jArr8.getClass();
                                i29 = 0;
                                i30 = 0;
                                z9 = false;
                                i31 = 0;
                                while (i30 < jArr9.length) {
                                    iArr12 = iArr6;
                                    j20 = jArr8[i30];
                                    if (j20 != j17) {
                                        iArr13 = iArr7;
                                        i39 = i30;
                                        jU5 = n6b.U(jArr9[i30], bsaVarA.c, bsaVarA.d, RoundingMode.DOWN) + j20;
                                        boolean z16 = z9;
                                        iArr12[i39] = n6b.f(jArr10, j20, true);
                                        iB = n6b.b(jArr10, jU5, z8);
                                        i40 = iB - 1;
                                        i41 = 0;
                                        while (iB < jArr10.length) {
                                            if (jArr10[iB] >= jU5) {
                                                i41++;
                                                if (i41 > id4Var3.q) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i40 = iB;
                                            }
                                            iB++;
                                        }
                                        iArr13[i39] = i40 + 1;
                                        i42 = iArr12[i39];
                                        while (true) {
                                            i43 = iArr12[i39];
                                            if (i43 > 0) {
                                                break;
                                            }
                                            iArr12[i39] = i43 - 1;
                                        }
                                        if (i43 == 0) {
                                            iArr12[i39] = i42;
                                            while (true) {
                                                i45 = iArr12[i39];
                                                if (i45 < iArr13[i39]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr12[i39] = i45 + 1;
                                            }
                                        }
                                        int i86 = iArr13[i39];
                                        i44 = iArr12[i39];
                                        int i87 = (i86 - i44) + i31;
                                        if (i29 != i44) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z9 = z16 | z13;
                                        i31 = i87;
                                        i29 = i86;
                                    } else {
                                        iArr13 = iArr7;
                                        i39 = i30;
                                    }
                                    i30 = i39 + 1;
                                    iArr6 = iArr12;
                                    iArr7 = iArr13;
                                    z8 = z8;
                                }
                                iArr8 = iArr6;
                                iArr9 = iArr7;
                                boolean z17 = z9;
                                if (i31 != i28) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z17 | z10;
                                if (z11) {
                                    jArr11 = new long[i31];
                                } else {
                                    jArr11 = jArr7;
                                }
                                if (z11) {
                                    iArr10 = new int[i31];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i22 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i31];
                                } else {
                                    iArr11 = iArr4;
                                }
                                if (z11) {
                                    arrayList6 = new ArrayList();
                                } else {
                                    arrayList6 = arrayList3;
                                }
                                jArr12 = new long[i31];
                                i32 = 0;
                                z12 = false;
                                i33 = 0;
                                i34 = i22;
                                j18 = 0;
                                while (i32 < jArr9.length) {
                                    j19 = jArr8[i32];
                                    i35 = iArr8[i32];
                                    id4 id4Var8 = id4Var3;
                                    i36 = iArr9[i32];
                                    long[] jArr18 = jArr9;
                                    if (z11) {
                                        int i88 = i36 - i35;
                                        System.arraycopy(jArr7, i35, jArr11, i33, i88);
                                        System.arraycopy(iArr5, i35, iArr10, i33, i88);
                                        System.arraycopy(iArr4, i35, iArr11, i33, i88);
                                    }
                                    i37 = i34;
                                    while (i35 < i36) {
                                        i38 = i35;
                                        int i89 = i36;
                                        long j213 = bsaVarA.d;
                                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                                        long jU13 = n6b.U(j18, 1000000L, j213, roundingMode4);
                                        jU4 = n6b.U(jArr10[i38] - j19, 1000000L, bsaVarA.c, roundingMode4);
                                        if (jU4 < 0) {
                                            z12 = true;
                                        }
                                        jArr12[i33] = jU13 + jU4;
                                        if (z11) {
                                            i37 = iArr5[i38];
                                        }
                                        if (!z11) {
                                        }
                                        i33++;
                                        i35 = i38 + 1;
                                        i36 = i89;
                                    }
                                    j18 += jArr18[i32];
                                    i32++;
                                    i34 = i37;
                                    id4Var3 = id4Var8;
                                    jArr9 = jArr18;
                                }
                                id4Var4 = id4Var3;
                                long jU14 = n6b.U(j18, 1000000L, bsaVarA.d, RoundingMode.DOWN);
                                if (z12) {
                                    id4.a aVarA7 = id4Var4.a();
                                    aVarA7.t = true;
                                    bsaVarA = bsaVarA.a(new id4(aVarA7));
                                }
                                isaVar = new isa(bsaVarA, jArr11, iArr10, i34, jArr12, iArr11, ek5.m1(arrayList6), z6, jU14, jArr11.length);
                            } else {
                                j17 = -1;
                                i27 = 1;
                                if (jArr9.length == 1) {
                                    if (jArr9[0] == 0) {
                                        jArr8.getClass();
                                        j21 = jArr8[0];
                                        while (i46 < jArr10.length) {
                                            jArr10[i46] = n6b.U(jArr10[i46] - j21, 1000000L, bsaVarA.c, RoundingMode.DOWN);
                                        }
                                        isaVar2 = new isa(bsaVarA, jArr7, iArr2, i22, jArr10, iArr4, iArrM1, z6, n6b.U(j13 - j21, 1000000L, bsaVarA.c, RoundingMode.DOWN), i21);
                                    } else {
                                        i27 = 1;
                                    }
                                }
                                iArr5 = iArr2;
                                i28 = i21;
                                if (i26 == i27) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr6 = new int[jArr9.length];
                                iArr7 = new int[jArr9.length];
                                jArr8.getClass();
                                i29 = 0;
                                i30 = 0;
                                z9 = false;
                                i31 = 0;
                                while (i30 < jArr9.length) {
                                    iArr12 = iArr6;
                                    j20 = jArr8[i30];
                                    if (j20 != j17) {
                                        iArr13 = iArr7;
                                        i39 = i30;
                                        jU5 = n6b.U(jArr9[i30], bsaVarA.c, bsaVarA.d, RoundingMode.DOWN) + j20;
                                        boolean z18 = z9;
                                        iArr12[i39] = n6b.f(jArr10, j20, true);
                                        iB = n6b.b(jArr10, jU5, z8);
                                        i40 = iB - 1;
                                        i41 = 0;
                                        while (iB < jArr10.length) {
                                            if (jArr10[iB] >= jU5) {
                                                i41++;
                                                if (i41 > id4Var3.q) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i40 = iB;
                                            }
                                            iB++;
                                        }
                                        iArr13[i39] = i40 + 1;
                                        i42 = iArr12[i39];
                                        while (true) {
                                            i43 = iArr12[i39];
                                            if (i43 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr12[i39] = i43 - 1;
                                        }
                                        if (i43 == 0) {
                                            iArr12[i39] = i42;
                                            while (true) {
                                                i45 = iArr12[i39];
                                                if (i45 < iArr13[i39]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr12[i39] = i45 + 1;
                                            }
                                        }
                                        int i810 = iArr13[i39];
                                        i44 = iArr12[i39];
                                        int i811 = (i810 - i44) + i31;
                                        if (i29 != i44) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z9 = z18 | z13;
                                        i31 = i811;
                                        i29 = i810;
                                    } else {
                                        iArr13 = iArr7;
                                        i39 = i30;
                                    }
                                    i30 = i39 + 1;
                                    iArr6 = iArr12;
                                    iArr7 = iArr13;
                                    z8 = z8;
                                }
                                iArr8 = iArr6;
                                iArr9 = iArr7;
                                boolean z19 = z9;
                                if (i31 != i28) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z19 | z10;
                                if (z11) {
                                    jArr11 = new long[i31];
                                } else {
                                    jArr11 = jArr7;
                                }
                                if (z11) {
                                    iArr10 = new int[i31];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i22 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i31];
                                } else {
                                    iArr11 = iArr4;
                                }
                                if (z11) {
                                    arrayList6 = new ArrayList();
                                } else {
                                    arrayList6 = arrayList3;
                                }
                                jArr12 = new long[i31];
                                i32 = 0;
                                z12 = false;
                                i33 = 0;
                                i34 = i22;
                                j18 = 0;
                                while (i32 < jArr9.length) {
                                    j19 = jArr8[i32];
                                    i35 = iArr8[i32];
                                    id4 id4Var9 = id4Var3;
                                    i36 = iArr9[i32];
                                    long[] jArr19 = jArr9;
                                    if (z11) {
                                        int i812 = i36 - i35;
                                        System.arraycopy(jArr7, i35, jArr11, i33, i812);
                                        System.arraycopy(iArr5, i35, iArr10, i33, i812);
                                        System.arraycopy(iArr4, i35, iArr11, i33, i812);
                                    }
                                    i37 = i34;
                                    while (i35 < i36) {
                                        i38 = i35;
                                        int i813 = i36;
                                        long j214 = bsaVarA.d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jU15 = n6b.U(j18, 1000000L, j214, roundingMode5);
                                        jU4 = n6b.U(jArr10[i38] - j19, 1000000L, bsaVarA.c, roundingMode5);
                                        if (jU4 < 0) {
                                            z12 = true;
                                        }
                                        jArr12[i33] = jU15 + jU4;
                                        if (z11) {
                                            i37 = iArr5[i38];
                                        }
                                        if (!z11) {
                                        }
                                        i33++;
                                        i35 = i38 + 1;
                                        i36 = i813;
                                    }
                                    j18 += jArr19[i32];
                                    i32++;
                                    i34 = i37;
                                    id4Var3 = id4Var9;
                                    jArr9 = jArr19;
                                }
                                id4Var4 = id4Var3;
                                long jU16 = n6b.U(j18, 1000000L, bsaVarA.d, RoundingMode.DOWN);
                                if (z12) {
                                    id4.a aVarA8 = id4Var4.a();
                                    aVarA8.t = true;
                                    bsaVarA = bsaVarA.a(new id4(aVarA8));
                                }
                                isaVar = new isa(bsaVarA, jArr11, iArr10, i34, jArr12, iArr11, ek5.m1(arrayList6), z6, jU16, jArr11.length);
                            }
                        }
                        isaVar = isaVar2;
                    }
                    arrayList8.add(isaVar);
                }
            }
            i59 = i3 + 1;
            aVar2 = aVar;
            arrayList8 = arrayList8;
            arrayList7 = arrayList;
        }
        return arrayList8;
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0351  */
    /* JADX WARN: Code duplicated, block: B:205:0x0356 A[EDGE_INSN: B:205:0x0356->B:208:0x0376 BREAK  A[LOOP:4: B:166:0x02e2->B:206:0x0368]] */
    public static su6 k(sz6.b bVar) {
        int i2;
        boolean z;
        su6 su6Var;
        su6 su6Var2;
        int iA;
        su6 su6Var3;
        Object objE;
        pt7 pt7Var = bVar.b;
        int i3 = 8;
        pt7Var.M(8);
        boolean z2 = false;
        su6 su6Var4 = new su6(new su6.a[0]);
        while (pt7Var.a() >= i3) {
            int i4 = pt7Var.b;
            int iM = pt7Var.m();
            int iM2 = pt7Var.m();
            String str = null;
            if (iM2 == 1835365473) {
                pt7Var.M(i4);
                int i5 = i4 + iM;
                pt7Var.N(i3);
                a(pt7Var);
                while (true) {
                    int i6 = pt7Var.b;
                    if (i6 < i5) {
                        int iM3 = pt7Var.m();
                        if (pt7Var.m() == 1768715124) {
                            pt7Var.M(i6);
                            int i7 = i6 + iM3;
                            pt7Var.N(i3);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i8 = pt7Var.b;
                                if (i8 >= i7) {
                                    break;
                                }
                                int iM4 = pt7Var.m() + i8;
                                int iM5 = pt7Var.m();
                                int i9 = (iM5 >> 24) & 255;
                                if (i9 == 169 || i9 == 253) {
                                    int i10 = 16777215 & iM5;
                                    if (i10 == 6516084) {
                                        int iM6 = pt7Var.m();
                                        if (pt7Var.m() == 1684108385) {
                                            pt7Var.N(8);
                                            String strV = pt7Var.v(iM6 - 16);
                                            objE = new fk1("und", strV, strV);
                                        } else {
                                            md6.g("MetadataUtil", "Failed to parse comment attribute: ".concat(sz6.a(iM5)));
                                            objE = null;
                                        }
                                    } else if (i10 == 7233901 || i10 == 7631467) {
                                        objE = bv6.e(iM5, pt7Var, "TIT2");
                                    } else if (i10 == 6516589 || i10 == 7828084) {
                                        objE = bv6.e(iM5, pt7Var, "TCOM");
                                    } else if (i10 == 6578553) {
                                        objE = bv6.e(iM5, pt7Var, "TDRC");
                                    } else if (i10 == 4280916) {
                                        objE = bv6.e(iM5, pt7Var, "TPE1");
                                    } else if (i10 == 7630703) {
                                        objE = bv6.e(iM5, pt7Var, "TSSE");
                                    } else if (i10 == 6384738) {
                                        objE = bv6.e(iM5, pt7Var, "TALB");
                                    } else if (i10 == 7108978) {
                                        objE = bv6.e(iM5, pt7Var, "USLT");
                                    } else if (i10 == 6776174) {
                                        objE = bv6.e(iM5, pt7Var, "TCON");
                                    } else if (i10 == 6779504) {
                                        objE = bv6.e(iM5, pt7Var, "TIT1");
                                    } else if (i10 == 7173742) {
                                        objE = bv6.e(iM5, pt7Var, "MVNM");
                                    } else if (i10 == 7173737) {
                                        Object objD = bv6.d(iM5, "MVIN", pt7Var, true, false);
                                        pt7Var.M(iM4);
                                        objE = objD;
                                    } else {
                                        md6.c("MetadataUtil", "Skipped unknown metadata entry: ".concat(sz6.a(iM5)));
                                        pt7Var.M(iM4);
                                        objE = null;
                                    }
                                    pt7Var.M(iM4);
                                } else {
                                    if (iM5 == 1735291493) {
                                        try {
                                            String strA = y65.a(bv6.c(pt7Var) - 1);
                                            if (strA != null) {
                                                objE = new rha("TCON", str, k95.v(strA));
                                            } else {
                                                md6.g("MetadataUtil", "Failed to parse standard genre code");
                                                objE = str;
                                            }
                                        } catch (Throwable th) {
                                            pt7Var.M(iM4);
                                            throw th;
                                        }
                                    } else if (iM5 == 1684632427) {
                                        objE = bv6.b(iM5, pt7Var, "TPOS");
                                    } else if (iM5 == 1953655662) {
                                        objE = bv6.b(iM5, pt7Var, "TRCK");
                                    } else if (iM5 == 1953329263) {
                                        objE = bv6.d(iM5, "TBPM", pt7Var, true, z2);
                                    } else if (iM5 == 1668311404) {
                                        objE = bv6.d(iM5, "TCMP", pt7Var, true, true);
                                    } else if (iM5 == 1668249202) {
                                        objE = bv6.a(pt7Var);
                                    } else if (iM5 == 1631670868) {
                                        objE = bv6.e(iM5, pt7Var, "TPE2");
                                    } else if (iM5 == 1936682605) {
                                        objE = bv6.e(iM5, pt7Var, "TSOT");
                                    } else if (iM5 == 1936679276) {
                                        objE = bv6.e(iM5, pt7Var, "TSOA");
                                    } else if (iM5 == 1936679282) {
                                        objE = bv6.e(iM5, pt7Var, "TSOP");
                                    } else if (iM5 == 1936679265) {
                                        objE = bv6.e(iM5, pt7Var, "TSO2");
                                    } else if (iM5 == 1936679791) {
                                        objE = bv6.e(iM5, pt7Var, "TSOC");
                                    } else if (iM5 == 1920233063) {
                                        objE = bv6.d(iM5, "ITUNESADVISORY", pt7Var, z2, z2);
                                    } else if (iM5 == 1885823344) {
                                        objE = bv6.d(iM5, "ITUNESGAPLESS", pt7Var, z2, true);
                                    } else if (iM5 == 1936683886) {
                                        objE = bv6.e(iM5, pt7Var, "TVSHOWSORT");
                                    } else if (iM5 == 1953919848) {
                                        objE = bv6.e(iM5, pt7Var, "TVSHOW");
                                    } else if (iM5 == 757935405) {
                                        String strV2 = str;
                                        String strV3 = strV2;
                                        int i11 = -1;
                                        int i12 = -1;
                                        while (true) {
                                            int i13 = pt7Var.b;
                                            if (i13 >= iM4) {
                                                break;
                                            }
                                            int iM7 = pt7Var.m();
                                            int iM8 = pt7Var.m();
                                            pt7Var.N(4);
                                            if (iM8 == 1835360622) {
                                                strV2 = pt7Var.v(iM7 - 12);
                                            } else if (iM8 == 1851878757) {
                                                strV3 = pt7Var.v(iM7 - 12);
                                            } else {
                                                if (iM8 == 1684108385) {
                                                    i11 = i13;
                                                    i12 = iM7;
                                                }
                                                pt7Var.N(iM7 - 12);
                                            }
                                        }
                                        if (strV2 == null || strV3 == null || i11 == -1) {
                                            objE = null;
                                        } else {
                                            pt7Var.M(i11);
                                            pt7Var.N(16);
                                            objE = new ej5(strV2, strV3, pt7Var.v(i12 - 16));
                                        }
                                        pt7Var.M(iM4);
                                    } else {
                                        md6.c("MetadataUtil", "Skipped unknown metadata entry: ".concat(sz6.a(iM5)));
                                        pt7Var.M(iM4);
                                        objE = null;
                                    }
                                    pt7Var.M(iM4);
                                }
                                if (objE != null) {
                                    arrayList.add(objE);
                                }
                                z2 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                su6Var3 = new su6(arrayList);
                                break;
                            }
                            break;
                        }
                        pt7Var.M(i6 + iM3);
                        i3 = 8;
                        z2 = false;
                        str = null;
                    }
                    su6Var3 = null;
                    break;
                }
                su6Var4 = su6Var4.b(su6Var3);
                i2 = 8;
            } else if (iM2 == 1936553057) {
                pt7Var.M(i4);
                int i14 = i4 + iM;
                pt7Var.N(12);
                while (true) {
                    int i15 = pt7Var.b;
                    if (i15 < i14) {
                        int iM9 = pt7Var.m();
                        if (pt7Var.m() == 1935766900) {
                            if (iM9 >= 16) {
                                pt7Var.N(4);
                                int i16 = -1;
                                int i17 = 0;
                                for (int i18 = 0; i18 < 2; i18++) {
                                    int iZ = pt7Var.z();
                                    int iZ2 = pt7Var.z();
                                    if (iZ == 0) {
                                        i16 = iZ2;
                                    } else if (iZ == 1) {
                                        i17 = iZ2;
                                    }
                                }
                                if (i16 != 12) {
                                    if (i16 != 13) {
                                        if (i16 != 21) {
                                            iA = -2147483647;
                                        } else {
                                            i2 = 8;
                                            if (pt7Var.a() < 8 || pt7Var.b + 8 > i14) {
                                                iA = -2147483647;
                                            } else {
                                                int iM10 = pt7Var.m();
                                                int iM11 = pt7Var.m();
                                                if (iM10 < 12 || iM11 != 1936877170) {
                                                    iA = -2147483647;
                                                } else {
                                                    iA = pt7Var.A();
                                                }
                                            }
                                        }
                                        if (iA == -2147483647) {
                                            su6Var2 = new su6(new ls9(iA, i17));
                                            break;
                                        }
                                        break;
                                    }
                                    iA = 120;
                                } else {
                                    iA = 240;
                                }
                                i2 = 8;
                                if (iA == -2147483647) {
                                    su6Var2 = new su6(new ls9(iA, i17));
                                    break;
                                }
                                break;
                            }
                            su6Var2 = null;
                            i2 = 8;
                            break;
                        }
                        pt7Var.M(i15 + iM9);
                    } else {
                        i2 = 8;
                    }
                    su6Var2 = null;
                    break;
                }
                su6Var4 = su6Var4.b(su6Var2);
            } else {
                i2 = 8;
                if (iM2 == -1451722374) {
                    short sW = pt7Var.w();
                    pt7Var.N(2);
                    String strX = pt7Var.x(sW, StandardCharsets.UTF_8);
                    int iMax = Math.max(strX.lastIndexOf(43), strX.lastIndexOf(45));
                    try {
                        try {
                            wz6 wz6Var = new wz6(Float.parseFloat(strX.substring(0, iMax)), Float.parseFloat(strX.substring(iMax, strX.length() - 1)));
                            su6.a[] aVarArr = new su6.a[1];
                            z = false;
                            try {
                                aVarArr[0] = wz6Var;
                                su6Var = new su6(aVarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                su6Var = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    su6Var4 = su6Var4.b(su6Var);
                }
                pt7Var.M(i4 + iM);
                i3 = i2;
                z2 = z;
            }
            z = false;
            pt7Var.M(i4 + iM);
            i3 = i2;
            z2 = z;
        }
        return su6Var4;
    }
}
