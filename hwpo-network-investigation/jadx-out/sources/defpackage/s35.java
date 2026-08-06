package defpackage;

import com.intercom.twig.BuildConfig;
import io.ably.lib.http.HttpConstants;
import io.ably.lib.util.AgentHeaderCreator;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s35 {
    public static final cu4[] a;
    public static final Map<g01, Integer> b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final ni8 c;
        public int f;
        public int g;
        public int a = 4096;
        public final ArrayList b = new ArrayList();
        public cu4[] d = new cu4[8];
        public int e = 7;

        public a(h45.b bVar) {
            this.c = new ni8(bVar);
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    cu4 cu4Var = this.d[length];
                    cu4Var.getClass();
                    int i4 = cu4Var.c;
                    i -= i4;
                    this.g -= i4;
                    this.f--;
                    i3++;
                }
                cu4[] cu4VarArr = this.d;
                System.arraycopy(cu4VarArr, i2 + 1, cu4VarArr, i2 + 1 + i3, this.f);
                this.e += i3;
            }
            return i3;
        }

        public final g01 b(int i) throws IOException {
            if (i >= 0) {
                cu4[] cu4VarArr = s35.a;
                if (i <= cu4VarArr.length - 1) {
                    return cu4VarArr[i].a;
                }
            }
            int length = this.e + 1 + (i - s35.a.length);
            if (length >= 0) {
                cu4[] cu4VarArr2 = this.d;
                if (length < cu4VarArr2.length) {
                    cu4 cu4Var = cu4VarArr2[length];
                    cu4Var.getClass();
                    return cu4Var.a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void c(cu4 cu4Var) {
            this.b.add(cu4Var);
            int i = cu4Var.c;
            int i2 = this.a;
            if (i > i2) {
                cu4[] cu4VarArr = this.d;
                gz3.m(0, cu4VarArr.length, null, cu4VarArr);
                this.e = this.d.length - 1;
                this.f = 0;
                this.g = 0;
                return;
            }
            a((this.g + i) - i2);
            int i3 = this.f + 1;
            cu4[] cu4VarArr2 = this.d;
            if (i3 > cu4VarArr2.length) {
                cu4[] cu4VarArr3 = new cu4[cu4VarArr2.length * 2];
                System.arraycopy(cu4VarArr2, 0, cu4VarArr3, cu4VarArr2.length, cu4VarArr2.length);
                this.e = this.d.length - 1;
                this.d = cu4VarArr3;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = cu4Var;
            this.f++;
            this.g += i;
        }

        public final g01 d() {
            ni8 ni8Var = this.c;
            byte b = ni8Var.readByte();
            byte[] bArr = vtb.a;
            int i = b & MessagePack.Code.EXT_TIMESTAMP;
            int i2 = 0;
            boolean z = (b & 128) == 128;
            long jE = e(i, 127);
            if (!z) {
                return ni8Var.r(jE);
            }
            tx0 tx0Var = new tx0();
            int[] iArr = j55.a;
            ni8Var.getClass();
            j55.a aVar = j55.c;
            j55.a aVar2 = aVar;
            int i3 = 0;
            for (long j = 0; j < jE; j++) {
                byte b2 = ni8Var.readByte();
                byte[] bArr2 = vtb.a;
                i2 = (i2 << 8) | (b2 & MessagePack.Code.EXT_TIMESTAMP);
                i3 += 8;
                while (i3 >= 8) {
                    j55.a[] aVarArr = aVar2.a;
                    aVarArr.getClass();
                    aVar2 = aVarArr[(i2 >>> (i3 - 8)) & 255];
                    aVar2.getClass();
                    if (aVar2.a == null) {
                        tx0Var.Z(aVar2.b);
                        i3 -= aVar2.c;
                        aVar2 = aVar;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                j55.a[] aVarArr2 = aVar2.a;
                aVarArr2.getClass();
                j55.a aVar3 = aVarArr2[(i2 << (8 - i3)) & 255];
                aVar3.getClass();
                int i4 = aVar3.c;
                if (aVar3.a != null || i4 > i3) {
                    break;
                }
                tx0Var.Z(aVar3.b);
                i3 -= i4;
                aVar2 = aVar;
            }
            return tx0Var.r(tx0Var.u);
        }

        public final int e(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                byte b = this.c.readByte();
                byte[] bArr = vtb.a;
                int i5 = b & MessagePack.Code.EXT_TIMESTAMP;
                if ((b & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (b & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public final tx0 a;
        public boolean c;
        public int g;
        public int h;
        public int b = Integer.MAX_VALUE;
        public int d = 4096;
        public cu4[] e = new cu4[8];
        public int f = 7;

        public b(tx0 tx0Var) {
            this.a = tx0Var;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    cu4 cu4Var = this.e[length];
                    cu4Var.getClass();
                    i -= cu4Var.c;
                    int i4 = this.h;
                    cu4 cu4Var2 = this.e[length];
                    cu4Var2.getClass();
                    this.h = i4 - cu4Var2.c;
                    this.g--;
                    i3++;
                    length--;
                }
                cu4[] cu4VarArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(cu4VarArr, i5, cu4VarArr, i5 + i3, this.g);
                cu4[] cu4VarArr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(cu4VarArr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(cu4 cu4Var) {
            int i = cu4Var.c;
            int i2 = this.d;
            if (i > i2) {
                cu4[] cu4VarArr = this.e;
                gz3.m(0, cu4VarArr.length, null, cu4VarArr);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            cu4[] cu4VarArr2 = this.e;
            if (i3 > cu4VarArr2.length) {
                cu4[] cu4VarArr3 = new cu4[cu4VarArr2.length * 2];
                System.arraycopy(cu4VarArr2, 0, cu4VarArr3, cu4VarArr2.length, cu4VarArr2.length);
                this.f = this.e.length - 1;
                this.e = cu4VarArr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = cu4Var;
            this.g++;
            this.h += i;
        }

        public final void c(g01 g01Var) throws EOFException {
            g01Var.getClass();
            int[] iArr = j55.a;
            int iG = g01Var.g();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < iG; i++) {
                byte bL = g01Var.l(i);
                byte[] bArr = vtb.a;
                j2 += (long) j55.b[bL & MessagePack.Code.EXT_TIMESTAMP];
            }
            int i2 = (int) ((j2 + 7) >> 3);
            int iG2 = g01Var.g();
            tx0 tx0Var = this.a;
            if (i2 >= iG2) {
                e(g01Var.g(), 127, 0);
                tx0Var.Y(g01Var);
                return;
            }
            tx0 tx0Var2 = new tx0();
            int[] iArr2 = j55.a;
            int iG3 = g01Var.g();
            int i3 = 0;
            for (int i4 = 0; i4 < iG3; i4++) {
                byte bL2 = g01Var.l(i4);
                byte[] bArr2 = vtb.a;
                int i5 = bL2 & MessagePack.Code.EXT_TIMESTAMP;
                int i6 = j55.a[i5];
                byte b = j55.b[i5];
                j = (j << b) | ((long) i6);
                i3 += b;
                while (i3 >= 8) {
                    i3 -= 8;
                    tx0Var2.Z((int) (j >> i3));
                }
            }
            if (i3 > 0) {
                tx0Var2.Z((int) ((j << (8 - i3)) | (255 >>> i3)));
            }
            g01 g01VarR = tx0Var2.r(tx0Var2.u);
            e(g01VarR.g(), 127, 128);
            tx0Var.Y(g01VarR);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        public final void d(ArrayList arrayList) throws EOFException {
            int length;
            int length2;
            if (this.c) {
                int i = this.b;
                if (i < this.d) {
                    e(i, 31, 32);
                }
                this.c = false;
                this.b = Integer.MAX_VALUE;
                e(this.d, 31, 32);
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cu4 cu4Var = (cu4) arrayList.get(i2);
                g01 g01VarU = cu4Var.a.u();
                g01 g01Var = cu4Var.b;
                Integer num = s35.b.get(g01VarU);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        cu4[] cu4VarArr = s35.a;
                        if (xj5.a(cu4VarArr[iIntValue].b, g01Var)) {
                            length = length2;
                        } else if (xj5.a(cu4VarArr[length2].b, g01Var)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.e.length;
                    for (int i3 = this.f + 1; i3 < length3; i3++) {
                        cu4 cu4Var2 = this.e[i3];
                        cu4Var2.getClass();
                        if (xj5.a(cu4Var2.a, g01VarU)) {
                            cu4 cu4Var3 = this.e[i3];
                            cu4Var3.getClass();
                            if (xj5.a(cu4Var3.b, g01Var)) {
                                length2 = s35.a.length + (i3 - this.f);
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f) + s35.a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    e(length2, 127, 128);
                } else if (length == -1) {
                    this.a.Z(64);
                    c(g01VarU);
                    c(g01Var);
                    b(cu4Var);
                } else {
                    g01 g01Var2 = cu4.d;
                    g01VarU.getClass();
                    g01Var2.getClass();
                    if (!g01VarU.o(0, g01Var2, g01Var2.g()) || xj5.a(cu4.i, g01VarU)) {
                        e(length, 63, 64);
                        c(g01Var);
                        b(cu4Var);
                    } else {
                        e(length, 15, 0);
                        c(g01Var);
                    }
                }
            }
        }

        public final void e(int i, int i2, int i3) {
            tx0 tx0Var = this.a;
            if (i < i2) {
                tx0Var.Z(i | i3);
                return;
            }
            tx0Var.Z(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                tx0Var.Z(128 | (i4 & 127));
                i4 >>>= 7;
            }
            tx0Var.Z(i4);
        }
    }

    static {
        cu4 cu4Var = new cu4(cu4.i, BuildConfig.FLAVOR);
        g01 g01Var = cu4.f;
        cu4 cu4Var2 = new cu4(g01Var, HttpConstants.Methods.GET);
        cu4 cu4Var3 = new cu4(g01Var, HttpConstants.Methods.POST);
        g01 g01Var2 = cu4.g;
        cu4 cu4Var4 = new cu4(g01Var2, AgentHeaderCreator.AGENT_DIVIDER);
        cu4 cu4Var5 = new cu4(g01Var2, "/index.html");
        g01 g01Var3 = cu4.h;
        cu4 cu4Var6 = new cu4(g01Var3, "http");
        cu4 cu4Var7 = new cu4(g01Var3, "https");
        g01 g01Var4 = cu4.e;
        cu4[] cu4VarArr = {cu4Var, cu4Var2, cu4Var3, cu4Var4, cu4Var5, cu4Var6, cu4Var7, new cu4(g01Var4, "200"), new cu4(g01Var4, "204"), new cu4(g01Var4, "206"), new cu4(g01Var4, "304"), new cu4(g01Var4, "400"), new cu4(g01Var4, "404"), new cu4(g01Var4, "500"), new cu4("accept-charset", BuildConfig.FLAVOR), new cu4("accept-encoding", "gzip, deflate"), new cu4("accept-language", BuildConfig.FLAVOR), new cu4("accept-ranges", BuildConfig.FLAVOR), new cu4("accept", BuildConfig.FLAVOR), new cu4("access-control-allow-origin", BuildConfig.FLAVOR), new cu4("age", BuildConfig.FLAVOR), new cu4("allow", BuildConfig.FLAVOR), new cu4("authorization", BuildConfig.FLAVOR), new cu4("cache-control", BuildConfig.FLAVOR), new cu4("content-disposition", BuildConfig.FLAVOR), new cu4("content-encoding", BuildConfig.FLAVOR), new cu4("content-language", BuildConfig.FLAVOR), new cu4("content-length", BuildConfig.FLAVOR), new cu4("content-location", BuildConfig.FLAVOR), new cu4("content-range", BuildConfig.FLAVOR), new cu4("content-type", BuildConfig.FLAVOR), new cu4("cookie", BuildConfig.FLAVOR), new cu4(AttributeType.DATE, BuildConfig.FLAVOR), new cu4("etag", BuildConfig.FLAVOR), new cu4("expect", BuildConfig.FLAVOR), new cu4("expires", BuildConfig.FLAVOR), new cu4(TicketDetailDestinationKt.LAUNCHED_FROM, BuildConfig.FLAVOR), new cu4("host", BuildConfig.FLAVOR), new cu4("if-match", BuildConfig.FLAVOR), new cu4("if-modified-since", BuildConfig.FLAVOR), new cu4("if-none-match", BuildConfig.FLAVOR), new cu4("if-range", BuildConfig.FLAVOR), new cu4("if-unmodified-since", BuildConfig.FLAVOR), new cu4("last-modified", BuildConfig.FLAVOR), new cu4(ActionType.LINK, BuildConfig.FLAVOR), new cu4("location", BuildConfig.FLAVOR), new cu4("max-forwards", BuildConfig.FLAVOR), new cu4("proxy-authenticate", BuildConfig.FLAVOR), new cu4("proxy-authorization", BuildConfig.FLAVOR), new cu4("range", BuildConfig.FLAVOR), new cu4("referer", BuildConfig.FLAVOR), new cu4("refresh", BuildConfig.FLAVOR), new cu4("retry-after", BuildConfig.FLAVOR), new cu4("server", BuildConfig.FLAVOR), new cu4("set-cookie", BuildConfig.FLAVOR), new cu4("strict-transport-security", BuildConfig.FLAVOR), new cu4("transfer-encoding", BuildConfig.FLAVOR), new cu4("user-agent", BuildConfig.FLAVOR), new cu4("vary", BuildConfig.FLAVOR), new cu4("via", BuildConfig.FLAVOR), new cu4("www-authenticate", BuildConfig.FLAVOR)};
        a = cu4VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(cu4VarArr[i].a)) {
                linkedHashMap.put(cu4VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map<g01, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(g01 g01Var) {
        g01Var.getClass();
        int iG = g01Var.g();
        for (int i = 0; i < iG; i++) {
            byte bL = g01Var.l(i);
            if (65 <= bL && bL < 91) {
                o03.a("PROTOCOL_ERROR response malformed: mixed case name: ".concat(g01Var.w()));
                return;
            }
        }
    }
}
