package defpackage;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u51 extends w51 {
    public final pt7 h = new pt7();
    public final ot7 i = new ot7();
    public int j = -1;
    public final int k;
    public final b[] l;
    public b m;
    public List<ec2> n;
    public List<ec2> o;
    public c p;
    public int q;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final t51 c = new t51();
        public final ec2 a;
        public final int b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            ec2.a aVar = new ec2.a();
            aVar.a = spannableStringBuilder;
            aVar.b = null;
            aVar.c = alignment;
            aVar.e = f;
            aVar.f = 0;
            aVar.g = i;
            aVar.h = f2;
            aVar.i = i2;
            aVar.l = -3.4028235E38f;
            if (z) {
                aVar.o = i3;
                aVar.n = true;
            }
            this.a = aVar.a();
            this.b = i4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final boolean[] A;
        public static final int[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int v = c(2, 2, 2, 0);
        public static final int w;
        public static final int[] x;
        public static final int[] y;
        public static final int[] z;
        public final ArrayList a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;

        static {
            int iC = c(0, 0, 0, 0);
            w = iC;
            int iC2 = c(0, 0, 0, 3);
            x = new int[]{0, 0, 0, 0, 0, 2, 0};
            y = new int[]{0, 0, 0, 0, 0, 0, 2};
            z = new int[]{3, 3, 3, 3, 3, 3, 1};
            A = new boolean[]{false, false, false, true, true, true, false};
            B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
            C = new int[]{0, 1, 2, 3, 4, 3, 4};
            D = new int[]{0, 0, 0, 0, 0, 3, 3};
            E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
        }

        public b() {
            d();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int c(int i, int i2, int i3, int i4) {
            int i5;
            xl7.k(i, 4);
            xl7.k(i2, 4);
            xl7.k(i3, 4);
            xl7.k(i4, 4);
            if (i4 == 0 || i4 == 1) {
                i5 = 255;
            } else if (i4 == 2) {
                i5 = 127;
            } else if (i4 != 3) {
                i5 = 255;
            } else {
                i5 = 0;
            }
            return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        public final void a(char c) {
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (c != '\n') {
                spannableStringBuilder.append(c);
                return;
            }
            SpannableString spannableStringB = b();
            ArrayList arrayList = this.a;
            arrayList.add(spannableStringB);
            spannableStringBuilder.clear();
            if (this.o != -1) {
                this.o = 0;
            }
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
                }
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.a.clear();
            this.b.clear();
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.s = -1;
            this.u = 0;
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            int i = w;
            this.n = i;
            this.r = v;
            this.t = i;
        }

        public final void e(boolean z2, boolean z3) {
            int i = this.o;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i != -1) {
                if (!z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                    this.o = -1;
                }
            } else if (z2) {
                this.o = spannableStringBuilder.length();
            }
            if (this.p == -1) {
                if (z3) {
                    this.p = spannableStringBuilder.length();
                }
            } else {
                if (z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        }

        public final void f(int i, int i2) {
            int i3 = this.q;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i3 != -1 && this.r != i) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
            }
            if (i != v) {
                this.q = spannableStringBuilder.length();
                this.r = i;
            }
            if (this.s != -1 && this.t != i2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
            }
            if (i2 != w) {
                this.s = spannableStringBuilder.length();
                this.t = i2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public u51(int i, List<byte[]> list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = og1.a;
            if (list.size() == 1 && list.get(0).length == 1) {
                byte b2 = list.get(0)[0];
            }
        }
        this.l = new b[8];
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.l;
            if (i2 >= 8) {
                this.m = bVarArr[0];
                return;
            } else {
                bVarArr[i2] = new b();
                i2++;
            }
        }
    }

    @Override // defpackage.w51, defpackage.kn2
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // defpackage.w51
    public final x51 g() {
        List<ec2> list = this.n;
        this.o = list;
        list.getClass();
        return new x51(list);
    }

    @Override // defpackage.w51
    public final void h(w51.a aVar) {
        ByteBuffer byteBuffer = aVar.w;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        pt7 pt7Var = this.h;
        pt7Var.K(bArrArray, iLimit);
        while (pt7Var.a() >= 3) {
            int iZ = pt7Var.z();
            int i = iZ & 3;
            boolean z = (iZ & 4) == 4;
            byte bZ = (byte) pt7Var.z();
            byte bZ2 = (byte) pt7Var.z();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (bZ & MessagePack.Code.NIL) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            md6.g("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bZ & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.p = cVar;
                        cVar.d = 1;
                        cVar.c[0] = bZ2;
                    } else {
                        xl7.g(i == 2);
                        c cVar2 = this.p;
                        if (cVar2 == null) {
                            md6.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = cVar2.c;
                            int i5 = cVar2.d;
                            int i6 = i5 + 1;
                            cVar2.d = i6;
                            bArr[i5] = bZ;
                            cVar2.d = i5 + 2;
                            bArr[i6] = bZ2;
                        }
                    }
                    c cVar3 = this.p;
                    if (cVar3.d == (cVar3.b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // defpackage.w51
    public final boolean j() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    public final void k() {
        char c2;
        boolean z;
        c cVar = this.p;
        if (cVar == null) {
            return;
        }
        int i = 2;
        if (cVar.d != (cVar.b * 2) - 1) {
            md6.c("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.b * 2) - 1) + ", but current index is " + this.p.d + " (sequence number " + this.p.a + ");");
        }
        c cVar2 = this.p;
        byte[] bArr = cVar2.c;
        int i2 = cVar2.d;
        ot7 ot7Var = this.i;
        ot7Var.l(bArr, i2);
        boolean z2 = false;
        while (ot7Var.b() > 0) {
            int i3 = 3;
            int iG = ot7Var.g(3);
            int iG2 = ot7Var.g(5);
            if (iG == 7) {
                ot7Var.o(i);
                iG = ot7Var.g(6);
                if (iG < 7) {
                    d80.a(iG, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    md6.g("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z2) {
                    this.n = l();
                }
                this.p = null;
            }
            if (iG != this.k) {
                ot7Var.p(iG2);
            } else {
                int iE = (iG2 * 8) + ot7Var.e();
                while (ot7Var.e() < iE) {
                    int iG3 = ot7Var.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i3) {
                                    this.n = l();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case 12:
                                            m();
                                            break;
                                        case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                md6.g("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                ot7Var.o(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                d80.a(iG3, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                md6.g("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                ot7Var.o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            b bVar = this.m;
                            if (iG3 == 127) {
                                bVar.a((char) 9835);
                            } else {
                                bVar.a((char) (iG3 & 255));
                            }
                            z2 = true;
                        } else {
                            if (iG3 <= 159) {
                                b[] bVarArr = this.l;
                                switch (iG3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i4 = iG3 - 128;
                                        if (this.q != i4) {
                                            this.q = i4;
                                            this.m = bVarArr[i4];
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (ot7Var.f()) {
                                                b bVar2 = bVarArr[8 - i5];
                                                bVar2.a.clear();
                                                bVar2.b.clear();
                                                bVar2.o = -1;
                                                bVar2.p = -1;
                                                bVar2.q = -1;
                                                bVar2.s = -1;
                                                bVar2.u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (ot7Var.f()) {
                                                bVarArr[8 - i6].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (ot7Var.f()) {
                                                bVarArr[8 - i7].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (ot7Var.f()) {
                                                b bVar3 = bVarArr[8 - i8];
                                                bVar3.d = !bVar3.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (ot7Var.f()) {
                                                bVarArr[8 - i9].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        ot7Var.o(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        m();
                                        z = true;
                                        break;
                                    case 144:
                                        int i10 = i;
                                        if (this.m.c) {
                                            ot7Var.g(4);
                                            ot7Var.g(i10);
                                            ot7Var.g(i10);
                                            boolean zF = ot7Var.f();
                                            boolean zF2 = ot7Var.f();
                                            i3 = 3;
                                            ot7Var.g(3);
                                            ot7Var.g(3);
                                            this.m.e(zF, zF2);
                                            z = true;
                                        } else {
                                            ot7Var.o(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.m.c) {
                                            int iC = b.c(ot7Var.g(2), ot7Var.g(2), ot7Var.g(2), ot7Var.g(2));
                                            int iC2 = b.c(ot7Var.g(2), ot7Var.g(2), ot7Var.g(2), ot7Var.g(2));
                                            ot7Var.o(2);
                                            b.c(ot7Var.g(2), ot7Var.g(2), ot7Var.g(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            ot7Var.o(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 146:
                                        if (this.m.c) {
                                            ot7Var.o(4);
                                            int iG4 = ot7Var.g(4);
                                            ot7Var.o(2);
                                            ot7Var.g(6);
                                            b bVar4 = this.m;
                                            if (bVar4.u != iG4) {
                                                bVar4.a('\n');
                                            }
                                            bVar4.u = iG4;
                                        } else {
                                            ot7Var.o(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        d80.a(iG3, "Invalid C1 command: ", "Cea708Decoder");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.m.c) {
                                            int iC3 = b.c(ot7Var.g(2), ot7Var.g(2), ot7Var.g(2), ot7Var.g(2));
                                            ot7Var.g(2);
                                            b.c(ot7Var.g(2), ot7Var.g(2), ot7Var.g(2), 0);
                                            ot7Var.f();
                                            ot7Var.f();
                                            ot7Var.g(2);
                                            ot7Var.g(2);
                                            int iG5 = ot7Var.g(2);
                                            ot7Var.o(8);
                                            b bVar5 = this.m;
                                            bVar5.n = iC3;
                                            bVar5.k = iG5;
                                        } else {
                                            ot7Var.o(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i11 = iG3 - 152;
                                        b bVar6 = bVarArr[i11];
                                        ot7Var.o(i);
                                        boolean zF3 = ot7Var.f();
                                        ot7Var.o(i);
                                        int iG6 = ot7Var.g(i3);
                                        boolean zF4 = ot7Var.f();
                                        int iG7 = ot7Var.g(7);
                                        int iG8 = ot7Var.g(8);
                                        int iG9 = ot7Var.g(4);
                                        int iG10 = ot7Var.g(4);
                                        ot7Var.o(i);
                                        ot7Var.o(6);
                                        ot7Var.o(i);
                                        int iG11 = ot7Var.g(3);
                                        int iG12 = ot7Var.g(3);
                                        ArrayList arrayList = bVar6.a;
                                        bVar6.c = true;
                                        bVar6.d = zF3;
                                        bVar6.e = iG6;
                                        bVar6.f = zF4;
                                        bVar6.g = iG7;
                                        bVar6.h = iG8;
                                        bVar6.i = iG9;
                                        int i12 = iG10 + 1;
                                        if (bVar6.j != i12) {
                                            bVar6.j = i12;
                                            while (true) {
                                                if (arrayList.size() >= bVar6.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && bVar6.l != iG11) {
                                            bVar6.l = iG11;
                                            int i13 = iG11 - 1;
                                            int i14 = b.B[i13];
                                            boolean z3 = b.A[i13];
                                            int i15 = b.y[i13];
                                            int i16 = b.z[i13];
                                            int i17 = b.x[i13];
                                            bVar6.n = i14;
                                            bVar6.k = i17;
                                        }
                                        if (iG12 != 0 && bVar6.m != iG12) {
                                            bVar6.m = iG12;
                                            int i18 = iG12 - 1;
                                            int i19 = b.D[i18];
                                            int i20 = b.C[i18];
                                            bVar6.e(false, false);
                                            bVar6.f(b.v, b.E[i18]);
                                        }
                                        if (this.q != i11) {
                                            this.q = i11;
                                            this.m = bVarArr[i11];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (iG3 <= 255) {
                                    this.m.a((char) (iG3 & 255));
                                } else {
                                    d80.a(iG3, "Invalid base command: ", "Cea708Decoder");
                                }
                                i = 2;
                                c2 = 7;
                            }
                            z2 = z;
                            i = 2;
                            c2 = 7;
                        }
                        c2 = 7;
                    } else {
                        int iG13 = ot7Var.g(8);
                        if (iG13 <= 31) {
                            c2 = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    ot7Var.o(8);
                                } else if (iG13 <= 23) {
                                    ot7Var.o(16);
                                } else if (iG13 <= 31) {
                                    ot7Var.o(24);
                                }
                            }
                        } else {
                            c2 = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.m.a(' ');
                                } else if (iG13 == 33) {
                                    this.m.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.m.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.m.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.m.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.m.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.m.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.m.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.m.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    d80.a(iG13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (iG13 > 159) {
                                i = 2;
                                if (iG13 <= 255) {
                                    if (iG13 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        d80.a(iG13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    d80.a(iG13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iG13 <= 135) {
                                ot7Var.o(32);
                            } else if (iG13 <= 143) {
                                ot7Var.o(40);
                            } else if (iG13 <= 159) {
                                i = 2;
                                ot7Var.o(2);
                                ot7Var.o(ot7Var.g(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    public final List<ec2> l() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            b[] bVarArr = this.l;
            b bVar = bVarArr[i];
            if (bVar.c && (!bVar.a.isEmpty() || bVar.b.length() != 0)) {
                b bVar2 = bVarArr[i];
                if (bVar2.d) {
                    ArrayList arrayList2 = bVar2.a;
                    a aVar = null;
                    if (bVar2.c && (!arrayList2.isEmpty() || bVar2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) bVar2.b());
                        int i3 = bVar2.k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                mp2.a(bVar2.k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = bVar2.f;
                        int i4 = bVar2.h;
                        int i5 = bVar2.g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = bVar2.i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = bVar2.n;
                        aVar = new a(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != b.w, i11, bVar2.e);
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((a) arrayList.get(i12)).a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
