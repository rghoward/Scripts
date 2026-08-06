package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class igc extends gac implements jgc {
    @Override // defpackage.gac
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        ArrayList arrayList = null;
        pgc lgcVar = null;
        ugc qgcVar = null;
        switch (i) {
            case 1:
                z9c z9cVar = (z9c) iac.a(parcel, z9c.CREATOR);
                q1d q1dVar = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).o(z9cVar, q1dVar);
                parcel2.writeNoException();
                return true;
            case 2:
                szc szcVar = (szc) iac.a(parcel, szc.CREATOR);
                q1d q1dVar2 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).u(szcVar, q1dVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                q1d q1dVar3 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).z(q1dVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                z9c z9cVar2 = (z9c) iac.a(parcel, z9c.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                iac.d(parcel);
                zmc zmcVar = (zmc) this;
                a78.g(z9cVar2);
                a78.d(string);
                zmcVar.O(string, true);
                zmcVar.P(new wlc(zmcVar, z9cVar2, string));
                parcel2.writeNoException();
                return true;
            case 6:
                q1d q1dVar4 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).r(q1dVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                q1d q1dVar5 = (q1d) iac.a(parcel, q1d.CREATOR);
                z = parcel.readInt() != 0;
                iac.d(parcel);
                zmc zmcVar2 = (zmc) this;
                zmcVar2.i(q1dVar5);
                String str = q1dVar5.t;
                a78.g(str);
                lzc lzcVar = zmcVar2.b;
                try {
                    List<vzc> list2 = (List) lzcVar.e().n(new vkc(zmcVar2, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (vzc vzcVar : list2) {
                        if (z || !yzc.L(vzcVar.c)) {
                            arrayList2.add(new szc(vzcVar));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    lzcVar.b().f.c(thc.o(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e2) {
                    e = e2;
                    lzcVar.b().f.c(thc.o(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                z9c z9cVar3 = (z9c) iac.a(parcel, z9c.CREATOR);
                String string2 = parcel.readString();
                iac.d(parcel);
                byte[] bArrB = ((zmc) this).B(string2, z9cVar3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrB);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                iac.d(parcel);
                ((zmc) this).n(string3, j, string4, string5);
                parcel2.writeNoException();
                return true;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                q1d q1dVar6 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                String strG = ((zmc) this).G(q1dVar6);
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 12:
                e5c e5cVar = (e5c) iac.a(parcel, e5c.CREATOR);
                q1d q1dVar7 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).J(e5cVar, q1dVar7);
                parcel2.writeNoException();
                return true;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                e5c e5cVar2 = (e5c) iac.a(parcel, e5c.CREATOR);
                iac.d(parcel);
                zmc zmcVar3 = (zmc) this;
                a78.g(e5cVar2);
                a78.g(e5cVar2.v);
                a78.d(e5cVar2.t);
                zmcVar3.O(e5cVar2.t, true);
                zmcVar3.P(new flc(zmcVar3, new e5c(e5cVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = iac.a;
                z = parcel.readInt() != 0;
                q1d q1dVar8 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                List listQ = ((zmc) this).q(string6, string7, z, q1dVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listQ);
                return true;
            case h4c.e /* 15 */:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = iac.a;
                z = parcel.readInt() != 0;
                iac.d(parcel);
                List listK = ((zmc) this).k(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listK);
                return true;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                q1d q1dVar9 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                List listA = ((zmc) this).A(string11, string12, q1dVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listA);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                iac.d(parcel);
                List listW = ((zmc) this).w(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listW);
                return true;
            case 18:
                q1d q1dVar10 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).N(q1dVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) iac.a(parcel, Bundle.CREATOR);
                q1d q1dVar11 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).I(bundle, q1dVar11);
                parcel2.writeNoException();
                return true;
            case InboxPagingSource.PAGE_SIZE /* 20 */:
                q1d q1dVar12 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).E(q1dVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                q1d q1dVar13 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                z7c z7cVarX = ((zmc) this).x(q1dVar13);
                parcel2.writeNoException();
                if (z7cVarX == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                z7cVarX.writeToParcel(parcel2, 1);
                return true;
            case 24:
                q1d q1dVar14 = (q1d) iac.a(parcel, q1d.CREATOR);
                Bundle bundle2 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                iac.d(parcel);
                zmc zmcVar4 = (zmc) this;
                zmcVar4.i(q1dVar14);
                String str2 = q1dVar14.t;
                a78.g(str2);
                lzc lzcVar2 = zmcVar4.b;
                if (!lzcVar2.f0().r(null, wfc.T0)) {
                    try {
                        list = (List) lzcVar2.e().n(new emc(zmcVar4, q1dVar14, bundle2)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        lzcVar2.b().f.c(thc.o(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) lzcVar2.e().o(new cmc(zmcVar4, q1dVar14, bundle2)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        lzcVar2.b().f.c(thc.o(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                q1d q1dVar15 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).m(q1dVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                q1d q1dVar16 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).t(q1dVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                q1d q1dVar17 = (q1d) iac.a(parcel, q1d.CREATOR);
                iac.d(parcel);
                ((zmc) this).C(q1dVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                q1d q1dVar18 = (q1d) iac.a(parcel, q1d.CREATOR);
                yxc yxcVar = (yxc) iac.a(parcel, yxc.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    qgcVar = iInterfaceQueryLocalInterface instanceof ugc ? (ugc) iInterfaceQueryLocalInterface : new qgc(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                }
                iac.d(parcel);
                ((zmc) this).s(q1dVar18, yxcVar, qgcVar);
                parcel2.writeNoException();
                return true;
            case 30:
                q1d q1dVar19 = (q1d) iac.a(parcel, q1d.CREATOR);
                c3c c3cVar = (c3c) iac.a(parcel, c3c.CREATOR);
                iac.d(parcel);
                ((zmc) this).F(q1dVar19, c3cVar);
                parcel2.writeNoException();
                return true;
            case 31:
                q1d q1dVar20 = (q1d) iac.a(parcel, q1d.CREATOR);
                Bundle bundle3 = (Bundle) iac.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    lgcVar = iInterfaceQueryLocalInterface2 instanceof pgc ? (pgc) iInterfaceQueryLocalInterface2 : new lgc(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                }
                iac.d(parcel);
                ((zmc) this).M(q1dVar20, bundle3, lgcVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
