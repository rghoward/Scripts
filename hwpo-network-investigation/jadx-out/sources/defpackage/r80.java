package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r80 {
    public final k95<s80> a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public r80(k95<s80> k95Var) {
        this.a = k95Var;
        s80.a aVar = s80.a.e;
        this.d = false;
    }

    @Deprecated
    public final void a() {
        s80.b bVar = s80.b.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long jN = bVar.a;
        int i = 0;
        while (true) {
            k95<s80> k95Var = this.a;
            if (i >= k95Var.size()) {
                break;
            }
            s80 s80Var = k95Var.get(i);
            s80Var.j(new s80.b(jN));
            if (s80Var.h()) {
                jN = s80Var.n(jN);
                xl7.r(jN >= 0);
                arrayList.add(s80Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((s80) arrayList.get(i2)).i();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((s80) this.b.get(b())).d() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= b(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    s80 s80Var = (s80) arrayList.get(i);
                    if (!s80Var.d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : s80.a;
                        long jRemaining = byteBuffer2.remaining();
                        s80Var.k(byteBuffer2);
                        this.c[i] = s80Var.i();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((s80) arrayList.get(i + 1)).m();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r80)) {
            return false;
        }
        k95<s80> k95Var = ((r80) obj).a;
        k95<s80> k95Var2 = this.a;
        if (k95Var2.size() != k95Var.size()) {
            return false;
        }
        for (int i = 0; i < k95Var2.size(); i++) {
            if (k95Var2.get(i) != k95Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
