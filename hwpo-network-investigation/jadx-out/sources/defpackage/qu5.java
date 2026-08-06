package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qu5 {
    public final jt5 a;
    public final ArrayList<a> b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List<yo4> h;
    public int i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements ut5 {
        public static final b a = new b();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final int a;
        public final List<yo4> b;

        public c(int i, List<yo4> list) {
            this.a = i;
            this.b = list;
        }
    }

    public qu5(jt5 jt5Var) {
        this.a = jt5Var;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = hf3.t;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.i))) + 1;
    }

    public final c b(int i) {
        List<yo4> list;
        int i2 = this.i;
        int i3 = i * i2;
        int iD = d() - i3;
        if (i2 > iD) {
            i2 = iD;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.h.size()) {
            list = this.h;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new yo4(1L));
            }
            this.h = arrayList;
            list = arrayList;
        }
        return new c(i3, list);
    }

    public final int c(int i) {
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            xc5.a("ItemIndex > total count");
        }
        return i / this.i;
    }

    public final int d() {
        return this.a.b.b;
    }

    public final int e(int i) {
        lj5<ht5> lj5VarB = this.a.b.b(i);
        int i2 = i - lj5VarB.a;
        return (int) ((ht5) lj5VarB.c).a.invoke(b.a, Integer.valueOf(i2)).a;
    }
}
