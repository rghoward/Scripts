package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class co implements jn7 {
    public final Context a;
    public final tx2 b;
    public final long c;
    public final go7 d;

    public co(Context context, tx2 tx2Var, long j, go7 go7Var) {
        this.a = context;
        this.b = tx2Var;
        this.c = j;
        this.d = go7Var;
    }

    @Override // defpackage.jn7
    public final bo a() {
        return new bo(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!co.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        co coVar = (co) obj;
        return xj5.a(this.a, coVar.a) && xj5.a(this.b, coVar.b) && uh1.c(this.c, coVar.c) && xj5.a(this.d, coVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = uh1.l;
        return this.d.hashCode() + al.c(this.c, iHashCode, 31);
    }
}
