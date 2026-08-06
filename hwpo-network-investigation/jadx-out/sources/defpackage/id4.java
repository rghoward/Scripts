package defpackage;

import android.text.TextUtils;
import io.ably.lib.util.AgentHeaderCreator;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class id4 {
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final xh1 E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public int Q;
    public final String a;
    public final String b;
    public final k95 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final su6 l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List<byte[]> r;
    public final h83 s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public float A;
        public byte[] B;
        public int C;
        public xh1 D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public String a;
        public String b;
        public k95 c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public String j;
        public su6 k;
        public String l;
        public String m;
        public String n;
        public int o;
        public int p;
        public List<byte[]> q;
        public h83 r;
        public long s;
        public boolean t;
        public int u;
        public int v;
        public int w;
        public int x;
        public float y;
        public int z;

        public a() {
            k95.b bVar = k95.u;
            this.c = ul8.x;
            this.h = -1;
            this.i = -1;
            this.o = -1;
            this.p = -1;
            this.s = Long.MAX_VALUE;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1.0f;
            this.A = 1.0f;
            this.C = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.K = -1;
            this.L = 1;
            this.M = -1;
            this.N = -1;
            this.O = 0;
            this.g = 0;
        }
    }

    static {
        new id4(new a());
        n6b.H(0);
        n6b.H(1);
        n6b.H(2);
        n6b.H(3);
        n6b.H(4);
        ra.b(5, 6, 7, 8, 9);
        ra.b(10, 11, 12, 13, 14);
        ra.b(15, 16, 17, 18, 19);
        ra.b(20, 21, 22, 23, 24);
        ra.b(25, 26, 27, 28, 29);
        ra.b(30, 31, 32, 33, 34);
        n6b.H(35);
        n6b.H(36);
        n6b.H(37);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public id4(a aVar) {
        boolean z;
        String str;
        this.a = aVar.a;
        String strO = n6b.O(aVar.d);
        this.d = strO;
        if (aVar.c.isEmpty() && aVar.b != null) {
            this.c = k95.v(new vp5(strO, aVar.b));
            this.b = aVar.b;
        } else if (aVar.c.isEmpty() || aVar.b != null) {
            if (!aVar.c.isEmpty() || aVar.b != null) {
                int i = 0;
                while (true) {
                    if (i >= aVar.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((vp5) aVar.c.get(i)).b.equals(aVar.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            xl7.r(z);
            this.c = aVar.c;
            this.b = aVar.b;
        } else {
            k95 k95Var = aVar.c;
            this.c = k95Var;
            int size = k95Var.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    str = ((vp5) k95Var.get(0)).b;
                    break;
                }
                E e = k95Var.get(i2);
                i2++;
                vp5 vp5Var = (vp5) e;
                if (TextUtils.equals(vp5Var.a, strO)) {
                    str = vp5Var.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = aVar.e;
        xl7.q("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", aVar.g == 0 || (aVar.f & 32768) != 0);
        this.f = aVar.f;
        this.g = aVar.g;
        int i3 = aVar.h;
        this.h = i3;
        int i4 = aVar.i;
        this.i = i4;
        this.j = i4 != -1 ? i4 : i3;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.q = aVar.p;
        List<byte[]> list = aVar.q;
        this.r = list == null ? Collections.EMPTY_LIST : list;
        h83 h83Var = aVar.r;
        this.s = h83Var;
        this.t = aVar.s;
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
        this.y = aVar.x;
        this.z = aVar.y;
        int i5 = aVar.z;
        this.A = i5 == -1 ? 0 : i5;
        float f = aVar.A;
        this.B = f == -1.0f ? 1.0f : f;
        this.C = aVar.B;
        this.D = aVar.C;
        this.E = aVar.D;
        this.F = aVar.E;
        this.G = aVar.F;
        this.H = aVar.G;
        this.I = aVar.H;
        int i6 = aVar.I;
        this.J = i6 == -1 ? 0 : i6;
        int i7 = aVar.J;
        this.K = i7 != -1 ? i7 : 0;
        this.L = aVar.K;
        this.M = aVar.L;
        this.N = aVar.M;
        this.O = aVar.N;
        int i8 = aVar.O;
        if (i8 != 0 || h83Var == null) {
            this.P = i8;
        } else {
            this.P = 1;
        }
    }

    public static String c(id4 id4Var) {
        int i;
        String str;
        String str2;
        if (id4Var == null) {
            return "null";
        }
        int i2 = id4Var.e;
        k95 k95Var = id4Var.c;
        String str3 = id4Var.d;
        int i3 = id4Var.H;
        int i4 = id4Var.G;
        int i5 = id4Var.F;
        float f = id4Var.z;
        xh1 xh1Var = id4Var.E;
        float f2 = id4Var.B;
        int i6 = id4Var.y;
        int i7 = id4Var.x;
        int i8 = id4Var.w;
        int i9 = id4Var.v;
        h83 h83Var = id4Var.s;
        String str4 = id4Var.k;
        int i10 = id4Var.j;
        String str5 = id4Var.m;
        String str6 = id4Var.n;
        int i11 = id4Var.f;
        pl5 pl5Var = new pl5(String.valueOf(','));
        StringBuilder sbA = bl2.a("id=");
        sbA.append(id4Var.a);
        sbA.append(", mimeType=");
        sbA.append(id4Var.o);
        if (str6 != null) {
            sbA.append(", container=");
            sbA.append(str6);
        }
        if (str5 != null) {
            sbA.append(", primaryGroupId=");
            sbA.append(str5);
        }
        if (i10 != -1) {
            sbA.append(", bitrate=");
            sbA.append(i10);
        }
        if (str4 != null) {
            sbA.append(", codecs=");
            sbA.append(str4);
        }
        if (h83Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < h83Var.w; i12++) {
                UUID uuid = h83Var.t[i12].u;
                if (uuid.equals(i01.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i01.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i01.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i01.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i01.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sbA.append(", drm=[");
            pl5Var.a(sbA, linkedHashSet.iterator());
            sbA.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            sbA.append(", res=");
            sbA.append(i9);
            sbA.append("x");
            sbA.append(i8);
        }
        if (i7 != -1 && i6 != -1) {
            sbA.append(", decRes=");
            sbA.append(i7);
            sbA.append("x");
            sbA.append(i6);
        }
        double d = f2;
        int i13 = m43.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbA.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = n6b.a;
            sbA.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (xh1Var != null) {
            int i14 = xh1Var.f;
            int i15 = xh1Var.e;
            if ((i15 != -1 && i14 != -1) || xh1Var.d()) {
                sbA.append(", color=");
                if (xh1Var.d()) {
                    String strB = xh1.b(xh1Var.a);
                    String strA = xh1.a(xh1Var.b);
                    String strC = xh1.c(xh1Var.c);
                    Locale locale = Locale.US;
                    str2 = strB + AgentHeaderCreator.AGENT_DIVIDER + strA + AgentHeaderCreator.AGENT_DIVIDER + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbA.append(str2 + AgentHeaderCreator.AGENT_DIVIDER + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + AgentHeaderCreator.AGENT_DIVIDER + i14));
            }
        }
        if (f != -1.0f) {
            sbA.append(", fps=");
            sbA.append(f);
        }
        if (i5 != -1) {
            sbA.append(", maxSubLayers=");
            sbA.append(i5);
        }
        if (i4 != -1) {
            sbA.append(", channels=");
            sbA.append(i4);
        }
        if (i3 != -1) {
            sbA.append(", sample_rate=");
            sbA.append(i3);
        }
        if (str3 != null) {
            sbA.append(", language=");
            sbA.append(str3);
        }
        if (!k95Var.isEmpty()) {
            sbA.append(", labels=[");
            pl5Var.a(sbA, jb6.b(k95Var, new hd4()).iterator());
            sbA.append("]");
        }
        if (i2 != 0) {
            sbA.append(", selectionFlags=[");
            String str8 = n6b.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            pl5Var.a(sbA, arrayList.iterator());
            sbA.append("]");
        }
        if (i11 != 0) {
            sbA.append(", roleFlags=[");
            String str9 = n6b.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            pl5Var.a(sbA, arrayList2.iterator());
            sbA.append("]");
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            sbA.append(", auxiliaryTrackType=");
            int i16 = id4Var.g;
            String str10 = n6b.a;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    aa0.c("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbA.append(str);
        }
        return sbA.toString();
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.k;
        aVar.k = this.l;
        aVar.l = this.m;
        aVar.m = this.n;
        aVar.n = this.o;
        aVar.o = this.p;
        aVar.p = this.q;
        aVar.q = this.r;
        aVar.r = this.s;
        aVar.s = this.t;
        aVar.t = this.u;
        aVar.u = this.v;
        aVar.v = this.w;
        aVar.w = this.x;
        aVar.x = this.y;
        aVar.y = this.z;
        aVar.z = this.A;
        aVar.A = this.B;
        aVar.B = this.C;
        aVar.C = this.D;
        aVar.D = this.E;
        aVar.E = this.F;
        aVar.F = this.G;
        aVar.G = this.H;
        aVar.H = this.I;
        aVar.I = this.J;
        aVar.J = this.K;
        aVar.K = this.L;
        aVar.L = this.M;
        aVar.M = this.N;
        aVar.N = this.O;
        aVar.O = this.P;
        return aVar;
    }

    public final boolean b(id4 id4Var) {
        List<byte[]> list = this.r;
        if (list.size() != id4Var.r.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), id4Var.r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final id4 d(id4 id4Var) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == id4Var) {
            return this;
        }
        int iH = fv6.h(this.o);
        String str3 = id4Var.a;
        k95 k95Var = id4Var.c;
        int i3 = id4Var.N;
        int i4 = id4Var.O;
        String str4 = id4Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (k95Var.isEmpty()) {
            k95Var = this.c;
        }
        if ((iH != 3 && iH != 1) || (str = id4Var.d) == null) {
            str = this.d;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = id4Var.h;
        }
        int i6 = this.i;
        if (i6 == -1) {
            i6 = id4Var.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strU = n6b.u(iH, id4Var.k);
            if (n6b.X(strU).length == 1) {
                str5 = strU;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            str6 = id4Var.m;
        }
        su6 su6VarB = id4Var.l;
        su6 su6Var = this.l;
        if (su6Var != null) {
            su6VarB = su6Var.b(su6VarB);
        }
        float f = this.z;
        if (f == -1.0f && iH == 2) {
            f = id4Var.z;
        }
        int i7 = this.e | id4Var.e;
        k95 k95Var2 = k95Var;
        int i8 = id4Var.f | this.f;
        h83 h83Var = id4Var.s;
        ArrayList arrayList = new ArrayList();
        if (h83Var != null) {
            String str7 = h83Var.v;
            h83.b[] bVarArr = h83Var.t;
            int length = bVarArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                h83.b bVar = bVarArr[i10];
                int i11 = length;
                if (bVar.x != null) {
                    arrayList.add(bVar);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        h83 h83Var2 = this.s;
        if (h83Var2 != null) {
            if (str2 == null) {
                str2 = h83Var2.v;
            }
            int size = arrayList.size();
            h83.b[] bVarArr2 = h83Var2.t;
            String str8 = str2;
            int length2 = bVarArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                h83.b bVar2 = bVarArr2[i13];
                int i14 = length2;
                if (bVar2.x != null) {
                    UUID uuid = bVar2.u;
                    i2 = i3;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i = size;
                            arrayList.add(bVar2);
                            break;
                        }
                        i = size;
                        if (((h83.b) arrayList.get(i15)).u.equals(uuid)) {
                            break;
                        }
                        i15++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i3;
                }
                i12 = i13 + 1;
                length2 = i14;
                i3 = i2;
                size = i;
            }
            str2 = str8;
        }
        int i16 = i3;
        h83 h83Var3 = arrayList.isEmpty() ? null : new h83(str2, false, (h83.b[]) arrayList.toArray(new h83.b[0]));
        a aVarA = a();
        aVarA.a = str3;
        aVarA.b = str4;
        aVarA.c = k95.q(k95Var2);
        aVarA.d = str;
        aVarA.e = i7;
        aVarA.f = i8;
        aVarA.h = i5;
        aVarA.i = i6;
        aVarA.j = str5;
        aVarA.k = su6VarB;
        aVarA.l = str6;
        aVarA.r = h83Var3;
        aVarA.y = f;
        aVarA.M = i16;
        aVarA.N = i4;
        return new id4(aVarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || id4.class != obj.getClass()) {
            return false;
        }
        id4 id4Var = (id4) obj;
        int i2 = this.Q;
        return (i2 == 0 || (i = id4Var.Q) == 0 || i2 == i) && this.e == id4Var.e && this.f == id4Var.f && this.g == id4Var.g && this.h == id4Var.h && this.i == id4Var.i && this.p == id4Var.p && this.t == id4Var.t && this.v == id4Var.v && this.w == id4Var.w && this.x == id4Var.x && this.y == id4Var.y && this.A == id4Var.A && this.D == id4Var.D && this.F == id4Var.F && this.G == id4Var.G && this.H == id4Var.H && this.I == id4Var.I && this.J == id4Var.J && this.K == id4Var.K && this.L == id4Var.L && this.N == id4Var.N && this.O == id4Var.O && this.P == id4Var.P && Float.compare(this.z, id4Var.z) == 0 && Float.compare(this.B, id4Var.B) == 0 && Objects.equals(this.a, id4Var.a) && Objects.equals(this.b, id4Var.b) && this.c.equals(id4Var.c) && Objects.equals(this.k, id4Var.k) && Objects.equals(this.m, id4Var.m) && Objects.equals(this.n, id4Var.n) && Objects.equals(this.o, id4Var.o) && Objects.equals(this.d, id4Var.d) && Arrays.equals(this.C, id4Var.C) && Objects.equals(this.l, id4Var.l) && Objects.equals(this.E, id4Var.E) && Objects.equals(this.s, id4Var.s) && b(id4Var);
    }

    public final int hashCode() {
        if (this.Q == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            su6 su6Var = this.l;
            int iHashCode5 = (iHashCode4 + (su6Var == null ? 0 : su6Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.o;
            this.Q = ((((((((((((((((((((((Float.floatToIntBits(this.B) + ((((Float.floatToIntBits(this.z) + ((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31)) * 31) + this.A) * 31)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.N) * 31) + this.O) * 31) + this.P;
        }
        return this.Q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.z);
        sb.append(", ");
        sb.append(this.E);
        sb.append("], [");
        sb.append(this.G);
        sb.append(", ");
        return i34.b(this.H, "])", sb);
    }
}
