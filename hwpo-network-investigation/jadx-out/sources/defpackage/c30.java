package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 {
    public static final j a = new j();
    public static final d b = new d();
    public static final k c = new k();
    public static final c d = new c();
    public static final g e = new g();
    public static final f f = new f();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final b a = new b();
        public static final C0036a b = new C0036a();
        public static final c c = new c();

        /* JADX INFO: renamed from: c30$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0036a implements e {
            @Override // c30.e
            public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
                c30.a(i, iArr, iArr2, false);
            }

            public final String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class b implements e {
            @Override // c30.e
            public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
            }

            public final String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class c implements e {
            @Override // c30.e
            public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
                int i2 = 0;
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int length = iArr.length;
                int i5 = i - i3;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
            }

            public final String toString() {
                return "AbsoluteArrangement#Right";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements l {
        @Override // c30.l
        public final void arrange(tx2 tx2Var, int i, int[] iArr, int[] iArr2) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            int length = iArr.length;
            int i5 = i - i3;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c implements e, l {
        @Override // c30.e
        public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
            if (tq5Var == tq5.t) {
                c30.a(i, iArr, iArr2, false);
            } else {
                c30.a(i, iArr, iArr2, true);
            }
        }

        @Override // c30.l
        public final void arrange(tx2 tx2Var, int i, int[] iArr, int[] iArr2) {
            c30.a(i, iArr, iArr2, false);
        }

        @Override // c30.e, c30.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
        public final float mo1getSpacingD9Ej5fM() {
            return 0.0f;
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d implements e {
        @Override // c30.e
        public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
            int i2 = 0;
            if (tq5Var == tq5.t) {
                int i3 = 0;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int length = iArr.length;
                int i5 = i - i3;
                int i6 = 0;
                while (i2 < length) {
                    int i7 = iArr[i2];
                    iArr2[i6] = i5;
                    i5 += i7;
                    i2++;
                    i6++;
                }
                return;
            }
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (-1 >= length2) {
                    return;
                }
                int i8 = iArr[length2];
                iArr2[length2] = i2;
                i2 += i8;
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface e {
        void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo1getSpacingD9Ej5fM() {
            return 0.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f implements e, l {
        @Override // c30.e
        public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
            if (tq5Var == tq5.t) {
                c30.b(i, iArr, iArr2, false);
            } else {
                c30.b(i, iArr, iArr2, true);
            }
        }

        @Override // c30.l
        public final void arrange(tx2 tx2Var, int i, int[] iArr, int[] iArr2) {
            c30.b(i, iArr, iArr2, false);
        }

        @Override // c30.e, c30.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final float mo1getSpacingD9Ej5fM() {
            return 0.0f;
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g implements e, l {
        @Override // c30.e
        public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
            if (tq5Var == tq5.t) {
                c30.c(i, iArr, iArr2, false);
            } else {
                c30.c(i, iArr, iArr2, true);
            }
        }

        @Override // c30.l
        public final void arrange(tx2 tx2Var, int i, int[] iArr, int[] iArr2) {
            c30.c(i, iArr, iArr2, false);
        }

        @Override // c30.e, c30.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final float mo1getSpacingD9Ej5fM() {
            return 0.0f;
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h implements e, l {
        public final float a;
        public final boolean b;
        public final i c;
        public final float d;

        public h(float f, boolean z, i iVar) {
            this.a = f;
            this.b = z;
            this.c = iVar;
            this.d = f;
        }

        @Override // c30.e
        public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
            int i2;
            if (iArr.length == 0) {
                return;
            }
            int iN1 = tx2Var.n1(this.a);
            boolean z = this.b && tq5Var == tq5.u;
            if (z) {
                int length = iArr.length;
                int i3 = 0;
                int iMin = 0;
                int i4 = 0;
                while (i3 < length) {
                    int iMax = Math.max(0, i - iArr[i3]);
                    iArr2[i4] = iMax;
                    iMin = Math.min(iN1, iMax);
                    i = iArr2[i4] - iMin;
                    i3++;
                    i4++;
                }
                i2 = i + iMin;
            } else {
                int length2 = iArr.length;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i5 < length2) {
                    int i9 = iArr[i5];
                    int iMin2 = Math.min(i6, i - i9);
                    iArr2[i8] = iMin2;
                    int iMin3 = Math.min(iN1, (i - iMin2) - i9);
                    int i10 = iArr2[i8] + i9 + iMin3;
                    i5++;
                    i7 = iMin3;
                    i6 = i10;
                    i8++;
                }
                i2 = i - (i6 - i7);
            }
            i iVar = this.c;
            if (iVar == null || i2 <= 0) {
                return;
            }
            int iA = iVar.a(i2, tq5Var);
            if (z) {
                iA -= i2;
            }
            if (iA != 0) {
                int length3 = iArr2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    iArr2[i11] = iArr2[i11] + iA;
                }
            }
        }

        @Override // c30.l
        public final void arrange(tx2 tx2Var, int i, int[] iArr, int[] iArr2) {
            a(tx2Var, i, iArr, tq5.t, iArr2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return y43.e(this.a, hVar.a) && this.b == hVar.b && xj5.a(this.c, hVar.c);
        }

        @Override // c30.e, c30.l
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final float mo1getSpacingD9Ej5fM() {
            return this.d;
        }

        public final int hashCode() {
            int iA = uo2.a(Float.hashCode(this.a) * 31, this.b, 31);
            i iVar = this.c;
            return iA + (iVar == null ? 0 : iVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b ? BuildConfig.FLAVOR : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append((Object) y43.f(this.a));
            sb.append(", ");
            sb.append(this.c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface i {
        int a(int i, tq5 tq5Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j implements e {
        @Override // c30.e
        public final void a(tx2 tx2Var, int i, int[] iArr, tq5 tq5Var, int[] iArr2) {
            int i2 = 0;
            if (tq5Var == tq5.t) {
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                return;
            }
            int length2 = iArr.length;
            int i6 = 0;
            while (i2 < length2) {
                i6 += iArr[i2];
                i2++;
            }
            int i7 = i - i6;
            int length3 = iArr.length;
            while (true) {
                length3--;
                if (-1 >= length3) {
                    return;
                }
                int i8 = iArr[length3];
                iArr2[length3] = i7;
                i7 += i8;
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k implements l {
        @Override // c30.l
        public final void arrange(tx2 tx2Var, int i, int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface l {
        void arrange(tx2 tx2Var, int i, int[] iArr, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo1getSpacingD9Ej5fM() {
            return 0.0f;
        }
    }

    public static void a(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void b(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? fMax : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + fMax;
            i3++;
            i7++;
        }
    }

    public static void c(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }
}
