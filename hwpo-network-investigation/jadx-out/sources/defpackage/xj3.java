package defpackage;

import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xj3 {
    public final int a;
    public final String b;
    public final LocalDate c;
    public final double d;
    public final Double e;
    public final String f;
    public final m2b g;
    public final List<m89> h;

    public xj3(int i, String str, LocalDate localDate, double d, Double d2, String str2, m2b m2bVar, List<m89> list) {
        str2.getClass();
        m2bVar.getClass();
        this.a = i;
        this.b = str;
        this.c = localDate;
        this.d = d;
        this.e = d2;
        this.f = str2;
        this.g = m2bVar;
        this.h = list;
    }

    public static xj3 a(xj3 xj3Var, ArrayList arrayList) {
        int i = xj3Var.a;
        String str = xj3Var.b;
        LocalDate localDate = xj3Var.c;
        double d = xj3Var.d;
        Double d2 = xj3Var.e;
        String str2 = xj3Var.f;
        m2b m2bVar = xj3Var.g;
        xj3Var.getClass();
        str2.getClass();
        m2bVar.getClass();
        return new xj3(i, str, localDate, d, d2, str2, m2bVar, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj3)) {
            return false;
        }
        xj3 xj3Var = (xj3) obj;
        return this.a == xj3Var.a && xj5.a(this.b, xj3Var.b) && this.c.equals(xj3Var.c) && Double.compare(this.d, xj3Var.d) == 0 && xj5.a(this.e, xj3Var.e) && xj5.a(this.f, xj3Var.f) && this.g == xj3Var.g && this.h.equals(xj3Var.h);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (Double.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        Double d = this.e;
        return this.h.hashCode() + ((this.g.hashCode() + ru3.c((iHashCode2 + (d != null ? d.hashCode() : 0)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = il.a("EntryDetails(id=", ", note=", this.b, ", date=", this.a);
        sbA.append(this.c);
        sbA.append(", value=");
        sbA.append(this.d);
        sbA.append(", secondValue=");
        sbA.append(this.e);
        sbA.append(", symbol=");
        sbA.append(this.f);
        sbA.append(", units=");
        sbA.append(this.g);
        sbA.append(", attachments=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
