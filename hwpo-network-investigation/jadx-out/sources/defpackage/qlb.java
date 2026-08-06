package defpackage;

import j$.time.LocalDate;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qlb {
    public static final a Companion = new a();
    public final List<LocalDate> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static qlb a(LocalDate localDate) {
            localDate.getClass();
            LocalDate localDateA = localDate.a(WeekFields.of(Locale.getDefault()).dayOfWeek(), 1L);
            ArrayList arrayList = new ArrayList();
            localDateA.getClass();
            arrayList.add(localDateA);
            for (int i = 0; i < 6; i++) {
                localDateA = localDateA.plusDays(1L);
                localDateA.getClass();
                arrayList.add(localDateA);
            }
            return new qlb(th1.T(arrayList));
        }
    }

    public qlb(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlb) && xj5.a(this.a, ((qlb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Week(days=" + this.a + ", selectedDay=null)";
    }
}
