package defpackage;

import android.view.View;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class vx1 {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final sx1 J;
    public final sx1 K;
    public final sx1 L;
    public final sx1 M;
    public final sx1 N;
    public final sx1 O;
    public final sx1 P;
    public final sx1 Q;
    public final sx1[] R;
    public final ArrayList<sx1> S;
    public final boolean[] T;
    public final a[] U;
    public vx1 V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;
    public f61 b;
    public int b0;
    public f61 c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public View h0;
    public int i0;
    public String j;
    public String j0;
    public boolean k;
    public int k0;
    public boolean l;
    public int l0;
    public boolean m;
    public final float[] m0;
    public boolean n;
    public final vx1[] n0;
    public int o;
    public final vx1[] o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;
    public o15 d = null;
    public meb e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final /* synthetic */ a[] x;

        static {
            a aVar = new a("FIXED", 0);
            t = aVar;
            a aVar2 = new a("WRAP_CONTENT", 1);
            u = aVar2;
            a aVar3 = new a("MATCH_CONSTRAINT", 2);
            v = aVar3;
            a aVar4 = new a("MATCH_PARENT", 3);
            w = aVar4;
            x = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) x.clone();
        }
    }

    public vx1() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        sx1 sx1Var = new sx1(this, sx1.a.t);
        this.J = sx1Var;
        sx1 sx1Var2 = new sx1(this, sx1.a.u);
        this.K = sx1Var2;
        sx1 sx1Var3 = new sx1(this, sx1.a.v);
        this.L = sx1Var3;
        sx1 sx1Var4 = new sx1(this, sx1.a.w);
        this.M = sx1Var4;
        sx1 sx1Var5 = new sx1(this, sx1.a.x);
        this.N = sx1Var5;
        sx1 sx1Var6 = new sx1(this, sx1.a.z);
        this.O = sx1Var6;
        sx1 sx1Var7 = new sx1(this, sx1.a.A);
        this.P = sx1Var7;
        sx1 sx1Var8 = new sx1(this, sx1.a.y);
        this.Q = sx1Var8;
        this.R = new sx1[]{sx1Var, sx1Var3, sx1Var2, sx1Var4, sx1Var5, sx1Var8};
        ArrayList<sx1> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        a aVar = a.t;
        this.U = new a[]{aVar, aVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = null;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = new float[]{-1.0f, -1.0f};
        this.n0 = new vx1[]{null, null};
        this.o0 = new vx1[]{null, null};
        this.p0 = -1;
        this.q0 = -1;
        arrayList.add(sx1Var);
        arrayList.add(sx1Var2);
        arrayList.add(sx1Var3);
        arrayList.add(sx1Var4);
        arrayList.add(sx1Var6);
        arrayList.add(sx1Var7);
        arrayList.add(sx1Var8);
        arrayList.add(sx1Var5);
    }

    public static void D(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void E(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void m(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, a aVar) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = aVar.toString();
        if (!"FIXED".equals(string)) {
            ux1.b(sb, "      behavior", " :   ", string, ",\n");
        }
        D(i, 0, "      size", sb);
        D(i2, 0, "      min", sb);
        D(i3, Integer.MAX_VALUE, "      max", sb);
        D(i4, 0, "      matchMin", sb);
        D(i5, 0, "      matchDef", sb);
        E(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void n(StringBuilder sb, String str, sx1 sx1Var) {
        if (sx1Var.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(sx1Var.f);
        sb.append("'");
        if (sx1Var.h != Integer.MIN_VALUE || sx1Var.g != 0) {
            sb.append(",");
            sb.append(sx1Var.g);
            if (sx1Var.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(sx1Var.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public void A() {
        this.J.g();
        this.K.g();
        this.L.g();
        this.M.g();
        this.N.g();
        this.O.g();
        this.P.g();
        this.Q.g();
        this.V = null;
        this.D = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        a[] aVarArr = this.U;
        a aVar = a.t;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.h0 = null;
        this.i0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float[] fArr = this.m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void B() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        ArrayList<sx1> arrayList = this.S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sx1 sx1Var = arrayList.get(i);
            sx1Var.c = false;
            sx1Var.b = 0;
        }
    }

    public void C(m01 m01Var) {
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.N.h();
        this.Q.h();
        this.O.h();
        this.P.h();
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.J.i(i);
        this.L.i(i2);
        this.a0 = i;
        this.W = i2 - i;
        this.k = true;
    }

    public final void G(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.i(i);
        this.M.i(i2);
        this.b0 = i;
        this.X = i2 - i;
        if (this.E) {
            this.N.i(i + this.c0);
        }
        this.l = true;
    }

    public final void H(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public final void I(a aVar) {
        this.U[0] = aVar;
    }

    public final void J(a aVar) {
        this.U[1] = aVar;
    }

    public final void K(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void L(boolean z, boolean z2) {
        int i;
        int i2;
        o15 o15Var = this.d;
        boolean z3 = z & o15Var.g;
        meb mebVar = this.e;
        boolean z4 = z2 & mebVar.g;
        int i3 = o15Var.h.g;
        int i4 = mebVar.h.g;
        int i5 = o15Var.i.g;
        int i6 = mebVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        a aVar = a.t;
        a[] aVarArr = this.U;
        if (z3) {
            if (aVarArr[0] == aVar && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (z4) {
            if (aVarArr[1] == aVar && i9 < (i = this.X)) {
                i9 = i;
            }
            this.X = i9;
            int i11 = this.e0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
    }

    public void M(j86 j86Var, boolean z) {
        int i;
        int i2;
        meb mebVar;
        o15 o15Var;
        j86Var.getClass();
        int iN = j86.n(this.J);
        int iN2 = j86.n(this.K);
        int iN3 = j86.n(this.L);
        int iN4 = j86.n(this.M);
        if (z && (o15Var = this.d) != null) {
            fy2 fy2Var = o15Var.h;
            if (fy2Var.j) {
                fy2 fy2Var2 = o15Var.i;
                if (fy2Var2.j) {
                    iN = fy2Var.g;
                    iN3 = fy2Var2.g;
                }
            }
        }
        if (z && (mebVar = this.e) != null) {
            fy2 fy2Var3 = mebVar.h;
            if (fy2Var3.j) {
                fy2 fy2Var4 = mebVar.i;
                if (fy2Var4.j) {
                    iN2 = fy2Var3.g;
                    iN4 = fy2Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.a0 = iN;
        this.b0 = iN2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        a[] aVarArr = this.U;
        a aVar = aVarArr[0];
        a aVar2 = a.t;
        if (aVar == aVar2 && i4 < (i2 = this.W)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i4;
        this.X = i5;
        int i6 = this.e0;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.d0;
        if (i4 < i7) {
            this.W = i7;
        }
        int i8 = this.v;
        a aVar3 = a.v;
        if (i8 > 0 && aVar == aVar3) {
            this.W = Math.min(this.W, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && aVarArr[1] == aVar3) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a(wx1 wx1Var, j86 j86Var, HashSet<vx1> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            lk7.a(wx1Var, j86Var, this);
            hashSet.remove(this);
            b(j86Var, wx1Var.S(64));
        }
        if (i == 0) {
            HashSet<sx1> hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator<sx1> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.a(wx1Var, j86Var, hashSet, i, true);
                }
            }
            HashSet<sx1> hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator<sx1> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.a(wx1Var, j86Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<sx1> hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator<sx1> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.a(wx1Var, j86Var, hashSet, i, true);
            }
        }
        HashSet<sx1> hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator<sx1> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.a(wx1Var, j86Var, hashSet, i, true);
            }
        }
        HashSet<sx1> hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator<sx1> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().d.a(wx1Var, j86Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0214  */
    /* JADX WARN: Code duplicated, block: B:129:0x021d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x022e  */
    /* JADX WARN: Code duplicated, block: B:135:0x023a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0243  */
    /* JADX WARN: Code duplicated, block: B:146:0x0269  */
    /* JADX WARN: Code duplicated, block: B:158:0x028f  */
    /* JADX WARN: Code duplicated, block: B:162:0x029a  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:181:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:184:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:188:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:251:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:272:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:276:0x0407  */
    /* JADX WARN: Code duplicated, block: B:278:0x040c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:281:0x0412  */
    /* JADX WARN: Code duplicated, block: B:284:0x0418  */
    /* JADX WARN: Code duplicated, block: B:289:0x0424  */
    /* JADX WARN: Code duplicated, block: B:292:0x042b  */
    /* JADX WARN: Code duplicated, block: B:295:0x0431  */
    /* JADX WARN: Code duplicated, block: B:297:0x0434  */
    /* JADX WARN: Code duplicated, block: B:300:0x044f  */
    /* JADX WARN: Code duplicated, block: B:335:0x0548  */
    /* JADX WARN: Code duplicated, block: B:337:0x055e  */
    /* JADX WARN: Code duplicated, block: B:353:0x05af  */
    /* JADX WARN: Code duplicated, block: B:356:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:357:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:359:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:396:0x0681  */
    /* JADX WARN: Code duplicated, block: B:398:0x0687  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:400:0x0690  */
    /* JADX WARN: Code duplicated, block: B:401:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:404:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:407:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149  */
    /* JADX WARN: Code duplicated, block: B:83:0x0154  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r61v0, types: [vx1] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    public void b(j86 j86Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r19;
        boolean[] zArr;
        int i6;
        boolean z2;
        HashSet<sx1> hashSet;
        vx1 vx1Var;
        wx1 wx1Var;
        WeakReference<sx1> weakReference;
        WeakReference<sx1> weakReference2;
        vx1 vx1Var2;
        wx1 wx1Var2;
        WeakReference<sx1> weakReference3;
        WeakReference<sx1> weakReference4;
        boolean[] zArr2;
        sx1 sx1Var;
        boolean[] zArr3;
        boolean z3;
        ?? r12;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        a[] aVarArr;
        a aVar;
        a aVar2;
        boolean z5;
        a aVar3;
        boolean z6;
        int i12;
        float f;
        int i13;
        int i14;
        bw9 bw9Var;
        bw9 bw9Var2;
        int i15;
        int i16;
        boolean z7;
        int i17;
        boolean z8;
        boolean z9;
        sx1 sx1Var2;
        int i18;
        boolean z10;
        ?? r20;
        ?? r110;
        boolean z11;
        bw9 bw9Var3;
        bw9 bw9Var4;
        bw9 bw9Var5;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        float f2;
        ?? r27;
        meb mebVar;
        boolean z12;
        o15 o15Var;
        int i25;
        int i26;
        int i27;
        ?? V;
        boolean zW;
        o15 o15Var2;
        meb mebVar2;
        boolean z13;
        ArrayList<sx1> arrayList;
        int size;
        int i28;
        HashSet<sx1> hashSet2;
        j86 j86Var2 = j86Var;
        sx1 sx1Var3 = this.J;
        bw9 bw9VarK = j86Var2.k(sx1Var3);
        sx1 sx1Var4 = this.L;
        bw9 bw9VarK2 = j86Var2.k(sx1Var4);
        sx1 sx1Var5 = this.K;
        bw9 bw9VarK3 = j86Var2.k(sx1Var5);
        sx1 sx1Var6 = this.M;
        bw9 bw9VarK4 = j86Var2.k(sx1Var6);
        sx1 sx1Var7 = this.N;
        bw9 bw9VarK5 = j86Var2.k(sx1Var7);
        vx1 vx1Var3 = this.V;
        a aVar4 = a.u;
        if (vx1Var3 != null) {
            a[] aVarArr2 = vx1Var3.U;
            i2 = 0;
            i4 = aVarArr2[0] == aVar4 ? 1 : 0;
            int i29 = aVarArr2[1] == aVar4 ? 1 : 0;
            int i30 = this.q;
            if (i30 != 1) {
                i = 1;
                if (i30 == 2) {
                    i4 = 0;
                } else if (i30 != 3) {
                }
                i3 = i29;
            } else {
                i = 1;
                i3 = 0;
            }
            i5 = this.i0;
            r19 = i3;
            zArr = this.T;
            if (i5 == 8) {
                arrayList = this.S;
                size = arrayList.size();
                i6 = i4;
                i28 = i2;
                while (true) {
                    if (i28 < size) {
                        if (!zArr[i2] || zArr[i]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i31 = size;
                    hashSet2 = arrayList.get(i28).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i28++;
                    size = i31;
                }
            } else {
                i6 = i4;
            }
            z2 = this.k;
            if (z2 || this.l) {
                if (z2) {
                    j86Var2.d(bw9VarK, this.a0);
                    j86Var2.d(bw9VarK2, this.a0 + this.W);
                    if (i6 != 0 && (vx1Var2 = this.V) != null) {
                        wx1Var2 = (wx1) vx1Var2;
                        weakReference3 = wx1Var2.I0;
                        if (weakReference3 != null || weakReference3.get() == null || sx1Var3.c() > wx1Var2.I0.get().c()) {
                            wx1Var2.I0 = new WeakReference<>(sx1Var3);
                        }
                        weakReference4 = wx1Var2.K0;
                        if (weakReference4 != null || weakReference4.get() == null || sx1Var4.c() > wx1Var2.K0.get().c()) {
                            wx1Var2.K0 = new WeakReference<>(sx1Var4);
                        }
                    }
                }
                if (this.l) {
                    j86Var2.d(bw9VarK3, this.b0);
                    j86Var2.d(bw9VarK4, this.b0 + this.X);
                    hashSet = sx1Var7.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        j86Var2.d(bw9VarK5, this.b0 + this.c0);
                    }
                    if (r19 != 0 && (vx1Var = this.V) != null) {
                        wx1Var = (wx1) vx1Var;
                        weakReference = wx1Var.H0;
                        if (weakReference != null || weakReference.get() == null || sx1Var5.c() > wx1Var.H0.get().c()) {
                            wx1Var.H0 = new WeakReference<>(sx1Var5);
                        }
                        weakReference2 = wx1Var.J0;
                        if (weakReference2 != null || weakReference2.get() == null || sx1Var6.c() > wx1Var.J0.get().c()) {
                            wx1Var.J0 = new WeakReference<>(sx1Var6);
                        }
                    }
                }
                if (this.k && this.l) {
                    ?? r13 = i2;
                    this.k = r13;
                    this.l = r13;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (o15Var2 = this.d) == null || (mebVar2 = this.e) == null) {
                sx1Var = sx1Var7;
                zArr3 = zArr2;
            } else {
                sx1Var = sx1Var7;
                fy2 fy2Var = o15Var2.h;
                zArr3 = zArr2;
                if (fy2Var.j && o15Var2.i.j && mebVar2.h.j && mebVar2.i.j) {
                    j86Var2.d(bw9VarK, fy2Var.g);
                    j86Var2.d(bw9VarK2, this.d.i.g);
                    j86Var2.d(bw9VarK3, this.e.h.g);
                    j86Var2.d(bw9VarK4, this.e.i.g);
                    j86Var2.d(bw9VarK5, this.e.k.g);
                    if (this.V == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !v()) {
                            j86Var2.f(j86Var2.k(this.V.L), bw9VarK2, 0, 8);
                        }
                        if (r19 == 0 || !zArr3[i] || w()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            j86Var2.f(j86Var2.k(this.V.M), bw9VarK4, 0, 8);
                        }
                    }
                    this.k = z13;
                    this.l = z13;
                    return;
                }
            }
            if (this.V != null) {
                if (u(0)) {
                    ((wx1) this.V).O(this, 0);
                    int i32 = i;
                    i27 = i32 == true ? 1 : 0;
                    V = i32;
                } else {
                    i27 = i;
                    V = v();
                }
                if (u(i27)) {
                    ((wx1) this.V).O(this, i27);
                    zW = true;
                } else {
                    zW = w();
                }
                if (V != 0 && i6 != 0 && this.i0 != 8 && sx1Var3.f == null && sx1Var4.f == null) {
                    j86Var2.f(j86Var2.k(this.V.L), bw9VarK2, 0, 1);
                }
                if (!zW && r19 != 0 && this.i0 != 8 && sx1Var5.f == null && sx1Var6.f == null && sx1Var == null) {
                    j86Var2.f(j86Var2.k(this.V.M), bw9VarK4, 0, 1);
                }
                z3 = zW;
                r12 = V;
            } else {
                sx1Var3 = sx1Var3;
                z3 = false;
                r12 = 0;
            }
            i7 = this.W;
            i8 = this.d0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.X;
            z4 = z3;
            i10 = this.e0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            aVarArr = this.U;
            aVar = aVarArr[0];
            aVar2 = a.v;
            if (aVar != aVar2) {
                z5 = true;
            } else {
                z5 = false;
            }
            aVar3 = aVarArr[1];
            if (aVar3 != aVar2) {
                z6 = true;
            } else {
                z6 = false;
            }
            i12 = this.Z;
            this.A = i12;
            f = this.Y;
            this.B = f;
            i13 = this.r;
            i14 = this.s;
            if (f > 0.0f) {
                bw9Var = bw9VarK4;
                if (this.i0 != 8) {
                    if (aVar == aVar2 || i13 != 0) {
                        i15 = i13;
                    } else {
                        i15 = 3;
                    }
                    if (aVar3 == aVar2 || i14 != 0) {
                        i26 = i14;
                    } else {
                        i26 = 3;
                    }
                    if (aVar != aVar2 && aVar3 == aVar2) {
                        bw9Var2 = bw9VarK5;
                        if (i15 == 3 && i26 == 3) {
                            if (i12 == -1) {
                                if (z5 && !z6) {
                                    this.A = 0;
                                } else if (!z5 && z6) {
                                    this.A = 1;
                                    if (i12 == -1) {
                                        this.B = 1.0f / f;
                                    }
                                }
                            }
                            if (this.A == 0 && (!sx1Var5.f() || !sx1Var6.f())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!sx1Var3.f() || !sx1Var4.f())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!sx1Var5.f() || !sx1Var6.f() || !sx1Var3.f() || !sx1Var4.f())) {
                                if (sx1Var5.f() && sx1Var6.f()) {
                                    this.A = 0;
                                } else if (sx1Var3.f() && sx1Var4.f()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                int i33 = this.u;
                                if (i33 > 0 && this.x == 0) {
                                    this.A = 0;
                                } else if (i33 == 0 && this.x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                        }
                        i6 = i6;
                        z7 = true;
                        i16 = i26;
                        int[] iArr = this.t;
                        iArr[0] = i15;
                        iArr[1] = i16;
                        if (z7) {
                            int i34 = this.A;
                            i17 = -1;
                            boolean z14 = i34 != 0 || i34 == -1;
                            if (z7 || !((i25 = this.A) == 1 || i25 == i17)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (aVarArr[0] == aVar4 || !(this instanceof wx1)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (z9) {
                                i8 = 0;
                            }
                            sx1Var2 = this.Q;
                            boolean z15 = !sx1Var2.f();
                            boolean z16 = zArr[0];
                            boolean z17 = zArr[1];
                            i18 = this.o;
                            int[] iArr2 = this.C;
                            if (i18 == 2 && !this.k) {
                                if (z && (o15Var = this.d) != null) {
                                    fy2 fy2Var2 = o15Var.h;
                                    z12 = i6 == true ? 1 : 0;
                                    if (fy2Var2.j && o15Var.i.j) {
                                        if (z) {
                                            j86Var2.d(bw9VarK, fy2Var2.g);
                                            j86Var2.d(bw9VarK2, this.d.i.g);
                                            if (this.V != null && z12 && zArr3[0] && !v()) {
                                                j86Var2.f(j86Var2.k(this.V.L), bw9VarK2, 0, 8);
                                            }
                                        }
                                        i6 = z12 ? 1 : 0;
                                    }
                                    if (z || (mebVar = this.e) == null) {
                                        bw9Var3 = r34;
                                        bw9Var4 = bw9Var;
                                        bw9Var5 = bw9Var2;
                                        i19 = 0;
                                        i20 = 8;
                                        i21 = 1;
                                        i22 = 1;
                                    } else {
                                        fy2 fy2Var3 = mebVar.h;
                                        if (fy2Var3.j && mebVar.i.j) {
                                            int i35 = fy2Var3.g;
                                            bw9Var3 = bw9VarK3;
                                            j86Var2.d(bw9Var3, i35);
                                            bw9Var4 = bw9Var;
                                            j86Var2.d(bw9Var4, this.e.i.g);
                                            bw9Var5 = bw9Var2;
                                            j86Var2.d(bw9Var5, this.e.k.g);
                                            vx1 vx1Var4 = this.V;
                                            if (vx1Var4 == null || z11 || r110 == 0) {
                                                i19 = 0;
                                                i20 = 8;
                                                i21 = 1;
                                            } else {
                                                i21 = 1;
                                                if (zArr3[1]) {
                                                    i19 = 0;
                                                    i20 = 8;
                                                    j86Var2.f(j86Var2.k(vx1Var4.M), bw9Var4, 0, 8);
                                                } else {
                                                    i19 = 0;
                                                    i20 = 8;
                                                }
                                            }
                                            i22 = i19;
                                        } else {
                                            bw9Var3 = r34;
                                            bw9Var4 = bw9Var;
                                            bw9Var5 = bw9Var2;
                                            i19 = 0;
                                            i20 = 8;
                                            i21 = 1;
                                            i22 = 1;
                                        }
                                    }
                                    if (this.p == 2) {
                                        i23 = i19;
                                    } else {
                                        i23 = i22;
                                    }
                                    if (i23 == 0 && !this.l) {
                                        int i36 = (aVarArr[i21] == aVar4 && (this instanceof wx1)) ? i21 : i19;
                                        int i37 = i36 != 0 ? i19 : i11;
                                        vx1 vx1Var5 = this.V;
                                        bw9 bw9VarK6 = vx1Var5 != null ? j86Var2.k(vx1Var5.M) : null;
                                        vx1 vx1Var6 = this.V;
                                        bw9 bw9VarK7 = vx1Var6 != null ? j86Var2.k(vx1Var6.K) : null;
                                        int i38 = this.c0;
                                        if (i38 > 0 || this.i0 == i20) {
                                            r27 = z10;
                                            sx1 sx1Var8 = sx1Var;
                                            if (sx1Var8.f != null) {
                                                j86Var2.e(bw9Var5, bw9Var3, i38, i20);
                                                j86Var2.e(bw9Var5, j86Var2.k(sx1Var8.f), sx1Var8.d(), i20);
                                                if (r110 != 0) {
                                                    j86Var2.f(bw9VarK6, j86Var2.k(sx1Var6), i19, 5);
                                                }
                                                r27 = i19;
                                            } else if (this.i0 == i20) {
                                                j86Var2.e(bw9Var5, bw9Var3, sx1Var8.d(), i20);
                                                r27 = z10;
                                            } else {
                                                j86Var2.e(bw9Var5, bw9Var3, i38, i20);
                                                r27 = z10;
                                            }
                                        }
                                        r27 = z10;
                                        int i39 = i19;
                                        j86Var2 = j86Var;
                                        d(j86Var2, false, r110, i6, zArr3[i21], bw9VarK7, bw9VarK6, aVarArr[i21], i36, this.K, this.M, this.b0, i37, this.e0, iArr2[i21], this.g0, z8, aVarArr[i39] == aVar2 ? 1 : i39, z11, r20, z17, i16, i15, this.x, this.y, this.z, r27);
                                    }
                                    if (z7) {
                                        i24 = this.A;
                                        f2 = this.B;
                                        if (i24 == 1) {
                                            q30 q30VarL = j86Var2.l();
                                            q30VarL.d.k(bw9Var4, -1.0f);
                                            q30VarL.d.k(bw9Var3, 1.0f);
                                            q30VarL.d.k(bw9VarK2, f2);
                                            q30VarL.d.k(bw9VarK, -f2);
                                            j86Var2.c(q30VarL);
                                        } else {
                                            q30 q30VarL2 = j86Var2.l();
                                            q30VarL2.d.k(bw9VarK2, -1.0f);
                                            q30VarL2.d.k(bw9VarK, 1.0f);
                                            q30VarL2.d.k(bw9Var4, f2);
                                            q30VarL2.d.k(bw9Var3, -f2);
                                            j86Var2.c(q30VarL2);
                                        }
                                    }
                                    if (sx1Var2.f()) {
                                        sx1 sx1Var9 = sx1Var2;
                                        vx1 vx1Var7 = sx1Var9.f.d;
                                        float radians = (float) Math.toRadians(this.D + 90.0f);
                                        int iD = sx1Var9.d();
                                        sx1.a aVar5 = sx1.a.t;
                                        bw9 bw9VarK8 = j86Var2.k(g(aVar5));
                                        sx1.a aVar6 = sx1.a.u;
                                        bw9 bw9VarK9 = j86Var2.k(g(aVar6));
                                        sx1.a aVar7 = sx1.a.v;
                                        bw9 bw9VarK10 = j86Var2.k(g(aVar7));
                                        sx1.a aVar8 = sx1.a.w;
                                        bw9 bw9VarK11 = j86Var2.k(g(aVar8));
                                        bw9 bw9VarK12 = j86Var2.k(vx1Var7.g(aVar5));
                                        bw9 bw9VarK13 = j86Var2.k(vx1Var7.g(aVar6));
                                        bw9 bw9VarK14 = j86Var2.k(vx1Var7.g(aVar7));
                                        bw9 bw9VarK15 = j86Var2.k(vx1Var7.g(aVar8));
                                        q30 q30VarL3 = j86Var2.l();
                                        double d = radians;
                                        double dSin = Math.sin(d);
                                        double d2 = iD;
                                        q30VarL3.d.k(bw9VarK13, 0.5f);
                                        q30VarL3.d.k(bw9VarK15, 0.5f);
                                        q30VarL3.d.k(bw9VarK9, -0.5f);
                                        q30VarL3.d.k(bw9VarK11, -0.5f);
                                        q30VarL3.b = -((float) (dSin * d2));
                                        j86Var2.c(q30VarL3);
                                        q30 q30VarL4 = j86Var2.l();
                                        float fCos = (float) (Math.cos(d) * d2);
                                        q30VarL4.d.k(bw9VarK12, 0.5f);
                                        q30VarL4.d.k(bw9VarK14, 0.5f);
                                        q30VarL4.d.k(bw9VarK8, -0.5f);
                                        q30VarL4.d.k(bw9VarK10, -0.5f);
                                        q30VarL4.b = -fCos;
                                        j86Var2.c(q30VarL4);
                                    }
                                    this.k = false;
                                    this.l = false;
                                }
                                z12 = i6 == true ? 1 : 0;
                                vx1 vx1Var8 = this.V;
                                bw9 bw9VarK16 = vx1Var8 != null ? j86Var2.k(vx1Var8.L) : null;
                                vx1 vx1Var9 = this.V;
                                bw9 bw9VarK17 = vx1Var9 != null ? j86Var2.k(vx1Var9.J) : null;
                                boolean z18 = zArr3[0];
                                i15 = i15;
                                a aVar9 = aVarArr[0];
                                boolean z19 = r12 == true ? 1 : 0;
                                boolean z20 = z15;
                                sx1Var2 = sx1Var2;
                                iArr2 = iArr2;
                                bw9VarK = bw9VarK;
                                aVar2 = aVar2;
                                sx1Var = sx1Var;
                                boolean z21 = z12;
                                bw9VarK2 = bw9VarK2;
                                aVar4 = aVar4;
                                j86Var2 = j86Var;
                                d(j86Var2, true, z21, r19, z18, bw9VarK17, bw9VarK16, aVar9, z9, this.J, this.L, this.a0, i8, this.d0, iArr2[0], this.f0, z14, aVarArr[1] == aVar2, z19, z4, z16, i15, i16, this.u, this.v, this.w, z20);
                                i6 = z21 ? 1 : 0;
                                z11 = z4;
                                r20 = z19 ? 1 : 0;
                                r110 = r19 == true ? 1 : 0;
                                z10 = z20;
                                if (z) {
                                    bw9Var3 = r34;
                                    bw9Var4 = bw9Var;
                                    bw9Var5 = bw9Var2;
                                    i19 = 0;
                                    i20 = 8;
                                    i21 = 1;
                                    i22 = 1;
                                } else {
                                    bw9Var3 = r34;
                                    bw9Var4 = bw9Var;
                                    bw9Var5 = bw9Var2;
                                    i19 = 0;
                                    i20 = 8;
                                    i21 = 1;
                                    i22 = 1;
                                }
                                if (this.p == 2) {
                                    i23 = i19;
                                } else {
                                    i23 = i22;
                                }
                                if (i23 == 0) {
                                }
                                if (z7) {
                                    i24 = this.A;
                                    f2 = this.B;
                                    if (i24 == 1) {
                                        q30 q30VarL5 = j86Var2.l();
                                        q30VarL5.d.k(bw9Var4, -1.0f);
                                        q30VarL5.d.k(bw9Var3, 1.0f);
                                        q30VarL5.d.k(bw9VarK2, f2);
                                        q30VarL5.d.k(bw9VarK, -f2);
                                        j86Var2.c(q30VarL5);
                                    } else {
                                        q30 q30VarL6 = j86Var2.l();
                                        q30VarL6.d.k(bw9VarK2, -1.0f);
                                        q30VarL6.d.k(bw9VarK, 1.0f);
                                        q30VarL6.d.k(bw9Var4, f2);
                                        q30VarL6.d.k(bw9Var3, -f2);
                                        j86Var2.c(q30VarL6);
                                    }
                                }
                                if (sx1Var2.f()) {
                                    sx1 sx1Var10 = sx1Var2;
                                    vx1 vx1Var10 = sx1Var10.f.d;
                                    float radians2 = (float) Math.toRadians(this.D + 90.0f);
                                    int iD2 = sx1Var10.d();
                                    sx1.a aVar10 = sx1.a.t;
                                    bw9 bw9VarK18 = j86Var2.k(g(aVar10));
                                    sx1.a aVar11 = sx1.a.u;
                                    bw9 bw9VarK19 = j86Var2.k(g(aVar11));
                                    sx1.a aVar12 = sx1.a.v;
                                    bw9 bw9VarK110 = j86Var2.k(g(aVar12));
                                    sx1.a aVar13 = sx1.a.w;
                                    bw9 bw9VarK111 = j86Var2.k(g(aVar13));
                                    bw9 bw9VarK112 = j86Var2.k(vx1Var10.g(aVar10));
                                    bw9 bw9VarK113 = j86Var2.k(vx1Var10.g(aVar11));
                                    bw9 bw9VarK114 = j86Var2.k(vx1Var10.g(aVar12));
                                    bw9 bw9VarK115 = j86Var2.k(vx1Var10.g(aVar13));
                                    q30 q30VarL7 = j86Var2.l();
                                    double d3 = radians2;
                                    double dSin2 = Math.sin(d3);
                                    double d4 = iD2;
                                    q30VarL7.d.k(bw9VarK113, 0.5f);
                                    q30VarL7.d.k(bw9VarK115, 0.5f);
                                    q30VarL7.d.k(bw9VarK19, -0.5f);
                                    q30VarL7.d.k(bw9VarK111, -0.5f);
                                    q30VarL7.b = -((float) (dSin2 * d4));
                                    j86Var2.c(q30VarL7);
                                    q30 q30VarL8 = j86Var2.l();
                                    float fCos2 = (float) (Math.cos(d3) * d4);
                                    q30VarL8.d.k(bw9VarK112, 0.5f);
                                    q30VarL8.d.k(bw9VarK114, 0.5f);
                                    q30VarL8.d.k(bw9VarK18, -0.5f);
                                    q30VarL8.d.k(bw9VarK110, -0.5f);
                                    q30VarL8.b = -fCos2;
                                    j86Var2.c(q30VarL8);
                                }
                                this.k = false;
                                this.l = false;
                            }
                            z11 = z4;
                            z10 = z15;
                            r110 = r19;
                            r20 = r12;
                            if (z) {
                                bw9Var3 = r34;
                                bw9Var4 = bw9Var;
                                bw9Var5 = bw9Var2;
                                i19 = 0;
                                i20 = 8;
                                i21 = 1;
                                i22 = 1;
                            } else {
                                bw9Var3 = r34;
                                bw9Var4 = bw9Var;
                                bw9Var5 = bw9Var2;
                                i19 = 0;
                                i20 = 8;
                                i21 = 1;
                                i22 = 1;
                            }
                            if (this.p == 2) {
                                i23 = i19;
                            } else {
                                i23 = i22;
                            }
                            if (i23 == 0) {
                            }
                            if (z7) {
                                i24 = this.A;
                                f2 = this.B;
                                if (i24 == 1) {
                                    q30 q30VarL9 = j86Var2.l();
                                    q30VarL9.d.k(bw9Var4, -1.0f);
                                    q30VarL9.d.k(bw9Var3, 1.0f);
                                    q30VarL9.d.k(bw9VarK2, f2);
                                    q30VarL9.d.k(bw9VarK, -f2);
                                    j86Var2.c(q30VarL9);
                                } else {
                                    q30 q30VarL10 = j86Var2.l();
                                    q30VarL10.d.k(bw9VarK2, -1.0f);
                                    q30VarL10.d.k(bw9VarK, 1.0f);
                                    q30VarL10.d.k(bw9Var4, f2);
                                    q30VarL10.d.k(bw9Var3, -f2);
                                    j86Var2.c(q30VarL10);
                                }
                            }
                            if (sx1Var2.f()) {
                                sx1 sx1Var11 = sx1Var2;
                                vx1 vx1Var11 = sx1Var11.f.d;
                                float radians3 = (float) Math.toRadians(this.D + 90.0f);
                                int iD3 = sx1Var11.d();
                                sx1.a aVar14 = sx1.a.t;
                                bw9 bw9VarK116 = j86Var2.k(g(aVar14));
                                sx1.a aVar15 = sx1.a.u;
                                bw9 bw9VarK117 = j86Var2.k(g(aVar15));
                                sx1.a aVar16 = sx1.a.v;
                                bw9 bw9VarK118 = j86Var2.k(g(aVar16));
                                sx1.a aVar17 = sx1.a.w;
                                bw9 bw9VarK119 = j86Var2.k(g(aVar17));
                                bw9 bw9VarK1110 = j86Var2.k(vx1Var11.g(aVar14));
                                bw9 bw9VarK1111 = j86Var2.k(vx1Var11.g(aVar15));
                                bw9 bw9VarK1112 = j86Var2.k(vx1Var11.g(aVar16));
                                bw9 bw9VarK1113 = j86Var2.k(vx1Var11.g(aVar17));
                                q30 q30VarL11 = j86Var2.l();
                                double d5 = radians3;
                                double dSin3 = Math.sin(d5);
                                double d6 = iD3;
                                q30VarL11.d.k(bw9VarK1111, 0.5f);
                                q30VarL11.d.k(bw9VarK1113, 0.5f);
                                q30VarL11.d.k(bw9VarK117, -0.5f);
                                q30VarL11.d.k(bw9VarK119, -0.5f);
                                q30VarL11.b = -((float) (dSin3 * d6));
                                j86Var2.c(q30VarL11);
                                q30 q30VarL12 = j86Var2.l();
                                float fCos3 = (float) (Math.cos(d5) * d6);
                                q30VarL12.d.k(bw9VarK1110, 0.5f);
                                q30VarL12.d.k(bw9VarK1112, 0.5f);
                                q30VarL12.d.k(bw9VarK116, -0.5f);
                                q30VarL12.d.k(bw9VarK118, -0.5f);
                                q30VarL12.b = -fCos3;
                                j86Var2.c(q30VarL12);
                            }
                            this.k = false;
                            this.l = false;
                        }
                        i17 = -1;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (aVarArr[0] == aVar4) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        sx1Var2 = this.Q;
                        boolean z110 = !sx1Var2.f();
                        boolean z111 = zArr[0];
                        boolean z112 = zArr[1];
                        i18 = this.o;
                        int[] iArr3 = this.C;
                        if (i18 == 2) {
                            z11 = z4;
                            z10 = z110;
                            r110 = r19;
                            r20 = r12;
                        } else {
                            z11 = z4;
                            z10 = z110;
                            r110 = r19;
                            r20 = r12;
                        }
                        if (z) {
                            bw9Var3 = r34;
                            bw9Var4 = bw9Var;
                            bw9Var5 = bw9Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        } else {
                            bw9Var3 = r34;
                            bw9Var4 = bw9Var;
                            bw9Var5 = bw9Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        }
                        if (this.p == 2) {
                            i23 = i19;
                        } else {
                            i23 = i22;
                        }
                        if (i23 == 0) {
                        }
                        if (z7) {
                            i24 = this.A;
                            f2 = this.B;
                            if (i24 == 1) {
                                q30 q30VarL13 = j86Var2.l();
                                q30VarL13.d.k(bw9Var4, -1.0f);
                                q30VarL13.d.k(bw9Var3, 1.0f);
                                q30VarL13.d.k(bw9VarK2, f2);
                                q30VarL13.d.k(bw9VarK, -f2);
                                j86Var2.c(q30VarL13);
                            } else {
                                q30 q30VarL14 = j86Var2.l();
                                q30VarL14.d.k(bw9VarK2, -1.0f);
                                q30VarL14.d.k(bw9VarK, 1.0f);
                                q30VarL14.d.k(bw9Var4, f2);
                                q30VarL14.d.k(bw9Var3, -f2);
                                j86Var2.c(q30VarL14);
                            }
                        }
                        if (sx1Var2.f()) {
                            sx1 sx1Var12 = sx1Var2;
                            vx1 vx1Var12 = sx1Var12.f.d;
                            float radians4 = (float) Math.toRadians(this.D + 90.0f);
                            int iD4 = sx1Var12.d();
                            sx1.a aVar18 = sx1.a.t;
                            bw9 bw9VarK1114 = j86Var2.k(g(aVar18));
                            sx1.a aVar19 = sx1.a.u;
                            bw9 bw9VarK1115 = j86Var2.k(g(aVar19));
                            sx1.a aVar110 = sx1.a.v;
                            bw9 bw9VarK1116 = j86Var2.k(g(aVar110));
                            sx1.a aVar111 = sx1.a.w;
                            bw9 bw9VarK1117 = j86Var2.k(g(aVar111));
                            bw9 bw9VarK1118 = j86Var2.k(vx1Var12.g(aVar18));
                            bw9 bw9VarK1119 = j86Var2.k(vx1Var12.g(aVar19));
                            bw9 bw9VarK11110 = j86Var2.k(vx1Var12.g(aVar110));
                            bw9 bw9VarK11111 = j86Var2.k(vx1Var12.g(aVar111));
                            q30 q30VarL15 = j86Var2.l();
                            double d7 = radians4;
                            double dSin4 = Math.sin(d7);
                            double d8 = iD4;
                            q30VarL15.d.k(bw9VarK1119, 0.5f);
                            q30VarL15.d.k(bw9VarK11111, 0.5f);
                            q30VarL15.d.k(bw9VarK1115, -0.5f);
                            q30VarL15.d.k(bw9VarK1117, -0.5f);
                            q30VarL15.b = -((float) (dSin4 * d8));
                            j86Var2.c(q30VarL15);
                            q30 q30VarL16 = j86Var2.l();
                            float fCos4 = (float) (Math.cos(d7) * d8);
                            q30VarL16.d.k(bw9VarK1118, 0.5f);
                            q30VarL16.d.k(bw9VarK11110, 0.5f);
                            q30VarL16.d.k(bw9VarK1114, -0.5f);
                            q30VarL16.d.k(bw9VarK1116, -0.5f);
                            q30VarL16.b = -fCos4;
                            j86Var2.c(q30VarL16);
                        }
                        this.k = false;
                        this.l = false;
                    }
                    bw9Var2 = bw9VarK5;
                    if (aVar == aVar2 || i15 != 3) {
                        if (aVar3 == aVar2 && i26 == 3) {
                            this.A = 1;
                            if (i12 == -1) {
                                this.B = 1.0f / f;
                            }
                            i11 = (int) (this.B * i7);
                            if (aVar != aVar2) {
                                i16 = 4;
                            }
                        }
                        i6 = i6;
                        z7 = true;
                    } else {
                        this.A = 0;
                        i8 = (int) (i9 * f);
                        i6 = i6;
                        if (aVar3 != aVar2) {
                            i15 = 4;
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                    }
                    i16 = i26;
                    int[] iArr4 = this.t;
                    iArr4[0] = i15;
                    iArr4[1] = i16;
                    if (z7) {
                        int i310 = this.A;
                        i17 = -1;
                        if (i310 != 0) {
                        }
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (aVarArr[0] == aVar4) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        sx1Var2 = this.Q;
                        boolean z113 = !sx1Var2.f();
                        boolean z114 = zArr[0];
                        boolean z115 = zArr[1];
                        i18 = this.o;
                        int[] iArr5 = this.C;
                        if (i18 == 2) {
                            z11 = z4;
                            z10 = z113;
                            r110 = r19;
                            r20 = r12;
                        } else {
                            z11 = z4;
                            z10 = z113;
                            r110 = r19;
                            r20 = r12;
                        }
                        if (z) {
                            bw9Var3 = r34;
                            bw9Var4 = bw9Var;
                            bw9Var5 = bw9Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        } else {
                            bw9Var3 = r34;
                            bw9Var4 = bw9Var;
                            bw9Var5 = bw9Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        }
                        if (this.p == 2) {
                            i23 = i19;
                        } else {
                            i23 = i22;
                        }
                        if (i23 == 0) {
                        }
                        if (z7) {
                            i24 = this.A;
                            f2 = this.B;
                            if (i24 == 1) {
                                q30 q30VarL17 = j86Var2.l();
                                q30VarL17.d.k(bw9Var4, -1.0f);
                                q30VarL17.d.k(bw9Var3, 1.0f);
                                q30VarL17.d.k(bw9VarK2, f2);
                                q30VarL17.d.k(bw9VarK, -f2);
                                j86Var2.c(q30VarL17);
                            } else {
                                q30 q30VarL18 = j86Var2.l();
                                q30VarL18.d.k(bw9VarK2, -1.0f);
                                q30VarL18.d.k(bw9VarK, 1.0f);
                                q30VarL18.d.k(bw9Var4, f2);
                                q30VarL18.d.k(bw9Var3, -f2);
                                j86Var2.c(q30VarL18);
                            }
                        }
                        if (sx1Var2.f()) {
                            sx1 sx1Var13 = sx1Var2;
                            vx1 vx1Var13 = sx1Var13.f.d;
                            float radians5 = (float) Math.toRadians(this.D + 90.0f);
                            int iD5 = sx1Var13.d();
                            sx1.a aVar112 = sx1.a.t;
                            bw9 bw9VarK11112 = j86Var2.k(g(aVar112));
                            sx1.a aVar113 = sx1.a.u;
                            bw9 bw9VarK11113 = j86Var2.k(g(aVar113));
                            sx1.a aVar114 = sx1.a.v;
                            bw9 bw9VarK11114 = j86Var2.k(g(aVar114));
                            sx1.a aVar115 = sx1.a.w;
                            bw9 bw9VarK11115 = j86Var2.k(g(aVar115));
                            bw9 bw9VarK11116 = j86Var2.k(vx1Var13.g(aVar112));
                            bw9 bw9VarK11117 = j86Var2.k(vx1Var13.g(aVar113));
                            bw9 bw9VarK11118 = j86Var2.k(vx1Var13.g(aVar114));
                            bw9 bw9VarK11119 = j86Var2.k(vx1Var13.g(aVar115));
                            q30 q30VarL19 = j86Var2.l();
                            double d9 = radians5;
                            double dSin5 = Math.sin(d9);
                            double d10 = iD5;
                            q30VarL19.d.k(bw9VarK11117, 0.5f);
                            q30VarL19.d.k(bw9VarK11119, 0.5f);
                            q30VarL19.d.k(bw9VarK11113, -0.5f);
                            q30VarL19.d.k(bw9VarK11115, -0.5f);
                            q30VarL19.b = -((float) (dSin5 * d10));
                            j86Var2.c(q30VarL19);
                            q30 q30VarL110 = j86Var2.l();
                            float fCos5 = (float) (Math.cos(d9) * d10);
                            q30VarL110.d.k(bw9VarK11116, 0.5f);
                            q30VarL110.d.k(bw9VarK11118, 0.5f);
                            q30VarL110.d.k(bw9VarK11112, -0.5f);
                            q30VarL110.d.k(bw9VarK11114, -0.5f);
                            q30VarL110.b = -fCos5;
                            j86Var2.c(q30VarL110);
                        }
                        this.k = false;
                        this.l = false;
                    }
                    i17 = -1;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (aVarArr[0] == aVar4) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    sx1Var2 = this.Q;
                    boolean z116 = !sx1Var2.f();
                    boolean z117 = zArr[0];
                    boolean z118 = zArr[1];
                    i18 = this.o;
                    int[] iArr6 = this.C;
                    if (i18 == 2) {
                        z11 = z4;
                        z10 = z116;
                        r110 = r19;
                        r20 = r12;
                    } else {
                        z11 = z4;
                        z10 = z116;
                        r110 = r19;
                        r20 = r12;
                    }
                    if (z) {
                        bw9Var3 = r34;
                        bw9Var4 = bw9Var;
                        bw9Var5 = bw9Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        bw9Var3 = r34;
                        bw9Var4 = bw9Var;
                        bw9Var5 = bw9Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.p == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        i24 = this.A;
                        f2 = this.B;
                        if (i24 == 1) {
                            q30 q30VarL111 = j86Var2.l();
                            q30VarL111.d.k(bw9Var4, -1.0f);
                            q30VarL111.d.k(bw9Var3, 1.0f);
                            q30VarL111.d.k(bw9VarK2, f2);
                            q30VarL111.d.k(bw9VarK, -f2);
                            j86Var2.c(q30VarL111);
                        } else {
                            q30 q30VarL112 = j86Var2.l();
                            q30VarL112.d.k(bw9VarK2, -1.0f);
                            q30VarL112.d.k(bw9VarK, 1.0f);
                            q30VarL112.d.k(bw9Var4, f2);
                            q30VarL112.d.k(bw9Var3, -f2);
                            j86Var2.c(q30VarL112);
                        }
                    }
                    if (sx1Var2.f()) {
                        sx1 sx1Var14 = sx1Var2;
                        vx1 vx1Var14 = sx1Var14.f.d;
                        float radians6 = (float) Math.toRadians(this.D + 90.0f);
                        int iD6 = sx1Var14.d();
                        sx1.a aVar116 = sx1.a.t;
                        bw9 bw9VarK111110 = j86Var2.k(g(aVar116));
                        sx1.a aVar117 = sx1.a.u;
                        bw9 bw9VarK111111 = j86Var2.k(g(aVar117));
                        sx1.a aVar118 = sx1.a.v;
                        bw9 bw9VarK111112 = j86Var2.k(g(aVar118));
                        sx1.a aVar119 = sx1.a.w;
                        bw9 bw9VarK111113 = j86Var2.k(g(aVar119));
                        bw9 bw9VarK111114 = j86Var2.k(vx1Var14.g(aVar116));
                        bw9 bw9VarK111115 = j86Var2.k(vx1Var14.g(aVar117));
                        bw9 bw9VarK111116 = j86Var2.k(vx1Var14.g(aVar118));
                        bw9 bw9VarK111117 = j86Var2.k(vx1Var14.g(aVar119));
                        q30 q30VarL113 = j86Var2.l();
                        double d11 = radians6;
                        double dSin6 = Math.sin(d11);
                        double d12 = iD6;
                        q30VarL113.d.k(bw9VarK111115, 0.5f);
                        q30VarL113.d.k(bw9VarK111117, 0.5f);
                        q30VarL113.d.k(bw9VarK111111, -0.5f);
                        q30VarL113.d.k(bw9VarK111113, -0.5f);
                        q30VarL113.b = -((float) (dSin6 * d12));
                        j86Var2.c(q30VarL113);
                        q30 q30VarL114 = j86Var2.l();
                        float fCos6 = (float) (Math.cos(d11) * d12);
                        q30VarL114.d.k(bw9VarK111114, 0.5f);
                        q30VarL114.d.k(bw9VarK111116, 0.5f);
                        q30VarL114.d.k(bw9VarK111110, -0.5f);
                        q30VarL114.d.k(bw9VarK111112, -0.5f);
                        q30VarL114.b = -fCos6;
                        j86Var2.c(q30VarL114);
                    }
                    this.k = false;
                    this.l = false;
                }
                z7 = false;
                int[] iArr7 = this.t;
                iArr7[0] = i15;
                iArr7[1] = i16;
                if (z7) {
                    int i311 = this.A;
                    i17 = -1;
                    if (i311 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (aVarArr[0] == aVar4) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    sx1Var2 = this.Q;
                    boolean z119 = !sx1Var2.f();
                    boolean z1110 = zArr[0];
                    boolean z1111 = zArr[1];
                    i18 = this.o;
                    int[] iArr8 = this.C;
                    if (i18 == 2) {
                        z11 = z4;
                        z10 = z119;
                        r110 = r19;
                        r20 = r12;
                    } else {
                        z11 = z4;
                        z10 = z119;
                        r110 = r19;
                        r20 = r12;
                    }
                    if (z) {
                        bw9Var3 = r34;
                        bw9Var4 = bw9Var;
                        bw9Var5 = bw9Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        bw9Var3 = r34;
                        bw9Var4 = bw9Var;
                        bw9Var5 = bw9Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.p == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        i24 = this.A;
                        f2 = this.B;
                        if (i24 == 1) {
                            q30 q30VarL115 = j86Var2.l();
                            q30VarL115.d.k(bw9Var4, -1.0f);
                            q30VarL115.d.k(bw9Var3, 1.0f);
                            q30VarL115.d.k(bw9VarK2, f2);
                            q30VarL115.d.k(bw9VarK, -f2);
                            j86Var2.c(q30VarL115);
                        } else {
                            q30 q30VarL116 = j86Var2.l();
                            q30VarL116.d.k(bw9VarK2, -1.0f);
                            q30VarL116.d.k(bw9VarK, 1.0f);
                            q30VarL116.d.k(bw9Var4, f2);
                            q30VarL116.d.k(bw9Var3, -f2);
                            j86Var2.c(q30VarL116);
                        }
                    }
                    if (sx1Var2.f()) {
                        sx1 sx1Var15 = sx1Var2;
                        vx1 vx1Var15 = sx1Var15.f.d;
                        float radians7 = (float) Math.toRadians(this.D + 90.0f);
                        int iD7 = sx1Var15.d();
                        sx1.a aVar1110 = sx1.a.t;
                        bw9 bw9VarK111118 = j86Var2.k(g(aVar1110));
                        sx1.a aVar1111 = sx1.a.u;
                        bw9 bw9VarK111119 = j86Var2.k(g(aVar1111));
                        sx1.a aVar1112 = sx1.a.v;
                        bw9 bw9VarK1111110 = j86Var2.k(g(aVar1112));
                        sx1.a aVar1113 = sx1.a.w;
                        bw9 bw9VarK1111111 = j86Var2.k(g(aVar1113));
                        bw9 bw9VarK1111112 = j86Var2.k(vx1Var15.g(aVar1110));
                        bw9 bw9VarK1111113 = j86Var2.k(vx1Var15.g(aVar1111));
                        bw9 bw9VarK1111114 = j86Var2.k(vx1Var15.g(aVar1112));
                        bw9 bw9VarK1111115 = j86Var2.k(vx1Var15.g(aVar1113));
                        q30 q30VarL117 = j86Var2.l();
                        double d13 = radians7;
                        double dSin7 = Math.sin(d13);
                        double d14 = iD7;
                        q30VarL117.d.k(bw9VarK1111113, 0.5f);
                        q30VarL117.d.k(bw9VarK1111115, 0.5f);
                        q30VarL117.d.k(bw9VarK111119, -0.5f);
                        q30VarL117.d.k(bw9VarK1111111, -0.5f);
                        q30VarL117.b = -((float) (dSin7 * d14));
                        j86Var2.c(q30VarL117);
                        q30 q30VarL118 = j86Var2.l();
                        float fCos7 = (float) (Math.cos(d13) * d14);
                        q30VarL118.d.k(bw9VarK1111112, 0.5f);
                        q30VarL118.d.k(bw9VarK1111114, 0.5f);
                        q30VarL118.d.k(bw9VarK111118, -0.5f);
                        q30VarL118.d.k(bw9VarK1111110, -0.5f);
                        q30VarL118.b = -fCos7;
                        j86Var2.c(q30VarL118);
                    }
                    this.k = false;
                    this.l = false;
                }
                i17 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (aVarArr[0] == aVar4) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                sx1Var2 = this.Q;
                boolean z1112 = !sx1Var2.f();
                boolean z1113 = zArr[0];
                boolean z1114 = zArr[1];
                i18 = this.o;
                int[] iArr9 = this.C;
                if (i18 == 2) {
                    z11 = z4;
                    z10 = z1112;
                    r110 = r19;
                    r20 = r12;
                } else {
                    z11 = z4;
                    z10 = z1112;
                    r110 = r19;
                    r20 = r12;
                }
                if (z) {
                    bw9Var3 = r34;
                    bw9Var4 = bw9Var;
                    bw9Var5 = bw9Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    bw9Var3 = r34;
                    bw9Var4 = bw9Var;
                    bw9Var5 = bw9Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.p == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        q30 q30VarL119 = j86Var2.l();
                        q30VarL119.d.k(bw9Var4, -1.0f);
                        q30VarL119.d.k(bw9Var3, 1.0f);
                        q30VarL119.d.k(bw9VarK2, f2);
                        q30VarL119.d.k(bw9VarK, -f2);
                        j86Var2.c(q30VarL119);
                    } else {
                        q30 q30VarL1110 = j86Var2.l();
                        q30VarL1110.d.k(bw9VarK2, -1.0f);
                        q30VarL1110.d.k(bw9VarK, 1.0f);
                        q30VarL1110.d.k(bw9Var4, f2);
                        q30VarL1110.d.k(bw9Var3, -f2);
                        j86Var2.c(q30VarL1110);
                    }
                }
                if (sx1Var2.f()) {
                    sx1 sx1Var16 = sx1Var2;
                    vx1 vx1Var16 = sx1Var16.f.d;
                    float radians8 = (float) Math.toRadians(this.D + 90.0f);
                    int iD8 = sx1Var16.d();
                    sx1.a aVar1114 = sx1.a.t;
                    bw9 bw9VarK1111116 = j86Var2.k(g(aVar1114));
                    sx1.a aVar1115 = sx1.a.u;
                    bw9 bw9VarK1111117 = j86Var2.k(g(aVar1115));
                    sx1.a aVar1116 = sx1.a.v;
                    bw9 bw9VarK1111118 = j86Var2.k(g(aVar1116));
                    sx1.a aVar1117 = sx1.a.w;
                    bw9 bw9VarK1111119 = j86Var2.k(g(aVar1117));
                    bw9 bw9VarK11111110 = j86Var2.k(vx1Var16.g(aVar1114));
                    bw9 bw9VarK11111111 = j86Var2.k(vx1Var16.g(aVar1115));
                    bw9 bw9VarK11111112 = j86Var2.k(vx1Var16.g(aVar1116));
                    bw9 bw9VarK11111113 = j86Var2.k(vx1Var16.g(aVar1117));
                    q30 q30VarL1111 = j86Var2.l();
                    double d15 = radians8;
                    double dSin8 = Math.sin(d15);
                    double d16 = iD8;
                    q30VarL1111.d.k(bw9VarK11111111, 0.5f);
                    q30VarL1111.d.k(bw9VarK11111113, 0.5f);
                    q30VarL1111.d.k(bw9VarK1111117, -0.5f);
                    q30VarL1111.d.k(bw9VarK1111119, -0.5f);
                    q30VarL1111.b = -((float) (dSin8 * d16));
                    j86Var2.c(q30VarL1111);
                    q30 q30VarL1112 = j86Var2.l();
                    float fCos8 = (float) (Math.cos(d15) * d16);
                    q30VarL1112.d.k(bw9VarK11111110, 0.5f);
                    q30VarL1112.d.k(bw9VarK11111112, 0.5f);
                    q30VarL1112.d.k(bw9VarK1111116, -0.5f);
                    q30VarL1112.d.k(bw9VarK1111118, -0.5f);
                    q30VarL1112.b = -fCos8;
                    j86Var2.c(q30VarL1112);
                }
                this.k = false;
                this.l = false;
            }
            bw9Var = bw9VarK4;
            bw9Var2 = bw9VarK5;
            i15 = i13;
            i16 = i14;
            z7 = false;
            int[] iArr10 = this.t;
            iArr10[0] = i15;
            iArr10[1] = i16;
            if (z7) {
                int i312 = this.A;
                i17 = -1;
                if (i312 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (aVarArr[0] == aVar4) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                sx1Var2 = this.Q;
                boolean z1115 = !sx1Var2.f();
                boolean z1116 = zArr[0];
                boolean z1117 = zArr[1];
                i18 = this.o;
                int[] iArr11 = this.C;
                if (i18 == 2) {
                    z11 = z4;
                    z10 = z1115;
                    r110 = r19;
                    r20 = r12;
                } else {
                    z11 = z4;
                    z10 = z1115;
                    r110 = r19;
                    r20 = r12;
                }
                if (z) {
                    bw9Var3 = r34;
                    bw9Var4 = bw9Var;
                    bw9Var5 = bw9Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    bw9Var3 = r34;
                    bw9Var4 = bw9Var;
                    bw9Var5 = bw9Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.p == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        q30 q30VarL1113 = j86Var2.l();
                        q30VarL1113.d.k(bw9Var4, -1.0f);
                        q30VarL1113.d.k(bw9Var3, 1.0f);
                        q30VarL1113.d.k(bw9VarK2, f2);
                        q30VarL1113.d.k(bw9VarK, -f2);
                        j86Var2.c(q30VarL1113);
                    } else {
                        q30 q30VarL1114 = j86Var2.l();
                        q30VarL1114.d.k(bw9VarK2, -1.0f);
                        q30VarL1114.d.k(bw9VarK, 1.0f);
                        q30VarL1114.d.k(bw9Var4, f2);
                        q30VarL1114.d.k(bw9Var3, -f2);
                        j86Var2.c(q30VarL1114);
                    }
                }
                if (sx1Var2.f()) {
                    sx1 sx1Var17 = sx1Var2;
                    vx1 vx1Var17 = sx1Var17.f.d;
                    float radians9 = (float) Math.toRadians(this.D + 90.0f);
                    int iD9 = sx1Var17.d();
                    sx1.a aVar1118 = sx1.a.t;
                    bw9 bw9VarK11111114 = j86Var2.k(g(aVar1118));
                    sx1.a aVar1119 = sx1.a.u;
                    bw9 bw9VarK11111115 = j86Var2.k(g(aVar1119));
                    sx1.a aVar11110 = sx1.a.v;
                    bw9 bw9VarK11111116 = j86Var2.k(g(aVar11110));
                    sx1.a aVar11111 = sx1.a.w;
                    bw9 bw9VarK11111117 = j86Var2.k(g(aVar11111));
                    bw9 bw9VarK11111118 = j86Var2.k(vx1Var17.g(aVar1118));
                    bw9 bw9VarK11111119 = j86Var2.k(vx1Var17.g(aVar1119));
                    bw9 bw9VarK111111110 = j86Var2.k(vx1Var17.g(aVar11110));
                    bw9 bw9VarK111111111 = j86Var2.k(vx1Var17.g(aVar11111));
                    q30 q30VarL1115 = j86Var2.l();
                    double d17 = radians9;
                    double dSin9 = Math.sin(d17);
                    double d18 = iD9;
                    q30VarL1115.d.k(bw9VarK11111119, 0.5f);
                    q30VarL1115.d.k(bw9VarK111111111, 0.5f);
                    q30VarL1115.d.k(bw9VarK11111115, -0.5f);
                    q30VarL1115.d.k(bw9VarK11111117, -0.5f);
                    q30VarL1115.b = -((float) (dSin9 * d18));
                    j86Var2.c(q30VarL1115);
                    q30 q30VarL1116 = j86Var2.l();
                    float fCos9 = (float) (Math.cos(d17) * d18);
                    q30VarL1116.d.k(bw9VarK11111118, 0.5f);
                    q30VarL1116.d.k(bw9VarK111111110, 0.5f);
                    q30VarL1116.d.k(bw9VarK11111114, -0.5f);
                    q30VarL1116.d.k(bw9VarK11111116, -0.5f);
                    q30VarL1116.b = -fCos9;
                    j86Var2.c(q30VarL1116);
                }
                this.k = false;
                this.l = false;
            }
            i17 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (aVarArr[0] == aVar4) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            sx1Var2 = this.Q;
            boolean z1118 = !sx1Var2.f();
            boolean z1119 = zArr[0];
            boolean z11110 = zArr[1];
            i18 = this.o;
            int[] iArr12 = this.C;
            if (i18 == 2) {
                z11 = z4;
                z10 = z1118;
                r110 = r19;
                r20 = r12;
            } else {
                z11 = z4;
                z10 = z1118;
                r110 = r19;
                r20 = r12;
            }
            if (z) {
                bw9Var3 = r34;
                bw9Var4 = bw9Var;
                bw9Var5 = bw9Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                bw9Var3 = r34;
                bw9Var4 = bw9Var;
                bw9Var5 = bw9Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.p == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    q30 q30VarL1117 = j86Var2.l();
                    q30VarL1117.d.k(bw9Var4, -1.0f);
                    q30VarL1117.d.k(bw9Var3, 1.0f);
                    q30VarL1117.d.k(bw9VarK2, f2);
                    q30VarL1117.d.k(bw9VarK, -f2);
                    j86Var2.c(q30VarL1117);
                } else {
                    q30 q30VarL1118 = j86Var2.l();
                    q30VarL1118.d.k(bw9VarK2, -1.0f);
                    q30VarL1118.d.k(bw9VarK, 1.0f);
                    q30VarL1118.d.k(bw9Var4, f2);
                    q30VarL1118.d.k(bw9Var3, -f2);
                    j86Var2.c(q30VarL1118);
                }
            }
            if (sx1Var2.f()) {
                sx1 sx1Var18 = sx1Var2;
                vx1 vx1Var18 = sx1Var18.f.d;
                float radians10 = (float) Math.toRadians(this.D + 90.0f);
                int iD10 = sx1Var18.d();
                sx1.a aVar11112 = sx1.a.t;
                bw9 bw9VarK111111112 = j86Var2.k(g(aVar11112));
                sx1.a aVar11113 = sx1.a.u;
                bw9 bw9VarK111111113 = j86Var2.k(g(aVar11113));
                sx1.a aVar11114 = sx1.a.v;
                bw9 bw9VarK111111114 = j86Var2.k(g(aVar11114));
                sx1.a aVar11115 = sx1.a.w;
                bw9 bw9VarK111111115 = j86Var2.k(g(aVar11115));
                bw9 bw9VarK111111116 = j86Var2.k(vx1Var18.g(aVar11112));
                bw9 bw9VarK111111117 = j86Var2.k(vx1Var18.g(aVar11113));
                bw9 bw9VarK111111118 = j86Var2.k(vx1Var18.g(aVar11114));
                bw9 bw9VarK111111119 = j86Var2.k(vx1Var18.g(aVar11115));
                q30 q30VarL1119 = j86Var2.l();
                double d19 = radians10;
                double dSin10 = Math.sin(d19);
                double d110 = iD10;
                q30VarL1119.d.k(bw9VarK111111117, 0.5f);
                q30VarL1119.d.k(bw9VarK111111119, 0.5f);
                q30VarL1119.d.k(bw9VarK111111113, -0.5f);
                q30VarL1119.d.k(bw9VarK111111115, -0.5f);
                q30VarL1119.b = -((float) (dSin10 * d110));
                j86Var2.c(q30VarL1119);
                q30 q30VarL11110 = j86Var2.l();
                float fCos10 = (float) (Math.cos(d19) * d110);
                q30VarL11110.d.k(bw9VarK111111116, 0.5f);
                q30VarL11110.d.k(bw9VarK111111118, 0.5f);
                q30VarL11110.d.k(bw9VarK111111112, -0.5f);
                q30VarL11110.d.k(bw9VarK111111114, -0.5f);
                q30VarL11110.b = -fCos10;
                j86Var2.c(q30VarL11110);
            }
            this.k = false;
            this.l = false;
        }
        i = 1;
        i2 = 0;
        i3 = i2;
        i4 = i3;
        i5 = this.i0;
        r19 = i3;
        zArr = this.T;
        if (i5 == 8) {
            arrayList = this.S;
            size = arrayList.size();
            i6 = i4;
            i28 = i2;
            while (true) {
                if (i28 < size) {
                    if (!zArr[i2]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i313 = size;
                hashSet2 = arrayList.get(i28).a;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i28++;
                size = i313;
            }
        } else {
            i6 = i4;
        }
        z2 = this.k;
        if (z2) {
            if (z2) {
                j86Var2.d(bw9VarK, this.a0);
                j86Var2.d(bw9VarK2, this.a0 + this.W);
                if (i6 != 0) {
                    wx1Var2 = (wx1) vx1Var2;
                    weakReference3 = wx1Var2.I0;
                    if (weakReference3 != null) {
                        wx1Var2.I0 = new WeakReference<>(sx1Var3);
                    } else {
                        wx1Var2.I0 = new WeakReference<>(sx1Var3);
                    }
                    weakReference4 = wx1Var2.K0;
                    if (weakReference4 != null) {
                        wx1Var2.K0 = new WeakReference<>(sx1Var4);
                    } else {
                        wx1Var2.K0 = new WeakReference<>(sx1Var4);
                    }
                }
            }
            if (this.l) {
                j86Var2.d(bw9VarK3, this.b0);
                j86Var2.d(bw9VarK4, this.b0 + this.X);
                hashSet = sx1Var7.a;
                if (hashSet != null) {
                    j86Var2.d(bw9VarK5, this.b0 + this.c0);
                }
                if (r19 != 0) {
                    wx1Var = (wx1) vx1Var;
                    weakReference = wx1Var.H0;
                    if (weakReference != null) {
                        wx1Var.H0 = new WeakReference<>(sx1Var5);
                    } else {
                        wx1Var.H0 = new WeakReference<>(sx1Var5);
                    }
                    weakReference2 = wx1Var.J0;
                    if (weakReference2 != null) {
                        wx1Var.J0 = new WeakReference<>(sx1Var6);
                    } else {
                        wx1Var.J0 = new WeakReference<>(sx1Var6);
                    }
                }
            }
            if (this.k) {
                ?? r14 = i2;
                this.k = r14;
                this.l = r14;
                return;
            }
        } else {
            if (z2) {
                j86Var2.d(bw9VarK, this.a0);
                j86Var2.d(bw9VarK2, this.a0 + this.W);
                if (i6 != 0) {
                    wx1Var2 = (wx1) vx1Var2;
                    weakReference3 = wx1Var2.I0;
                    if (weakReference3 != null) {
                        wx1Var2.I0 = new WeakReference<>(sx1Var3);
                    } else {
                        wx1Var2.I0 = new WeakReference<>(sx1Var3);
                    }
                    weakReference4 = wx1Var2.K0;
                    if (weakReference4 != null) {
                        wx1Var2.K0 = new WeakReference<>(sx1Var4);
                    } else {
                        wx1Var2.K0 = new WeakReference<>(sx1Var4);
                    }
                }
            }
            if (this.l) {
                j86Var2.d(bw9VarK3, this.b0);
                j86Var2.d(bw9VarK4, this.b0 + this.X);
                hashSet = sx1Var7.a;
                if (hashSet != null) {
                    j86Var2.d(bw9VarK5, this.b0 + this.c0);
                }
                if (r19 != 0) {
                    wx1Var = (wx1) vx1Var;
                    weakReference = wx1Var.H0;
                    if (weakReference != null) {
                        wx1Var.H0 = new WeakReference<>(sx1Var5);
                    } else {
                        wx1Var.H0 = new WeakReference<>(sx1Var5);
                    }
                    weakReference2 = wx1Var.J0;
                    if (weakReference2 != null) {
                        wx1Var.J0 = new WeakReference<>(sx1Var6);
                    } else {
                        wx1Var.J0 = new WeakReference<>(sx1Var6);
                    }
                }
            }
            if (this.k) {
                ?? r15 = i2;
                this.k = r15;
                this.l = r15;
                return;
            }
        }
        zArr2 = this.f;
        if (z) {
            sx1Var = sx1Var7;
            zArr3 = zArr2;
        } else {
            sx1Var = sx1Var7;
            zArr3 = zArr2;
        }
        if (this.V != null) {
            if (u(0)) {
                ((wx1) this.V).O(this, 0);
                int i314 = i;
                i27 = i314 == true ? 1 : 0;
                V = i314;
            } else {
                i27 = i;
                V = v();
            }
            if (u(i27)) {
                ((wx1) this.V).O(this, i27);
                zW = true;
            } else {
                zW = w();
            }
            if (V != 0) {
            }
            if (!zW) {
                j86Var2.f(j86Var2.k(this.V.M), bw9VarK4, 0, 1);
            }
            z3 = zW;
            r12 = V;
        } else {
            sx1Var3 = sx1Var3;
            z3 = false;
            r12 = 0;
        }
        i7 = this.W;
        i8 = this.d0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.X;
        z4 = z3;
        i10 = this.e0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        aVarArr = this.U;
        aVar = aVarArr[0];
        aVar2 = a.v;
        if (aVar != aVar2) {
            z5 = true;
        } else {
            z5 = false;
        }
        aVar3 = aVarArr[1];
        if (aVar3 != aVar2) {
            z6 = true;
        } else {
            z6 = false;
        }
        i12 = this.Z;
        this.A = i12;
        f = this.Y;
        this.B = f;
        i13 = this.r;
        i14 = this.s;
        if (f > 0.0f) {
            bw9Var = bw9VarK4;
            if (this.i0 != 8) {
                if (aVar == aVar2) {
                    i15 = i13;
                } else {
                    i15 = i13;
                }
                if (aVar3 == aVar2) {
                    i26 = i14;
                } else {
                    i26 = i14;
                }
                if (aVar != aVar2) {
                    bw9Var2 = bw9VarK5;
                    if (aVar == aVar2) {
                    }
                    if (aVar3 == aVar2) {
                        this.A = 1;
                        if (i12 == -1) {
                            this.B = 1.0f / f;
                        }
                        i11 = (int) (this.B * i7);
                        if (aVar != aVar2) {
                            i16 = 4;
                        }
                    }
                } else {
                    bw9Var2 = bw9VarK5;
                    if (aVar == aVar2) {
                    }
                    if (aVar3 == aVar2) {
                        this.A = 1;
                        if (i12 == -1) {
                            this.B = 1.0f / f;
                        }
                        i11 = (int) (this.B * i7);
                        if (aVar != aVar2) {
                            i16 = 4;
                        }
                    }
                }
                i6 = i6;
                z7 = true;
                i16 = i26;
                int[] iArr13 = this.t;
                iArr13[0] = i15;
                iArr13[1] = i16;
                if (z7) {
                    int i315 = this.A;
                    i17 = -1;
                    if (i315 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (aVarArr[0] == aVar4) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    sx1Var2 = this.Q;
                    boolean z11111 = !sx1Var2.f();
                    boolean z11112 = zArr[0];
                    boolean z11113 = zArr[1];
                    i18 = this.o;
                    int[] iArr14 = this.C;
                    if (i18 == 2) {
                        z11 = z4;
                        z10 = z11111;
                        r110 = r19;
                        r20 = r12;
                    } else {
                        z11 = z4;
                        z10 = z11111;
                        r110 = r19;
                        r20 = r12;
                    }
                    if (z) {
                        bw9Var3 = r34;
                        bw9Var4 = bw9Var;
                        bw9Var5 = bw9Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        bw9Var3 = r34;
                        bw9Var4 = bw9Var;
                        bw9Var5 = bw9Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.p == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        i24 = this.A;
                        f2 = this.B;
                        if (i24 == 1) {
                            q30 q30VarL11111 = j86Var2.l();
                            q30VarL11111.d.k(bw9Var4, -1.0f);
                            q30VarL11111.d.k(bw9Var3, 1.0f);
                            q30VarL11111.d.k(bw9VarK2, f2);
                            q30VarL11111.d.k(bw9VarK, -f2);
                            j86Var2.c(q30VarL11111);
                        } else {
                            q30 q30VarL11112 = j86Var2.l();
                            q30VarL11112.d.k(bw9VarK2, -1.0f);
                            q30VarL11112.d.k(bw9VarK, 1.0f);
                            q30VarL11112.d.k(bw9Var4, f2);
                            q30VarL11112.d.k(bw9Var3, -f2);
                            j86Var2.c(q30VarL11112);
                        }
                    }
                    if (sx1Var2.f()) {
                        sx1 sx1Var19 = sx1Var2;
                        vx1 vx1Var19 = sx1Var19.f.d;
                        float radians11 = (float) Math.toRadians(this.D + 90.0f);
                        int iD11 = sx1Var19.d();
                        sx1.a aVar11116 = sx1.a.t;
                        bw9 bw9VarK1111111110 = j86Var2.k(g(aVar11116));
                        sx1.a aVar11117 = sx1.a.u;
                        bw9 bw9VarK1111111111 = j86Var2.k(g(aVar11117));
                        sx1.a aVar11118 = sx1.a.v;
                        bw9 bw9VarK1111111112 = j86Var2.k(g(aVar11118));
                        sx1.a aVar11119 = sx1.a.w;
                        bw9 bw9VarK1111111113 = j86Var2.k(g(aVar11119));
                        bw9 bw9VarK1111111114 = j86Var2.k(vx1Var19.g(aVar11116));
                        bw9 bw9VarK1111111115 = j86Var2.k(vx1Var19.g(aVar11117));
                        bw9 bw9VarK1111111116 = j86Var2.k(vx1Var19.g(aVar11118));
                        bw9 bw9VarK1111111117 = j86Var2.k(vx1Var19.g(aVar11119));
                        q30 q30VarL11113 = j86Var2.l();
                        double d111 = radians11;
                        double dSin11 = Math.sin(d111);
                        double d112 = iD11;
                        q30VarL11113.d.k(bw9VarK1111111115, 0.5f);
                        q30VarL11113.d.k(bw9VarK1111111117, 0.5f);
                        q30VarL11113.d.k(bw9VarK1111111111, -0.5f);
                        q30VarL11113.d.k(bw9VarK1111111113, -0.5f);
                        q30VarL11113.b = -((float) (dSin11 * d112));
                        j86Var2.c(q30VarL11113);
                        q30 q30VarL11114 = j86Var2.l();
                        float fCos11 = (float) (Math.cos(d111) * d112);
                        q30VarL11114.d.k(bw9VarK1111111114, 0.5f);
                        q30VarL11114.d.k(bw9VarK1111111116, 0.5f);
                        q30VarL11114.d.k(bw9VarK1111111110, -0.5f);
                        q30VarL11114.d.k(bw9VarK1111111112, -0.5f);
                        q30VarL11114.b = -fCos11;
                        j86Var2.c(q30VarL11114);
                    }
                    this.k = false;
                    this.l = false;
                }
                i17 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (aVarArr[0] == aVar4) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                sx1Var2 = this.Q;
                boolean z11114 = !sx1Var2.f();
                boolean z11115 = zArr[0];
                boolean z11116 = zArr[1];
                i18 = this.o;
                int[] iArr15 = this.C;
                if (i18 == 2) {
                    z11 = z4;
                    z10 = z11114;
                    r110 = r19;
                    r20 = r12;
                } else {
                    z11 = z4;
                    z10 = z11114;
                    r110 = r19;
                    r20 = r12;
                }
                if (z) {
                    bw9Var3 = r34;
                    bw9Var4 = bw9Var;
                    bw9Var5 = bw9Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    bw9Var3 = r34;
                    bw9Var4 = bw9Var;
                    bw9Var5 = bw9Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.p == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        q30 q30VarL11115 = j86Var2.l();
                        q30VarL11115.d.k(bw9Var4, -1.0f);
                        q30VarL11115.d.k(bw9Var3, 1.0f);
                        q30VarL11115.d.k(bw9VarK2, f2);
                        q30VarL11115.d.k(bw9VarK, -f2);
                        j86Var2.c(q30VarL11115);
                    } else {
                        q30 q30VarL11116 = j86Var2.l();
                        q30VarL11116.d.k(bw9VarK2, -1.0f);
                        q30VarL11116.d.k(bw9VarK, 1.0f);
                        q30VarL11116.d.k(bw9Var4, f2);
                        q30VarL11116.d.k(bw9Var3, -f2);
                        j86Var2.c(q30VarL11116);
                    }
                }
                if (sx1Var2.f()) {
                    sx1 sx1Var110 = sx1Var2;
                    vx1 vx1Var110 = sx1Var110.f.d;
                    float radians12 = (float) Math.toRadians(this.D + 90.0f);
                    int iD12 = sx1Var110.d();
                    sx1.a aVar111110 = sx1.a.t;
                    bw9 bw9VarK1111111118 = j86Var2.k(g(aVar111110));
                    sx1.a aVar111111 = sx1.a.u;
                    bw9 bw9VarK1111111119 = j86Var2.k(g(aVar111111));
                    sx1.a aVar111112 = sx1.a.v;
                    bw9 bw9VarK11111111110 = j86Var2.k(g(aVar111112));
                    sx1.a aVar111113 = sx1.a.w;
                    bw9 bw9VarK11111111111 = j86Var2.k(g(aVar111113));
                    bw9 bw9VarK11111111112 = j86Var2.k(vx1Var110.g(aVar111110));
                    bw9 bw9VarK11111111113 = j86Var2.k(vx1Var110.g(aVar111111));
                    bw9 bw9VarK11111111114 = j86Var2.k(vx1Var110.g(aVar111112));
                    bw9 bw9VarK11111111115 = j86Var2.k(vx1Var110.g(aVar111113));
                    q30 q30VarL11117 = j86Var2.l();
                    double d113 = radians12;
                    double dSin12 = Math.sin(d113);
                    double d114 = iD12;
                    q30VarL11117.d.k(bw9VarK11111111113, 0.5f);
                    q30VarL11117.d.k(bw9VarK11111111115, 0.5f);
                    q30VarL11117.d.k(bw9VarK1111111119, -0.5f);
                    q30VarL11117.d.k(bw9VarK11111111111, -0.5f);
                    q30VarL11117.b = -((float) (dSin12 * d114));
                    j86Var2.c(q30VarL11117);
                    q30 q30VarL11118 = j86Var2.l();
                    float fCos12 = (float) (Math.cos(d113) * d114);
                    q30VarL11118.d.k(bw9VarK11111111112, 0.5f);
                    q30VarL11118.d.k(bw9VarK11111111114, 0.5f);
                    q30VarL11118.d.k(bw9VarK1111111118, -0.5f);
                    q30VarL11118.d.k(bw9VarK11111111110, -0.5f);
                    q30VarL11118.b = -fCos12;
                    j86Var2.c(q30VarL11118);
                }
                this.k = false;
                this.l = false;
            }
            z7 = false;
            int[] iArr16 = this.t;
            iArr16[0] = i15;
            iArr16[1] = i16;
            if (z7) {
                int i316 = this.A;
                i17 = -1;
                if (i316 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (aVarArr[0] == aVar4) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                sx1Var2 = this.Q;
                boolean z11117 = !sx1Var2.f();
                boolean z11118 = zArr[0];
                boolean z11119 = zArr[1];
                i18 = this.o;
                int[] iArr17 = this.C;
                if (i18 == 2) {
                    z11 = z4;
                    z10 = z11117;
                    r110 = r19;
                    r20 = r12;
                } else {
                    z11 = z4;
                    z10 = z11117;
                    r110 = r19;
                    r20 = r12;
                }
                if (z) {
                    bw9Var3 = r34;
                    bw9Var4 = bw9Var;
                    bw9Var5 = bw9Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    bw9Var3 = r34;
                    bw9Var4 = bw9Var;
                    bw9Var5 = bw9Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.p == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    i24 = this.A;
                    f2 = this.B;
                    if (i24 == 1) {
                        q30 q30VarL11119 = j86Var2.l();
                        q30VarL11119.d.k(bw9Var4, -1.0f);
                        q30VarL11119.d.k(bw9Var3, 1.0f);
                        q30VarL11119.d.k(bw9VarK2, f2);
                        q30VarL11119.d.k(bw9VarK, -f2);
                        j86Var2.c(q30VarL11119);
                    } else {
                        q30 q30VarL111110 = j86Var2.l();
                        q30VarL111110.d.k(bw9VarK2, -1.0f);
                        q30VarL111110.d.k(bw9VarK, 1.0f);
                        q30VarL111110.d.k(bw9Var4, f2);
                        q30VarL111110.d.k(bw9Var3, -f2);
                        j86Var2.c(q30VarL111110);
                    }
                }
                if (sx1Var2.f()) {
                    sx1 sx1Var111 = sx1Var2;
                    vx1 vx1Var111 = sx1Var111.f.d;
                    float radians13 = (float) Math.toRadians(this.D + 90.0f);
                    int iD13 = sx1Var111.d();
                    sx1.a aVar111114 = sx1.a.t;
                    bw9 bw9VarK11111111116 = j86Var2.k(g(aVar111114));
                    sx1.a aVar111115 = sx1.a.u;
                    bw9 bw9VarK11111111117 = j86Var2.k(g(aVar111115));
                    sx1.a aVar111116 = sx1.a.v;
                    bw9 bw9VarK11111111118 = j86Var2.k(g(aVar111116));
                    sx1.a aVar111117 = sx1.a.w;
                    bw9 bw9VarK11111111119 = j86Var2.k(g(aVar111117));
                    bw9 bw9VarK111111111110 = j86Var2.k(vx1Var111.g(aVar111114));
                    bw9 bw9VarK111111111111 = j86Var2.k(vx1Var111.g(aVar111115));
                    bw9 bw9VarK111111111112 = j86Var2.k(vx1Var111.g(aVar111116));
                    bw9 bw9VarK111111111113 = j86Var2.k(vx1Var111.g(aVar111117));
                    q30 q30VarL111111 = j86Var2.l();
                    double d115 = radians13;
                    double dSin13 = Math.sin(d115);
                    double d116 = iD13;
                    q30VarL111111.d.k(bw9VarK111111111111, 0.5f);
                    q30VarL111111.d.k(bw9VarK111111111113, 0.5f);
                    q30VarL111111.d.k(bw9VarK11111111117, -0.5f);
                    q30VarL111111.d.k(bw9VarK11111111119, -0.5f);
                    q30VarL111111.b = -((float) (dSin13 * d116));
                    j86Var2.c(q30VarL111111);
                    q30 q30VarL111112 = j86Var2.l();
                    float fCos13 = (float) (Math.cos(d115) * d116);
                    q30VarL111112.d.k(bw9VarK111111111110, 0.5f);
                    q30VarL111112.d.k(bw9VarK111111111112, 0.5f);
                    q30VarL111112.d.k(bw9VarK11111111116, -0.5f);
                    q30VarL111112.d.k(bw9VarK11111111118, -0.5f);
                    q30VarL111112.b = -fCos13;
                    j86Var2.c(q30VarL111112);
                }
                this.k = false;
                this.l = false;
            }
            i17 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (aVarArr[0] == aVar4) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            sx1Var2 = this.Q;
            boolean z111110 = !sx1Var2.f();
            boolean z111111 = zArr[0];
            boolean z111112 = zArr[1];
            i18 = this.o;
            int[] iArr18 = this.C;
            if (i18 == 2) {
                z11 = z4;
                z10 = z111110;
                r110 = r19;
                r20 = r12;
            } else {
                z11 = z4;
                z10 = z111110;
                r110 = r19;
                r20 = r12;
            }
            if (z) {
                bw9Var3 = r34;
                bw9Var4 = bw9Var;
                bw9Var5 = bw9Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                bw9Var3 = r34;
                bw9Var4 = bw9Var;
                bw9Var5 = bw9Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.p == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    q30 q30VarL111113 = j86Var2.l();
                    q30VarL111113.d.k(bw9Var4, -1.0f);
                    q30VarL111113.d.k(bw9Var3, 1.0f);
                    q30VarL111113.d.k(bw9VarK2, f2);
                    q30VarL111113.d.k(bw9VarK, -f2);
                    j86Var2.c(q30VarL111113);
                } else {
                    q30 q30VarL111114 = j86Var2.l();
                    q30VarL111114.d.k(bw9VarK2, -1.0f);
                    q30VarL111114.d.k(bw9VarK, 1.0f);
                    q30VarL111114.d.k(bw9Var4, f2);
                    q30VarL111114.d.k(bw9Var3, -f2);
                    j86Var2.c(q30VarL111114);
                }
            }
            if (sx1Var2.f()) {
                sx1 sx1Var112 = sx1Var2;
                vx1 vx1Var112 = sx1Var112.f.d;
                float radians14 = (float) Math.toRadians(this.D + 90.0f);
                int iD14 = sx1Var112.d();
                sx1.a aVar111118 = sx1.a.t;
                bw9 bw9VarK111111111114 = j86Var2.k(g(aVar111118));
                sx1.a aVar111119 = sx1.a.u;
                bw9 bw9VarK111111111115 = j86Var2.k(g(aVar111119));
                sx1.a aVar1111110 = sx1.a.v;
                bw9 bw9VarK111111111116 = j86Var2.k(g(aVar1111110));
                sx1.a aVar1111111 = sx1.a.w;
                bw9 bw9VarK111111111117 = j86Var2.k(g(aVar1111111));
                bw9 bw9VarK111111111118 = j86Var2.k(vx1Var112.g(aVar111118));
                bw9 bw9VarK111111111119 = j86Var2.k(vx1Var112.g(aVar111119));
                bw9 bw9VarK1111111111110 = j86Var2.k(vx1Var112.g(aVar1111110));
                bw9 bw9VarK1111111111111 = j86Var2.k(vx1Var112.g(aVar1111111));
                q30 q30VarL111115 = j86Var2.l();
                double d117 = radians14;
                double dSin14 = Math.sin(d117);
                double d118 = iD14;
                q30VarL111115.d.k(bw9VarK111111111119, 0.5f);
                q30VarL111115.d.k(bw9VarK1111111111111, 0.5f);
                q30VarL111115.d.k(bw9VarK111111111115, -0.5f);
                q30VarL111115.d.k(bw9VarK111111111117, -0.5f);
                q30VarL111115.b = -((float) (dSin14 * d118));
                j86Var2.c(q30VarL111115);
                q30 q30VarL111116 = j86Var2.l();
                float fCos14 = (float) (Math.cos(d117) * d118);
                q30VarL111116.d.k(bw9VarK111111111118, 0.5f);
                q30VarL111116.d.k(bw9VarK1111111111110, 0.5f);
                q30VarL111116.d.k(bw9VarK111111111114, -0.5f);
                q30VarL111116.d.k(bw9VarK111111111116, -0.5f);
                q30VarL111116.b = -fCos14;
                j86Var2.c(q30VarL111116);
            }
            this.k = false;
            this.l = false;
        }
        bw9Var = bw9VarK4;
        bw9Var2 = bw9VarK5;
        i15 = i13;
        i16 = i14;
        z7 = false;
        int[] iArr19 = this.t;
        iArr19[0] = i15;
        iArr19[1] = i16;
        if (z7) {
            int i317 = this.A;
            i17 = -1;
            if (i317 != 0) {
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (aVarArr[0] == aVar4) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            sx1Var2 = this.Q;
            boolean z111113 = !sx1Var2.f();
            boolean z111114 = zArr[0];
            boolean z111115 = zArr[1];
            i18 = this.o;
            int[] iArr110 = this.C;
            if (i18 == 2) {
                z11 = z4;
                z10 = z111113;
                r110 = r19;
                r20 = r12;
            } else {
                z11 = z4;
                z10 = z111113;
                r110 = r19;
                r20 = r12;
            }
            if (z) {
                bw9Var3 = r34;
                bw9Var4 = bw9Var;
                bw9Var5 = bw9Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                bw9Var3 = r34;
                bw9Var4 = bw9Var;
                bw9Var5 = bw9Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.p == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                i24 = this.A;
                f2 = this.B;
                if (i24 == 1) {
                    q30 q30VarL111117 = j86Var2.l();
                    q30VarL111117.d.k(bw9Var4, -1.0f);
                    q30VarL111117.d.k(bw9Var3, 1.0f);
                    q30VarL111117.d.k(bw9VarK2, f2);
                    q30VarL111117.d.k(bw9VarK, -f2);
                    j86Var2.c(q30VarL111117);
                } else {
                    q30 q30VarL111118 = j86Var2.l();
                    q30VarL111118.d.k(bw9VarK2, -1.0f);
                    q30VarL111118.d.k(bw9VarK, 1.0f);
                    q30VarL111118.d.k(bw9Var4, f2);
                    q30VarL111118.d.k(bw9Var3, -f2);
                    j86Var2.c(q30VarL111118);
                }
            }
            if (sx1Var2.f()) {
                sx1 sx1Var113 = sx1Var2;
                vx1 vx1Var113 = sx1Var113.f.d;
                float radians15 = (float) Math.toRadians(this.D + 90.0f);
                int iD15 = sx1Var113.d();
                sx1.a aVar1111112 = sx1.a.t;
                bw9 bw9VarK1111111111112 = j86Var2.k(g(aVar1111112));
                sx1.a aVar1111113 = sx1.a.u;
                bw9 bw9VarK1111111111113 = j86Var2.k(g(aVar1111113));
                sx1.a aVar1111114 = sx1.a.v;
                bw9 bw9VarK1111111111114 = j86Var2.k(g(aVar1111114));
                sx1.a aVar1111115 = sx1.a.w;
                bw9 bw9VarK1111111111115 = j86Var2.k(g(aVar1111115));
                bw9 bw9VarK1111111111116 = j86Var2.k(vx1Var113.g(aVar1111112));
                bw9 bw9VarK1111111111117 = j86Var2.k(vx1Var113.g(aVar1111113));
                bw9 bw9VarK1111111111118 = j86Var2.k(vx1Var113.g(aVar1111114));
                bw9 bw9VarK1111111111119 = j86Var2.k(vx1Var113.g(aVar1111115));
                q30 q30VarL111119 = j86Var2.l();
                double d119 = radians15;
                double dSin15 = Math.sin(d119);
                double d1110 = iD15;
                q30VarL111119.d.k(bw9VarK1111111111117, 0.5f);
                q30VarL111119.d.k(bw9VarK1111111111119, 0.5f);
                q30VarL111119.d.k(bw9VarK1111111111113, -0.5f);
                q30VarL111119.d.k(bw9VarK1111111111115, -0.5f);
                q30VarL111119.b = -((float) (dSin15 * d1110));
                j86Var2.c(q30VarL111119);
                q30 q30VarL1111110 = j86Var2.l();
                float fCos15 = (float) (Math.cos(d119) * d1110);
                q30VarL1111110.d.k(bw9VarK1111111111116, 0.5f);
                q30VarL1111110.d.k(bw9VarK1111111111118, 0.5f);
                q30VarL1111110.d.k(bw9VarK1111111111112, -0.5f);
                q30VarL1111110.d.k(bw9VarK1111111111114, -0.5f);
                q30VarL1111110.b = -fCos15;
                j86Var2.c(q30VarL1111110);
            }
            this.k = false;
            this.l = false;
        }
        i17 = -1;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (aVarArr[0] == aVar4) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z9) {
            i8 = 0;
        }
        sx1Var2 = this.Q;
        boolean z111116 = !sx1Var2.f();
        boolean z111117 = zArr[0];
        boolean z111118 = zArr[1];
        i18 = this.o;
        int[] iArr111 = this.C;
        if (i18 == 2) {
            z11 = z4;
            z10 = z111116;
            r110 = r19;
            r20 = r12;
        } else {
            z11 = z4;
            z10 = z111116;
            r110 = r19;
            r20 = r12;
        }
        if (z) {
            bw9Var3 = r34;
            bw9Var4 = bw9Var;
            bw9Var5 = bw9Var2;
            i19 = 0;
            i20 = 8;
            i21 = 1;
            i22 = 1;
        } else {
            bw9Var3 = r34;
            bw9Var4 = bw9Var;
            bw9Var5 = bw9Var2;
            i19 = 0;
            i20 = 8;
            i21 = 1;
            i22 = 1;
        }
        if (this.p == 2) {
            i23 = i19;
        } else {
            i23 = i22;
        }
        if (i23 == 0) {
        }
        if (z7) {
            i24 = this.A;
            f2 = this.B;
            if (i24 == 1) {
                q30 q30VarL1111111 = j86Var2.l();
                q30VarL1111111.d.k(bw9Var4, -1.0f);
                q30VarL1111111.d.k(bw9Var3, 1.0f);
                q30VarL1111111.d.k(bw9VarK2, f2);
                q30VarL1111111.d.k(bw9VarK, -f2);
                j86Var2.c(q30VarL1111111);
            } else {
                q30 q30VarL1111112 = j86Var2.l();
                q30VarL1111112.d.k(bw9VarK2, -1.0f);
                q30VarL1111112.d.k(bw9VarK, 1.0f);
                q30VarL1111112.d.k(bw9Var4, f2);
                q30VarL1111112.d.k(bw9Var3, -f2);
                j86Var2.c(q30VarL1111112);
            }
        }
        if (sx1Var2.f()) {
            sx1 sx1Var114 = sx1Var2;
            vx1 vx1Var114 = sx1Var114.f.d;
            float radians16 = (float) Math.toRadians(this.D + 90.0f);
            int iD16 = sx1Var114.d();
            sx1.a aVar1111116 = sx1.a.t;
            bw9 bw9VarK11111111111110 = j86Var2.k(g(aVar1111116));
            sx1.a aVar1111117 = sx1.a.u;
            bw9 bw9VarK11111111111111 = j86Var2.k(g(aVar1111117));
            sx1.a aVar1111118 = sx1.a.v;
            bw9 bw9VarK11111111111112 = j86Var2.k(g(aVar1111118));
            sx1.a aVar1111119 = sx1.a.w;
            bw9 bw9VarK11111111111113 = j86Var2.k(g(aVar1111119));
            bw9 bw9VarK11111111111114 = j86Var2.k(vx1Var114.g(aVar1111116));
            bw9 bw9VarK11111111111115 = j86Var2.k(vx1Var114.g(aVar1111117));
            bw9 bw9VarK11111111111116 = j86Var2.k(vx1Var114.g(aVar1111118));
            bw9 bw9VarK11111111111117 = j86Var2.k(vx1Var114.g(aVar1111119));
            q30 q30VarL1111113 = j86Var2.l();
            double d1111 = radians16;
            double dSin16 = Math.sin(d1111);
            double d1112 = iD16;
            q30VarL1111113.d.k(bw9VarK11111111111115, 0.5f);
            q30VarL1111113.d.k(bw9VarK11111111111117, 0.5f);
            q30VarL1111113.d.k(bw9VarK11111111111111, -0.5f);
            q30VarL1111113.d.k(bw9VarK11111111111113, -0.5f);
            q30VarL1111113.b = -((float) (dSin16 * d1112));
            j86Var2.c(q30VarL1111113);
            q30 q30VarL1111114 = j86Var2.l();
            float fCos16 = (float) (Math.cos(d1111) * d1112);
            q30VarL1111114.d.k(bw9VarK11111111111114, 0.5f);
            q30VarL1111114.d.k(bw9VarK11111111111116, 0.5f);
            q30VarL1111114.d.k(bw9VarK11111111111110, -0.5f);
            q30VarL1111114.d.k(bw9VarK11111111111112, -0.5f);
            q30VarL1111114.b = -fCos16;
            j86Var2.c(q30VarL1111114);
        }
        this.k = false;
        this.l = false;
    }

    public boolean c() {
        return this.i0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:229:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:231:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:240:0x041a  */
    /* JADX WARN: Code duplicated, block: B:257:0x044d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0453  */
    /* JADX WARN: Code duplicated, block: B:270:0x0468  */
    /* JADX WARN: Code duplicated, block: B:275:0x0472  */
    /* JADX WARN: Code duplicated, block: B:277:0x0476  */
    /* JADX WARN: Code duplicated, block: B:278:0x0478  */
    /* JADX WARN: Code duplicated, block: B:281:0x0480  */
    /* JADX WARN: Code duplicated, block: B:287:0x048e A[PHI: r0
      0x048e: PHI (r0v16 int) = (r0v15 int), (r0v20 int), (r0v20 int), (r0v20 int) binds: [B:280:0x047e, B:282:0x0484, B:283:0x0486, B:285:0x048a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:292:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:294:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:337:0x051e  */
    public final void d(j86 j86Var, boolean z, boolean z2, boolean z3, boolean z4, bw9 bw9Var, bw9 bw9Var2, a aVar, boolean z5, sx1 sx1Var, sx1 sx1Var2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int iMin;
        int i9;
        int i10;
        boolean z12;
        bw9 bw9VarK;
        bw9 bw9VarK2;
        sx1 sx1Var3;
        bw9 bw9Var3;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        vx1 vx1Var;
        boolean z17;
        int iMin2;
        boolean z18;
        int i13;
        int iD;
        int i14;
        int i15;
        HashSet<sx1> hashSet;
        boolean z19;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z20;
        boolean z21;
        int i22;
        j86Var = j86Var;
        int i23 = i7;
        int i24 = i8;
        bw9 bw9VarK3 = j86Var.k(sx1Var);
        bw9 bw9VarK4 = j86Var.k(sx1Var2);
        bw9 bw9VarK5 = j86Var.k(sx1Var.f);
        bw9 bw9VarK6 = j86Var.k(sx1Var2.f);
        boolean zF = sx1Var.f();
        boolean zF2 = sx1Var2.f();
        boolean zF3 = this.Q.f();
        int i25 = zF2 ? (zF ? 1 : 0) + 1 : zF ? 1 : 0;
        if (zF3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i5;
        int iOrdinal = aVar.ordinal();
        boolean z22 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i27 == 4) ? false : true;
        int i28 = this.h;
        if (i28 != -1 && z) {
            this.h = -1;
            i2 = i28;
            z22 = false;
        }
        int i29 = this.i;
        if (i29 == -1 || z) {
            i29 = i2;
        } else {
            this.i = -1;
            z22 = false;
        }
        int i30 = i29;
        if (this.i0 == 8) {
            z22 = false;
            iMin = 0;
        } else {
            iMin = i30;
        }
        if (z11) {
            if (!zF && !zF2 && !zF3) {
                j86Var.d(bw9VarK3, i);
            } else if (zF && !zF2) {
                i9 = 8;
                j86Var.e(bw9VarK3, bw9VarK5, sx1Var.d(), 8);
            }
            i9 = 8;
        } else {
            i9 = 8;
        }
        if (z22 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    j86Var.f(bw9VarK4, bw9VarK3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        j86Var.g(bw9VarK4, bw9VarK3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        j86Var.e(bw9VarK4, bw9VarK3, iMin, 8);
                    } else if (z8) {
                        j86Var.e(bw9VarK4, bw9VarK3, iMin, 5);
                        j86Var.g(bw9VarK4, bw9VarK3, iMin, 8);
                    } else {
                        j86Var.e(bw9VarK4, bw9VarK3, iMin, 5);
                        j86Var.g(bw9VarK4, bw9VarK3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    sx1.a aVar2 = sx1Var.e;
                    sx1.a aVar3 = sx1.a.w;
                    sx1.a aVar4 = sx1.a.u;
                    if (aVar2 == aVar4 || aVar2 == aVar3) {
                        bw9VarK = j86Var.k(this.V.g(aVar4));
                        bw9VarK2 = j86Var.k(this.V.g(aVar3));
                    } else {
                        bw9VarK = j86Var.k(this.V.g(sx1.a.t));
                        bw9VarK2 = j86Var.k(this.V.g(sx1.a.v));
                    }
                    q30 q30VarL = j86Var.l();
                    int i31 = i23;
                    q30VarL.d.k(bw9VarK4, -1.0f);
                    q30VarL.d.k(bw9VarK3, 1.0f);
                    q30VarL.d.k(bw9VarK2, f2);
                    q30VarL.d.k(bw9VarK, -f2);
                    j86Var.c(q30VarL);
                    if (z2) {
                        z22 = false;
                    }
                    z12 = z4;
                    i10 = i31;
                } else {
                    i10 = i23;
                    z12 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                j86Var.e(bw9VarK4, bw9VarK3, iMax, 8);
                z12 = z4;
                i10 = i23;
                z22 = false;
            }
            if (z11 || z8) {
                boolean z23 = z12;
                if (i26 >= 2 && z2 && z23) {
                    j86Var.f(bw9VarK3, bw9Var, 0, 8);
                    sx1 sx1Var4 = this.N;
                    boolean z24 = z || sx1Var4.f == null;
                    if (!z && (sx1Var3 = sx1Var4.f) != null) {
                        vx1 vx1Var2 = sx1Var3.d;
                        if (vx1Var2.Y != 0.0f) {
                            a[] aVarArr = vx1Var2.U;
                            a aVar5 = aVarArr[0];
                            a aVar6 = a.v;
                            if (aVar5 == aVar6 && aVarArr[1] == aVar6) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                        } else {
                            z24 = false;
                        }
                    }
                    if (z24) {
                        j86Var.f(bw9Var2, bw9VarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zF || zF2 || zF3) {
                if (zF && !zF2) {
                    sx1Var2 = sx1Var2;
                    bw9VarK4 = bw9VarK4;
                    z12 = z12;
                    bw9Var3 = bw9VarK6;
                    z17 = z2;
                    i22 = (z2 && (sx1Var.f.d instanceof rj0)) ? 8 : 5;
                } else if (zF || !zF2) {
                    bw9Var3 = bw9VarK6;
                    if (zF && zF2) {
                        vx1 vx1Var3 = sx1Var.f.d;
                        vx1 vx1Var4 = sx1Var2.f.d;
                        z12 = z12;
                        vx1 vx1Var5 = this.V;
                        int i32 = 6;
                        if (z22) {
                            if (i27 == 0) {
                                if (i24 != 0 || i10 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z20 = true;
                                    z21 = false;
                                    z14 = true;
                                } else if (bw9VarK5.y && bw9Var3.y) {
                                    j86Var.e(bw9VarK3, bw9VarK5, sx1Var.d(), 8);
                                    j86Var.e(bw9VarK4, bw9Var3, -sx1Var2.d(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z20 = false;
                                    z21 = true;
                                    z14 = false;
                                }
                                if ((vx1Var3 instanceof rj0) || (vx1Var4 instanceof rj0)) {
                                    i11 = i20;
                                    bw9VarK5 = bw9VarK5;
                                    j86Var = j86Var;
                                    i27 = i27;
                                    bw9VarK3 = bw9VarK3;
                                    bw9VarK4 = bw9VarK4;
                                    i32 = 6;
                                    z15 = z21;
                                    bw9Var2 = bw9Var2;
                                    z13 = z20;
                                    i12 = 4;
                                } else {
                                    i11 = i20;
                                    bw9VarK5 = bw9VarK5;
                                    j86Var = j86Var;
                                    bw9VarK3 = bw9VarK3;
                                    bw9VarK4 = bw9VarK4;
                                    i32 = 6;
                                    z15 = z21;
                                    z13 = z20;
                                    i12 = i21;
                                    i27 = i27;
                                    bw9Var2 = bw9Var2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((vx1Var3 instanceof rj0) || (vx1Var4 instanceof rj0)) {
                                        i11 = 5;
                                    } else {
                                        j86Var = j86Var;
                                        i27 = i27;
                                        bw9VarK3 = bw9VarK3;
                                        bw9VarK4 = bw9VarK4;
                                        bw9VarK5 = bw9VarK5;
                                        i32 = 6;
                                        i11 = 5;
                                        i12 = 5;
                                    }
                                    z13 = true;
                                    z14 = true;
                                    z15 = false;
                                    bw9Var2 = bw9Var2;
                                } else if (i27 == 1) {
                                    i11 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.A == -1) {
                                        if (z9) {
                                            j86Var = j86Var;
                                            bw9Var2 = bw9Var2;
                                            bw9VarK3 = bw9VarK3;
                                            bw9VarK4 = bw9VarK4;
                                            bw9VarK5 = bw9VarK5;
                                            i32 = z2 ? 5 : 4;
                                        } else {
                                            j86Var = j86Var;
                                            bw9Var2 = bw9Var2;
                                            bw9VarK3 = bw9VarK3;
                                            bw9VarK4 = bw9VarK4;
                                            bw9VarK5 = bw9VarK5;
                                            i32 = 8;
                                        }
                                        i11 = 8;
                                    } else {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i12 = i19;
                                            z13 = true;
                                            z14 = true;
                                            z15 = true;
                                        } else {
                                            if (i24 > 0) {
                                                j86Var = j86Var;
                                                bw9Var2 = bw9Var2;
                                                bw9VarK3 = bw9VarK3;
                                                bw9VarK4 = bw9VarK4;
                                                bw9VarK5 = bw9VarK5;
                                                i32 = 6;
                                                i11 = 5;
                                            } else if (i24 != 0 || i10 != 0) {
                                                j86Var = j86Var;
                                                bw9Var2 = bw9Var2;
                                                bw9VarK3 = bw9VarK3;
                                                bw9VarK4 = bw9VarK4;
                                                bw9VarK5 = bw9VarK5;
                                                i32 = 6;
                                                i11 = 5;
                                                i12 = 4;
                                            } else if (z9) {
                                                i18 = (vx1Var3 == vx1Var5 || vx1Var4 == vx1Var5) ? 5 : 4;
                                                i12 = 4;
                                                z13 = true;
                                                z14 = true;
                                                z15 = true;
                                            } else {
                                                j86Var = j86Var;
                                                bw9Var2 = bw9Var2;
                                                bw9VarK3 = bw9VarK3;
                                                bw9VarK4 = bw9VarK4;
                                                bw9VarK5 = bw9VarK5;
                                                i32 = 6;
                                                i11 = 5;
                                                i12 = 8;
                                            }
                                            z13 = true;
                                            z14 = true;
                                            z15 = true;
                                        }
                                        i11 = i18;
                                        j86Var = j86Var;
                                    }
                                    i12 = 5;
                                    z13 = true;
                                    z14 = true;
                                    z15 = true;
                                } else {
                                    i11 = 5;
                                    i12 = 4;
                                    z13 = false;
                                    z14 = false;
                                }
                                i12 = 4;
                                z13 = true;
                                z14 = true;
                                z15 = false;
                                bw9Var2 = bw9Var2;
                            }
                            if (z14 || bw9VarK5 != bw9Var3 || vx1Var3 == vx1Var5) {
                                z16 = true;
                            } else {
                                z14 = false;
                                z16 = false;
                            }
                            if (z13) {
                                if (z22 && !z7 && !z9 && bw9VarK5 == bw9Var && bw9Var3 == bw9Var2) {
                                    i17 = 8;
                                    z17 = false;
                                    i16 = 8;
                                    z19 = false;
                                } else {
                                    z17 = z2;
                                    z19 = z16;
                                    i16 = i11;
                                    i17 = i32;
                                }
                                bw9 bw9Var4 = bw9VarK5;
                                vx1Var = vx1Var4;
                                j86Var.b(bw9VarK3, bw9Var4, sx1Var.d(), f, bw9Var3, bw9VarK4, sx1Var2.d(), i17);
                                bw9VarK5 = bw9Var4;
                                i11 = i16;
                                z16 = z19;
                            } else {
                                vx1Var = vx1Var4;
                                z17 = z2;
                            }
                            if (this.i0 != 8 && ((hashSet = sx1Var2.a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z14) {
                                if (z17 && bw9VarK5 != bw9Var3 && !z22 && ((vx1Var3 instanceof rj0) || (vx1Var instanceof rj0))) {
                                    i11 = 6;
                                }
                                j86Var.f(bw9VarK3, bw9VarK5, sx1Var.d(), i11);
                                j86Var.g(bw9VarK4, bw9Var3, -sx1Var2.d(), i11);
                            }
                            if (z17 || !z10 || (vx1Var3 instanceof rj0) || (vx1Var instanceof rj0) || vx1Var == vx1Var5) {
                                iMin2 = i12;
                                z18 = z16;
                            } else {
                                iMin2 = 6;
                                i11 = 6;
                                z18 = true;
                            }
                            if (z18) {
                                if (z15 && (!z9 || z3)) {
                                    if (vx1Var3 != vx1Var5 && vx1Var != vx1Var5) {
                                        i32 = iMin2;
                                    }
                                    if ((vx1Var3 instanceof vp4) || (vx1Var instanceof vp4)) {
                                        i32 = 5;
                                    }
                                    if ((vx1Var3 instanceof rj0) || (vx1Var instanceof rj0)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i15 = 5;
                                    } else {
                                        i15 = i32;
                                    }
                                    iMin2 = Math.max(i15, iMin2);
                                }
                                if (z17) {
                                    iMin2 = Math.min(i11, iMin2);
                                    if (z6 || z9 || !(vx1Var3 == vx1Var5 || vx1Var == vx1Var5)) {
                                        i14 = iMin2;
                                    } else {
                                        i14 = 4;
                                    }
                                } else {
                                    i14 = iMin2;
                                }
                                j86Var.e(bw9VarK3, bw9VarK5, sx1Var.d(), i14);
                                j86Var.e(bw9VarK4, bw9Var3, -sx1Var2.d(), i14);
                            }
                            if (z17) {
                                if (bw9Var == bw9VarK5) {
                                    iD = sx1Var.d();
                                } else {
                                    iD = 0;
                                }
                                if (bw9VarK5 != bw9Var) {
                                    j86Var.f(bw9VarK3, bw9Var, iD, 5);
                                }
                            }
                            if (z17 || !z22 || i3 != 0 || i10 != 0) {
                                i13 = 5;
                            } else if (z22 && i27 == 3) {
                                j86Var.f(bw9VarK4, bw9VarK3, 0, 8);
                                i13 = 5;
                            } else {
                                i13 = 5;
                                j86Var.f(bw9VarK4, bw9VarK3, 0, 5);
                            }
                        } else {
                            if (bw9VarK5.y && bw9Var3.y) {
                                j86Var.b(bw9VarK3, bw9VarK5, sx1Var.d(), f, bw9Var3, bw9VarK4, sx1Var2.d(), 8);
                                if (z2 && z12) {
                                    int iD2 = sx1Var2.f != null ? sx1Var2.d() : 0;
                                    if (bw9Var3 != bw9Var2) {
                                        j86Var.f(bw9Var2, bw9VarK4, iD2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i11 = 5;
                            i12 = 4;
                            z13 = true;
                            z14 = true;
                        }
                        z15 = false;
                        if (z14) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (z13) {
                            if (z22) {
                                z17 = z2;
                                z19 = z16;
                                i16 = i11;
                                i17 = i32;
                            } else {
                                z17 = z2;
                                z19 = z16;
                                i16 = i11;
                                i17 = i32;
                            }
                            bw9 bw9Var5 = bw9VarK5;
                            vx1Var = vx1Var4;
                            j86Var.b(bw9VarK3, bw9Var5, sx1Var.d(), f, bw9Var3, bw9VarK4, sx1Var2.d(), i17);
                            bw9VarK5 = bw9Var5;
                            i11 = i16;
                            z16 = z19;
                        } else {
                            vx1Var = vx1Var4;
                            z17 = z2;
                        }
                        if (this.i0 != 8) {
                        }
                        if (z14) {
                            if (z17) {
                                i11 = 6;
                            }
                            j86Var.f(bw9VarK3, bw9VarK5, sx1Var.d(), i11);
                            j86Var.g(bw9VarK4, bw9Var3, -sx1Var2.d(), i11);
                        }
                        if (z17) {
                            iMin2 = i12;
                            z18 = z16;
                        } else {
                            iMin2 = i12;
                            z18 = z16;
                        }
                        if (z18) {
                            if (z15) {
                                if (vx1Var3 != vx1Var5) {
                                    i32 = iMin2;
                                }
                                if (vx1Var3 instanceof vp4) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (vx1Var3 instanceof rj0) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i15 = 5;
                                } else {
                                    i15 = i32;
                                }
                                iMin2 = Math.max(i15, iMin2);
                            }
                            if (z17) {
                                iMin2 = Math.min(i11, iMin2);
                                if (z6) {
                                    i14 = iMin2;
                                } else {
                                    i14 = iMin2;
                                }
                            } else {
                                i14 = iMin2;
                            }
                            j86Var.e(bw9VarK3, bw9VarK5, sx1Var.d(), i14);
                            j86Var.e(bw9VarK4, bw9Var3, -sx1Var2.d(), i14);
                        }
                        if (z17) {
                            if (bw9Var == bw9VarK5) {
                                iD = sx1Var.d();
                            } else {
                                iD = 0;
                            }
                            if (bw9VarK5 != bw9Var) {
                                j86Var.f(bw9VarK3, bw9Var, iD, 5);
                            }
                        }
                        if (z17) {
                            i13 = 5;
                        } else {
                            i13 = 5;
                        }
                    }
                    i22 = i13;
                } else {
                    bw9Var3 = bw9VarK6;
                    j86Var.e(bw9VarK4, bw9Var3, -sx1Var2.d(), 8);
                    if (z2) {
                        j86Var.f(bw9VarK3, bw9Var, 0, 5);
                        sx1Var2 = sx1Var2;
                        i13 = 5;
                        bw9VarK4 = bw9VarK4;
                        z12 = z12;
                    }
                    z17 = z2;
                    i22 = i13;
                }
                if (z17 || !z12) {
                    return;
                }
                int iD3 = sx1Var2.f != null ? sx1Var2.d() : 0;
                if (bw9Var3 != bw9Var2) {
                    j86Var.f(bw9Var2, bw9VarK4, iD3, i22);
                    return;
                }
                return;
            }
            bw9Var3 = bw9VarK6;
            i13 = 5;
            z17 = z2;
            i22 = i13;
            if (z17) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            j86Var.e(bw9VarK4, bw9VarK3, 0, 3);
            if (i3 > 0) {
                j86Var.f(bw9VarK4, bw9VarK3, i3, i9);
            }
            if (i4 < Integer.MAX_VALUE) {
                j86Var.g(bw9VarK4, bw9VarK3, i4, i9);
            }
        } else {
            j86Var.e(bw9VarK4, bw9VarK3, iMin, i9);
        }
        z12 = z4;
        i10 = i23;
        if (z11) {
        }
        boolean z25 = z12;
        if (i26 >= 2) {
        }
    }

    public final void e(j86 j86Var) {
        j86Var.k(this.J);
        j86Var.k(this.K);
        j86Var.k(this.L);
        j86Var.k(this.M);
        if (this.c0 > 0) {
            j86Var.k(this.N);
        }
    }

    public final void f() {
        if (this.d == null) {
            o15 o15Var = new o15(this);
            o15Var.h.e = fy2.a.w;
            o15Var.i.e = fy2.a.x;
            o15Var.f = 0;
            this.d = o15Var;
        }
        if (this.e == null) {
            meb mebVar = new meb(this);
            fy2 fy2Var = new fy2(mebVar);
            mebVar.k = fy2Var;
            mebVar.l = null;
            mebVar.h.e = fy2.a.y;
            mebVar.i.e = fy2.a.z;
            fy2Var.e = fy2.a.A;
            mebVar.f = 1;
            this.e = mebVar;
        }
    }

    public sx1 g(sx1.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                sx0.a(aVar.name());
                return null;
        }
    }

    public final a h(int i) {
        a[] aVarArr = this.U;
        if (i == 0) {
            return aVarArr[0];
        }
        if (i == 1) {
            return aVarArr[1];
        }
        return null;
    }

    public final int i() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final vx1 j(int i) {
        sx1 sx1Var;
        sx1 sx1Var2;
        if (i != 0) {
            if (i == 1 && (sx1Var2 = (sx1Var = this.M).f) != null && sx1Var2.f == sx1Var) {
                return sx1Var2.d;
            }
            return null;
        }
        sx1 sx1Var3 = this.L;
        sx1 sx1Var4 = sx1Var3.f;
        if (sx1Var4 == null || sx1Var4.f != sx1Var3) {
            return null;
        }
        return sx1Var4.d;
    }

    public final vx1 k(int i) {
        sx1 sx1Var;
        sx1 sx1Var2;
        if (i != 0) {
            if (i == 1 && (sx1Var2 = (sx1Var = this.K).f) != null && sx1Var2.f == sx1Var) {
                return sx1Var2.d;
            }
            return null;
        }
        sx1 sx1Var3 = this.J;
        sx1 sx1Var4 = sx1Var3.f;
        if (sx1Var4 == null || sx1Var4.f != sx1Var3) {
            return null;
        }
        return sx1Var4.d;
    }

    public void l(StringBuilder sb) {
        sb.append("  " + this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.b0);
        sb.append("\n");
        n(sb, BlockAlignment.LEFT, this.J);
        n(sb, VerticalAlignment.TOP, this.K);
        n(sb, BlockAlignment.RIGHT, this.L);
        n(sb, VerticalAlignment.BOTTOM, this.M);
        n(sb, "baseline", this.N);
        n(sb, "centerX", this.O);
        n(sb, "centerY", this.P);
        int i = this.W;
        int i2 = this.d0;
        int[] iArr = this.C;
        int i3 = iArr[0];
        int i4 = this.u;
        int i5 = this.r;
        float f = this.w;
        a[] aVarArr = this.U;
        a aVar = aVarArr[0];
        float[] fArr = this.m0;
        float f2 = fArr[0];
        m(sb, "    width", i, i2, i3, i4, i5, f, aVar);
        int i6 = this.X;
        int i7 = this.e0;
        int i8 = iArr[1];
        int i9 = this.x;
        int i10 = this.s;
        float f3 = this.z;
        a aVar2 = aVarArr[1];
        float f4 = fArr[1];
        m(sb, "    height", i6, i7, i8, i9, i10, f3, aVar2);
        float f5 = this.Y;
        int i11 = this.Z;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append(BuildConfig.FLAVOR);
            sb.append("],\n");
        }
        E(sb, "    horizontalBias", this.f0, 0.5f);
        E(sb, "    verticalBias", this.g0, 0.5f);
        D(this.k0, 0, "    horizontalChainStyle", sb);
        D(this.l0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int o() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int p() {
        vx1 vx1Var = this.V;
        return (vx1Var == null || !(vx1Var instanceof wx1)) ? this.a0 : ((wx1) vx1Var).y0 + this.a0;
    }

    public final int q() {
        vx1 vx1Var = this.V;
        return (vx1Var == null || !(vx1Var instanceof wx1)) ? this.b0 : ((wx1) vx1Var).z0 + this.b0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean r(int i) {
        if (i == 0) {
            if ((this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean s(int i, int i2) {
        sx1 sx1Var;
        sx1 sx1Var2;
        sx1 sx1Var3;
        sx1 sx1Var4;
        if (i == 0) {
            sx1 sx1Var5 = this.J;
            sx1 sx1Var6 = sx1Var5.f;
            if (sx1Var6 == null || !sx1Var6.c || (sx1Var4 = (sx1Var3 = this.L).f) == null || !sx1Var4.c) {
                return false;
            }
            return (sx1Var4.c() - sx1Var3.d()) - (sx1Var5.d() + sx1Var5.f.c()) >= i2;
        }
        sx1 sx1Var7 = this.K;
        sx1 sx1Var8 = sx1Var7.f;
        if (sx1Var8 == null || !sx1Var8.c || (sx1Var2 = (sx1Var = this.M).f) == null || !sx1Var2.c) {
            return false;
        }
        return (sx1Var2.c() - sx1Var.d()) - (sx1Var7.d() + sx1Var7.f.c()) >= i2;
    }

    public final void t(sx1.a aVar, vx1 vx1Var, sx1.a aVar2, int i, int i2) {
        g(aVar).a(vx1Var.g(aVar2), i, i2);
    }

    public String toString() {
        String strA = BuildConfig.FLAVOR;
        StringBuilder sbA = bl2.a(BuildConfig.FLAVOR);
        if (this.j0 != null) {
            strA = av.a(new StringBuilder("id: "), this.j0, " ");
        }
        sbA.append(strA);
        sbA.append("(");
        sbA.append(this.a0);
        sbA.append(", ");
        sbA.append(this.b0);
        sbA.append(") - (");
        sbA.append(this.W);
        sbA.append(" x ");
        return i34.b(this.X, ")", sbA);
    }

    public final boolean u(int i) {
        sx1 sx1Var;
        sx1 sx1Var2;
        int i2 = i * 2;
        sx1[] sx1VarArr = this.R;
        sx1 sx1Var3 = sx1VarArr[i2];
        sx1 sx1Var4 = sx1Var3.f;
        return (sx1Var4 == null || sx1Var4.f == sx1Var3 || (sx1Var2 = (sx1Var = sx1VarArr[i2 + 1]).f) == null || sx1Var2.f != sx1Var) ? false : true;
    }

    public final boolean v() {
        sx1 sx1Var = this.J;
        sx1 sx1Var2 = sx1Var.f;
        if (sx1Var2 != null && sx1Var2.f == sx1Var) {
            return true;
        }
        sx1 sx1Var3 = this.L;
        sx1 sx1Var4 = sx1Var3.f;
        return sx1Var4 != null && sx1Var4.f == sx1Var3;
    }

    public final boolean w() {
        sx1 sx1Var = this.K;
        sx1 sx1Var2 = sx1Var.f;
        if (sx1Var2 != null && sx1Var2.f == sx1Var) {
            return true;
        }
        sx1 sx1Var3 = this.M;
        sx1 sx1Var4 = sx1Var3.f;
        return sx1Var4 != null && sx1Var4.f == sx1Var3;
    }

    public final boolean x() {
        return this.g && this.i0 != 8;
    }

    public boolean y() {
        if (this.k) {
            return true;
        }
        return this.J.c && this.L.c;
    }

    public boolean z() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }
}
