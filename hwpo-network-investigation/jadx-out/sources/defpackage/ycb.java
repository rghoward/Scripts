package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ycb extends adb implements Iterable<adb>, zn5 {
    public final float A;
    public final List<ju7> B;
    public final List<adb> C;
    public final String t;
    public final float u;
    public final float v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements Iterator<adb>, zn5 {
        public final Iterator<adb> t;

        public a(ycb ycbVar) {
            this.t = ycbVar.C.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.t.hasNext();
        }

        @Override // java.util.Iterator
        public final adb next() {
            return this.t.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ycb(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends ju7> list, List<? extends adb> list2) {
        this.t = str;
        this.u = f;
        this.v = f2;
        this.w = f3;
        this.x = f4;
        this.y = f5;
        this.z = f6;
        this.A = f7;
        this.B = list;
        this.C = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ycb)) {
            ycb ycbVar = (ycb) obj;
            return xj5.a(this.t, ycbVar.t) && this.u == ycbVar.u && this.v == ycbVar.v && this.w == ycbVar.w && this.x == ycbVar.x && this.y == ycbVar.y && this.z == ycbVar.z && this.A == ycbVar.A && xj5.a(this.B, ycbVar.B) && xj5.a(this.C, ycbVar.C);
        }
        return false;
    }

    public final int hashCode() {
        return this.C.hashCode() + ho2.a(h44.a(h44.a(h44.a(h44.a(h44.a(h44.a(h44.a(this.t.hashCode() * 31, this.u, 31), this.v, 31), this.w, 31), this.x, 31), this.y, 31), this.z, 31), this.A, 31), 31, this.B);
    }

    @Override // java.lang.Iterable
    public final Iterator<adb> iterator() {
        return new a(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ycb() {
        int i = zcb.a;
        hf3 hf3Var = hf3.t;
        this(BuildConfig.FLAVOR, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, hf3Var, hf3Var);
    }
}
