package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qr3 extends e0 {
    public static final Parcelable.Creator<qr3> CREATOR = new a();
    public final ep9<String, Bundle> v;

    public qr3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.v = new ep9<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.v.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.v + "}";
    }

    @Override // defpackage.e0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ep9<String, Bundle> ep9Var = this.v;
        int i2 = ep9Var.v;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = ep9Var.f(i3);
            bundleArr[i3] = ep9Var.j(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Parcelable.ClassLoaderCreator<qr3> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new qr3(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new qr3[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final qr3 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new qr3(parcel, classLoader);
        }
    }

    public qr3(Parcelable parcelable) {
        super(parcelable);
        this.v = new ep9<>();
    }
}
