package defpackage;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class id8 {
    public final LocalDate a;
    public final Exception b;
    public final jd8 c;

    public id8(LocalDate localDate, Exception exc, jd8 jd8Var) {
        localDate.getClass();
        jd8Var.getClass();
        this.a = localDate;
        this.b = exc;
        this.c = jd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id8)) {
            return false;
        }
        id8 id8Var = (id8) obj;
        return xj5.a(this.a, id8Var.a) && xj5.a(this.b, id8Var.b) && xj5.a(this.c, id8Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Exception exc = this.b;
        return this.c.hashCode() + ((iHashCode + (exc == null ? 0 : exc.hashCode())) * 31);
    }

    public final String toString() {
        return "ProgramUpdate(date=" + this.a + ", error=" + this.b + ", programsAndLaunchDates=" + this.c + ")";
    }
}
