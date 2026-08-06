package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lt1 {
    public final bj4 a;
    public i81 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final mg5 d = new mg5();
    public boolean e = true;
    public final ArrayList<Object> h = new ArrayList<>();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public lt1(bj4 bj4Var, i81 i81Var) {
        this.a = bj4Var;
        this.b = i81Var;
    }

    public final void a() {
        c();
        ArrayList<Object> arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            kk7 kk7Var = this.b.x;
            kk7Var.i1(gk7.i0.c);
            kk7Var.z[kk7Var.A - kk7Var.x[kk7Var.y - 1].a] = i;
            this.g = 0;
        }
        ArrayList<Object> arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        i81 i81Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        i81Var.getClass();
        if (size != 0) {
            kk7 kk7Var2 = i81Var.x;
            kk7Var2.i1(gk7.h.c);
            kk7.b.a(kk7Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                kk7 kk7Var = this.b.x;
                kk7Var.i1(gk7.y.c);
                int i3 = kk7Var.A - kk7Var.x[kk7Var.y - 1].a;
                int[] iArr = kk7Var.z;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                kk7 kk7Var2 = this.b.x;
                kk7Var2.i1(gk7.s.c);
                int i6 = kk7Var2.A - kk7Var2.x[kk7Var2.y - 1].a;
                int[] iArr2 = kk7Var2.z;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        yr9 yr9Var = this.a.G;
        int i = z ? yr9Var.i : yr9Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            pt1.a("Tried to seek backward");
        }
        if (i2 > 0) {
            kk7 kk7Var = this.b.x;
            kk7Var.i1(gk7.a.c);
            kk7Var.z[kk7Var.A - kk7Var.x[kk7Var.y - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        yr9 yr9Var = this.a.G;
        if (yr9Var.c > 0) {
            int i = yr9Var.i;
            mg5 mg5Var = this.d;
            if (mg5Var.a(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.x.i1(gk7.n.c);
                    this.c = true;
                }
                if (i > 0) {
                    vi4 vi4VarA = yr9Var.a(i);
                    mg5Var.c(i);
                    d(false);
                    kk7 kk7Var = this.b.x;
                    kk7Var.i1(gk7.m.c);
                    kk7.b.a(kk7Var, 0, vi4VarA);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                pt1.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
