package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class by6 implements Comparable<by6>, Parcelable {
    public static final Parcelable.Creator<by6> CREATOR = new a();
    public final Calendar t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final long y;
    public String z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<by6> {
        @Override // android.os.Parcelable.Creator
        public final by6 createFromParcel(Parcel parcel) {
            return by6.f(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final by6[] newArray(int i) {
            return new by6[i];
        }
    }

    public by6(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = f6b.c(calendar);
        this.t = calendarC;
        this.u = calendarC.get(2);
        this.v = calendarC.get(1);
        this.w = calendarC.getMaximum(7);
        this.x = calendarC.getActualMaximum(5);
        this.y = calendarC.getTimeInMillis();
    }

    public static by6 f(int i, int i2) {
        Calendar calendarE = f6b.e(null);
        calendarE.set(1, i);
        calendarE.set(2, i2);
        return new by6(calendarE);
    }

    public static by6 g(long j) {
        Calendar calendarE = f6b.e(null);
        calendarE.setTimeInMillis(j);
        return new by6(calendarE);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(by6 by6Var) {
        return this.t.compareTo(by6Var.t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by6)) {
            return false;
        }
        by6 by6Var = (by6) obj;
        return this.u == by6Var.u && this.v == by6Var.v;
    }

    public final String h() {
        if (this.z == null) {
            this.z = f6b.b("yMMMM", Locale.getDefault()).format(new Date(this.t.getTimeInMillis()));
        }
        return this.z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.u), Integer.valueOf(this.v)});
    }

    public final int j(by6 by6Var) {
        if (this.t instanceof GregorianCalendar) {
            return (by6Var.u - this.u) + ((by6Var.v - this.v) * 12);
        }
        z90.a("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.v);
        parcel.writeInt(this.u);
    }
}
