package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.intercom.twig.BuildConfig;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zdb extends ydb {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public zdb(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new n30(), new n30(), new n30());
    }

    @Override // defpackage.ydb
    public final zdb a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new zdb(parcel, iDataPosition, i, av.a(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.ydb
    public final boolean e() {
        return this.e.readInt() != 0;
    }

    @Override // defpackage.ydb
    public final byte[] f() {
        Parcel parcel = this.e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // defpackage.ydb
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // defpackage.ydb
    public final boolean h(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 >= this.g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i5;
        }
    }

    @Override // defpackage.ydb
    public final int i() {
        return this.e.readInt();
    }

    @Override // defpackage.ydb
    public final <T extends Parcelable> T j() {
        return (T) this.e.readParcelable(zdb.class.getClassLoader());
    }

    @Override // defpackage.ydb
    public final String k() {
        return this.e.readString();
    }

    @Override // defpackage.ydb
    public final void m(int i) {
        u();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        q(0);
        q(i);
    }

    @Override // defpackage.ydb
    public final void n(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // defpackage.ydb
    public final void o(byte[] bArr) {
        Parcel parcel = this.e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // defpackage.ydb
    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // defpackage.ydb
    public final void q(int i) {
        this.e.writeInt(i);
    }

    @Override // defpackage.ydb
    public final void r(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // defpackage.ydb
    public final void s(String str) {
        this.e.writeString(str);
    }

    public final void u() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            Parcel parcel = this.e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    public zdb(Parcel parcel, int i, int i2, String str, n30<String, Method> n30Var, n30<String, Method> n30Var2, n30<String, Class> n30Var3) {
        super(n30Var, n30Var2, n30Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
