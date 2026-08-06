package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class psc implements Parcelable.Creator {
    public static void a(kl4 kl4Var, Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        int i2 = kl4Var.t;
        ms3.l(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = kl4Var.u;
        ms3.l(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = kl4Var.v;
        ms3.l(parcel, 3, 4);
        parcel.writeInt(i4);
        ms3.i(parcel, 4, kl4Var.w);
        ms3.f(parcel, 5, kl4Var.x);
        ms3.j(parcel, 6, kl4Var.y, i);
        ms3.c(parcel, 7, kl4Var.z);
        ms3.h(parcel, 8, kl4Var.A, i);
        ms3.j(parcel, 10, kl4Var.B, i);
        ms3.j(parcel, 11, kl4Var.C, i);
        boolean z = kl4Var.D;
        ms3.l(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = kl4Var.E;
        ms3.l(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = kl4Var.F;
        ms3.l(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ms3.i(parcel, 15, kl4Var.G);
        ms3.n(parcel, iM);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iP = sz8.p(parcel);
        Bundle bundle = new Bundle();
        Scope[] scopeArr = kl4.H;
        String strF = null;
        IBinder iBinderK = null;
        Account account = null;
        String strF2 = null;
        int iL = 0;
        int iL2 = 0;
        int iL3 = 0;
        boolean zJ = false;
        int iL4 = 0;
        boolean zJ2 = false;
        fu3[] fu3VarArr = kl4.I;
        fu3[] fu3VarArr2 = fu3VarArr;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iL = sz8.l(parcel, i);
                    break;
                case 2:
                    iL2 = sz8.l(parcel, i);
                    break;
                case 3:
                    iL3 = sz8.l(parcel, i);
                    break;
                case 4:
                    strF = sz8.f(parcel, i);
                    break;
                case 5:
                    iBinderK = sz8.k(parcel, i);
                    break;
                case 6:
                    scopeArr = (Scope[]) sz8.g(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundle = sz8.a(parcel, i);
                    break;
                case '\b':
                    account = (Account) sz8.e(parcel, i, Account.CREATOR);
                    break;
                case '\t':
                default:
                    sz8.o(parcel, i);
                    break;
                case '\n':
                    fu3VarArr = (fu3[]) sz8.g(parcel, i, fu3.CREATOR);
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    fu3VarArr2 = (fu3[]) sz8.g(parcel, i, fu3.CREATOR);
                    break;
                case '\f':
                    zJ = sz8.j(parcel, i);
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    iL4 = sz8.l(parcel, i);
                    break;
                case 14:
                    zJ2 = sz8.j(parcel, i);
                    break;
                case h4c.e /* 15 */:
                    strF2 = sz8.f(parcel, i);
                    break;
            }
        }
        sz8.i(parcel, iP);
        return new kl4(iL, iL2, iL3, strF, iBinderK, scopeArr, bundle, account, fu3VarArr, fu3VarArr2, zJ, iL4, zJ2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new kl4[i];
    }
}
