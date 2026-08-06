package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class t98 {
    public int a;
    public o50[] b;

    public final void a(int i, o50 o50Var) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            o50 o50Var2 = this.b[i2];
            o50Var2.getClass();
            if (xj5.c(0L, o50Var.g - o50Var2.g) <= 0) {
                break;
            }
            o50Var2.f = i;
            this.b[i] = o50Var2;
            i = i2;
        }
        this.b[i] = o50Var;
        o50Var.f = i;
    }

    public final void b(o50 o50Var) {
        o50 o50Var2;
        int i = o50Var.f;
        if (i == -1) {
            z90.a("Failed requirement.");
            return;
        }
        int i2 = this.a;
        o50 o50Var3 = this.b[i2];
        o50Var3.getClass();
        o50Var.f = -1;
        this.b[i2] = null;
        this.a = i2 - 1;
        if (o50Var == o50Var3) {
            return;
        }
        int iC = xj5.c(0L, o50Var3.g - o50Var.g);
        if (iC == 0) {
            this.b[i] = o50Var3;
            o50Var3.f = i;
            return;
        }
        if (iC >= 0) {
            a(i, o50Var3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                o50Var2 = this.b[i3];
                o50Var2.getClass();
            } else {
                o50Var2 = this.b[i3];
                o50Var2.getClass();
                o50 o50Var4 = this.b[i4];
                o50Var4.getClass();
                if (xj5.c(0L, o50Var4.g - o50Var2.g) >= 0) {
                    o50Var2 = o50Var4;
                }
            }
            if (xj5.c(0L, o50Var2.g - o50Var3.g) <= 0) {
                break;
            }
            int i6 = o50Var2.f;
            o50Var2.f = i;
            this.b[i] = o50Var2;
            i = i6;
        }
        this.b[i] = o50Var3;
        o50Var3.f = i;
    }
}
