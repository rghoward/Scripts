package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h66 extends jq1 {
    public i66[] g;
    public c h;
    public e i;
    public d j;
    public a k;
    public b l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public ArrayList u;
    public ArrayList v;
    public ArrayList w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("LEFT_TO_RIGHT", 0);
            t = aVar;
            a aVar2 = new a("RIGHT_TO_LEFT", 1);
            u = aVar2;
            v = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b t;
        public static final b u;
        public static final b v;
        public static final /* synthetic */ b[] w;

        static {
            b bVar = new b("NONE", 0);
            t = bVar;
            b bVar2 = new b("EMPTY", 1);
            b bVar3 = new b("DEFAULT", 2);
            u = bVar3;
            b bVar4 = new b("SQUARE", 3);
            v = bVar4;
            w = new b[]{bVar, bVar2, bVar3, bVar4, new b("CIRCLE", 4), new b("LINE", 5)};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) w.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public static final c t;
        public static final c u;
        public static final /* synthetic */ c[] v;

        static {
            c cVar = new c("LEFT", 0);
            t = cVar;
            c cVar2 = new c("CENTER", 1);
            u = cVar2;
            v = new c[]{cVar, cVar2, new c("RIGHT", 2)};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) v.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final d t;
        public static final d u;
        public static final /* synthetic */ d[] v;

        static {
            d dVar = new d("HORIZONTAL", 0);
            t = dVar;
            d dVar2 = new d("VERTICAL", 1);
            u = dVar2;
            v = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) v.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public static final e t;
        public static final /* synthetic */ e[] u;

        /* JADX INFO: Fake field, exist only in values array */
        e EF0;

        static {
            e eVar = new e("TOP", 0);
            e eVar2 = new e("CENTER", 1);
            e eVar3 = new e("BOTTOM", 2);
            t = eVar3;
            u = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) u.clone();
        }
    }
}
