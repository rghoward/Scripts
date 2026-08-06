package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.aa0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int A;
    public final CharSequence B;
    public final int C;
    public final CharSequence D;
    public final ArrayList<String> E;
    public final ArrayList<String> F;
    public final boolean G;
    public final int[] t;
    public final ArrayList<String> u;
    public final int[] v;
    public final int[] w;
    public final int x;
    public final String y;
    public final int z;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.a.size();
        this.t = new int[size * 6];
        if (!aVar.g) {
            aa0.c("Not on back stack");
            throw null;
        }
        this.u = new ArrayList<>(size);
        this.v = new int[size];
        this.w = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            r.a aVar2 = aVar.a.get(i2);
            int i3 = i + 1;
            this.t[i] = aVar2.a;
            ArrayList<String> arrayList = this.u;
            f fVar = aVar2.b;
            arrayList.add(fVar != null ? fVar.mWho : null);
            int[] iArr = this.t;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.v[i2] = aVar2.h.ordinal();
            this.w[i2] = aVar2.i.ordinal();
        }
        this.x = aVar.f;
        this.y = aVar.i;
        this.z = aVar.t;
        this.A = aVar.j;
        this.B = aVar.k;
        this.C = aVar.l;
        this.D = aVar.m;
        this.E = aVar.n;
        this.F = aVar.o;
        this.G = aVar.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.t);
        parcel.writeStringList(this.u);
        parcel.writeIntArray(this.v);
        parcel.writeIntArray(this.w);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        TextUtils.writeToParcel(this.B, parcel, 0);
        parcel.writeInt(this.C);
        TextUtils.writeToParcel(this.D, parcel, 0);
        parcel.writeStringList(this.E);
        parcel.writeStringList(this.F);
        parcel.writeInt(this.G ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.t = parcel.createIntArray();
        this.u = parcel.createStringArrayList();
        this.v = parcel.createIntArray();
        this.w = parcel.createIntArray();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.B = (CharSequence) creator.createFromParcel(parcel);
        this.C = parcel.readInt();
        this.D = (CharSequence) creator.createFromParcel(parcel);
        this.E = parcel.createStringArrayList();
        this.F = parcel.createStringArrayList();
        this.G = parcel.readInt() != 0;
    }
}
