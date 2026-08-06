package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class h83 implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<h83> CREATOR = new a();
    public final b[] t;
    public int u;
    public final String v;
    public final int w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.Creator<h83> {
        @Override // android.os.Parcelable.Creator
        public final h83 createFromParcel(Parcel parcel) {
            return new h83(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h83[] newArray(int i) {
            return new h83[i];
        }
    }

    public h83() {
        throw null;
    }

    public h83(Parcel parcel) {
        this.v = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        String str = n6b.a;
        this.t = bVarArr;
        this.w = bVarArr.length;
    }

    public final h83 a(String str) {
        return Objects.equals(this.v, str) ? this : new h83(str, false, this.t);
    }

    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = i01.a;
        if (uuid.equals(bVar3.u)) {
            return uuid.equals(bVar4.u) ? 0 : 1;
        }
        return bVar3.u.compareTo(bVar4.u);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h83.class == obj.getClass()) {
            h83 h83Var = (h83) obj;
            if (Objects.equals(this.v, h83Var.v) && Arrays.equals(this.t, h83Var.t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.u == 0) {
            String str = this.v;
            this.u = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.t);
        }
        return this.u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.v);
        parcel.writeTypedArray(this.t, 0);
    }

    public h83(String str, boolean z, b... bVarArr) {
        this.v = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.t = bVarArr;
        this.w = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public int t;
        public final UUID u;
        public final String v;
        public final String w;
        public final byte[] x;

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

        public b(Parcel parcel) {
            this.u = new UUID(parcel.readLong(), parcel.readLong());
            this.v = parcel.readString();
            String string = parcel.readString();
            String str = n6b.a;
            this.w = string;
            this.x = parcel.createByteArray();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.v, bVar.v) && Objects.equals(this.w, bVar.w) && Objects.equals(this.u, bVar.u) && Arrays.equals(this.x, bVar.x);
        }

        public final int hashCode() {
            if (this.t == 0) {
                int iHashCode = this.u.hashCode() * 31;
                String str = this.v;
                this.t = Arrays.hashCode(this.x) + ru3.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.w);
            }
            return this.t;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.u;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.v);
            parcel.writeString(this.w);
            parcel.writeByteArray(this.x);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.u = uuid;
            this.v = str;
            str2.getClass();
            this.w = fv6.n(str2);
            this.x = bArr;
        }
    }
}
