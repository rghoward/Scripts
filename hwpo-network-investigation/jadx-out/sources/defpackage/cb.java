package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class cb extends g5b<a, List<? extends ao0>> {
    public final vo0 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public final int a;
        public final ArrayList b;

        public a(int i, ArrayList arrayList) {
            this.a = i;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Params(sectionId=" + this.a + ", benchmarks=" + this.b + ")";
        }
    }

    public cb(vo0 vo0Var) {
        vo0Var.getClass();
        this.a = vo0Var;
    }

    @Override // defpackage.g5b
    public final Object a(Object obj, g5b.b bVar) {
        a aVar = (a) obj;
        return this.a.a(aVar.a, aVar.b, bVar);
    }
}
