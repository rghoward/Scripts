package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class n85 {
    public static int k;
    public static final b l = new b();
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ycb f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
    }

    public n85(String str, float f, float f2, float f3, float f4, ycb ycbVar, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ycbVar;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n85)) {
            return false;
        }
        n85 n85Var = (n85) obj;
        return xj5.a(this.a, n85Var.a) && y43.e(this.b, n85Var.b) && y43.e(this.c, n85Var.c) && this.d == n85Var.d && this.e == n85Var.e && this.f.equals(n85Var.f) && uh1.c(this.g, n85Var.g) && this.h == n85Var.h && this.i == n85Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + h44.a(h44.a(h44.a(h44.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31;
        int i = uh1.l;
        return Boolean.hashCode(this.i) + os2.a(this.h, al.c(this.g, iHashCode, 31), 31);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList<C0205a> i;
        public final C0205a j;
        public boolean k;

        public a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
            str = (i2 & 1) != 0 ? BuildConfig.FLAVOR : str;
            long j2 = (i2 & 32) != 0 ? uh1.k : j;
            int i3 = (i2 & 64) != 0 ? 5 : i;
            boolean z2 = (i2 & 128) != 0 ? false : z;
            this.a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j2;
            this.g = i3;
            this.h = z2;
            ArrayList<C0205a> arrayList = new ArrayList<>();
            this.i = arrayList;
            C0205a c0205a = new C0205a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.j = c0205a;
            arrayList.add(c0205a);
        }

        public static void a(a aVar, ArrayList arrayList, aw9 aw9Var) {
            if (aVar.k) {
                uc5.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            ((C0205a) p51.b(1, aVar.i)).j.add(new ddb(BuildConfig.FLAVOR, arrayList, 0, aw9Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
        }

        public final n85 b() {
            if (this.k) {
                uc5.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            while (true) {
                ArrayList<C0205a> arrayList = this.i;
                if (arrayList.size() <= 1) {
                    C0205a c0205a = this.j;
                    n85 n85Var = new n85(this.a, this.b, this.c, this.d, this.e, new ycb(c0205a.a, c0205a.b, c0205a.c, c0205a.d, c0205a.e, c0205a.f, c0205a.g, c0205a.h, c0205a.i, c0205a.j), this.f, this.g, this.h);
                    this.k = true;
                    return n85Var;
                }
                if (this.k) {
                    uc5.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                C0205a c0205aRemove = arrayList.remove(arrayList.size() - 1);
                ((C0205a) p51.b(1, arrayList)).j.add(new ycb(c0205aRemove.a, c0205aRemove.b, c0205aRemove.c, c0205aRemove.d, c0205aRemove.e, c0205aRemove.f, c0205aRemove.g, c0205aRemove.h, c0205aRemove.i, c0205aRemove.j));
            }
        }

        /* JADX INFO: renamed from: n85$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C0205a {
            public final String a;
            public final float b;
            public final float c;
            public final float d;
            public final float e;
            public final float f;
            public final float g;
            public final float h;
            public final List<? extends ju7> i;
            public final ArrayList j;

            public C0205a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? BuildConfig.FLAVOR : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                if ((i & 256) != 0) {
                    int i2 = zcb.a;
                    list = hf3.t;
                }
                ArrayList arrayList = new ArrayList();
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = arrayList;
            }

            public C0205a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }
        }
    }
}
