package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class v9c extends p2 implements Iterable<String> {
    public static final Parcelable.Creator<v9c> CREATOR = new x9c();
    public final Bundle t;

    public v9c(Bundle bundle) {
        this.t = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new t9c(this);
    }

    public final Object j(String str) {
        return this.t.get(str);
    }

    public final Double k() {
        return Double.valueOf(this.t.getDouble("value"));
    }

    public final String o() {
        return this.t.getString("currency");
    }

    public final String toString() {
        return this.t.toString();
    }

    public final Bundle v() {
        return new Bundle(this.t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.c(parcel, 2, v());
        ms3.n(parcel, iM);
    }
}
