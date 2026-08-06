package com.google.android.material.carousel;

import defpackage.aa0;
import defpackage.z90;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final float a;
    public final int b;
    public final List<C0053b> c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final float a;
        public final int b;
        public C0053b d;
        public C0053b e;
        public final ArrayList c = new ArrayList();
        public int f = -1;
        public int g = -1;
        public float h = 0.0f;
        public int i = -1;

        public a(float f, int i) {
            this.a = f;
            this.b = i;
        }

        public final void a(float f, float f2, float f3, boolean z, boolean z2) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            float f7 = this.b;
            if (f6 > f7) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
            } else {
                fAbs = 0.0f;
                if (f5 < 0.0f) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, 0.0f));
                }
            }
            b(f, f2, f3, z, z2, fAbs, 0.0f, 0.0f);
        }

        public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
            if (f3 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.c;
            if (z2) {
                if (z) {
                    z90.a("Anchor keylines cannot be focal.");
                    return;
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    z90.a("Anchor keylines must be either the first or last keyline.");
                    return;
                }
                this.i = arrayList.size();
            }
            C0053b c0053b = new C0053b(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
            C0053b c0053b2 = this.d;
            if (z) {
                if (c0053b2 == null) {
                    this.d = c0053b;
                    this.f = arrayList.size();
                }
                if (this.g != -1 && arrayList.size() - this.g > 1) {
                    z90.a("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                    return;
                } else if (f3 != this.d.d) {
                    z90.a("Keylines that are marked as focal must all have the same masked item size.");
                    return;
                } else {
                    this.e = c0053b;
                    this.g = arrayList.size();
                }
            } else if (c0053b2 == null && f3 < this.h) {
                z90.a("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                return;
            } else if (this.e != null && f3 > this.h) {
                z90.a("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                return;
            }
            this.h = f3;
            arrayList.add(c0053b);
        }

        public final void c(float f, float f2, float f3, int i, boolean z) {
            if (i <= 0 || f3 <= 0.0f) {
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                a((i2 * f3) + f, f2, f3, z, false);
            }
        }

        public final b d() {
            if (this.d == null) {
                aa0.c("There must be a keyline marked as focal.");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.c;
                if (i >= arrayList2.size()) {
                    return new b(this.a, arrayList, this.f, this.g, this.b);
                }
                C0053b c0053b = (C0053b) arrayList2.get(i);
                float f = this.d.b;
                float f2 = this.f;
                float f3 = this.a;
                arrayList.add(new C0053b((i * f3) + (f - (f2 * f3)), c0053b.b, c0053b.c, c0053b.d, c0053b.e, c0053b.f, c0053b.g, c0053b.h));
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class C0053b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final boolean e;
        public final float f;
        public final float g;
        public final float h;

        public C0053b(float f, float f2, float f3, float f4, boolean z, float f5, float f6, float f7) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = z;
            this.f = f5;
            this.g = f6;
            this.h = f7;
        }
    }

    public b(float f, ArrayList arrayList, int i, int i2, int i3) {
        this.a = f;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = i;
        this.e = i2;
        while (i <= i2) {
            if (((C0053b) arrayList.get(i)).f == 0.0f) {
                this.b++;
            }
            i++;
        }
        this.f = i3;
    }

    public final C0053b a() {
        return this.c.get(this.d);
    }

    public final C0053b b() {
        return this.c.get(0);
    }

    public final C0053b c() {
        return this.c.get(this.e);
    }

    public final C0053b d() {
        List<C0053b> list = this.c;
        return list.get(list.size() - 1);
    }
}
