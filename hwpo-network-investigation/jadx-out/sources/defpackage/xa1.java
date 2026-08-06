package defpackage;

import defpackage.t55;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xa1<T extends t55<? extends qj3>> {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public ArrayList i;

    public final void a() {
        mrb.a aVar;
        t55 t55Var;
        t55 t55Var2;
        mrb.a aVar2;
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            return;
        }
        this.a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            aVar = mrb.a.t;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            t55 t55Var3 = (t55) obj;
            if (this.a < t55Var3.c()) {
                this.a = t55Var3.c();
            }
            if (this.b > t55Var3.i()) {
                this.b = t55Var3.i();
            }
            if (this.c < t55Var3.A()) {
                this.c = t55Var3.A();
            }
            if (this.d > t55Var3.b()) {
                this.d = t55Var3.b();
            }
            if (t55Var3.G() == aVar) {
                if (this.e < t55Var3.c()) {
                    this.e = t55Var3.c();
                }
                if (this.f > t55Var3.i()) {
                    this.f = t55Var3.i();
                }
            } else {
                if (this.g < t55Var3.c()) {
                    this.g = t55Var3.c();
                }
                if (this.h > t55Var3.i()) {
                    this.h = t55Var3.i();
                }
            }
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        int size2 = arrayList.size();
        int i3 = 0;
        do {
            t55Var = null;
            if (i3 >= size2) {
                t55Var2 = null;
                break;
            } else {
                Object obj2 = arrayList.get(i3);
                i3++;
                t55Var2 = (t55) obj2;
            }
        } while (t55Var2.G() != aVar);
        if (t55Var2 != null) {
            this.e = t55Var2.c();
            this.f = t55Var2.i();
            int size3 = arrayList.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList.get(i4);
                i4++;
                t55 t55Var4 = (t55) obj3;
                if (t55Var4.G() == aVar) {
                    if (t55Var4.i() < this.f) {
                        this.f = t55Var4.i();
                    }
                    if (t55Var4.c() > this.e) {
                        this.e = t55Var4.c();
                    }
                }
            }
        }
        int size4 = arrayList.size();
        int i5 = 0;
        while (true) {
            aVar2 = mrb.a.u;
            if (i5 >= size4) {
                break;
            }
            Object obj4 = arrayList.get(i5);
            i5++;
            t55 t55Var5 = (t55) obj4;
            if (t55Var5.G() == aVar2) {
                t55Var = t55Var5;
                break;
            }
        }
        if (t55Var != null) {
            this.g = t55Var.c();
            this.h = t55Var.i();
            int size5 = arrayList.size();
            while (i < size5) {
                Object obj5 = arrayList.get(i);
                i++;
                t55 t55Var6 = (t55) obj5;
                if (t55Var6.G() == aVar2) {
                    if (t55Var6.i() < this.h) {
                        this.h = t55Var6.i();
                    }
                    if (t55Var6.c() > this.g) {
                        this.g = t55Var6.c();
                    }
                }
            }
        }
    }

    public final T b(int i) {
        ArrayList arrayList = this.i;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (T) arrayList.get(i);
    }

    public final int c() {
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int d() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int iH = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iH += ((t55) obj).H();
        }
        return iH;
    }

    public final qj3 e(rw4 rw4Var) {
        int i = rw4Var.f;
        ArrayList arrayList = this.i;
        if (i >= arrayList.size()) {
            return null;
        }
        return ((t55) arrayList.get(rw4Var.f)).L(rw4Var.a, rw4Var.b);
    }

    public final float f(mrb.a aVar) {
        if (aVar == mrb.a.t) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public final float g(mrb.a aVar) {
        if (aVar == mrb.a.t) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }
}
