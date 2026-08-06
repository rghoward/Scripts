package defpackage;

import androidx.recyclerview.widget.b;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tn0 implements za6 {
    public final za6 a;
    public int b = 0;
    public int c = -1;
    public int d = -1;

    public tn0(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.za6
    public final void a(int i, int i2) {
        e();
        this.a.a(i, i2);
    }

    @Override // defpackage.za6
    public final void b(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        e();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // defpackage.za6
    public final void c(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            e();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }

    @Override // defpackage.za6
    public final void d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
        } else {
            e();
            this.c = i;
            this.d = i2;
            this.b = 3;
        }
    }

    public final void e() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        za6 za6Var = this.a;
        if (i == 1) {
            za6Var.b(this.c, this.d);
        } else if (i == 2) {
            za6Var.c(this.c, this.d);
        } else if (i == 3) {
            za6Var.d(this.c, this.d);
        }
        this.b = 0;
    }
}
