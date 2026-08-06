package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l77 {
    public final k77.a a;
    public boolean b;
    public boolean c;
    public int d;
    public String e;
    public boolean f;
    public boolean g;

    public l77() {
        k77.a aVar = new k77.a();
        aVar.c = -1;
        aVar.g = -1;
        aVar.h = -1;
        this.a = aVar;
        this.d = -1;
    }

    public final void a(int i) {
        this.d = i;
        this.f = false;
    }

    public final void b(String str) {
        if (z2a.w(str)) {
            z90.a("Cannot pop up to an empty route");
        } else {
            this.e = str;
            this.f = false;
        }
    }
}
