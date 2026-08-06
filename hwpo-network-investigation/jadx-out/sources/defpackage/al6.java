package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.intercom.twig.BuildConfig;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class al6 implements js3 {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map<String, Integer> p0;
    public int A;
    public long B;
    public final SparseArray<List<b.a>> C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final vq2 a;
    public int a0;
    public final mcb b;
    public int b0;
    public final SparseArray<c> c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final z4a.a f;
    public boolean f0;
    public final pt7 g;
    public int g0;
    public final pt7 h;
    public byte h0;
    public final pt7 i;
    public boolean i0;
    public final pt7 j;
    public ls3 j0;
    public final pt7 k;
    public final pt7 l;
    public final pt7 m;
    public final pt7 n;
    public final pt7 o;
    public final pt7 p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public c y;
    public boolean z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:130:0x0294  */
        public final void a(int i, int i2, ks3 ks3Var) throws ut7 {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            long j;
            int i9;
            int i10;
            int[] iArr;
            int i11;
            int i12;
            int i13;
            al6 al6Var = al6.this;
            mcb mcbVar = al6Var.b;
            SparseArray<c> sparseArray = al6Var.c;
            pt7 pt7Var = al6Var.k;
            pt7 pt7Var2 = al6Var.i;
            int i14 = 2;
            int i15 = 0;
            if (i != 161 && i != 163) {
                if (i == 165) {
                    if (al6Var.O != 2) {
                        return;
                    }
                    c cVar = sparseArray.get(al6Var.U);
                    int i16 = al6Var.X;
                    pt7 pt7Var3 = al6Var.p;
                    if (i16 != 4 || !"V_VP9".equals(cVar.c)) {
                        ks3Var.m(i2);
                        return;
                    } else {
                        pt7Var3.J(i2);
                        ks3Var.readFully(pt7Var3.a, 0, i2);
                        return;
                    }
                }
                if (i == 16877) {
                    al6Var.i(i);
                    c cVar2 = al6Var.y;
                    int i17 = cVar2.h;
                    if (i17 != 1685485123 && i17 != 1685480259) {
                        ks3Var.m(i2);
                        return;
                    }
                    byte[] bArr = new byte[i2];
                    cVar2.P = bArr;
                    ks3Var.readFully(bArr, 0, i2);
                    return;
                }
                if (i == 16981) {
                    al6Var.i(i);
                    byte[] bArr2 = new byte[i2];
                    al6Var.y.j = bArr2;
                    ks3Var.readFully(bArr2, 0, i2);
                    return;
                }
                if (i == 18402) {
                    byte[] bArr3 = new byte[i2];
                    ks3Var.readFully(bArr3, 0, i2);
                    al6Var.i(i);
                    al6Var.y.k = new hsa.a(1, bArr3, 0, 0);
                    return;
                }
                if (i == 21419) {
                    Arrays.fill(pt7Var.a, (byte) 0);
                    ks3Var.readFully(pt7Var.a, 4 - i2, i2);
                    pt7Var.M(0);
                    al6Var.A = (int) pt7Var.B();
                    return;
                }
                if (i == 25506) {
                    al6Var.i(i);
                    byte[] bArr4 = new byte[i2];
                    al6Var.y.l = bArr4;
                    ks3Var.readFully(bArr4, 0, i2);
                    return;
                }
                if (i != 30322) {
                    throw ut7.a(null, "Unexpected id: " + i);
                }
                al6Var.i(i);
                byte[] bArr5 = new byte[i2];
                al6Var.y.x = bArr5;
                ks3Var.readFully(bArr5, 0, i2);
                return;
            }
            int i18 = 8;
            if (al6Var.O == 0) {
                al6Var.U = (int) mcbVar.b(ks3Var, false, true, 8);
                al6Var.V = mcbVar.c;
                al6Var.Q = -9223372036854775807L;
                al6Var.O = 1;
                pt7Var2.J(0);
            }
            c cVar3 = sparseArray.get(al6Var.U);
            if (cVar3 == null) {
                ks3Var.m(i2 - al6Var.V);
                al6Var.O = 0;
                return;
            }
            cVar3.a0.getClass();
            if (al6Var.O == 1) {
                al6Var.n(ks3Var, 3);
                int i19 = (pt7Var2.a[2] & 6) >> 1;
                if (i19 == 0) {
                    al6Var.S = 1;
                    int[] iArr2 = al6Var.T;
                    if (iArr2 == null) {
                        iArr2 = new int[1];
                    } else if (iArr2.length < 1) {
                        iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                    }
                    al6Var.T = iArr2;
                    iArr2[0] = (i2 - al6Var.V) - 3;
                } else {
                    al6Var.n(ks3Var, 4);
                    int i20 = (pt7Var2.a[3] & 255) + 1;
                    al6Var.S = i20;
                    int[] iArr3 = al6Var.T;
                    if (iArr3 == null) {
                        iArr3 = new int[i20];
                        i3 = 4;
                    } else {
                        i3 = 4;
                        if (iArr3.length < i20) {
                            iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                        }
                    }
                    al6Var.T = iArr3;
                    if (i19 == 2) {
                        int i21 = (i2 - al6Var.V) - 4;
                        int i22 = al6Var.S;
                        Arrays.fill(iArr3, 0, i22, i21 / i22);
                    } else {
                        if (i19 == 1) {
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = i3;
                            while (true) {
                                i10 = al6Var.S - 1;
                                iArr = al6Var.T;
                                if (i23 >= i10) {
                                    break;
                                }
                                iArr[i23] = 0;
                                while (true) {
                                    i11 = i25 + 1;
                                    al6Var.n(ks3Var, i11);
                                    int i26 = pt7Var2.a[i25] & MessagePack.Code.EXT_TIMESTAMP;
                                    int[] iArr4 = al6Var.T;
                                    i12 = iArr4[i23] + i26;
                                    iArr4[i23] = i12;
                                    if (i26 != 255) {
                                        break;
                                    } else {
                                        i25 = i11;
                                    }
                                }
                                i24 += i12;
                                i23++;
                                i25 = i11;
                            }
                            iArr[i10] = ((i2 - al6Var.V) - i25) - i24;
                        } else {
                            if (i19 != 3) {
                                throw ut7.a(null, "Unexpected lacing value: " + i19);
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = i3;
                            while (true) {
                                int i30 = al6Var.S - 1;
                                int[] iArr5 = al6Var.T;
                                if (i27 >= i30) {
                                    i4 = i14;
                                    i5 = i15;
                                    iArr5[i30] = ((i2 - al6Var.V) - i29) - i28;
                                    break;
                                }
                                iArr5[i27] = i15;
                                int i31 = i29 + 1;
                                al6Var.n(ks3Var, i31);
                                if (pt7Var2.a[i29] == 0) {
                                    throw ut7.a(null, "No valid varint length mask found");
                                }
                                int i32 = i15;
                                while (true) {
                                    if (i32 >= i18) {
                                        i6 = i18;
                                        i7 = i14;
                                        i8 = i15;
                                        j = 0;
                                        i9 = i31;
                                        break;
                                    }
                                    i6 = i18;
                                    int i33 = 1 << (7 - i32);
                                    i8 = i15;
                                    if ((pt7Var2.a[i29] & i33) != 0) {
                                        i9 = i31 + i32;
                                        al6Var.n(ks3Var, i9);
                                        i7 = i14;
                                        j = (~i33) & pt7Var2.a[i29] & MessagePack.Code.EXT_TIMESTAMP;
                                        while (i31 < i9) {
                                            j = (j << i6) | ((long) (pt7Var2.a[i31] & MessagePack.Code.EXT_TIMESTAMP));
                                            i31++;
                                        }
                                        if (i27 <= 0) {
                                            break;
                                        }
                                        j -= (1 << ((i32 * 7) + 6)) - 1;
                                        break;
                                    }
                                    i32++;
                                    i15 = i8;
                                    i18 = i6;
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    throw ut7.a(null, "EBML lacing sample size out of range.");
                                }
                                int i34 = (int) j;
                                int[] iArr6 = al6Var.T;
                                if (i27 != 0) {
                                    i34 += iArr6[i27 - 1];
                                }
                                iArr6[i27] = i34;
                                i28 += i34;
                                i27++;
                                i29 = i9;
                                i15 = i8;
                                i18 = i6;
                                i14 = i7;
                            }
                        }
                        byte[] bArr6 = pt7Var2.a;
                        al6Var.P = al6Var.p((bArr6[1] & MessagePack.Code.EXT_TIMESTAMP) | (bArr6[i5] << 8)) + al6Var.M;
                        if (cVar3.e != 1 || (i == 163 && (pt7Var2.a[i4] & 128) == 128)) {
                            i13 = 1;
                        } else {
                            i13 = i5;
                        }
                        al6Var.W = i13;
                        al6Var.O = i4;
                        al6Var.R = i5;
                    }
                }
                i4 = 2;
                i5 = 0;
                byte[] bArr7 = pt7Var2.a;
                al6Var.P = al6Var.p((bArr7[1] & MessagePack.Code.EXT_TIMESTAMP) | (bArr7[i5] << 8)) + al6Var.M;
                if (cVar3.e != 1) {
                    i13 = 1;
                } else {
                    i13 = 1;
                }
                al6Var.W = i13;
                al6Var.O = i4;
                al6Var.R = i5;
            }
            if (i == 163) {
                while (true) {
                    int i35 = al6Var.R;
                    if (i35 >= al6Var.S) {
                        al6Var.O = 0;
                        return;
                    }
                    al6Var.j(cVar3, ((long) ((al6Var.R * cVar3.f) / 1000)) + al6Var.P, al6Var.W, al6Var.q(ks3Var, cVar3, al6Var.T[i35], false), 0);
                    al6Var.R++;
                }
            } else {
                while (true) {
                    int i36 = al6Var.R;
                    if (i36 >= al6Var.S) {
                        return;
                    }
                    int[] iArr7 = al6Var.T;
                    iArr7[i36] = al6Var.q(ks3Var, cVar3, iArr7[i36], true);
                    al6Var.R++;
                }
            }
        }

        public final void b(int i, long j) throws ut7 {
            al6 al6Var = al6.this;
            if (i == 240) {
                if (al6Var.z) {
                    return;
                }
                al6Var.h(i);
                if (al6Var.H == -1) {
                    al6Var.H = j;
                    return;
                }
                return;
            }
            if (i == 241) {
                if (al6Var.z) {
                    return;
                }
                al6Var.h(i);
                if (al6Var.G == -1) {
                    al6Var.G = j;
                    return;
                }
                return;
            }
            if (i == 20529) {
                if (j == 0) {
                    return;
                }
                throw ut7.a(null, "ContentEncodingOrder " + j + " not supported");
            }
            if (i == 20530) {
                if (j == 1) {
                    return;
                }
                throw ut7.a(null, "ContentEncodingScope " + j + " not supported");
            }
            switch (i) {
                case 131:
                    int i2 = (int) j;
                    if (i2 == 1) {
                        al6Var.i(i);
                        al6Var.y.e = 2;
                        return;
                    }
                    if (i2 == 2) {
                        al6Var.i(i);
                        al6Var.y.e = 1;
                        return;
                    } else if (i2 == 17) {
                        al6Var.i(i);
                        al6Var.y.e = 3;
                        return;
                    } else if (i2 != 33) {
                        al6Var.i(i);
                        al6Var.y.e = -1;
                        return;
                    } else {
                        al6Var.i(i);
                        al6Var.y.e = 5;
                        return;
                    }
                case 136:
                    al6Var.i(i);
                    al6Var.y.Y = j == 1;
                    return;
                case 155:
                    al6Var.Q = al6Var.p(j);
                    return;
                case 159:
                    al6Var.i(i);
                    al6Var.y.Q = (int) j;
                    return;
                case 176:
                    al6Var.i(i);
                    al6Var.y.n = (int) j;
                    return;
                case 179:
                    if (al6Var.z) {
                        return;
                    }
                    al6Var.h(i);
                    al6Var.E = al6Var.p(j);
                    return;
                case 186:
                    al6Var.i(i);
                    al6Var.y.o = (int) j;
                    return;
                case 215:
                    al6Var.i(i);
                    al6Var.y.d = (int) j;
                    return;
                case 231:
                    al6Var.M = al6Var.p(j);
                    return;
                case 238:
                    al6Var.X = (int) j;
                    return;
                case 247:
                    if (al6Var.z) {
                        return;
                    }
                    al6Var.h(i);
                    al6Var.F = (int) j;
                    return;
                case 251:
                    al6Var.Y = true;
                    return;
                case 16871:
                    al6Var.i(i);
                    al6Var.y.h = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ut7.a(null, "ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ut7.a(null, "DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ut7.a(null, "EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ut7.a(null, "ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ut7.a(null, "AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    al6Var.B = j + al6Var.s;
                    return;
                case 21432:
                    int i3 = (int) j;
                    al6Var.i(i);
                    if (i3 == 0) {
                        al6Var.y.y = 0;
                        return;
                    }
                    if (i3 == 1) {
                        al6Var.y.y = 2;
                        return;
                    } else if (i3 == 3) {
                        al6Var.y.y = 1;
                        return;
                    } else {
                        if (i3 != 15) {
                            return;
                        }
                        al6Var.y.y = 3;
                        return;
                    }
                case 21680:
                    al6Var.i(i);
                    al6Var.y.q = (int) j;
                    return;
                case 21682:
                    al6Var.i(i);
                    al6Var.y.s = (int) j;
                    return;
                case 21690:
                    al6Var.i(i);
                    al6Var.y.r = (int) j;
                    return;
                case 21930:
                    al6Var.i(i);
                    al6Var.y.X = j == 1;
                    return;
                case 21938:
                    al6Var.i(i);
                    c cVar = al6Var.y;
                    cVar.z = true;
                    cVar.p = (int) j;
                    return;
                case 21998:
                    al6Var.i(i);
                    al6Var.y.g = (int) j;
                    return;
                case 22186:
                    al6Var.i(i);
                    al6Var.y.T = j;
                    return;
                case 22203:
                    al6Var.i(i);
                    al6Var.y.U = j;
                    return;
                case 25188:
                    al6Var.i(i);
                    al6Var.y.R = (int) j;
                    return;
                case 30114:
                    al6Var.Z = j;
                    return;
                case 30321:
                    al6Var.i(i);
                    int i4 = (int) j;
                    if (i4 == 0) {
                        al6Var.y.t = 0;
                        return;
                    }
                    if (i4 == 1) {
                        al6Var.y.t = 1;
                        return;
                    } else if (i4 == 2) {
                        al6Var.y.t = 2;
                        return;
                    } else {
                        if (i4 != 3) {
                            return;
                        }
                        al6Var.y.t = 3;
                        return;
                    }
                case 2352003:
                    al6Var.i(i);
                    al6Var.y.f = (int) j;
                    return;
                case 2807729:
                    al6Var.t = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            al6Var.i(i);
                            int i5 = (int) j;
                            if (i5 == 1) {
                                al6Var.y.C = 2;
                                return;
                            } else {
                                if (i5 != 2) {
                                    return;
                                }
                                al6Var.y.C = 1;
                                return;
                            }
                        case 21946:
                            al6Var.i(i);
                            int iG = xh1.g((int) j);
                            if (iG != -1) {
                                al6Var.y.B = iG;
                                return;
                            }
                            return;
                        case 21947:
                            al6Var.i(i);
                            al6Var.y.z = true;
                            int iF = xh1.f((int) j);
                            if (iF != -1) {
                                al6Var.y.A = iF;
                                return;
                            }
                            return;
                        case 21948:
                            al6Var.i(i);
                            al6Var.y.D = (int) j;
                            return;
                        case 21949:
                            al6Var.i(i);
                            al6Var.y.E = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }

        public final void c(long j, int i, long j2) throws ut7 {
            al6 al6Var = al6.this;
            al6Var.j0.getClass();
            if (i == 160) {
                al6Var.Y = false;
                al6Var.Z = 0L;
                return;
            }
            if (i == 174) {
                c cVar = new c();
                al6Var.y = cVar;
                cVar.a = al6Var.w;
                return;
            }
            if (i == 183) {
                if (al6Var.z) {
                    return;
                }
                al6Var.h(i);
                al6Var.F = -1;
                al6Var.G = -1L;
                al6Var.H = -1L;
                return;
            }
            if (i == 187) {
                if (al6Var.z) {
                    return;
                }
                al6Var.h(i);
                al6Var.E = -9223372036854775807L;
                return;
            }
            if (i == 19899) {
                al6Var.A = -1;
                al6Var.B = -1L;
                return;
            }
            if (i == 20533) {
                al6Var.i(i);
                al6Var.y.i = true;
                return;
            }
            if (i == 21968) {
                al6Var.i(i);
                al6Var.y.z = true;
                return;
            }
            if (i == 408125543) {
                long j3 = al6Var.s;
                if (j3 != -1 && j3 != j) {
                    throw ut7.a(null, "Multiple Segment elements not supported");
                }
                al6Var.s = j;
                al6Var.r = j2;
                return;
            }
            if (i == 475249515) {
                if (al6Var.z) {
                    return;
                }
                al6Var.D = true;
            } else if (i == 524531317 && !al6Var.z) {
                if (al6Var.d && al6Var.K != -1) {
                    al6Var.J = true;
                } else {
                    al6Var.j0.t(new t89.b(al6Var.v));
                    al6Var.z = true;
                }
            }
        }

        public final void d(int i, String str) throws ut7 {
            al6 al6Var = al6.this;
            if (i == 134) {
                al6Var.i(i);
                al6Var.y.c = str;
                return;
            }
            if (i == 17026) {
                if ("webm".equals(str) || "matroska".equals(str)) {
                    al6Var.w = str.equals("webm");
                    return;
                }
                throw ut7.a(null, "DocType " + str + " not supported");
            }
            if (i == 21358) {
                al6Var.i(i);
                al6Var.y.b = str;
            } else {
                if (i != 2274716) {
                    return;
                }
                al6Var.i(i);
                al6Var.y.Z = str;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements t89 {
        public final wc1 a;
        public final SparseArray<List<a>> b;
        public final long c;
        public final int d;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class a implements Comparable<a> {
            public final long t;
            public final long u;
            public final long v;

            public a(long j, long j2, long j3) {
                this.t = j;
                this.u = j2;
                this.v = j3;
            }

            @Override // java.lang.Comparable
            public final int compareTo(a aVar) {
                return Long.compare(this.t, aVar.t);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.t == aVar.t && this.u == aVar.u && this.v == aVar.v;
            }

            public final int hashCode() {
                return Objects.hash(Long.valueOf(this.t), Long.valueOf(this.u), Long.valueOf(this.v));
            }
        }

        public b(SparseArray<List<a>> sparseArray, long j, int i, long j2, long j3) {
            wc1 wc1Var;
            int i2;
            this.b = sparseArray;
            this.c = j;
            this.d = i;
            List<a> list = sparseArray.get(i);
            if (list == null || list.isEmpty()) {
                wc1Var = null;
            } else {
                int size = list.size();
                int[] iArrCopyOf = new int[size];
                long[] jArrCopyOf = new long[size];
                long[] jArrCopyOf2 = new long[size];
                long[] jArrCopyOf3 = new long[size];
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    a aVar = list.get(i4);
                    jArrCopyOf3[i4] = aVar.t;
                    jArrCopyOf[i4] = aVar.u;
                }
                while (true) {
                    i2 = size - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    int i5 = i3 + 1;
                    iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                    jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                    i3 = i5;
                }
                int i6 = i2;
                while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                    i6--;
                }
                iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
                jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
                if (i6 < i2) {
                    md6.g("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                    int i7 = i6 + 1;
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
                }
                wc1Var = new wc1(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
            }
            this.a = wc1Var;
        }

        @Override // defpackage.t89
        public final boolean b() {
            List<a> list = this.b.get(this.d);
            return (list == null || list.isEmpty()) ? false : true;
        }

        @Override // defpackage.t89
        public final t89.a e(long j) {
            wc1 wc1Var = this.a;
            if (wc1Var != null) {
                return wc1Var.e(j);
            }
            v89 v89Var = v89.c;
            return new t89.a(v89Var, v89Var);
        }

        @Override // defpackage.t89
        public final long g() {
            return this.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public byte[] P;
        public iya V;
        public boolean X;
        public boolean a;
        public hsa a0;
        public String b;
        public id4 b0;
        public String c;
        public int c0;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public byte[] j;
        public hsa.a k;
        public byte[] l;
        public h83 m;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = 0;
        public int t = -1;
        public float u = 0.0f;
        public float v = 0.0f;
        public float w = 0.0f;
        public byte[] x = null;
        public int y = -1;
        public boolean z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = 200;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0;
        public long U = 0;
        public boolean W = false;
        public boolean Y = true;
        public String Z = "eng";

        public final byte[] a(String str) throws ut7 {
            byte[] bArr = this.l;
            if (bArr != null) {
                return bArr;
            }
            throw ut7.a(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        String str = n6b.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        i4.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        i4.a(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        p0 = Collections.unmodifiableMap(map);
    }

    public al6(z4a.a aVar, int i) {
        vq2 vq2Var = new vq2();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.a = vq2Var;
        vq2Var.d = new a();
        this.f = aVar;
        this.C = new SparseArray<>();
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new mcb();
        this.c = new SparseArray<>();
        this.i = new pt7(4);
        this.j = new pt7(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new pt7(4);
        this.g = new pt7(f47.a);
        this.h = new pt7(4);
        this.l = new pt7();
        this.m = new pt7();
        this.n = new pt7(8);
        this.o = new pt7();
        this.p = new pt7();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] k(long j, long j2, String str) {
        xl7.g(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = n6b.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x035e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0523  */
    /* JADX WARN: Code duplicated, block: B:626:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:631:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:632:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:635:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:636:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:638:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:640:0x0ac4  */
    /* JADX WARN: Code duplicated, block: B:642:0x0ac9  */
    /* JADX WARN: Code duplicated, block: B:645:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:647:0x0ad6  */
    /* JADX WARN: Code duplicated, block: B:650:0x0add  */
    /* JADX WARN: Code duplicated, block: B:653:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:656:0x0af0  */
    /* JADX WARN: Code duplicated, block: B:658:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:678:0x0bac  */
    /* JADX WARN: Code duplicated, block: B:680:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:683:0x0bcd  */
    /* JADX WARN: Code duplicated, block: B:686:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:689:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:695:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:696:0x0c00  */
    /* JADX WARN: Code duplicated, block: B:698:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:699:0x0c0d  */
    /* JADX WARN: Code duplicated, block: B:701:0x0c17  */
    /* JADX WARN: Code duplicated, block: B:707:0x0c2f  */
    /* JADX WARN: Code duplicated, block: B:709:0x0c48  */
    /* JADX WARN: Code duplicated, block: B:711:0x0c4e  */
    /* JADX WARN: Code duplicated, block: B:726:0x0c79  */
    /* JADX WARN: Code duplicated, block: B:731:0x0c8d  */
    /* JADX WARN: Code duplicated, block: B:732:0x0c90  */
    /* JADX WARN: Code duplicated, block: B:76:0x018f  */
    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [al6$a] */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v16, types: [ks3] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ks3] */
    /* JADX WARN: Type inference failed for: r34v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v153 */
    /* JADX WARN: Type inference failed for: r3v41, types: [int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r6v1, types: [vq2] */
    /* JADX WARN: Type inference failed for: r7v0, types: [mcb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.js3
    public final int c(ks3 ks3Var, o68 o68Var) throws ut7 {
        boolean z;
        int i;
        int i2;
        String str;
        int i3;
        int iA;
        ?? r1;
        boolean z2;
        ?? r2;
        byte b2;
        List<byte[]> listSingletonList;
        int iZ;
        ?? r3;
        int i4;
        String str2;
        List<byte[]> list;
        RuntimeException runtimeException;
        Pair pair;
        String str3;
        List<byte[]> list2;
        List<byte[]> listV;
        String str4;
        List<byte[]> list3;
        List<byte[]> listV2;
        List<byte[]> list4;
        List<byte[]> list5;
        List<byte[]> list6;
        int i5;
        id4.a aVar;
        boolean zI;
        int i6;
        int i7;
        float f;
        xh1 xh1Var;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i8;
        int i9;
        int i10;
        String str6;
        String str7;
        e43 e43VarA;
        int i11;
        List<b.a> list7;
        int i12;
        long j;
        long j2;
        long j3;
        su6 su6Var;
        nla nlaVar;
        su6 su6VarA;
        al6 al6Var = this;
        boolean z3 = false;
        al6Var.N = false;
        boolean z4 = true;
        boolean z5 = true;
        while (z5 && !al6Var.N) {
            ?? r6 = al6Var.a;
            ?? r7 = r6.c;
            ArrayDeque<vq2.a> arrayDeque = r6.b;
            r6.d.getClass();
            while (true) {
                vq2.a aVarPeek = arrayDeque.peek();
                if (aVarPeek == null || ks3Var.getPosition() < aVarPeek.b) {
                    boolean z6 = z3 ? 1 : 0;
                    ?? r4 = ks3Var;
                    if (r6.e == 0) {
                        int i13 = 4;
                        long jB = r7.b(r4, true, z6, 4);
                        if (jB == -2) {
                            byte[] bArr2 = r6.a;
                            r4.l();
                            ?? r5 = z6;
                            while (true) {
                                r4.n(bArr2, r5, i13);
                                byte b3 = bArr2[r5];
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= 8) {
                                        i3 = -1;
                                    } else if ((((long) b3) & mcb.d[i14]) != 0) {
                                        i3 = i14 + 1;
                                    } else {
                                        i14++;
                                    }
                                }
                                if (i3 != -1 && i3 <= 4) {
                                    iA = (int) mcb.a(i3, false, bArr2);
                                    al6 al6Var2 = al6.this;
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    }
                                }
                                r4.m(1);
                                i13 = 4;
                                r5 = 0;
                            }
                            r4.m(i3);
                            jB = iA;
                        }
                        z = true;
                        if (jB == -1) {
                            z5 = false;
                            r1 = r4;
                        } else {
                            r6.f = (int) jB;
                            r6.e = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (r6.e == z) {
                        r6.g = r7.b(r4, false, z, 8);
                        r6.e = 2;
                    }
                    ?? r0 = r6.d;
                    int i15 = r6.f;
                    al6 al6Var3 = al6.this;
                    switch (i15) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        r4.m((int) r6.g);
                        r6.e = 0;
                        z3 = false;
                        z4 = true;
                    } else if (i == 1) {
                        long position = r4.getPosition();
                        arrayDeque.push(new vq2.a(r6.f, r6.g + position));
                        r6.d.c(position, r6.f, r6.g);
                        r6.e = 0;
                        r2 = r4;
                    } else if (i == 2) {
                        long j4 = r6.g;
                        if (j4 > 8) {
                            throw ut7.a(null, "Invalid integer size: " + r6.g);
                        }
                        r0.b(i15, r6.a(r4, (int) j4));
                        r6.e = 0;
                        r2 = r4;
                    } else if (i == 3) {
                        long j5 = r6.g;
                        if (j5 > 2147483647L) {
                            throw ut7.a(null, "String element size: " + r6.g);
                        }
                        int i16 = (int) j5;
                        if (i16 == 0) {
                            str = BuildConfig.FLAVOR;
                            i2 = 0;
                        } else {
                            byte[] bArr3 = new byte[i16];
                            r4.readFully(bArr3, 0, i16);
                            while (i16 > 0 && bArr3[i16 - 1] == 0) {
                                i16--;
                            }
                            i2 = 0;
                            str = new String(bArr3, 0, i16);
                        }
                        r0.d(i15, str);
                        r6.e = i2;
                        r2 = r4;
                    } else if (i == 4) {
                        r0.a(i15, (int) r6.g, r4);
                        r6.e = 0;
                        r2 = r4;
                    } else {
                        if (i != 5) {
                            throw ut7.a(null, "Invalid element type " + i);
                        }
                        long j6 = r6.g;
                        if (j6 != 4 && j6 != 8) {
                            throw ut7.a(null, "Invalid float size: " + r6.g);
                        }
                        int i17 = (int) j6;
                        long jA = r6.a(r4, i17);
                        double dIntBitsToFloat = i17 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                        al6 al6Var4 = al6.this;
                        if (i15 == 181) {
                            al6Var4.i(i15);
                            al6Var4.y.S = (int) dIntBitsToFloat;
                        } else if (i15 != 17545) {
                            switch (i15) {
                                case 21969:
                                    al6Var4.i(i15);
                                    al6Var4.y.F = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    al6Var4.i(i15);
                                    al6Var4.y.G = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    al6Var4.i(i15);
                                    al6Var4.y.H = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    al6Var4.i(i15);
                                    al6Var4.y.I = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    al6Var4.i(i15);
                                    al6Var4.y.J = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    al6Var4.i(i15);
                                    al6Var4.y.K = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    al6Var4.i(i15);
                                    al6Var4.y.L = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    al6Var4.i(i15);
                                    al6Var4.y.M = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    al6Var4.i(i15);
                                    al6Var4.y.N = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    al6Var4.i(i15);
                                    al6Var4.y.O = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i15) {
                                        case 30323:
                                            al6Var4.i(i15);
                                            al6Var4.y.u = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            al6Var4.i(i15);
                                            al6Var4.y.v = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            al6Var4.i(i15);
                                            al6Var4.y.w = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            al6Var4.u = (long) dIntBitsToFloat;
                        }
                        r6.e = 0;
                        r2 = r4;
                    }
                } else {
                    a aVar2 = r6.d;
                    int i18 = arrayDeque.pop().a;
                    al6 al6Var5 = al6.this;
                    SparseArray<List<b.a>> sparseArray = al6Var5.C;
                    SparseArray<c> sparseArray2 = al6Var5.c;
                    al6Var5.j0.getClass();
                    if (i18 != 160) {
                        int i19 = 20;
                        String str8 = "video/webm";
                        if (i18 == 174) {
                            c cVar = al6Var5.y;
                            cVar.getClass();
                            String str9 = cVar.c;
                            if (str9 == null) {
                                throw ut7.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str9) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i20 = cVar.d;
                                    switch (str9) {
                                        case "V_MPEG4/ISO/AP":
                                            b2 = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b2 = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b2 = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b2 = 3;
                                            break;
                                        case "A_VORBIS":
                                            b2 = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b2 = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b2 = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b2 = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b2 = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b2 = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b2 = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b2 = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b2 = 12;
                                            break;
                                        case "A_AAC":
                                            b2 = 13;
                                            break;
                                        case "A_AC3":
                                            b2 = 14;
                                            break;
                                        case "A_DTS":
                                            b2 = 15;
                                            break;
                                        case "V_AV1":
                                            b2 = 16;
                                            break;
                                        case "V_VP8":
                                            b2 = 17;
                                            break;
                                        case "V_VP9":
                                            b2 = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b2 = 19;
                                            break;
                                        case "V_THEORA":
                                            b2 = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b2 = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b2 = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b2 = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b2 = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b2 = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b2 = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b2 = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b2 = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b2 = 29;
                                            break;
                                        case "V_MPEG2":
                                            b2 = 30;
                                            break;
                                        case "A_EAC3":
                                            b2 = 31;
                                            break;
                                        case "A_FLAC":
                                            b2 = 32;
                                            break;
                                        case "A_OPUS":
                                            b2 = 33;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    String str10 = "video/x-unknown";
                                    switch (b2) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = cVar.l;
                                            str10 = "video/mp4v-es";
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            iZ = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null && (e43VarA = e43.a(new pt7(cVar.P))) != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z7 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21 = (z7 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6 || (i8 = cVar.r) == i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (cVar.o * i7) / (cVar.n * i8);
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f || cVar.G == -1.0f || cVar.H == -1.0f || cVar.I == -1.0f || cVar.J == -1.0f || cVar.K == -1.0f || cVar.L == -1.0f || cVar.M == -1.0f || cVar.N == -1.0f || cVar.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((cVar.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((cVar.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((cVar.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((cVar.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((cVar.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((cVar.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((cVar.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((cVar.M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (cVar.N + 0.5f));
                                                        byteBufferOrder.putShort((short) (cVar.O + 0.5f));
                                                        byteBufferOrder.putShort((short) cVar.D);
                                                        byteBufferOrder.putShort((short) cVar.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i22 = cVar.A;
                                                    int i23 = cVar.C;
                                                    int i24 = cVar.B;
                                                    int i25 = cVar.p;
                                                    xh1Var = new xh1(i22, i23, i24, i25, i25, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = map.get(cVar.b).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0 && Float.compare(cVar.u, 0.0f) == 0 && Float.compare(cVar.v, 0.0f) == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0 || Float.compare(cVar.w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(cVar.w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10) && !"text/x-ssa".equals(str10) && !"text/vtt".equals(str10) && !"application/vobsub".equals(str10) && !"application/pgs".equals(str10) && !"application/dvbsubs".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 2:
                                            str8 = "video/webm";
                                            pt7 pt7Var = new pt7(cVar.a(cVar.c));
                                            try {
                                                int iS = pt7Var.s();
                                                if (iS != 1) {
                                                    if (iS == 65534) {
                                                        pt7Var.M(24);
                                                        long jT = pt7Var.t();
                                                        UUID uuid = o0;
                                                        if (jT != uuid.getMostSignificantBits() || pt7Var.t() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str10 = "audio/x-unknown";
                                                        iZ = -1;
                                                        list5 = null;
                                                        str2 = null;
                                                        list6 = list5;
                                                        i4 = -1;
                                                        list = list6;
                                                        if (cVar.P != null) {
                                                            str2 = e43VarA.a;
                                                            str10 = "video/dolby-vision";
                                                        }
                                                        boolean z8 = cVar.Y;
                                                        if (cVar.X) {
                                                            i5 = 2;
                                                        } else {
                                                            i5 = 0;
                                                        }
                                                        int i26 = (z8 ? 1 : 0) | i5;
                                                        aVar = new id4.a();
                                                        zI = fv6.i(str10);
                                                        Map<String, Integer> map2 = p0;
                                                        if (zI) {
                                                            aVar.F = cVar.Q;
                                                            aVar.G = cVar.S;
                                                            aVar.H = iZ;
                                                        } else if (fv6.m(str10)) {
                                                            if (cVar.s == 0) {
                                                                i9 = cVar.q;
                                                                i6 = -1;
                                                                if (i9 == -1) {
                                                                    i9 = cVar.n;
                                                                }
                                                                cVar.q = i9;
                                                                i10 = cVar.r;
                                                                if (i10 == -1) {
                                                                    i10 = cVar.o;
                                                                }
                                                                cVar.r = i10;
                                                            } else {
                                                                i6 = -1;
                                                            }
                                                            i7 = cVar.q;
                                                            if (i7 != i6) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (cVar.z) {
                                                                if (cVar.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i27 = cVar.A;
                                                                int i28 = cVar.C;
                                                                int i29 = cVar.B;
                                                                int i210 = cVar.p;
                                                                xh1Var = new xh1(i27, i28, i29, i210, i210, bArr);
                                                            } else {
                                                                xh1Var = null;
                                                            }
                                                            str5 = cVar.b;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (cVar.t == 0) {
                                                                if (Float.compare(cVar.w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            aVar.u = cVar.n;
                                                            aVar.v = cVar.o;
                                                            aVar.A = f;
                                                            aVar.z = iIntValue;
                                                            aVar.B = cVar.x;
                                                            aVar.C = cVar.y;
                                                            aVar.D = xh1Var;
                                                        } else if (!"application/x-subrip".equals(str10)) {
                                                            throw ut7.a(null, "Unexpected MIME type.");
                                                        }
                                                        str6 = cVar.b;
                                                        if (str6 != null) {
                                                            aVar.b = cVar.b;
                                                        }
                                                        aVar.a = Integer.toString(i20);
                                                        if (cVar.a) {
                                                            str7 = str8;
                                                        } else {
                                                            str7 = "video/x-matroska";
                                                        }
                                                        aVar.m = fv6.n(str7);
                                                        aVar.n = fv6.n(str10);
                                                        aVar.o = i4;
                                                        aVar.d = cVar.Z;
                                                        aVar.e = i26;
                                                        aVar.q = list;
                                                        aVar.j = str2;
                                                        aVar.r = cVar.m;
                                                        cVar.b0 = new id4(aVar);
                                                        cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                                        sparseArray2.put(cVar.d, cVar);
                                                    }
                                                    md6.g("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str10 = "audio/x-unknown";
                                                    iZ = -1;
                                                    list5 = null;
                                                    str2 = null;
                                                    list6 = list5;
                                                    i4 = -1;
                                                    list = list6;
                                                    if (cVar.P != null) {
                                                        str2 = e43VarA.a;
                                                        str10 = "video/dolby-vision";
                                                    }
                                                    boolean z9 = cVar.Y;
                                                    if (cVar.X) {
                                                        i5 = 2;
                                                    } else {
                                                        i5 = 0;
                                                    }
                                                    int i211 = (z9 ? 1 : 0) | i5;
                                                    aVar = new id4.a();
                                                    zI = fv6.i(str10);
                                                    Map<String, Integer> map3 = p0;
                                                    if (zI) {
                                                        aVar.F = cVar.Q;
                                                        aVar.G = cVar.S;
                                                        aVar.H = iZ;
                                                    } else if (fv6.m(str10)) {
                                                        if (cVar.s == 0) {
                                                            i9 = cVar.q;
                                                            i6 = -1;
                                                            if (i9 == -1) {
                                                                i9 = cVar.n;
                                                            }
                                                            cVar.q = i9;
                                                            i10 = cVar.r;
                                                            if (i10 == -1) {
                                                                i10 = cVar.o;
                                                            }
                                                            cVar.r = i10;
                                                        } else {
                                                            i6 = -1;
                                                        }
                                                        i7 = cVar.q;
                                                        if (i7 != i6) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (cVar.z) {
                                                            if (cVar.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i212 = cVar.A;
                                                            int i213 = cVar.C;
                                                            int i214 = cVar.B;
                                                            int i215 = cVar.p;
                                                            xh1Var = new xh1(i212, i213, i214, i215, i215, bArr);
                                                        } else {
                                                            xh1Var = null;
                                                        }
                                                        str5 = cVar.b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (cVar.t == 0) {
                                                            if (Float.compare(cVar.w, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        aVar.u = cVar.n;
                                                        aVar.v = cVar.o;
                                                        aVar.A = f;
                                                        aVar.z = iIntValue;
                                                        aVar.B = cVar.x;
                                                        aVar.C = cVar.y;
                                                        aVar.D = xh1Var;
                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                        throw ut7.a(null, "Unexpected MIME type.");
                                                    }
                                                    str6 = cVar.b;
                                                    if (str6 != null) {
                                                        aVar.b = cVar.b;
                                                    }
                                                    aVar.a = Integer.toString(i20);
                                                    if (cVar.a) {
                                                        str7 = str8;
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    aVar.m = fv6.n(str7);
                                                    aVar.n = fv6.n(str10);
                                                    aVar.o = i4;
                                                    aVar.d = cVar.Z;
                                                    aVar.e = i211;
                                                    aVar.q = list;
                                                    aVar.j = str2;
                                                    aVar.r = cVar.m;
                                                    cVar.b0 = new id4(aVar);
                                                    cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                                    sparseArray2.put(cVar.d, cVar);
                                                    break;
                                                }
                                                int i30 = cVar.R;
                                                String str11 = n6b.a;
                                                iZ = n6b.z(i30, ByteOrder.LITTLE_ENDIAN);
                                                if (iZ == 0) {
                                                    md6.g("MatroskaExtractor", "Unsupported PCM bit depth: " + cVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str10 = "audio/x-unknown";
                                                    iZ = -1;
                                                } else {
                                                    str10 = "audio/raw";
                                                }
                                                list5 = null;
                                                str2 = null;
                                                list6 = list5;
                                                i4 = -1;
                                                list = list6;
                                                if (cVar.P != null) {
                                                    str2 = e43VarA.a;
                                                    str10 = "video/dolby-vision";
                                                }
                                                boolean z10 = cVar.Y;
                                                if (cVar.X) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i216 = (z10 ? 1 : 0) | i5;
                                                aVar = new id4.a();
                                                zI = fv6.i(str10);
                                                Map<String, Integer> map4 = p0;
                                                if (zI) {
                                                    aVar.F = cVar.Q;
                                                    aVar.G = cVar.S;
                                                    aVar.H = iZ;
                                                } else if (fv6.m(str10)) {
                                                    if (cVar.s == 0) {
                                                        i9 = cVar.q;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = cVar.n;
                                                        }
                                                        cVar.q = i9;
                                                        i10 = cVar.r;
                                                        if (i10 == -1) {
                                                            i10 = cVar.o;
                                                        }
                                                        cVar.r = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = cVar.q;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (cVar.z) {
                                                        if (cVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i217 = cVar.A;
                                                        int i218 = cVar.C;
                                                        int i219 = cVar.B;
                                                        int i2110 = cVar.p;
                                                        xh1Var = new xh1(i217, i218, i219, i2110, i2110, bArr);
                                                    } else {
                                                        xh1Var = null;
                                                    }
                                                    str5 = cVar.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (cVar.t == 0) {
                                                        if (Float.compare(cVar.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    aVar.u = cVar.n;
                                                    aVar.v = cVar.o;
                                                    aVar.A = f;
                                                    aVar.z = iIntValue;
                                                    aVar.B = cVar.x;
                                                    aVar.C = cVar.y;
                                                    aVar.D = xh1Var;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ut7.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = cVar.b;
                                                if (str6 != null) {
                                                    aVar.b = cVar.b;
                                                }
                                                aVar.a = Integer.toString(i20);
                                                if (cVar.a) {
                                                    str7 = str8;
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                aVar.m = fv6.n(str7);
                                                aVar.n = fv6.n(str10);
                                                aVar.o = i4;
                                                aVar.d = cVar.Z;
                                                aVar.e = i216;
                                                aVar.q = list;
                                                aVar.j = str2;
                                                aVar.r = cVar.m;
                                                cVar.b0 = new id4(aVar);
                                                cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                                sparseArray2.put(cVar.d, cVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ut7.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            str8 = "video/webm";
                                            cVar.V = new iya();
                                            str10 = "audio/true-hd";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z11 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111 = (z11 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map5 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2112 = cVar.A;
                                                    int i2113 = cVar.C;
                                                    int i2114 = cVar.B;
                                                    int i2115 = cVar.p;
                                                    xh1Var = new xh1(i2112, i2113, i2114, i2115, i2115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i2111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 4:
                                            byte[] bArrA = cVar.a(str9);
                                            try {
                                                r3 = bArrA[0];
                                                try {
                                                    if (r3 != 2) {
                                                        throw ut7.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i31 = 0;
                                                    int i32 = 1;
                                                    while (true) {
                                                        int i33 = bArrA[i32] & 255;
                                                        if (i33 != 255) {
                                                            int i34 = i31 + i33;
                                                            int i35 = i32 + 1;
                                                            int i36 = 0;
                                                            while (true) {
                                                                int i37 = bArrA[i35] & 255;
                                                                if (i37 != 255) {
                                                                    int i38 = i35 + 1;
                                                                    int i39 = i36 + i37;
                                                                    if (bArrA[i38] != 1) {
                                                                        throw ut7.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i34];
                                                                    System.arraycopy(bArrA, i38, bArr6, 0, i34);
                                                                    int i40 = i38 + i34;
                                                                    if (bArrA[i40] != 3) {
                                                                        throw ut7.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i41 = i40 + i39;
                                                                    if (bArrA[i41] != 5) {
                                                                        throw ut7.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrA.length - i41];
                                                                    System.arraycopy(bArrA, i41, bArr7, 0, bArrA.length - i41);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr6);
                                                                    arrayList.add(bArr7);
                                                                    str10 = "audio/vorbis";
                                                                    i4 = 8192;
                                                                    str2 = null;
                                                                    list3 = arrayList;
                                                                    list = list3;
                                                                    iZ = -1;
                                                                    if (cVar.P != null) {
                                                                        str2 = e43VarA.a;
                                                                        str10 = "video/dolby-vision";
                                                                    }
                                                                    boolean z12 = cVar.Y;
                                                                    if (cVar.X) {
                                                                        i5 = 2;
                                                                    } else {
                                                                        i5 = 0;
                                                                    }
                                                                    int i2116 = (z12 ? 1 : 0) | i5;
                                                                    aVar = new id4.a();
                                                                    zI = fv6.i(str10);
                                                                    Map<String, Integer> map6 = p0;
                                                                    if (zI) {
                                                                        aVar.F = cVar.Q;
                                                                        aVar.G = cVar.S;
                                                                        aVar.H = iZ;
                                                                    } else if (fv6.m(str10)) {
                                                                        if (cVar.s == 0) {
                                                                            i9 = cVar.q;
                                                                            i6 = -1;
                                                                            if (i9 == -1) {
                                                                                i9 = cVar.n;
                                                                            }
                                                                            cVar.q = i9;
                                                                            i10 = cVar.r;
                                                                            if (i10 == -1) {
                                                                                i10 = cVar.o;
                                                                            }
                                                                            cVar.r = i10;
                                                                        } else {
                                                                            i6 = -1;
                                                                        }
                                                                        i7 = cVar.q;
                                                                        if (i7 != i6) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (cVar.z) {
                                                                            if (cVar.F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i2117 = cVar.A;
                                                                            int i2118 = cVar.C;
                                                                            int i2119 = cVar.B;
                                                                            int i21110 = cVar.p;
                                                                            xh1Var = new xh1(i2117, i2118, i2119, i21110, i21110, bArr);
                                                                        } else {
                                                                            xh1Var = null;
                                                                        }
                                                                        str5 = cVar.b;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (cVar.t == 0) {
                                                                            if (Float.compare(cVar.w, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        aVar.u = cVar.n;
                                                                        aVar.v = cVar.o;
                                                                        aVar.A = f;
                                                                        aVar.z = iIntValue;
                                                                        aVar.B = cVar.x;
                                                                        aVar.C = cVar.y;
                                                                        aVar.D = xh1Var;
                                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                                        throw ut7.a(null, "Unexpected MIME type.");
                                                                    }
                                                                    str6 = cVar.b;
                                                                    if (str6 != null) {
                                                                        aVar.b = cVar.b;
                                                                    }
                                                                    aVar.a = Integer.toString(i20);
                                                                    if (cVar.a) {
                                                                        str7 = str8;
                                                                    } else {
                                                                        str7 = "video/x-matroska";
                                                                    }
                                                                    aVar.m = fv6.n(str7);
                                                                    aVar.n = fv6.n(str10);
                                                                    aVar.o = i4;
                                                                    aVar.d = cVar.Z;
                                                                    aVar.e = i2116;
                                                                    aVar.q = list;
                                                                    aVar.j = str2;
                                                                    aVar.r = cVar.m;
                                                                    cVar.b0 = new id4(aVar);
                                                                    cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                                                    sparseArray2.put(cVar.d, cVar);
                                                                } else {
                                                                    i36 += 255;
                                                                    i35++;
                                                                }
                                                            }
                                                        } else {
                                                            i31 += 255;
                                                            i32++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ut7.a(r3, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r3 = 0;
                                            }
                                            break;
                                        case 5:
                                            str10 = "audio/mpeg-L2";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list = null;
                                            str2 = null;
                                            i4 = 4096;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z13 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111 = (z13 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map7 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21112 = cVar.A;
                                                    int i21113 = cVar.C;
                                                    int i21114 = cVar.B;
                                                    int i21115 = cVar.p;
                                                    xh1Var = new xh1(i21112, i21113, i21114, i21115, i21115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 6:
                                            str10 = "audio/mpeg";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list = null;
                                            str2 = null;
                                            i4 = 4096;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z14 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21116 = (z14 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map8 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21117 = cVar.A;
                                                    int i21118 = cVar.C;
                                                    int i21119 = cVar.B;
                                                    int i211110 = cVar.p;
                                                    xh1Var = new xh1(i21117, i21118, i21119, i211110, i211110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 7:
                                            pt7 pt7Var2 = new pt7(cVar.a(cVar.c));
                                            try {
                                                pt7Var2.N(16);
                                                long jQ = pt7Var2.q();
                                                if (jQ == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str3 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jQ == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jQ == 826496599) {
                                                            int i42 = pt7Var2.b + 20;
                                                            byte[] bArr8 = pt7Var2.a;
                                                            while (true) {
                                                                if (i42 < bArr8.length - 4) {
                                                                    if (bArr8[i42] == 0 && bArr8[i42 + 1] == 0 && bArr8[i42 + 2] == 1) {
                                                                        if (bArr8[i42 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i42, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i42++;
                                                                } else {
                                                                    runtimeException = null;
                                                                    try {
                                                                        throw ut7.a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    }
                                                                }
                                                                throw ut7.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        md6.g("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str3 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str3 = null;
                                                }
                                                str10 = (String) pair.first;
                                                str2 = str3;
                                                list2 = (List) pair.second;
                                                iZ = -1;
                                                list6 = list2;
                                                i4 = -1;
                                                list = list6;
                                                if (cVar.P != null) {
                                                    str2 = e43VarA.a;
                                                    str10 = "video/dolby-vision";
                                                }
                                                boolean z15 = cVar.Y;
                                                if (cVar.X) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i211111 = (z15 ? 1 : 0) | i5;
                                                aVar = new id4.a();
                                                zI = fv6.i(str10);
                                                Map<String, Integer> map9 = p0;
                                                if (zI) {
                                                    aVar.F = cVar.Q;
                                                    aVar.G = cVar.S;
                                                    aVar.H = iZ;
                                                } else if (fv6.m(str10)) {
                                                    if (cVar.s == 0) {
                                                        i9 = cVar.q;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = cVar.n;
                                                        }
                                                        cVar.q = i9;
                                                        i10 = cVar.r;
                                                        if (i10 == -1) {
                                                            i10 = cVar.o;
                                                        }
                                                        cVar.r = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = cVar.q;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (cVar.z) {
                                                        if (cVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i211112 = cVar.A;
                                                        int i211113 = cVar.C;
                                                        int i211114 = cVar.B;
                                                        int i211115 = cVar.p;
                                                        xh1Var = new xh1(i211112, i211113, i211114, i211115, i211115, bArr);
                                                    } else {
                                                        xh1Var = null;
                                                    }
                                                    str5 = cVar.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (cVar.t == 0) {
                                                        if (Float.compare(cVar.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    aVar.u = cVar.n;
                                                    aVar.v = cVar.o;
                                                    aVar.A = f;
                                                    aVar.z = iIntValue;
                                                    aVar.B = cVar.x;
                                                    aVar.C = cVar.y;
                                                    aVar.D = xh1Var;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ut7.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = cVar.b;
                                                if (str6 != null) {
                                                    aVar.b = cVar.b;
                                                }
                                                aVar.a = Integer.toString(i20);
                                                if (cVar.a) {
                                                    str7 = str8;
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                aVar.m = fv6.n(str7);
                                                aVar.n = fv6.n(str10);
                                                aVar.o = i4;
                                                aVar.d = cVar.Z;
                                                aVar.e = i211111;
                                                aVar.q = list;
                                                aVar.j = str2;
                                                aVar.r = cVar.m;
                                                cVar.b0 = new id4(aVar);
                                                cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                                sparseArray2.put(cVar.d, cVar);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(cVar.a(str9), 0, bArr9, 0, 4);
                                            listV = k95.v(bArr9);
                                            str10 = "application/dvbsubs";
                                            listSingletonList = listV;
                                            iZ = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z16 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211116 = (z16 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map10 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211117 = cVar.A;
                                                    int i211118 = cVar.C;
                                                    int i211119 = cVar.B;
                                                    int i2111110 = cVar.p;
                                                    xh1Var = new xh1(i211117, i211118, i211119, i2111110, i2111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i211116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 10:
                                            og0 og0VarA = og0.a(new pt7(cVar.a(cVar.c)));
                                            ArrayList arrayList2 = og0VarA.a;
                                            cVar.c0 = og0VarA.b;
                                            str4 = og0VarA.l;
                                            str10 = "video/avc";
                                            list4 = arrayList2;
                                            str2 = str4;
                                            list2 = list4;
                                            iZ = -1;
                                            list6 = list2;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z17 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111 = (z17 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map11 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111112 = cVar.A;
                                                    int i2111113 = cVar.C;
                                                    int i2111114 = cVar.B;
                                                    int i2111115 = cVar.p;
                                                    xh1Var = new xh1(i2111112, i2111113, i2111114, i2111115, i2111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i2111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                            listV = k95.v(cVar.a(str9));
                                            str10 = "application/vobsub";
                                            listSingletonList = listV;
                                            iZ = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z18 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111116 = (z18 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map12 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111117 = cVar.A;
                                                    int i2111118 = cVar.C;
                                                    int i2111119 = cVar.B;
                                                    int i21111110 = cVar.p;
                                                    xh1Var = new xh1(i2111117, i2111118, i2111119, i21111110, i21111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i2111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 12:
                                            str10 = "audio/vnd.dts.hd";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z19 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111 = (z19 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map13 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111112 = cVar.A;
                                                    int i21111113 = cVar.C;
                                                    int i21111114 = cVar.B;
                                                    int i21111115 = cVar.p;
                                                    xh1Var = new xh1(i21111112, i21111113, i21111114, i21111115, i21111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            List<byte[]> listSingletonList2 = Collections.singletonList(cVar.a(str9));
                                            byte[] bArr10 = cVar.l;
                                            x.a aVarB = x.b(new ot7(bArr10, bArr10.length), false);
                                            cVar.S = aVarB.a;
                                            cVar.Q = aVarB.b;
                                            str10 = "audio/mp4a-latm";
                                            str2 = aVarB.c;
                                            i4 = -1;
                                            list3 = listSingletonList2;
                                            list = list3;
                                            iZ = -1;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z110 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111116 = (z110 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map14 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111117 = cVar.A;
                                                    int i21111118 = cVar.C;
                                                    int i21111119 = cVar.B;
                                                    int i211111110 = cVar.p;
                                                    xh1Var = new xh1(i21111117, i21111118, i21111119, i211111110, i211111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 14:
                                            str10 = "audio/ac3";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z111 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111 = (z111 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map15 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111112 = cVar.A;
                                                    int i211111113 = cVar.C;
                                                    int i211111114 = cVar.B;
                                                    int i211111115 = cVar.p;
                                                    xh1Var = new xh1(i211111112, i211111113, i211111114, i211111115, i211111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i211111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case h4c.e /* 15 */:
                                        case 21:
                                            cVar.W = true;
                                            str10 = "audio/vnd.dts";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z112 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111116 = (z112 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map16 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111117 = cVar.A;
                                                    int i211111118 = cVar.C;
                                                    int i211111119 = cVar.B;
                                                    int i2111111110 = cVar.p;
                                                    xh1Var = new xh1(i211111117, i211111118, i211111119, i2111111110, i2111111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i211111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                                            byte[] bArr11 = cVar.l;
                                            listV2 = bArr11 == null ? null : k95.v(bArr11);
                                            str10 = "video/av01";
                                            listV = listV2;
                                            listSingletonList = listV;
                                            iZ = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z113 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111111 = (z113 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map17 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111112 = cVar.A;
                                                    int i2111111113 = cVar.C;
                                                    int i2111111114 = cVar.B;
                                                    int i2111111115 = cVar.p;
                                                    xh1Var = new xh1(i2111111112, i2111111113, i2111111114, i2111111115, i2111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i2111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 17:
                                            str10 = "video/x-vnd.on2.vp8";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z114 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111116 = (z114 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map18 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111117 = cVar.A;
                                                    int i2111111118 = cVar.C;
                                                    int i2111111119 = cVar.B;
                                                    int i21111111110 = cVar.p;
                                                    xh1Var = new xh1(i2111111117, i2111111118, i2111111119, i21111111110, i21111111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i2111111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 18:
                                            byte[] bArr12 = cVar.l;
                                            listV2 = bArr12 == null ? null : k95.v(bArr12);
                                            str10 = "video/x-vnd.on2.vp9";
                                            listV = listV2;
                                            listSingletonList = listV;
                                            iZ = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z115 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111 = (z115 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map19 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111112 = cVar.A;
                                                    int i21111111113 = cVar.C;
                                                    int i21111111114 = cVar.B;
                                                    int i21111111115 = cVar.p;
                                                    xh1Var = new xh1(i21111111112, i21111111113, i21111111114, i21111111115, i21111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 19:
                                            str8 = "video/webm";
                                            str10 = "application/pgs";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z116 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111116 = (z116 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map110 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111117 = cVar.A;
                                                    int i21111111118 = cVar.C;
                                                    int i21111111119 = cVar.B;
                                                    int i211111111110 = cVar.p;
                                                    xh1Var = new xh1(i21111111117, i21111111118, i21111111119, i211111111110, i211111111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case InboxPagingSource.PAGE_SIZE /* 20 */:
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z117 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111111 = (z117 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map111 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111112 = cVar.A;
                                                    int i211111111113 = cVar.C;
                                                    int i211111111114 = cVar.B;
                                                    int i211111111115 = cVar.p;
                                                    xh1Var = new xh1(i211111111112, i211111111113, i211111111114, i211111111115, i211111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i211111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 22:
                                            if (cVar.R == 32) {
                                                str8 = "video/webm";
                                                str10 = "audio/raw";
                                                iZ = 4;
                                            } else {
                                                md6.g("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + cVar.R + ". Setting mimeType to audio/x-unknown");
                                                str8 = "video/webm";
                                                str10 = "audio/x-unknown";
                                                iZ = -1;
                                            }
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z118 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111116 = (z118 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map112 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111117 = cVar.A;
                                                    int i211111111118 = cVar.C;
                                                    int i211111111119 = cVar.B;
                                                    int i2111111111110 = cVar.p;
                                                    xh1Var = new xh1(i211111111117, i211111111118, i211111111119, i2111111111110, i2111111111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i211111111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 23:
                                            int i43 = cVar.R;
                                            if (i43 == 8) {
                                                str8 = "video/webm";
                                                str10 = "audio/raw";
                                                iZ = 3;
                                            } else {
                                                if (i43 == 16) {
                                                    iZ = 268435456;
                                                } else if (i43 == 24) {
                                                    iZ = 1342177280;
                                                } else if (i43 == 32) {
                                                    iZ = 1610612736;
                                                } else {
                                                    md6.g("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + cVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str8 = "video/webm";
                                                    str10 = "audio/x-unknown";
                                                    iZ = -1;
                                                }
                                                str8 = "video/webm";
                                                str10 = "audio/raw";
                                            }
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z119 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111111111 = (z119 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map113 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111112 = cVar.A;
                                                    int i2111111111113 = cVar.C;
                                                    int i2111111111114 = cVar.B;
                                                    int i2111111111115 = cVar.p;
                                                    xh1Var = new xh1(i2111111111112, i2111111111113, i2111111111114, i2111111111115, i2111111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i2111111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 24:
                                            int i44 = cVar.R;
                                            String str12 = n6b.a;
                                            iZ = n6b.z(i44, ByteOrder.LITTLE_ENDIAN);
                                            if (iZ == 0) {
                                                md6.g("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + cVar.R + ". Setting mimeType to audio/x-unknown");
                                                str8 = "video/webm";
                                                str10 = "audio/x-unknown";
                                                iZ = -1;
                                                list5 = null;
                                                str2 = null;
                                                list6 = list5;
                                                i4 = -1;
                                                list = list6;
                                                if (cVar.P != null) {
                                                    str2 = e43VarA.a;
                                                    str10 = "video/dolby-vision";
                                                }
                                                boolean z1110 = cVar.Y;
                                                if (cVar.X) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = 0;
                                                }
                                                int i2111111111116 = (z1110 ? 1 : 0) | i5;
                                                aVar = new id4.a();
                                                zI = fv6.i(str10);
                                                Map<String, Integer> map114 = p0;
                                                if (zI) {
                                                    aVar.F = cVar.Q;
                                                    aVar.G = cVar.S;
                                                    aVar.H = iZ;
                                                } else if (fv6.m(str10)) {
                                                    if (cVar.s == 0) {
                                                        i9 = cVar.q;
                                                        i6 = -1;
                                                        if (i9 == -1) {
                                                            i9 = cVar.n;
                                                        }
                                                        cVar.q = i9;
                                                        i10 = cVar.r;
                                                        if (i10 == -1) {
                                                            i10 = cVar.o;
                                                        }
                                                        cVar.r = i10;
                                                    } else {
                                                        i6 = -1;
                                                    }
                                                    i7 = cVar.q;
                                                    if (i7 != i6) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (cVar.z) {
                                                        if (cVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i2111111111117 = cVar.A;
                                                        int i2111111111118 = cVar.C;
                                                        int i2111111111119 = cVar.B;
                                                        int i21111111111110 = cVar.p;
                                                        xh1Var = new xh1(i2111111111117, i2111111111118, i2111111111119, i21111111111110, i21111111111110, bArr);
                                                    } else {
                                                        xh1Var = null;
                                                    }
                                                    str5 = cVar.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (cVar.t == 0) {
                                                        if (Float.compare(cVar.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    aVar.u = cVar.n;
                                                    aVar.v = cVar.o;
                                                    aVar.A = f;
                                                    aVar.z = iIntValue;
                                                    aVar.B = cVar.x;
                                                    aVar.C = cVar.y;
                                                    aVar.D = xh1Var;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw ut7.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = cVar.b;
                                                if (str6 != null) {
                                                    aVar.b = cVar.b;
                                                }
                                                aVar.a = Integer.toString(i20);
                                                if (cVar.a) {
                                                    str7 = str8;
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                aVar.m = fv6.n(str7);
                                                aVar.n = fv6.n(str10);
                                                aVar.o = i4;
                                                aVar.d = cVar.Z;
                                                aVar.e = i2111111111116;
                                                aVar.q = list;
                                                aVar.j = str2;
                                                aVar.r = cVar.m;
                                                cVar.b0 = new id4(aVar);
                                                cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                                sparseArray2.put(cVar.d, cVar);
                                            }
                                            str8 = "video/webm";
                                            str10 = "audio/raw";
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1111 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111111 = (z1111 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map115 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111112 = cVar.A;
                                                    int i21111111111113 = cVar.C;
                                                    int i21111111111114 = cVar.B;
                                                    int i21111111111115 = cVar.p;
                                                    xh1Var = new xh1(i21111111111112, i21111111111113, i21111111111114, i21111111111115, i21111111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 25:
                                        case 26:
                                            listSingletonList = k95.w(l0, cVar.a(str9));
                                            str10 = "text/x-ssa";
                                            iZ = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1112 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111116 = (z1112 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map116 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111117 = cVar.A;
                                                    int i21111111111118 = cVar.C;
                                                    int i21111111111119 = cVar.B;
                                                    int i211111111111110 = cVar.p;
                                                    xh1Var = new xh1(i21111111111117, i21111111111118, i21111111111119, i211111111111110, i211111111111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111111111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 27:
                                            ew4 ew4VarA = ew4.a(new pt7(cVar.a(cVar.c)), false, null);
                                            List<byte[]> list8 = ew4VarA.a;
                                            cVar.c0 = ew4VarA.b;
                                            str4 = ew4VarA.n;
                                            str10 = "video/hevc";
                                            list4 = list8;
                                            str2 = str4;
                                            list2 = list4;
                                            iZ = -1;
                                            list6 = list2;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1113 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111111111 = (z1113 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map117 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111112 = cVar.A;
                                                    int i211111111111113 = cVar.C;
                                                    int i211111111111114 = cVar.B;
                                                    int i211111111111115 = cVar.p;
                                                    xh1Var = new xh1(i211111111111112, i211111111111113, i211111111111114, i211111111111115, i211111111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i211111111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 28:
                                            str8 = "video/webm";
                                            str10 = "text/vtt";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1114 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111111116 = (z1114 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map118 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111117 = cVar.A;
                                                    int i211111111111118 = cVar.C;
                                                    int i211111111111119 = cVar.B;
                                                    int i2111111111111110 = cVar.p;
                                                    xh1Var = new xh1(i211111111111117, i211111111111118, i211111111111119, i2111111111111110, i2111111111111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i211111111111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 29:
                                            str10 = "application/x-subrip";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1115 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111111111111 = (z1115 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map119 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111112 = cVar.A;
                                                    int i2111111111111113 = cVar.C;
                                                    int i2111111111111114 = cVar.B;
                                                    int i2111111111111115 = cVar.p;
                                                    xh1Var = new xh1(i2111111111111112, i2111111111111113, i2111111111111114, i2111111111111115, i2111111111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i2111111111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 30:
                                            str10 = "video/mpeg2";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1116 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i2111111111111116 = (z1116 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map1110 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111117 = cVar.A;
                                                    int i2111111111111118 = cVar.C;
                                                    int i2111111111111119 = cVar.B;
                                                    int i21111111111111110 = cVar.p;
                                                    xh1Var = new xh1(i2111111111111117, i2111111111111118, i2111111111111119, i21111111111111110, i21111111111111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i2111111111111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 31:
                                            str10 = "audio/eac3";
                                            str8 = "video/webm";
                                            iZ = -1;
                                            list5 = null;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1117 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111111111 = (z1117 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map1111 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111112 = cVar.A;
                                                    int i21111111111111113 = cVar.C;
                                                    int i21111111111111114 = cVar.B;
                                                    int i21111111111111115 = cVar.p;
                                                    xh1Var = new xh1(i21111111111111112, i21111111111111113, i21111111111111114, i21111111111111115, i21111111111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111111111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 32:
                                            listV2 = Collections.singletonList(cVar.a(str9));
                                            str10 = "audio/flac";
                                            listV = listV2;
                                            listSingletonList = listV;
                                            iZ = -1;
                                            list5 = listSingletonList;
                                            str2 = null;
                                            list6 = list5;
                                            i4 = -1;
                                            list = list6;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1118 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i21111111111111116 = (z1118 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map1112 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111117 = cVar.A;
                                                    int i21111111111111118 = cVar.C;
                                                    int i21111111111111119 = cVar.B;
                                                    int i211111111111111110 = cVar.p;
                                                    xh1Var = new xh1(i21111111111111117, i21111111111111118, i21111111111111119, i211111111111111110, i211111111111111110, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i21111111111111116;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        case 33:
                                            ArrayList arrayList3 = new ArrayList(3);
                                            arrayList3.add(cVar.a(cVar.c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(cVar.T).array());
                                            arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(cVar.U).array());
                                            str10 = "audio/opus";
                                            i4 = 5760;
                                            list = arrayList3;
                                            str8 = "video/webm";
                                            iZ = -1;
                                            str2 = null;
                                            if (cVar.P != null) {
                                                str2 = e43VarA.a;
                                                str10 = "video/dolby-vision";
                                            }
                                            boolean z1119 = cVar.Y;
                                            if (cVar.X) {
                                                i5 = 2;
                                            } else {
                                                i5 = 0;
                                            }
                                            int i211111111111111111 = (z1119 ? 1 : 0) | i5;
                                            aVar = new id4.a();
                                            zI = fv6.i(str10);
                                            Map<String, Integer> map1113 = p0;
                                            if (zI) {
                                                aVar.F = cVar.Q;
                                                aVar.G = cVar.S;
                                                aVar.H = iZ;
                                            } else if (fv6.m(str10)) {
                                                if (cVar.s == 0) {
                                                    i9 = cVar.q;
                                                    i6 = -1;
                                                    if (i9 == -1) {
                                                        i9 = cVar.n;
                                                    }
                                                    cVar.q = i9;
                                                    i10 = cVar.r;
                                                    if (i10 == -1) {
                                                        i10 = cVar.o;
                                                    }
                                                    cVar.r = i10;
                                                } else {
                                                    i6 = -1;
                                                }
                                                i7 = cVar.q;
                                                if (i7 != i6) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (cVar.z) {
                                                    if (cVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111111112 = cVar.A;
                                                    int i211111111111111113 = cVar.C;
                                                    int i211111111111111114 = cVar.B;
                                                    int i211111111111111115 = cVar.p;
                                                    xh1Var = new xh1(i211111111111111112, i211111111111111113, i211111111111111114, i211111111111111115, i211111111111111115, bArr);
                                                } else {
                                                    xh1Var = null;
                                                }
                                                str5 = cVar.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (cVar.t == 0) {
                                                    if (Float.compare(cVar.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(cVar.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(cVar.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                aVar.u = cVar.n;
                                                aVar.v = cVar.o;
                                                aVar.A = f;
                                                aVar.z = iIntValue;
                                                aVar.B = cVar.x;
                                                aVar.C = cVar.y;
                                                aVar.D = xh1Var;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw ut7.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = cVar.b;
                                            if (str6 != null) {
                                                aVar.b = cVar.b;
                                            }
                                            aVar.a = Integer.toString(i20);
                                            if (cVar.a) {
                                                str7 = str8;
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            aVar.m = fv6.n(str7);
                                            aVar.n = fv6.n(str10);
                                            aVar.o = i4;
                                            aVar.d = cVar.Z;
                                            aVar.e = i211111111111111111;
                                            aVar.q = list;
                                            aVar.j = str2;
                                            aVar.r = cVar.m;
                                            cVar.b0 = new id4(aVar);
                                            cVar.a0 = al6Var5.j0.p(cVar.d, cVar.e);
                                            sparseArray2.put(cVar.d, cVar);
                                            break;
                                        default:
                                            throw ut7.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    al6Var5.y = null;
                                    break;
                            }
                        } else if (i18 != 183) {
                            if (i18 == 19899) {
                                int i45 = al6Var5.A;
                                if (i45 != -1) {
                                    long j7 = al6Var5.B;
                                    if (j7 != -1) {
                                        if (i45 == 475249515) {
                                            al6Var5.K = j7;
                                        }
                                    }
                                }
                                throw ut7.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i18 == 25152) {
                                al6Var5.i(i18);
                                c cVar2 = al6Var5.y;
                                if (cVar2.i) {
                                    hsa.a aVar3 = cVar2.k;
                                    if (aVar3 == null) {
                                        throw ut7.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    cVar2.m = new h83(null, true, new h83.b(i01.a, null, "video/webm", aVar3.b));
                                }
                            } else if (i18 == 28032) {
                                al6Var5.i(i18);
                                c cVar3 = al6Var5.y;
                                if (cVar3.i && cVar3.j != null) {
                                    throw ut7.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i18 == 357149030) {
                                if (al6Var5.t == -9223372036854775807L) {
                                    al6Var5.t = 1000000L;
                                }
                                long j8 = al6Var5.u;
                                if (j8 != -9223372036854775807L) {
                                    al6Var5.v = al6Var5.p(j8);
                                }
                            } else if (i18 == 374648427) {
                                boolean z20 = z3 ? 1 : 0;
                                if (sparseArray2.size() == 0) {
                                    throw ut7.a(null, "No valid tracks were found");
                                }
                                boolean z21 = (!al6Var5.d || al6Var5.K == -1) ? true : z20 ? 1 : 0;
                                int i46 = -1;
                                int i47 = -1;
                                int i48 = -1;
                                int i49 = -1;
                                for (int i50 = z20 ? 1 : 0; i50 < sparseArray2.size(); i50++) {
                                    c cVarValueAt = sparseArray2.valueAt(i50);
                                    int i51 = cVarValueAt.e;
                                    if (i51 == 2) {
                                        if (cVarValueAt.Y) {
                                            i46 = cVarValueAt.d;
                                        }
                                        if (i47 == -1) {
                                            i47 = cVarValueAt.d;
                                        }
                                    } else if (i51 == 1) {
                                        if (cVarValueAt.Y) {
                                            i48 = cVarValueAt.d;
                                        }
                                        if (i49 == -1) {
                                            i49 = cVarValueAt.d;
                                        }
                                    }
                                    if (z21) {
                                        cVarValueAt.a0.getClass();
                                        if (!cVarValueAt.W) {
                                            hsa hsaVar = cVarValueAt.a0;
                                            id4 id4Var = cVarValueAt.b0;
                                            id4Var.getClass();
                                            hsaVar.g(id4Var);
                                        }
                                    }
                                }
                                if (i46 != -1) {
                                    al6Var5.I = i46;
                                } else if (i47 != -1) {
                                    al6Var5.I = i47;
                                } else if (i48 != -1) {
                                    al6Var5.I = i48;
                                } else if (i49 != -1) {
                                    al6Var5.I = i49;
                                } else {
                                    al6Var5.I = sparseArray2.size() > 0 ? sparseArray2.valueAt(z20 ? 1 : 0).d : -1;
                                }
                                if (z21) {
                                    al6Var5.l();
                                }
                            } else if (i18 == 475249515 && !al6Var5.z) {
                                int i52 = z3 ? 1 : 0;
                                while (true) {
                                    if (i52 < sparseArray.size()) {
                                        if (sparseArray.valueAt(i52).isEmpty()) {
                                            i52++;
                                        } else if (al6Var5.v != -9223372036854775807L) {
                                            for (int i53 = z3 ? 1 : 0; i53 < sparseArray.size(); i53++) {
                                                Collections.sort(sparseArray.valueAt(i53));
                                            }
                                            al6Var5.j0.t(new b(sparseArray, al6Var5.v, al6Var5.I, al6Var5.s, al6Var5.r));
                                        }
                                    }
                                    al6Var5.j0.t(new t89.b(al6Var5.v));
                                }
                                al6Var5.z = z4;
                                al6Var5.D = z3;
                                int i54 = z3 ? 1 : 0;
                                while (i54 < sparseArray2.size()) {
                                    c cVarValueAt2 = sparseArray2.valueAt(i54);
                                    long j9 = al6Var5.v;
                                    long j10 = al6Var5.s;
                                    boolean z22 = z3;
                                    int i55 = z4;
                                    long j11 = al6Var5.r;
                                    if (cVarValueAt2.e != 2 || (list7 = sparseArray.get(cVarValueAt2.d)) == null || list7.isEmpty()) {
                                        i12 = i19;
                                    } else {
                                        if (list7.isEmpty()) {
                                            i12 = i19;
                                        } else {
                                            int iMin = Math.min(list7.size(), i19);
                                            double d = 0.0d;
                                            i12 = i19;
                                            int i56 = z22 ? 1 : 0;
                                            int i57 = -1;
                                            while (i56 < iMin) {
                                                b.a aVar4 = list7.get(i56);
                                                long j12 = j9;
                                                long j13 = aVar4.t;
                                                long j14 = aVar4.v;
                                                long j15 = aVar4.u;
                                                if (j13 > 10000000) {
                                                    if (i57 == -1) {
                                                        j = list7.get(i57 == true ? 1 : 0).t;
                                                    }
                                                    if (j != -9223372036854775807L) {
                                                        id4 id4Var2 = cVarValueAt2.b0;
                                                        id4Var2.getClass();
                                                        su6Var = id4Var2.l;
                                                        nlaVar = new nla(j);
                                                        if (su6Var == null) {
                                                            su6.a[] aVarArr = new su6.a[i55];
                                                            aVarArr[z22 ? 1 : 0] = nlaVar;
                                                            su6VarA = new su6(aVarArr);
                                                        } else {
                                                            su6.a[] aVarArr2 = new su6.a[i55];
                                                            aVarArr2[z22 ? 1 : 0] = nlaVar;
                                                            su6VarA = su6Var.a(aVarArr2);
                                                        }
                                                        id4.a aVarA = cVarValueAt2.b0.a();
                                                        aVarA.k = su6VarA;
                                                        cVarValueAt2.b0 = new id4(aVarA);
                                                    }
                                                } else {
                                                    if (i56 < list7.size() - 1) {
                                                        b.a aVar5 = list7.get(i56 + 1);
                                                        j2 = (aVar5.u + aVar5.v) - (j15 + j14);
                                                        j3 = aVar5.t - j13;
                                                    } else {
                                                        j2 = (j10 + j11) - (j15 + j14);
                                                        j3 = j12 - j13;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i57 = i56;
                                                        }
                                                    }
                                                    i56++;
                                                    j9 = j12;
                                                }
                                            }
                                            if (i57 == -1) {
                                                j = list7.get(i57 == true ? 1 : 0).t;
                                            }
                                            if (j != -9223372036854775807L) {
                                                id4 id4Var3 = cVarValueAt2.b0;
                                                id4Var3.getClass();
                                                su6Var = id4Var3.l;
                                                nlaVar = new nla(j);
                                                if (su6Var == null) {
                                                    su6.a[] aVarArr3 = new su6.a[i55];
                                                    aVarArr3[z22 ? 1 : 0] = nlaVar;
                                                    su6VarA = new su6(aVarArr3);
                                                } else {
                                                    su6.a[] aVarArr4 = new su6.a[i55];
                                                    aVarArr4[z22 ? 1 : 0] = nlaVar;
                                                    su6VarA = su6Var.a(aVarArr4);
                                                }
                                                id4.a aVarA2 = cVarValueAt2.b0.a();
                                                aVarA2.k = su6VarA;
                                                cVarValueAt2.b0 = new id4(aVarA2);
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                            id4 id4Var4 = cVarValueAt2.b0;
                                            id4Var4.getClass();
                                            su6Var = id4Var4.l;
                                            nlaVar = new nla(j);
                                            if (su6Var == null) {
                                                su6.a[] aVarArr5 = new su6.a[i55];
                                                aVarArr5[z22 ? 1 : 0] = nlaVar;
                                                su6VarA = new su6(aVarArr5);
                                            } else {
                                                su6.a[] aVarArr6 = new su6.a[i55];
                                                aVarArr6[z22 ? 1 : 0] = nlaVar;
                                                su6VarA = su6Var.a(aVarArr6);
                                            }
                                            id4.a aVarA3 = cVarValueAt2.b0.a();
                                            aVarA3.k = su6VarA;
                                            cVarValueAt2.b0 = new id4(aVarA3);
                                        }
                                    }
                                    if (!cVarValueAt2.W) {
                                        cVarValueAt2.a0.getClass();
                                        hsa hsaVar2 = cVarValueAt2.a0;
                                        id4 id4Var5 = cVarValueAt2.b0;
                                        id4Var5.getClass();
                                        hsaVar2.g(id4Var5);
                                    }
                                    i54++;
                                    i19 = i12;
                                    z3 = z22 ? 1 : 0;
                                    z4 = true;
                                }
                                al6Var5.l();
                            }
                        } else if (!al6Var5.z) {
                            al6Var5.h(i18);
                            if (al6Var5.E != -9223372036854775807L && (i11 = al6Var5.F) != -1 && al6Var5.G != -1) {
                                List<b.a> arrayList4 = sparseArray.get(i11);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList<>();
                                    sparseArray.put(al6Var5.F, arrayList4);
                                }
                                arrayList4.add(new b.a(al6Var5.E, al6Var5.s + al6Var5.G, al6Var5.H));
                            }
                        }
                    } else if (al6Var5.O == 2) {
                        c cVar4 = sparseArray2.get(al6Var5.U);
                        cVar4.a0.getClass();
                        if (al6Var5.Z > 0 && "A_OPUS".equals(cVar4.c)) {
                            pt7 pt7Var3 = al6Var5.p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(al6Var5.Z).array();
                            pt7Var3.getClass();
                            pt7Var3.K(bArrArray, bArrArray.length);
                        }
                        int i58 = 0;
                        for (int i59 = 0; i59 < al6Var5.S; i59++) {
                            i58 += al6Var5.T[i59];
                        }
                        int i60 = 0;
                        while (i60 < al6Var5.S) {
                            long j16 = al6Var5.P + ((long) ((cVar4.f * i60) / 1000));
                            int i61 = al6Var5.W;
                            if (i60 == 0 && !al6Var5.Y) {
                                i61 |= 1;
                            }
                            int i62 = al6Var5.T[i60];
                            int i63 = i58 - i62;
                            c cVar5 = cVar4;
                            al6 al6Var6 = al6Var5;
                            al6Var6.j(cVar5, j16, i61, i62, i63);
                            i60++;
                            al6Var5 = al6Var6;
                            cVar4 = cVar5;
                            i58 = i63;
                        }
                        al6Var5.O = 0;
                    }
                    r2 = ks3Var;
                }
                z5 = true;
                r1 = r2;
            }
            if (z5) {
                al6Var = this;
                z2 = true;
                if (al6Var.m(o68Var, r1.getPosition())) {
                    return 1;
                }
            } else {
                al6Var = this;
                z2 = true;
            }
            z4 = z2;
            z3 = false;
        }
        if (z5) {
            return 0;
        }
        int i64 = 0;
        while (true) {
            SparseArray<c> sparseArray3 = al6Var.c;
            if (i64 >= sparseArray3.size()) {
                return -1;
            }
            c cVarValueAt3 = sparseArray3.valueAt(i64);
            cVarValueAt3.a0.getClass();
            iya iyaVar = cVarValueAt3.V;
            if (iyaVar != null) {
                iyaVar.a(cVarValueAt3.a0, cVarValueAt3.k);
            }
            i64++;
        }
    }

    @Override // defpackage.js3
    public final boolean d(ks3 ks3Var) {
        pv9 pv9Var = new pv9();
        zq2 zq2Var = (zq2) ks3Var;
        long j = zq2Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        pt7 pt7Var = pv9Var.a;
        zq2Var.f(pt7Var.a, 0, 4, false);
        pv9Var.b = 4;
        for (long jB = pt7Var.B(); jB != 440786851; jB = ((jB << 8) & (-256)) | ((long) (pt7Var.a[0] & MessagePack.Code.EXT_TIMESTAMP))) {
            int i2 = pv9Var.b + 1;
            pv9Var.b = i2;
            if (i2 == i) {
                return false;
            }
            zq2Var.f(pt7Var.a, 0, 1, false);
        }
        long jA = pv9Var.a(zq2Var);
        long j3 = pv9Var.b;
        if (jA != Long.MIN_VALUE && (j == -1 || j3 + jA < j)) {
            while (true) {
                long j4 = pv9Var.b;
                long j5 = j3 + jA;
                if (j4 < j5) {
                    if (pv9Var.a(zq2Var) == Long.MIN_VALUE) {
                        break;
                    }
                    long jA2 = pv9Var.a(zq2Var);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        break;
                    }
                    if (jA2 != 0) {
                        int i3 = (int) jA2;
                        zq2Var.o(i3, false);
                        pv9Var.b += i3;
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.js3
    public final void e(long j, long j2) {
        this.M = -9223372036854775807L;
        this.O = 0;
        vq2 vq2Var = this.a;
        vq2Var.e = 0;
        vq2Var.b.clear();
        mcb mcbVar = vq2Var.c;
        mcbVar.b = 0;
        mcbVar.c = 0;
        mcb mcbVar2 = this.b;
        mcbVar2.b = 0;
        mcbVar2.c = 0;
        o();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray<c> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            iya iyaVar = sparseArray.valueAt(i).V;
            if (iyaVar != null) {
                iyaVar.b = false;
                iyaVar.c = 0;
            }
            i++;
        }
    }

    @Override // defpackage.js3
    public final void g(ls3 ls3Var) {
        if (this.e) {
            ls3Var = new a5a(ls3Var, this.f);
        }
        this.j0 = ls3Var;
    }

    public final void h(int i) throws ut7 {
        if (this.D) {
            return;
        }
        throw ut7.a(null, "Element " + i + " must be in a Cues");
    }

    public final void i(int i) throws ut7 {
        if (this.y != null) {
            return;
        }
        throw ut7.a(null, "Element " + i + " must be in a TrackEntry");
    }

    public final void j(c cVar, long j, int i, int i2, int i3) {
        byte[] bArrK;
        int i4;
        int i5;
        iya iyaVar = cVar.V;
        if (iyaVar != null) {
            iyaVar.b(cVar.a0, j, i, i2, i3, cVar.k);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.c) || "S_TEXT/ASS".equals(cVar.c) || "S_TEXT/SSA".equals(cVar.c) || "S_TEXT/WEBVTT".equals(cVar.c)) {
                if (this.S > 1) {
                    md6.g("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.Q;
                    if (j2 == -9223372036854775807L) {
                        md6.g("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = cVar.c;
                        pt7 pt7Var = this.m;
                        byte[] bArr = pt7Var.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrK = k(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrK = k(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrK = k(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                zn3.b();
                                return;
                        }
                        System.arraycopy(bArrK, 0, bArr, i4, bArrK.length);
                        for (int i6 = pt7Var.b; i6 < pt7Var.c; i6++) {
                            if (pt7Var.a[i6] == 0) {
                                pt7Var.L(i6);
                                cVar.a0.e(pt7Var.c, pt7Var);
                                i5 = i2 + pt7Var.c;
                            }
                        }
                        cVar.a0.e(pt7Var.c, pt7Var);
                        i5 = i2 + pt7Var.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.S;
                pt7 pt7Var2 = this.p;
                if (i7 > 1) {
                    pt7Var2.J(0);
                } else {
                    int i8 = pt7Var2.c;
                    cVar.a0.b(pt7Var2, i8, 2);
                    i5 += i8;
                }
            }
            cVar.a0.a(j, i, i5, i3, cVar.k);
        }
        this.N = true;
    }

    public final void l() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<c> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                ls3 ls3Var = this.j0;
                ls3Var.getClass();
                ls3Var.k();
                this.x = false;
                return;
            }
            if (sparseArray.valueAt(i).W) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean m(o68 o68Var, long j) {
        if (this.J) {
            this.L = j;
            o68Var.a = this.K;
            this.J = false;
            return true;
        }
        if (this.z) {
            long j2 = this.L;
            if (j2 != -1) {
                o68Var.a = j2;
                this.L = -1L;
                return true;
            }
        }
        return false;
    }

    public final void n(ks3 ks3Var, int i) {
        pt7 pt7Var = this.i;
        if (pt7Var.c >= i) {
            return;
        }
        byte[] bArr = pt7Var.a;
        if (bArr.length < i) {
            pt7Var.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = pt7Var.a;
        int i2 = pt7Var.c;
        ks3Var.readFully(bArr2, i2, i - i2);
        pt7Var.L(i);
    }

    public final void o() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.J(0);
    }

    public final long p(long j) throws ut7 {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ut7.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = n6b.a;
        return n6b.U(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
    public final int q(ks3 ks3Var, c cVar, int i, boolean z) throws ut7 {
        int iF;
        int iF2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(cVar.c)) {
            r(ks3Var, k0, i);
            int i4 = this.b0;
            o();
            return i4;
        }
        if ("S_TEXT/ASS".equals(cVar.c) || "S_TEXT/SSA".equals(cVar.c)) {
            r(ks3Var, m0, i);
            int i5 = this.b0;
            o();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.c)) {
            r(ks3Var, n0, i);
            int i6 = this.b0;
            o();
            return i6;
        }
        int i7 = 2;
        if (cVar.W) {
            cVar.b0.getClass();
            pt7 pt7Var = new pt7(i);
            if (ks3Var.f(pt7Var.a, 0, i, true)) {
                ks3Var.l();
                if (i93.b(pt7Var.i()) == 1 && pt7Var.a() >= 10) {
                    byte[] bArr = new byte[10];
                    pt7Var.k(bArr, 0, 10);
                    pt7Var.M(0);
                    int iA = i93.a(bArr);
                    if (iA > 0 && pt7Var.a() >= iA + 4) {
                        pt7Var.N(iA);
                        if (i93.b(pt7Var.m()) == 2) {
                            id4.a aVarA = cVar.b0.a();
                            aVarA.n = fv6.n("audio/vnd.dts.hd");
                            cVar.b0 = new id4(aVarA);
                        }
                    }
                }
            }
            cVar.a0.g(cVar.b0);
            cVar.W = false;
            l();
        }
        hsa hsaVar = cVar.a0;
        boolean z3 = this.d0;
        pt7 pt7Var2 = this.l;
        if (!z3) {
            boolean z4 = cVar.i;
            pt7 pt7Var3 = this.i;
            if (z4) {
                this.W &= -1073741825;
                if (!this.e0) {
                    ks3Var.readFully(pt7Var3.a, 0, 1);
                    this.a0++;
                    byte b2 = pt7Var3.a[0];
                    if ((b2 & 128) == 128) {
                        throw ut7.a(null, "Extension bit is set in signal byte");
                    }
                    this.h0 = b2;
                    this.e0 = true;
                }
                byte b3 = this.h0;
                if ((b3 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z5 = (b3 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.i0) {
                        pt7 pt7Var4 = this.n;
                        ks3Var.readFully(pt7Var4.a, 0, 8);
                        this.a0 += 8;
                        this.i0 = true;
                        pt7Var3.a[0] = (byte) ((z5 ? 128 : 0) | 8);
                        pt7Var3.M(0);
                        hsaVar.b(pt7Var3, 1, 1);
                        this.b0++;
                        pt7Var4.M(0);
                        hsaVar.b(pt7Var4, 8, 1);
                        this.b0 += 8;
                    }
                    if (z5) {
                        if (!this.f0) {
                            ks3Var.readFully(pt7Var3.a, 0, 1);
                            this.a0++;
                            pt7Var3.M(0);
                            this.g0 = pt7Var3.z();
                            this.f0 = true;
                        }
                        int i8 = this.g0 * 4;
                        pt7Var3.J(i8);
                        ks3Var.readFully(pt7Var3.a, 0, i8);
                        this.a0 += i8;
                        short s = (short) ((this.g0 / 2) + 1);
                        int i9 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.q = ByteBuffer.allocate(i9);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i3 = this.g0;
                            if (i10 >= i3) {
                                break;
                            }
                            int iD = pt7Var3.D();
                            int i12 = i10 % 2;
                            int i13 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i12 == 0) {
                                byteBuffer2.putShort((short) (iD - i11));
                            } else {
                                byteBuffer2.putInt(iD - i11);
                            }
                            i10++;
                            i11 = iD;
                            i7 = i13;
                        }
                        i2 = i7;
                        int i14 = (i - this.a0) - i11;
                        int i15 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.q;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        pt7 pt7Var5 = this.o;
                        pt7Var5.K(bArrArray, i9);
                        hsaVar.b(pt7Var5, i9, 1);
                        this.b0 += i9;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr2 = cVar.j;
                if (bArr2 != null) {
                    pt7Var2.K(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(cVar.c)) {
                z2 = z;
            } else {
                z2 = cVar.g > 0;
            }
            if (z2) {
                this.W |= 268435456;
                this.p.J(0);
                int i16 = (pt7Var2.c + i) - this.a0;
                pt7Var3.J(4);
                byte[] bArr3 = pt7Var3.a;
                bArr3[0] = (byte) ((i16 >> 24) & 255);
                bArr3[1] = (byte) ((i16 >> 16) & 255);
                bArr3[i2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
                hsaVar.b(pt7Var3, 4, i2);
                this.b0 += 4;
            }
            this.d0 = true;
        }
        int i17 = i + pt7Var2.c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.c) && !"V_MPEGH/ISO/HEVC".equals(cVar.c)) {
            if (cVar.V != null) {
                xl7.r(pt7Var2.c == 0);
                cVar.V.c(ks3Var);
            }
            while (true) {
                int i18 = this.a0;
                if (i18 >= i17) {
                    break;
                }
                int i19 = i17 - i18;
                int iA2 = pt7Var2.a();
                if (iA2 > 0) {
                    iF2 = Math.min(i19, iA2);
                    hsaVar.e(iF2, pt7Var2);
                } else {
                    iF2 = hsaVar.f(ks3Var, i19, false);
                }
                this.a0 += iF2;
                this.b0 += iF2;
            }
        } else {
            pt7 pt7Var6 = this.h;
            byte[] bArr4 = pt7Var6.a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i20 = cVar.c0;
            int i21 = 4 - i20;
            while (this.a0 < i17) {
                int i22 = this.c0;
                if (i22 == 0) {
                    int iMin = Math.min(i20, pt7Var2.a());
                    ks3Var.readFully(bArr4, i21 + iMin, i20 - iMin);
                    if (iMin > 0) {
                        pt7Var2.k(bArr4, i21, iMin);
                    }
                    this.a0 += i20;
                    pt7Var6.M(0);
                    this.c0 = pt7Var6.D();
                    pt7 pt7Var7 = this.g;
                    pt7Var7.M(0);
                    hsaVar.e(4, pt7Var7);
                    this.b0 += 4;
                } else {
                    int iA3 = pt7Var2.a();
                    if (iA3 > 0) {
                        iF = Math.min(i22, iA3);
                        hsaVar.e(iF, pt7Var2);
                    } else {
                        iF = hsaVar.f(ks3Var, i22, false);
                    }
                    this.a0 += iF;
                    this.b0 += iF;
                    this.c0 -= iF;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.c)) {
            pt7 pt7Var8 = this.j;
            pt7Var8.M(0);
            hsaVar.e(4, pt7Var8);
            this.b0 += 4;
        }
        int i23 = this.b0;
        o();
        return i23;
    }

    public final void r(ks3 ks3Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        pt7 pt7Var = this.m;
        byte[] bArr2 = pt7Var.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            pt7Var.getClass();
            pt7Var.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ks3Var.readFully(pt7Var.a, bArr.length, i);
        pt7Var.M(0);
        pt7Var.L(length);
    }

    @Override // defpackage.js3
    public final void a() {
    }
}
