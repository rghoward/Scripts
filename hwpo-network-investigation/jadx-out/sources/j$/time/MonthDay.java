package j$.time;

import com.intercom.twig.BuildConfig;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.c0;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.q;
import j$.time.temporal.s;
import j$.time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class MonthDay implements TemporalAccessor, j$.time.temporal.n, Comparable<MonthDay>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.e("--");
        dateTimeFormatterBuilder.m(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.d('-');
        dateTimeFormatterBuilder.m(j$.time.temporal.a.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.r(Locale.getDefault(), c0.SMART, null);
    }

    public MonthDay(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static MonthDay of(int i, int i2) {
        Month monthO = Month.O(i);
        Objects.requireNonNull(monthO, "month");
        j$.time.temporal.a.DAY_OF_MONTH.e0(i2);
        if (i2 <= monthO.L()) {
            return new MonthDay(monthO.getValue(), i2);
        }
        throw new b("Illegal value for DayOfMonth field, value " + i2 + " is not valid for month " + monthO.name());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new l((byte) 13, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(MonthDay monthDay) {
        MonthDay monthDay2 = monthDay;
        int i = this.a - monthDay2.a;
        return i == 0 ? this.b - monthDay2.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(e eVar) {
        return eVar == q.b ? j$.time.chrono.p.d : super.d(eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MonthDay) {
            MonthDay monthDay = (MonthDay) obj;
            if (this.a == monthDay.a && this.b == monthDay.b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m f(j$.time.temporal.m mVar) {
        if (!Chronology.p(mVar).equals(j$.time.chrono.p.d)) {
            j$.nio.file.k.h("Adjustment only supported on ISO date-time");
            return null;
        }
        j$.time.temporal.m mVarA = mVar.a(j$.time.temporal.a.MONTH_OF_YEAR, this.a);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarA.a(aVar, Math.min(mVarA.l(aVar).d, this.b));
    }

    public int getDayOfMonth() {
        return this.b;
    }

    public int getMonthValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        return l(temporalField).a(temporalField, k(temporalField));
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof j$.time.temporal.a) {
            return temporalField == j$.time.temporal.a.MONTH_OF_YEAR || temporalField == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return temporalField != null && temporalField.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof j$.time.temporal.a)) {
            return temporalField.V(this);
        }
        int i2 = j.a[((j$.time.temporal.a) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new s(c.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final t l(TemporalField temporalField) {
        int i;
        if (temporalField == j$.time.temporal.a.MONTH_OF_YEAR) {
            return temporalField.O();
        }
        if (temporalField != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.l(temporalField);
        }
        Month monthO = Month.O(this.a);
        monthO.getClass();
        int i2 = i.a[monthO.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return t.g(1L, i, Month.O(this.a).L());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : BuildConfig.FLAVOR);
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }
}
