package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a4b {
    public final ebb a;
    public final int b;
    public final String c;
    public final m2b d;
    public final Number e;
    public final Number f;
    public final String g;
    public final ArrayList h;

    public a4b(ebb ebbVar, int i, String str, m2b m2bVar, Number number, Integer num, String str2, ArrayList arrayList) {
        ebbVar.getClass();
        m2bVar.getClass();
        number.getClass();
        this.a = ebbVar;
        this.b = i;
        this.c = str;
        this.d = m2bVar;
        this.e = number;
        this.f = num;
        this.g = str2;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4b)) {
            return false;
        }
        a4b a4bVar = (a4b) obj;
        return this.a == a4bVar.a && this.b == a4bVar.b && this.c.equals(a4bVar.c) && this.d == a4bVar.d && xj5.a(this.e, a4bVar.e) && xj5.a(this.f, a4bVar.f) && this.g.equals(a4bVar.g) && this.h.equals(a4bVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ru3.c(os2.a(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31)) * 31;
        Number number = this.f;
        return this.h.hashCode() + ru3.c((iHashCode + (number == null ? 0 : number.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        return "UpdateValueParams(valueType=" + this.a + ", id=" + this.b + ", date=" + this.c + ", units=" + this.d + ", value=" + this.e + ", secondValue=" + this.f + ", note=" + this.g + ", attachments=" + this.h + ")";
    }
}
