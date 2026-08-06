package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import org.msgpack.core.MessagePacker;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class v85 extends g1 implements u85 {
    public static final v85 u = new v85(new x7b[0]);
    public final x7b[] t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements Iterator<x7b> {
        public final x7b[] t;
        public int u = 0;

        public a(x7b[] x7bVarArr) {
            this.t = x7bVarArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.u != this.t.length;
        }

        @Override // java.util.Iterator
        public final x7b next() {
            int i = this.u;
            x7b[] x7bVarArr = this.t;
            if (i < x7bVarArr.length) {
                this.u = i + 1;
                return x7bVarArr[i];
            }
            vl.b();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public v85(x7b[] x7bVarArr) {
        this.t = x7bVarArr;
    }

    @Override // defpackage.x7b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x7b) {
            x7b x7bVar = (x7b) obj;
            boolean z = x7bVar instanceof v85;
            x7b[] x7bVarArr = this.t;
            if (z) {
                return Arrays.equals(x7bVarArr, ((v85) x7bVar).t);
            }
            if (x7bVar.F()) {
                u85 u85VarL = x7bVar.l();
                if (x7bVarArr.length == ((v85) u85VarL).t.length) {
                    Iterator<x7b> it = ((v85) u85VarL).iterator();
                    for (x7b x7bVar2 : x7bVarArr) {
                        a aVar = (a) it;
                        if (aVar.hasNext() && x7bVar2.equals(aVar.next())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        int i = 0;
        while (true) {
            x7b[] x7bVarArr = this.t;
            if (i >= x7bVarArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + x7bVarArr[i].hashCode();
            i++;
        }
    }

    @Override // defpackage.x7b
    public final void i(MessagePacker messagePacker) {
        x7b[] x7bVarArr = this.t;
        messagePacker.packArrayHeader(x7bVarArr.length);
        for (x7b x7bVar : x7bVarArr) {
            x7bVar.i(messagePacker);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<x7b> iterator() {
        return new a(this.t);
    }

    @Override // defpackage.x7b
    public final String j() {
        x7b[] x7bVarArr = this.t;
        if (x7bVarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(x7bVarArr[0].j());
        for (int i = 1; i < x7bVarArr.length; i++) {
            sb.append(",");
            sb.append(x7bVarArr[i].j());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.x7b
    public final dbb p() {
        return dbb.A;
    }

    public final String toString() {
        x7b[] x7bVarArr = this.t;
        if (x7bVarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        x7b x7bVar = x7bVarArr[0];
        if (x7bVar.o()) {
            sb.append(x7bVar.j());
        } else {
            sb.append(x7bVar.toString());
        }
        for (int i = 1; i < x7bVarArr.length; i++) {
            sb.append(",");
            x7b x7bVar2 = x7bVarArr[i];
            if (x7bVar2.o()) {
                sb.append(x7bVar2.j());
            } else {
                sb.append(x7bVar2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.g1
    /* JADX INFO: renamed from: L */
    public final u85 l() {
        return this;
    }

    @Override // defpackage.g1, defpackage.x7b
    public final u85 l() {
        return this;
    }
}
