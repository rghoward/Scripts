package androidx.fragment.app;

import defpackage.s66;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public ArrayList<a> a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public boolean p;
    public ArrayList<Runnable> q;

    public final void b(a aVar) {
        this.a.add(aVar);
        aVar.d = this.b;
        aVar.e = this.c;
        aVar.f = this.d;
        aVar.g = this.e;
    }

    public abstract androidx.fragment.app.a c(f fVar);

    public abstract void d(int i, f fVar, String str, int i2);

    public abstract androidx.fragment.app.a e(f fVar, s66.b bVar);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public int a;
        public f b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public s66.b h;
        public s66.b i;

        public a(f fVar, int i) {
            this.a = i;
            this.b = fVar;
            this.c = false;
            s66.b bVar = s66.b.x;
            this.h = bVar;
            this.i = bVar;
        }

        public a() {
        }

        public a(int i, f fVar, int i2) {
            this.a = i;
            this.b = fVar;
            this.c = true;
            s66.b bVar = s66.b.x;
            this.h = bVar;
            this.i = bVar;
        }
    }
}
