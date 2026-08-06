package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xfc extends fac implements jgc {
    public xfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.jgc
    public final List A(String str, String str2, q1d q1dVar) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        iac.b(parcelG, q1dVar);
        Parcel parcelA = a(parcelG, 16);
        ArrayList arrayListCreateTypedArrayList = parcelA.createTypedArrayList(e5c.CREATOR);
        parcelA.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.jgc
    public final byte[] B(String str, z9c z9cVar) {
        Parcel parcelG = g();
        iac.b(parcelG, z9cVar);
        parcelG.writeString(str);
        Parcel parcelA = a(parcelG, 9);
        byte[] bArrCreateByteArray = parcelA.createByteArray();
        parcelA.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.jgc
    public final void C(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        i(parcelG, 27);
    }

    @Override // defpackage.jgc
    public final void E(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        i(parcelG, 20);
    }

    @Override // defpackage.jgc
    public final void F(q1d q1dVar, c3c c3cVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        iac.b(parcelG, c3cVar);
        i(parcelG, 30);
    }

    @Override // defpackage.jgc
    public final String G(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        Parcel parcelA = a(parcelG, 11);
        String string = parcelA.readString();
        parcelA.recycle();
        return string;
    }

    @Override // defpackage.jgc
    public final void I(Bundle bundle, q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, bundle);
        iac.b(parcelG, q1dVar);
        i(parcelG, 19);
    }

    @Override // defpackage.jgc
    public final void J(e5c e5cVar, q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, e5cVar);
        iac.b(parcelG, q1dVar);
        i(parcelG, 12);
    }

    @Override // defpackage.jgc
    public final void M(q1d q1dVar, Bundle bundle, pgc pgcVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        iac.b(parcelG, bundle);
        iac.c(parcelG, pgcVar);
        i(parcelG, 31);
    }

    @Override // defpackage.jgc
    public final void N(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        i(parcelG, 18);
    }

    @Override // defpackage.jgc
    public final List k(String str, String str2, String str3, boolean z) {
        Parcel parcelG = g();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        ClassLoader classLoader = iac.a;
        parcelG.writeInt(z ? 1 : 0);
        Parcel parcelA = a(parcelG, 15);
        ArrayList arrayListCreateTypedArrayList = parcelA.createTypedArrayList(szc.CREATOR);
        parcelA.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.jgc
    public final void m(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        i(parcelG, 25);
    }

    @Override // defpackage.jgc
    public final void n(String str, long j, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeLong(j);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        i(parcelG, 10);
    }

    @Override // defpackage.jgc
    public final void o(z9c z9cVar, q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, z9cVar);
        iac.b(parcelG, q1dVar);
        i(parcelG, 1);
    }

    @Override // defpackage.jgc
    public final List q(String str, String str2, boolean z, q1d q1dVar) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = iac.a;
        parcelG.writeInt(z ? 1 : 0);
        iac.b(parcelG, q1dVar);
        Parcel parcelA = a(parcelG, 14);
        ArrayList arrayListCreateTypedArrayList = parcelA.createTypedArrayList(szc.CREATOR);
        parcelA.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.jgc
    public final void r(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        i(parcelG, 6);
    }

    @Override // defpackage.jgc
    public final void s(q1d q1dVar, yxc yxcVar, ugc ugcVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        iac.b(parcelG, yxcVar);
        iac.c(parcelG, ugcVar);
        i(parcelG, 29);
    }

    @Override // defpackage.jgc
    public final void t(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        i(parcelG, 26);
    }

    @Override // defpackage.jgc
    public final void u(szc szcVar, q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, szcVar);
        iac.b(parcelG, q1dVar);
        i(parcelG, 2);
    }

    @Override // defpackage.jgc
    public final List w(String str, String str2, String str3) {
        Parcel parcelG = g();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        Parcel parcelA = a(parcelG, 17);
        ArrayList arrayListCreateTypedArrayList = parcelA.createTypedArrayList(e5c.CREATOR);
        parcelA.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.jgc
    public final z7c x(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        Parcel parcelA = a(parcelG, 21);
        z7c z7cVar = (z7c) iac.a(parcelA, z7c.CREATOR);
        parcelA.recycle();
        return z7cVar;
    }

    @Override // defpackage.jgc
    public final void z(q1d q1dVar) {
        Parcel parcelG = g();
        iac.b(parcelG, q1dVar);
        i(parcelG, 4);
    }
}
