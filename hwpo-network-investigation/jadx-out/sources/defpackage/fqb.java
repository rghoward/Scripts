package defpackage;

import j$.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fqb implements el0 {
    public final LocalDate a;
    public final LocalDate b;
    public final qm2 c;
    public final LocalDate d;
    public final int e;
    public final LocalDate f;
    public final String g;
    public final boolean h;
    public final List<rlb> i;

    public fqb(LocalDate localDate, LocalDate localDate2, qm2 qm2Var, LocalDate localDate3, int i, LocalDate localDate4, String str, boolean z, List<rlb> list) {
        localDate3.getClass();
        localDate4.getClass();
        list.getClass();
        this.a = localDate;
        this.b = localDate2;
        this.c = qm2Var;
        this.d = localDate3;
        this.e = i;
        this.f = localDate4;
        this.g = str;
        this.h = z;
        this.i = list;
    }

    public static fqb a(fqb fqbVar, LocalDate localDate, LocalDate localDate2, qm2 qm2Var, LocalDate localDate3, int i, LocalDate localDate4, String str, boolean z, List list, int i2) {
        if ((i2 & 1) != 0) {
            localDate = fqbVar.a;
        }
        LocalDate localDate5 = localDate;
        if ((i2 & 2) != 0) {
            localDate2 = fqbVar.b;
        }
        LocalDate localDate6 = localDate2;
        if ((i2 & 4) != 0) {
            qm2Var = fqbVar.c;
        }
        qm2 qm2Var2 = qm2Var;
        if ((i2 & 8) != 0) {
            localDate3 = fqbVar.d;
        }
        LocalDate localDate7 = localDate3;
        if ((i2 & 16) != 0) {
            i = fqbVar.e;
        }
        int i3 = i;
        LocalDate localDate8 = (i2 & 32) != 0 ? fqbVar.f : localDate4;
        String str2 = (i2 & 64) != 0 ? fqbVar.g : str;
        boolean z2 = (i2 & 128) != 0 ? fqbVar.h : z;
        List list2 = (i2 & 256) != 0 ? fqbVar.i : list;
        fqbVar.getClass();
        localDate5.getClass();
        localDate6.getClass();
        localDate7.getClass();
        localDate8.getClass();
        list2.getClass();
        return new fqb(localDate5, localDate6, qm2Var2, localDate7, i3, localDate8, str2, z2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqb)) {
            return false;
        }
        fqb fqbVar = (fqb) obj;
        return this.a.equals(fqbVar.a) && this.b.equals(fqbVar.b) && this.c.equals(fqbVar.c) && xj5.a(this.d, fqbVar.d) && this.e == fqbVar.e && xj5.a(this.f, fqbVar.f) && this.g.equals(fqbVar.g) && this.h == fqbVar.h && xj5.a(this.i, fqbVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + uo2.a(ru3.c((this.f.hashCode() + os2.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31, 31, this.g), this.h, 31);
    }

    public final String toString() {
        return "WorkoutsViewState(initDate=" + this.a + ", selectedDate=" + this.b + ", pagerDays=" + this.c + ", startOfWeek=" + this.d + ", selectedDayIndex=" + this.e + ", endOfWeek=" + this.f + ", selectedDateFormatted=" + this.g + ", isWeekLoading=" + this.h + ", weeksViewData=" + this.i + ")";
    }
}
