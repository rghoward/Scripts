package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class q1d extends p2 {
    public static final Parcelable.Creator<q1d> CREATOR = new s2d();
    public final boolean A;
    public final boolean B;
    public final long C;
    public final String D;
    public final long E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final Boolean I;
    public final long J;
    public final List K;
    public final String L;
    public final String M;
    public final String N;
    public final boolean O;
    public final long P;
    public final int Q;
    public final String R;
    public final int S;
    public final long T;
    public final String U;
    public final String V;
    public final long W;
    public final int X;
    public final long Y;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final long x;
    public final long y;
    public final String z;

    public q1d(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        a78.d(str);
        this.t = str;
        this.u = true == TextUtils.isEmpty(str2) ? null : str2;
        this.v = str3;
        this.C = j;
        this.w = str4;
        this.x = j2;
        this.y = j3;
        this.z = str5;
        this.A = z;
        this.B = z2;
        this.D = str6;
        this.E = j4;
        this.F = i;
        this.G = z3;
        this.H = z4;
        this.I = bool;
        this.J = j5;
        this.K = list;
        this.L = str7;
        this.M = str8;
        this.N = str9;
        this.O = z5;
        this.P = j6;
        this.Q = i2;
        this.R = str10;
        this.S = i3;
        this.T = j7;
        this.U = str11;
        this.V = str12;
        this.W = j8;
        this.X = i4;
        this.Y = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = ms3.m(parcel, 20293);
        ms3.i(parcel, 2, this.t);
        ms3.i(parcel, 3, this.u);
        ms3.i(parcel, 4, this.v);
        ms3.i(parcel, 5, this.w);
        ms3.l(parcel, 6, 8);
        parcel.writeLong(this.x);
        ms3.l(parcel, 7, 8);
        parcel.writeLong(this.y);
        ms3.i(parcel, 8, this.z);
        ms3.l(parcel, 9, 4);
        parcel.writeInt(this.A ? 1 : 0);
        ms3.l(parcel, 10, 4);
        parcel.writeInt(this.B ? 1 : 0);
        ms3.l(parcel, 11, 8);
        parcel.writeLong(this.C);
        ms3.i(parcel, 12, this.D);
        ms3.l(parcel, 14, 8);
        parcel.writeLong(this.E);
        ms3.l(parcel, 15, 4);
        parcel.writeInt(this.F);
        ms3.l(parcel, 16, 4);
        parcel.writeInt(this.G ? 1 : 0);
        ms3.l(parcel, 18, 4);
        parcel.writeInt(this.H ? 1 : 0);
        Boolean bool = this.I;
        if (bool != null) {
            ms3.l(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ms3.l(parcel, 22, 8);
        parcel.writeLong(this.J);
        List<String> list = this.K;
        if (list != null) {
            int iM2 = ms3.m(parcel, 23);
            parcel.writeStringList(list);
            ms3.n(parcel, iM2);
        }
        ms3.i(parcel, 25, this.L);
        ms3.i(parcel, 26, this.M);
        ms3.i(parcel, 27, this.N);
        ms3.l(parcel, 28, 4);
        parcel.writeInt(this.O ? 1 : 0);
        ms3.l(parcel, 29, 8);
        parcel.writeLong(this.P);
        ms3.l(parcel, 30, 4);
        parcel.writeInt(this.Q);
        ms3.i(parcel, 31, this.R);
        ms3.l(parcel, 32, 4);
        parcel.writeInt(this.S);
        ms3.l(parcel, 34, 8);
        parcel.writeLong(this.T);
        ms3.i(parcel, 35, this.U);
        ms3.i(parcel, 36, this.V);
        ms3.l(parcel, 37, 8);
        parcel.writeLong(this.W);
        ms3.l(parcel, 38, 4);
        parcel.writeInt(this.X);
        ms3.l(parcel, 39, 8);
        parcel.writeLong(this.Y);
        ms3.n(parcel, iM);
    }

    public q1d(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.C = j3;
        this.w = str4;
        this.x = j;
        this.y = j2;
        this.z = str5;
        this.A = z;
        this.B = z2;
        this.D = str6;
        this.E = j4;
        this.F = i;
        this.G = z3;
        this.H = z4;
        this.I = bool;
        this.J = j5;
        this.K = arrayList;
        this.L = str7;
        this.M = str8;
        this.N = str9;
        this.O = z5;
        this.P = j6;
        this.Q = i2;
        this.R = str10;
        this.S = i3;
        this.T = j7;
        this.U = str11;
        this.V = str12;
        this.W = j8;
        this.X = i4;
        this.Y = j9;
    }
}
