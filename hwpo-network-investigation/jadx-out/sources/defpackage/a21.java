package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a21 implements Parcelable {
    public static final Parcelable.Creator<a21> CREATOR = new a();
    public final by6 t;
    public final by6 u;
    public final c v;
    public by6 w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<a21> {
        @Override // android.os.Parcelable.Creator
        public final a21 createFromParcel(Parcel parcel) {
            return new a21((by6) parcel.readParcelable(by6.class.getClassLoader()), (by6) parcel.readParcelable(by6.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (by6) parcel.readParcelable(by6.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a21[] newArray(int i) {
            return new a21[i];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final long f = f6b.a(by6.f(1900, 0).y);
        public static final long g = f6b.a(by6.f(2100, 11).y);
        public Long c;
        public int d;
        public long a = f;
        public long b = g;
        public c e = new al2(Long.MIN_VALUE);

        public final a21 a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            by6 by6VarG = by6.g(this.a);
            by6 by6VarG2 = by6.g(this.b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new a21(by6VarG, by6VarG2, cVar, l == null ? null : by6.g(l.longValue()), this.d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface c extends Parcelable {
        boolean p(long j);
    }

    public a21(by6 by6Var, by6 by6Var2, c cVar, by6 by6Var3, int i) {
        Objects.requireNonNull(by6Var, "start cannot be null");
        Objects.requireNonNull(by6Var2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.t = by6Var;
        this.u = by6Var2;
        this.w = by6Var3;
        this.x = i;
        this.v = cVar;
        if (by6Var3 != null && by6Var.t.compareTo(by6Var3.t) > 0) {
            z90.a("start Month cannot be after current Month");
            throw null;
        }
        if (by6Var3 != null && by6Var3.t.compareTo(by6Var2.t) > 0) {
            z90.a("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > f6b.e(null).getMaximum(7)) {
            z90.a("firstDayOfWeek is not valid");
            throw null;
        }
        this.z = by6Var.j(by6Var2) + 1;
        this.y = (by6Var2.v - by6Var.v) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a21)) {
            return false;
        }
        a21 a21Var = (a21) obj;
        return this.t.equals(a21Var.t) && this.u.equals(a21Var.u) && Objects.equals(this.w, a21Var.w) && this.x == a21Var.x && this.v.equals(a21Var.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.t, this.u, this.w, Integer.valueOf(this.x), this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.t, 0);
        parcel.writeParcelable(this.u, 0);
        parcel.writeParcelable(this.w, 0);
        parcel.writeParcelable(this.v, 0);
        parcel.writeInt(this.x);
    }
}
