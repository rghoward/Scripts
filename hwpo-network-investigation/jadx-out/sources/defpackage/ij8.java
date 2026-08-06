package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ij8 implements c3a {
    public final lkb a;
    public final b b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final Bitmap a;
        public final Map<String, Object> b;
        public final int c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i) {
            this.a = bitmap;
            this.b = map;
            this.c = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends nf6<ar6.a, a> {
        public final /* synthetic */ ij8 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, ij8 ij8Var) {
            super(i);
            this.g = ij8Var;
        }

        @Override // defpackage.nf6
        public final void b(Object obj, Object obj2, Object obj3) {
            a aVar = (a) obj2;
            this.g.a.c((ar6.a) obj, aVar.a, aVar.b, aVar.c);
        }

        @Override // defpackage.nf6
        public final int g(ar6.a aVar, a aVar2) {
            return aVar2.c;
        }
    }

    public ij8(int i, lkb lkbVar) {
        this.a = lkbVar;
        this.b = new b(i, this);
    }

    @Override // defpackage.c3a
    public final void a(int i) {
        int i2;
        if (i >= 40) {
            this.b.h(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        b bVar = this.b;
        synchronized (bVar.c) {
            i2 = bVar.d;
        }
        bVar.h(i2 / 2);
    }

    @Override // defpackage.c3a
    public final ar6.b b(ar6.a aVar) {
        a aVarC = this.b.c(aVar);
        if (aVarC != null) {
            return new ar6.b(aVarC.a, aVarC.b);
        }
        return null;
    }

    @Override // defpackage.c3a
    public final void c(ar6.a aVar, Bitmap bitmap, Map<String, ? extends Object> map) {
        int i;
        int iA = defpackage.b.a(bitmap);
        b bVar = this.b;
        synchronized (bVar.c) {
            i = bVar.a;
        }
        b bVar2 = this.b;
        if (iA <= i) {
            bVar2.d(aVar, new a(bitmap, map, iA));
        } else {
            bVar2.e(aVar);
            this.a.c(aVar, bitmap, map, iA);
        }
    }
}
