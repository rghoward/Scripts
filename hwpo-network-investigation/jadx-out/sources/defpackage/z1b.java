package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class z1b {
    public final int a;
    public a b;
    public a c;
    public int d;
    public Long e;
    public boolean f;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public a a;
        public kha b;

        public a(a aVar, kha khaVar) {
            this.a = aVar;
            this.b = khaVar;
        }
    }

    public z1b(int i) {
        this.a = 100000;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    public final void a(kha khaVar) {
        a aVar;
        kha khaVar2;
        this.f = false;
        a aVar2 = this.b;
        if (xj5.a(khaVar, aVar2 != null ? aVar2.b : null)) {
            return;
        }
        String str = khaVar.a.u;
        a aVar3 = this.b;
        boolean zA = xj5.a(str, (aVar3 == null || (khaVar2 = aVar3.b) == null) ? null : khaVar2.a.u);
        a aVar4 = this.b;
        if (zA) {
            if (aVar4 != null) {
                aVar4.b = khaVar;
                return;
            }
            return;
        }
        this.b = new a(aVar4, khaVar);
        this.c = null;
        int length = khaVar.a.u.length() + this.d;
        this.d = length;
        if (length > this.a) {
            a aVar5 = this.b;
            if ((aVar5 != null ? aVar5.a : null) == null) {
                return;
            }
            while (true) {
                if (aVar5 == null) {
                    aVar = null;
                } else {
                    a aVar6 = aVar5.a;
                    if (aVar6 != null) {
                        aVar = aVar6.a;
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    break;
                } else {
                    aVar5 = aVar5.a;
                }
            }
            if (aVar5 != null) {
                aVar5.a = null;
            }
        }
    }

    public z1b() {
        this(0);
    }
}
