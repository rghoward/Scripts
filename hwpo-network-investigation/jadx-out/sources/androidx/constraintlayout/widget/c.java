package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aa;
import defpackage.ct1;
import defpackage.h4c;
import defpackage.hh8;
import defpackage.py6;
import defpackage.rm9;
import defpackage.ru3;
import defpackage.z93;
import defpackage.z97;
import defpackage.zg8;
import io.ably.lib.transport.Defaults;
import io.ably.lib.util.AgentHeaderCreator;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap<String, androidx.constraintlayout.widget.a> a = new HashMap<>();
    public final boolean b = true;
    public final HashMap<Integer, a> c = new HashMap<>();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public int a;
        public final d b;
        public final C0011c c;
        public final b d;
        public final e e;
        public HashMap<String, androidx.constraintlayout.widget.a> f;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static class C0010a {
            public int[] a;
            public int[] b;
            public int c;
            public int[] d;
            public float[] e;
            public int f;
            public int[] g;
            public String[] h;
            public int i;
            public int[] j;
            public boolean[] k;
            public int l;

            public final void a(float f, int i) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public final void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public final void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        public a() {
            d dVar = new d();
            dVar.a = 0;
            dVar.b = 0;
            dVar.c = 1.0f;
            dVar.d = Float.NaN;
            this.b = dVar;
            C0011c c0011c = new C0011c();
            c0011c.a = -1;
            c0011c.b = 0;
            c0011c.c = -1;
            c0011c.d = Float.NaN;
            c0011c.e = Float.NaN;
            c0011c.f = Float.NaN;
            c0011c.g = -1;
            c0011c.h = null;
            c0011c.i = -1;
            this.c = c0011c;
            b bVar = new b();
            bVar.a = false;
            bVar.d = -1;
            bVar.e = -1;
            bVar.f = -1.0f;
            bVar.g = true;
            bVar.h = -1;
            bVar.i = -1;
            bVar.j = -1;
            bVar.k = -1;
            bVar.l = -1;
            bVar.m = -1;
            bVar.n = -1;
            bVar.o = -1;
            bVar.p = -1;
            bVar.q = -1;
            bVar.r = -1;
            bVar.s = -1;
            bVar.t = -1;
            bVar.u = -1;
            bVar.v = -1;
            bVar.w = 0.5f;
            bVar.x = 0.5f;
            bVar.y = null;
            bVar.z = -1;
            bVar.A = 0;
            bVar.B = 0.0f;
            bVar.C = -1;
            bVar.D = -1;
            bVar.E = -1;
            bVar.F = 0;
            bVar.G = 0;
            bVar.H = 0;
            bVar.I = 0;
            bVar.J = 0;
            bVar.K = 0;
            bVar.L = 0;
            bVar.M = Integer.MIN_VALUE;
            bVar.N = Integer.MIN_VALUE;
            bVar.O = Integer.MIN_VALUE;
            bVar.P = Integer.MIN_VALUE;
            bVar.Q = Integer.MIN_VALUE;
            bVar.R = Integer.MIN_VALUE;
            bVar.S = Integer.MIN_VALUE;
            bVar.T = -1.0f;
            bVar.U = -1.0f;
            bVar.V = 0;
            bVar.W = 0;
            bVar.X = 0;
            bVar.Y = 0;
            bVar.Z = 0;
            bVar.a0 = 0;
            bVar.b0 = 0;
            bVar.c0 = 0;
            bVar.d0 = 1.0f;
            bVar.e0 = 1.0f;
            bVar.f0 = -1;
            bVar.g0 = 0;
            bVar.h0 = -1;
            bVar.l0 = false;
            bVar.m0 = false;
            bVar.n0 = true;
            bVar.o0 = 0;
            this.d = bVar;
            e eVar = new e();
            eVar.a = 0.0f;
            eVar.b = 0.0f;
            eVar.c = 0.0f;
            eVar.d = 1.0f;
            eVar.e = 1.0f;
            eVar.f = Float.NaN;
            eVar.g = Float.NaN;
            eVar.h = -1;
            eVar.i = 0.0f;
            eVar.j = 0.0f;
            eVar.k = 0.0f;
            eVar.l = false;
            eVar.m = 0.0f;
            this.e = eVar;
            this.f = new HashMap<>();
        }

        public final void a(ConstraintLayout.a aVar) {
            b bVar = this.d;
            aVar.e = bVar.h;
            aVar.f = bVar.i;
            aVar.g = bVar.j;
            aVar.h = bVar.k;
            aVar.i = bVar.l;
            aVar.j = bVar.m;
            aVar.k = bVar.n;
            aVar.l = bVar.o;
            aVar.m = bVar.p;
            aVar.n = bVar.q;
            aVar.o = bVar.r;
            aVar.s = bVar.s;
            aVar.t = bVar.t;
            aVar.u = bVar.u;
            aVar.v = bVar.v;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.I;
            aVar.A = bVar.R;
            aVar.B = bVar.Q;
            aVar.x = bVar.N;
            aVar.z = bVar.P;
            aVar.E = bVar.w;
            aVar.F = bVar.x;
            aVar.p = bVar.z;
            aVar.q = bVar.A;
            aVar.r = bVar.B;
            aVar.G = bVar.y;
            aVar.T = bVar.C;
            aVar.U = bVar.D;
            aVar.I = bVar.T;
            aVar.H = bVar.U;
            aVar.K = bVar.W;
            aVar.J = bVar.V;
            aVar.W = bVar.l0;
            aVar.X = bVar.m0;
            aVar.L = bVar.X;
            aVar.M = bVar.Y;
            aVar.P = bVar.Z;
            aVar.Q = bVar.a0;
            aVar.N = bVar.b0;
            aVar.O = bVar.c0;
            aVar.R = bVar.d0;
            aVar.S = bVar.e0;
            aVar.V = bVar.E;
            aVar.c = bVar.f;
            aVar.a = bVar.d;
            aVar.b = bVar.e;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.b;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.c;
            String str = bVar.k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.o0;
            aVar.setMarginStart(bVar.K);
            aVar.setMarginEnd(bVar.J);
            aVar.a();
        }

        public final void b(int i, ConstraintLayout.a aVar) {
            this.a = i;
            int i2 = aVar.e;
            b bVar = this.d;
            bVar.h = i2;
            bVar.i = aVar.f;
            bVar.j = aVar.g;
            bVar.k = aVar.h;
            bVar.l = aVar.i;
            bVar.m = aVar.j;
            bVar.n = aVar.k;
            bVar.o = aVar.l;
            bVar.p = aVar.m;
            bVar.q = aVar.n;
            bVar.r = aVar.o;
            bVar.s = aVar.s;
            bVar.t = aVar.t;
            bVar.u = aVar.u;
            bVar.v = aVar.v;
            bVar.w = aVar.E;
            bVar.x = aVar.F;
            bVar.y = aVar.G;
            bVar.z = aVar.p;
            bVar.A = aVar.q;
            bVar.B = aVar.r;
            bVar.C = aVar.T;
            bVar.D = aVar.U;
            bVar.E = aVar.V;
            bVar.f = aVar.c;
            bVar.d = aVar.a;
            bVar.e = aVar.b;
            bVar.b = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.c = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.F = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.L = aVar.D;
            bVar.T = aVar.I;
            bVar.U = aVar.H;
            bVar.W = aVar.K;
            bVar.V = aVar.J;
            bVar.l0 = aVar.W;
            bVar.m0 = aVar.X;
            bVar.X = aVar.L;
            bVar.Y = aVar.M;
            bVar.Z = aVar.P;
            bVar.a0 = aVar.Q;
            bVar.b0 = aVar.N;
            bVar.c0 = aVar.O;
            bVar.d0 = aVar.R;
            bVar.e0 = aVar.S;
            bVar.k0 = aVar.Y;
            bVar.N = aVar.x;
            bVar.P = aVar.z;
            bVar.M = aVar.w;
            bVar.O = aVar.y;
            bVar.R = aVar.A;
            bVar.Q = aVar.B;
            bVar.S = aVar.C;
            bVar.o0 = aVar.Z;
            bVar.J = aVar.getMarginEnd();
            bVar.K = aVar.getMarginStart();
        }

        public final void c(int i, androidx.constraintlayout.widget.d.a aVar) {
            b(i, aVar);
            this.b.c = aVar.r0;
            float f = aVar.u0;
            e eVar = this.e;
            eVar.a = f;
            eVar.b = aVar.v0;
            eVar.c = aVar.w0;
            eVar.d = aVar.x0;
            eVar.e = aVar.y0;
            eVar.f = aVar.z0;
            eVar.g = aVar.A0;
            eVar.i = aVar.B0;
            eVar.j = aVar.C0;
            eVar.k = aVar.D0;
            eVar.m = aVar.t0;
            eVar.l = aVar.s0;
        }

        public final Object clone() {
            a aVar = new a();
            b bVar = aVar.d;
            bVar.getClass();
            b bVar2 = this.d;
            bVar.a = bVar2.a;
            bVar.b = bVar2.b;
            bVar.c = bVar2.c;
            bVar.d = bVar2.d;
            bVar.e = bVar2.e;
            bVar.f = bVar2.f;
            bVar.g = bVar2.g;
            bVar.h = bVar2.h;
            bVar.i = bVar2.i;
            bVar.j = bVar2.j;
            bVar.k = bVar2.k;
            bVar.l = bVar2.l;
            bVar.m = bVar2.m;
            bVar.n = bVar2.n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            bVar.q = bVar2.q;
            bVar.r = bVar2.r;
            bVar.s = bVar2.s;
            bVar.t = bVar2.t;
            bVar.u = bVar2.u;
            bVar.v = bVar2.v;
            bVar.w = bVar2.w;
            bVar.x = bVar2.x;
            bVar.y = bVar2.y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.a0 = bVar2.a0;
            bVar.b0 = bVar2.b0;
            bVar.c0 = bVar2.c0;
            bVar.d0 = bVar2.d0;
            bVar.e0 = bVar2.e0;
            bVar.f0 = bVar2.f0;
            bVar.g0 = bVar2.g0;
            bVar.h0 = bVar2.h0;
            bVar.k0 = bVar2.k0;
            int[] iArr = bVar2.i0;
            if (iArr == null || bVar2.j0 != null) {
                bVar.i0 = null;
            } else {
                bVar.i0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.j0 = bVar2.j0;
            bVar.l0 = bVar2.l0;
            bVar.m0 = bVar2.m0;
            bVar.n0 = bVar2.n0;
            bVar.o0 = bVar2.o0;
            C0011c c0011c = aVar.c;
            c0011c.getClass();
            C0011c c0011c2 = this.c;
            c0011c2.getClass();
            c0011c.a = c0011c2.a;
            c0011c.c = c0011c2.c;
            c0011c.e = c0011c2.e;
            c0011c.d = c0011c2.d;
            d dVar = this.b;
            int i = dVar.a;
            d dVar2 = aVar.b;
            dVar2.a = i;
            dVar2.c = dVar.c;
            dVar2.d = dVar.d;
            dVar2.b = dVar.b;
            e eVar = aVar.e;
            eVar.getClass();
            e eVar2 = this.e;
            eVar2.getClass();
            eVar.a = eVar2.a;
            eVar.b = eVar2.b;
            eVar.c = eVar2.c;
            eVar.d = eVar2.d;
            eVar.e = eVar2.e;
            eVar.f = eVar2.f;
            eVar.g = eVar2.g;
            eVar.h = eVar2.h;
            eVar.i = eVar2.i;
            eVar.j = eVar2.j;
            eVar.k = eVar2.k;
            eVar.l = eVar2.l;
            eVar.m = eVar2.m;
            aVar.a = this.a;
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static final SparseIntArray p0;
        public int A;
        public float B;
        public int C;
        public int D;
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
        public int P;
        public int Q;
        public int R;
        public int S;
        public float T;
        public float U;
        public int V;
        public int W;
        public int X;
        public int Y;
        public int Z;
        public boolean a;
        public int a0;
        public int b;
        public int b0;
        public int c;
        public int c0;
        public int d;
        public float d0;
        public int e;
        public float e0;
        public float f;
        public int f0;
        public boolean g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int[] i0;
        public int j;
        public String j0;
        public int k;
        public String k0;
        public int l;
        public boolean l0;
        public int m;
        public boolean m0;
        public int n;
        public boolean n0;
        public int o;
        public int o0;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public String y;
        public int z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hh8.g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = p0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.p = c.h(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 2:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.o = c.h(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 4:
                        this.n = c.h(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 5:
                        this.y = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.v = c.h(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 10:
                        this.u = c.h(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case h4c.e /* 15 */:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                        break;
                    case 18:
                        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 19:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                        this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
                        break;
                    case 21:
                        this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 22:
                        this.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.b);
                        break;
                    case 23:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.h = c.h(typedArrayObtainStyledAttributes, index, this.h);
                        break;
                    case 25:
                        this.i = c.h(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                    case 26:
                        this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.j = c.h(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 29:
                        this.k = c.h(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 30:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.s = c.h(typedArrayObtainStyledAttributes, index, this.s);
                        break;
                    case 32:
                        this.t = c.h(typedArrayObtainStyledAttributes, index, this.t);
                        break;
                    case 33:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.m = c.h(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 35:
                        this.l = c.h(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 36:
                        this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 37:
                        this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        c.i(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.i(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.z = c.h(typedArrayObtainStyledAttributes, index, this.z);
                                break;
                            case 62:
                                this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                break;
                            case 63:
                                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f0 = typedArrayObtainStyledAttributes.getInt(index, this.f0);
                                        break;
                                    case 73:
                                        this.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.g0);
                                        break;
                                    case 74:
                                        this.j0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 76:
                                        this.o0 = typedArrayObtainStyledAttributes.getInt(index, this.o0);
                                        break;
                                    case 77:
                                        this.q = c.h(typedArrayObtainStyledAttributes, index, this.q);
                                        break;
                                    case 78:
                                        this.r = c.h(typedArrayObtainStyledAttributes, index, this.r);
                                        break;
                                    case 79:
                                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case Defaults.PORT /* 80 */:
                                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        break;
                                    case 84:
                                        this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case SurveyViewModel.ENTITY_TYPE /* 85 */:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 86:
                                        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 87:
                                        this.l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.l0);
                                        break;
                                    case 88:
                                        this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                        break;
                                    case 89:
                                        this.k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.g = typedArrayObtainStyledAttributes.getBoolean(index, this.g);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class C0011c {
        public static final SparseIntArray j;
        public int a;
        public int b;
        public int c;
        public float d;
        public float e;
        public float f;
        public int g;
        public String h;
        public int i;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hh8.h);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (j.get(index)) {
                    case 1:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            String str = z93.b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.a = c.h(typedArrayObtainStyledAttributes, index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getInteger(index, this.b);
                        break;
                    case 7:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 8:
                        this.g = typedArrayObtainStyledAttributes.getInteger(index, this.g);
                        break;
                    case 9:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.h = string;
                            if (string.indexOf(AgentHeaderCreator.AGENT_DIVIDER) > 0) {
                                this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index, this.i);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d {
        public int a;
        public int b;
        public float c;
        public float d;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hh8.j);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    this.a = i2;
                    this.a = c.d[i2];
                } else if (index == 4) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                } else if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e {
        public static final SparseIntArray n;
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public int h;
        public float i;
        public float j;
        public float k;
        public boolean l;
        public float m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hh8.l);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.a = typedArrayObtainStyledAttributes.getFloat(index, this.a);
                        break;
                    case 2:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 3:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 4:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 5:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 8:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 9:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        this.l = true;
                        this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                        break;
                    case 12:
                        this.h = c.h(typedArrayObtainStyledAttributes, index, this.h);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] e(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Integer num = null;
            try {
                iIntValue = zg8.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap<String, Integer> map = constraintLayout.F;
                    if (map != null && map.containsKey(strTrim)) {
                        num = constraintLayout.F.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static a f(Context context, AttributeSet attributeSet, boolean z) {
        SparseIntArray sparseIntArray;
        int i;
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? hh8.d : hh8.a);
        d dVar = aVar.b;
        e eVar = aVar.e;
        C0011c c0011c = aVar.c;
        b bVar = aVar.d;
        int[] iArr = d;
        String[] strArr = z93.b;
        SparseIntArray sparseIntArray2 = e;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            a.C0010a c0010a = new a.C0010a();
            c0010a.a = new int[10];
            c0010a.b = new int[10];
            c0010a.c = 0;
            c0010a.d = new int[10];
            c0010a.e = new float[10];
            c0010a.f = 0;
            c0010a.g = new int[5];
            c0010a.h = new String[5];
            c0010a.i = 0;
            c0010a.j = new int[4];
            c0010a.k = new boolean[4];
            c0010a.l = 0;
            c0011c.getClass();
            bVar.getClass();
            eVar.getClass();
            int i2 = 0;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = indexCount;
                switch (f.get(index)) {
                    case 2:
                        i = i2;
                        c0010a.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.I));
                        continue;
                        i2 = i + 1;
                        indexCount = i3;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i = i2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray2.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i = i2;
                        c0010a.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i + 1;
                        indexCount = i3;
                        break;
                    case 6:
                        i = i2;
                        c0010a.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.C));
                        break;
                    case 7:
                        i = i2;
                        c0010a.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.D));
                        break;
                    case 8:
                        i = i2;
                        c0010a.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.J));
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        i = i2;
                        c0010a.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.P));
                        break;
                    case 12:
                        i = i2;
                        c0010a.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Q));
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        i = i2;
                        c0010a.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.M));
                        break;
                    case 14:
                        i = i2;
                        c0010a.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.O));
                        break;
                    case h4c.e /* 15 */:
                        i = i2;
                        c0010a.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.R));
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        i = i2;
                        c0010a.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.N));
                        break;
                    case 17:
                        i = i2;
                        c0010a.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.d));
                        break;
                    case 18:
                        i = i2;
                        c0010a.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.e));
                        break;
                    case 19:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f), 19);
                        break;
                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.w), 20);
                        break;
                    case 21:
                        i = i2;
                        c0010a.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.c));
                        break;
                    case 22:
                        i = i2;
                        c0010a.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, dVar.a)]);
                        break;
                    case 23:
                        i = i2;
                        c0010a.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.b));
                        break;
                    case 24:
                        i = i2;
                        c0010a.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.F));
                        break;
                    case 27:
                        i = i2;
                        c0010a.b(27, typedArrayObtainStyledAttributes.getInt(index, bVar.E));
                        break;
                    case 28:
                        i = i2;
                        c0010a.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.G));
                        break;
                    case 31:
                        i = i2;
                        c0010a.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.K));
                        break;
                    case 34:
                        i = i2;
                        c0010a.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.H));
                        break;
                    case 37:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.x), 37);
                        break;
                    case 38:
                        i = i2;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, aVar.a);
                        aVar.a = resourceId;
                        c0010a.b(38, resourceId);
                        break;
                    case 39:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.U), 39);
                        break;
                    case 40:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.T), 40);
                        break;
                    case 41:
                        i = i2;
                        c0010a.b(41, typedArrayObtainStyledAttributes.getInt(index, bVar.V));
                        break;
                    case 42:
                        i = i2;
                        c0010a.b(42, typedArrayObtainStyledAttributes.getInt(index, bVar.W));
                        break;
                    case 43:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, dVar.c), 43);
                        break;
                    case Carousel.ENTITY_TYPE /* 44 */:
                        i = i2;
                        c0010a.d(44, true);
                        c0010a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.m), 44);
                        break;
                    case 45:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.b), 45);
                        break;
                    case 46:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.c), 46);
                        break;
                    case 47:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.d), 47);
                        break;
                    case 48:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.e), 48);
                        break;
                    case 49:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f), 49);
                        break;
                    case 50:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.g), 50);
                        break;
                    case 51:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.i), 51);
                        break;
                    case 52:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.j), 52);
                        break;
                    case 53:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.k), 53);
                        break;
                    case 54:
                        i = i2;
                        c0010a.b(54, typedArrayObtainStyledAttributes.getInt(index, bVar.X));
                        break;
                    case 55:
                        i = i2;
                        c0010a.b(55, typedArrayObtainStyledAttributes.getInt(index, bVar.Y));
                        break;
                    case 56:
                        i = i2;
                        c0010a.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Z));
                        break;
                    case 57:
                        i = i2;
                        c0010a.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.a0));
                        break;
                    case 58:
                        i = i2;
                        c0010a.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.b0));
                        break;
                    case 59:
                        i = i2;
                        c0010a.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.c0));
                        break;
                    case 60:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.a), 60);
                        break;
                    case 62:
                        i = i2;
                        c0010a.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.A));
                        break;
                    case 63:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.B), 63);
                        break;
                    case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                        i = i2;
                        c0010a.b(64, h(typedArrayObtainStyledAttributes, index, c0011c.a));
                        break;
                    case 65:
                        i = i2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            c0010a.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        } else {
                            c0010a.c(65, typedArrayObtainStyledAttributes.getString(index));
                        }
                        break;
                    case 66:
                        i = i2;
                        c0010a.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, c0011c.e), 67);
                        break;
                    case 68:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, dVar.d), 68);
                        break;
                    case 69:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i = i2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = i2;
                        c0010a.b(72, typedArrayObtainStyledAttributes.getInt(index, bVar.f0));
                        break;
                    case 73:
                        i = i2;
                        c0010a.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.g0));
                        break;
                    case 74:
                        i = i2;
                        c0010a.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i = i2;
                        c0010a.d(75, typedArrayObtainStyledAttributes.getBoolean(index, bVar.n0));
                        break;
                    case 76:
                        i = i2;
                        c0010a.b(76, typedArrayObtainStyledAttributes.getInt(index, c0011c.c));
                        break;
                    case 77:
                        i = i2;
                        c0010a.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i = i2;
                        c0010a.b(78, typedArrayObtainStyledAttributes.getInt(index, dVar.b));
                        break;
                    case 79:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, c0011c.d), 79);
                        break;
                    case Defaults.PORT /* 80 */:
                        i = i2;
                        c0010a.d(80, typedArrayObtainStyledAttributes.getBoolean(index, bVar.l0));
                        break;
                    case 81:
                        i = i2;
                        c0010a.d(81, typedArrayObtainStyledAttributes.getBoolean(index, bVar.m0));
                        break;
                    case 82:
                        i = i2;
                        c0010a.b(82, typedArrayObtainStyledAttributes.getInteger(index, c0011c.b));
                        break;
                    case 83:
                        i = i2;
                        c0010a.b(83, h(typedArrayObtainStyledAttributes, index, eVar.h));
                        break;
                    case 84:
                        i = i2;
                        c0010a.b(84, typedArrayObtainStyledAttributes.getInteger(index, c0011c.g));
                        break;
                    case SurveyViewModel.ENTITY_TYPE /* 85 */:
                        i = i2;
                        c0010a.a(typedArrayObtainStyledAttributes.getFloat(index, c0011c.f), 85);
                        break;
                    case 86:
                        i = i2;
                        int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i4 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c0011c.i = resourceId2;
                            c0010a.b(89, resourceId2);
                            if (c0011c.i != -1) {
                                c0010a.b(88, -2);
                            }
                        } else if (i4 != 3) {
                            c0010a.b(88, typedArrayObtainStyledAttributes.getInteger(index, c0011c.i));
                        } else {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0011c.h = string;
                            c0010a.c(90, string);
                            if (c0011c.h.indexOf(AgentHeaderCreator.AGENT_DIVIDER) <= 0) {
                                c0010a.b(88, -1);
                            } else {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c0011c.i = resourceId3;
                                c0010a.b(89, resourceId3);
                                c0010a.b(88, -2);
                            }
                        }
                        break;
                    case 87:
                        i = i2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                        break;
                    case 93:
                        i = i2;
                        c0010a.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.L));
                        break;
                    case 94:
                        i = i2;
                        c0010a.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.S));
                        break;
                    case 95:
                        i = i2;
                        i(c0010a, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i = i2;
                        i(c0010a, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i = i2;
                        c0010a.b(97, typedArrayObtainStyledAttributes.getInt(index, bVar.o0));
                        break;
                    case 98:
                        i = i2;
                        int i5 = py6.W;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            aVar.a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.a);
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                        }
                        break;
                    case io.ably.lib.util.Log.NONE /* 99 */:
                        i = i2;
                        c0010a.d(99, typedArrayObtainStyledAttributes.getBoolean(index, bVar.g));
                        break;
                }
                i2 = i + 1;
                indexCount = i3;
            }
        } else {
            String str = "CURRENTLY UNSUPPORTED";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i6 = 0;
            while (i6 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c0011c.getClass();
                        bVar.getClass();
                        eVar.getClass();
                    }
                }
                switch (sparseIntArray2.get(index2)) {
                    case 1:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.p = h(typedArrayObtainStyledAttributes, index2, bVar.p);
                        break;
                    case 2:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.I);
                        break;
                    case 3:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.o = h(typedArrayObtainStyledAttributes, index2, bVar.o);
                        break;
                    case 4:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.n = h(typedArrayObtainStyledAttributes, index2, bVar.n);
                        break;
                    case 5:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.y = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.C);
                        break;
                    case 7:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.D);
                        break;
                    case 8:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.J);
                        break;
                    case 9:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.v = h(typedArrayObtainStyledAttributes, index2, bVar.v);
                        break;
                    case 10:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.u = h(typedArrayObtainStyledAttributes, index2, bVar.u);
                        break;
                    case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.P);
                        break;
                    case 12:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.Q);
                        break;
                    case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.M);
                        break;
                    case 14:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.O);
                        break;
                    case h4c.e /* 15 */:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.R);
                        break;
                    case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.N);
                        break;
                    case 17:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.d);
                        break;
                    case 18:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.e);
                        break;
                    case 19:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.f = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f);
                        break;
                    case InboxPagingSource.PAGE_SIZE /* 20 */:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.w = typedArrayObtainStyledAttributes.getFloat(index2, bVar.w);
                        break;
                    case 21:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, bVar.c);
                        break;
                    case 22:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        int i7 = typedArrayObtainStyledAttributes.getInt(index2, dVar.a);
                        dVar.a = i7;
                        dVar.a = iArr[i7];
                        break;
                    case 23:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, bVar.b);
                        break;
                    case 24:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.F);
                        break;
                    case 25:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.h = h(typedArrayObtainStyledAttributes, index2, bVar.h);
                        break;
                    case 26:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.i = h(typedArrayObtainStyledAttributes, index2, bVar.i);
                        break;
                    case 27:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.E = typedArrayObtainStyledAttributes.getInt(index2, bVar.E);
                        break;
                    case 28:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.G);
                        break;
                    case 29:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.j = h(typedArrayObtainStyledAttributes, index2, bVar.j);
                        break;
                    case 30:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.k = h(typedArrayObtainStyledAttributes, index2, bVar.k);
                        break;
                    case 31:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.K);
                        break;
                    case 32:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.s = h(typedArrayObtainStyledAttributes, index2, bVar.s);
                        break;
                    case 33:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.t = h(typedArrayObtainStyledAttributes, index2, bVar.t);
                        break;
                    case 34:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.H);
                        break;
                    case 35:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.m = h(typedArrayObtainStyledAttributes, index2, bVar.m);
                        break;
                    case 36:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.l = h(typedArrayObtainStyledAttributes, index2, bVar.l);
                        break;
                    case 37:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.x = typedArrayObtainStyledAttributes.getFloat(index2, bVar.x);
                        break;
                    case 38:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        aVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, aVar.a);
                        break;
                    case 39:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.U = typedArrayObtainStyledAttributes.getFloat(index2, bVar.U);
                        break;
                    case 40:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.T = typedArrayObtainStyledAttributes.getFloat(index2, bVar.T);
                        break;
                    case 41:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.V = typedArrayObtainStyledAttributes.getInt(index2, bVar.V);
                        break;
                    case 42:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.W = typedArrayObtainStyledAttributes.getInt(index2, bVar.W);
                        break;
                    case 43:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        dVar.c = typedArrayObtainStyledAttributes.getFloat(index2, dVar.c);
                        break;
                    case Carousel.ENTITY_TYPE /* 44 */:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.l = true;
                        eVar.m = typedArrayObtainStyledAttributes.getDimension(index2, eVar.m);
                        break;
                    case 45:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.b = typedArrayObtainStyledAttributes.getFloat(index2, eVar.b);
                        break;
                    case 46:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.c = typedArrayObtainStyledAttributes.getFloat(index2, eVar.c);
                        break;
                    case 47:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.d = typedArrayObtainStyledAttributes.getFloat(index2, eVar.d);
                        break;
                    case 48:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.e = typedArrayObtainStyledAttributes.getFloat(index2, eVar.e);
                        break;
                    case 49:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.f = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f);
                        break;
                    case 50:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.g = typedArrayObtainStyledAttributes.getDimension(index2, eVar.g);
                        break;
                    case 51:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.i = typedArrayObtainStyledAttributes.getDimension(index2, eVar.i);
                        break;
                    case 52:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.j = typedArrayObtainStyledAttributes.getDimension(index2, eVar.j);
                        break;
                    case 53:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.k = typedArrayObtainStyledAttributes.getDimension(index2, eVar.k);
                        break;
                    case 54:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.X = typedArrayObtainStyledAttributes.getInt(index2, bVar.X);
                        break;
                    case 55:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.Y = typedArrayObtainStyledAttributes.getInt(index2, bVar.Y);
                        break;
                    case 56:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.Z);
                        break;
                    case 57:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.a0);
                        break;
                    case 58:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.b0);
                        break;
                    case 59:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.c0);
                        break;
                    case 60:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        eVar.a = typedArrayObtainStyledAttributes.getFloat(index2, eVar.a);
                        break;
                    case 61:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.z = h(typedArrayObtainStyledAttributes, index2, bVar.z);
                        break;
                    case 62:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.A);
                        break;
                    case 63:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        bVar.B = typedArrayObtainStyledAttributes.getFloat(index2, bVar.B);
                        break;
                    case Defaults.HTTP_ASYNC_THREADPOOL_SIZE /* 64 */:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        c0011c.a = h(typedArrayObtainStyledAttributes, index2, c0011c.a);
                        break;
                    case 65:
                        indexCount2 = indexCount2;
                        str = str;
                        sparseIntArray = sparseIntArray2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            String str2 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c0011c.getClass();
                        } else {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c0011c.getClass();
                        }
                        break;
                    case 66:
                        indexCount2 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c0011c.getClass();
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 67:
                        str = str;
                        c0011c.e = typedArrayObtainStyledAttributes.getFloat(index2, c0011c.e);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 68:
                        str = str;
                        dVar.d = typedArrayObtainStyledAttributes.getFloat(index2, dVar.d);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 69:
                        str = str;
                        bVar.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 70:
                        str = str;
                        bVar.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 71:
                        str = str;
                        Log.e("ConstraintSet", str);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 72:
                        indexCount2 = indexCount2;
                        bVar.f0 = typedArrayObtainStyledAttributes.getInt(index2, bVar.f0);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 73:
                        indexCount2 = indexCount2;
                        bVar.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.g0);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 74:
                        indexCount2 = indexCount2;
                        bVar.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 75:
                        indexCount2 = indexCount2;
                        bVar.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.n0);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 76:
                        indexCount2 = indexCount2;
                        c0011c.c = typedArrayObtainStyledAttributes.getInt(index2, c0011c.c);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 77:
                        indexCount2 = indexCount2;
                        bVar.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 78:
                        indexCount2 = indexCount2;
                        dVar.b = typedArrayObtainStyledAttributes.getInt(index2, dVar.b);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 79:
                        indexCount2 = indexCount2;
                        c0011c.d = typedArrayObtainStyledAttributes.getFloat(index2, c0011c.d);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case Defaults.PORT /* 80 */:
                        indexCount2 = indexCount2;
                        bVar.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.l0);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 81:
                        indexCount2 = indexCount2;
                        bVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.m0);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 82:
                        indexCount2 = indexCount2;
                        c0011c.b = typedArrayObtainStyledAttributes.getInteger(index2, c0011c.b);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 83:
                        indexCount2 = indexCount2;
                        eVar.h = h(typedArrayObtainStyledAttributes, index2, eVar.h);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 84:
                        indexCount2 = indexCount2;
                        c0011c.g = typedArrayObtainStyledAttributes.getInteger(index2, c0011c.g);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case SurveyViewModel.ENTITY_TYPE /* 85 */:
                        indexCount2 = indexCount2;
                        c0011c.f = typedArrayObtainStyledAttributes.getFloat(index2, c0011c.f);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 86:
                        indexCount2 = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i8 == 1) {
                            c0011c.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i8 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c0011c.h = string2;
                            if (string2.indexOf(AgentHeaderCreator.AGENT_DIVIDER) > 0) {
                                c0011c.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c0011c.i);
                        }
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 87:
                        indexCount2 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray2.get(index2));
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        indexCount2 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray2.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 91:
                        indexCount2 = indexCount2;
                        bVar.q = h(typedArrayObtainStyledAttributes, index2, bVar.q);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 92:
                        indexCount2 = indexCount2;
                        bVar.r = h(typedArrayObtainStyledAttributes, index2, bVar.r);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 93:
                        indexCount2 = indexCount2;
                        bVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.L);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 94:
                        indexCount2 = indexCount2;
                        bVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.S);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 95:
                        indexCount2 = indexCount2;
                        i(bVar, typedArrayObtainStyledAttributes, index2, 0);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 96:
                        indexCount2 = indexCount2;
                        i(bVar, typedArrayObtainStyledAttributes, index2, 1);
                        sparseIntArray = sparseIntArray2;
                        break;
                    case 97:
                        indexCount2 = indexCount2;
                        bVar.o0 = typedArrayObtainStyledAttributes.getInt(index2, bVar.o0);
                        sparseIntArray = sparseIntArray2;
                        break;
                }
                i6++;
                sparseIntArray2 = sparseIntArray;
                str = str;
                indexCount2 = indexCount2;
            }
            if (bVar.j0 != null) {
                bVar.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int h(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void i(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        a.C0010a c0010a;
        b bVar;
        ConstraintLayout.a aVar;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof ConstraintLayout.a) {
                    aVar = (ConstraintLayout.a) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) aVar).width = i4;
                        aVar.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) aVar).height = i4;
                        aVar.X = z;
                        return;
                    }
                }
                if (obj instanceof b) {
                    bVar = (b) obj;
                    if (i2 == 0) {
                        bVar.b = i4;
                        bVar.l0 = z;
                        return;
                    } else {
                        bVar.c = i4;
                        bVar.m0 = z;
                        return;
                    }
                }
                if (obj instanceof a.C0010a) {
                    c0010a = (a.C0010a) obj;
                    if (i2 == 0) {
                        c0010a.b(23, i4);
                        c0010a.d(80, z);
                        return;
                    } else {
                        c0010a.b(21, i4);
                        c0010a.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.a) {
                aVar = (ConstraintLayout.a) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) aVar).width = i4;
                    aVar.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) aVar).height = i4;
                    aVar.X = z;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i2 == 0) {
                    bVar.b = i4;
                    bVar.l0 = z;
                    return;
                } else {
                    bVar.c = i4;
                    bVar.m0 = z;
                    return;
                }
            }
            if (obj instanceof a.C0010a) {
                c0010a = (a.C0010a) obj;
                if (i2 == 0) {
                    c0010a.b(23, i4);
                    c0010a.d(80, z);
                    return;
                } else {
                    c0010a.b(21, i4);
                    c0010a.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.a) {
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) aVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) aVar2).height = 0;
                    }
                    j(aVar2, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0010a) {
                        ((a.C0010a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.a) {
                        ConstraintLayout.a aVar3 = (ConstraintLayout.a) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) aVar3).width = 0;
                            aVar3.H = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar3).height = 0;
                            aVar3.I = f2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i2 == 0) {
                            bVar2.b = 0;
                            bVar2.U = f2;
                            return;
                        } else {
                            bVar2.c = 0;
                            bVar2.T = f2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0010a) {
                        a.C0010a c0010a2 = (a.C0010a) obj;
                        if (i2 == 0) {
                            c0010a2.b(23, 0);
                            c0010a2.a(f2, 39);
                            return;
                        } else {
                            c0010a2.b(21, 0);
                            c0010a2.a(f2, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.a) {
                        ConstraintLayout.a aVar4 = (ConstraintLayout.a) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) aVar4).width = 0;
                            aVar4.R = fMax;
                            aVar4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar4).height = 0;
                            aVar4.S = fMax;
                            aVar4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i2 == 0) {
                            bVar3.b = 0;
                            bVar3.d0 = fMax;
                            bVar3.X = 2;
                            return;
                        } else {
                            bVar3.c = 0;
                            bVar3.e0 = fMax;
                            bVar3.Y = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0010a) {
                        a.C0010a c0010a3 = (a.C0010a) obj;
                        if (i2 == 0) {
                            c0010a3.b(23, 0);
                            c0010a3.b(54, 2);
                        } else {
                            c0010a3.b(21, 0);
                            c0010a3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void j(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap<String, androidx.constraintlayout.widget.a> map;
        String resourceEntryName;
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map2 = cVar.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (cVar.b && id == -1) {
                    ru3.d("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        a aVar = map2.get(Integer.valueOf(id));
                        if (aVar != null) {
                            d dVar = aVar.b;
                            b bVar = aVar.d;
                            e eVar = aVar.e;
                            if (childAt instanceof Barrier) {
                                bVar.h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(bVar.f0);
                                barrier.setMargin(bVar.g0);
                                barrier.setAllowsGoneWidget(bVar.n0);
                                int[] iArr = bVar.i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.j0;
                                    if (str != null) {
                                        int[] iArrE = e(barrier, str);
                                        bVar.i0 = iArrE;
                                        barrier.setReferencedIds(iArrE);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            HashMap<String, androidx.constraintlayout.widget.a> map3 = aVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                androidx.constraintlayout.widget.a aVar3 = map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strA = !aVar3.a ? ct1.a("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iOrdinal = aVar3.c.ordinal();
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iOrdinal) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strA, cls3).invoke(childAt, Integer.valueOf(aVar3.d));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strA, cls2).invoke(childAt, Float.valueOf(aVar3.e));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strA, cls3).invoke(childAt, Integer.valueOf(aVar3.h));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strA, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(aVar3.h);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbA = aa.a(" Custom Attribute \"", str2, "\" not found on ");
                                                sbA.append(cls.getName());
                                                Log.e("TransitionLayout", sbA.toString(), e);
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strA, e);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbA2 = aa.a(" Custom Attribute \"", str2, "\" not found on ");
                                                sbA2.append(cls.getName());
                                                Log.e("TransitionLayout", sbA2.toString(), e);
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strA, CharSequence.class).invoke(childAt, aVar3.f);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strA, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar3.g));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strA, cls2).invoke(childAt, Float.valueOf(aVar3.e));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strA, cls3).invoke(childAt, Integer.valueOf(aVar3.d));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(aVar2);
                            if (dVar.b == 0) {
                                childAt.setVisibility(dVar.a);
                            }
                            childAt.setAlpha(dVar.c);
                            childAt.setRotation(eVar.a);
                            childAt.setRotationX(eVar.b);
                            childAt.setRotationY(eVar.c);
                            childAt.setScaleX(eVar.d);
                            childAt.setScaleY(eVar.e);
                            if (eVar.h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(eVar.h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f)) {
                                    childAt.setPivotX(eVar.f);
                                }
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotY(eVar.g);
                                }
                            }
                            childAt.setTranslationX(eVar.i);
                            childAt.setTranslationY(eVar.j);
                            childAt.setTranslationZ(eVar.k);
                            if (eVar.l) {
                                childAt.setElevation(eVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                cVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            cVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            a aVar4 = map2.get(num);
            if (aVar4 != null) {
                b bVar2 = aVar4.d;
                if (bVar2.h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar2.i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = bVar2.j0;
                        if (str3 != null) {
                            int[] iArrE2 = e(barrier2, str3);
                            bVar2.i0 = iArrE2;
                            barrier2.setReferencedIds(iArrE2);
                        }
                    }
                    barrier2.setType(bVar2.f0);
                    barrier2.setMargin(bVar2.g0);
                    rm9 rm9Var = ConstraintLayout.I;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    barrier2.k();
                    aVar4.a(aVar5);
                    constraintLayout.addView(barrier2, aVar5);
                }
                if (bVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    rm9 rm9Var2 = ConstraintLayout.I;
                    ConstraintLayout.a aVar6 = new ConstraintLayout.a();
                    aVar4.a(aVar6);
                    constraintLayout.addView(guideline, aVar6);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).f(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i;
        HashMap<Integer, a> map;
        int i2;
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map2 = cVar.c;
        map2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.b && id == -1) {
                ru3.d("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new a());
            }
            a aVar2 = map2.get(Integer.valueOf(id));
            if (aVar2 == null) {
                i = childCount;
                map = map2;
                i2 = i3;
            } else {
                d dVar = aVar2.b;
                b bVar = aVar2.d;
                e eVar = aVar2.e;
                i = childCount;
                HashMap<String, androidx.constraintlayout.widget.a> map3 = new HashMap<>();
                map = map2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap<String, androidx.constraintlayout.widget.a> map4 = cVar.a;
                for (String str : map4.keySet()) {
                    androidx.constraintlayout.widget.a aVar3 = map4.get(str);
                    HashMap<String, androidx.constraintlayout.widget.a> map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new androidx.constraintlayout.widget.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new androidx.constraintlayout.widget.a(aVar3, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        StringBuilder sbA = aa.a(" Custom Attribute \"", str, "\" not found on ");
                        sbA.append(cls.getName());
                        Log.e("TransitionLayout", sbA.toString(), e2);
                    } catch (NoSuchMethodException e3) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e3);
                    } catch (InvocationTargetException e4) {
                        StringBuilder sbA2 = aa.a(" Custom Attribute \"", str, "\" not found on ");
                        sbA2.append(cls.getName());
                        Log.e("TransitionLayout", sbA2.toString(), e4);
                    }
                    map4 = map5;
                }
                aVar2.f = map3;
                aVar2.b(id, aVar);
                dVar.a = childAt.getVisibility();
                dVar.c = childAt.getAlpha();
                eVar.a = childAt.getRotation();
                eVar.b = childAt.getRotationX();
                eVar.c = childAt.getRotationY();
                eVar.d = childAt.getScaleX();
                eVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f = pivotX;
                    eVar.g = pivotY;
                }
                eVar.i = childAt.getTranslationX();
                eVar.j = childAt.getTranslationY();
                eVar.k = childAt.getTranslationZ();
                if (eVar.l) {
                    eVar.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    bVar.n0 = barrier.getAllowsGoneWidget();
                    bVar.i0 = barrier.getReferencedIds();
                    bVar.f0 = barrier.getType();
                    bVar.g0 = barrier.getMargin();
                }
            }
            i3 = i2 + 1;
            cVar = this;
            childCount = i;
            map2 = map;
        }
    }

    public final void d(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap<Integer, a> map = this.c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new a());
        }
        map.get(Integer.valueOf(i)).d.c = i2;
    }

    public final void g(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarF = f(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarF.d.a = true;
                    }
                    this.c.put(Integer.valueOf(aVarF.a), aVarF);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e3);
        }
    }
}
