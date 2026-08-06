package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a78;
import defpackage.ms3;
import defpackage.p2;
import defpackage.zbc;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends p2 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new zbc();
    public final int t;
    public final String u;

    public Scope(int i, String str) {
        a78.e(str, "scopeUri must not be null or empty");
        this.t = i;
        this.u = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.u.equals(((Scope) obj).u);
    }

    public final int hashCode() {
        return this.u.hashCode();
    }

    public final String toString() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.l(parcel, 1, 4);
        parcel.writeInt(this.t);
        ms3.i(parcel, 2, this.u);
        ms3.n(parcel, iM);
    }
}
