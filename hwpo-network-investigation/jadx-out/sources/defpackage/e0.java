package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 implements Parcelable {
    public final Parcelable t;
    public static final a u = new a();
    public static final Parcelable.Creator<e0> CREATOR = new b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends e0 {
    }

    public e0(Parcelable parcelable) {
        if (parcelable != null) {
            this.t = parcelable == u ? null : parcelable;
        } else {
            z90.a("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.t, i);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class b implements Parcelable.ClassLoaderCreator<e0> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return e0.u;
            }
            aa0.c("superState must be null");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new e0[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final e0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return e0.u;
            }
            aa0.c("superState must be null");
            return null;
        }
    }

    public e0() {
        this.t = null;
    }

    public e0(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.t = parcelable == null ? u : parcelable;
    }
}
