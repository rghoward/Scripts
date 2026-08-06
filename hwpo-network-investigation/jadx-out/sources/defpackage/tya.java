package defpackage;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tya {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public nda r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(tya tyaVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (tyaVar != null) {
            if (!this.c && tyaVar.c) {
                this.b = tyaVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = tyaVar.h;
            }
            if (this.i == -1) {
                this.i = tyaVar.i;
            }
            if (this.a == null && (str = tyaVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = tyaVar.f;
            }
            if (this.g == -1) {
                this.g = tyaVar.g;
            }
            if (this.n == -1) {
                this.n = tyaVar.n;
            }
            if (this.o == null && (alignment2 = tyaVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = tyaVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = tyaVar.q;
            }
            if (this.j == -1) {
                this.j = tyaVar.j;
                this.k = tyaVar.k;
            }
            if (this.r == null) {
                this.r = tyaVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = tyaVar.s;
            }
            if (this.t == null) {
                this.t = tyaVar.t;
            }
            if (this.u == null) {
                this.u = tyaVar.u;
            }
            if (!this.e && tyaVar.e) {
                this.d = tyaVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = tyaVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
