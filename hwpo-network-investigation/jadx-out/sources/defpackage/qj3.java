package defpackage;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class qj3 extends fk0 implements Parcelable {
    public static final Parcelable.Creator<qj3> CREATOR = new a();
    public float v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements Parcelable.Creator<qj3> {
        @Override // android.os.Parcelable.Creator
        public final qj3 createFromParcel(Parcel parcel) {
            qj3 qj3Var = new qj3();
            qj3Var.v = 0.0f;
            qj3Var.v = parcel.readFloat();
            qj3Var.t = parcel.readFloat();
            if (parcel.readInt() == 1) {
                qj3Var.u = parcel.readParcelable(Object.class.getClassLoader());
            }
            return qj3Var;
        }

        @Override // android.os.Parcelable.Creator
        public final qj3[] newArray(int i) {
            return new qj3[i];
        }
    }

    public qj3(float f, float f2, jl3 jl3Var) {
        this.t = f2;
        this.u = jl3Var;
        this.v = f;
    }

    public float b() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.v + " y: " + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.v);
        parcel.writeFloat(a());
        Object obj = this.u;
        if (obj == null) {
            parcel.writeInt(0);
        } else {
            if (!(obj instanceof Parcelable)) {
                throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
            }
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) this.u, i);
        }
    }

    public qj3() {
        this.v = 0.0f;
    }
}
