package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class o95 extends g1 implements n95 {
    public static final o95 u = new o95(new x7b[0]);
    public final x7b[] t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends AbstractSet<Map.Entry<x7b, x7b>> {
        public final x7b[] t;

        public a(x7b[] x7bVarArr) {
            this.t = x7bVarArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<x7b, x7b>> iterator() {
            return new b(this.t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.t.length / 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements Iterator<Map.Entry<x7b, x7b>> {
        public final x7b[] t;
        public int u = 0;

        public b(x7b[] x7bVarArr) {
            this.t = x7bVarArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.u < this.t.length;
        }

        @Override // java.util.Iterator
        public final Map.Entry<x7b, x7b> next() {
            int i = this.u;
            x7b[] x7bVarArr = this.t;
            if (i >= x7bVarArr.length) {
                vl.b();
                return null;
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(x7bVarArr[i], x7bVarArr[i + 1]);
            this.u += 2;
            return simpleImmutableEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends AbstractMap<x7b, x7b> {
        public final x7b[] t;

        public c(x7b[] x7bVarArr) {
            this.t = x7bVarArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<x7b, x7b>> entrySet() {
            return new a(this.t);
        }
    }

    public o95(x7b[] x7bVarArr) {
        this.t = x7bVarArr;
    }

    public static void T(StringBuilder sb, x7b x7bVar) {
        if (x7bVar.o()) {
            sb.append(x7bVar.j());
        } else {
            sb.append(x7bVar.toString());
        }
    }

    @Override // defpackage.ei6
    public final c I() {
        return new c(this.t);
    }

    @Override // defpackage.ei6
    public final a entrySet() {
        return new a(this.t);
    }

    @Override // defpackage.x7b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x7b)) {
            return false;
        }
        x7b x7bVar = (x7b) obj;
        if (!x7bVar.z()) {
            return false;
        }
        return I().equals(x7bVar.t().I());
    }

    public final int hashCode() {
        int i = 0;
        int iHashCode = 0;
        while (true) {
            x7b[] x7bVarArr = this.t;
            if (i >= x7bVarArr.length) {
                return iHashCode;
            }
            iHashCode += x7bVarArr[i + 1].hashCode() ^ x7bVarArr[i].hashCode();
            i += 2;
        }
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        x7b[] x7bVarArr = this.t;
        messagePacker.packMapHeader(x7bVarArr.length / 2);
        for (x7b x7bVar : x7bVarArr) {
            x7bVar.i(messagePacker);
        }
    }

    @Override // defpackage.x7b
    public final String j() {
        x7b[] x7bVarArr = this.t;
        if (x7bVarArr.length == 0) {
            return "{}";
        }
        StringBuilder sbA = bl2.a("{");
        x7b x7bVar = x7bVarArr[0];
        if (x7bVar.o()) {
            sbA.append(x7bVar.j());
        } else {
            f1.T(x7bVar.toString(), sbA);
        }
        sbA.append(":");
        sbA.append(x7bVarArr[1].j());
        for (int i = 2; i < x7bVarArr.length; i += 2) {
            sbA.append(",");
            x7b x7bVar2 = x7bVarArr[i];
            if (x7bVar2.o()) {
                sbA.append(x7bVar2.j());
            } else {
                f1.T(x7bVar2.toString(), sbA);
            }
            sbA.append(":");
            sbA.append(x7bVarArr[i + 1].j());
        }
        sbA.append("}");
        return sbA.toString();
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.B;
    }

    public final String toString() {
        x7b[] x7bVarArr = this.t;
        if (x7bVarArr.length == 0) {
            return "{}";
        }
        StringBuilder sbA = bl2.a("{");
        T(sbA, x7bVarArr[0]);
        sbA.append(":");
        T(sbA, x7bVarArr[1]);
        for (int i = 2; i < x7bVarArr.length; i += 2) {
            sbA.append(",");
            T(sbA, x7bVarArr[i]);
            sbA.append(":");
            T(sbA, x7bVarArr[i + 1]);
        }
        sbA.append("}");
        return sbA.toString();
    }

    @Override // defpackage.g1
    /* JADX INFO: renamed from: R */
    public final n95 t() {
        return this;
    }

    @Override // defpackage.g1, defpackage.x7b
    public final ei6 t() {
        return this;
    }
}
