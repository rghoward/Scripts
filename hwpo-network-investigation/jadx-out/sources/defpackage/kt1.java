package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class kt1 {
    public final gn5 a;
    public boolean b = true;

    public kt1(gn5 gn5Var) {
        this.a = gn5Var;
    }

    public void a() {
        this.b = false;
    }

    public void b(byte b) {
        this.a.d(b);
    }

    public final void c(char c) {
        gn5 gn5Var = this.a;
        gn5Var.a(gn5Var.b, 1);
        char[] cArr = (char[]) gn5Var.c;
        int i = gn5Var.b;
        gn5Var.b = i + 1;
        cArr[i] = c;
    }

    public void d(int i) {
        this.a.d(i);
    }

    public void e(long j) {
        this.a.d(j);
    }

    public void f(short s) {
        this.a.d(s);
    }

    public void g(String str) {
        str.getClass();
        this.a.e(str);
    }

    public void h() {
    }

    public void i() {
    }
}
